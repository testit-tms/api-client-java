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
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * TestRunModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunModel {
  public static final String SERIALIZED_NAME_AUTO_TESTS = "autoTests";
  @SerializedName(SERIALIZED_NAME_AUTO_TESTS)
  private List<AutoTestModel> autoTests = null;

  public static final String SERIALIZED_NAME_AUTO_TESTS_COUNT = "autoTestsCount";
  @SerializedName(SERIALIZED_NAME_AUTO_TESTS_COUNT)
  private Integer autoTestsCount;

  public static final String SERIALIZED_NAME_TEST_SUITE_IDS = "testSuiteIds";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE_IDS)
  private List<UUID> testSuiteIds = null;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_ANALYTIC = "analytic";
  @SerializedName(SERIALIZED_NAME_ANALYTIC)
  private TestRunAnalyticResultModel analytic;

  public static final String SERIALIZED_NAME_TEST_RESULTS = "testResults";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS)
  private List<TestResultModel> testResults = null;

  public static final String SERIALIZED_NAME_TEST_PLAN = "testPlan";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN)
  private TestPlanModel testPlan;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_NAME = "createdByUserName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_NAME)
  private String createdByUserName;

  public static final String SERIALIZED_NAME_STARTED_DATE = "startedDate";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE)
  private OffsetDateTime startedDate;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private OffsetDateTime completedDate;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATE_NAME = "stateName";
  @SerializedName(SERIALIZED_NAME_STATE_NAME)
  private TestRunState stateName;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_RUN_BY_USER_ID = "runByUserId";
  @SerializedName(SERIALIZED_NAME_RUN_BY_USER_ID)
  private UUID runByUserId;

  public static final String SERIALIZED_NAME_STOPPED_BY_USER_ID = "stoppedByUserId";
  @SerializedName(SERIALIZED_NAME_STOPPED_BY_USER_ID)
  private UUID stoppedByUserId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LAUNCH_SOURCE = "launchSource";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SOURCE)
  private String launchSource;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public TestRunModel() {
  }

  public TestRunModel autoTests(List<AutoTestModel> autoTests) {
    
    this.autoTests = autoTests;
    return this;
  }

  public TestRunModel addAutoTestsItem(AutoTestModel autoTestsItem) {
    if (this.autoTests == null) {
      this.autoTests = new ArrayList<>();
    }
    this.autoTests.add(autoTestsItem);
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AutoTestModel> getAutoTests() {
    return autoTests;
  }


  public void setAutoTests(List<AutoTestModel> autoTests) {
    this.autoTests = autoTests;
  }


  public TestRunModel autoTestsCount(Integer autoTestsCount) {
    
    this.autoTestsCount = autoTestsCount;
    return this;
  }

   /**
   * Get autoTestsCount
   * @return autoTestsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutoTestsCount() {
    return autoTestsCount;
  }


  public void setAutoTestsCount(Integer autoTestsCount) {
    this.autoTestsCount = autoTestsCount;
  }


  public TestRunModel testSuiteIds(List<UUID> testSuiteIds) {
    
    this.testSuiteIds = testSuiteIds;
    return this;
  }

  public TestRunModel addTestSuiteIdsItem(UUID testSuiteIdsItem) {
    if (this.testSuiteIds == null) {
      this.testSuiteIds = new ArrayList<>();
    }
    this.testSuiteIds.add(testSuiteIdsItem);
    return this;
  }

   /**
   * Get testSuiteIds
   * @return testSuiteIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getTestSuiteIds() {
    return testSuiteIds;
  }


  public void setTestSuiteIds(List<UUID> testSuiteIds) {
    this.testSuiteIds = testSuiteIds;
  }


  public TestRunModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public TestRunModel analytic(TestRunAnalyticResultModel analytic) {
    
    this.analytic = analytic;
    return this;
  }

   /**
   * Get analytic
   * @return analytic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestRunAnalyticResultModel getAnalytic() {
    return analytic;
  }


  public void setAnalytic(TestRunAnalyticResultModel analytic) {
    this.analytic = analytic;
  }


  public TestRunModel testResults(List<TestResultModel> testResults) {
    
    this.testResults = testResults;
    return this;
  }

  public TestRunModel addTestResultsItem(TestResultModel testResultsItem) {
    if (this.testResults == null) {
      this.testResults = new ArrayList<>();
    }
    this.testResults.add(testResultsItem);
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TestResultModel> getTestResults() {
    return testResults;
  }


  public void setTestResults(List<TestResultModel> testResults) {
    this.testResults = testResults;
  }


  public TestRunModel testPlan(TestPlanModel testPlan) {
    
    this.testPlan = testPlan;
    return this;
  }

   /**
   * Get testPlan
   * @return testPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestPlanModel getTestPlan() {
    return testPlan;
  }


  public void setTestPlan(TestPlanModel testPlan) {
    this.testPlan = testPlan;
  }


  public TestRunModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestRunModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestRunModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestRunModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public TestRunModel createdByUserName(String createdByUserName) {
    
    this.createdByUserName = createdByUserName;
    return this;
  }

   /**
   * Get createdByUserName
   * @return createdByUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedByUserName() {
    return createdByUserName;
  }


  public void setCreatedByUserName(String createdByUserName) {
    this.createdByUserName = createdByUserName;
  }


  public TestRunModel startedDate(OffsetDateTime startedDate) {
    
    this.startedDate = startedDate;
    return this;
  }

   /**
   * Get startedDate
   * @return startedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartedDate() {
    return startedDate;
  }


  public void setStartedDate(OffsetDateTime startedDate) {
    this.startedDate = startedDate;
  }


  public TestRunModel completedDate(OffsetDateTime completedDate) {
    
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCompletedDate() {
    return completedDate;
  }


  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }


  public TestRunModel build(String build) {
    
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuild() {
    return build;
  }


  public void setBuild(String build) {
    this.build = build;
  }


  public TestRunModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestRunModel stateName(TestRunState stateName) {
    
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestRunState getStateName() {
    return stateName;
  }


  public void setStateName(TestRunState stateName) {
    this.stateName = stateName;
  }


  public TestRunModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunModel testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestRunModel runByUserId(UUID runByUserId) {
    
    this.runByUserId = runByUserId;
    return this;
  }

   /**
   * Get runByUserId
   * @return runByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getRunByUserId() {
    return runByUserId;
  }


  public void setRunByUserId(UUID runByUserId) {
    this.runByUserId = runByUserId;
  }


  public TestRunModel stoppedByUserId(UUID stoppedByUserId) {
    
    this.stoppedByUserId = stoppedByUserId;
    return this;
  }

   /**
   * Get stoppedByUserId
   * @return stoppedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getStoppedByUserId() {
    return stoppedByUserId;
  }


  public void setStoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = stoppedByUserId;
  }


  public TestRunModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestRunModel launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Get launchSource
   * @return launchSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLaunchSource() {
    return launchSource;
  }


  public void setLaunchSource(String launchSource) {
    this.launchSource = launchSource;
  }


  public TestRunModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the entity")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestRunModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the entity is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the entity is deleted")

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
    TestRunModel testRunModel = (TestRunModel) o;
    return Objects.equals(this.autoTests, testRunModel.autoTests) &&
        Objects.equals(this.autoTestsCount, testRunModel.autoTestsCount) &&
        Objects.equals(this.testSuiteIds, testRunModel.testSuiteIds) &&
        Objects.equals(this.isAutomated, testRunModel.isAutomated) &&
        Objects.equals(this.analytic, testRunModel.analytic) &&
        Objects.equals(this.testResults, testRunModel.testResults) &&
        Objects.equals(this.testPlan, testRunModel.testPlan) &&
        Objects.equals(this.createdDate, testRunModel.createdDate) &&
        Objects.equals(this.modifiedDate, testRunModel.modifiedDate) &&
        Objects.equals(this.createdById, testRunModel.createdById) &&
        Objects.equals(this.modifiedById, testRunModel.modifiedById) &&
        Objects.equals(this.createdByUserName, testRunModel.createdByUserName) &&
        Objects.equals(this.startedDate, testRunModel.startedDate) &&
        Objects.equals(this.completedDate, testRunModel.completedDate) &&
        Objects.equals(this.build, testRunModel.build) &&
        Objects.equals(this.description, testRunModel.description) &&
        Objects.equals(this.stateName, testRunModel.stateName) &&
        Objects.equals(this.projectId, testRunModel.projectId) &&
        Objects.equals(this.testPlanId, testRunModel.testPlanId) &&
        Objects.equals(this.runByUserId, testRunModel.runByUserId) &&
        Objects.equals(this.stoppedByUserId, testRunModel.stoppedByUserId) &&
        Objects.equals(this.name, testRunModel.name) &&
        Objects.equals(this.launchSource, testRunModel.launchSource) &&
        Objects.equals(this.id, testRunModel.id) &&
        Objects.equals(this.isDeleted, testRunModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTests, autoTestsCount, testSuiteIds, isAutomated, analytic, testResults, testPlan, createdDate, modifiedDate, createdById, modifiedById, createdByUserName, startedDate, completedDate, build, description, stateName, projectId, testPlanId, runByUserId, stoppedByUserId, name, launchSource, id, isDeleted);
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
    sb.append("class TestRunModel {\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    autoTestsCount: ").append(toIndentedString(autoTestsCount)).append("\n");
    sb.append("    testSuiteIds: ").append(toIndentedString(testSuiteIds)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    analytic: ").append(toIndentedString(analytic)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    testPlan: ").append(toIndentedString(testPlan)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdByUserName: ").append(toIndentedString(createdByUserName)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    runByUserId: ").append(toIndentedString(runByUserId)).append("\n");
    sb.append("    stoppedByUserId: ").append(toIndentedString(stoppedByUserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
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
    openapiFields.add("autoTests");
    openapiFields.add("autoTestsCount");
    openapiFields.add("testSuiteIds");
    openapiFields.add("isAutomated");
    openapiFields.add("analytic");
    openapiFields.add("testResults");
    openapiFields.add("testPlan");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("createdByUserName");
    openapiFields.add("startedDate");
    openapiFields.add("completedDate");
    openapiFields.add("build");
    openapiFields.add("description");
    openapiFields.add("stateName");
    openapiFields.add("projectId");
    openapiFields.add("testPlanId");
    openapiFields.add("runByUserId");
    openapiFields.add("stoppedByUserId");
    openapiFields.add("name");
    openapiFields.add("launchSource");
    openapiFields.add("id");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunModel is not found in the empty JSON string", TestRunModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("autoTests") != null && !jsonObj.get("autoTests").isJsonNull()) {
        JsonArray jsonArrayautoTests = jsonObj.getAsJsonArray("autoTests");
        if (jsonArrayautoTests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("autoTests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `autoTests` to be an array in the JSON string but got `%s`", jsonObj.get("autoTests").toString()));
          }

          // validate the optional field `autoTests` (array)
          for (int i = 0; i < jsonArrayautoTests.size(); i++) {
            AutoTestModel.validateJsonObject(jsonArrayautoTests.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testSuiteIds") != null && !jsonObj.get("testSuiteIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testSuiteIds` to be an array in the JSON string but got `%s`", jsonObj.get("testSuiteIds").toString()));
      }
      // validate the optional field `analytic`
      if (jsonObj.get("analytic") != null && !jsonObj.get("analytic").isJsonNull()) {
        TestRunAnalyticResultModel.validateJsonObject(jsonObj.getAsJsonObject("analytic"));
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
            TestResultModel.validateJsonObject(jsonArraytestResults.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `testPlan`
      if (jsonObj.get("testPlan") != null && !jsonObj.get("testPlan").isJsonNull()) {
        TestPlanModel.validateJsonObject(jsonObj.getAsJsonObject("testPlan"));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if ((jsonObj.get("createdByUserName") != null && !jsonObj.get("createdByUserName").isJsonNull()) && !jsonObj.get("createdByUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByUserName").toString()));
      }
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("testPlanId") != null && !jsonObj.get("testPlanId").isJsonNull()) && !jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if ((jsonObj.get("runByUserId") != null && !jsonObj.get("runByUserId").isJsonNull()) && !jsonObj.get("runByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runByUserId").toString()));
      }
      if ((jsonObj.get("stoppedByUserId") != null && !jsonObj.get("stoppedByUserId").isJsonNull()) && !jsonObj.get("stoppedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stoppedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stoppedByUserId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("launchSource") != null && !jsonObj.get("launchSource").isJsonNull()) && !jsonObj.get("launchSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `launchSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("launchSource").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestRunModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunModel>() {
           @Override
           public void write(JsonWriter out, TestRunModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunModel
  * @throws IOException if the JSON string is invalid with respect to TestRunModel
  */
  public static TestRunModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunModel.class);
  }

 /**
  * Convert an instance of TestRunModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

