

# V1alpha2DevWorkspaceMetadataManagedFields

ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted. |  [optional]
**fieldsType** | **String** | FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \&quot;FieldsV1\&quot; |  [optional]
**fieldsV1** | [**Object**](.md) | FieldsV1 holds the first JSON version format as described in the \&quot;FieldsV1\&quot; type. |  [optional]
**manager** | **String** | Manager is an identifier of the workflow managing these fields. |  [optional]
**operation** | **String** | Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;. |  [optional]
**time** | [**OffsetDateTime**](OffsetDateTime.md) | Time is timestamp of when these fields were set. It should always be empty if Operation is &#39;Apply&#39; |  [optional]



