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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ApiV2TestSuitesPutRequest
 */
@JsonPropertyOrder({
  ApiV2TestSuitesPutRequest.JSON_PROPERTY_ID,
  ApiV2TestSuitesPutRequest.JSON_PROPERTY_PARENT_ID,
  ApiV2TestSuitesPutRequest.JSON_PROPERTY_NAME,
  ApiV2TestSuitesPutRequest.JSON_PROPERTY_IS_DELETED,
  ApiV2TestSuitesPutRequest.JSON_PROPERTY_AUTO_REFRESH
})
@JsonTypeName("_api_v2_testSuites_put_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2TestSuitesPutRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private JsonNullable<UUID> parentId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_AUTO_REFRESH = "autoRefresh";
  private JsonNullable<Boolean> autoRefresh = JsonNullable.<Boolean>undefined();

  public ApiV2TestSuitesPutRequest() { 
  }

  public ApiV2TestSuitesPutRequest id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
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


  public ApiV2TestSuitesPutRequest parentId(UUID parentId) {
    this.parentId = JsonNullable.<UUID>of(parentId);
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getParentId() {
        return parentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getParentId_JsonNullable() {
    return parentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<UUID> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = JsonNullable.<UUID>of(parentId);
  }


  public ApiV2TestSuitesPutRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  public ApiV2TestSuitesPutRequest isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ApiV2TestSuitesPutRequest autoRefresh(Boolean autoRefresh) {
    this.autoRefresh = JsonNullable.<Boolean>of(autoRefresh);
    return this;
  }

   /**
   * Get autoRefresh
   * @return autoRefresh
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getAutoRefresh() {
        return autoRefresh.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_REFRESH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getAutoRefresh_JsonNullable() {
    return autoRefresh;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_REFRESH)
  public void setAutoRefresh_JsonNullable(JsonNullable<Boolean> autoRefresh) {
    this.autoRefresh = autoRefresh;
  }

  public void setAutoRefresh(Boolean autoRefresh) {
    this.autoRefresh = JsonNullable.<Boolean>of(autoRefresh);
  }


  /**
   * Return true if this _api_v2_testSuites_put_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2TestSuitesPutRequest apiV2TestSuitesPutRequest = (ApiV2TestSuitesPutRequest) o;
    return Objects.equals(this.id, apiV2TestSuitesPutRequest.id) &&
        equalsNullable(this.parentId, apiV2TestSuitesPutRequest.parentId) &&
        Objects.equals(this.name, apiV2TestSuitesPutRequest.name) &&
        Objects.equals(this.isDeleted, apiV2TestSuitesPutRequest.isDeleted) &&
        equalsNullable(this.autoRefresh, apiV2TestSuitesPutRequest.autoRefresh);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(parentId), name, isDeleted, hashCodeNullable(autoRefresh));
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
    sb.append("class ApiV2TestSuitesPutRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    autoRefresh: ").append(toIndentedString(autoRefresh)).append("\n");
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

