

# V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsComposite

Composite command that allows executing several sub-commands either sequentially or concurrently
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commands** | **List&lt;String&gt;** | The commands that comprise this composite command |  [optional]
**group** | [**V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsCompositeGroup**](V1alpha2DevWorkspaceSpecTemplateParentComponentsItemsPluginCommandsItemsCompositeGroup.md) |  |  [optional]
**label** | **String** | Optional label that provides a label for this command to be used in Editor UI menus for example |  [optional]
**parallel** | **Boolean** | Indicates if the sub-commands should be executed concurrently |  [optional]



