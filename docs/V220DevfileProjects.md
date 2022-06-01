

# V220DevfileProjects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Map of implementation-dependant free-form YAML attributes. |  [optional]
**clonePath** | **String** | Path relative to the root of the projects to which this project should be cloned into. This is a unix-style relative path (i.e. uses forward slashes). The path is invalid if it is absolute or tries to escape the project root through the usage of &#39;..&#39;. If not specified, defaults to the project name. |  [optional]
**git** | [**V220DevfileProjectsItemsGit**](V220DevfileProjectsItemsGit.md) |  |  [optional]
**name** | **String** | Project name | 
**zip** | [**V220DevfileProjectsItemsZip**](V220DevfileProjectsItemsZip.md) |  |  [optional]



