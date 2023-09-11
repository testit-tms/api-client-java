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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.LinkModel;
import ru.testit.client.model.TestResultV2GetModel;
import ru.testit.client.model.TestRunState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestRunV2GetModel
 */
@JsonPropertyOrder({
  TestRunV2GetModel.JSON_PROPERTY_STARTED_ON,
  TestRunV2GetModel.JSON_PROPERTY_COMPLETED_ON,
  TestRunV2GetModel.JSON_PROPERTY_STATE_NAME,
  TestRunV2GetModel.JSON_PROPERTY_PROJECT_ID,
  TestRunV2GetModel.JSON_PROPERTY_TEST_PLAN_ID,
  TestRunV2GetModel.JSON_PROPERTY_TEST_RESULTS,
  TestRunV2GetModel.JSON_PROPERTY_CREATED_DATE,
  TestRunV2GetModel.JSON_PROPERTY_MODIFIED_DATE,
  TestRunV2GetModel.JSON_PROPERTY_CREATED_BY_ID,
  TestRunV2GetModel.JSON_PROPERTY_MODIFIED_BY_ID,
  TestRunV2GetModel.JSON_PROPERTY_CREATED_BY_USER_NAME,
  TestRunV2GetModel.JSON_PROPERTY_ATTACHMENTS,
  TestRunV2GetModel.JSON_PROPERTY_LINKS,
  TestRunV2GetModel.JSON_PROPERTY_ID,
  TestRunV2GetModel.JSON_PROPERTY_NAME,
  TestRunV2GetModel.JSON_PROPERTY_DESCRIPTION,
  TestRunV2GetModel.JSON_PROPERTY_LAUNCH_SOURCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunV2GetModel {
  public static final String JSON_PROPERTY_STARTED_ON = "startedOn";
  private JsonNullable<OffsetDateTime> startedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_COMPLETED_ON = "completedOn";
  private JsonNullable<OffsetDateTime> completedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STATE_NAME = "stateName";
  private TestRunState stateName;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_TEST_PLAN_ID = "testPlanId";
  private JsonNullable<UUID> testPlanId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TEST_RESULTS = "testResults";
  private JsonNullable<List<TestResultV2GetModel>> testResults = JsonNullable.<List<TestResultV2GetModel>>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_USER_NAME = "createdByUserName";
  private JsonNullable<String> createdByUserName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<List<AttachmentModel>> attachments = JsonNullable.<List<AttachmentModel>>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<List<LinkModel>> links = JsonNullable.<List<LinkModel>>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAUNCH_SOURCE = "launchSource";
  private JsonNullable<String> launchSource = JsonNullable.<String>undefined();

  public TestRunV2GetModel() { 
  }

  public TestRunV2GetModel startedOn(OffsetDateTime startedOn) {
    this.startedOn = JsonNullable.<OffsetDateTime>of(startedOn);
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getStartedOn() {
        return startedOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartedOn_JsonNullable() {
    return startedOn;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_ON)
  public void setStartedOn_JsonNullable(JsonNullable<OffsetDateTime> startedOn) {
    this.startedOn = startedOn;
  }

  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = JsonNullable.<OffsetDateTime>of(startedOn);
  }


  public TestRunV2GetModel completedOn(OffsetDateTime completedOn) {
    this.completedOn = JsonNullable.<OffsetDateTime>of(completedOn);
    return this;
  }

   /**
   * Get completedOn
   * @return completedOn
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCompletedOn() {
        return completedOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCompletedOn_JsonNullable() {
    return completedOn;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_ON)
  public void setCompletedOn_JsonNullable(JsonNullable<OffsetDateTime> completedOn) {
    this.completedOn = completedOn;
  }

  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = JsonNullable.<OffsetDateTime>of(completedOn);
  }


  public TestRunV2GetModel stateName(TestRunState stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestRunState getStateName() {
    return stateName;
  }


  @JsonProperty(JSON_PROPERTY_STATE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateName(TestRunState stateName) {
    this.stateName = stateName;
  }


  public TestRunV2GetModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link test run with project
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunV2GetModel testPlanId(UUID testPlanId) {
    this.testPlanId = JsonNullable.<UUID>of(testPlanId);
    return this;
  }

   /**
   * This property is used to link test run with test plan
   * @return testPlanId
  **/
  @jakarta.annotation.Nullable
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


  public TestRunV2GetModel testResults(List<TestResultV2GetModel> testResults) {
    this.testResults = JsonNullable.<List<TestResultV2GetModel>>of(testResults);
    return this;
  }

  public TestRunV2GetModel addTestResultsItem(TestResultV2GetModel testResultsItem) {
    if (this.testResults == null || !this.testResults.isPresent()) {
      this.testResults = JsonNullable.<List<TestResultV2GetModel>>of(new ArrayList<>());
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
  @JsonIgnore

  public List<TestResultV2GetModel> getTestResults() {
        return testResults.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestResultV2GetModel>> getTestResults_JsonNullable() {
    return testResults;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  public void setTestResults_JsonNullable(JsonNullable<List<TestResultV2GetModel>> testResults) {
    this.testResults = testResults;
  }

  public void setTestResults(List<TestResultV2GetModel> testResults) {
    this.testResults = JsonNullable.<List<TestResultV2GetModel>>of(testResults);
  }


  public TestRunV2GetModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestRunV2GetModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
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


  public TestRunV2GetModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getCreatedById() {
    return createdById;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestRunV2GetModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
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


  public TestRunV2GetModel createdByUserName(String createdByUserName) {
    this.createdByUserName = JsonNullable.<String>of(createdByUserName);
    return this;
  }

   /**
   * Get createdByUserName
   * @return createdByUserName
  **/
  @jakarta.annotation.Nullable
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


  public TestRunV2GetModel attachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
    return this;
  }

  public TestRunV2GetModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null || !this.attachments.isPresent()) {
      this.attachments = JsonNullable.<List<AttachmentModel>>of(new ArrayList<>());
    }
    try {
      this.attachments.get().add(attachmentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<AttachmentModel> getAttachments() {
        return attachments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AttachmentModel>> getAttachments_JsonNullable() {
    return attachments;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  public void setAttachments_JsonNullable(JsonNullable<List<AttachmentModel>> attachments) {
    this.attachments = attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
  }


  public TestRunV2GetModel links(List<LinkModel> links) {
    this.links = JsonNullable.<List<LinkModel>>of(links);
    return this;
  }

  public TestRunV2GetModel addLinksItem(LinkModel linksItem) {
    if (this.links == null || !this.links.isPresent()) {
      this.links = JsonNullable.<List<LinkModel>>of(new ArrayList<>());
    }
    try {
      this.links.get().add(linksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<LinkModel> getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<LinkModel>> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<List<LinkModel>> links) {
    this.links = links;
  }

  public void setLinks(List<LinkModel> links) {
    this.links = JsonNullable.<List<LinkModel>>of(links);
  }


  public TestRunV2GetModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TestRunV2GetModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TestRunV2GetModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
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


  public TestRunV2GetModel launchSource(String launchSource) {
    this.launchSource = JsonNullable.<String>of(launchSource);
    return this;
  }

   /**
   * Once launch source is specified it cannot be updated
   * @return launchSource
  **/
  @jakarta.annotation.Nullable
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


  /**
   * Return true if this TestRunV2GetModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunV2GetModel testRunV2GetModel = (TestRunV2GetModel) o;
    return equalsNullable(this.startedOn, testRunV2GetModel.startedOn) &&
        equalsNullable(this.completedOn, testRunV2GetModel.completedOn) &&
        Objects.equals(this.stateName, testRunV2GetModel.stateName) &&
        Objects.equals(this.projectId, testRunV2GetModel.projectId) &&
        equalsNullable(this.testPlanId, testRunV2GetModel.testPlanId) &&
        equalsNullable(this.testResults, testRunV2GetModel.testResults) &&
        Objects.equals(this.createdDate, testRunV2GetModel.createdDate) &&
        equalsNullable(this.modifiedDate, testRunV2GetModel.modifiedDate) &&
        Objects.equals(this.createdById, testRunV2GetModel.createdById) &&
        equalsNullable(this.modifiedById, testRunV2GetModel.modifiedById) &&
        equalsNullable(this.createdByUserName, testRunV2GetModel.createdByUserName) &&
        equalsNullable(this.attachments, testRunV2GetModel.attachments) &&
        equalsNullable(this.links, testRunV2GetModel.links) &&
        Objects.equals(this.id, testRunV2GetModel.id) &&
        Objects.equals(this.name, testRunV2GetModel.name) &&
        equalsNullable(this.description, testRunV2GetModel.description) &&
        equalsNullable(this.launchSource, testRunV2GetModel.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startedOn), hashCodeNullable(completedOn), stateName, projectId, hashCodeNullable(testPlanId), hashCodeNullable(testResults), createdDate, hashCodeNullable(modifiedDate), createdById, hashCodeNullable(modifiedById), hashCodeNullable(createdByUserName), hashCodeNullable(attachments), hashCodeNullable(links), id, name, hashCodeNullable(description), hashCodeNullable(launchSource));
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
    sb.append("class TestRunV2GetModel {\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdByUserName: ").append(toIndentedString(createdByUserName)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
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

