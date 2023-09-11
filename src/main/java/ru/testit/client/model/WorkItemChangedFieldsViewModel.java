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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentChangeViewModelArrayChangedFieldViewModel;
import ru.testit.client.model.AutoTestChangeViewModelArrayChangedFieldViewModel;
import ru.testit.client.model.BooleanChangedFieldViewModel;
import ru.testit.client.model.GuidChangedFieldViewModel;
import ru.testit.client.model.Int32ChangedFieldViewModel;
import ru.testit.client.model.Int64ChangedFieldViewModel;
import ru.testit.client.model.StringArrayChangedFieldViewModel;
import ru.testit.client.model.StringChangedFieldViewModel;
import ru.testit.client.model.StringChangedFieldWithDiffsViewModel;
import ru.testit.client.model.WorkItemChangedAttributeViewModel;
import ru.testit.client.model.WorkItemLinkChangeViewModelArrayChangedFieldViewModel;
import ru.testit.client.model.WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * WorkItemChangedFieldsViewModel
 */
@JsonPropertyOrder({
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_NAME,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_IS_DELETED,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_PROJECT_ID,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_IS_AUTOMATED,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_SECTION_ID,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_DESCRIPTION,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_STATE,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_PRIORITY,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_DURATION,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_ATTRIBUTES,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_STEPS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_PRECONDITION_STEPS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_POSTCONDITION_STEPS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_AUTO_TESTS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_ATTACHMENTS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_TAGS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_LINKS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_GLOBAL_ID,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_VERSION_NUMBER,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_ENTITY_TYPE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemChangedFieldsViewModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<StringChangedFieldWithDiffsViewModel> name = JsonNullable.<StringChangedFieldWithDiffsViewModel>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private JsonNullable<BooleanChangedFieldViewModel> isDeleted = JsonNullable.<BooleanChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private JsonNullable<GuidChangedFieldViewModel> projectId = JsonNullable.<GuidChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_IS_AUTOMATED = "isAutomated";
  private JsonNullable<BooleanChangedFieldViewModel> isAutomated = JsonNullable.<BooleanChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_SECTION_ID = "sectionId";
  private JsonNullable<GuidChangedFieldViewModel> sectionId = JsonNullable.<GuidChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<StringChangedFieldWithDiffsViewModel> description = JsonNullable.<StringChangedFieldWithDiffsViewModel>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<StringChangedFieldViewModel> state = JsonNullable.<StringChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<StringChangedFieldViewModel> priority = JsonNullable.<StringChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<Int32ChangedFieldViewModel> duration = JsonNullable.<Int32ChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, WorkItemChangedAttributeViewModel>> attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>undefined();

  public static final String JSON_PROPERTY_STEPS = "steps";
  private JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> steps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>undefined();

  public static final String JSON_PROPERTY_PRECONDITION_STEPS = "preconditionSteps";
  private JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> preconditionSteps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>undefined();

  public static final String JSON_PROPERTY_POSTCONDITION_STEPS = "postconditionSteps";
  private JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> postconditionSteps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>undefined();

  public static final String JSON_PROPERTY_AUTO_TESTS = "autoTests";
  private JsonNullable<AutoTestChangeViewModelArrayChangedFieldViewModel> autoTests = JsonNullable.<AutoTestChangeViewModelArrayChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<AttachmentChangeViewModelArrayChangedFieldViewModel> attachments = JsonNullable.<AttachmentChangeViewModelArrayChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<StringArrayChangedFieldViewModel> tags = JsonNullable.<StringArrayChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<WorkItemLinkChangeViewModelArrayChangedFieldViewModel> links = JsonNullable.<WorkItemLinkChangeViewModelArrayChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private JsonNullable<Int64ChangedFieldViewModel> globalId = JsonNullable.<Int64ChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_VERSION_NUMBER = "versionNumber";
  private JsonNullable<Int32ChangedFieldViewModel> versionNumber = JsonNullable.<Int32ChangedFieldViewModel>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPE_NAME = "entityTypeName";
  private JsonNullable<StringChangedFieldViewModel> entityTypeName = JsonNullable.<StringChangedFieldViewModel>undefined();

  public WorkItemChangedFieldsViewModel() { 
  }

  public WorkItemChangedFieldsViewModel name(StringChangedFieldWithDiffsViewModel name) {
    this.name = JsonNullable.<StringChangedFieldWithDiffsViewModel>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public StringChangedFieldWithDiffsViewModel getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StringChangedFieldWithDiffsViewModel> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<StringChangedFieldWithDiffsViewModel> name) {
    this.name = name;
  }

  public void setName(StringChangedFieldWithDiffsViewModel name) {
    this.name = JsonNullable.<StringChangedFieldWithDiffsViewModel>of(name);
  }


  public WorkItemChangedFieldsViewModel isDeleted(BooleanChangedFieldViewModel isDeleted) {
    this.isDeleted = JsonNullable.<BooleanChangedFieldViewModel>of(isDeleted);
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BooleanChangedFieldViewModel getIsDeleted() {
        return isDeleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BooleanChangedFieldViewModel> getIsDeleted_JsonNullable() {
    return isDeleted;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  public void setIsDeleted_JsonNullable(JsonNullable<BooleanChangedFieldViewModel> isDeleted) {
    this.isDeleted = isDeleted;
  }

  public void setIsDeleted(BooleanChangedFieldViewModel isDeleted) {
    this.isDeleted = JsonNullable.<BooleanChangedFieldViewModel>of(isDeleted);
  }


  public WorkItemChangedFieldsViewModel projectId(GuidChangedFieldViewModel projectId) {
    this.projectId = JsonNullable.<GuidChangedFieldViewModel>of(projectId);
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public GuidChangedFieldViewModel getProjectId() {
        return projectId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<GuidChangedFieldViewModel> getProjectId_JsonNullable() {
    return projectId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  public void setProjectId_JsonNullable(JsonNullable<GuidChangedFieldViewModel> projectId) {
    this.projectId = projectId;
  }

  public void setProjectId(GuidChangedFieldViewModel projectId) {
    this.projectId = JsonNullable.<GuidChangedFieldViewModel>of(projectId);
  }


  public WorkItemChangedFieldsViewModel isAutomated(BooleanChangedFieldViewModel isAutomated) {
    this.isAutomated = JsonNullable.<BooleanChangedFieldViewModel>of(isAutomated);
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BooleanChangedFieldViewModel getIsAutomated() {
        return isAutomated.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BooleanChangedFieldViewModel> getIsAutomated_JsonNullable() {
    return isAutomated;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  public void setIsAutomated_JsonNullable(JsonNullable<BooleanChangedFieldViewModel> isAutomated) {
    this.isAutomated = isAutomated;
  }

  public void setIsAutomated(BooleanChangedFieldViewModel isAutomated) {
    this.isAutomated = JsonNullable.<BooleanChangedFieldViewModel>of(isAutomated);
  }


  public WorkItemChangedFieldsViewModel sectionId(GuidChangedFieldViewModel sectionId) {
    this.sectionId = JsonNullable.<GuidChangedFieldViewModel>of(sectionId);
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public GuidChangedFieldViewModel getSectionId() {
        return sectionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<GuidChangedFieldViewModel> getSectionId_JsonNullable() {
    return sectionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  public void setSectionId_JsonNullable(JsonNullable<GuidChangedFieldViewModel> sectionId) {
    this.sectionId = sectionId;
  }

  public void setSectionId(GuidChangedFieldViewModel sectionId) {
    this.sectionId = JsonNullable.<GuidChangedFieldViewModel>of(sectionId);
  }


  public WorkItemChangedFieldsViewModel description(StringChangedFieldWithDiffsViewModel description) {
    this.description = JsonNullable.<StringChangedFieldWithDiffsViewModel>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public StringChangedFieldWithDiffsViewModel getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StringChangedFieldWithDiffsViewModel> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<StringChangedFieldWithDiffsViewModel> description) {
    this.description = description;
  }

  public void setDescription(StringChangedFieldWithDiffsViewModel description) {
    this.description = JsonNullable.<StringChangedFieldWithDiffsViewModel>of(description);
  }


  public WorkItemChangedFieldsViewModel state(StringChangedFieldViewModel state) {
    this.state = JsonNullable.<StringChangedFieldViewModel>of(state);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public StringChangedFieldViewModel getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StringChangedFieldViewModel> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<StringChangedFieldViewModel> state) {
    this.state = state;
  }

  public void setState(StringChangedFieldViewModel state) {
    this.state = JsonNullable.<StringChangedFieldViewModel>of(state);
  }


  public WorkItemChangedFieldsViewModel priority(StringChangedFieldViewModel priority) {
    this.priority = JsonNullable.<StringChangedFieldViewModel>of(priority);
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public StringChangedFieldViewModel getPriority() {
        return priority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StringChangedFieldViewModel> getPriority_JsonNullable() {
    return priority;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  public void setPriority_JsonNullable(JsonNullable<StringChangedFieldViewModel> priority) {
    this.priority = priority;
  }

  public void setPriority(StringChangedFieldViewModel priority) {
    this.priority = JsonNullable.<StringChangedFieldViewModel>of(priority);
  }


  public WorkItemChangedFieldsViewModel duration(Int32ChangedFieldViewModel duration) {
    this.duration = JsonNullable.<Int32ChangedFieldViewModel>of(duration);
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Int32ChangedFieldViewModel getDuration() {
        return duration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Int32ChangedFieldViewModel> getDuration_JsonNullable() {
    return duration;
  }
  
  @JsonProperty(JSON_PROPERTY_DURATION)
  public void setDuration_JsonNullable(JsonNullable<Int32ChangedFieldViewModel> duration) {
    this.duration = duration;
  }

  public void setDuration(Int32ChangedFieldViewModel duration) {
    this.duration = JsonNullable.<Int32ChangedFieldViewModel>of(duration);
  }


  public WorkItemChangedFieldsViewModel attributes(Map<String, WorkItemChangedAttributeViewModel> attributes) {
    this.attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>of(attributes);
    return this;
  }

  public WorkItemChangedFieldsViewModel putAttributesItem(String key, WorkItemChangedAttributeViewModel attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>of(new HashMap<>());
    }
    try {
      this.attributes.get().put(key, attributesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, WorkItemChangedAttributeViewModel> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, WorkItemChangedAttributeViewModel>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<Map<String, WorkItemChangedAttributeViewModel>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(Map<String, WorkItemChangedAttributeViewModel> attributes) {
    this.attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>of(attributes);
  }


  public WorkItemChangedFieldsViewModel steps(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel steps) {
    this.steps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>of(steps);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel getSteps() {
        return steps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> getSteps_JsonNullable() {
    return steps;
  }
  
  @JsonProperty(JSON_PROPERTY_STEPS)
  public void setSteps_JsonNullable(JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> steps) {
    this.steps = steps;
  }

  public void setSteps(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel steps) {
    this.steps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>of(steps);
  }


  public WorkItemChangedFieldsViewModel preconditionSteps(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel preconditionSteps) {
    this.preconditionSteps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>of(preconditionSteps);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel getPreconditionSteps() {
        return preconditionSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> getPreconditionSteps_JsonNullable() {
    return preconditionSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  public void setPreconditionSteps_JsonNullable(JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }

  public void setPreconditionSteps(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel preconditionSteps) {
    this.preconditionSteps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>of(preconditionSteps);
  }


  public WorkItemChangedFieldsViewModel postconditionSteps(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel postconditionSteps) {
    this.postconditionSteps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>of(postconditionSteps);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel getPostconditionSteps() {
        return postconditionSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> getPostconditionSteps_JsonNullable() {
    return postconditionSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  public void setPostconditionSteps_JsonNullable(JsonNullable<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }

  public void setPostconditionSteps(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel postconditionSteps) {
    this.postconditionSteps = JsonNullable.<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>of(postconditionSteps);
  }


  public WorkItemChangedFieldsViewModel autoTests(AutoTestChangeViewModelArrayChangedFieldViewModel autoTests) {
    this.autoTests = JsonNullable.<AutoTestChangeViewModelArrayChangedFieldViewModel>of(autoTests);
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public AutoTestChangeViewModelArrayChangedFieldViewModel getAutoTests() {
        return autoTests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AutoTestChangeViewModelArrayChangedFieldViewModel> getAutoTests_JsonNullable() {
    return autoTests;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  public void setAutoTests_JsonNullable(JsonNullable<AutoTestChangeViewModelArrayChangedFieldViewModel> autoTests) {
    this.autoTests = autoTests;
  }

  public void setAutoTests(AutoTestChangeViewModelArrayChangedFieldViewModel autoTests) {
    this.autoTests = JsonNullable.<AutoTestChangeViewModelArrayChangedFieldViewModel>of(autoTests);
  }


  public WorkItemChangedFieldsViewModel attachments(AttachmentChangeViewModelArrayChangedFieldViewModel attachments) {
    this.attachments = JsonNullable.<AttachmentChangeViewModelArrayChangedFieldViewModel>of(attachments);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public AttachmentChangeViewModelArrayChangedFieldViewModel getAttachments() {
        return attachments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AttachmentChangeViewModelArrayChangedFieldViewModel> getAttachments_JsonNullable() {
    return attachments;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  public void setAttachments_JsonNullable(JsonNullable<AttachmentChangeViewModelArrayChangedFieldViewModel> attachments) {
    this.attachments = attachments;
  }

  public void setAttachments(AttachmentChangeViewModelArrayChangedFieldViewModel attachments) {
    this.attachments = JsonNullable.<AttachmentChangeViewModelArrayChangedFieldViewModel>of(attachments);
  }


  public WorkItemChangedFieldsViewModel tags(StringArrayChangedFieldViewModel tags) {
    this.tags = JsonNullable.<StringArrayChangedFieldViewModel>of(tags);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public StringArrayChangedFieldViewModel getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StringArrayChangedFieldViewModel> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<StringArrayChangedFieldViewModel> tags) {
    this.tags = tags;
  }

  public void setTags(StringArrayChangedFieldViewModel tags) {
    this.tags = JsonNullable.<StringArrayChangedFieldViewModel>of(tags);
  }


  public WorkItemChangedFieldsViewModel links(WorkItemLinkChangeViewModelArrayChangedFieldViewModel links) {
    this.links = JsonNullable.<WorkItemLinkChangeViewModelArrayChangedFieldViewModel>of(links);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public WorkItemLinkChangeViewModelArrayChangedFieldViewModel getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkItemLinkChangeViewModelArrayChangedFieldViewModel> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<WorkItemLinkChangeViewModelArrayChangedFieldViewModel> links) {
    this.links = links;
  }

  public void setLinks(WorkItemLinkChangeViewModelArrayChangedFieldViewModel links) {
    this.links = JsonNullable.<WorkItemLinkChangeViewModelArrayChangedFieldViewModel>of(links);
  }


  public WorkItemChangedFieldsViewModel globalId(Int64ChangedFieldViewModel globalId) {
    this.globalId = JsonNullable.<Int64ChangedFieldViewModel>of(globalId);
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Int64ChangedFieldViewModel getGlobalId() {
        return globalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Int64ChangedFieldViewModel> getGlobalId_JsonNullable() {
    return globalId;
  }
  
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  public void setGlobalId_JsonNullable(JsonNullable<Int64ChangedFieldViewModel> globalId) {
    this.globalId = globalId;
  }

  public void setGlobalId(Int64ChangedFieldViewModel globalId) {
    this.globalId = JsonNullable.<Int64ChangedFieldViewModel>of(globalId);
  }


  public WorkItemChangedFieldsViewModel versionNumber(Int32ChangedFieldViewModel versionNumber) {
    this.versionNumber = JsonNullable.<Int32ChangedFieldViewModel>of(versionNumber);
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Int32ChangedFieldViewModel getVersionNumber() {
        return versionNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Int32ChangedFieldViewModel> getVersionNumber_JsonNullable() {
    return versionNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  public void setVersionNumber_JsonNullable(JsonNullable<Int32ChangedFieldViewModel> versionNumber) {
    this.versionNumber = versionNumber;
  }

  public void setVersionNumber(Int32ChangedFieldViewModel versionNumber) {
    this.versionNumber = JsonNullable.<Int32ChangedFieldViewModel>of(versionNumber);
  }


  public WorkItemChangedFieldsViewModel entityTypeName(StringChangedFieldViewModel entityTypeName) {
    this.entityTypeName = JsonNullable.<StringChangedFieldViewModel>of(entityTypeName);
    return this;
  }

   /**
   * Get entityTypeName
   * @return entityTypeName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public StringChangedFieldViewModel getEntityTypeName() {
        return entityTypeName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StringChangedFieldViewModel> getEntityTypeName_JsonNullable() {
    return entityTypeName;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  public void setEntityTypeName_JsonNullable(JsonNullable<StringChangedFieldViewModel> entityTypeName) {
    this.entityTypeName = entityTypeName;
  }

  public void setEntityTypeName(StringChangedFieldViewModel entityTypeName) {
    this.entityTypeName = JsonNullable.<StringChangedFieldViewModel>of(entityTypeName);
  }


  /**
   * Return true if this WorkItemChangedFieldsViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemChangedFieldsViewModel workItemChangedFieldsViewModel = (WorkItemChangedFieldsViewModel) o;
    return equalsNullable(this.name, workItemChangedFieldsViewModel.name) &&
        equalsNullable(this.isDeleted, workItemChangedFieldsViewModel.isDeleted) &&
        equalsNullable(this.projectId, workItemChangedFieldsViewModel.projectId) &&
        equalsNullable(this.isAutomated, workItemChangedFieldsViewModel.isAutomated) &&
        equalsNullable(this.sectionId, workItemChangedFieldsViewModel.sectionId) &&
        equalsNullable(this.description, workItemChangedFieldsViewModel.description) &&
        equalsNullable(this.state, workItemChangedFieldsViewModel.state) &&
        equalsNullable(this.priority, workItemChangedFieldsViewModel.priority) &&
        equalsNullable(this.duration, workItemChangedFieldsViewModel.duration) &&
        equalsNullable(this.attributes, workItemChangedFieldsViewModel.attributes) &&
        equalsNullable(this.steps, workItemChangedFieldsViewModel.steps) &&
        equalsNullable(this.preconditionSteps, workItemChangedFieldsViewModel.preconditionSteps) &&
        equalsNullable(this.postconditionSteps, workItemChangedFieldsViewModel.postconditionSteps) &&
        equalsNullable(this.autoTests, workItemChangedFieldsViewModel.autoTests) &&
        equalsNullable(this.attachments, workItemChangedFieldsViewModel.attachments) &&
        equalsNullable(this.tags, workItemChangedFieldsViewModel.tags) &&
        equalsNullable(this.links, workItemChangedFieldsViewModel.links) &&
        equalsNullable(this.globalId, workItemChangedFieldsViewModel.globalId) &&
        equalsNullable(this.versionNumber, workItemChangedFieldsViewModel.versionNumber) &&
        equalsNullable(this.entityTypeName, workItemChangedFieldsViewModel.entityTypeName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(isDeleted), hashCodeNullable(projectId), hashCodeNullable(isAutomated), hashCodeNullable(sectionId), hashCodeNullable(description), hashCodeNullable(state), hashCodeNullable(priority), hashCodeNullable(duration), hashCodeNullable(attributes), hashCodeNullable(steps), hashCodeNullable(preconditionSteps), hashCodeNullable(postconditionSteps), hashCodeNullable(autoTests), hashCodeNullable(attachments), hashCodeNullable(tags), hashCodeNullable(links), hashCodeNullable(globalId), hashCodeNullable(versionNumber), hashCodeNullable(entityTypeName));
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
    sb.append("class WorkItemChangedFieldsViewModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
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

