

# V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfile

Allows specifying dockerfile type build
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | The arguments to supply to the dockerfile build. |  [optional]
**buildContext** | **String** | Path of source directory to establish build context. Defaults to ${PROJECT_SOURCE} in the container |  [optional]
**devfileRegistry** | [**V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileDevfileRegistry**](V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileDevfileRegistry.md) |  |  [optional]
**git** | [**V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGit**](V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsImageDockerfileGit.md) |  |  [optional]
**rootRequired** | **Boolean** | Specify if a privileged builder pod is required.  Default value is &#x60;false&#x60; |  [optional]
**uri** | **String** | URI Reference of a Dockerfile. It can be a full URL or a relative URI from the current devfile as the base URI. |  [optional]



