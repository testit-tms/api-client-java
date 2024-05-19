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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.FailureCategoryModel;
import ru.testit.client.model.TestResultOutcome;
import ru.testit.client.model.TestRunFilterModelAutoTestsCount;
import ru.testit.client.model.TestRunFilterModelCompletedDate;
import ru.testit.client.model.TestRunFilterModelCreatedDate;
import ru.testit.client.model.TestRunFilterModelStartedDate;
import ru.testit.client.model.TestRunState;

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
 * TestRunFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunFilterModel {
  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  private Set<TestRunState> states;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private TestRunFilterModelCreatedDate createdDate;

  public static final String SERIALIZED_NAME_STARTED_DATE = "startedDate";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE)
  private TestRunFilterModelStartedDate startedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_AUTO_TESTS_COUNT = "autoTestsCount";
  @SerializedName(SERIALIZED_NAME_AUTO_TESTS_COUNT)
  private TestRunFilterModelAutoTestsCount autoTestsCount;

  public static final String SERIALIZED_NAME_TEST_RESULTS_OUTCOME = "testResultsOutcome";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS_OUTCOME)
  private List<TestResultOutcome> testResultsOutcome;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORY = "failureCategory";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORY)
  private List<FailureCategoryModel> failureCategory;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private TestRunFilterModelCompletedDate completedDate;

  public TestRunFilterModel() {
  }

  public TestRunFilterModel projectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public TestRunFilterModel addProjectIdsItem(UUID projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new LinkedHashSet<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * Specifies a test run project IDs to search for
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public TestRunFilterModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies test run name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestRunFilterModel states(Set<TestRunState> states) {
    this.states = states;
    return this;
  }

  public TestRunFilterModel addStatesItem(TestRunState statesItem) {
    if (this.states == null) {
      this.states = new LinkedHashSet<>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Specifies a test run states to search for
   * @return states
  **/
  @javax.annotation.Nullable
  public Set<TestRunState> getStates() {
    return states;
  }

  public void setStates(Set<TestRunState> states) {
    this.states = states;
  }


  public TestRunFilterModel createdDate(TestRunFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public TestRunFilterModelCreatedDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(TestRunFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
  }


  public TestRunFilterModel startedDate(TestRunFilterModelStartedDate startedDate) {
    this.startedDate = startedDate;
    return this;
  }

   /**
   * Get startedDate
   * @return startedDate
  **/
  @javax.annotation.Nullable
  public TestRunFilterModelStartedDate getStartedDate() {
    return startedDate;
  }

  public void setStartedDate(TestRunFilterModelStartedDate startedDate) {
    this.startedDate = startedDate;
  }


  public TestRunFilterModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
    return this;
  }

  public TestRunFilterModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Specifies a test run creator IDs to search for
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }

  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public TestRunFilterModel modifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public TestRunFilterModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null) {
      this.modifiedByIds = new LinkedHashSet<>();
    }
    this.modifiedByIds.add(modifiedByIdsItem);
    return this;
  }

   /**
   * Specifies a test run last editor IDs to search for
   * @return modifiedByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }

  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }


  public TestRunFilterModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Specifies a test run deleted status to search for
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public TestRunFilterModel autoTestsCount(TestRunFilterModelAutoTestsCount autoTestsCount) {
    this.autoTestsCount = autoTestsCount;
    return this;
  }

   /**
   * Get autoTestsCount
   * @return autoTestsCount
  **/
  @javax.annotation.Nullable
  public TestRunFilterModelAutoTestsCount getAutoTestsCount() {
    return autoTestsCount;
  }

  public void setAutoTestsCount(TestRunFilterModelAutoTestsCount autoTestsCount) {
    this.autoTestsCount = autoTestsCount;
  }


  public TestRunFilterModel testResultsOutcome(List<TestResultOutcome> testResultsOutcome) {
    this.testResultsOutcome = testResultsOutcome;
    return this;
  }

  public TestRunFilterModel addTestResultsOutcomeItem(TestResultOutcome testResultsOutcomeItem) {
    if (this.testResultsOutcome == null) {
      this.testResultsOutcome = new ArrayList<>();
    }
    this.testResultsOutcome.add(testResultsOutcomeItem);
    return this;
  }

   /**
   * Specifies test results outcomes
   * @return testResultsOutcome
  **/
  @javax.annotation.Nullable
  public List<TestResultOutcome> getTestResultsOutcome() {
    return testResultsOutcome;
  }

  public void setTestResultsOutcome(List<TestResultOutcome> testResultsOutcome) {
    this.testResultsOutcome = testResultsOutcome;
  }


  public TestRunFilterModel failureCategory(List<FailureCategoryModel> failureCategory) {
    this.failureCategory = failureCategory;
    return this;
  }

  public TestRunFilterModel addFailureCategoryItem(FailureCategoryModel failureCategoryItem) {
    if (this.failureCategory == null) {
      this.failureCategory = new ArrayList<>();
    }
    this.failureCategory.add(failureCategoryItem);
    return this;
  }

   /**
   * Specifies failure categories
   * @return failureCategory
  **/
  @javax.annotation.Nullable
  public List<FailureCategoryModel> getFailureCategory() {
    return failureCategory;
  }

  public void setFailureCategory(List<FailureCategoryModel> failureCategory) {
    this.failureCategory = failureCategory;
  }


  public TestRunFilterModel completedDate(TestRunFilterModelCompletedDate completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @javax.annotation.Nullable
  public TestRunFilterModelCompletedDate getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(TestRunFilterModelCompletedDate completedDate) {
    this.completedDate = completedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunFilterModel testRunFilterModel = (TestRunFilterModel) o;
    return Objects.equals(this.projectIds, testRunFilterModel.projectIds) &&
        Objects.equals(this.name, testRunFilterModel.name) &&
        Objects.equals(this.states, testRunFilterModel.states) &&
        Objects.equals(this.createdDate, testRunFilterModel.createdDate) &&
        Objects.equals(this.startedDate, testRunFilterModel.startedDate) &&
        Objects.equals(this.createdByIds, testRunFilterModel.createdByIds) &&
        Objects.equals(this.modifiedByIds, testRunFilterModel.modifiedByIds) &&
        Objects.equals(this.isDeleted, testRunFilterModel.isDeleted) &&
        Objects.equals(this.autoTestsCount, testRunFilterModel.autoTestsCount) &&
        Objects.equals(this.testResultsOutcome, testRunFilterModel.testResultsOutcome) &&
        Objects.equals(this.failureCategory, testRunFilterModel.failureCategory) &&
        Objects.equals(this.completedDate, testRunFilterModel.completedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, name, states, createdDate, startedDate, createdByIds, modifiedByIds, isDeleted, autoTestsCount, testResultsOutcome, failureCategory, completedDate);
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
    sb.append("class TestRunFilterModel {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    autoTestsCount: ").append(toIndentedString(autoTestsCount)).append("\n");
    sb.append("    testResultsOutcome: ").append(toIndentedString(testResultsOutcome)).append("\n");
    sb.append("    failureCategory: ").append(toIndentedString(failureCategory)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
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
    openapiFields.add("projectIds");
    openapiFields.add("name");
    openapiFields.add("states");
    openapiFields.add("createdDate");
    openapiFields.add("startedDate");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedByIds");
    openapiFields.add("isDeleted");
    openapiFields.add("autoTestsCount");
    openapiFields.add("testResultsOutcome");
    openapiFields.add("failureCategory");
    openapiFields.add("completedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestRunFilterModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestRunFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunFilterModel is not found in the empty JSON string", TestRunFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestRunFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunFilterModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull() && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("states") != null && !jsonObj.get("states").isJsonNull() && !jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        TestRunFilterModelCreatedDate.validateJsonElement(jsonObj.get("createdDate"));
      }
      // validate the optional field `startedDate`
      if (jsonObj.get("startedDate") != null && !jsonObj.get("startedDate").isJsonNull()) {
        TestRunFilterModelStartedDate.validateJsonElement(jsonObj.get("startedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonNull() && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modifiedByIds") != null && !jsonObj.get("modifiedByIds").isJsonNull() && !jsonObj.get("modifiedByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByIds` to be an array in the JSON string but got `%s`", jsonObj.get("modifiedByIds").toString()));
      }
      // validate the optional field `autoTestsCount`
      if (jsonObj.get("autoTestsCount") != null && !jsonObj.get("autoTestsCount").isJsonNull()) {
        TestRunFilterModelAutoTestsCount.validateJsonElement(jsonObj.get("autoTestsCount"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testResultsOutcome") != null && !jsonObj.get("testResultsOutcome").isJsonNull() && !jsonObj.get("testResultsOutcome").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testResultsOutcome` to be an array in the JSON string but got `%s`", jsonObj.get("testResultsOutcome").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureCategory") != null && !jsonObj.get("failureCategory").isJsonNull() && !jsonObj.get("failureCategory").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureCategory` to be an array in the JSON string but got `%s`", jsonObj.get("failureCategory").toString()));
      }
      // validate the optional field `completedDate`
      if (jsonObj.get("completedDate") != null && !jsonObj.get("completedDate").isJsonNull()) {
        TestRunFilterModelCompletedDate.validateJsonElement(jsonObj.get("completedDate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestRunFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunFilterModel>() {
           @Override
           public void write(JsonWriter out, TestRunFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunFilterModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunFilterModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunFilterModel
  * @throws IOException if the JSON string is invalid with respect to TestRunFilterModel
  */
  public static TestRunFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunFilterModel.class);
  }

 /**
  * Convert an instance of TestRunFilterModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

