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
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileCommands;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileComponents;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileEvents;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileMetadata;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileParent;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileProjects;
import io.github.che_incubator.devfile.kubernetes.client.models.V220DevfileStarterProjects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Devfile describes the structure of a cloud-native devworkspace and development environment.
 */
@ApiModel(description = "Devfile describes the structure of a cloud-native devworkspace and development environment.")

public class V220Devfile {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_COMMANDS = "commands";
  @SerializedName(SERIALIZED_NAME_COMMANDS)
  private List<V220DevfileCommands> commands = null;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<V220DevfileComponents> components = null;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private V220DevfileEvents events;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V220DevfileMetadata metadata;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private V220DevfileParent parent;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<V220DevfileProjects> projects = null;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private String schemaVersion;

  public static final String SERIALIZED_NAME_STARTER_PROJECTS = "starterProjects";
  @SerializedName(SERIALIZED_NAME_STARTER_PROJECTS)
  private List<V220DevfileStarterProjects> starterProjects = null;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, String> variables = null;


  public V220Devfile attributes(Object attributes) {
    
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


  public V220Devfile commands(List<V220DevfileCommands> commands) {
    
    this.commands = commands;
    return this;
  }

  public V220Devfile addCommandsItem(V220DevfileCommands commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Predefined, ready-to-use, devworkspace-related commands
   * @return commands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Predefined, ready-to-use, devworkspace-related commands")

  public List<V220DevfileCommands> getCommands() {
    return commands;
  }


  public void setCommands(List<V220DevfileCommands> commands) {
    this.commands = commands;
  }


  public V220Devfile components(List<V220DevfileComponents> components) {
    
    this.components = components;
    return this;
  }

  public V220Devfile addComponentsItem(V220DevfileComponents componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * List of the devworkspace components, such as editor and plugins, user-provided containers, or other types of components
   * @return components
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the devworkspace components, such as editor and plugins, user-provided containers, or other types of components")

  public List<V220DevfileComponents> getComponents() {
    return components;
  }


  public void setComponents(List<V220DevfileComponents> components) {
    this.components = components;
  }


  public V220Devfile events(V220DevfileEvents events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileEvents getEvents() {
    return events;
  }


  public void setEvents(V220DevfileEvents events) {
    this.events = events;
  }


  public V220Devfile metadata(V220DevfileMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(V220DevfileMetadata metadata) {
    this.metadata = metadata;
  }


  public V220Devfile parent(V220DevfileParent parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V220DevfileParent getParent() {
    return parent;
  }


  public void setParent(V220DevfileParent parent) {
    this.parent = parent;
  }


  public V220Devfile projects(List<V220DevfileProjects> projects) {
    
    this.projects = projects;
    return this;
  }

  public V220Devfile addProjectsItem(V220DevfileProjects projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Projects worked on in the devworkspace, containing names and sources locations
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Projects worked on in the devworkspace, containing names and sources locations")

  public List<V220DevfileProjects> getProjects() {
    return projects;
  }


  public void setProjects(List<V220DevfileProjects> projects) {
    this.projects = projects;
  }


  public V220Devfile schemaVersion(String schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * Devfile schema version
   * @return schemaVersion
  **/
  @ApiModelProperty(required = true, value = "Devfile schema version")

  public String getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public V220Devfile starterProjects(List<V220DevfileStarterProjects> starterProjects) {
    
    this.starterProjects = starterProjects;
    return this;
  }

  public V220Devfile addStarterProjectsItem(V220DevfileStarterProjects starterProjectsItem) {
    if (this.starterProjects == null) {
      this.starterProjects = new ArrayList<>();
    }
    this.starterProjects.add(starterProjectsItem);
    return this;
  }

   /**
   * StarterProjects is a project that can be used as a starting point when bootstrapping new projects
   * @return starterProjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StarterProjects is a project that can be used as a starting point when bootstrapping new projects")

  public List<V220DevfileStarterProjects> getStarterProjects() {
    return starterProjects;
  }


  public void setStarterProjects(List<V220DevfileStarterProjects> starterProjects) {
    this.starterProjects = starterProjects;
  }


  public V220Devfile variables(Map<String, String> variables) {
    
    this.variables = variables;
    return this;
  }

  public V220Devfile putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Map of key-value variables used for string replacement in the devfile. Values can be referenced via {{variable-key}} to replace the corresponding value in string fields in the devfile. Replacement cannot be used for   - schemaVersion, metadata, parent source   - element identifiers, e.g. command id, component name, endpoint name, project name   - references to identifiers, e.g. in events, a command&#39;s component, container&#39;s volume mount name   - string enums, e.g. command group kind, endpoint exposure
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Map of key-value variables used for string replacement in the devfile. Values can be referenced via {{variable-key}} to replace the corresponding value in string fields in the devfile. Replacement cannot be used for   - schemaVersion, metadata, parent source   - element identifiers, e.g. command id, component name, endpoint name, project name   - references to identifiers, e.g. in events, a command's component, container's volume mount name   - string enums, e.g. command group kind, endpoint exposure")

  public Map<String, String> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V220Devfile v220Devfile = (V220Devfile) o;
    return Objects.equals(this.attributes, v220Devfile.attributes) &&
        Objects.equals(this.commands, v220Devfile.commands) &&
        Objects.equals(this.components, v220Devfile.components) &&
        Objects.equals(this.events, v220Devfile.events) &&
        Objects.equals(this.metadata, v220Devfile.metadata) &&
        Objects.equals(this.parent, v220Devfile.parent) &&
        Objects.equals(this.projects, v220Devfile.projects) &&
        Objects.equals(this.schemaVersion, v220Devfile.schemaVersion) &&
        Objects.equals(this.starterProjects, v220Devfile.starterProjects) &&
        Objects.equals(this.variables, v220Devfile.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, commands, components, events, metadata, parent, projects, schemaVersion, starterProjects, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220Devfile {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    starterProjects: ").append(toIndentedString(starterProjects)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

