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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * TestPointShortModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointShortModel {
  public static final String SERIALIZED_NAME_TEST_SUITE_ID = "testSuiteId";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE_ID)
  private UUID testSuiteId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TESTER_ID = "testerId";
  @SerializedName(SERIALIZED_NAME_TESTER_ID)
  private UUID testerId;

  public static final String SERIALIZED_NAME_WORK_ITEM_ID = "workItemId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_ID)
  private UUID workItemId;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT_ID = "lastTestResultId";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT_ID)
  private UUID lastTestResultId;

  public static final String SERIALIZED_NAME_ITERATION_ID = "iterationId";
  @SerializedName(SERIALIZED_NAME_ITERATION_ID)
  private UUID iterationId;

  public TestPointShortModel() {
  }

  public TestPointShortModel testSuiteId(UUID testSuiteId) {
    
    this.testSuiteId = testSuiteId;
    return this;
  }

   /**
   * Get testSuiteId
   * @return testSuiteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getTestSuiteId() {
    return testSuiteId;
  }


  public void setTestSuiteId(UUID testSuiteId) {
    this.testSuiteId = testSuiteId;
  }


  public TestPointShortModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestPointShortModel testerId(UUID testerId) {
    
    this.testerId = testerId;
    return this;
  }

   /**
   * Get testerId
   * @return testerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getTesterId() {
    return testerId;
  }


  public void setTesterId(UUID testerId) {
    this.testerId = testerId;
  }


  public TestPointShortModel workItemId(UUID workItemId) {
    
    this.workItemId = workItemId;
    return this;
  }

   /**
   * Get workItemId
   * @return workItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getWorkItemId() {
    return workItemId;
  }


  public void setWorkItemId(UUID workItemId) {
    this.workItemId = workItemId;
  }


  public TestPointShortModel configurationId(UUID configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Get configurationId
   * @return configurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getConfigurationId() {
    return configurationId;
  }


  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestPointShortModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Applies one of these values: Blocked, NoResults, Failed, Passed
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NoResult", value = "Applies one of these values: Blocked, NoResults, Failed, Passed")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TestPointShortModel lastTestResultId(UUID lastTestResultId) {
    
    this.lastTestResultId = lastTestResultId;
    return this;
  }

   /**
   * Get lastTestResultId
   * @return lastTestResultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getLastTestResultId() {
    return lastTestResultId;
  }


  public void setLastTestResultId(UUID lastTestResultId) {
    this.lastTestResultId = lastTestResultId;
  }


  public TestPointShortModel iterationId(UUID iterationId) {
    
    this.iterationId = iterationId;
    return this;
  }

   /**
   * Get iterationId
   * @return iterationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getIterationId() {
    return iterationId;
  }


  public void setIterationId(UUID iterationId) {
    this.iterationId = iterationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointShortModel testPointShortModel = (TestPointShortModel) o;
    return Objects.equals(this.testSuiteId, testPointShortModel.testSuiteId) &&
        Objects.equals(this.id, testPointShortModel.id) &&
        Objects.equals(this.testerId, testPointShortModel.testerId) &&
        Objects.equals(this.workItemId, testPointShortModel.workItemId) &&
        Objects.equals(this.configurationId, testPointShortModel.configurationId) &&
        Objects.equals(this.status, testPointShortModel.status) &&
        Objects.equals(this.lastTestResultId, testPointShortModel.lastTestResultId) &&
        Objects.equals(this.iterationId, testPointShortModel.iterationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testSuiteId, id, testerId, workItemId, configurationId, status, lastTestResultId, iterationId);
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
    sb.append("class TestPointShortModel {\n");
    sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    testerId: ").append(toIndentedString(testerId)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastTestResultId: ").append(toIndentedString(lastTestResultId)).append("\n");
    sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
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
    openapiFields.add("testSuiteId");
    openapiFields.add("id");
    openapiFields.add("testerId");
    openapiFields.add("workItemId");
    openapiFields.add("configurationId");
    openapiFields.add("status");
    openapiFields.add("lastTestResultId");
    openapiFields.add("iterationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPointShortModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPointShortModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPointShortModel is not found in the empty JSON string", TestPointShortModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPointShortModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPointShortModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("testSuiteId") != null && !jsonObj.get("testSuiteId").isJsonNull()) && !jsonObj.get("testSuiteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testSuiteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testSuiteId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("testerId") != null && !jsonObj.get("testerId").isJsonNull()) && !jsonObj.get("testerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testerId").toString()));
      }
      if ((jsonObj.get("workItemId") != null && !jsonObj.get("workItemId").isJsonNull()) && !jsonObj.get("workItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemId").toString()));
      }
      if ((jsonObj.get("configurationId") != null && !jsonObj.get("configurationId").isJsonNull()) && !jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("lastTestResultId") != null && !jsonObj.get("lastTestResultId").isJsonNull()) && !jsonObj.get("lastTestResultId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTestResultId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTestResultId").toString()));
      }
      if ((jsonObj.get("iterationId") != null && !jsonObj.get("iterationId").isJsonNull()) && !jsonObj.get("iterationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iterationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iterationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPointShortModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPointShortModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPointShortModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPointShortModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPointShortModel>() {
           @Override
           public void write(JsonWriter out, TestPointShortModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPointShortModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPointShortModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPointShortModel
  * @throws IOException if the JSON string is invalid with respect to TestPointShortModel
  */
  public static TestPointShortModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPointShortModel.class);
  }

 /**
  * Convert an instance of TestPointShortModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

