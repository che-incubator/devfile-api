#!/usr/bin/env bash

#
# Copyright (c) 2021 Red Hat, Inc.
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#

set -e

GEN_REVISION=a3aef4de7a1d5dab72021aa282fffd8bc8a022ca

base_dir=$(
  cd "$(dirname "$0")" || exit
  pwd
)

work_dir=${base_dir}/workdir
echo "[INFO] Using the following folder to store all build files ${base_dir}/workdir"
mkdir -p "$work_dir"
mkdir -p "$work_dir"/schemas/latest

pushd "$work_dir"/schemas/latest
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/schemas/latest/k8sApiVersion.txt
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/schemas/latest/jsonSchemaVersion.txt
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/schemas/latest/devfile.json
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/schemas/latest/dev-workspace.json
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/schemas/latest/dev-workspace-template.json
popd

pushd "$work_dir"
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/build/typescript-model/generate-swagger-json.py
  curl -sSLO https://raw.githubusercontent.com/devfile/api/main/build/typescript-model/requirements.txt
  echo "[INFO] Generating Swagger JSON..."
  python3 generate-swagger-json.py
  rm -rf "$work_dir"/java-models
  mkdir -p "$work_dir"/java-models
  mv swagger.json "$work_dir"/java-models/swagger.json.unprocessed
  echo "[INFO] Generating Swagger JSON. It's in $work_dir/typescript-models/swagger.json.unprocessed"
popd

[ ! -d "$work_dir"/gen ] && git clone https://github.com/kubernetes-client/gen.git "$work_dir"/gen || echo "kubernetes-client/gen is already cloned into $work_dir/gen"
echo "[INFO] Checking out gen to ${GEN_REVISION}"
pushd "$work_dir"/gen
  git checkout ${GEN_REVISION}
popd

echo "[INFO] preparing config files for gen"
# Remove the contents of custom objects spec so that we aren't bundling any extra objects
echo "{}" > "$work_dir"/gen/openapi/custom_objects_spec.json
cat java.xml > "$work_dir"/gen/openapi/java.xml
cat <<EOF > "$work_dir"/config.sh
export KUBERNETES_BRANCH=''
export CLIENT_VERSION='5.0-SNAPSHOT'
export PACKAGE_NAME='io.github.che-incubator.devfile.kubernetes.client'
export HIDE_GENERATION_TIMESTAMP=true
EOF

export OPENAPI_SKIP_FETCH_SPEC=true

"$work_dir"/gen/openapi/java.sh "$work_dir"/java-models "$work_dir"/config.sh
