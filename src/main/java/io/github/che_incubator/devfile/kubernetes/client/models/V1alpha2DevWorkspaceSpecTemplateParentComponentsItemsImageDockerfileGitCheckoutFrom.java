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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines from what the project should be checked out. Required if there are more than one remote configured
 */
@ApiModel(description = "Defines from what the project should be checked out. Required if there are more than one remote configured")

public class V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom {
  public static final String SERIALIZED_NAME_REMOTE = "remote";
  @SerializedName(SERIALIZED_NAME_REMOTE)
  private String remote;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;


  public V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom remote(String remote) {
    
    this.remote = remote;
    return this;
  }

   /**
   * The remote name should be used as init. Required if there are more than one remote configured
   * @return remote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remote name should be used as init. Required if there are more than one remote configured")

  public String getRemote() {
    return remote;
  }


  public void setRemote(String remote) {
    this.remote = remote;
  }


  public V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom revision(String revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * The revision to checkout from. Should be branch name, tag or commit id. Default branch is used if missing or specified revision is not found.
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The revision to checkout from. Should be branch name, tag or commit id. Default branch is used if missing or specified revision is not found.")

  public String getRevision() {
    return revision;
  }


  public void setRevision(String revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom v1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom = (V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom) o;
    return Objects.equals(this.remote, v1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom.remote) &&
        Objects.equals(this.revision, v1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remote, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGitCheckoutFrom {\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

