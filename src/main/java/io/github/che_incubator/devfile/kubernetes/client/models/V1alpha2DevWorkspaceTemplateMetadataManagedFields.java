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
import java.time.OffsetDateTime;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@ApiModel(description = "ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")

public class V1alpha2DevWorkspaceTemplateMetadataManagedFields {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELDS_TYPE = "fieldsType";
  @SerializedName(SERIALIZED_NAME_FIELDS_TYPE)
  private String fieldsType;

  public static final String SERIALIZED_NAME_FIELDS_V1 = "fieldsV1";
  @SerializedName(SERIALIZED_NAME_FIELDS_V1)
  private Object fieldsV1;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private String manager;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;


  public V1alpha2DevWorkspaceTemplateMetadataManagedFields apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha2DevWorkspaceTemplateMetadataManagedFields fieldsType(String fieldsType) {
    
    this.fieldsType = fieldsType;
    return this;
  }

   /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \&quot;FieldsV1\&quot;
   * @return fieldsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"")

  public String getFieldsType() {
    return fieldsType;
  }


  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }


  public V1alpha2DevWorkspaceTemplateMetadataManagedFields fieldsV1(Object fieldsV1) {
    
    this.fieldsV1 = fieldsV1;
    return this;
  }

   /**
   * FieldsV1 holds the first JSON version format as described in the \&quot;FieldsV1\&quot; type.
   * @return fieldsV1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FieldsV1 holds the first JSON version format as described in the \"FieldsV1\" type.")

  public Object getFieldsV1() {
    return fieldsV1;
  }


  public void setFieldsV1(Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }


  public V1alpha2DevWorkspaceTemplateMetadataManagedFields manager(String manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manager is an identifier of the workflow managing these fields.")

  public String getManager() {
    return manager;
  }


  public void setManager(String manager) {
    this.manager = manager;
  }


  public V1alpha2DevWorkspaceTemplateMetadataManagedFields operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public V1alpha2DevWorkspaceTemplateMetadataManagedFields time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Time is timestamp of when these fields were set. It should always be empty if Operation is &#39;Apply&#39;
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceTemplateMetadataManagedFields v1alpha2DevWorkspaceTemplateMetadataManagedFields = (V1alpha2DevWorkspaceTemplateMetadataManagedFields) o;
    return Objects.equals(this.apiVersion, v1alpha2DevWorkspaceTemplateMetadataManagedFields.apiVersion) &&
        Objects.equals(this.fieldsType, v1alpha2DevWorkspaceTemplateMetadataManagedFields.fieldsType) &&
        Objects.equals(this.fieldsV1, v1alpha2DevWorkspaceTemplateMetadataManagedFields.fieldsV1) &&
        Objects.equals(this.manager, v1alpha2DevWorkspaceTemplateMetadataManagedFields.manager) &&
        Objects.equals(this.operation, v1alpha2DevWorkspaceTemplateMetadataManagedFields.operation) &&
        Objects.equals(this.time, v1alpha2DevWorkspaceTemplateMetadataManagedFields.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceTemplateMetadataManagedFields {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

