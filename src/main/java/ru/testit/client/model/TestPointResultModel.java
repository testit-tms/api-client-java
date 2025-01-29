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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.TestResultShortModel;

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
 * TestPointResultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class TestPointResultModel {
  public static final String SERIALIZED_NAME_TEST_POINT_ID = "testPointId";
  @SerializedName(SERIALIZED_NAME_TEST_POINT_ID)
  @javax.annotation.Nullable
  private UUID testPointId;

  public static final String SERIALIZED_NAME_AGGREGATED_OUTCOME = "aggregatedOutcome";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_OUTCOME)
  @javax.annotation.Nullable
  private String aggregatedOutcome;

  public static final String SERIALIZED_NAME_WORK_ITEM_GLOBAL_ID = "workItemGlobalId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_GLOBAL_ID)
  @javax.annotation.Nullable
  private Long workItemGlobalId;

  public static final String SERIALIZED_NAME_WORK_ITEM_NAME = "workItemName";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_NAME)
  @javax.annotation.Nullable
  private String workItemName;

  public static final String SERIALIZED_NAME_CONFIGURATION_NAME = "configurationName";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_NAME)
  @javax.annotation.Nullable
  private String configurationName;

  public static final String SERIALIZED_NAME_TEST_RESULTS = "testResults";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS)
  @javax.annotation.Nullable
  private List<TestResultShortModel> testResults;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private List<AttachmentModel> attachments;

  public TestPointResultModel() {
  }

  public TestPointResultModel testPointId(@javax.annotation.Nullable UUID testPointId) {
    this.testPointId = testPointId;
    return this;
  }

  /**
   * Get testPointId
   * @return testPointId
   */
  @javax.annotation.Nullable
  public UUID getTestPointId() {
    return testPointId;
  }

  public void setTestPointId(@javax.annotation.Nullable UUID testPointId) {
    this.testPointId = testPointId;
  }


  public TestPointResultModel aggregatedOutcome(@javax.annotation.Nullable String aggregatedOutcome) {
    this.aggregatedOutcome = aggregatedOutcome;
    return this;
  }

  /**
   * Get aggregatedOutcome
   * @return aggregatedOutcome
   */
  @javax.annotation.Nullable
  public String getAggregatedOutcome() {
    return aggregatedOutcome;
  }

  public void setAggregatedOutcome(@javax.annotation.Nullable String aggregatedOutcome) {
    this.aggregatedOutcome = aggregatedOutcome;
  }


  public TestPointResultModel workItemGlobalId(@javax.annotation.Nullable Long workItemGlobalId) {
    this.workItemGlobalId = workItemGlobalId;
    return this;
  }

  /**
   * Get workItemGlobalId
   * @return workItemGlobalId
   */
  @javax.annotation.Nullable
  public Long getWorkItemGlobalId() {
    return workItemGlobalId;
  }

  public void setWorkItemGlobalId(@javax.annotation.Nullable Long workItemGlobalId) {
    this.workItemGlobalId = workItemGlobalId;
  }


  public TestPointResultModel workItemName(@javax.annotation.Nullable String workItemName) {
    this.workItemName = workItemName;
    return this;
  }

  /**
   * Get workItemName
   * @return workItemName
   */
  @javax.annotation.Nullable
  public String getWorkItemName() {
    return workItemName;
  }

  public void setWorkItemName(@javax.annotation.Nullable String workItemName) {
    this.workItemName = workItemName;
  }


  public TestPointResultModel configurationName(@javax.annotation.Nullable String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

  /**
   * Get configurationName
   * @return configurationName
   */
  @javax.annotation.Nullable
  public String getConfigurationName() {
    return configurationName;
  }

  public void setConfigurationName(@javax.annotation.Nullable String configurationName) {
    this.configurationName = configurationName;
  }


  public TestPointResultModel testResults(@javax.annotation.Nullable List<TestResultShortModel> testResults) {
    this.testResults = testResults;
    return this;
  }

  public TestPointResultModel addTestResultsItem(TestResultShortModel testResultsItem) {
    if (this.testResults == null) {
      this.testResults = new ArrayList<>();
    }
    this.testResults.add(testResultsItem);
    return this;
  }

  /**
   * Get testResults
   * @return testResults
   */
  @javax.annotation.Nullable
  public List<TestResultShortModel> getTestResults() {
    return testResults;
  }

  public void setTestResults(@javax.annotation.Nullable List<TestResultShortModel> testResults) {
    this.testResults = testResults;
  }


  public TestPointResultModel attachments(@javax.annotation.Nullable List<AttachmentModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public TestPointResultModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<AttachmentModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable List<AttachmentModel> attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointResultModel testPointResultModel = (TestPointResultModel) o;
    return Objects.equals(this.testPointId, testPointResultModel.testPointId) &&
        Objects.equals(this.aggregatedOutcome, testPointResultModel.aggregatedOutcome) &&
        Objects.equals(this.workItemGlobalId, testPointResultModel.workItemGlobalId) &&
        Objects.equals(this.workItemName, testPointResultModel.workItemName) &&
        Objects.equals(this.configurationName, testPointResultModel.configurationName) &&
        Objects.equals(this.testResults, testPointResultModel.testResults) &&
        Objects.equals(this.attachments, testPointResultModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testPointId, aggregatedOutcome, workItemGlobalId, workItemName, configurationName, testResults, attachments);
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
    sb.append("class TestPointResultModel {\n");
    sb.append("    testPointId: ").append(toIndentedString(testPointId)).append("\n");
    sb.append("    aggregatedOutcome: ").append(toIndentedString(aggregatedOutcome)).append("\n");
    sb.append("    workItemGlobalId: ").append(toIndentedString(workItemGlobalId)).append("\n");
    sb.append("    workItemName: ").append(toIndentedString(workItemName)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("testPointId");
    openapiFields.add("aggregatedOutcome");
    openapiFields.add("workItemGlobalId");
    openapiFields.add("workItemName");
    openapiFields.add("configurationName");
    openapiFields.add("testResults");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestPointResultModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestPointResultModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPointResultModel is not found in the empty JSON string", TestPointResultModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestPointResultModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPointResultModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("testPointId") != null && !jsonObj.get("testPointId").isJsonNull()) && !jsonObj.get("testPointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPointId").toString()));
      }
      if ((jsonObj.get("aggregatedOutcome") != null && !jsonObj.get("aggregatedOutcome").isJsonNull()) && !jsonObj.get("aggregatedOutcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregatedOutcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregatedOutcome").toString()));
      }
      if ((jsonObj.get("workItemName") != null && !jsonObj.get("workItemName").isJsonNull()) && !jsonObj.get("workItemName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemName").toString()));
      }
      if ((jsonObj.get("configurationName") != null && !jsonObj.get("configurationName").isJsonNull()) && !jsonObj.get("configurationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationName").toString()));
      }
      if (jsonObj.get("testResults") != null && !jsonObj.get("testResults").isJsonNull()) {
        JsonArray jsonArraytestResults = jsonObj.getAsJsonArray("testResults");
        if (jsonArraytestResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("testResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `testResults` to be an array in the JSON string but got `%s`", jsonObj.get("testResults").toString()));
          }

          // validate the optional field `testResults` (array)
          for (int i = 0; i < jsonArraytestResults.size(); i++) {
            TestResultShortModel.validateJsonElement(jsonArraytestResults.get(i));
          };
        }
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentModel.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPointResultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPointResultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPointResultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPointResultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPointResultModel>() {
           @Override
           public void write(JsonWriter out, TestPointResultModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPointResultModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestPointResultModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestPointResultModel
   * @throws IOException if the JSON string is invalid with respect to TestPointResultModel
   */
  public static TestPointResultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPointResultModel.class);
  }

  /**
   * Convert an instance of TestPointResultModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

