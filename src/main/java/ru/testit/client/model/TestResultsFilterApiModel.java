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
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.FailureCategoryModel;
import ru.testit.client.model.Int64RangeSelectorModel;
import ru.testit.client.model.TestResultOutcome;

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
 * TestResultsFilterApiModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestResultsFilterApiModel {
  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private List<UUID> configurationIds;

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private List<TestResultOutcome> outcomes;

  public static final String SERIALIZED_NAME_STATUS_CODES = "statusCodes";
  @SerializedName(SERIALIZED_NAME_STATUS_CODES)
  private List<String> statusCodes;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORIES = "failureCategories";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORIES)
  private List<FailureCategoryModel> failureCategories;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public static final String SERIALIZED_NAME_AUTO_TEST_GLOBAL_IDS = "autoTestGlobalIds";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_GLOBAL_IDS)
  private List<Long> autoTestGlobalIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateTimeRangeSelectorModel createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private DateTimeRangeSelectorModel modifiedDate;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private DateTimeRangeSelectorModel startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private DateTimeRangeSelectorModel completedOn;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Int64RangeSelectorModel duration;

  public static final String SERIALIZED_NAME_RESULT_REASONS = "resultReasons";
  @SerializedName(SERIALIZED_NAME_RESULT_REASONS)
  private List<String> resultReasons;

  public static final String SERIALIZED_NAME_TEST_RUN_IDS = "testRunIds";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_IDS)
  private List<UUID> testRunIds;

  public TestResultsFilterApiModel() {
  }

  public TestResultsFilterApiModel configurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
    return this;
  }

  public TestResultsFilterApiModel addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new ArrayList<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

  /**
   * Specifies a test result configuration IDs to search for
   * @return configurationIds
   */
  @javax.annotation.Nullable
  public List<UUID> getConfigurationIds() {
    return configurationIds;
  }

  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  @Deprecated
  public TestResultsFilterApiModel outcomes(List<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
    return this;
  }

  public TestResultsFilterApiModel addOutcomesItem(TestResultOutcome outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Specifies a test result outcomes to search for
   * @return outcomes
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public List<TestResultOutcome> getOutcomes() {
    return outcomes;
  }

  @Deprecated
  public void setOutcomes(List<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  public TestResultsFilterApiModel statusCodes(List<String> statusCodes) {
    this.statusCodes = statusCodes;
    return this;
  }

  public TestResultsFilterApiModel addStatusCodesItem(String statusCodesItem) {
    if (this.statusCodes == null) {
      this.statusCodes = new ArrayList<>();
    }
    this.statusCodes.add(statusCodesItem);
    return this;
  }

  /**
   * Specifies a test result status codes to search for
   * @return statusCodes
   */
  @javax.annotation.Nullable
  public List<String> getStatusCodes() {
    return statusCodes;
  }

  public void setStatusCodes(List<String> statusCodes) {
    this.statusCodes = statusCodes;
  }


  public TestResultsFilterApiModel failureCategories(List<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
    return this;
  }

  public TestResultsFilterApiModel addFailureCategoriesItem(FailureCategoryModel failureCategoriesItem) {
    if (this.failureCategories == null) {
      this.failureCategories = new ArrayList<>();
    }
    this.failureCategories.add(failureCategoriesItem);
    return this;
  }

  /**
   * Specifies a test result failure categories to search for
   * @return failureCategories
   */
  @javax.annotation.Nullable
  public List<FailureCategoryModel> getFailureCategories() {
    return failureCategories;
  }

  public void setFailureCategories(List<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
  }


  public TestResultsFilterApiModel namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Specifies a test result namespace to search for
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public TestResultsFilterApiModel className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Specifies a test result class name to search for
   * @return className
   */
  @javax.annotation.Nullable
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  public TestResultsFilterApiModel autoTestGlobalIds(List<Long> autoTestGlobalIds) {
    this.autoTestGlobalIds = autoTestGlobalIds;
    return this;
  }

  public TestResultsFilterApiModel addAutoTestGlobalIdsItem(Long autoTestGlobalIdsItem) {
    if (this.autoTestGlobalIds == null) {
      this.autoTestGlobalIds = new ArrayList<>();
    }
    this.autoTestGlobalIds.add(autoTestGlobalIdsItem);
    return this;
  }

  /**
   * Specifies an autotest global IDs to search results for
   * @return autoTestGlobalIds
   */
  @javax.annotation.Nullable
  public List<Long> getAutoTestGlobalIds() {
    return autoTestGlobalIds;
  }

  public void setAutoTestGlobalIds(List<Long> autoTestGlobalIds) {
    this.autoTestGlobalIds = autoTestGlobalIds;
  }


  public TestResultsFilterApiModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies an autotest name to search results for
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestResultsFilterApiModel createdDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Specifies a test result creation date and time range to search for
   * @return createdDate
   */
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  public TestResultsFilterApiModel modifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Specifies a test result modified date and time range to search for
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestResultsFilterApiModel startedOn(DateTimeRangeSelectorModel startedOn) {
    this.startedOn = startedOn;
    return this;
  }

  /**
   * Specifies a test result started on date and time range to search for
   * @return startedOn
   */
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(DateTimeRangeSelectorModel startedOn) {
    this.startedOn = startedOn;
  }


  public TestResultsFilterApiModel completedOn(DateTimeRangeSelectorModel completedOn) {
    this.completedOn = completedOn;
    return this;
  }

  /**
   * Specifies a test result completed on date and time range to search for
   * @return completedOn
   */
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(DateTimeRangeSelectorModel completedOn) {
    this.completedOn = completedOn;
  }


  public TestResultsFilterApiModel duration(Int64RangeSelectorModel duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Specifies a test result duration range to search for
   * @return duration
   */
  @javax.annotation.Nullable
  public Int64RangeSelectorModel getDuration() {
    return duration;
  }

  public void setDuration(Int64RangeSelectorModel duration) {
    this.duration = duration;
  }


  public TestResultsFilterApiModel resultReasons(List<String> resultReasons) {
    this.resultReasons = resultReasons;
    return this;
  }

  public TestResultsFilterApiModel addResultReasonsItem(String resultReasonsItem) {
    if (this.resultReasons == null) {
      this.resultReasons = new ArrayList<>();
    }
    this.resultReasons.add(resultReasonsItem);
    return this;
  }

  /**
   * Specifies result reasons for searching test results
   * @return resultReasons
   */
  @javax.annotation.Nullable
  public List<String> getResultReasons() {
    return resultReasons;
  }

  public void setResultReasons(List<String> resultReasons) {
    this.resultReasons = resultReasons;
  }


  public TestResultsFilterApiModel testRunIds(List<UUID> testRunIds) {
    this.testRunIds = testRunIds;
    return this;
  }

  public TestResultsFilterApiModel addTestRunIdsItem(UUID testRunIdsItem) {
    if (this.testRunIds == null) {
      this.testRunIds = new ArrayList<>();
    }
    this.testRunIds.add(testRunIdsItem);
    return this;
  }

  /**
   * Specifies a test result test run IDs to search for
   * @return testRunIds
   */
  @javax.annotation.Nullable
  public List<UUID> getTestRunIds() {
    return testRunIds;
  }

  public void setTestRunIds(List<UUID> testRunIds) {
    this.testRunIds = testRunIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsFilterApiModel testResultsFilterApiModel = (TestResultsFilterApiModel) o;
    return Objects.equals(this.configurationIds, testResultsFilterApiModel.configurationIds) &&
        Objects.equals(this.outcomes, testResultsFilterApiModel.outcomes) &&
        Objects.equals(this.statusCodes, testResultsFilterApiModel.statusCodes) &&
        Objects.equals(this.failureCategories, testResultsFilterApiModel.failureCategories) &&
        Objects.equals(this.namespace, testResultsFilterApiModel.namespace) &&
        Objects.equals(this.className, testResultsFilterApiModel.className) &&
        Objects.equals(this.autoTestGlobalIds, testResultsFilterApiModel.autoTestGlobalIds) &&
        Objects.equals(this.name, testResultsFilterApiModel.name) &&
        Objects.equals(this.createdDate, testResultsFilterApiModel.createdDate) &&
        Objects.equals(this.modifiedDate, testResultsFilterApiModel.modifiedDate) &&
        Objects.equals(this.startedOn, testResultsFilterApiModel.startedOn) &&
        Objects.equals(this.completedOn, testResultsFilterApiModel.completedOn) &&
        Objects.equals(this.duration, testResultsFilterApiModel.duration) &&
        Objects.equals(this.resultReasons, testResultsFilterApiModel.resultReasons) &&
        Objects.equals(this.testRunIds, testResultsFilterApiModel.testRunIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIds, outcomes, statusCodes, failureCategories, namespace, className, autoTestGlobalIds, name, createdDate, modifiedDate, startedOn, completedOn, duration, resultReasons, testRunIds);
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
    sb.append("class TestResultsFilterApiModel {\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
    sb.append("    failureCategories: ").append(toIndentedString(failureCategories)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    autoTestGlobalIds: ").append(toIndentedString(autoTestGlobalIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    resultReasons: ").append(toIndentedString(resultReasons)).append("\n");
    sb.append("    testRunIds: ").append(toIndentedString(testRunIds)).append("\n");
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
    openapiFields.add("configurationIds");
    openapiFields.add("outcomes");
    openapiFields.add("statusCodes");
    openapiFields.add("failureCategories");
    openapiFields.add("namespace");
    openapiFields.add("className");
    openapiFields.add("autoTestGlobalIds");
    openapiFields.add("name");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("duration");
    openapiFields.add("resultReasons");
    openapiFields.add("testRunIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestResultsFilterApiModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResultsFilterApiModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultsFilterApiModel is not found in the empty JSON string", TestResultsFilterApiModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResultsFilterApiModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultsFilterApiModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonNull() && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outcomes") != null && !jsonObj.get("outcomes").isJsonNull() && !jsonObj.get("outcomes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcomes` to be an array in the JSON string but got `%s`", jsonObj.get("outcomes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statusCodes") != null && !jsonObj.get("statusCodes").isJsonNull() && !jsonObj.get("statusCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCodes` to be an array in the JSON string but got `%s`", jsonObj.get("statusCodes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureCategories") != null && !jsonObj.get("failureCategories").isJsonNull() && !jsonObj.get("failureCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureCategories` to be an array in the JSON string but got `%s`", jsonObj.get("failureCategories").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("className") != null && !jsonObj.get("className").isJsonNull()) && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("autoTestGlobalIds") != null && !jsonObj.get("autoTestGlobalIds").isJsonNull() && !jsonObj.get("autoTestGlobalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoTestGlobalIds` to be an array in the JSON string but got `%s`", jsonObj.get("autoTestGlobalIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonElement(jsonObj.get("createdDate"));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonElement(jsonObj.get("modifiedDate"));
      }
      // validate the optional field `startedOn`
      if (jsonObj.get("startedOn") != null && !jsonObj.get("startedOn").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonElement(jsonObj.get("startedOn"));
      }
      // validate the optional field `completedOn`
      if (jsonObj.get("completedOn") != null && !jsonObj.get("completedOn").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonElement(jsonObj.get("completedOn"));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        Int64RangeSelectorModel.validateJsonElement(jsonObj.get("duration"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resultReasons") != null && !jsonObj.get("resultReasons").isJsonNull() && !jsonObj.get("resultReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultReasons` to be an array in the JSON string but got `%s`", jsonObj.get("resultReasons").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testRunIds") != null && !jsonObj.get("testRunIds").isJsonNull() && !jsonObj.get("testRunIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunIds` to be an array in the JSON string but got `%s`", jsonObj.get("testRunIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultsFilterApiModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultsFilterApiModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultsFilterApiModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultsFilterApiModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultsFilterApiModel>() {
           @Override
           public void write(JsonWriter out, TestResultsFilterApiModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultsFilterApiModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestResultsFilterApiModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestResultsFilterApiModel
   * @throws IOException if the JSON string is invalid with respect to TestResultsFilterApiModel
   */
  public static TestResultsFilterApiModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultsFilterApiModel.class);
  }

  /**
   * Convert an instance of TestResultsFilterApiModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

