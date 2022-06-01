

# V220DevfileMetadata

Optional metadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architectures** | [**List&lt;ArchitecturesEnum&gt;**](#List&lt;ArchitecturesEnum&gt;) | Optional list of processor architectures that the devfile supports, empty list suggests that the devfile can be used on any architecture |  [optional]
**attributes** | [**Object**](.md) | Map of implementation-dependant free-form YAML attributes. Deprecated, use the top-level attributes field instead. |  [optional]
**description** | **String** | Optional devfile description |  [optional]
**displayName** | **String** | Optional devfile display name |  [optional]
**globalMemoryLimit** | **String** | Optional devfile global memory limit |  [optional]
**icon** | **String** | Optional devfile icon, can be a URI or a relative path in the project |  [optional]
**language** | **String** | Optional devfile language |  [optional]
**name** | **String** | Optional devfile name |  [optional]
**projectType** | **String** | Optional devfile project type |  [optional]
**provider** | **String** | Optional devfile provider information |  [optional]
**supportUrl** | **String** | Optional link to a page that provides support information |  [optional]
**tags** | **List&lt;String&gt;** | Optional devfile tags |  [optional]
**version** | **String** | Optional semver-compatible version |  [optional]
**website** | **String** | Optional devfile website |  [optional]



## Enum: List&lt;ArchitecturesEnum&gt;

Name | Value
---- | -----
AMD64 | &quot;amd64&quot;
ARM64 | &quot;arm64&quot;
PPC64LE | &quot;ppc64le&quot;
S390X | &quot;s390x&quot;



