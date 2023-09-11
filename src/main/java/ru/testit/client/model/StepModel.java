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
import ru.testit.client.model.SectionSharedStep;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * StepModel
 */
@JsonPropertyOrder({
  StepModel.JSON_PROPERTY_WORK_ITEM,
  StepModel.JSON_PROPERTY_ID,
  StepModel.JSON_PROPERTY_ACTION,
  StepModel.JSON_PROPERTY_EXPECTED,
  StepModel.JSON_PROPERTY_TEST_DATA,
  StepModel.JSON_PROPERTY_COMMENTS,
  StepModel.JSON_PROPERTY_WORK_ITEM_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StepModel {
  public static final String JSON_PROPERTY_WORK_ITEM = "workItem";
  private JsonNullable<SectionSharedStep> workItem = JsonNullable.<SectionSharedStep>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ACTION = "action";
  private JsonNullable<String> action = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPECTED = "expected";
  private JsonNullable<String> expected = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TEST_DATA = "testData";
  private JsonNullable<String> testData = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private JsonNullable<String> comments = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_ID = "workItemId";
  private JsonNullable<UUID> workItemId = JsonNullable.<UUID>undefined();

  public StepModel() { 
  }

  public StepModel workItem(SectionSharedStep workItem) {
    this.workItem = JsonNullable.<SectionSharedStep>of(workItem);
    return this;
  }

   /**
   * Get workItem
   * @return workItem
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public SectionSharedStep getWorkItem() {
        return workItem.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SectionSharedStep> getWorkItem_JsonNullable() {
    return workItem;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM)
  public void setWorkItem_JsonNullable(JsonNullable<SectionSharedStep> workItem) {
    this.workItem = workItem;
  }

  public void setWorkItem(SectionSharedStep workItem) {
    this.workItem = JsonNullable.<SectionSharedStep>of(workItem);
  }


  public StepModel id(UUID id) {
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


  public StepModel action(String action) {
    this.action = JsonNullable.<String>of(action);
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getAction() {
        return action.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAction_JsonNullable() {
    return action;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTION)
  public void setAction_JsonNullable(JsonNullable<String> action) {
    this.action = action;
  }

  public void setAction(String action) {
    this.action = JsonNullable.<String>of(action);
  }


  public StepModel expected(String expected) {
    this.expected = JsonNullable.<String>of(expected);
    return this;
  }

   /**
   * Get expected
   * @return expected
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getExpected() {
        return expected.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExpected_JsonNullable() {
    return expected;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPECTED)
  public void setExpected_JsonNullable(JsonNullable<String> expected) {
    this.expected = expected;
  }

  public void setExpected(String expected) {
    this.expected = JsonNullable.<String>of(expected);
  }


  public StepModel testData(String testData) {
    this.testData = JsonNullable.<String>of(testData);
    return this;
  }

   /**
   * Get testData
   * @return testData
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getTestData() {
        return testData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTestData_JsonNullable() {
    return testData;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_DATA)
  public void setTestData_JsonNullable(JsonNullable<String> testData) {
    this.testData = testData;
  }

  public void setTestData(String testData) {
    this.testData = JsonNullable.<String>of(testData);
  }


  public StepModel comments(String comments) {
    this.comments = JsonNullable.<String>of(comments);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getComments() {
        return comments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComments_JsonNullable() {
    return comments;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  public void setComments_JsonNullable(JsonNullable<String> comments) {
    this.comments = comments;
  }

  public void setComments(String comments) {
    this.comments = JsonNullable.<String>of(comments);
  }


  public StepModel workItemId(UUID workItemId) {
    this.workItemId = JsonNullable.<UUID>of(workItemId);
    return this;
  }

   /**
   * Get workItemId
   * @return workItemId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getWorkItemId() {
        return workItemId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getWorkItemId_JsonNullable() {
    return workItemId;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_ID)
  public void setWorkItemId_JsonNullable(JsonNullable<UUID> workItemId) {
    this.workItemId = workItemId;
  }

  public void setWorkItemId(UUID workItemId) {
    this.workItemId = JsonNullable.<UUID>of(workItemId);
  }


  /**
   * Return true if this StepModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepModel stepModel = (StepModel) o;
    return equalsNullable(this.workItem, stepModel.workItem) &&
        Objects.equals(this.id, stepModel.id) &&
        equalsNullable(this.action, stepModel.action) &&
        equalsNullable(this.expected, stepModel.expected) &&
        equalsNullable(this.testData, stepModel.testData) &&
        equalsNullable(this.comments, stepModel.comments) &&
        equalsNullable(this.workItemId, stepModel.workItemId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(workItem), id, hashCodeNullable(action), hashCodeNullable(expected), hashCodeNullable(testData), hashCodeNullable(comments), hashCodeNullable(workItemId));
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
    sb.append("class StepModel {\n");
    sb.append("    workItem: ").append(toIndentedString(workItem)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    testData: ").append(toIndentedString(testData)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
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

