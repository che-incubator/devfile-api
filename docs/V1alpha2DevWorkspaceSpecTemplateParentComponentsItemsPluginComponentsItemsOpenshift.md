

# V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginComponentsItemsOpenshift

Allows importing into the devworkspace the OpenShift resources defined in a given manifest. For example this allows reusing the OpenShift definitions used to deploy some runtime components in production.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deployByDefault** | **Boolean** | Defines if the component should be deployed during startup.  Default value is &#x60;false&#x60; |  [optional]
**endpoints** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginComponentsItemsOpenshiftEndpoints&gt;**](V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginComponentsItemsOpenshiftEndpoints.md) |  |  [optional]
**inlined** | **String** | Inlined manifest |  [optional]
**uri** | **String** | Location in a file fetched from a uri. |  [optional]



