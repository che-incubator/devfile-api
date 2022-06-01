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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainer;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImage;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetes;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsOpenshift;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPlugin;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsVolume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha2DevWorkspaceTemplateSpecParentComponents
 */

public class V1alpha2DevWorkspaceTemplateSpecParentComponents {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainer container;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImage image;

  public static final String SERIALIZED_NAME_KUBERNETES = "kubernetes";
  @SerializedName(SERIALIZED_NAME_KUBERNETES)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetes kubernetes;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPENSHIFT = "openshift";
  @SerializedName(SERIALIZED_NAME_OPENSHIFT)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsOpenshift openshift;

  public static final String SERIALIZED_NAME_PLUGIN = "plugin";
  @SerializedName(SERIALIZED_NAME_PLUGIN)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPlugin plugin;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsVolume volume;


  public V1alpha2DevWorkspaceTemplateSpecParentComponents attributes(Object attributes) {
    
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


  public V1alpha2DevWorkspaceTemplateSpecParentComponents container(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainer container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainer getContainer() {
    return container;
  }


  public void setContainer(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsContainer container) {
    this.container = container;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponents image(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImage getImage() {
    return image;
  }


  public void setImage(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsImage image) {
    this.image = image;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponents kubernetes(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetes kubernetes) {
    
    this.kubernetes = kubernetes;
    return this;
  }

   /**
   * Get kubernetes
   * @return kubernetes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetes getKubernetes() {
    return kubernetes;
  }


  public void setKubernetes(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetes kubernetes) {
    this.kubernetes = kubernetes;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponents name(String name) {
    
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


  public V1alpha2DevWorkspaceTemplateSpecParentComponents openshift(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsOpenshift openshift) {
    
    this.openshift = openshift;
    return this;
  }

   /**
   * Get openshift
   * @return openshift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsOpenshift getOpenshift() {
    return openshift;
  }


  public void setOpenshift(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsOpenshift openshift) {
    this.openshift = openshift;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponents plugin(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPlugin plugin) {
    
    this.plugin = plugin;
    return this;
  }

   /**
   * Get plugin
   * @return plugin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPlugin getPlugin() {
    return plugin;
  }


  public void setPlugin(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPlugin plugin) {
    this.plugin = plugin;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponents volume(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsVolume volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsVolume getVolume() {
    return volume;
  }


  public void setVolume(V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsVolume volume) {
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
    V1alpha2DevWorkspaceTemplateSpecParentComponents v1alpha2DevWorkspaceTemplateSpecParentComponents = (V1alpha2DevWorkspaceTemplateSpecParentComponents) o;
    return Objects.equals(this.attributes, v1alpha2DevWorkspaceTemplateSpecParentComponents.attributes) &&
        Objects.equals(this.container, v1alpha2DevWorkspaceTemplateSpecParentComponents.container) &&
        Objects.equals(this.image, v1alpha2DevWorkspaceTemplateSpecParentComponents.image) &&
        Objects.equals(this.kubernetes, v1alpha2DevWorkspaceTemplateSpecParentComponents.kubernetes) &&
        Objects.equals(this.name, v1alpha2DevWorkspaceTemplateSpecParentComponents.name) &&
        Objects.equals(this.openshift, v1alpha2DevWorkspaceTemplateSpecParentComponents.openshift) &&
        Objects.equals(this.plugin, v1alpha2DevWorkspaceTemplateSpecParentComponents.plugin) &&
        Objects.equals(this.volume, v1alpha2DevWorkspaceTemplateSpecParentComponents.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, container, image, kubernetes, name, openshift, plugin, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecParentComponents {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openshift: ").append(toIndentedString(openshift)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
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

