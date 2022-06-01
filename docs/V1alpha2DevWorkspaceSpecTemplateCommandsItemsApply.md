

# V1alpha2DevWorkspaceSpecTemplateCommandsItemsApply

Command that consists in applying a given component definition, typically bound to a devworkspace event.  For example, when an `apply` command is bound to a `preStart` event, and references a `container` component, it will start the container as a K8S initContainer in the devworkspace POD, unless the component has its `dedicatedPod` field set to `true`.  When no `apply` command exist for a given component, it is assumed the component will be applied at devworkspace start by default, unless `deployByDefault` for that component is set to false.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | Describes component that will be applied | 
**group** | [**V1alpha2DevWorkspaceSpecTemplateCommandsItemsApplyGroup**](V1alpha2DevWorkspaceSpecTemplateCommandsItemsApplyGroup.md) |  |  [optional]
**label** | **String** | Optional label that provides a label for this command to be used in Editor UI menus for example |  [optional]



