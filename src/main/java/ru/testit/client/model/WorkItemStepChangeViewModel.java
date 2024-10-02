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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.WorkItemStepChangeViewModelWorkItem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * WorkItemStepChangeViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemStepChangeViewModel {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_EXPECTED = "expected";
  @SerializedName(SERIALIZED_NAME_EXPECTED)
  private String expected;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_TEST_DATA = "testData";
  @SerializedName(SERIALIZED_NAME_TEST_DATA)
  private String testData;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_WORK_ITEM_ID = "workItemId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_ID)
  private UUID workItemId;

  public static final String SERIALIZED_NAME_WORK_ITEM = "workItem";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM)
  private WorkItemStepChangeViewModelWorkItem workItem;

  public WorkItemStepChangeViewModel() {
  }

  public WorkItemStepChangeViewModel action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public WorkItemStepChangeViewModel expected(String expected) {
    
    this.expected = expected;
    return this;
  }

   /**
   * Get expected
   * @return expected
  **/
  @javax.annotation.Nonnull
  public String getExpected() {
    return expected;
  }


  public void setExpected(String expected) {
    this.expected = expected;
  }


  public WorkItemStepChangeViewModel comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nonnull
  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public WorkItemStepChangeViewModel testData(String testData) {
    
    this.testData = testData;
    return this;
  }

   /**
   * Get testData
   * @return testData
  **/
  @javax.annotation.Nonnull
  public String getTestData() {
    return testData;
  }


  public void setTestData(String testData) {
    this.testData = testData;
  }


  public WorkItemStepChangeViewModel index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nonnull
  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public WorkItemStepChangeViewModel workItemId(UUID workItemId) {
    
    this.workItemId = workItemId;
    return this;
  }

   /**
   * Get workItemId
   * @return workItemId
  **/
  @javax.annotation.Nullable
  public UUID getWorkItemId() {
    return workItemId;
  }


  public void setWorkItemId(UUID workItemId) {
    this.workItemId = workItemId;
  }


  public WorkItemStepChangeViewModel workItem(WorkItemStepChangeViewModelWorkItem workItem) {
    
    this.workItem = workItem;
    return this;
  }

   /**
   * Get workItem
   * @return workItem
  **/
  @javax.annotation.Nonnull
  public WorkItemStepChangeViewModelWorkItem getWorkItem() {
    return workItem;
  }


  public void setWorkItem(WorkItemStepChangeViewModelWorkItem workItem) {
    this.workItem = workItem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemStepChangeViewModel workItemStepChangeViewModel = (WorkItemStepChangeViewModel) o;
    return Objects.equals(this.action, workItemStepChangeViewModel.action) &&
        Objects.equals(this.expected, workItemStepChangeViewModel.expected) &&
        Objects.equals(this.comments, workItemStepChangeViewModel.comments) &&
        Objects.equals(this.testData, workItemStepChangeViewModel.testData) &&
        Objects.equals(this.index, workItemStepChangeViewModel.index) &&
        Objects.equals(this.workItemId, workItemStepChangeViewModel.workItemId) &&
        Objects.equals(this.workItem, workItemStepChangeViewModel.workItem);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, expected, comments, testData, index, workItemId, workItem);
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
    sb.append("class WorkItemStepChangeViewModel {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    testData: ").append(toIndentedString(testData)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
    sb.append("    workItem: ").append(toIndentedString(workItem)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("action");
    openapiFields.add("expected");
    openapiFields.add("comments");
    openapiFields.add("testData");
    openapiFields.add("index");
    openapiFields.add("workItemId");
    openapiFields.add("workItem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("expected");
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("testData");
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("workItem");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemStepChangeViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemStepChangeViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemStepChangeViewModel is not found in the empty JSON string", WorkItemStepChangeViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemStepChangeViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemStepChangeViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemStepChangeViewModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (!jsonObj.get("expected").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected").toString()));
      }
      if (!jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if (!jsonObj.get("testData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testData").toString()));
      }
      if ((jsonObj.get("workItemId") != null && !jsonObj.get("workItemId").isJsonNull()) && !jsonObj.get("workItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemId").toString()));
      }
      // validate the required field `workItem`
      WorkItemStepChangeViewModelWorkItem.validateJsonObject(jsonObj.getAsJsonObject("workItem"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemStepChangeViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemStepChangeViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemStepChangeViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemStepChangeViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemStepChangeViewModel>() {
           @Override
           public void write(JsonWriter out, WorkItemStepChangeViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemStepChangeViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemStepChangeViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemStepChangeViewModel
  * @throws IOException if the JSON string is invalid with respect to WorkItemStepChangeViewModel
  */
  public static WorkItemStepChangeViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemStepChangeViewModel.class);
  }

 /**
  * Convert an instance of WorkItemStepChangeViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

