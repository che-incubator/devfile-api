

# V220Devfile

Devfile describes the structure of a cloud-native devworkspace and development environment.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Map of implementation-dependant free-form YAML attributes. |  [optional]
**commands** | [**List&lt;V220DevfileCommands&gt;**](V220DevfileCommands.md) | Predefined, ready-to-use, devworkspace-related commands |  [optional]
**components** | [**List&lt;V220DevfileComponents&gt;**](V220DevfileComponents.md) | List of the devworkspace components, such as editor and plugins, user-provided containers, or other types of components |  [optional]
**events** | [**V220DevfileEvents**](V220DevfileEvents.md) |  |  [optional]
**metadata** | [**V220DevfileMetadata**](V220DevfileMetadata.md) |  |  [optional]
**parent** | [**V220DevfileParent**](V220DevfileParent.md) |  |  [optional]
**projects** | [**List&lt;V220DevfileProjects&gt;**](V220DevfileProjects.md) | Projects worked on in the devworkspace, containing names and sources locations |  [optional]
**schemaVersion** | **String** | Devfile schema version | 
**starterProjects** | [**List&lt;V220DevfileStarterProjects&gt;**](V220DevfileStarterProjects.md) | StarterProjects is a project that can be used as a starting point when bootstrapping new projects |  [optional]
**variables** | **Map&lt;String, String&gt;** | Map of key-value variables used for string replacement in the devfile. Values can be referenced via {{variable-key}} to replace the corresponding value in string fields in the devfile. Replacement cannot be used for   - schemaVersion, metadata, parent source   - element identifiers, e.g. command id, component name, endpoint name, project name   - references to identifiers, e.g. in events, a command&#39;s component, container&#39;s volume mount name   - string enums, e.g. command group kind, endpoint exposure |  [optional]



