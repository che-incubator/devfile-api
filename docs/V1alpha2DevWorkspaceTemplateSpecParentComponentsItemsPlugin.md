

# V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPlugin

Allows importing a plugin.  Plugins are mainly imported devfiles that contribute components, commands and events as a consistent single unit. They are defined in either YAML files following the devfile syntax, or as `DevWorkspaceTemplate` Kubernetes Custom Resources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commands** | [**List&lt;V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginCommands&gt;**](V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginCommands.md) | Overrides of commands encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**components** | [**List&lt;V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponents&gt;**](V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginComponents.md) | Overrides of components encapsulated in a parent devfile or a plugin. Overriding is done according to K8S strategic merge patch standard rules. |  [optional]
**id** | **String** | Id in a registry that contains a Devfile yaml file |  [optional]
**kubernetes** | [**V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginKubernetes**](V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsPluginKubernetes.md) |  |  [optional]
**registryUrl** | **String** | Registry URL to pull the parent devfile from when using id in the parent reference. To ensure the parent devfile gets resolved consistently in different environments, it is recommended to always specify the &#x60;registryUrl&#x60; when &#x60;id&#x60; is used. |  [optional]
**uri** | **String** | URI Reference of a parent devfile YAML file. It can be a full URL or a relative URI with the current devfile as the base URI. |  [optional]
**version** | **String** | Specific stack/sample version to pull the parent devfile from, when using id in the parent reference. To specify &#x60;version&#x60;, &#x60;id&#x60; must be defined and used as the import reference source. &#x60;version&#x60; can be either a specific stack version, or &#x60;latest&#x60;. If no &#x60;version&#x60; specified, default version will be used. |  [optional]



