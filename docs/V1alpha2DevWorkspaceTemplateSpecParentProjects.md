

# V1alpha2DevWorkspaceTemplateSpecParentProjects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Map of implementation-dependant free-form YAML attributes. |  [optional]
**clonePath** | **String** | Path relative to the root of the projects to which this project should be cloned into. This is a unix-style relative path (i.e. uses forward slashes). The path is invalid if it is absolute or tries to escape the project root through the usage of &#39;..&#39;. If not specified, defaults to the project name. |  [optional]
**git** | [**V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit**](V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsGit.md) |  |  [optional]
**name** | **String** | Project name | 
**zip** | [**V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip**](V1alpha2DevWorkspaceTemplateSpecParentProjectsItemsZip.md) |  |  [optional]



