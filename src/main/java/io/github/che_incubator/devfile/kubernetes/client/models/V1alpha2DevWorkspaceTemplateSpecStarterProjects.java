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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsGit;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsZip;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha2DevWorkspaceTemplateSpecStarterProjects
 */

public class V1alpha2DevWorkspaceTemplateSpecStarterProjects {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom custom;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsGit git;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUB_DIR = "subDir";
  @SerializedName(SERIALIZED_NAME_SUB_DIR)
  private String subDir;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsZip zip;


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects attributes(Object attributes) {
    
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


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects custom(V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom getCustom() {
    return custom;
  }


  public void setCustom(V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsCustom custom) {
    this.custom = custom;
  }


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of a starter project
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of a starter project")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects git(V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsGit git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsGit getGit() {
    return git;
  }


  public void setGit(V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsGit git) {
    this.git = git;
  }


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Project name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Project name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects subDir(String subDir) {
    
    this.subDir = subDir;
    return this;
  }

   /**
   * Sub-directory from a starter project to be used as root for starter project.
   * @return subDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sub-directory from a starter project to be used as root for starter project.")

  public String getSubDir() {
    return subDir;
  }


  public void setSubDir(String subDir) {
    this.subDir = subDir;
  }


  public V1alpha2DevWorkspaceTemplateSpecStarterProjects zip(V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsZip zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsZip getZip() {
    return zip;
  }


  public void setZip(V1alpha2DevWorkspaceTemplateSpecStarterProjectsItemsZip zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecStarterProjects v1alpha2DevWorkspaceTemplateSpecStarterProjects = (V1alpha2DevWorkspaceTemplateSpecStarterProjects) o;
    return Objects.equals(this.attributes, v1alpha2DevWorkspaceTemplateSpecStarterProjects.attributes) &&
        Objects.equals(this.custom, v1alpha2DevWorkspaceTemplateSpecStarterProjects.custom) &&
        Objects.equals(this.description, v1alpha2DevWorkspaceTemplateSpecStarterProjects.description) &&
        Objects.equals(this.git, v1alpha2DevWorkspaceTemplateSpecStarterProjects.git) &&
        Objects.equals(this.name, v1alpha2DevWorkspaceTemplateSpecStarterProjects.name) &&
        Objects.equals(this.subDir, v1alpha2DevWorkspaceTemplateSpecStarterProjects.subDir) &&
        Objects.equals(this.zip, v1alpha2DevWorkspaceTemplateSpecStarterProjects.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, custom, description, git, name, subDir, zip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecStarterProjects {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subDir: ").append(toIndentedString(subDir)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
