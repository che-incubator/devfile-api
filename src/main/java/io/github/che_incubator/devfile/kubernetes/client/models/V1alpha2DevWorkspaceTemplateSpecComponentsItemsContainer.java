/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.che_incubator.devfile.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEndpoints;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEnv;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerVolumeMounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Allows adding and configuring devworkspace-related containers
 */
@ApiModel(description = "Allows adding and configuring devworkspace-related containers")

public class V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer {
  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation annotation;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = null;

  public static final String SERIALIZED_NAME_CPU_LIMIT = "cpuLimit";
  @SerializedName(SERIALIZED_NAME_CPU_LIMIT)
  private String cpuLimit;

  public static final String SERIALIZED_NAME_CPU_REQUEST = "cpuRequest";
  @SerializedName(SERIALIZED_NAME_CPU_REQUEST)
  private String cpuRequest;

  public static final String SERIALIZED_NAME_DEDICATED_POD = "dedicatedPod";
  @SerializedName(SERIALIZED_NAME_DEDICATED_POD)
  private Boolean dedicatedPod;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEndpoints> endpoints = null;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEnv> env = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_MEMORY_LIMIT = "memoryLimit";
  @SerializedName(SERIALIZED_NAME_MEMORY_LIMIT)
  private String memoryLimit;

  public static final String SERIALIZED_NAME_MEMORY_REQUEST = "memoryRequest";
  @SerializedName(SERIALIZED_NAME_MEMORY_REQUEST)
  private String memoryRequest;

  public static final String SERIALIZED_NAME_MOUNT_SOURCES = "mountSources";
  @SerializedName(SERIALIZED_NAME_MOUNT_SOURCES)
  private Boolean mountSources;

  public static final String SERIALIZED_NAME_SOURCE_MAPPING = "sourceMapping";
  @SerializedName(SERIALIZED_NAME_SOURCE_MAPPING)
  private String sourceMapping = "/projects";

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerVolumeMounts> volumeMounts = null;


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer annotation(V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation annotation) {
    
    this.annotation = annotation;
    return this;
  }

   /**
   * Get annotation
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation getAnnotation() {
    return annotation;
  }


  public void setAnnotation(V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation annotation) {
    this.annotation = annotation;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * The arguments to supply to the command running the dockerimage component. The arguments are supplied either to the default command provided in the image or to the overridden command.  Defaults to an empty array, meaning use whatever is defined in the image.
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The arguments to supply to the command running the dockerimage component. The arguments are supplied either to the default command provided in the image or to the overridden command.  Defaults to an empty array, meaning use whatever is defined in the image.")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * The command to run in the dockerimage component instead of the default one provided in the image.  Defaults to an empty array, meaning use whatever is defined in the image.
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The command to run in the dockerimage component instead of the default one provided in the image.  Defaults to an empty array, meaning use whatever is defined in the image.")

  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer cpuLimit(String cpuLimit) {
    
    this.cpuLimit = cpuLimit;
    return this;
  }

   /**
   * Get cpuLimit
   * @return cpuLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuLimit() {
    return cpuLimit;
  }


  public void setCpuLimit(String cpuLimit) {
    this.cpuLimit = cpuLimit;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer cpuRequest(String cpuRequest) {
    
    this.cpuRequest = cpuRequest;
    return this;
  }

   /**
   * Get cpuRequest
   * @return cpuRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuRequest() {
    return cpuRequest;
  }


  public void setCpuRequest(String cpuRequest) {
    this.cpuRequest = cpuRequest;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer dedicatedPod(Boolean dedicatedPod) {
    
    this.dedicatedPod = dedicatedPod;
    return this;
  }

   /**
   * Specify if a container should run in its own separated pod, instead of running as part of the main development environment pod.  Default value is &#x60;false&#x60;
   * @return dedicatedPod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify if a container should run in its own separated pod, instead of running as part of the main development environment pod.  Default value is `false`")

  public Boolean getDedicatedPod() {
    return dedicatedPod;
  }


  public void setDedicatedPod(Boolean dedicatedPod) {
    this.dedicatedPod = dedicatedPod;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer endpoints(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEndpoints> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer addEndpointsItem(V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEndpoints endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEndpoints> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEndpoints> endpoints) {
    this.endpoints = endpoints;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer env(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer addEnvItem(V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Environment variables used in this container.  The following variables are reserved and cannot be overridden via env:   - &#x60;$PROJECTS_ROOT&#x60;   - &#x60;$PROJECT_SOURCE&#x60;
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment variables used in this container.  The following variables are reserved and cannot be overridden via env:   - `$PROJECTS_ROOT`   - `$PROJECT_SOURCE`")

  public List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerEnv> env) {
    this.env = env;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(required = true, value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer memoryLimit(String memoryLimit) {
    
    this.memoryLimit = memoryLimit;
    return this;
  }

   /**
   * Get memoryLimit
   * @return memoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemoryLimit() {
    return memoryLimit;
  }


  public void setMemoryLimit(String memoryLimit) {
    this.memoryLimit = memoryLimit;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer memoryRequest(String memoryRequest) {
    
    this.memoryRequest = memoryRequest;
    return this;
  }

   /**
   * Get memoryRequest
   * @return memoryRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemoryRequest() {
    return memoryRequest;
  }


  public void setMemoryRequest(String memoryRequest) {
    this.memoryRequest = memoryRequest;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer mountSources(Boolean mountSources) {
    
    this.mountSources = mountSources;
    return this;
  }

   /**
   * Toggles whether or not the project source code should be mounted in the component.  Defaults to true for all component types except plugins and components that set &#x60;dedicatedPod&#x60; to true.
   * @return mountSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggles whether or not the project source code should be mounted in the component.  Defaults to true for all component types except plugins and components that set `dedicatedPod` to true.")

  public Boolean getMountSources() {
    return mountSources;
  }


  public void setMountSources(Boolean mountSources) {
    this.mountSources = mountSources;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer sourceMapping(String sourceMapping) {
    
    this.sourceMapping = sourceMapping;
    return this;
  }

   /**
   * Optional specification of the path in the container where project sources should be transferred/mounted when &#x60;mountSources&#x60; is &#x60;true&#x60;. When omitted, the default value of /projects is used.
   * @return sourceMapping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional specification of the path in the container where project sources should be transferred/mounted when `mountSources` is `true`. When omitted, the default value of /projects is used.")

  public String getSourceMapping() {
    return sourceMapping;
  }


  public void setSourceMapping(String sourceMapping) {
    this.sourceMapping = sourceMapping;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer volumeMounts(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerVolumeMounts> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer addVolumeMountsItem(V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * List of volumes mounts that should be mounted is this container.
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of volumes mounts that should be mounted is this container.")

  public List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer = (V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer) o;
    return Objects.equals(this.annotation, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.annotation) &&
        Objects.equals(this.args, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.args) &&
        Objects.equals(this.command, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.command) &&
        Objects.equals(this.cpuLimit, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.cpuLimit) &&
        Objects.equals(this.cpuRequest, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.cpuRequest) &&
        Objects.equals(this.dedicatedPod, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.dedicatedPod) &&
        Objects.equals(this.endpoints, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.endpoints) &&
        Objects.equals(this.env, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.env) &&
        Objects.equals(this.image, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.image) &&
        Objects.equals(this.memoryLimit, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.memoryLimit) &&
        Objects.equals(this.memoryRequest, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.memoryRequest) &&
        Objects.equals(this.mountSources, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.mountSources) &&
        Objects.equals(this.sourceMapping, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.sourceMapping) &&
        Objects.equals(this.volumeMounts, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, args, command, cpuLimit, cpuRequest, dedicatedPod, endpoints, env, image, memoryLimit, memoryRequest, mountSources, sourceMapping, volumeMounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainer {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
    sb.append("    cpuRequest: ").append(toIndentedString(cpuRequest)).append("\n");
    sb.append("    dedicatedPod: ").append(toIndentedString(dedicatedPod)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
    sb.append("    memoryRequest: ").append(toIndentedString(memoryRequest)).append("\n");
    sb.append("    mountSources: ").append(toIndentedString(mountSources)).append("\n");
    sb.append("    sourceMapping: ").append(toIndentedString(sourceMapping)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

