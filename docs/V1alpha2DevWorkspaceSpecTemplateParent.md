

# V1alpha2DevWorkspaceSpecTemplateParent

Parent devworkspace template
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Object**](.md) | Overrides of attributes encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**commands** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateParentCommands&gt;**](V1alpha2DevWorkspaceSpecTemplateParentCommands.md) | Overrides of commands encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**components** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateParentComponents&gt;**](V1alpha2DevWorkspaceSpecTemplateParentComponents.md) | Overrides of components encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**id** | **String** | Id in a registry that contains a Devfile yaml file |  [optional]
**kubernetes** | [**V1alpha2DevWorkspaceSpecTemplateParentKubernetes**](V1alpha2DevWorkspaceSpecTemplateParentKubernetes.md) |  |  [optional]
**projects** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateParentProjects&gt;**](V1alpha2DevWorkspaceSpecTemplateParentProjects.md) | Overrides of projects encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**registryUrl** | **String** | Registry URL to pull the parent devfile from when using id in the parent reference. To ensure the parent devfile gets resolved consistently in different environments, it is recommended to always specify the &#x60;registryUrl&#x60; when &#x60;id&#x60; is used. |  [optional]
**starterProjects** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateParentStarterProjects&gt;**](V1alpha2DevWorkspaceSpecTemplateParentStarterProjects.md) | Overrides of starterProjects encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**uri** | **String** | URI Reference of a parent devfile YAML file. It can be a full URL or a relative URI with the current devfile as the base URI. |  [optional]
**variables** | **Map&lt;String, String&gt;** | Overrides of variables encapsulated in a parent devfile. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**version** | **String** | Specific stack/sample version to pull the parent devfile from, when using id in the parent reference. To specify &#x60;version&#x60;, &#x60;id&#x60; must be defined and used as the import reference source. &#x60;version&#x60; can be either a specific stack version, or &#x60;latest&#x60;. If no &#x60;version&#x60; specified, default version will be used. |  [optional]



