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
 * GlobalSearchRequest
 */
@JsonPropertyOrder({
  GlobalSearchRequest.JSON_PROPERTY_QUERY,
  GlobalSearchRequest.JSON_PROPERTY_RESOURCE_TYPE,
  GlobalSearchRequest.JSON_PROPERTY_TAKE,
  GlobalSearchRequest.JSON_PROPERTY_SKIP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GlobalSearchRequest {
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private JsonNullable<String> resourceType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAKE = "take";
  private Integer take;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public GlobalSearchRequest() { 
  }

  public GlobalSearchRequest query(String query) {
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


  public GlobalSearchRequest resourceType(String resourceType) {
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


  public GlobalSearchRequest take(Integer take) {
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


  public GlobalSearchRequest skip(Integer skip) {
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
   * Return true if this GlobalSearchRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalSearchRequest globalSearchRequest = (GlobalSearchRequest) o;
    return Objects.equals(this.query, globalSearchRequest.query) &&
        equalsNullable(this.resourceType, globalSearchRequest.resourceType) &&
        Objects.equals(this.take, globalSearchRequest.take) &&
        Objects.equals(this.skip, globalSearchRequest.skip);
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
    sb.append("class GlobalSearchRequest {\n");
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

