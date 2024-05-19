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
import ru.testit.client.model.FailureCategoryModel;
import ru.testit.client.model.TestResultOutcome;
import ru.testit.client.model.TestResultsFilterModelCompletedOn;
import ru.testit.client.model.TestResultsFilterModelCreatedDate;
import ru.testit.client.model.TestResultsFilterModelDuration;
import ru.testit.client.model.TestResultsFilterModelModifiedDate;
import ru.testit.client.model.TestResultsFilterModelStartedOn;

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
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * TestResultsFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsFilterModel {
  public static final String SERIALIZED_NAME_TEST_RUN_IDS = "testRunIds";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_IDS)
  private List<UUID> testRunIds;

  public static final String SERIALIZED_NAME_AUTO_TEST_GLOBAL_IDS = "autoTestGlobalIds";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_GLOBAL_IDS)
  private List<Long> autoTestGlobalIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private TestResultsFilterModelCreatedDate createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private TestResultsFilterModelModifiedDate modifiedDate;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private TestResultsFilterModelStartedOn startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private TestResultsFilterModelCompletedOn completedOn;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private TestResultsFilterModelDuration duration;

  public static final String SERIALIZED_NAME_RESULT_REASONS = "resultReasons";
  @SerializedName(SERIALIZED_NAME_RESULT_REASONS)
  private List<String> resultReasons;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private List<UUID> configurationIds;

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private List<TestResultOutcome> outcomes;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORIES = "failureCategories";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORIES)
  private List<FailureCategoryModel> failureCategories;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public TestResultsFilterModel() {
  }

  public TestResultsFilterModel testRunIds(List<UUID> testRunIds) {
    this.testRunIds = testRunIds;
    return this;
  }

  public TestResultsFilterModel addTestRunIdsItem(UUID testRunIdsItem) {
    if (this.testRunIds == null) {
      this.testRunIds = new ArrayList<>();
    }
    this.testRunIds.add(testRunIdsItem);
    return this;
  }

   /**
   * Specifies a test result test run IDs to search for
   * @return testRunIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getTestRunIds() {
    return testRunIds;
  }

  public void setTestRunIds(List<UUID> testRunIds) {
    this.testRunIds = testRunIds;
  }


  public TestResultsFilterModel autoTestGlobalIds(List<Long> autoTestGlobalIds) {
    this.autoTestGlobalIds = autoTestGlobalIds;
    return this;
  }

  public TestResultsFilterModel addAutoTestGlobalIdsItem(Long autoTestGlobalIdsItem) {
    if (this.autoTestGlobalIds == null) {
      this.autoTestGlobalIds = new ArrayList<>();
    }
    this.autoTestGlobalIds.add(autoTestGlobalIdsItem);
    return this;
  }

   /**
   * Specifies an autotest global IDs to search results for
   * @return autoTestGlobalIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAutoTestGlobalIds() {
    return autoTestGlobalIds;
  }

  public void setAutoTestGlobalIds(List<Long> autoTestGlobalIds) {
    this.autoTestGlobalIds = autoTestGlobalIds;
  }


  public TestResultsFilterModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies an autotest name to search results for
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestResultsFilterModel createdDate(TestResultsFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public TestResultsFilterModelCreatedDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(TestResultsFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
  }


  public TestResultsFilterModel modifiedDate(TestResultsFilterModelModifiedDate modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public TestResultsFilterModelModifiedDate getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(TestResultsFilterModelModifiedDate modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestResultsFilterModel startedOn(TestResultsFilterModelStartedOn startedOn) {
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @javax.annotation.Nullable
  public TestResultsFilterModelStartedOn getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(TestResultsFilterModelStartedOn startedOn) {
    this.startedOn = startedOn;
  }


  public TestResultsFilterModel completedOn(TestResultsFilterModelCompletedOn completedOn) {
    this.completedOn = completedOn;
    return this;
  }

   /**
   * Get completedOn
   * @return completedOn
  **/
  @javax.annotation.Nullable
  public TestResultsFilterModelCompletedOn getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(TestResultsFilterModelCompletedOn completedOn) {
    this.completedOn = completedOn;
  }


  public TestResultsFilterModel duration(TestResultsFilterModelDuration duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  public TestResultsFilterModelDuration getDuration() {
    return duration;
  }

  public void setDuration(TestResultsFilterModelDuration duration) {
    this.duration = duration;
  }


  public TestResultsFilterModel resultReasons(List<String> resultReasons) {
    this.resultReasons = resultReasons;
    return this;
  }

  public TestResultsFilterModel addResultReasonsItem(String resultReasonsItem) {
    if (this.resultReasons == null) {
      this.resultReasons = new ArrayList<>();
    }
    this.resultReasons.add(resultReasonsItem);
    return this;
  }

   /**
   * Specifies result reasons for searching test results
   * @return resultReasons
  **/
  @javax.annotation.Nullable
  public List<String> getResultReasons() {
    return resultReasons;
  }

  public void setResultReasons(List<String> resultReasons) {
    this.resultReasons = resultReasons;
  }


  public TestResultsFilterModel configurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
    return this;
  }

  public TestResultsFilterModel addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new ArrayList<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies a test result configuration IDs to search for
   * @return configurationIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getConfigurationIds() {
    return configurationIds;
  }

  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public TestResultsFilterModel outcomes(List<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
    return this;
  }

  public TestResultsFilterModel addOutcomesItem(TestResultOutcome outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Specifies a test result outcomes to search for
   * @return outcomes
  **/
  @javax.annotation.Nullable
  public List<TestResultOutcome> getOutcomes() {
    return outcomes;
  }

  public void setOutcomes(List<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  public TestResultsFilterModel failureCategories(List<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
    return this;
  }

  public TestResultsFilterModel addFailureCategoriesItem(FailureCategoryModel failureCategoriesItem) {
    if (this.failureCategories == null) {
      this.failureCategories = new ArrayList<>();
    }
    this.failureCategories.add(failureCategoriesItem);
    return this;
  }

   /**
   * Specifies a test result failure categories to search for
   * @return failureCategories
  **/
  @javax.annotation.Nullable
  public List<FailureCategoryModel> getFailureCategories() {
    return failureCategories;
  }

  public void setFailureCategories(List<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
  }


  public TestResultsFilterModel namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies a test result namespace to search for
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public TestResultsFilterModel className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Specifies a test result class name to search for
   * @return className
  **/
  @javax.annotation.Nullable
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsFilterModel testResultsFilterModel = (TestResultsFilterModel) o;
    return Objects.equals(this.testRunIds, testResultsFilterModel.testRunIds) &&
        Objects.equals(this.autoTestGlobalIds, testResultsFilterModel.autoTestGlobalIds) &&
        Objects.equals(this.name, testResultsFilterModel.name) &&
        Objects.equals(this.createdDate, testResultsFilterModel.createdDate) &&
        Objects.equals(this.modifiedDate, testResultsFilterModel.modifiedDate) &&
        Objects.equals(this.startedOn, testResultsFilterModel.startedOn) &&
        Objects.equals(this.completedOn, testResultsFilterModel.completedOn) &&
        Objects.equals(this.duration, testResultsFilterModel.duration) &&
        Objects.equals(this.resultReasons, testResultsFilterModel.resultReasons) &&
        Objects.equals(this.configurationIds, testResultsFilterModel.configurationIds) &&
        Objects.equals(this.outcomes, testResultsFilterModel.outcomes) &&
        Objects.equals(this.failureCategories, testResultsFilterModel.failureCategories) &&
        Objects.equals(this.namespace, testResultsFilterModel.namespace) &&
        Objects.equals(this.className, testResultsFilterModel.className);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRunIds, autoTestGlobalIds, name, createdDate, modifiedDate, startedOn, completedOn, duration, resultReasons, configurationIds, outcomes, failureCategories, namespace, className);
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
    sb.append("class TestResultsFilterModel {\n");
    sb.append("    testRunIds: ").append(toIndentedString(testRunIds)).append("\n");
    sb.append("    autoTestGlobalIds: ").append(toIndentedString(autoTestGlobalIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    resultReasons: ").append(toIndentedString(resultReasons)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    failureCategories: ").append(toIndentedString(failureCategories)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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
    openapiFields.add("testRunIds");
    openapiFields.add("autoTestGlobalIds");
    openapiFields.add("name");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("duration");
    openapiFields.add("resultReasons");
    openapiFields.add("configurationIds");
    openapiFields.add("outcomes");
    openapiFields.add("failureCategories");
    openapiFields.add("namespace");
    openapiFields.add("className");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestResultsFilterModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResultsFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultsFilterModel is not found in the empty JSON string", TestResultsFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResultsFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultsFilterModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("testRunIds") != null && !jsonObj.get("testRunIds").isJsonNull() && !jsonObj.get("testRunIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunIds` to be an array in the JSON string but got `%s`", jsonObj.get("testRunIds").toString()));
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
        TestResultsFilterModelCreatedDate.validateJsonElement(jsonObj.get("createdDate"));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        TestResultsFilterModelModifiedDate.validateJsonElement(jsonObj.get("modifiedDate"));
      }
      // validate the optional field `startedOn`
      if (jsonObj.get("startedOn") != null && !jsonObj.get("startedOn").isJsonNull()) {
        TestResultsFilterModelStartedOn.validateJsonElement(jsonObj.get("startedOn"));
      }
      // validate the optional field `completedOn`
      if (jsonObj.get("completedOn") != null && !jsonObj.get("completedOn").isJsonNull()) {
        TestResultsFilterModelCompletedOn.validateJsonElement(jsonObj.get("completedOn"));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        TestResultsFilterModelDuration.validateJsonElement(jsonObj.get("duration"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resultReasons") != null && !jsonObj.get("resultReasons").isJsonNull() && !jsonObj.get("resultReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultReasons` to be an array in the JSON string but got `%s`", jsonObj.get("resultReasons").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonNull() && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outcomes") != null && !jsonObj.get("outcomes").isJsonNull() && !jsonObj.get("outcomes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcomes` to be an array in the JSON string but got `%s`", jsonObj.get("outcomes").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultsFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultsFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultsFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultsFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultsFilterModel>() {
           @Override
           public void write(JsonWriter out, TestResultsFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultsFilterModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultsFilterModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultsFilterModel
  * @throws IOException if the JSON string is invalid with respect to TestResultsFilterModel
  */
  public static TestResultsFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultsFilterModel.class);
  }

 /**
  * Convert an instance of TestResultsFilterModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

