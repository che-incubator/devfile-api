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

/**
 * Defines the group this command is part of
 */
@ApiModel(description = "Defines the group this command is part of")

public class V1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup {
  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  /**
   * Kind of group the command is part of
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    BUILD("build"),
    
    RUN("run"),
    
    TEST("test"),
    
    DEBUG("debug"),
    
    DEPLOY("deploy");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;


  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Identifies the default command for a given group kind
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the default command for a given group kind")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public V1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup kind(KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind of group the command is part of
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of group the command is part of")

  public KindEnum getKind() {
    return kind;
  }


  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup v1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup = (V1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup) o;
    return Objects.equals(this.isDefault, v1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup.isDefault) &&
        Objects.equals(this.kind, v1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, kind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateSpecCommandsItemsCompositeGroup {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

