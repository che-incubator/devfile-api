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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha2DevWorkspaceTemplateSpecParentProjects
 */

public class V1alpha2DevWorkspaceTemplateSpecParentProjects {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_CLONE_PATH = "clonePath";
  @SerializedName(SERIALIZED_NAME_CLONE_PATH)
  private String clonePath;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit git;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip zip;


  public V1alpha2DevWorkspaceTemplateSpecParentProjects attributes(Object attributes) {
    
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


  public V1alpha2DevWorkspaceTemplateSpecParentProjects clonePath(String clonePath) {
    
    this.clonePath = clonePath;
    return this;
  }

   /**
   * Path relative to the root of the projects to which this project should be cloned into. This is a unix-style relative path (i.e. uses forward slashes). The path is invalid if it is absolute or tries to escape the project root through the usage of &#39;..&#39;. If not specified, defaults to the project name.
   * @return clonePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path relative to the root of the projects to which this project should be cloned into. This is a unix-style relative path (i.e. uses forward slashes). The path is invalid if it is absolute or tries to escape the project root through the usage of '..'. If not specified, defaults to the project name.")

  public String getClonePath() {
    return clonePath;
  }


  public void setClonePath(String clonePath) {
    this.clonePath = clonePath;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentProjects git(V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit getGit() {
    return git;
  }


  public void setGit(V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit git) {
    this.git = git;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentProjects name(String name) {
    
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


  public V1alpha2DevWorkspaceTemplateSpecParentProjects zip(V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip getZip() {
    return zip;
  }


  public void setZip(V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip zip) {
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
    V1alpha2DevWorkspaceTemplateSpecParentProjects v1alpha2DevWorkspaceTemplateSpecParentProjects = (V1alpha2DevWorkspaceTemplateSpecParentProjects) o;
    return Objects.equals(this.attributes, v1alpha2DevWorkspaceTemplateSpecParentProjects.attributes) &&
        Objects.equals(this.clonePath, v1alpha2DevWorkspaceTemplateSpecParentProjects.clonePath) &&
        Objects.equals(this.git, v1alpha2DevWorkspaceTemplateSpecParentProjects.git) &&
        Objects.equals(this.name, v1alpha2DevWorkspaceTemplateSpecParentProjects.name) &&
        Objects.equals(this.zip, v1alpha2DevWorkspaceTemplateSpecParentProjects.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, clonePath, git, name, zip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecParentProjects {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    clonePath: ").append(toIndentedString(clonePath)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

