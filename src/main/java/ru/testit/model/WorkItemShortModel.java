/*
 * API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.testit.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import ru.testit.model.IterationModel;
import ru.testit.model.WorkItemPriorityModel;
/**
 * WorkItemShortModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class WorkItemShortModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("versionId")
  private UUID versionId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("entityTypeName")
  private String entityTypeName = null;

  @SerializedName("projectId")
  private UUID projectId = null;

  @SerializedName("sectionId")
  private UUID sectionId = null;

  @SerializedName("isAutomated")
  private Boolean isAutomated = null;

  @SerializedName("globalId")
  private Long globalId = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("attributes")
  private Map<String, Object> attributes = null;

  @SerializedName("createdById")
  private UUID createdById = null;

  @SerializedName("modifiedById")
  private UUID modifiedById = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("priority")
  private WorkItemPriorityModel priority = null;

  @SerializedName("isDeleted")
  private Boolean isDeleted = null;

  @SerializedName("tagNames")
  private List<String> tagNames = null;

  @SerializedName("iterations")
  private List<IterationModel> iterations = null;

  public WorkItemShortModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public WorkItemShortModel versionId(UUID versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * used for versioning changes in workitem
   * @return versionId
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", description = "used for versioning changes in workitem")
  public UUID getVersionId() {
    return versionId;
  }

  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }

  public WorkItemShortModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Performance test", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkItemShortModel entityTypeName(String entityTypeName) {
    this.entityTypeName = entityTypeName;
    return this;
  }

   /**
   * Property can have one of these values: CheckLists, SharedSteps, TestCases
   * @return entityTypeName
  **/
  @Schema(example = "SharedSteps", required = true, description = "Property can have one of these values: CheckLists, SharedSteps, TestCases")
  public String getEntityTypeName() {
    return entityTypeName;
  }

  public void setEntityTypeName(String entityTypeName) {
    this.entityTypeName = entityTypeName;
  }

  public WorkItemShortModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link autotest with project
   * @return projectId
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", required = true, description = "This property is used to link autotest with project")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public WorkItemShortModel sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * This property links workitem with section
   * @return sectionId
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", required = true, description = "This property links workitem with section")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public WorkItemShortModel isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  public WorkItemShortModel globalId(Long globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @Schema(example = "1000", description = "")
  public Long getGlobalId() {
    return globalId;
  }

  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }

  public WorkItemShortModel duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(example = "1000", description = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public WorkItemShortModel attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public WorkItemShortModel putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public WorkItemShortModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", description = "")
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }

  public WorkItemShortModel modifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", description = "")
  public UUID getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }

  public WorkItemShortModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @Schema(example = "2022-06-30T11:46:45.461804600Z", description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public WorkItemShortModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @Schema(example = "2022-06-30T11:46:45.461804600Z", description = "")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public WorkItemShortModel state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Property can have one of these values: NeedsWork, NotReady, Ready
   * @return state
  **/
  @Schema(example = "Ready", required = true, description = "Property can have one of these values: NeedsWork, NotReady, Ready")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public WorkItemShortModel priority(WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(required = true, description = "")
  public WorkItemPriorityModel getPriority() {
    return priority;
  }

  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }

  public WorkItemShortModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public WorkItemShortModel tagNames(List<String> tagNames) {
    this.tagNames = tagNames;
    return this;
  }

  public WorkItemShortModel addTagNamesItem(String tagNamesItem) {
    if (this.tagNames == null) {
      this.tagNames = new ArrayList<String>();
    }
    this.tagNames.add(tagNamesItem);
    return this;
  }

   /**
   * Get tagNames
   * @return tagNames
  **/
  @Schema(description = "")
  public List<String> getTagNames() {
    return tagNames;
  }

  public void setTagNames(List<String> tagNames) {
    this.tagNames = tagNames;
  }

  public WorkItemShortModel iterations(List<IterationModel> iterations) {
    this.iterations = iterations;
    return this;
  }

  public WorkItemShortModel addIterationsItem(IterationModel iterationsItem) {
    if (this.iterations == null) {
      this.iterations = new ArrayList<IterationModel>();
    }
    this.iterations.add(iterationsItem);
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @Schema(description = "")
  public List<IterationModel> getIterations() {
    return iterations;
  }

  public void setIterations(List<IterationModel> iterations) {
    this.iterations = iterations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemShortModel workItemShortModel = (WorkItemShortModel) o;
    return Objects.equals(this.id, workItemShortModel.id) &&
        Objects.equals(this.versionId, workItemShortModel.versionId) &&
        Objects.equals(this.name, workItemShortModel.name) &&
        Objects.equals(this.entityTypeName, workItemShortModel.entityTypeName) &&
        Objects.equals(this.projectId, workItemShortModel.projectId) &&
        Objects.equals(this.sectionId, workItemShortModel.sectionId) &&
        Objects.equals(this.isAutomated, workItemShortModel.isAutomated) &&
        Objects.equals(this.globalId, workItemShortModel.globalId) &&
        Objects.equals(this.duration, workItemShortModel.duration) &&
        Objects.equals(this.attributes, workItemShortModel.attributes) &&
        Objects.equals(this.createdById, workItemShortModel.createdById) &&
        Objects.equals(this.modifiedById, workItemShortModel.modifiedById) &&
        Objects.equals(this.createdDate, workItemShortModel.createdDate) &&
        Objects.equals(this.modifiedDate, workItemShortModel.modifiedDate) &&
        Objects.equals(this.state, workItemShortModel.state) &&
        Objects.equals(this.priority, workItemShortModel.priority) &&
        Objects.equals(this.isDeleted, workItemShortModel.isDeleted) &&
        Objects.equals(this.tagNames, workItemShortModel.tagNames) &&
        Objects.equals(this.iterations, workItemShortModel.iterations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionId, name, entityTypeName, projectId, sectionId, isAutomated, globalId, duration, attributes, createdById, modifiedById, createdDate, modifiedDate, state, priority, isDeleted, tagNames, iterations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemShortModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
