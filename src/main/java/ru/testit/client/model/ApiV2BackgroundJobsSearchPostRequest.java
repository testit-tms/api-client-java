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
import ru.testit.client.model.BackgroundJobState;
import ru.testit.client.model.BackgroundJobType;
import ru.testit.client.model.DateTimeRangeSelectorModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ApiV2BackgroundJobsSearchPostRequest
 */
@JsonPropertyOrder({
  ApiV2BackgroundJobsSearchPostRequest.JSON_PROPERTY_TYPES,
  ApiV2BackgroundJobsSearchPostRequest.JSON_PROPERTY_STATES,
  ApiV2BackgroundJobsSearchPostRequest.JSON_PROPERTY_IS_DELETED,
  ApiV2BackgroundJobsSearchPostRequest.JSON_PROPERTY_START_DATE,
  ApiV2BackgroundJobsSearchPostRequest.JSON_PROPERTY_END_DATE
})
@JsonTypeName("_api_v2_backgroundJobs_search_post_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2BackgroundJobsSearchPostRequest {
  public static final String JSON_PROPERTY_TYPES = "types";
  private JsonNullable<List<BackgroundJobType>> types = JsonNullable.<List<BackgroundJobType>>undefined();

  public static final String JSON_PROPERTY_STATES = "states";
  private JsonNullable<List<BackgroundJobState>> states = JsonNullable.<List<BackgroundJobState>>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private JsonNullable<Boolean> isDeleted = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private JsonNullable<DateTimeRangeSelectorModel> startDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private JsonNullable<DateTimeRangeSelectorModel> endDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public ApiV2BackgroundJobsSearchPostRequest() { 
  }

  public ApiV2BackgroundJobsSearchPostRequest types(List<BackgroundJobType> types) {
    this.types = JsonNullable.<List<BackgroundJobType>>of(types);
    return this;
  }

  public ApiV2BackgroundJobsSearchPostRequest addTypesItem(BackgroundJobType typesItem) {
    if (this.types == null || !this.types.isPresent()) {
      this.types = JsonNullable.<List<BackgroundJobType>>of(new ArrayList<>());
    }
    try {
      this.types.get().add(typesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<BackgroundJobType> getTypes() {
        return types.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<BackgroundJobType>> getTypes_JsonNullable() {
    return types;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPES)
  public void setTypes_JsonNullable(JsonNullable<List<BackgroundJobType>> types) {
    this.types = types;
  }

  public void setTypes(List<BackgroundJobType> types) {
    this.types = JsonNullable.<List<BackgroundJobType>>of(types);
  }


  public ApiV2BackgroundJobsSearchPostRequest states(List<BackgroundJobState> states) {
    this.states = JsonNullable.<List<BackgroundJobState>>of(states);
    return this;
  }

  public ApiV2BackgroundJobsSearchPostRequest addStatesItem(BackgroundJobState statesItem) {
    if (this.states == null || !this.states.isPresent()) {
      this.states = JsonNullable.<List<BackgroundJobState>>of(new ArrayList<>());
    }
    try {
      this.states.get().add(statesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get states
   * @return states
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<BackgroundJobState> getStates() {
        return states.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<BackgroundJobState>> getStates_JsonNullable() {
    return states;
  }
  
  @JsonProperty(JSON_PROPERTY_STATES)
  public void setStates_JsonNullable(JsonNullable<List<BackgroundJobState>> states) {
    this.states = states;
  }

  public void setStates(List<BackgroundJobState> states) {
    this.states = JsonNullable.<List<BackgroundJobState>>of(states);
  }


  public ApiV2BackgroundJobsSearchPostRequest isDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getIsDeleted() {
        return isDeleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsDeleted_JsonNullable() {
    return isDeleted;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  public void setIsDeleted_JsonNullable(JsonNullable<Boolean> isDeleted) {
    this.isDeleted = isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
  }


  public ApiV2BackgroundJobsSearchPostRequest startDate(DateTimeRangeSelectorModel startDate) {
    this.startDate = JsonNullable.<DateTimeRangeSelectorModel>of(startDate);
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(DateTimeRangeSelectorModel startDate) {
    this.startDate = JsonNullable.<DateTimeRangeSelectorModel>of(startDate);
  }


  public ApiV2BackgroundJobsSearchPostRequest endDate(DateTimeRangeSelectorModel endDate) {
    this.endDate = JsonNullable.<DateTimeRangeSelectorModel>of(endDate);
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(DateTimeRangeSelectorModel endDate) {
    this.endDate = JsonNullable.<DateTimeRangeSelectorModel>of(endDate);
  }


  /**
   * Return true if this _api_v2_backgroundJobs_search_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2BackgroundJobsSearchPostRequest apiV2BackgroundJobsSearchPostRequest = (ApiV2BackgroundJobsSearchPostRequest) o;
    return equalsNullable(this.types, apiV2BackgroundJobsSearchPostRequest.types) &&
        equalsNullable(this.states, apiV2BackgroundJobsSearchPostRequest.states) &&
        equalsNullable(this.isDeleted, apiV2BackgroundJobsSearchPostRequest.isDeleted) &&
        equalsNullable(this.startDate, apiV2BackgroundJobsSearchPostRequest.startDate) &&
        equalsNullable(this.endDate, apiV2BackgroundJobsSearchPostRequest.endDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(types), hashCodeNullable(states), hashCodeNullable(isDeleted), hashCodeNullable(startDate), hashCodeNullable(endDate));
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
    sb.append("class ApiV2BackgroundJobsSearchPostRequest {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

