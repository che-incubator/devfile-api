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
 * Volume that should be mounted to a component container
 */
@ApiModel(description = "Volume that should be mounted to a component container")

public class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The volume mount name is the name of an existing &#x60;Volume&#x60; component. If several containers mount the same volume name then they will reuse the same volume and will be able to access to the same files.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The volume mount name is the name of an existing `Volume` component. If several containers mount the same volume name then they will reuse the same volume and will be able to access to the same files.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path in the component container where the volume should be mounted. If not path is mentioned, default path is the is &#x60;/&lt;name&gt;&#x60;.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path in the component container where the volume should be mounted. If not path is mentioned, default path is the is `/<name>`.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts = (V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts) o;
    return Objects.equals(this.name, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts.name) &&
        Objects.equals(this.path, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainerVolumeMounts {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

