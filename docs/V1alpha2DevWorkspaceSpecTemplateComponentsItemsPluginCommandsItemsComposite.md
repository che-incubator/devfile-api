

# V1alpha2DevWorkspaceSpecTemplateComponentsItemsPluginCommandsItemsComposite

Composite command that allows executing several sub-commands either sequentially or concurrently
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commands** | **List&lt;String&gt;** | The commands that comprise this composite command |  [optional]
**group** | [**V1alpha2DevWorkspaceSpecTemplateComponentsItemsPluginCommandsItemsCompositeGroup**](V1alpha2DevWorkspaceSpecTemplateComponentsItemsPluginCommandsItemsCompositeGroup.md) |  |  [optional]
**label** | **String** | Optional label that provides a label for this command to be used in Editor UI menus for example |  [optional]
**parallel** | **Boolean** | Indicates if the sub-commands should be executed concurrently |  [optional]



