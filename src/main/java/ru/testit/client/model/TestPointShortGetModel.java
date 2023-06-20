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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.LastTestResultModel;
import ru.testit.client.model.TestPointStatus;
import ru.testit.client.model.WorkItemPriorityModel;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * TestPointShortGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointShortGetModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_TESTER_ID = "testerId";
  @SerializedName(SERIALIZED_NAME_TESTER_ID)
  private UUID testerId;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<String> links = null;

  public static final String SERIALIZED_NAME_TEST_SUITE_ID = "testSuiteId";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE_ID)
  private UUID testSuiteId;

  public static final String SERIALIZED_NAME_WORK_ITEM_ID = "workItemId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_ID)
  private UUID workItemId;

  public static final String SERIALIZED_NAME_WORK_ITEM_GLOBAL_ID = "workItemGlobalId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_GLOBAL_ID)
  private Long workItemGlobalId;

  public static final String SERIALIZED_NAME_WORK_ITEM_VERSION_ID = "workItemVersionId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_VERSION_ID)
  private UUID workItemVersionId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TestPointStatus status;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private WorkItemPriorityModel priority;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_SECTION_ID = "sectionId";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private UUID sectionId;

  public static final String SERIALIZED_NAME_SECTION_NAME = "sectionName";
  @SerializedName(SERIALIZED_NAME_SECTION_NAME)
  private String sectionName;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT = "lastTestResult";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT)
  private LastTestResultModel lastTestResult;

  public static final String SERIALIZED_NAME_ITERATION_ID = "iterationId";
  @SerializedName(SERIALIZED_NAME_ITERATION_ID)
  private UUID iterationId;

  public TestPointShortGetModel() {
  }

  public TestPointShortGetModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the test point
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test point")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestPointShortGetModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Creation date of the test point
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation date of the test point")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestPointShortGetModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Unique ID of the test point creator
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test point creator")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestPointShortGetModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Last modification date of the test point
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last modification date of the test point")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestPointShortGetModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Unique ID of the test point last editor
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test point last editor")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public TestPointShortGetModel testerId(UUID testerId) {
    
    this.testerId = testerId;
    return this;
  }

   /**
   * Unique ID of the test point assigned user
   * @return testerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test point assigned user")

  public UUID getTesterId() {
    return testerId;
  }


  public void setTesterId(UUID testerId) {
    this.testerId = testerId;
  }


  public TestPointShortGetModel parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public TestPointShortGetModel putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Collection of the test point parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the test point parameters")

  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public TestPointShortGetModel attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TestPointShortGetModel putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Collection of attributes of work item the test point represents
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of attributes of work item the test point represents")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public TestPointShortGetModel tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public TestPointShortGetModel addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Collection of the test point tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the test point tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TestPointShortGetModel links(List<String> links) {
    
    this.links = links;
    return this;
  }

  public TestPointShortGetModel addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of the test point links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the test point links")

  public List<String> getLinks() {
    return links;
  }


  public void setLinks(List<String> links) {
    this.links = links;
  }


  public TestPointShortGetModel testSuiteId(UUID testSuiteId) {
    
    this.testSuiteId = testSuiteId;
    return this;
  }

   /**
   * Unique ID of test suite the test point assigned to
   * @return testSuiteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of test suite the test point assigned to")

  public UUID getTestSuiteId() {
    return testSuiteId;
  }


  public void setTestSuiteId(UUID testSuiteId) {
    this.testSuiteId = testSuiteId;
  }


  public TestPointShortGetModel workItemId(UUID workItemId) {
    
    this.workItemId = workItemId;
    return this;
  }

   /**
   * Unique ID of work item the test point represents
   * @return workItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of work item the test point represents")

  public UUID getWorkItemId() {
    return workItemId;
  }


  public void setWorkItemId(UUID workItemId) {
    this.workItemId = workItemId;
  }


  public TestPointShortGetModel workItemGlobalId(Long workItemGlobalId) {
    
    this.workItemGlobalId = workItemGlobalId;
    return this;
  }

   /**
   * Global ID of work item the test point represents
   * @return workItemGlobalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global ID of work item the test point represents")

  public Long getWorkItemGlobalId() {
    return workItemGlobalId;
  }


  public void setWorkItemGlobalId(Long workItemGlobalId) {
    this.workItemGlobalId = workItemGlobalId;
  }


  public TestPointShortGetModel workItemVersionId(UUID workItemVersionId) {
    
    this.workItemVersionId = workItemVersionId;
    return this;
  }

   /**
   * Unique ID of work item version the test point represents
   * @return workItemVersionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of work item version the test point represents")

  public UUID getWorkItemVersionId() {
    return workItemVersionId;
  }


  public void setWorkItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
  }


  public TestPointShortGetModel status(TestPointStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TestPointStatus getStatus() {
    return status;
  }


  public void setStatus(TestPointStatus status) {
    this.status = status;
  }


  public TestPointShortGetModel priority(WorkItemPriorityModel priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkItemPriorityModel getPriority() {
    return priority;
  }


  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }


  public TestPointShortGetModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Indicates if the test point represents an autotest
   * @return isAutomated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the test point represents an autotest")

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public TestPointShortGetModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the test point
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the test point")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestPointShortGetModel configurationId(UUID configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Unique ID of the test point configuration
   * @return configurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test point configuration")

  public UUID getConfigurationId() {
    return configurationId;
  }


  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestPointShortGetModel duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the test point
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duration of the test point")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public TestPointShortGetModel sectionId(UUID sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Unique ID of section where work item the test point represents is located
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of section where work item the test point represents is located")

  public UUID getSectionId() {
    return sectionId;
  }


  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }


  public TestPointShortGetModel sectionName(String sectionName) {
    
    this.sectionName = sectionName;
    return this;
  }

   /**
   * Name of section where work item the test point represents is located
   * @return sectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of section where work item the test point represents is located")

  public String getSectionName() {
    return sectionName;
  }


  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }


  public TestPointShortGetModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Unique ID of the test point project
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test point project")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestPointShortGetModel lastTestResult(LastTestResultModel lastTestResult) {
    
    this.lastTestResult = lastTestResult;
    return this;
  }

   /**
   * Get lastTestResult
   * @return lastTestResult
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LastTestResultModel getLastTestResult() {
    return lastTestResult;
  }


  public void setLastTestResult(LastTestResultModel lastTestResult) {
    this.lastTestResult = lastTestResult;
  }


  public TestPointShortGetModel iterationId(UUID iterationId) {
    
    this.iterationId = iterationId;
    return this;
  }

   /**
   * Unique ID of work item iteration the test point represents
   * @return iterationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of work item iteration the test point represents")

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
    TestPointShortGetModel testPointShortGetModel = (TestPointShortGetModel) o;
    return Objects.equals(this.id, testPointShortGetModel.id) &&
        Objects.equals(this.createdDate, testPointShortGetModel.createdDate) &&
        Objects.equals(this.createdById, testPointShortGetModel.createdById) &&
        Objects.equals(this.modifiedDate, testPointShortGetModel.modifiedDate) &&
        Objects.equals(this.modifiedById, testPointShortGetModel.modifiedById) &&
        Objects.equals(this.testerId, testPointShortGetModel.testerId) &&
        Objects.equals(this.parameters, testPointShortGetModel.parameters) &&
        Objects.equals(this.attributes, testPointShortGetModel.attributes) &&
        Objects.equals(this.tags, testPointShortGetModel.tags) &&
        Objects.equals(this.links, testPointShortGetModel.links) &&
        Objects.equals(this.testSuiteId, testPointShortGetModel.testSuiteId) &&
        Objects.equals(this.workItemId, testPointShortGetModel.workItemId) &&
        Objects.equals(this.workItemGlobalId, testPointShortGetModel.workItemGlobalId) &&
        Objects.equals(this.workItemVersionId, testPointShortGetModel.workItemVersionId) &&
        Objects.equals(this.status, testPointShortGetModel.status) &&
        Objects.equals(this.priority, testPointShortGetModel.priority) &&
        Objects.equals(this.isAutomated, testPointShortGetModel.isAutomated) &&
        Objects.equals(this.name, testPointShortGetModel.name) &&
        Objects.equals(this.configurationId, testPointShortGetModel.configurationId) &&
        Objects.equals(this.duration, testPointShortGetModel.duration) &&
        Objects.equals(this.sectionId, testPointShortGetModel.sectionId) &&
        Objects.equals(this.sectionName, testPointShortGetModel.sectionName) &&
        Objects.equals(this.projectId, testPointShortGetModel.projectId) &&
        Objects.equals(this.lastTestResult, testPointShortGetModel.lastTestResult) &&
        Objects.equals(this.iterationId, testPointShortGetModel.iterationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, createdById, modifiedDate, modifiedById, testerId, parameters, attributes, tags, links, testSuiteId, workItemId, workItemGlobalId, workItemVersionId, status, priority, isAutomated, name, configurationId, duration, sectionId, sectionName, projectId, lastTestResult, iterationId);
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
    sb.append("class TestPointShortGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    testerId: ").append(toIndentedString(testerId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
    sb.append("    workItemGlobalId: ").append(toIndentedString(workItemGlobalId)).append("\n");
    sb.append("    workItemVersionId: ").append(toIndentedString(workItemVersionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    lastTestResult: ").append(toIndentedString(lastTestResult)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("createdDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedById");
    openapiFields.add("testerId");
    openapiFields.add("parameters");
    openapiFields.add("attributes");
    openapiFields.add("tags");
    openapiFields.add("links");
    openapiFields.add("testSuiteId");
    openapiFields.add("workItemId");
    openapiFields.add("workItemGlobalId");
    openapiFields.add("workItemVersionId");
    openapiFields.add("status");
    openapiFields.add("priority");
    openapiFields.add("isAutomated");
    openapiFields.add("name");
    openapiFields.add("configurationId");
    openapiFields.add("duration");
    openapiFields.add("sectionId");
    openapiFields.add("sectionName");
    openapiFields.add("projectId");
    openapiFields.add("lastTestResult");
    openapiFields.add("iterationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("lastTestResult");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPointShortGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPointShortGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPointShortGetModel is not found in the empty JSON string", TestPointShortGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPointShortGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPointShortGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestPointShortGetModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if ((jsonObj.get("testerId") != null && !jsonObj.get("testerId").isJsonNull()) && !jsonObj.get("testerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if ((jsonObj.get("testSuiteId") != null && !jsonObj.get("testSuiteId").isJsonNull()) && !jsonObj.get("testSuiteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testSuiteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testSuiteId").toString()));
      }
      if ((jsonObj.get("workItemId") != null && !jsonObj.get("workItemId").isJsonNull()) && !jsonObj.get("workItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemId").toString()));
      }
      if ((jsonObj.get("workItemVersionId") != null && !jsonObj.get("workItemVersionId").isJsonNull()) && !jsonObj.get("workItemVersionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemVersionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemVersionId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("configurationId") != null && !jsonObj.get("configurationId").isJsonNull()) && !jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if ((jsonObj.get("sectionId") != null && !jsonObj.get("sectionId").isJsonNull()) && !jsonObj.get("sectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionId").toString()));
      }
      if ((jsonObj.get("sectionName") != null && !jsonObj.get("sectionName").isJsonNull()) && !jsonObj.get("sectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionName").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      // validate the required field `lastTestResult`
      LastTestResultModel.validateJsonObject(jsonObj.getAsJsonObject("lastTestResult"));
      if ((jsonObj.get("iterationId") != null && !jsonObj.get("iterationId").isJsonNull()) && !jsonObj.get("iterationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iterationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iterationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPointShortGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPointShortGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPointShortGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPointShortGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPointShortGetModel>() {
           @Override
           public void write(JsonWriter out, TestPointShortGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPointShortGetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPointShortGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPointShortGetModel
  * @throws IOException if the JSON string is invalid with respect to TestPointShortGetModel
  */
  public static TestPointShortGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPointShortGetModel.class);
  }

 /**
  * Convert an instance of TestPointShortGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

