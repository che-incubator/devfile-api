

# V220DevfileComponentsItemsKubernetesEndpoints

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation** | **Map&lt;String, String&gt;** | Annotations to be added to Kubernetes Ingress or Openshift Route |  [optional]
**attributes** | [**Object**](.md) | Map of implementation-dependant string-based free-form attributes.  Examples of Che-specific attributes: - cookiesAuthEnabled: \&quot;true\&quot; / \&quot;false\&quot;, - type: \&quot;terminal\&quot; / \&quot;ide\&quot; / \&quot;ide-dev\&quot;, |  [optional]
**exposure** | [**ExposureEnum**](#ExposureEnum) | Describes how the endpoint should be exposed on the network. - &#x60;public&#x60; means that the endpoint will be exposed on the public network, typically through a K8S ingress or an OpenShift route. - &#x60;internal&#x60; means that the endpoint will be exposed internally outside of the main devworkspace POD, typically by K8S services, to be consumed by other elements running on the same cloud internal network. - &#x60;none&#x60; means that the endpoint will not be exposed and will only be accessible inside the main devworkspace POD, on a local address.  Default value is &#x60;public&#x60; |  [optional]
**name** | **String** |  | 
**path** | **String** | Path of the endpoint URL |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Describes the application and transport protocols of the traffic that will go through this endpoint. - &#x60;http&#x60;: Endpoint will have &#x60;http&#x60; traffic, typically on a TCP connection. It will be automaticaly promoted to &#x60;https&#x60; when the &#x60;secure&#x60; field is set to &#x60;true&#x60;. - &#x60;https&#x60;: Endpoint will have &#x60;https&#x60; traffic, typically on a TCP connection. - &#x60;ws&#x60;: Endpoint will have &#x60;ws&#x60; traffic, typically on a TCP connection. It will be automaticaly promoted to &#x60;wss&#x60; when the &#x60;secure&#x60; field is set to &#x60;true&#x60;. - &#x60;wss&#x60;: Endpoint will have &#x60;wss&#x60; traffic, typically on a TCP connection. - &#x60;tcp&#x60;: Endpoint will have traffic on a TCP connection, without specifying an application protocol. - &#x60;udp&#x60;: Endpoint will have traffic on an UDP connection, without specifying an application protocol.  Default value is &#x60;http&#x60; |  [optional]
**secure** | **Boolean** | Describes whether the endpoint should be secured and protected by some authentication process. This requires a protocol of &#x60;https&#x60; or &#x60;wss&#x60;. |  [optional]
**targetPort** | **Integer** | Port number to be used within the container component. The same port cannot be used by two different container components. | 



## Enum: ExposureEnum

Name | Value
---- | -----
PUBLIC | &quot;public&quot;
INTERNAL | &quot;internal&quot;
NONE | &quot;none&quot;



## Enum: ProtocolEnum

Name | Value
---- | -----
HTTP | &quot;http&quot;
HTTPS | &quot;https&quot;
WS | &quot;ws&quot;
WSS | &quot;wss&quot;
TCP | &quot;tcp&quot;
UDP | &quot;udp&quot;



