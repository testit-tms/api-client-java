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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ApiV2SearchGlobalSearchPostRequest
 */
@JsonPropertyOrder({
  ApiV2SearchGlobalSearchPostRequest.JSON_PROPERTY_QUERY,
  ApiV2SearchGlobalSearchPostRequest.JSON_PROPERTY_RESOURCE_TYPE,
  ApiV2SearchGlobalSearchPostRequest.JSON_PROPERTY_TAKE,
  ApiV2SearchGlobalSearchPostRequest.JSON_PROPERTY_SKIP
})
@JsonTypeName("_api_v2_search_globalSearch_post_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2SearchGlobalSearchPostRequest {
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private JsonNullable<String> resourceType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public ApiV2SearchGlobalSearchPostRequest() { 
  }

  public ApiV2SearchGlobalSearchPostRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuery(String query) {
    this.query = query;
  }


  public ApiV2SearchGlobalSearchPostRequest resourceType(String resourceType) {
    this.resourceType = JsonNullable.<String>of(resourceType);
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getResourceType() {
        return resourceType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getResourceType_JsonNullable() {
    return resourceType;
  }
  
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  public void setResourceType_JsonNullable(JsonNullable<String> resourceType) {
    this.resourceType = resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = JsonNullable.<String>of(resourceType);
  }


  public ApiV2SearchGlobalSearchPostRequest take(Integer take) {
    this.take = take;
    return this;
  }

   /**
   * Get take
   * @return take
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTake() {
    return take;
  }


  @JsonProperty(JSON_PROPERTY_TAKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTake(Integer take) {
    this.take = take;
  }


  public ApiV2SearchGlobalSearchPostRequest skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSkip() {
    return skip;
  }


  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  /**
   * Return true if this _api_v2_search_globalSearch_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2SearchGlobalSearchPostRequest apiV2SearchGlobalSearchPostRequest = (ApiV2SearchGlobalSearchPostRequest) o;
    return Objects.equals(this.query, apiV2SearchGlobalSearchPostRequest.query) &&
        equalsNullable(this.resourceType, apiV2SearchGlobalSearchPostRequest.resourceType) &&
        Objects.equals(this.take, apiV2SearchGlobalSearchPostRequest.take) &&
        Objects.equals(this.skip, apiV2SearchGlobalSearchPostRequest.skip);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, hashCodeNullable(resourceType), take, skip);
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
    sb.append("class ApiV2SearchGlobalSearchPostRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    take: ").append(toIndentedString(take)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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

