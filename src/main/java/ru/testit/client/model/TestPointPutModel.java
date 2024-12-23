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
import ru.testit.client.model.TestPointPutModelStatusModel;

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
 * TestPointPutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointPutModel {
  public static final String SERIALIZED_NAME_TESTER_ID = "testerId";
  @SerializedName(SERIALIZED_NAME_TESTER_ID)
  private UUID testerId;

  public static final String SERIALIZED_NAME_ITERATION_ID = "iterationId";
  @SerializedName(SERIALIZED_NAME_ITERATION_ID)
  private UUID iterationId;

  public static final String SERIALIZED_NAME_WORK_ITEM_ID = "workItemId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_ID)
  private UUID workItemId;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_TEST_SUITE_ID = "testSuiteId";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE_ID)
  private UUID testSuiteId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_MODEL = "statusModel";
  @SerializedName(SERIALIZED_NAME_STATUS_MODEL)
  private TestPointPutModelStatusModel statusModel;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT_ID = "lastTestResultId";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT_ID)
  private UUID lastTestResultId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public TestPointPutModel() {
  }

  public TestPointPutModel testerId(UUID testerId) {
    
    this.testerId = testerId;
    return this;
  }

   /**
   * Get testerId
   * @return testerId
  **/
  @javax.annotation.Nullable
  public UUID getTesterId() {
    return testerId;
  }


  public void setTesterId(UUID testerId) {
    this.testerId = testerId;
  }


  public TestPointPutModel iterationId(UUID iterationId) {
    
    this.iterationId = iterationId;
    return this;
  }

   /**
   * Get iterationId
   * @return iterationId
  **/
  @javax.annotation.Nonnull
  public UUID getIterationId() {
    return iterationId;
  }


  public void setIterationId(UUID iterationId) {
    this.iterationId = iterationId;
  }


  public TestPointPutModel workItemId(UUID workItemId) {
    
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


  public TestPointPutModel configurationId(UUID configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Get configurationId
   * @return configurationId
  **/
  @javax.annotation.Nullable
  public UUID getConfigurationId() {
    return configurationId;
  }


  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestPointPutModel testSuiteId(UUID testSuiteId) {
    
    this.testSuiteId = testSuiteId;
    return this;
  }

   /**
   * Get testSuiteId
   * @return testSuiteId
  **/
  @javax.annotation.Nonnull
  public UUID getTestSuiteId() {
    return testSuiteId;
  }


  public void setTestSuiteId(UUID testSuiteId) {
    this.testSuiteId = testSuiteId;
  }


  @Deprecated
  public TestPointPutModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  @Deprecated
  public void setStatus(String status) {
    this.status = status;
  }


  public TestPointPutModel statusModel(TestPointPutModelStatusModel statusModel) {
    
    this.statusModel = statusModel;
    return this;
  }

   /**
   * Get statusModel
   * @return statusModel
  **/
  @javax.annotation.Nonnull
  public TestPointPutModelStatusModel getStatusModel() {
    return statusModel;
  }


  public void setStatusModel(TestPointPutModelStatusModel statusModel) {
    this.statusModel = statusModel;
  }


  public TestPointPutModel lastTestResultId(UUID lastTestResultId) {
    
    this.lastTestResultId = lastTestResultId;
    return this;
  }

   /**
   * Get lastTestResultId
   * @return lastTestResultId
  **/
  @javax.annotation.Nullable
  public UUID getLastTestResultId() {
    return lastTestResultId;
  }


  public void setLastTestResultId(UUID lastTestResultId) {
    this.lastTestResultId = lastTestResultId;
  }


  public TestPointPutModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the entity
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestPointPutModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the entity is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointPutModel testPointPutModel = (TestPointPutModel) o;
    return Objects.equals(this.testerId, testPointPutModel.testerId) &&
        Objects.equals(this.iterationId, testPointPutModel.iterationId) &&
        Objects.equals(this.workItemId, testPointPutModel.workItemId) &&
        Objects.equals(this.configurationId, testPointPutModel.configurationId) &&
        Objects.equals(this.testSuiteId, testPointPutModel.testSuiteId) &&
        Objects.equals(this.status, testPointPutModel.status) &&
        Objects.equals(this.statusModel, testPointPutModel.statusModel) &&
        Objects.equals(this.lastTestResultId, testPointPutModel.lastTestResultId) &&
        Objects.equals(this.id, testPointPutModel.id) &&
        Objects.equals(this.isDeleted, testPointPutModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testerId, iterationId, workItemId, configurationId, testSuiteId, status, statusModel, lastTestResultId, id, isDeleted);
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
    sb.append("class TestPointPutModel {\n");
    sb.append("    testerId: ").append(toIndentedString(testerId)).append("\n");
    sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusModel: ").append(toIndentedString(statusModel)).append("\n");
    sb.append("    lastTestResultId: ").append(toIndentedString(lastTestResultId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("testerId");
    openapiFields.add("iterationId");
    openapiFields.add("workItemId");
    openapiFields.add("configurationId");
    openapiFields.add("testSuiteId");
    openapiFields.add("status");
    openapiFields.add("statusModel");
    openapiFields.add("lastTestResultId");
    openapiFields.add("id");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iterationId");
    openapiRequiredFields.add("testSuiteId");
    openapiRequiredFields.add("statusModel");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isDeleted");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPointPutModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPointPutModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPointPutModel is not found in the empty JSON string", TestPointPutModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPointPutModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPointPutModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestPointPutModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("testerId") != null && !jsonObj.get("testerId").isJsonNull()) && !jsonObj.get("testerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testerId").toString()));
      }
      if (!jsonObj.get("iterationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iterationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iterationId").toString()));
      }
      if ((jsonObj.get("workItemId") != null && !jsonObj.get("workItemId").isJsonNull()) && !jsonObj.get("workItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemId").toString()));
      }
      if ((jsonObj.get("configurationId") != null && !jsonObj.get("configurationId").isJsonNull()) && !jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if (!jsonObj.get("testSuiteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testSuiteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testSuiteId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `statusModel`
      TestPointPutModelStatusModel.validateJsonObject(jsonObj.getAsJsonObject("statusModel"));
      if ((jsonObj.get("lastTestResultId") != null && !jsonObj.get("lastTestResultId").isJsonNull()) && !jsonObj.get("lastTestResultId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTestResultId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTestResultId").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPointPutModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPointPutModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPointPutModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPointPutModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPointPutModel>() {
           @Override
           public void write(JsonWriter out, TestPointPutModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPointPutModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPointPutModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPointPutModel
  * @throws IOException if the JSON string is invalid with respect to TestPointPutModel
  */
  public static TestPointPutModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPointPutModel.class);
  }

 /**
  * Convert an instance of TestPointPutModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

