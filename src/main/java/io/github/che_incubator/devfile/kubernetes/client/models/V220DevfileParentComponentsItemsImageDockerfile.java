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
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentComponentsItemsImageDockerfileDevfileRegistry;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentComponentsItemsImageDockerfileGit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Allows specifying dockerfile type build
 */
@ApiModel(description = "Allows specifying dockerfile type build")

public class V220DevfileParentComponentsItemsImageDockerfile {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_BUILD_CONTEXT = "buildContext";
  @SerializedName(SERIALIZED_NAME_BUILD_CONTEXT)
  private String buildContext;

  public static final String SERIALIZED_NAME_DEVFILE_REGISTRY = "devfileRegistry";
  @SerializedName(SERIALIZED_NAME_DEVFILE_REGISTRY)
  private V220DevfileParentComponentsItemsImageDockerfileDevfileRegistry devfileRegistry;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private V220DevfileParentComponentsItemsImageDockerfileGit git;

  public static final String SERIALIZED_NAME_ROOT_REQUIRED = "rootRequired";
  @SerializedName(SERIALIZED_NAME_ROOT_REQUIRED)
  private Boolean rootRequired;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;


  public V220DevfileParentComponentsItemsImageDockerfile args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public V220DevfileParentComponentsItemsImageDockerfile addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * The arguments to supply to the dockerfile build.
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The arguments to supply to the dockerfile build.")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public V220DevfileParentComponentsItemsImageDockerfile buildContext(String buildContext) {
    
    this.buildContext = buildContext;
    return this;
  }

   /**
   * Path of source directory to establish build context. Defaults to ${PROJECT_SOURCE} in the container
   * @return buildContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path of source directory to establish build context. Defaults to ${PROJECT_SOURCE} in the container")

  public String getBuildContext() {
    return buildContext;
  }


  public void setBuildContext(String buildContext) {
    this.buildContext = buildContext;
  }


  public V220DevfileParentComponentsItemsImageDockerfile devfileRegistry(V220DevfileParentComponentsItemsImageDockerfileDevfileRegistry devfileRegistry) {
    
    this.devfileRegistry = devfileRegistry;
    return this;
  }

   /**
   * Get devfileRegistry
   * @return devfileRegistry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileParentComponentsItemsImageDockerfileDevfileRegistry getDevfileRegistry() {
    return devfileRegistry;
  }


  public void setDevfileRegistry(V220DevfileParentComponentsItemsImageDockerfileDevfileRegistry devfileRegistry) {
    this.devfileRegistry = devfileRegistry;
  }


  public V220DevfileParentComponentsItemsImageDockerfile git(V220DevfileParentComponentsItemsImageDockerfileGit git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileParentComponentsItemsImageDockerfileGit getGit() {
    return git;
  }


  public void setGit(V220DevfileParentComponentsItemsImageDockerfileGit git) {
    this.git = git;
  }


  public V220DevfileParentComponentsItemsImageDockerfile rootRequired(Boolean rootRequired) {
    
    this.rootRequired = rootRequired;
    return this;
  }

   /**
   * Specify if a privileged builder pod is required.  Default value is &#x60;false&#x60;
   * @return rootRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify if a privileged builder pod is required.  Default value is `false`")

  public Boolean getRootRequired() {
    return rootRequired;
  }


  public void setRootRequired(Boolean rootRequired) {
    this.rootRequired = rootRequired;
  }


  public V220DevfileParentComponentsItemsImageDockerfile uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI Reference of a Dockerfile. It can be a full URL or a relative URI from the current devfile as the base URI.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI Reference of a Dockerfile. It can be a full URL or a relative URI from the current devfile as the base URI.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V220DevfileParentComponentsItemsImageDockerfile v220DevfileParentComponentsItemsImageDockerfile = (V220DevfileParentComponentsItemsImageDockerfile) o;
    return Objects.equals(this.args, v220DevfileParentComponentsItemsImageDockerfile.args) &&
        Objects.equals(this.buildContext, v220DevfileParentComponentsItemsImageDockerfile.buildContext) &&
        Objects.equals(this.devfileRegistry, v220DevfileParentComponentsItemsImageDockerfile.devfileRegistry) &&
        Objects.equals(this.git, v220DevfileParentComponentsItemsImageDockerfile.git) &&
        Objects.equals(this.rootRequired, v220DevfileParentComponentsItemsImageDockerfile.rootRequired) &&
        Objects.equals(this.uri, v220DevfileParentComponentsItemsImageDockerfile.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, buildContext, devfileRegistry, git, rootRequired, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220DevfileParentComponentsItemsImageDockerfile {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    buildContext: ").append(toIndentedString(buildContext)).append("\n");
    sb.append("    devfileRegistry: ").append(toIndentedString(devfileRegistry)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    rootRequired: ").append(toIndentedString(rootRequired)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

