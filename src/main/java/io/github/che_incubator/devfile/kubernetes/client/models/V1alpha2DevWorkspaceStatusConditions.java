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
 * DevWorkspaceCondition contains details for the current condition of this devworkspace.
 */
@ApiModel(description = "DevWorkspaceCondition contains details for the current condition of this devworkspace.")

public class V1alpha2DevWorkspaceStatusConditions {
  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha2DevWorkspaceStatusConditions lastTransitionTime(OffsetDateTime lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")

  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1alpha2DevWorkspaceStatusConditions message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha2DevWorkspaceStatusConditions reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique, one-word, CamelCase reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1alpha2DevWorkspaceStatusConditions status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Phase is the status of the condition. Can be True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Phase is the status of the condition. Can be True, False, Unknown.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1alpha2DevWorkspaceStatusConditions type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is the type of the condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type is the type of the condition.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2DevWorkspaceStatusConditions v1alpha2DevWorkspaceStatusConditions = (V1alpha2DevWorkspaceStatusConditions) o;
    return Objects.equals(this.lastTransitionTime, v1alpha2DevWorkspaceStatusConditions.lastTransitionTime) &&
        Objects.equals(this.message, v1alpha2DevWorkspaceStatusConditions.message) &&
        Objects.equals(this.reason, v1alpha2DevWorkspaceStatusConditions.reason) &&
        Objects.equals(this.status, v1alpha2DevWorkspaceStatusConditions.status) &&
        Objects.equals(this.type, v1alpha2DevWorkspaceStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2DevWorkspaceStatusConditions {\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
