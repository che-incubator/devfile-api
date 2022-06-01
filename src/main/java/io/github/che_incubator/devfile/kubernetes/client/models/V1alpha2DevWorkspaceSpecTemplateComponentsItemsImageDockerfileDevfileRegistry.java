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
 * Dockerfile&#39;s Devfile Registry source
 */
@ApiModel(description = "Dockerfile's Devfile Registry source")

public class V1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REGISTRY_URL = "registryUrl";
  @SerializedName(SERIALIZED_NAME_REGISTRY_URL)
  private String registryUrl;


  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id in a devfile registry that contains a Dockerfile. The src in the OCI registry required for the Dockerfile build will be downloaded for building the image.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id in a devfile registry that contains a Dockerfile. The src in the OCI registry required for the Dockerfile build will be downloaded for building the image.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry registryUrl(String registryUrl) {
    
    this.registryUrl = registryUrl;
    return this;
  }

   /**
   * Devfile Registry URL to pull the Dockerfile from when using the Devfile Registry as Dockerfile src. To ensure the Dockerfile gets resolved consistently in different environments, it is recommended to always specify the &#x60;devfileRegistryUrl&#x60; when &#x60;Id&#x60; is used.
   * @return registryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Devfile Registry URL to pull the Dockerfile from when using the Devfile Registry as Dockerfile src. To ensure the Dockerfile gets resolved consistently in different environments, it is recommended to always specify the `devfileRegistryUrl` when `Id` is used.")

  public String getRegistryUrl() {
    return registryUrl;
  }


  public void setRegistryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry v1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry = (V1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry) o;
    return Objects.equals(this.id, v1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry.id) &&
        Objects.equals(this.registryUrl, v1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry.registryUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, registryUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceSpecTemplateComponentsItemsImageDockerfileDevfileRegistry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
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

