/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.che_incubator.devfile.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints
 */

public class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints {
  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private Map<String, String> annotation = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  /**
   * Describes how the endpoint should be exposed on the network. - &#x60;public&#x60; means that the endpoint will be exposed on the public network, typically through a K8S ingress or an OpenShift route. - &#x60;internal&#x60; means that the endpoint will be exposed internally outside of the main devworkspace POD, typically by K8S services, to be consumed by other elements running on the same cloud internal network. - &#x60;none&#x60; means that the endpoint will not be exposed and will only be accessible inside the main devworkspace POD, on a local address.  Default value is &#x60;public&#x60;
   */
  @JsonAdapter(ExposureEnum.Adapter.class)
  public enum ExposureEnum {
    PUBLIC("public"),
    
    INTERNAL("internal"),
    
    NONE("none");

    private String value;

    ExposureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExposureEnum fromValue(String value) {
      for (ExposureEnum b : ExposureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExposureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExposureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExposureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExposureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPOSURE = "exposure";
  @SerializedName(SERIALIZED_NAME_EXPOSURE)
  private ExposureEnum exposure;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  /**
   * Describes the application and transport protocols of the traffic that will go through this endpoint. - &#x60;http&#x60;: Endpoint will have &#x60;http&#x60; traffic, typically on a TCP connection. It will be automaticaly promoted to &#x60;https&#x60; when the &#x60;secure&#x60; field is set to &#x60;true&#x60;. - &#x60;https&#x60;: Endpoint will have &#x60;https&#x60; traffic, typically on a TCP connection. - &#x60;ws&#x60;: Endpoint will have &#x60;ws&#x60; traffic, typically on a TCP connection. It will be automaticaly promoted to &#x60;wss&#x60; when the &#x60;secure&#x60; field is set to &#x60;true&#x60;. - &#x60;wss&#x60;: Endpoint will have &#x60;wss&#x60; traffic, typically on a TCP connection. - &#x60;tcp&#x60;: Endpoint will have traffic on a TCP connection, without specifying an application protocol. - &#x60;udp&#x60;: Endpoint will have traffic on an UDP connection, without specifying an application protocol.  Default value is &#x60;http&#x60;
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    HTTP("http"),
    
    HTTPS("https"),
    
    WS("ws"),
    
    WSS("wss"),
    
    TCP("tcp"),
    
    UDP("udp");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;

  public static final String SERIALIZED_NAME_SECURE = "secure";
  @SerializedName(SERIALIZED_NAME_SECURE)
  private Boolean secure;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private Integer targetPort;


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints annotation(Map<String, String> annotation) {
    
    this.annotation = annotation;
    return this;
  }

  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints putAnnotationItem(String key, String annotationItem) {
    if (this.annotation == null) {
      this.annotation = new HashMap<>();
    }
    this.annotation.put(key, annotationItem);
    return this;
  }

   /**
   * Annotations to be added to Kubernetes Ingress or Openshift Route
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations to be added to Kubernetes Ingress or Openshift Route")

  public Map<String, String> getAnnotation() {
    return annotation;
  }


  public void setAnnotation(Map<String, String> annotation) {
    this.annotation = annotation;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Map of implementation-dependant string-based free-form attributes.  Examples of Che-specific attributes: - cookiesAuthEnabled: \&quot;true\&quot; / \&quot;false\&quot;, - type: \&quot;terminal\&quot; / \&quot;ide\&quot; / \&quot;ide-dev\&quot;,
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Map of implementation-dependant string-based free-form attributes.  Examples of Che-specific attributes: - cookiesAuthEnabled: \"true\" / \"false\", - type: \"terminal\" / \"ide\" / \"ide-dev\",")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints exposure(ExposureEnum exposure) {
    
    this.exposure = exposure;
    return this;
  }

   /**
   * Describes how the endpoint should be exposed on the network. - &#x60;public&#x60; means that the endpoint will be exposed on the public network, typically through a K8S ingress or an OpenShift route. - &#x60;internal&#x60; means that the endpoint will be exposed internally outside of the main devworkspace POD, typically by K8S services, to be consumed by other elements running on the same cloud internal network. - &#x60;none&#x60; means that the endpoint will not be exposed and will only be accessible inside the main devworkspace POD, on a local address.  Default value is &#x60;public&#x60;
   * @return exposure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes how the endpoint should be exposed on the network. - `public` means that the endpoint will be exposed on the public network, typically through a K8S ingress or an OpenShift route. - `internal` means that the endpoint will be exposed internally outside of the main devworkspace POD, typically by K8S services, to be consumed by other elements running on the same cloud internal network. - `none` means that the endpoint will not be exposed and will only be accessible inside the main devworkspace POD, on a local address.  Default value is `public`")

  public ExposureEnum getExposure() {
    return exposure;
  }


  public void setExposure(ExposureEnum exposure) {
    this.exposure = exposure;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path of the endpoint URL
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path of the endpoint URL")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Describes the application and transport protocols of the traffic that will go through this endpoint. - &#x60;http&#x60;: Endpoint will have &#x60;http&#x60; traffic, typically on a TCP connection. It will be automaticaly promoted to &#x60;https&#x60; when the &#x60;secure&#x60; field is set to &#x60;true&#x60;. - &#x60;https&#x60;: Endpoint will have &#x60;https&#x60; traffic, typically on a TCP connection. - &#x60;ws&#x60;: Endpoint will have &#x60;ws&#x60; traffic, typically on a TCP connection. It will be automaticaly promoted to &#x60;wss&#x60; when the &#x60;secure&#x60; field is set to &#x60;true&#x60;. - &#x60;wss&#x60;: Endpoint will have &#x60;wss&#x60; traffic, typically on a TCP connection. - &#x60;tcp&#x60;: Endpoint will have traffic on a TCP connection, without specifying an application protocol. - &#x60;udp&#x60;: Endpoint will have traffic on an UDP connection, without specifying an application protocol.  Default value is &#x60;http&#x60;
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the application and transport protocols of the traffic that will go through this endpoint. - `http`: Endpoint will have `http` traffic, typically on a TCP connection. It will be automaticaly promoted to `https` when the `secure` field is set to `true`. - `https`: Endpoint will have `https` traffic, typically on a TCP connection. - `ws`: Endpoint will have `ws` traffic, typically on a TCP connection. It will be automaticaly promoted to `wss` when the `secure` field is set to `true`. - `wss`: Endpoint will have `wss` traffic, typically on a TCP connection. - `tcp`: Endpoint will have traffic on a TCP connection, without specifying an application protocol. - `udp`: Endpoint will have traffic on an UDP connection, without specifying an application protocol.  Default value is `http`")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints secure(Boolean secure) {
    
    this.secure = secure;
    return this;
  }

   /**
   * Describes whether the endpoint should be secured and protected by some authentication process. This requires a protocol of &#x60;https&#x60; or &#x60;wss&#x60;.
   * @return secure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes whether the endpoint should be secured and protected by some authentication process. This requires a protocol of `https` or `wss`.")

  public Boolean getSecure() {
    return secure;
  }


  public void setSecure(Boolean secure) {
    this.secure = secure;
  }


  public V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints targetPort(Integer targetPort) {
    
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Port number to be used within the container component. The same port cannot be used by two different container components.
   * @return targetPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port number to be used within the container component. The same port cannot be used by two different container components.")

  public Integer getTargetPort() {
    return targetPort;
  }


  public void setTargetPort(Integer targetPort) {
    this.targetPort = targetPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints = (V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints) o;
    return Objects.equals(this.annotation, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.annotation) &&
        Objects.equals(this.attributes, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.attributes) &&
        Objects.equals(this.exposure, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.exposure) &&
        Objects.equals(this.name, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.name) &&
        Objects.equals(this.path, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.path) &&
        Objects.equals(this.protocol, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.protocol) &&
        Objects.equals(this.secure, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.secure) &&
        Objects.equals(this.targetPort, v1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, attributes, exposure, name, path, protocol, secure, targetPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecParentComponentsItemsKubernetesEndpoints {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

