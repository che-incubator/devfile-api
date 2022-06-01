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
 * Allows specifying the definition of a volume shared by several other components
 */
@ApiModel(description = "Allows specifying the definition of a volume shared by several other components")

public class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume {
  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private Boolean ephemeral;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume ephemeral(Boolean ephemeral) {
    
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Ephemeral volumes are not stored persistently across restarts. Defaults to false
   * @return ephemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ephemeral volumes are not stored persistently across restarts. Defaults to false")

  public Boolean getEphemeral() {
    return ephemeral;
  }


  public void setEphemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the volume
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the volume")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume = (V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume) o;
    return Objects.equals(this.ephemeral, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume.ephemeral) &&
        Objects.equals(this.size, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ephemeral, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponentsItemsVolume {\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

