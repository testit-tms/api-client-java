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
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.TestRunState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestRunSearchQueryModel
 */
@JsonPropertyOrder({
  TestRunSearchQueryModel.JSON_PROPERTY_NAME,
  TestRunSearchQueryModel.JSON_PROPERTY_STATES,
  TestRunSearchQueryModel.JSON_PROPERTY_STARTED_DATE,
  TestRunSearchQueryModel.JSON_PROPERTY_COMPLETED_DATE,
  TestRunSearchQueryModel.JSON_PROPERTY_CREATED_BY_IDS,
  TestRunSearchQueryModel.JSON_PROPERTY_MODIFIED_BY_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunSearchQueryModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATES = "states";
  private JsonNullable<Set<TestRunState>> states = JsonNullable.<Set<TestRunState>>undefined();

  public static final String JSON_PROPERTY_STARTED_DATE = "startedDate";
  private JsonNullable<DateTimeRangeSelectorModel> startedDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_COMPLETED_DATE = "completedDate";
  private JsonNullable<DateTimeRangeSelectorModel> completedDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_IDS = "createdByIds";
  private JsonNullable<Set<UUID>> createdByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_MODIFIED_BY_IDS = "modifiedByIds";
  private JsonNullable<Set<UUID>> modifiedByIds = JsonNullable.<Set<UUID>>undefined();

  public TestRunSearchQueryModel() { 
  }

  public TestRunSearchQueryModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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


  public TestRunSearchQueryModel states(Set<TestRunState> states) {
    this.states = JsonNullable.<Set<TestRunState>>of(states);
    return this;
  }

  public TestRunSearchQueryModel addStatesItem(TestRunState statesItem) {
    if (this.states == null || !this.states.isPresent()) {
      this.states = JsonNullable.<Set<TestRunState>>of(new LinkedHashSet<>());
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

  public Set<TestRunState> getStates() {
        return states.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<TestRunState>> getStates_JsonNullable() {
    return states;
  }
  
  @JsonProperty(JSON_PROPERTY_STATES)
  public void setStates_JsonNullable(JsonNullable<Set<TestRunState>> states) {
    this.states = states;
  }

  public void setStates(Set<TestRunState> states) {
    this.states = JsonNullable.<Set<TestRunState>>of(states);
  }


  public TestRunSearchQueryModel startedDate(DateTimeRangeSelectorModel startedDate) {
    this.startedDate = JsonNullable.<DateTimeRangeSelectorModel>of(startedDate);
    return this;
  }

   /**
   * Get startedDate
   * @return startedDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getStartedDate() {
        return startedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getStartedDate_JsonNullable() {
    return startedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  public void setStartedDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> startedDate) {
    this.startedDate = startedDate;
  }

  public void setStartedDate(DateTimeRangeSelectorModel startedDate) {
    this.startedDate = JsonNullable.<DateTimeRangeSelectorModel>of(startedDate);
  }


  public TestRunSearchQueryModel completedDate(DateTimeRangeSelectorModel completedDate) {
    this.completedDate = JsonNullable.<DateTimeRangeSelectorModel>of(completedDate);
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getCompletedDate() {
        return completedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getCompletedDate_JsonNullable() {
    return completedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_DATE)
  public void setCompletedDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> completedDate) {
    this.completedDate = completedDate;
  }

  public void setCompletedDate(DateTimeRangeSelectorModel completedDate) {
    this.completedDate = JsonNullable.<DateTimeRangeSelectorModel>of(completedDate);
  }


  public TestRunSearchQueryModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
    return this;
  }

  public TestRunSearchQueryModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null || !this.createdByIds.isPresent()) {
      this.createdByIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.createdByIds.get().add(createdByIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get createdByIds
   * @return createdByIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<UUID> getCreatedByIds() {
        return createdByIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getCreatedByIds_JsonNullable() {
    return createdByIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY_IDS)
  public void setCreatedByIds_JsonNullable(JsonNullable<Set<UUID>> createdByIds) {
    this.createdByIds = createdByIds;
  }

  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
  }


  public TestRunSearchQueryModel modifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = JsonNullable.<Set<UUID>>of(modifiedByIds);
    return this;
  }

  public TestRunSearchQueryModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null || !this.modifiedByIds.isPresent()) {
      this.modifiedByIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.modifiedByIds.get().add(modifiedByIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get modifiedByIds
   * @return modifiedByIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<UUID> getModifiedByIds() {
        return modifiedByIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getModifiedByIds_JsonNullable() {
    return modifiedByIds;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_IDS)
  public void setModifiedByIds_JsonNullable(JsonNullable<Set<UUID>> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }

  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = JsonNullable.<Set<UUID>>of(modifiedByIds);
  }


  /**
   * Return true if this TestRunSearchQueryModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunSearchQueryModel testRunSearchQueryModel = (TestRunSearchQueryModel) o;
    return equalsNullable(this.name, testRunSearchQueryModel.name) &&
        equalsNullable(this.states, testRunSearchQueryModel.states) &&
        equalsNullable(this.startedDate, testRunSearchQueryModel.startedDate) &&
        equalsNullable(this.completedDate, testRunSearchQueryModel.completedDate) &&
        equalsNullable(this.createdByIds, testRunSearchQueryModel.createdByIds) &&
        equalsNullable(this.modifiedByIds, testRunSearchQueryModel.modifiedByIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(states), hashCodeNullable(startedDate), hashCodeNullable(completedDate), hashCodeNullable(createdByIds), hashCodeNullable(modifiedByIds));
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
    sb.append("class TestRunSearchQueryModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
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

