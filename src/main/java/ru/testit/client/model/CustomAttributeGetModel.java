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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.CustomAttributeOptionModel;
import ru.testit.client.model.CustomAttributeTypesEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * CustomAttributeGetModel
 */
@JsonPropertyOrder({
  CustomAttributeGetModel.JSON_PROPERTY_ID,
  CustomAttributeGetModel.JSON_PROPERTY_OPTIONS,
  CustomAttributeGetModel.JSON_PROPERTY_TYPE,
  CustomAttributeGetModel.JSON_PROPERTY_IS_DELETED,
  CustomAttributeGetModel.JSON_PROPERTY_NAME,
  CustomAttributeGetModel.JSON_PROPERTY_IS_ENABLED,
  CustomAttributeGetModel.JSON_PROPERTY_IS_REQUIRED,
  CustomAttributeGetModel.JSON_PROPERTY_IS_GLOBAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributeGetModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private JsonNullable<List<CustomAttributeOptionModel>> options = JsonNullable.<List<CustomAttributeOptionModel>>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomAttributeTypesEnum type;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_IS_REQUIRED = "isRequired";
  private Boolean isRequired;

  public static final String JSON_PROPERTY_IS_GLOBAL = "isGlobal";
  private Boolean isGlobal;

  public CustomAttributeGetModel() { 
  }

  public CustomAttributeGetModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public CustomAttributeGetModel options(List<CustomAttributeOptionModel> options) {
    this.options = JsonNullable.<List<CustomAttributeOptionModel>>of(options);
    return this;
  }

  public CustomAttributeGetModel addOptionsItem(CustomAttributeOptionModel optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.<List<CustomAttributeOptionModel>>of(new ArrayList<>());
    }
    try {
      this.options.get().add(optionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<CustomAttributeOptionModel> getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CustomAttributeOptionModel>> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<List<CustomAttributeOptionModel>> options) {
    this.options = options;
  }

  public void setOptions(List<CustomAttributeOptionModel> options) {
    this.options = JsonNullable.<List<CustomAttributeOptionModel>>of(options);
  }


  public CustomAttributeGetModel type(CustomAttributeTypesEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomAttributeTypesEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(CustomAttributeTypesEnum type) {
    this.type = type;
  }


  public CustomAttributeGetModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public CustomAttributeGetModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public CustomAttributeGetModel isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public CustomAttributeGetModel isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRequired() {
    return isRequired;
  }


  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public CustomAttributeGetModel isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsGlobal() {
    return isGlobal;
  }


  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  /**
   * Return true if this CustomAttributeGetModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeGetModel customAttributeGetModel = (CustomAttributeGetModel) o;
    return Objects.equals(this.id, customAttributeGetModel.id) &&
        equalsNullable(this.options, customAttributeGetModel.options) &&
        Objects.equals(this.type, customAttributeGetModel.type) &&
        Objects.equals(this.isDeleted, customAttributeGetModel.isDeleted) &&
        equalsNullable(this.name, customAttributeGetModel.name) &&
        Objects.equals(this.isEnabled, customAttributeGetModel.isEnabled) &&
        Objects.equals(this.isRequired, customAttributeGetModel.isRequired) &&
        Objects.equals(this.isGlobal, customAttributeGetModel.isGlobal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(options), type, isDeleted, hashCodeNullable(name), isEnabled, isRequired, isGlobal);
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
    sb.append("class CustomAttributeGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
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
