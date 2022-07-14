/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ru.testit.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ConfigurationPutModel
 */
@JsonPropertyOrder({
  ConfigurationPutModel.JSON_PROPERTY_ID,
  ConfigurationPutModel.JSON_PROPERTY_DESCRIPTION,
  ConfigurationPutModel.JSON_PROPERTY_IS_ACTIVE,
  ConfigurationPutModel.JSON_PROPERTY_CAPABILITIES,
  ConfigurationPutModel.JSON_PROPERTY_PROJECT_ID,
  ConfigurationPutModel.JSON_PROPERTY_IS_DEFAULT,
  ConfigurationPutModel.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationPutModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Boolean isActive;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private Map<String, String> capabilities = new HashMap<>();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ConfigurationPutModel() { 
  }

  public ConfigurationPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public ConfigurationPutModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Default configuration", value = "")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public ConfigurationPutModel isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ConfigurationPutModel capabilities(Map<String, String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public ConfigurationPutModel putCapabilitiesItem(String key, String capabilitiesItem) {
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getCapabilities() {
    return capabilities;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapabilities(Map<String, String> capabilities) {
    this.capabilities = capabilities;
  }


  public ConfigurationPutModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link configuration with project
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This property is used to link configuration with project")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public ConfigurationPutModel isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public ConfigurationPutModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Default", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this ConfigurationPutModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationPutModel configurationPutModel = (ConfigurationPutModel) o;
    return Objects.equals(this.id, configurationPutModel.id) &&
        equalsNullable(this.description, configurationPutModel.description) &&
        Objects.equals(this.isActive, configurationPutModel.isActive) &&
        Objects.equals(this.capabilities, configurationPutModel.capabilities) &&
        Objects.equals(this.projectId, configurationPutModel.projectId) &&
        Objects.equals(this.isDefault, configurationPutModel.isDefault) &&
        Objects.equals(this.name, configurationPutModel.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(description), isActive, capabilities, projectId, isDefault, name);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationPutModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

