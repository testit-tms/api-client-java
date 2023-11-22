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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.LinkModel;

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
 * TestResultHistoryReportModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultHistoryReportModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_TEST_RUN_ID = "testRunId";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_ID)
  private UUID testRunId;

  public static final String SERIALIZED_NAME_TEST_RUN_NAME = "testRunName";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_NAME)
  private String testRunName;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_NAME = "createdByUserName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_NAME)
  private String createdByUserName;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID = "testPlanGlobalId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID)
  private Long testPlanGlobalId;

  public static final String SERIALIZED_NAME_TEST_PLAN_NAME = "testPlanName";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_NAME)
  private String testPlanName;

  public static final String SERIALIZED_NAME_CONFIGURATION_NAME = "configurationName";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_NAME)
  private String configurationName;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkModel> links;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentModel> attachments;

  public static final String SERIALIZED_NAME_WORK_ITEM_VERSION_ID = "workItemVersionId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_VERSION_ID)
  private UUID workItemVersionId;

  public static final String SERIALIZED_NAME_WORK_ITEM_VERSION_NUMBER = "workItemVersionNumber";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_VERSION_NUMBER)
  private Integer workItemVersionNumber;

  public static final String SERIALIZED_NAME_LAUNCH_SOURCE = "launchSource";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SOURCE)
  private String launchSource;

  public static final String SERIALIZED_NAME_FAILURE_CLASS_IDS = "failureClassIds";
  @SerializedName(SERIALIZED_NAME_FAILURE_CLASS_IDS)
  private List<UUID> failureClassIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters;

  public TestResultHistoryReportModel() {
  }

  public TestResultHistoryReportModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestResultHistoryReportModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestResultHistoryReportModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestResultHistoryReportModel userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * If test run was stopped, this property equals identifier of user who stopped it.Otherwise, the property equals identifier of user who created the test result
   * @return userId
  **/
  @javax.annotation.Nonnull
  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public TestResultHistoryReportModel testRunId(UUID testRunId) {
    
    this.testRunId = testRunId;
    return this;
  }

   /**
   * Get testRunId
   * @return testRunId
  **/
  @javax.annotation.Nullable
  public UUID getTestRunId() {
    return testRunId;
  }


  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public TestResultHistoryReportModel testRunName(String testRunName) {
    
    this.testRunName = testRunName;
    return this;
  }

   /**
   * Get testRunName
   * @return testRunName
  **/
  @javax.annotation.Nullable
  public String getTestRunName() {
    return testRunName;
  }


  public void setTestRunName(String testRunName) {
    this.testRunName = testRunName;
  }


  public TestResultHistoryReportModel createdByUserName(String createdByUserName) {
    
    this.createdByUserName = createdByUserName;
    return this;
  }

   /**
   * Get createdByUserName
   * @return createdByUserName
  **/
  @javax.annotation.Nullable
  public String getCreatedByUserName() {
    return createdByUserName;
  }


  public void setCreatedByUserName(String createdByUserName) {
    this.createdByUserName = createdByUserName;
  }


  public TestResultHistoryReportModel testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @javax.annotation.Nullable
  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestResultHistoryReportModel testPlanGlobalId(Long testPlanGlobalId) {
    
    this.testPlanGlobalId = testPlanGlobalId;
    return this;
  }

   /**
   * Get testPlanGlobalId
   * @return testPlanGlobalId
  **/
  @javax.annotation.Nullable
  public Long getTestPlanGlobalId() {
    return testPlanGlobalId;
  }


  public void setTestPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
  }


  public TestResultHistoryReportModel testPlanName(String testPlanName) {
    
    this.testPlanName = testPlanName;
    return this;
  }

   /**
   * Get testPlanName
   * @return testPlanName
  **/
  @javax.annotation.Nullable
  public String getTestPlanName() {
    return testPlanName;
  }


  public void setTestPlanName(String testPlanName) {
    this.testPlanName = testPlanName;
  }


  public TestResultHistoryReportModel configurationName(String configurationName) {
    
    this.configurationName = configurationName;
    return this;
  }

   /**
   * If test point related to the test result has configuration, this property will be equal to the test point configuration name. Otherwise, this property will be equal to the test result configuration name
   * @return configurationName
  **/
  @javax.annotation.Nullable
  public String getConfigurationName() {
    return configurationName;
  }


  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }


  public TestResultHistoryReportModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @javax.annotation.Nonnull
  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public TestResultHistoryReportModel outcome(String outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * If any test result related to the test run is linked with autotest and the run has an outcome, the outcome value equalsto the worst outcome of the last modified test result.Otherwise, the outcome equals to the outcome of first created test result in the test run
   * @return outcome
  **/
  @javax.annotation.Nullable
  public String getOutcome() {
    return outcome;
  }


  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public TestResultHistoryReportModel comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * If any test result related to the test run is linked with autotest, comment will have default valueOtherwise, the comment equals to the comment of first created test result in the test run
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TestResultHistoryReportModel links(List<LinkModel> links) {
    
    this.links = links;
    return this;
  }

  public TestResultHistoryReportModel addLinksItem(LinkModel linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * If any test result related to the test run is linked with autotest, link will be equal to the links of last modified test result.Otherwise, the links equals to the links of first created test result in the test run
   * @return links
  **/
  @javax.annotation.Nullable
  public List<LinkModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkModel> links) {
    this.links = links;
  }


  public TestResultHistoryReportModel startedOn(OffsetDateTime startedOn) {
    
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartedOn() {
    return startedOn;
  }


  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public TestResultHistoryReportModel completedOn(OffsetDateTime completedOn) {
    
    this.completedOn = completedOn;
    return this;
  }

   /**
   * Get completedOn
   * @return completedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }


  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public TestResultHistoryReportModel duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public TestResultHistoryReportModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestResultHistoryReportModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public TestResultHistoryReportModel attachments(List<AttachmentModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public TestResultHistoryReportModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * If any test result related to the test run is linked with autotest, attachments will be equal to the attachments of last modified test result.Otherwise, the attachments equals to the attachments of first created test result in the test run
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<AttachmentModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
  }


  public TestResultHistoryReportModel workItemVersionId(UUID workItemVersionId) {
    
    this.workItemVersionId = workItemVersionId;
    return this;
  }

   /**
   * Get workItemVersionId
   * @return workItemVersionId
  **/
  @javax.annotation.Nullable
  public UUID getWorkItemVersionId() {
    return workItemVersionId;
  }


  public void setWorkItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
  }


  public TestResultHistoryReportModel workItemVersionNumber(Integer workItemVersionNumber) {
    
    this.workItemVersionNumber = workItemVersionNumber;
    return this;
  }

   /**
   * Get workItemVersionNumber
   * @return workItemVersionNumber
  **/
  @javax.annotation.Nullable
  public Integer getWorkItemVersionNumber() {
    return workItemVersionNumber;
  }


  public void setWorkItemVersionNumber(Integer workItemVersionNumber) {
    this.workItemVersionNumber = workItemVersionNumber;
  }


  public TestResultHistoryReportModel launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Get launchSource
   * @return launchSource
  **/
  @javax.annotation.Nullable
  public String getLaunchSource() {
    return launchSource;
  }


  public void setLaunchSource(String launchSource) {
    this.launchSource = launchSource;
  }


  public TestResultHistoryReportModel failureClassIds(List<UUID> failureClassIds) {
    
    this.failureClassIds = failureClassIds;
    return this;
  }

  public TestResultHistoryReportModel addFailureClassIdsItem(UUID failureClassIdsItem) {
    if (this.failureClassIds == null) {
      this.failureClassIds = new ArrayList<>();
    }
    this.failureClassIds.add(failureClassIdsItem);
    return this;
  }

   /**
   * Get failureClassIds
   * @return failureClassIds
  **/
  @javax.annotation.Nonnull
  public List<UUID> getFailureClassIds() {
    return failureClassIds;
  }


  public void setFailureClassIds(List<UUID> failureClassIds) {
    this.failureClassIds = failureClassIds;
  }


  public TestResultHistoryReportModel parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public TestResultHistoryReportModel putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultHistoryReportModel testResultHistoryReportModel = (TestResultHistoryReportModel) o;
    return Objects.equals(this.id, testResultHistoryReportModel.id) &&
        Objects.equals(this.createdDate, testResultHistoryReportModel.createdDate) &&
        Objects.equals(this.modifiedDate, testResultHistoryReportModel.modifiedDate) &&
        Objects.equals(this.userId, testResultHistoryReportModel.userId) &&
        Objects.equals(this.testRunId, testResultHistoryReportModel.testRunId) &&
        Objects.equals(this.testRunName, testResultHistoryReportModel.testRunName) &&
        Objects.equals(this.createdByUserName, testResultHistoryReportModel.createdByUserName) &&
        Objects.equals(this.testPlanId, testResultHistoryReportModel.testPlanId) &&
        Objects.equals(this.testPlanGlobalId, testResultHistoryReportModel.testPlanGlobalId) &&
        Objects.equals(this.testPlanName, testResultHistoryReportModel.testPlanName) &&
        Objects.equals(this.configurationName, testResultHistoryReportModel.configurationName) &&
        Objects.equals(this.isAutomated, testResultHistoryReportModel.isAutomated) &&
        Objects.equals(this.outcome, testResultHistoryReportModel.outcome) &&
        Objects.equals(this.comment, testResultHistoryReportModel.comment) &&
        Objects.equals(this.links, testResultHistoryReportModel.links) &&
        Objects.equals(this.startedOn, testResultHistoryReportModel.startedOn) &&
        Objects.equals(this.completedOn, testResultHistoryReportModel.completedOn) &&
        Objects.equals(this.duration, testResultHistoryReportModel.duration) &&
        Objects.equals(this.createdById, testResultHistoryReportModel.createdById) &&
        Objects.equals(this.modifiedById, testResultHistoryReportModel.modifiedById) &&
        Objects.equals(this.attachments, testResultHistoryReportModel.attachments) &&
        Objects.equals(this.workItemVersionId, testResultHistoryReportModel.workItemVersionId) &&
        Objects.equals(this.workItemVersionNumber, testResultHistoryReportModel.workItemVersionNumber) &&
        Objects.equals(this.launchSource, testResultHistoryReportModel.launchSource) &&
        Objects.equals(this.failureClassIds, testResultHistoryReportModel.failureClassIds) &&
        Objects.equals(this.parameters, testResultHistoryReportModel.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, modifiedDate, userId, testRunId, testRunName, createdByUserName, testPlanId, testPlanGlobalId, testPlanName, configurationName, isAutomated, outcome, comment, links, startedOn, completedOn, duration, createdById, modifiedById, attachments, workItemVersionId, workItemVersionNumber, launchSource, failureClassIds, parameters);
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
    sb.append("class TestResultHistoryReportModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    testRunName: ").append(toIndentedString(testRunName)).append("\n");
    sb.append("    createdByUserName: ").append(toIndentedString(createdByUserName)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testPlanGlobalId: ").append(toIndentedString(testPlanGlobalId)).append("\n");
    sb.append("    testPlanName: ").append(toIndentedString(testPlanName)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    workItemVersionId: ").append(toIndentedString(workItemVersionId)).append("\n");
    sb.append("    workItemVersionNumber: ").append(toIndentedString(workItemVersionNumber)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
    sb.append("    failureClassIds: ").append(toIndentedString(failureClassIds)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("userId");
    openapiFields.add("testRunId");
    openapiFields.add("testRunName");
    openapiFields.add("createdByUserName");
    openapiFields.add("testPlanId");
    openapiFields.add("testPlanGlobalId");
    openapiFields.add("testPlanName");
    openapiFields.add("configurationName");
    openapiFields.add("isAutomated");
    openapiFields.add("outcome");
    openapiFields.add("comment");
    openapiFields.add("links");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("duration");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("attachments");
    openapiFields.add("workItemVersionId");
    openapiFields.add("workItemVersionNumber");
    openapiFields.add("launchSource");
    openapiFields.add("failureClassIds");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("modifiedDate");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("isAutomated");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("failureClassIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultHistoryReportModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultHistoryReportModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultHistoryReportModel is not found in the empty JSON string", TestResultHistoryReportModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultHistoryReportModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultHistoryReportModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestResultHistoryReportModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("testRunId") != null && !jsonObj.get("testRunId").isJsonNull()) && !jsonObj.get("testRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunId").toString()));
      }
      if ((jsonObj.get("testRunName") != null && !jsonObj.get("testRunName").isJsonNull()) && !jsonObj.get("testRunName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunName").toString()));
      }
      if ((jsonObj.get("createdByUserName") != null && !jsonObj.get("createdByUserName").isJsonNull()) && !jsonObj.get("createdByUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByUserName").toString()));
      }
      if ((jsonObj.get("testPlanId") != null && !jsonObj.get("testPlanId").isJsonNull()) && !jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if ((jsonObj.get("testPlanName") != null && !jsonObj.get("testPlanName").isJsonNull()) && !jsonObj.get("testPlanName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanName").toString()));
      }
      if ((jsonObj.get("configurationName") != null && !jsonObj.get("configurationName").isJsonNull()) && !jsonObj.get("configurationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationName").toString()));
      }
      if ((jsonObj.get("outcome") != null && !jsonObj.get("outcome").isJsonNull()) && !jsonObj.get("outcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcome").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
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
            AttachmentModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("workItemVersionId") != null && !jsonObj.get("workItemVersionId").isJsonNull()) && !jsonObj.get("workItemVersionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemVersionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemVersionId").toString()));
      }
      if ((jsonObj.get("launchSource") != null && !jsonObj.get("launchSource").isJsonNull()) && !jsonObj.get("launchSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `launchSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("launchSource").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("failureClassIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("failureClassIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureClassIds` to be an array in the JSON string but got `%s`", jsonObj.get("failureClassIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultHistoryReportModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultHistoryReportModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultHistoryReportModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultHistoryReportModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultHistoryReportModel>() {
           @Override
           public void write(JsonWriter out, TestResultHistoryReportModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultHistoryReportModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultHistoryReportModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultHistoryReportModel
  * @throws IOException if the JSON string is invalid with respect to TestResultHistoryReportModel
  */
  public static TestResultHistoryReportModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultHistoryReportModel.class);
  }

 /**
  * Convert an instance of TestResultHistoryReportModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

