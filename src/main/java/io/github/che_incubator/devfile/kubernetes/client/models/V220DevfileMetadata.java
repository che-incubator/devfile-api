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
import java.util.ArrayList;
import java.util.List;

/**
 * Optional metadata
 */
@ApiModel(description = "Optional metadata")

public class V220DevfileMetadata {
  /**
   * Architecture describes the architecture type
   */
  @JsonAdapter(ArchitecturesEnum.Adapter.class)
  public enum ArchitecturesEnum {
    AMD64("amd64"),
    
    ARM64("arm64"),
    
    PPC64LE("ppc64le"),
    
    S390X("s390x");

    private String value;

    ArchitecturesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArchitecturesEnum fromValue(String value) {
      for (ArchitecturesEnum b : ArchitecturesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArchitecturesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArchitecturesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArchitecturesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArchitecturesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARCHITECTURES = "architectures";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURES)
  private List<ArchitecturesEnum> architectures = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_GLOBAL_MEMORY_LIMIT = "globalMemoryLimit";
  @SerializedName(SERIALIZED_NAME_GLOBAL_MEMORY_LIMIT)
  private String globalMemoryLimit;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_TYPE = "projectType";
  @SerializedName(SERIALIZED_NAME_PROJECT_TYPE)
  private String projectType;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_SUPPORT_URL = "supportUrl";
  @SerializedName(SERIALIZED_NAME_SUPPORT_URL)
  private String supportUrl;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;


  public V220DevfileMetadata architectures(List<ArchitecturesEnum> architectures) {
    
    this.architectures = architectures;
    return this;
  }

  public V220DevfileMetadata addArchitecturesItem(ArchitecturesEnum architecturesItem) {
    if (this.architectures == null) {
      this.architectures = new ArrayList<>();
    }
    this.architectures.add(architecturesItem);
    return this;
  }

   /**
   * Optional list of processor architectures that the devfile supports, empty list suggests that the devfile can be used on any architecture
   * @return architectures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional list of processor architectures that the devfile supports, empty list suggests that the devfile can be used on any architecture")

  public List<ArchitecturesEnum> getArchitectures() {
    return architectures;
  }


  public void setArchitectures(List<ArchitecturesEnum> architectures) {
    this.architectures = architectures;
  }


  public V220DevfileMetadata attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Map of implementation-dependant free-form YAML attributes. Deprecated, use the top-level attributes field instead.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Map of implementation-dependant free-form YAML attributes. Deprecated, use the top-level attributes field instead.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public V220DevfileMetadata description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Optional devfile description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V220DevfileMetadata displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Optional devfile display name
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile display name")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public V220DevfileMetadata globalMemoryLimit(String globalMemoryLimit) {
    
    this.globalMemoryLimit = globalMemoryLimit;
    return this;
  }

   /**
   * Optional devfile global memory limit
   * @return globalMemoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile global memory limit")

  public String getGlobalMemoryLimit() {
    return globalMemoryLimit;
  }


  public void setGlobalMemoryLimit(String globalMemoryLimit) {
    this.globalMemoryLimit = globalMemoryLimit;
  }


  public V220DevfileMetadata icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Optional devfile icon, can be a URI or a relative path in the project
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile icon, can be a URI or a relative path in the project")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public V220DevfileMetadata language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Optional devfile language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile language")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public V220DevfileMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Optional devfile name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V220DevfileMetadata projectType(String projectType) {
    
    this.projectType = projectType;
    return this;
  }

   /**
   * Optional devfile project type
   * @return projectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile project type")

  public String getProjectType() {
    return projectType;
  }


  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }


  public V220DevfileMetadata provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Optional devfile provider information
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile provider information")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public V220DevfileMetadata supportUrl(String supportUrl) {
    
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * Optional link to a page that provides support information
   * @return supportUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional link to a page that provides support information")

  public String getSupportUrl() {
    return supportUrl;
  }


  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }


  public V220DevfileMetadata tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public V220DevfileMetadata addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Optional devfile tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public V220DevfileMetadata version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Optional semver-compatible version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional semver-compatible version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public V220DevfileMetadata website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Optional devfile website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional devfile website")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V220DevfileMetadata v220DevfileMetadata = (V220DevfileMetadata) o;
    return Objects.equals(this.architectures, v220DevfileMetadata.architectures) &&
        Objects.equals(this.attributes, v220DevfileMetadata.attributes) &&
        Objects.equals(this.description, v220DevfileMetadata.description) &&
        Objects.equals(this.displayName, v220DevfileMetadata.displayName) &&
        Objects.equals(this.globalMemoryLimit, v220DevfileMetadata.globalMemoryLimit) &&
        Objects.equals(this.icon, v220DevfileMetadata.icon) &&
        Objects.equals(this.language, v220DevfileMetadata.language) &&
        Objects.equals(this.name, v220DevfileMetadata.name) &&
        Objects.equals(this.projectType, v220DevfileMetadata.projectType) &&
        Objects.equals(this.provider, v220DevfileMetadata.provider) &&
        Objects.equals(this.supportUrl, v220DevfileMetadata.supportUrl) &&
        Objects.equals(this.tags, v220DevfileMetadata.tags) &&
        Objects.equals(this.version, v220DevfileMetadata.version) &&
        Objects.equals(this.website, v220DevfileMetadata.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architectures, attributes, description, displayName, globalMemoryLimit, icon, language, name, projectType, provider, supportUrl, tags, version, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V220DevfileMetadata {\n");
    sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    globalMemoryLimit: ").append(toIndentedString(globalMemoryLimit)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

