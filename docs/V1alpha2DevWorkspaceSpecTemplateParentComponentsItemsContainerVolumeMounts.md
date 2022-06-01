

# V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsContainerVolumeMounts

Volume that should be mounted to a component container
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The volume mount name is the name of an existing &#x60;Volume&#x60; component. If several containers mount the same volume name then they will reuse the same volume and will be able to access to the same files. | 
**path** | **String** | The path in the component container where the volume should be mounted. If not path is mentioned, default path is the is &#x60;/&lt;name&gt;&#x60;. |  [optional]



