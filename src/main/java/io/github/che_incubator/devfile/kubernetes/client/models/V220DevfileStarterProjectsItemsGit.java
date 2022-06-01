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
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileStarterProjectsItemsGitCheckoutFrom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project&#39;s Git source
 */
@ApiModel(description = "Project's Git source")

public class V220DevfileStarterProjectsItemsGit {
  public static final String SERIALIZED_NAME_CHECKOUT_FROM = "checkoutFrom";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_FROM)
  private V220DevfileStarterProjectsItemsGitCheckoutFrom checkoutFrom;

  public static final String SERIALIZED_NAME_REMOTES = "remotes";
  @SerializedName(SERIALIZED_NAME_REMOTES)
  private Map<String, String> remotes = new HashMap<>();


  public V220DevfileStarterProjectsItemsGit checkoutFrom(V220DevfileStarterProjectsItemsGitCheckoutFrom checkoutFrom) {
    
    this.checkoutFrom = checkoutFrom;
    return this;
  }

   /**
   * Get checkoutFrom
   * @return checkoutFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileStarterProjectsItemsGitCheckoutFrom getCheckoutFrom() {
    return checkoutFrom;
  }


  public void setCheckoutFrom(V220DevfileStarterProjectsItemsGitCheckoutFrom checkoutFrom) {
    this.checkoutFrom = checkoutFrom;
  }


  public V220DevfileStarterProjectsItemsGit remotes(Map<String, String> remotes) {
    
    this.remotes = remotes;
    return this;
  }

  public V220DevfileStarterProjectsItemsGit putRemotesItem(String key, String remotesItem) {
    this.remotes.put(key, remotesItem);
    return this;
  }

   /**
   * The remotes map which should be initialized in the git project. Projects must have at least one remote configured while StarterProjects &amp; Image Component&#39;s Git source can only have at most one remote configured.
   * @return remotes
  **/
  @ApiModelProperty(required = true, value = "The remotes map which should be initialized in the git project. Projects must have at least one remote configured while StarterProjects & Image Component's Git source can only have at most one remote configured.")

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
    V220DevfileStarterProjectsItemsGit v220DevfileStarterProjectsItemsGit = (V220DevfileStarterProjectsItemsGit) o;
    return Objects.equals(this.checkoutFrom, v220DevfileStarterProjectsItemsGit.checkoutFrom) &&
        Objects.equals(this.remotes, v220DevfileStarterProjectsItemsGit.remotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutFrom, remotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220DevfileStarterProjectsItemsGit {\n");
    sb.append("    checkoutFrom: ").append(toIndentedString(checkoutFrom)).append("\n");
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
