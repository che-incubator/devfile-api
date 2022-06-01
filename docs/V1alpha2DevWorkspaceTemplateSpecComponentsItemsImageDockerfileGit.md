

# V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileGit

Dockerfile's Git source
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkoutFrom** | [**V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileGitCheckoutFrom**](V1alpha2DevWorkspaceTemplateSpecComponentsItemsImageDockerfileGitCheckoutFrom.md) |  |  [optional]
**fileLocation** | **String** | Location of the Dockerfile in the Git repository when using git as Dockerfile src. Defaults to Dockerfile. |  [optional]
**remotes** | **Map&lt;String, String&gt;** | The remotes map which should be initialized in the git project. Projects must have at least one remote configured while StarterProjects &amp; Image Component&#39;s Git source can only have at most one remote configured. | 



