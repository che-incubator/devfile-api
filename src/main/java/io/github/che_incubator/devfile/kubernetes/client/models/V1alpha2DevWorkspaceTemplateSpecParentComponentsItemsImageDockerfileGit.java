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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGitCheckoutFrom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dockerfile&#39;s Git source
 */
@ApiModel(description = "Dockerfile's Git source")

public class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit {
  public static final String SERIALIZED_NAME_CHECKOUT_FROM = "checkoutFrom";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_FROM)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGitCheckoutFrom checkoutFrom;

  public static final String SERIALIZED_NAME_FILE_LOCATION = "fileLocation";
  @SerializedName(SERIALIZED_NAME_FILE_LOCATION)
  private String fileLocation;

  public static final String SERIALIZED_NAME_REMOTES = "remotes";
  @SerializedName(SERIALIZED_NAME_REMOTES)
  private Map<String, String> remotes = null;


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit checkoutFrom(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGitCheckoutFrom checkoutFrom) {
    
    this.checkoutFrom = checkoutFrom;
    return this;
  }

   /**
   * Get checkoutFrom
   * @return checkoutFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGitCheckoutFrom getCheckoutFrom() {
    return checkoutFrom;
  }


  public void setCheckoutFrom(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGitCheckoutFrom checkoutFrom) {
    this.checkoutFrom = checkoutFrom;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit fileLocation(String fileLocation) {
    
    this.fileLocation = fileLocation;
    return this;
  }

   /**
   * Location of the Dockerfile in the Git repository when using git as Dockerfile src. Defaults to Dockerfile.
   * @return fileLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location of the Dockerfile in the Git repository when using git as Dockerfile src. Defaults to Dockerfile.")

  public String getFileLocation() {
    return fileLocation;
  }


  public void setFileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit remotes(Map<String, String> remotes) {
    
    this.remotes = remotes;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit putRemotesItem(String key, String remotesItem) {
    if (this.remotes == null) {
      this.remotes = new HashMap<>();
    }
    this.remotes.put(key, remotesItem);
    return this;
  }

   /**
   * The remotes map which should be initialized in the git project. Projects must have at least one remote configured while StarterProjects &amp; Image Component&#39;s Git source can only have at most one remote configured.
   * @return remotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remotes map which should be initialized in the git project. Projects must have at least one remote configured while StarterProjects & Image Component's Git source can only have at most one remote configured.")

  public Map<String, String> getRemotes() {
    return remotes;
  }


  public void setRemotes(Map<String, String> remotes) {
    this.remotes = remotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit = (V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit) o;
    return Objects.equals(this.checkoutFrom, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit.checkoutFrom) &&
        Objects.equals(this.fileLocation, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit.fileLocation) &&
        Objects.equals(this.remotes, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit.remotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutFrom, fileLocation, remotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImageDockerfileGit {\n");
    sb.append("    checkoutFrom: ").append(toIndentedString(checkoutFrom)).append("\n");
    sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
    sb.append("    remotes: ").append(toIndentedString(remotes)).append("\n");
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

