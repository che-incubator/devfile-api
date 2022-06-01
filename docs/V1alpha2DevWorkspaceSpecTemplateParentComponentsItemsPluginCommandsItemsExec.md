

# V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsExec

CLI Command executed in an existing component container
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commandLine** | **String** | The actual command-line string  Special variables that can be used:   - &#x60;$PROJECTS_ROOT&#x60;: A path where projects sources are mounted as defined by container component&#39;s sourceMapping.   - &#x60;$PROJECT_SOURCE&#x60;: A path to a project source ($PROJECTS_ROOT/&lt;project-name&gt;). If there are multiple projects, this will point to the directory of the first one. |  [optional]
**component** | **String** | Describes component to which given action relates |  [optional]
**env** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsExecEnv&gt;**](V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsExecEnv.md) | Optional list of environment variables that have to be set before running the command |  [optional]
**group** | [**V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsExecGroup**](V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsExecGroup.md) |  |  [optional]
**hotReloadCapable** | **Boolean** | Whether the command is capable to reload itself when source code changes. If set to &#x60;true&#x60; the command won&#39;t be restarted and it is expected to handle file changes on its own.  Default value is &#x60;false&#x60; |  [optional]
**label** | **String** | Optional label that provides a label for this command to be used in Editor UI menus for example |  [optional]
**workingDir** | **String** | Working directory where the command should be executed  Special variables that can be used:   - &#x60;$PROJECTS_ROOT&#x60;: A path where projects sources are mounted as defined by container component&#39;s sourceMapping.   - &#x60;$PROJECT_SOURCE&#x60;: A path to a project source ($PROJECTS_ROOT/&lt;project-name&gt;). If there are multiple projects, this will point to the directory of the first one. |  [optional]



