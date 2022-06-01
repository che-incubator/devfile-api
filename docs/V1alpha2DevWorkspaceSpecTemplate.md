

# V1alpha2DevWorkspaceSpecTemplate

Structure of the devworkspace. This is also the specification of a devworkspace template.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Map of implementation-dependant free-form YAML attributes. |  [optional]
**commands** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateCommands&gt;**](V1alpha2DevWorkspaceSpecTemplateCommands.md) | Predefined, ready-to-use, devworkspace-related commands |  [optional]
**components** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateComponents&gt;**](V1alpha2DevWorkspaceSpecTemplateComponents.md) | List of the devworkspace components, such as editor and plugins, user-provided containers, or other types of components |  [optional]
**events** | [**V1alpha2DevWorkspaceSpecTemplateEvents**](V1alpha2DevWorkspaceSpecTemplateEvents.md) |  |  [optional]
**parent** | [**V1alpha2DevWorkspaceSpecTemplateParent**](V1alpha2DevWorkspaceSpecTemplateParent.md) |  |  [optional]
**projects** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateProjects&gt;**](V1alpha2DevWorkspaceSpecTemplateProjects.md) | Projects worked on in the devworkspace, containing names and sources locations |  [optional]
**starterProjects** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateStarterProjects&gt;**](V1alpha2DevWorkspaceSpecTemplateStarterProjects.md) | StarterProjects is a project that can be used as a starting point when bootstrapping new projects |  [optional]
**variables** | **Map&lt;String, String&gt;** | Map of key-value variables used for string replacement in the devfile. Values can be referenced via {{variable-key}} to replace the corresponding value in string fields in the devfile. Replacement cannot be used for   - schemaVersion, metadata, parent source   - element identifiers, e.g. command id, component name, endpoint name, project name   - references to identifiers, e.g. in events, a command&#39;s component, container&#39;s volume mount name   - string enums, e.g. command group kind, endpoint exposure |  [optional]



