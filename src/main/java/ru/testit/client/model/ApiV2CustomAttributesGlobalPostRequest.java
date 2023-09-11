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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.CustomAttributeOptionPostModel;
import ru.testit.client.model.CustomAttributeTypesEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ApiV2CustomAttributesGlobalPostRequest
 */
@JsonPropertyOrder({
  ApiV2CustomAttributesGlobalPostRequest.JSON_PROPERTY_NAME,
  ApiV2CustomAttributesGlobalPostRequest.JSON_PROPERTY_IS_ENABLED,
  ApiV2CustomAttributesGlobalPostRequest.JSON_PROPERTY_IS_REQUIRED,
  ApiV2CustomAttributesGlobalPostRequest.JSON_PROPERTY_OPTIONS,
  ApiV2CustomAttributesGlobalPostRequest.JSON_PROPERTY_TYPE
})
@JsonTypeName("_api_v2_customAttributes_global_post_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2CustomAttributesGlobalPostRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private JsonNullable<Boolean> isEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_REQUIRED = "isRequired";
  private JsonNullable<Boolean> isRequired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private JsonNullable<List<CustomAttributeOptionPostModel>> options = JsonNullable.<List<CustomAttributeOptionPostModel>>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomAttributeTypesEnum type;

  public ApiV2CustomAttributesGlobalPostRequest() { 
  }

  public ApiV2CustomAttributesGlobalPostRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of attribute
   * @return name
  **/
  @jakarta.annotation.Nonnull
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


  public ApiV2CustomAttributesGlobalPostRequest isEnabled(Boolean isEnabled) {
    this.isEnabled = JsonNullable.<Boolean>of(isEnabled);
    return this;
  }

   /**
   * Indicates whether the attribute is available
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getIsEnabled() {
        return isEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsEnabled_JsonNullable() {
    return isEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  public void setIsEnabled_JsonNullable(JsonNullable<Boolean> isEnabled) {
    this.isEnabled = isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = JsonNullable.<Boolean>of(isEnabled);
  }


  public ApiV2CustomAttributesGlobalPostRequest isRequired(Boolean isRequired) {
    this.isRequired = JsonNullable.<Boolean>of(isRequired);
    return this;
  }

   /**
   * Indicates whether the attribute value is mandatory to specify
   * @return isRequired
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getIsRequired() {
        return isRequired.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsRequired_JsonNullable() {
    return isRequired;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  public void setIsRequired_JsonNullable(JsonNullable<Boolean> isRequired) {
    this.isRequired = isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = JsonNullable.<Boolean>of(isRequired);
  }


  public ApiV2CustomAttributesGlobalPostRequest options(List<CustomAttributeOptionPostModel> options) {
    this.options = JsonNullable.<List<CustomAttributeOptionPostModel>>of(options);
    return this;
  }

  public ApiV2CustomAttributesGlobalPostRequest addOptionsItem(CustomAttributeOptionPostModel optionsItem) {
    if (this.options == null || !this.options.isPresent()) {
      this.options = JsonNullable.<List<CustomAttributeOptionPostModel>>of(new ArrayList<>());
    }
    try {
      this.options.get().add(optionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of attribute options  &lt;br /&gt;  Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only
   * @return options
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<CustomAttributeOptionPostModel> getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CustomAttributeOptionPostModel>> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<List<CustomAttributeOptionPostModel>> options) {
    this.options = options;
  }

  public void setOptions(List<CustomAttributeOptionPostModel> options) {
    this.options = JsonNullable.<List<CustomAttributeOptionPostModel>>of(options);
  }


  public ApiV2CustomAttributesGlobalPostRequest type(CustomAttributeTypesEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CustomAttributeTypesEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(CustomAttributeTypesEnum type) {
    this.type = type;
  }


  /**
   * Return true if this _api_v2_customAttributes_global_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2CustomAttributesGlobalPostRequest apiV2CustomAttributesGlobalPostRequest = (ApiV2CustomAttributesGlobalPostRequest) o;
    return Objects.equals(this.name, apiV2CustomAttributesGlobalPostRequest.name) &&
        equalsNullable(this.isEnabled, apiV2CustomAttributesGlobalPostRequest.isEnabled) &&
        equalsNullable(this.isRequired, apiV2CustomAttributesGlobalPostRequest.isRequired) &&
        equalsNullable(this.options, apiV2CustomAttributesGlobalPostRequest.options) &&
        Objects.equals(this.type, apiV2CustomAttributesGlobalPostRequest.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hashCodeNullable(isEnabled), hashCodeNullable(isRequired), hashCodeNullable(options), type);
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
    sb.append("class ApiV2CustomAttributesGlobalPostRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

