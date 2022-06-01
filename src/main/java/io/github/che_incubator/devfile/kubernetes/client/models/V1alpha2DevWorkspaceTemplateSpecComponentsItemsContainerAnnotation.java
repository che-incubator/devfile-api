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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Annotations that should be added to specific resources for this container
 */
@ApiModel(description = "Annotations that should be added to specific resources for this container")

public class V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation {
  public static final String SERIALIZED_NAME_DEPLOYMENT = "deployment";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT)
  private Map<String, String> deployment = null;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private Map<String, String> service = null;


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation deployment(Map<String, String> deployment) {
    
    this.deployment = deployment;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation putDeploymentItem(String key, String deploymentItem) {
    if (this.deployment == null) {
      this.deployment = new HashMap<>();
    }
    this.deployment.put(key, deploymentItem);
    return this;
  }

   /**
   * Annotations to be added to deployment
   * @return deployment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations to be added to deployment")

  public Map<String, String> getDeployment() {
    return deployment;
  }


  public void setDeployment(Map<String, String> deployment) {
    this.deployment = deployment;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation service(Map<String, String> service) {
    
    this.service = service;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation putServiceItem(String key, String serviceItem) {
    if (this.service == null) {
      this.service = new HashMap<>();
    }
    this.service.put(key, serviceItem);
    return this;
  }

   /**
   * Annotations to be added to service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations to be added to service")

  public Map<String, String> getService() {
    return service;
  }


  public void setService(Map<String, String> service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation = (V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation) o;
    return Objects.equals(this.deployment, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation.deployment) &&
        Objects.equals(this.service, v1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecComponentsItemsContainerAnnotation {\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

