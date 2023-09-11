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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ApiV2CustomAttributesTemplatesPostRequest
 */
@JsonPropertyOrder({
  ApiV2CustomAttributesTemplatesPostRequest.JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS,
  ApiV2CustomAttributesTemplatesPostRequest.JSON_PROPERTY_NAME
})
@JsonTypeName("_api_v2_customAttributes_templates_post_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2CustomAttributesTemplatesPostRequest {
  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS = "customAttributeIds";
  private JsonNullable<Set<UUID>> customAttributeIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ApiV2CustomAttributesTemplatesPostRequest() { 
  }

  public ApiV2CustomAttributesTemplatesPostRequest customAttributeIds(Set<UUID> customAttributeIds) {
    this.customAttributeIds = JsonNullable.<Set<UUID>>of(customAttributeIds);
    return this;
  }

  public ApiV2CustomAttributesTemplatesPostRequest addCustomAttributeIdsItem(UUID customAttributeIdsItem) {
    if (this.customAttributeIds == null || !this.customAttributeIds.isPresent()) {
      this.customAttributeIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.customAttributeIds.get().add(customAttributeIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of attribute IDs
   * @return customAttributeIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<UUID> getCustomAttributeIds() {
        return customAttributeIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getCustomAttributeIds_JsonNullable() {
    return customAttributeIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTE_IDS)
  public void setCustomAttributeIds_JsonNullable(JsonNullable<Set<UUID>> customAttributeIds) {
    this.customAttributeIds = customAttributeIds;
  }

  public void setCustomAttributeIds(Set<UUID> customAttributeIds) {
    this.customAttributeIds = JsonNullable.<Set<UUID>>of(customAttributeIds);
  }


  public ApiV2CustomAttributesTemplatesPostRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Custom attributes template name
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


  /**
   * Return true if this _api_v2_customAttributes_templates_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2CustomAttributesTemplatesPostRequest apiV2CustomAttributesTemplatesPostRequest = (ApiV2CustomAttributesTemplatesPostRequest) o;
    return equalsNullable(this.customAttributeIds, apiV2CustomAttributesTemplatesPostRequest.customAttributeIds) &&
        Objects.equals(this.name, apiV2CustomAttributesTemplatesPostRequest.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(customAttributeIds), name);
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
    sb.append("class ApiV2CustomAttributesTemplatesPostRequest {\n");
    sb.append("    customAttributeIds: ").append(toIndentedString(customAttributeIds)).append("\n");
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

