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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * StepPutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class StepPutModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_EXPECTED = "expected";
  @SerializedName(SERIALIZED_NAME_EXPECTED)
  private String expected;

  public static final String SERIALIZED_NAME_TEST_DATA = "testData";
  @SerializedName(SERIALIZED_NAME_TEST_DATA)
  private String testData;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_WORK_ITEM_ID = "workItemId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_ID)
  private UUID workItemId;

  public StepPutModel() {
  }

  public StepPutModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public StepPutModel action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public StepPutModel expected(String expected) {
    this.expected = expected;
    return this;
  }

  /**
   * Get expected
   * @return expected
   */
  @javax.annotation.Nullable
  public String getExpected() {
    return expected;
  }

  public void setExpected(String expected) {
    this.expected = expected;
  }


  public StepPutModel testData(String testData) {
    this.testData = testData;
    return this;
  }

  /**
   * Get testData
   * @return testData
   */
  @javax.annotation.Nullable
  public String getTestData() {
    return testData;
  }

  public void setTestData(String testData) {
    this.testData = testData;
  }


  public StepPutModel comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
   */
  @javax.annotation.Nullable
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  public StepPutModel workItemId(UUID workItemId) {
    this.workItemId = workItemId;
    return this;
  }

  /**
   * Get workItemId
   * @return workItemId
   */
  @javax.annotation.Nullable
  public UUID getWorkItemId() {
    return workItemId;
  }

  public void setWorkItemId(UUID workItemId) {
    this.workItemId = workItemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepPutModel stepPutModel = (StepPutModel) o;
    return Objects.equals(this.id, stepPutModel.id) &&
        Objects.equals(this.action, stepPutModel.action) &&
        Objects.equals(this.expected, stepPutModel.expected) &&
        Objects.equals(this.testData, stepPutModel.testData) &&
        Objects.equals(this.comments, stepPutModel.comments) &&
        Objects.equals(this.workItemId, stepPutModel.workItemId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, expected, testData, comments, workItemId);
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
    sb.append("class StepPutModel {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("action");
    openapiFields.add("expected");
    openapiFields.add("testData");
    openapiFields.add("comments");
    openapiFields.add("workItemId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StepPutModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StepPutModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StepPutModel is not found in the empty JSON string", StepPutModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StepPutModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StepPutModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StepPutModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("expected") != null && !jsonObj.get("expected").isJsonNull()) && !jsonObj.get("expected").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected").toString()));
      }
      if ((jsonObj.get("testData") != null && !jsonObj.get("testData").isJsonNull()) && !jsonObj.get("testData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testData").toString()));
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if ((jsonObj.get("workItemId") != null && !jsonObj.get("workItemId").isJsonNull()) && !jsonObj.get("workItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StepPutModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StepPutModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StepPutModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StepPutModel.class));

       return (TypeAdapter<T>) new TypeAdapter<StepPutModel>() {
           @Override
           public void write(JsonWriter out, StepPutModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StepPutModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StepPutModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StepPutModel
   * @throws IOException if the JSON string is invalid with respect to StepPutModel
   */
  public static StepPutModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StepPutModel.class);
  }

  /**
   * Convert an instance of StepPutModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

