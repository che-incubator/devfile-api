

# V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfile

Allows specifying dockerfile type build
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | The arguments to supply to the dockerfile build. |  [optional]
**buildContext** | **String** | Path of source directory to establish build context. Defaults to ${PROJECT_SOURCE} in the container |  [optional]
**devfileRegistry** | [**V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileDevfileRegistry**](V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileDevfileRegistry.md) |  |  [optional]
**git** | [**V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileGit**](V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileGit.md) |  |  [optional]
**rootRequired** | **Boolean** | Specify if a privileged builder pod is required.  Default value is &#x60;false&#x60; |  [optional]
**uri** | **String** | URI Reference of a Dockerfile. It can be a full URL or a relative URI from the current devfile as the base URI. |  [optional]



