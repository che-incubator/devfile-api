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
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentCommands;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentComponents;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentKubernetes;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentProjects;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParentStarterProjects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parent devworkspace template
 */
@ApiModel(description = "Parent devworkspace template")

public class V220DevfileParent {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_COMMANDS = "commands";
  @SerializedName(SERIALIZED_NAME_COMMANDS)
  private List<V220DevfileParentCommands> commands = null;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<V220DevfileParentComponents> components = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KUBERNETES = "kubernetes";
  @SerializedName(SERIALIZED_NAME_KUBERNETES)
  private V220DevfileParentKubernetes kubernetes;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<V220DevfileParentProjects> projects = null;

  public static final String SERIALIZED_NAME_REGISTRY_URL = "registryUrl";
  @SerializedName(SERIALIZED_NAME_REGISTRY_URL)
  private String registryUrl;

  public static final String SERIALIZED_NAME_STARTER_PROJECTS = "starterProjects";
  @SerializedName(SERIALIZED_NAME_STARTER_PROJECTS)
  private List<V220DevfileParentStarterProjects> starterProjects = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, String> variables = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public V220DevfileParent attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Overrides of attributes encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides of attributes encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public V220DevfileParent commands(List<V220DevfileParentCommands> commands) {
    
    this.commands = commands;
    return this;
  }

  public V220DevfileParent addCommandsItem(V220DevfileParentCommands commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Overrides of commands encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules.
   * @return commands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides of commands encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules.")

  public List<V220DevfileParentCommands> getCommands() {
    return commands;
  }


  public void setCommands(List<V220DevfileParentCommands> commands) {
    this.commands = commands;
  }


  public V220DevfileParent components(List<V220DevfileParentComponents> components) {
    
    this.components = components;
    return this;
  }

  public V220DevfileParent addComponentsItem(V220DevfileParentComponents componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Overrides of components encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules.
   * @return components
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides of components encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules.")

  public List<V220DevfileParentComponents> getComponents() {
    return components;
  }


  public void setComponents(List<V220DevfileParentComponents> components) {
    this.components = components;
  }


  public V220DevfileParent id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id in a registry that contains a Devfile yaml file
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id in a registry that contains a Devfile yaml file")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V220DevfileParent kubernetes(V220DevfileParentKubernetes kubernetes) {
    
    this.kubernetes = kubernetes;
    return this;
  }

   /**
   * Get kubernetes
   * @return kubernetes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileParentKubernetes getKubernetes() {
    return kubernetes;
  }


  public void setKubernetes(V220DevfileParentKubernetes kubernetes) {
    this.kubernetes = kubernetes;
  }


  public V220DevfileParent projects(List<V220DevfileParentProjects> projects) {
    
    this.projects = projects;
    return this;
  }

  public V220DevfileParent addProjectsItem(V220DevfileParentProjects projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Overrides of projects encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides of projects encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.")

  public List<V220DevfileParentProjects> getProjects() {
    return projects;
  }


  public void setProjects(List<V220DevfileParentProjects> projects) {
    this.projects = projects;
  }


  public V220DevfileParent registryUrl(String registryUrl) {
    
    this.registryUrl = registryUrl;
    return this;
  }

   /**
   * Registry URL to pull the parent devfile from when using id in the parent reference. To ensure the parent devfile gets resolved consistently in different environments, it is recommended to always specify the &#x60;registryUrl&#x60; when &#x60;id&#x60; is used.
   * @return registryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registry URL to pull the parent devfile from when using id in the parent reference. To ensure the parent devfile gets resolved consistently in different environments, it is recommended to always specify the `registryUrl` when `id` is used.")

  public String getRegistryUrl() {
    return registryUrl;
  }


  public void setRegistryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
  }


  public V220DevfileParent starterProjects(List<V220DevfileParentStarterProjects> starterProjects) {
    
    this.starterProjects = starterProjects;
    return this;
  }

  public V220DevfileParent addStarterProjectsItem(V220DevfileParentStarterProjects starterProjectsItem) {
    if (this.starterProjects == null) {
      this.starterProjects = new ArrayList<>();
    }
    this.starterProjects.add(starterProjectsItem);
    return this;
  }

   /**
   * Overrides of starterProjects encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.
   * @return starterProjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides of starterProjects encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.")

  public List<V220DevfileParentStarterProjects> getStarterProjects() {
    return starterProjects;
  }


  public void setStarterProjects(List<V220DevfileParentStarterProjects> starterProjects) {
    this.starterProjects = starterProjects;
  }


  public V220DevfileParent uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI Reference of a parent devfile YAML file. It can be a full URL or a relative URI with the current devfile as the base URI.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI Reference of a parent devfile YAML file. It can be a full URL or a relative URI with the current devfile as the base URI.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public V220DevfileParent variables(Map<String, String> variables) {
    
    this.variables = variables;
    return this;
  }

  public V220DevfileParent putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Overrides of variables encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides of variables encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules.")

  public Map<String, String> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }


  public V220DevfileParent version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Specific stack/sample version to pull the parent devfile from, when using id in the parent reference. To specify &#x60;version&#x60;, &#x60;id&#x60; must be defined and used as the import reference source. &#x60;version&#x60; can be either a specific stack version, or &#x60;latest&#x60;. If no &#x60;version&#x60; specified, default version will be used.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specific stack/sample version to pull the parent devfile from, when using id in the parent reference. To specify `version`, `id` must be defined and used as the import reference source. `version` can be either a specific stack version, or `latest`. If no `version` specified, default version will be used.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V220DevfileParent v220DevfileParent = (V220DevfileParent) o;
    return Objects.equals(this.attributes, v220DevfileParent.attributes) &&
        Objects.equals(this.commands, v220DevfileParent.commands) &&
        Objects.equals(this.components, v220DevfileParent.components) &&
        Objects.equals(this.id, v220DevfileParent.id) &&
        Objects.equals(this.kubernetes, v220DevfileParent.kubernetes) &&
        Objects.equals(this.projects, v220DevfileParent.projects) &&
        Objects.equals(this.registryUrl, v220DevfileParent.registryUrl) &&
        Objects.equals(this.starterProjects, v220DevfileParent.starterProjects) &&
        Objects.equals(this.uri, v220DevfileParent.uri) &&
        Objects.equals(this.variables, v220DevfileParent.variables) &&
        Objects.equals(this.version, v220DevfileParent.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, commands, components, id, kubernetes, projects, registryUrl, starterProjects, uri, variables, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220DevfileParent {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
    sb.append("    starterProjects: ").append(toIndentedString(starterProjects)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

