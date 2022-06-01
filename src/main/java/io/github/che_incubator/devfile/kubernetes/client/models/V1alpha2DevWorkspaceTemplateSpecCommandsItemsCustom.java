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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustomGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Custom command whose logic is implementation-dependant and should be provided by the user possibly through some dedicated plugin
 */
@ApiModel(description = "Custom command whose logic is implementation-dependant and should be provided by the user possibly through some dedicated plugin")

public class V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom {
  public static final String SERIALIZED_NAME_COMMAND_CLASS = "commandClass";
  @SerializedName(SERIALIZED_NAME_COMMAND_CLASS)
  private String commandClass;

  public static final String SERIALIZED_NAME_EMBEDDED_RESOURCE = "embeddedResource";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_RESOURCE)
  private Object embeddedResource;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustomGroup group;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;


  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom commandClass(String commandClass) {
    
    this.commandClass = commandClass;
    return this;
  }

   /**
   * Class of command that the associated implementation component should use to process this command with the appropriate logic
   * @return commandClass
  **/
  @ApiModelProperty(required = true, value = "Class of command that the associated implementation component should use to process this command with the appropriate logic")

  public String getCommandClass() {
    return commandClass;
  }


  public void setCommandClass(String commandClass) {
    this.commandClass = commandClass;
  }


  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom embeddedResource(Object embeddedResource) {
    
    this.embeddedResource = embeddedResource;
    return this;
  }

   /**
   * Additional free-form configuration for this custom command that the implementation component will know how to use
   * @return embeddedResource
  **/
  @ApiModelProperty(required = true, value = "Additional free-form configuration for this custom command that the implementation component will know how to use")

  public Object getEmbeddedResource() {
    return embeddedResource;
  }


  public void setEmbeddedResource(Object embeddedResource) {
    this.embeddedResource = embeddedResource;
  }


  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom group(V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustomGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustomGroup getGroup() {
    return group;
  }


  public void setGroup(V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustomGroup group) {
    this.group = group;
  }


  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Optional label that provides a label for this command to be used in Editor UI menus for example
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional label that provides a label for this command to be used in Editor UI menus for example")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom v1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom = (V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom) o;
    return Objects.equals(this.commandClass, v1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom.commandClass) &&
        Objects.equals(this.embeddedResource, v1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom.embeddedResource) &&
        Objects.equals(this.group, v1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom.group) &&
        Objects.equals(this.label, v1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandClass, embeddedResource, group, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecCommandsItemsCustom {\n");
    sb.append("    commandClass: ").append(toIndentedString(commandClass)).append("\n");
    sb.append("    embeddedResource: ").append(toIndentedString(embeddedResource)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

