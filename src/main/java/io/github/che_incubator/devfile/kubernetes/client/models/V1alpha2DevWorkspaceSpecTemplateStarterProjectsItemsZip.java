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
 * Project&#39;s Zip source
 */
@ApiModel(description = "Project's Zip source")

public class V1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


  public V1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Zip project&#39;s source location address. Should be file path of the archive, e.g. file://$FILE_PATH
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zip project's source location address. Should be file path of the archive, e.g. file://$FILE_PATH")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip v1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip = (V1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip) o;
    return Objects.equals(this.location, v1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceSpecTemplateStarterProjectsItemsZip {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

