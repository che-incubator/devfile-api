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
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecEnv;
import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CLI Command executed in an existing component container
 */
@ApiModel(description = "CLI Command executed in an existing component container")

public class V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec {
  public static final String SERIALIZED_NAME_COMMAND_LINE = "commandLine";
  @SerializedName(SERIALIZED_NAME_COMMAND_LINE)
  private String commandLine;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecEnv> env = null;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecGroup group;

  public static final String SERIALIZED_NAME_HOT_RELOAD_CAPABLE = "hotReloadCapable";
  @SerializedName(SERIALIZED_NAME_HOT_RELOAD_CAPABLE)
  private Boolean hotReloadCapable;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_WORKING_DIR = "workingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec commandLine(String commandLine) {
    
    this.commandLine = commandLine;
    return this;
  }

   /**
   * The actual command-line string  Special variables that can be used:   - &#x60;$PROJECTS_ROOT&#x60;: A path where projects sources are mounted as defined by container component&#39;s sourceMapping.   - &#x60;$PROJECT_SOURCE&#x60;: A path to a project source ($PROJECTS_ROOT/&lt;project-name&gt;). If there are multiple projects, this will point to the directory of the first one.
   * @return commandLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual command-line string  Special variables that can be used:   - `$PROJECTS_ROOT`: A path where projects sources are mounted as defined by container component's sourceMapping.   - `$PROJECT_SOURCE`: A path to a project source ($PROJECTS_ROOT/<project-name>). If there are multiple projects, this will point to the directory of the first one.")

  public String getCommandLine() {
    return commandLine;
  }


  public void setCommandLine(String commandLine) {
    this.commandLine = commandLine;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec component(String component) {
    
    this.component = component;
    return this;
  }

   /**
   * Describes component to which given action relates
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes component to which given action relates")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    this.component = component;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec env(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec addEnvItem(V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Optional list of environment variables that have to be set before running the command
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of environment variables that have to be set before running the command")

  public List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecEnv> env) {
    this.env = env;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec group(V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecGroup getGroup() {
    return group;
  }


  public void setGroup(V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExecGroup group) {
    this.group = group;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec hotReloadCapable(Boolean hotReloadCapable) {
    
    this.hotReloadCapable = hotReloadCapable;
    return this;
  }

   /**
   * Whether the command is capable to reload itself when source code changes. If set to &#x60;true&#x60; the command won&#39;t be restarted and it is expected to handle file changes on its own.  Default value is &#x60;false&#x60;
   * @return hotReloadCapable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the command is capable to reload itself when source code changes. If set to `true` the command won't be restarted and it is expected to handle file changes on its own.  Default value is `false`")

  public Boolean getHotReloadCapable() {
    return hotReloadCapable;
  }


  public void setHotReloadCapable(Boolean hotReloadCapable) {
    this.hotReloadCapable = hotReloadCapable;
  }


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec label(String label) {
    
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


  public V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec workingDir(String workingDir) {
    
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Working directory where the command should be executed  Special variables that can be used:   - &#x60;$PROJECTS_ROOT&#x60;: A path where projects sources are mounted as defined by container component&#39;s sourceMapping.   - &#x60;$PROJECT_SOURCE&#x60;: A path to a project source ($PROJECTS_ROOT/&lt;project-name&gt;). If there are multiple projects, this will point to the directory of the first one.
   * @return workingDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Working directory where the command should be executed  Special variables that can be used:   - `$PROJECTS_ROOT`: A path where projects sources are mounted as defined by container component's sourceMapping.   - `$PROJECT_SOURCE`: A path to a project source ($PROJECTS_ROOT/<project-name>). If there are multiple projects, this will point to the directory of the first one.")

  public String getWorkingDir() {
    return workingDir;
  }


  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec = (V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec) o;
    return Objects.equals(this.commandLine, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.commandLine) &&
        Objects.equals(this.component, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.component) &&
        Objects.equals(this.env, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.env) &&
        Objects.equals(this.group, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.group) &&
        Objects.equals(this.hotReloadCapable, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.hotReloadCapable) &&
        Objects.equals(this.label, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.label) &&
        Objects.equals(this.workingDir, v1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandLine, component, env, group, hotReloadCapable, label, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecComponentsItemsPluginCommandsItemsExec {\n");
    sb.append("    commandLine: ").append(toIndentedString(commandLine)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hotReloadCapable: ").append(toIndentedString(hotReloadCapable)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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

