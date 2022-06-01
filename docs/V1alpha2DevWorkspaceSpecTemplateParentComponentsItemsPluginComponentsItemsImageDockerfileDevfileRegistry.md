

# V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginComponentsItemsImageDockerfileDevfileRegistry

Dockerfile's Devfile Registry source
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id in a devfile registry that contains a Dockerfile. The src in the OCI registry required for the Dockerfile build will be downloaded for building the image. |  [optional]
**registryUrl** | **String** | Devfile Registry URL to pull the Dockerfile from when using the Devfile Registry as Dockerfile src. To ensure the Dockerfile gets resolved consistently in different environments, it is recommended to always specify the &#x60;devfileRegistryUrl&#x60; when &#x60;Id&#x60; is used. |  [optional]



