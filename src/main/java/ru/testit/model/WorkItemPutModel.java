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
import ru.testit.model.AttachmentPutModel;
import ru.testit.model.AutoTestIdModel;
import ru.testit.model.IterationPutModel;
import ru.testit.model.LinkPutModel;
import ru.testit.model.StepPutModel;
import ru.testit.model.TagShortModel;
import ru.testit.model.WorkItemPriorityModel;
import ru.testit.model.WorkItemStates;
/**
 * WorkItemPutModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-12T16:29:55.695125+03:00[Europe/Moscow]")
public class WorkItemPutModel {
  @SerializedName("attachments")
  private List<AttachmentPutModel> attachments = new ArrayList<AttachmentPutModel>();

  @SerializedName("iterations")
  private List<IterationPutModel> iterations = null;

  @SerializedName("autoTests")
  private List<AutoTestIdModel> autoTests = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("sectionId")
  private UUID sectionId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("state")
  private WorkItemStates state = null;

  @SerializedName("priority")
  private WorkItemPriorityModel priority = null;

  @SerializedName("steps")
  private List<StepPutModel> steps = new ArrayList<StepPutModel>();

  @SerializedName("preconditionSteps")
  private List<StepPutModel> preconditionSteps = new ArrayList<StepPutModel>();

  @SerializedName("postconditionSteps")
  private List<StepPutModel> postconditionSteps = new ArrayList<StepPutModel>();

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("attributes")
  private Map<String, Object> attributes = new HashMap<String, Object>();

  @SerializedName("tags")
  private List<TagShortModel> tags = new ArrayList<TagShortModel>();

  @SerializedName("links")
  private List<LinkPutModel> links = new ArrayList<LinkPutModel>();

  @SerializedName("name")
  private String name = null;

  public WorkItemPutModel attachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public WorkItemPutModel addAttachmentsItem(AttachmentPutModel attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @Schema(required = true, description = "")
  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }

  public WorkItemPutModel iterations(List<IterationPutModel> iterations) {
    this.iterations = iterations;
    return this;
  }

  public WorkItemPutModel addIterationsItem(IterationPutModel iterationsItem) {
    if (this.iterations == null) {
      this.iterations = new ArrayList<IterationPutModel>();
    }
    this.iterations.add(iterationsItem);
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @Schema(description = "")
  public List<IterationPutModel> getIterations() {
    return iterations;
  }

  public void setIterations(List<IterationPutModel> iterations) {
    this.iterations = iterations;
  }

  public WorkItemPutModel autoTests(List<AutoTestIdModel> autoTests) {
    this.autoTests = autoTests;
    return this;
  }

  public WorkItemPutModel addAutoTestsItem(AutoTestIdModel autoTestsItem) {
    if (this.autoTests == null) {
      this.autoTests = new ArrayList<AutoTestIdModel>();
    }
    this.autoTests.add(autoTestsItem);
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
  @Schema(description = "")
  public List<AutoTestIdModel> getAutoTests() {
    return autoTests;
  }

  public void setAutoTests(List<AutoTestIdModel> autoTests) {
    this.autoTests = autoTests;
  }

  public WorkItemPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "a70fa497-5526-4fb2-8f44-749ea5533c00", description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public WorkItemPutModel sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @Schema(example = "a70fa497-5526-4fb2-8f44-749ea5533c00", description = "")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public WorkItemPutModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "This is a basic test template", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkItemPutModel state(WorkItemStates state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(required = true, description = "")
  public WorkItemStates getState() {
    return state;
  }

  public void setState(WorkItemStates state) {
    this.state = state;
  }

  public WorkItemPutModel priority(WorkItemPriorityModel priority) {
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

  public WorkItemPutModel steps(List<StepPutModel> steps) {
    this.steps = steps;
    return this;
  }

  public WorkItemPutModel addStepsItem(StepPutModel stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @Schema(required = true, description = "")
  public List<StepPutModel> getSteps() {
    return steps;
  }

  public void setSteps(List<StepPutModel> steps) {
    this.steps = steps;
  }

  public WorkItemPutModel preconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public WorkItemPutModel addPreconditionStepsItem(StepPutModel preconditionStepsItem) {
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @Schema(required = true, description = "")
  public List<StepPutModel> getPreconditionSteps() {
    return preconditionSteps;
  }

  public void setPreconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }

  public WorkItemPutModel postconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public WorkItemPutModel addPostconditionStepsItem(StepPutModel postconditionStepsItem) {
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @Schema(required = true, description = "")
  public List<StepPutModel> getPostconditionSteps() {
    return postconditionSteps;
  }

  public void setPostconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }

  public WorkItemPutModel duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * minimum: 0
   * maximum: 86400
   * @return duration
  **/
  @Schema(example = "10000", description = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public WorkItemPutModel attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public WorkItemPutModel putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public WorkItemPutModel tags(List<TagShortModel> tags) {
    this.tags = tags;
    return this;
  }

  public WorkItemPutModel addTagsItem(TagShortModel tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(required = true, description = "")
  public List<TagShortModel> getTags() {
    return tags;
  }

  public void setTags(List<TagShortModel> tags) {
    this.tags = tags;
  }

  public WorkItemPutModel links(List<LinkPutModel> links) {
    this.links = links;
    return this;
  }

  public WorkItemPutModel addLinksItem(LinkPutModel linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(required = true, description = "")
  public List<LinkPutModel> getLinks() {
    return links;
  }

  public void setLinks(List<LinkPutModel> links) {
    this.links = links;
  }

  public WorkItemPutModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Basic template", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemPutModel workItemPutModel = (WorkItemPutModel) o;
    return Objects.equals(this.attachments, workItemPutModel.attachments) &&
        Objects.equals(this.iterations, workItemPutModel.iterations) &&
        Objects.equals(this.autoTests, workItemPutModel.autoTests) &&
        Objects.equals(this.id, workItemPutModel.id) &&
        Objects.equals(this.sectionId, workItemPutModel.sectionId) &&
        Objects.equals(this.description, workItemPutModel.description) &&
        Objects.equals(this.state, workItemPutModel.state) &&
        Objects.equals(this.priority, workItemPutModel.priority) &&
        Objects.equals(this.steps, workItemPutModel.steps) &&
        Objects.equals(this.preconditionSteps, workItemPutModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, workItemPutModel.postconditionSteps) &&
        Objects.equals(this.duration, workItemPutModel.duration) &&
        Objects.equals(this.attributes, workItemPutModel.attributes) &&
        Objects.equals(this.tags, workItemPutModel.tags) &&
        Objects.equals(this.links, workItemPutModel.links) &&
        Objects.equals(this.name, workItemPutModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, iterations, autoTests, id, sectionId, description, state, priority, steps, preconditionSteps, postconditionSteps, duration, attributes, tags, links, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemPutModel {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
