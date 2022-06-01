

# V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainer

Allows adding and configuring devworkspace-related containers
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation** | [**V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerAnnotation**](V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerAnnotation.md) |  |  [optional]
**args** | **List&lt;String&gt;** | The arguments to supply to the command running the dockerimage component. The arguments are supplied either to the default command provided in the image or to the overridden command.  Defaults to an empty array, meaning use whatever is defined in the image. |  [optional]
**command** | **List&lt;String&gt;** | The command to run in the dockerimage component instead of the default one provided in the image.  Defaults to an empty array, meaning use whatever is defined in the image. |  [optional]
**cpuLimit** | **String** |  |  [optional]
**cpuRequest** | **String** |  |  [optional]
**dedicatedPod** | **Boolean** | Specify if a container should run in its own separated pod, instead of running as part of the main development environment pod.  Default value is &#x60;false&#x60; |  [optional]
**endpoints** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerEndpoints&gt;**](V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerEndpoints.md) |  |  [optional]
**env** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerEnv&gt;**](V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerEnv.md) | Environment variables used in this container.  The following variables are reserved and cannot be overridden via env:   - &#x60;$PROJECTS_ROOT&#x60;   - &#x60;$PROJECT_SOURCE&#x60; |  [optional]
**image** | **String** |  | 
**memoryLimit** | **String** |  |  [optional]
**memoryRequest** | **String** |  |  [optional]
**mountSources** | **Boolean** | Toggles whether or not the project source code should be mounted in the component.  Defaults to true for all component types except plugins and components that set &#x60;dedicatedPod&#x60; to true. |  [optional]
**sourceMapping** | **String** | Optional specification of the path in the container where project sources should be transferred/mounted when &#x60;mountSources&#x60; is &#x60;true&#x60;. When omitted, the default value of /projects is used. |  [optional]
**volumeMounts** | [**List&lt;V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerVolumeMounts&gt;**](V1alpha2DevWorkspaceSpecTemplateComponentsItemsContainerVolumeMounts.md) | List of volumes mounts that should be mounted is this container. |  [optional]



