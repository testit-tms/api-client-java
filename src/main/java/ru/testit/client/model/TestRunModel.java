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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.TestPlanModel;
import ru.testit.client.model.TestResultModel;
import ru.testit.client.model.TestRunAnalyticResultModel;
import ru.testit.client.model.TestRunStateTypeModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestRunModel
 */
@JsonPropertyOrder({
  TestRunModel.JSON_PROPERTY_AUTO_TESTS,
  TestRunModel.JSON_PROPERTY_AUTO_TESTS_COUNT,
  TestRunModel.JSON_PROPERTY_TEST_SUITE_IDS,
  TestRunModel.JSON_PROPERTY_IS_AUTOMATED,
  TestRunModel.JSON_PROPERTY_ANALYTIC,
  TestRunModel.JSON_PROPERTY_TEST_RESULTS,
  TestRunModel.JSON_PROPERTY_TEST_PLAN,
  TestRunModel.JSON_PROPERTY_CREATED_DATE,
  TestRunModel.JSON_PROPERTY_MODIFIED_DATE,
  TestRunModel.JSON_PROPERTY_CREATED_BY_ID,
  TestRunModel.JSON_PROPERTY_MODIFIED_BY_ID,
  TestRunModel.JSON_PROPERTY_CREATED_BY_USER_NAME,
  TestRunModel.JSON_PROPERTY_STARTED_DATE,
  TestRunModel.JSON_PROPERTY_COMPLETED_DATE,
  TestRunModel.JSON_PROPERTY_BUILD,
  TestRunModel.JSON_PROPERTY_DESCRIPTION,
  TestRunModel.JSON_PROPERTY_STATE_NAME,
  TestRunModel.JSON_PROPERTY_PROJECT_ID,
  TestRunModel.JSON_PROPERTY_TEST_PLAN_ID,
  TestRunModel.JSON_PROPERTY_RUN_BY_USER_ID,
  TestRunModel.JSON_PROPERTY_STOPPED_BY_USER_ID,
  TestRunModel.JSON_PROPERTY_NAME,
  TestRunModel.JSON_PROPERTY_LAUNCH_SOURCE,
  TestRunModel.JSON_PROPERTY_ID,
  TestRunModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunModel {
  public static final String JSON_PROPERTY_AUTO_TESTS = "autoTests";
  private JsonNullable<List<AutoTestModel>> autoTests = JsonNullable.<List<AutoTestModel>>undefined();

  public static final String JSON_PROPERTY_AUTO_TESTS_COUNT = "autoTestsCount";
  private Integer autoTestsCount;

  public static final String JSON_PROPERTY_TEST_SUITE_IDS = "testSuiteIds";
  private JsonNullable<List<UUID>> testSuiteIds = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_IS_AUTOMATED = "isAutomated";
  private Boolean isAutomated;

  public static final String JSON_PROPERTY_ANALYTIC = "analytic";
  private TestRunAnalyticResultModel analytic;

  public static final String JSON_PROPERTY_TEST_RESULTS = "testResults";
  private JsonNullable<List<TestResultModel>> testResults = JsonNullable.<List<TestResultModel>>undefined();

  public static final String JSON_PROPERTY_TEST_PLAN = "testPlan";
  private TestPlanModel testPlan;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_USER_NAME = "createdByUserName";
  private JsonNullable<String> createdByUserName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STARTED_DATE = "startedDate";
  private JsonNullable<OffsetDateTime> startedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_COMPLETED_DATE = "completedDate";
  private JsonNullable<OffsetDateTime> completedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_BUILD = "build";
  private JsonNullable<String> build = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE_NAME = "stateName";
  private TestRunStateTypeModel stateName;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_TEST_PLAN_ID = "testPlanId";
  private JsonNullable<UUID> testPlanId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_RUN_BY_USER_ID = "runByUserId";
  private JsonNullable<UUID> runByUserId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_STOPPED_BY_USER_ID = "stoppedByUserId";
  private JsonNullable<UUID> stoppedByUserId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAUNCH_SOURCE = "launchSource";
  private JsonNullable<String> launchSource = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public TestRunModel() { 
  }

  public TestRunModel autoTests(List<AutoTestModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestModel>>of(autoTests);
    return this;
  }

  public TestRunModel addAutoTestsItem(AutoTestModel autoTestsItem) {
    if (this.autoTests == null || !this.autoTests.isPresent()) {
      this.autoTests = JsonNullable.<List<AutoTestModel>>of(new ArrayList<>());
    }
    try {
      this.autoTests.get().add(autoTestsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AutoTestModel> getAutoTests() {
        return autoTests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestModel>> getAutoTests_JsonNullable() {
    return autoTests;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  public void setAutoTests_JsonNullable(JsonNullable<List<AutoTestModel>> autoTests) {
    this.autoTests = autoTests;
  }

  public void setAutoTests(List<AutoTestModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestModel>>of(autoTests);
  }


  public TestRunModel autoTestsCount(Integer autoTestsCount) {
    this.autoTestsCount = autoTestsCount;
    return this;
  }

   /**
   * Get autoTestsCount
   * @return autoTestsCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_TESTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutoTestsCount() {
    return autoTestsCount;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TESTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTestsCount(Integer autoTestsCount) {
    this.autoTestsCount = autoTestsCount;
  }


  public TestRunModel testSuiteIds(List<UUID> testSuiteIds) {
    this.testSuiteIds = JsonNullable.<List<UUID>>of(testSuiteIds);
    return this;
  }

  public TestRunModel addTestSuiteIdsItem(UUID testSuiteIdsItem) {
    if (this.testSuiteIds == null || !this.testSuiteIds.isPresent()) {
      this.testSuiteIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.testSuiteIds.get().add(testSuiteIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get testSuiteIds
   * @return testSuiteIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<UUID> getTestSuiteIds() {
        return testSuiteIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_SUITE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getTestSuiteIds_JsonNullable() {
    return testSuiteIds;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_SUITE_IDS)
  public void setTestSuiteIds_JsonNullable(JsonNullable<List<UUID>> testSuiteIds) {
    this.testSuiteIds = testSuiteIds;
  }

  public void setTestSuiteIds(List<UUID> testSuiteIds) {
    this.testSuiteIds = JsonNullable.<List<UUID>>of(testSuiteIds);
  }


  public TestRunModel isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANALYTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestRunAnalyticResultModel getAnalytic() {
    return analytic;
  }


  @JsonProperty(JSON_PROPERTY_ANALYTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalytic(TestRunAnalyticResultModel analytic) {
    this.analytic = analytic;
  }


  public TestRunModel testResults(List<TestResultModel> testResults) {
    this.testResults = JsonNullable.<List<TestResultModel>>of(testResults);
    return this;
  }

  public TestRunModel addTestResultsItem(TestResultModel testResultsItem) {
    if (this.testResults == null || !this.testResults.isPresent()) {
      this.testResults = JsonNullable.<List<TestResultModel>>of(new ArrayList<>());
    }
    try {
      this.testResults.get().add(testResultsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestResultModel> getTestResults() {
        return testResults.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestResultModel>> getTestResults_JsonNullable() {
    return testResults;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  public void setTestResults_JsonNullable(JsonNullable<List<TestResultModel>> testResults) {
    this.testResults = testResults;
  }

  public void setTestResults(List<TestResultModel> testResults) {
    this.testResults = JsonNullable.<List<TestResultModel>>of(testResults);
  }


  public TestRunModel testPlan(TestPlanModel testPlan) {
    this.testPlan = testPlan;
    return this;
  }

   /**
   * Get testPlan
   * @return testPlan
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPlanModel getTestPlan() {
    return testPlan;
  }


  @JsonProperty(JSON_PROPERTY_TEST_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPlan(TestPlanModel testPlan) {
    this.testPlan = testPlan;
  }


  public TestRunModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
  }


  public TestRunModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getModifiedDate() {
        return modifiedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getModifiedDate_JsonNullable() {
    return modifiedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  public void setModifiedDate_JsonNullable(JsonNullable<OffsetDateTime> modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
  }


  public TestRunModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCreatedById() {
    return createdById;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestRunModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getModifiedById() {
        return modifiedById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getModifiedById_JsonNullable() {
    return modifiedById;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  public void setModifiedById_JsonNullable(JsonNullable<UUID> modifiedById) {
    this.modifiedById = modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
  }


  public TestRunModel createdByUserName(String createdByUserName) {
    this.createdByUserName = JsonNullable.<String>of(createdByUserName);
    return this;
  }

   /**
   * Get createdByUserName
   * @return createdByUserName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCreatedByUserName() {
        return createdByUserName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreatedByUserName_JsonNullable() {
    return createdByUserName;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER_NAME)
  public void setCreatedByUserName_JsonNullable(JsonNullable<String> createdByUserName) {
    this.createdByUserName = createdByUserName;
  }

  public void setCreatedByUserName(String createdByUserName) {
    this.createdByUserName = JsonNullable.<String>of(createdByUserName);
  }


  public TestRunModel startedDate(OffsetDateTime startedDate) {
    this.startedDate = JsonNullable.<OffsetDateTime>of(startedDate);
    return this;
  }

   /**
   * Get startedDate
   * @return startedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getStartedDate() {
        return startedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartedDate_JsonNullable() {
    return startedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  public void setStartedDate_JsonNullable(JsonNullable<OffsetDateTime> startedDate) {
    this.startedDate = startedDate;
  }

  public void setStartedDate(OffsetDateTime startedDate) {
    this.startedDate = JsonNullable.<OffsetDateTime>of(startedDate);
  }


  public TestRunModel completedDate(OffsetDateTime completedDate) {
    this.completedDate = JsonNullable.<OffsetDateTime>of(completedDate);
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getCompletedDate() {
        return completedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCompletedDate_JsonNullable() {
    return completedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_DATE)
  public void setCompletedDate_JsonNullable(JsonNullable<OffsetDateTime> completedDate) {
    this.completedDate = completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = JsonNullable.<OffsetDateTime>of(completedDate);
  }


  public TestRunModel build(String build) {
    this.build = JsonNullable.<String>of(build);
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBuild() {
        return build.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBuild_JsonNullable() {
    return build;
  }
  
  @JsonProperty(JSON_PROPERTY_BUILD)
  public void setBuild_JsonNullable(JsonNullable<String> build) {
    this.build = build;
  }

  public void setBuild(String build) {
    this.build = JsonNullable.<String>of(build);
  }


  public TestRunModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public TestRunModel stateName(TestRunStateTypeModel stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestRunStateTypeModel getStateName() {
    return stateName;
  }


  @JsonProperty(JSON_PROPERTY_STATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateName(TestRunStateTypeModel stateName) {
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunModel testPlanId(UUID testPlanId) {
    this.testPlanId = JsonNullable.<UUID>of(testPlanId);
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getTestPlanId() {
        return testPlanId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getTestPlanId_JsonNullable() {
    return testPlanId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  public void setTestPlanId_JsonNullable(JsonNullable<UUID> testPlanId) {
    this.testPlanId = testPlanId;
  }

  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = JsonNullable.<UUID>of(testPlanId);
  }


  public TestRunModel runByUserId(UUID runByUserId) {
    this.runByUserId = JsonNullable.<UUID>of(runByUserId);
    return this;
  }

   /**
   * Get runByUserId
   * @return runByUserId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getRunByUserId() {
        return runByUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUN_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getRunByUserId_JsonNullable() {
    return runByUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_RUN_BY_USER_ID)
  public void setRunByUserId_JsonNullable(JsonNullable<UUID> runByUserId) {
    this.runByUserId = runByUserId;
  }

  public void setRunByUserId(UUID runByUserId) {
    this.runByUserId = JsonNullable.<UUID>of(runByUserId);
  }


  public TestRunModel stoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = JsonNullable.<UUID>of(stoppedByUserId);
    return this;
  }

   /**
   * Get stoppedByUserId
   * @return stoppedByUserId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getStoppedByUserId() {
        return stoppedByUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STOPPED_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getStoppedByUserId_JsonNullable() {
    return stoppedByUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_STOPPED_BY_USER_ID)
  public void setStoppedByUserId_JsonNullable(JsonNullable<UUID> stoppedByUserId) {
    this.stoppedByUserId = stoppedByUserId;
  }

  public void setStoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = JsonNullable.<UUID>of(stoppedByUserId);
  }


  public TestRunModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TestRunModel launchSource(String launchSource) {
    this.launchSource = JsonNullable.<String>of(launchSource);
    return this;
  }

   /**
   * Get launchSource
   * @return launchSource
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLaunchSource() {
        return launchSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAUNCH_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLaunchSource_JsonNullable() {
    return launchSource;
  }
  
  @JsonProperty(JSON_PROPERTY_LAUNCH_SOURCE)
  public void setLaunchSource_JsonNullable(JsonNullable<String> launchSource) {
    this.launchSource = launchSource;
  }

  public void setLaunchSource(String launchSource) {
    this.launchSource = JsonNullable.<String>of(launchSource);
  }


  public TestRunModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TestRunModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  /**
   * Return true if this TestRunModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunModel testRunModel = (TestRunModel) o;
    return equalsNullable(this.autoTests, testRunModel.autoTests) &&
        Objects.equals(this.autoTestsCount, testRunModel.autoTestsCount) &&
        equalsNullable(this.testSuiteIds, testRunModel.testSuiteIds) &&
        Objects.equals(this.isAutomated, testRunModel.isAutomated) &&
        Objects.equals(this.analytic, testRunModel.analytic) &&
        equalsNullable(this.testResults, testRunModel.testResults) &&
        Objects.equals(this.testPlan, testRunModel.testPlan) &&
        equalsNullable(this.createdDate, testRunModel.createdDate) &&
        equalsNullable(this.modifiedDate, testRunModel.modifiedDate) &&
        Objects.equals(this.createdById, testRunModel.createdById) &&
        equalsNullable(this.modifiedById, testRunModel.modifiedById) &&
        equalsNullable(this.createdByUserName, testRunModel.createdByUserName) &&
        equalsNullable(this.startedDate, testRunModel.startedDate) &&
        equalsNullable(this.completedDate, testRunModel.completedDate) &&
        equalsNullable(this.build, testRunModel.build) &&
        equalsNullable(this.description, testRunModel.description) &&
        Objects.equals(this.stateName, testRunModel.stateName) &&
        Objects.equals(this.projectId, testRunModel.projectId) &&
        equalsNullable(this.testPlanId, testRunModel.testPlanId) &&
        equalsNullable(this.runByUserId, testRunModel.runByUserId) &&
        equalsNullable(this.stoppedByUserId, testRunModel.stoppedByUserId) &&
        equalsNullable(this.name, testRunModel.name) &&
        equalsNullable(this.launchSource, testRunModel.launchSource) &&
        Objects.equals(this.id, testRunModel.id) &&
        Objects.equals(this.isDeleted, testRunModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(autoTests), autoTestsCount, hashCodeNullable(testSuiteIds), isAutomated, analytic, hashCodeNullable(testResults), testPlan, hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), createdById, hashCodeNullable(modifiedById), hashCodeNullable(createdByUserName), hashCodeNullable(startedDate), hashCodeNullable(completedDate), hashCodeNullable(build), hashCodeNullable(description), stateName, projectId, hashCodeNullable(testPlanId), hashCodeNullable(runByUserId), hashCodeNullable(stoppedByUserId), hashCodeNullable(name), hashCodeNullable(launchSource), id, isDeleted);
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

}

