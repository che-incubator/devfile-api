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
 * Project&#39;s Custom source
 */
@ApiModel(description = "Project's Custom source")

public class V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom {
  public static final String SERIALIZED_NAME_EMBEDDED_RESOURCE = "embeddedResource";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_RESOURCE)
  private Object embeddedResource;

  public static final String SERIALIZED_NAME_PROJECT_SOURCE_CLASS = "projectSourceClass";
  @SerializedName(SERIALIZED_NAME_PROJECT_SOURCE_CLASS)
  private String projectSourceClass;


  public V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom embeddedResource(Object embeddedResource) {
    
    this.embeddedResource = embeddedResource;
    return this;
  }

   /**
   * Get embeddedResource
   * @return embeddedResource
  **/
  @ApiModelProperty(required = true, value = "")

  public Object getEmbeddedResource() {
    return embeddedResource;
  }


  public void setEmbeddedResource(Object embeddedResource) {
    this.embeddedResource = embeddedResource;
  }


  public V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom projectSourceClass(String projectSourceClass) {
    
    this.projectSourceClass = projectSourceClass;
    return this;
  }

   /**
   * Get projectSourceClass
   * @return projectSourceClass
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProjectSourceClass() {
    return projectSourceClass;
  }


  public void setProjectSourceClass(String projectSourceClass) {
    this.projectSourceClass = projectSourceClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom v1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom = (V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom) o;
    return Objects.equals(this.embeddedResource, v1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom.embeddedResource) &&
        Objects.equals(this.projectSourceClass, v1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom.projectSourceClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedResource, projectSourceClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom {\n");
    sb.append("    embeddedResource: ").append(toIndentedString(embeddedResource)).append("\n");
    sb.append("    projectSourceClass: ").append(toIndentedString(projectSourceClass)).append("\n");
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

