

# V1alpha2DevWorkspace

DevWorkspace is the Schema for the devworkspaces API
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1alpha2DevWorkspaceMetadata**](V1alpha2DevWorkspaceMetadata.md) |  |  [optional]
**spec** | [**V1alpha2DevWorkspaceSpec**](V1alpha2DevWorkspaceSpec.md) |  |  [optional]
**status** | [**V1alpha2DevWorkspaceStatus**](V1alpha2DevWorkspaceStatus.md) |  |  [optional]



