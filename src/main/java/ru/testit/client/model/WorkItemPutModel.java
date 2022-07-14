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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentPutModel;
import ru.testit.client.model.AutoTestIdModel;
import ru.testit.client.model.IterationPutModel;
import ru.testit.client.model.LinkPutModel;
import ru.testit.client.model.StepPutModel;
import ru.testit.client.model.TagShortModel;
import ru.testit.client.model.WorkItemPriorityModel;
import ru.testit.client.model.WorkItemStates;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * WorkItemPutModel
 */
@JsonPropertyOrder({
  WorkItemPutModel.JSON_PROPERTY_ATTACHMENTS,
  WorkItemPutModel.JSON_PROPERTY_ITERATIONS,
  WorkItemPutModel.JSON_PROPERTY_AUTO_TESTS,
  WorkItemPutModel.JSON_PROPERTY_ID,
  WorkItemPutModel.JSON_PROPERTY_SECTION_ID,
  WorkItemPutModel.JSON_PROPERTY_DESCRIPTION,
  WorkItemPutModel.JSON_PROPERTY_STATE,
  WorkItemPutModel.JSON_PROPERTY_PRIORITY,
  WorkItemPutModel.JSON_PROPERTY_STEPS,
  WorkItemPutModel.JSON_PROPERTY_PRECONDITION_STEPS,
  WorkItemPutModel.JSON_PROPERTY_POSTCONDITION_STEPS,
  WorkItemPutModel.JSON_PROPERTY_DURATION,
  WorkItemPutModel.JSON_PROPERTY_ATTRIBUTES,
  WorkItemPutModel.JSON_PROPERTY_TAGS,
  WorkItemPutModel.JSON_PROPERTY_LINKS,
  WorkItemPutModel.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemPutModel {
  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private List<AttachmentPutModel> attachments = new ArrayList<>();

  public static final String JSON_PROPERTY_ITERATIONS = "iterations";
  private JsonNullable<List<IterationPutModel>> iterations = JsonNullable.<List<IterationPutModel>>undefined();

  public static final String JSON_PROPERTY_AUTO_TESTS = "autoTests";
  private JsonNullable<List<AutoTestIdModel>> autoTests = JsonNullable.<List<AutoTestIdModel>>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SECTION_ID = "sectionId";
  private UUID sectionId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private WorkItemStates state;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private WorkItemPriorityModel priority;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<StepPutModel> steps = new ArrayList<>();

  public static final String JSON_PROPERTY_PRECONDITION_STEPS = "preconditionSteps";
  private List<StepPutModel> preconditionSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_POSTCONDITION_STEPS = "postconditionSteps";
  private List<StepPutModel> postconditionSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagShortModel> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<LinkPutModel> links = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public WorkItemPutModel() { 
  }

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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }


  public WorkItemPutModel iterations(List<IterationPutModel> iterations) {
    this.iterations = JsonNullable.<List<IterationPutModel>>of(iterations);
    return this;
  }

  public WorkItemPutModel addIterationsItem(IterationPutModel iterationsItem) {
    if (this.iterations == null || !this.iterations.isPresent()) {
      this.iterations = JsonNullable.<List<IterationPutModel>>of(new ArrayList<>());
    }
    try {
      this.iterations.get().add(iterationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<IterationPutModel> getIterations() {
        return iterations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ITERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<IterationPutModel>> getIterations_JsonNullable() {
    return iterations;
  }
  
  @JsonProperty(JSON_PROPERTY_ITERATIONS)
  public void setIterations_JsonNullable(JsonNullable<List<IterationPutModel>> iterations) {
    this.iterations = iterations;
  }

  public void setIterations(List<IterationPutModel> iterations) {
    this.iterations = JsonNullable.<List<IterationPutModel>>of(iterations);
  }


  public WorkItemPutModel autoTests(List<AutoTestIdModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestIdModel>>of(autoTests);
    return this;
  }

  public WorkItemPutModel addAutoTestsItem(AutoTestIdModel autoTestsItem) {
    if (this.autoTests == null || !this.autoTests.isPresent()) {
      this.autoTests = JsonNullable.<List<AutoTestIdModel>>of(new ArrayList<>());
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

  public List<AutoTestIdModel> getAutoTests() {
        return autoTests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestIdModel>> getAutoTests_JsonNullable() {
    return autoTests;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  public void setAutoTests_JsonNullable(JsonNullable<List<AutoTestIdModel>> autoTests) {
    this.autoTests = autoTests;
  }

  public void setAutoTests(List<AutoTestIdModel> autoTests) {
    this.autoTests = JsonNullable.<List<AutoTestIdModel>>of(autoTests);
  }


  public WorkItemPutModel id(UUID id) {
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


  public WorkItemPutModel sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSectionId() {
    return sectionId;
  }


  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }


  public WorkItemPutModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "This is a basic test template", value = "")
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


  public WorkItemPutModel state(WorkItemStates state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkItemStates getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkItemPriorityModel getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StepPutModel> getSteps() {
    return steps;
  }


  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StepPutModel> getPreconditionSteps() {
    return preconditionSteps;
  }


  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StepPutModel> getPostconditionSteps() {
    return postconditionSteps;
  }


  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TagShortModel> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LinkPutModel> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Basic template", required = true, value = "")
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


  /**
   * Return true if this WorkItemPutModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemPutModel workItemPutModel = (WorkItemPutModel) o;
    return Objects.equals(this.attachments, workItemPutModel.attachments) &&
        equalsNullable(this.iterations, workItemPutModel.iterations) &&
        equalsNullable(this.autoTests, workItemPutModel.autoTests) &&
        Objects.equals(this.id, workItemPutModel.id) &&
        Objects.equals(this.sectionId, workItemPutModel.sectionId) &&
        equalsNullable(this.description, workItemPutModel.description) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, hashCodeNullable(iterations), hashCodeNullable(autoTests), id, sectionId, hashCodeNullable(description), state, priority, steps, preconditionSteps, postconditionSteps, duration, attributes, tags, links, name);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

