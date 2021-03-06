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
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileComponentsItemsContainer;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileComponentsItemsImage;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileComponentsItemsKubernetes;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileComponentsItemsOpenshift;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileComponentsItemsVolume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V220DevfileComponents
 */

public class V220DevfileComponents {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private V220DevfileComponentsItemsContainer container;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private V220DevfileComponentsItemsImage image;

  public static final String SERIALIZED_NAME_KUBERNETES = "kubernetes";
  @SerializedName(SERIALIZED_NAME_KUBERNETES)
  private V220DevfileComponentsItemsKubernetes kubernetes;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPENSHIFT = "openshift";
  @SerializedName(SERIALIZED_NAME_OPENSHIFT)
  private V220DevfileComponentsItemsOpenshift openshift;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private V220DevfileComponentsItemsVolume volume;


  public V220DevfileComponents attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Map of implementation-dependant free-form YAML attributes.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Map of implementation-dependant free-form YAML attributes.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public V220DevfileComponents container(V220DevfileComponentsItemsContainer container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileComponentsItemsContainer getContainer() {
    return container;
  }


  public void setContainer(V220DevfileComponentsItemsContainer container) {
    this.container = container;
  }


  public V220DevfileComponents image(V220DevfileComponentsItemsImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileComponentsItemsImage getImage() {
    return image;
  }


  public void setImage(V220DevfileComponentsItemsImage image) {
    this.image = image;
  }


  public V220DevfileComponents kubernetes(V220DevfileComponentsItemsKubernetes kubernetes) {
    
    this.kubernetes = kubernetes;
    return this;
  }

   /**
   * Get kubernetes
   * @return kubernetes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileComponentsItemsKubernetes getKubernetes() {
    return kubernetes;
  }


  public void setKubernetes(V220DevfileComponentsItemsKubernetes kubernetes) {
    this.kubernetes = kubernetes;
  }


  public V220DevfileComponents name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Mandatory name that allows referencing the component from other elements (such as commands) or from an external devfile that may reference this component through a parent or a plugin.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Mandatory name that allows referencing the component from other elements (such as commands) or from an external devfile that may reference this component through a parent or a plugin.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V220DevfileComponents openshift(V220DevfileComponentsItemsOpenshift openshift) {
    
    this.openshift = openshift;
    return this;
  }

   /**
   * Get openshift
   * @return openshift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileComponentsItemsOpenshift getOpenshift() {
    return openshift;
  }


  public void setOpenshift(V220DevfileComponentsItemsOpenshift openshift) {
    this.openshift = openshift;
  }


  public V220DevfileComponents volume(V220DevfileComponentsItemsVolume volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileComponentsItemsVolume getVolume() {
    return volume;
  }


  public void setVolume(V220DevfileComponentsItemsVolume volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V220DevfileComponents v220DevfileComponents = (V220DevfileComponents) o;
    return Objects.equals(this.attributes, v220DevfileComponents.attributes) &&
        Objects.equals(this.container, v220DevfileComponents.container) &&
        Objects.equals(this.image, v220DevfileComponents.image) &&
        Objects.equals(this.kubernetes, v220DevfileComponents.kubernetes) &&
        Objects.equals(this.name, v220DevfileComponents.name) &&
        Objects.equals(this.openshift, v220DevfileComponents.openshift) &&
        Objects.equals(this.volume, v220DevfileComponents.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, container, image, kubernetes, name, openshift, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220DevfileComponents {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openshift: ").append(toIndentedString(openshift)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

