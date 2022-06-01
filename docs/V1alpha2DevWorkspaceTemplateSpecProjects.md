

# V1alpha2DevWorkspaceTemplateSpecProjects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Map of implementation-dependant free-form YAML attributes. |  [optional]
**clonePath** | **String** | Path relative to the root of the projects to which this project should be cloned into. This is a unix-style relative path (i.e. uses forward slashes). The path is invalid if it is absolute or tries to escape the project root through the usage of &#39;..&#39;. If not specified, defaults to the project name. |  [optional]
**custom** | [**V1alpha2DevWorkspaceTemplateSpecProjectsItemsCustom**](V1alpha2DevWorkspaceTemplateSpecProjectsItemsCustom.md) |  |  [optional]
**git** | [**V1alpha2DevWorkspaceTemplateSpecProjectsItemsGit**](V1alpha2DevWorkspaceTemplateSpecProjectsItemsGit.md) |  |  [optional]
**name** | **String** | Project name | 
**zip** | [**V1alpha2DevWorkspaceTemplateSpecProjectsItemsZip**](V1alpha2DevWorkspaceTemplateSpecProjectsItemsZip.md) |  |  [optional]



