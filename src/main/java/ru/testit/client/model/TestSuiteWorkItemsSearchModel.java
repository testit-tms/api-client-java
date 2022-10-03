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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.Int32RangeSelectorModel;
import ru.testit.client.model.WorkItemPriorityModel;
import ru.testit.client.model.WorkItemStates;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestSuiteWorkItemsSearchModel
 */
@JsonPropertyOrder({
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_NAME,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_GLOBAL_IDS,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_SECTION_IDS,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_PRIORITIES,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_IS_AUTOMATED,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_STATES,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_DURATION,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_CREATED_DATE,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_MODIFIED_DATE,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_CREATED_BY_IDS,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_MODIFIED_BY_IDS,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_ATTRIBUTES,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_IS_DELETED,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_TAG_NAMES,
  TestSuiteWorkItemsSearchModel.JSON_PROPERTY_ENTITY_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestSuiteWorkItemsSearchModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GLOBAL_IDS = "globalIds";
  private JsonNullable<Set<Long>> globalIds = JsonNullable.<Set<Long>>undefined();

  public static final String JSON_PROPERTY_SECTION_IDS = "sectionIds";
  private JsonNullable<Set<UUID>> sectionIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_PRIORITIES = "priorities";
  private JsonNullable<Set<WorkItemPriorityModel>> priorities = JsonNullable.<Set<WorkItemPriorityModel>>undefined();

  public static final String JSON_PROPERTY_IS_AUTOMATED = "isAutomated";
  private JsonNullable<Boolean> isAutomated = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_STATES = "states";
  private JsonNullable<Set<WorkItemStates>> states = JsonNullable.<Set<WorkItemStates>>undefined();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Int32RangeSelectorModel duration;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private DateTimeRangeSelectorModel createdDate;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private DateTimeRangeSelectorModel modifiedDate;

  public static final String JSON_PROPERTY_CREATED_BY_IDS = "createdByIds";
  private JsonNullable<Set<UUID>> createdByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_MODIFIED_BY_IDS = "modifiedByIds";
  private JsonNullable<Set<UUID>> modifiedByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, Set<String>>> attributes = JsonNullable.<Map<String, Set<String>>>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private JsonNullable<Boolean> isDeleted = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TAG_NAMES = "tagNames";
  private JsonNullable<Set<String>> tagNames = JsonNullable.<Set<String>>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPES = "entityTypes";
  private JsonNullable<Set<String>> entityTypes = JsonNullable.<Set<String>>undefined();

  public TestSuiteWorkItemsSearchModel() { 
  }

  public TestSuiteWorkItemsSearchModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of work item
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of work item")
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


  public TestSuiteWorkItemsSearchModel globalIds(Set<Long> globalIds) {
    this.globalIds = JsonNullable.<Set<Long>>of(globalIds);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null || !this.globalIds.isPresent()) {
      this.globalIds = JsonNullable.<Set<Long>>of(new LinkedHashSet<>());
    }
    try {
      this.globalIds.get().add(globalIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of global (integer) identifiers
   * @return globalIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of global (integer) identifiers")
  @JsonIgnore

  public Set<Long> getGlobalIds() {
        return globalIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<Long>> getGlobalIds_JsonNullable() {
    return globalIds;
  }
  
  @JsonProperty(JSON_PROPERTY_GLOBAL_IDS)
  public void setGlobalIds_JsonNullable(JsonNullable<Set<Long>> globalIds) {
    this.globalIds = globalIds;
  }

  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = JsonNullable.<Set<Long>>of(globalIds);
  }


  public TestSuiteWorkItemsSearchModel sectionIds(Set<UUID> sectionIds) {
    this.sectionIds = JsonNullable.<Set<UUID>>of(sectionIds);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addSectionIdsItem(UUID sectionIdsItem) {
    if (this.sectionIds == null || !this.sectionIds.isPresent()) {
      this.sectionIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.sectionIds.get().add(sectionIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of section identifiers
   * @return sectionIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of section identifiers")
  @JsonIgnore

  public Set<UUID> getSectionIds() {
        return sectionIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getSectionIds_JsonNullable() {
    return sectionIds;
  }
  
  @JsonProperty(JSON_PROPERTY_SECTION_IDS)
  public void setSectionIds_JsonNullable(JsonNullable<Set<UUID>> sectionIds) {
    this.sectionIds = sectionIds;
  }

  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = JsonNullable.<Set<UUID>>of(sectionIds);
  }


  public TestSuiteWorkItemsSearchModel priorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = JsonNullable.<Set<WorkItemPriorityModel>>of(priorities);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
    if (this.priorities == null || !this.priorities.isPresent()) {
      this.priorities = JsonNullable.<Set<WorkItemPriorityModel>>of(new LinkedHashSet<>());
    }
    try {
      this.priorities.get().add(prioritiesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of priorities of work item
   * @return priorities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of priorities of work item")
  @JsonIgnore

  public Set<WorkItemPriorityModel> getPriorities() {
        return priorities.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<WorkItemPriorityModel>> getPriorities_JsonNullable() {
    return priorities;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  public void setPriorities_JsonNullable(JsonNullable<Set<WorkItemPriorityModel>> priorities) {
    this.priorities = priorities;
  }

  public void setPriorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = JsonNullable.<Set<WorkItemPriorityModel>>of(priorities);
  }


  public TestSuiteWorkItemsSearchModel isAutomated(Boolean isAutomated) {
    this.isAutomated = JsonNullable.<Boolean>of(isAutomated);
    return this;
  }

   /**
   * Is result must consist of only manual/automated work items
   * @return isAutomated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Is result must consist of only manual/automated work items")
  @JsonIgnore

  public Boolean getIsAutomated() {
        return isAutomated.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsAutomated_JsonNullable() {
    return isAutomated;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  public void setIsAutomated_JsonNullable(JsonNullable<Boolean> isAutomated) {
    this.isAutomated = isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = JsonNullable.<Boolean>of(isAutomated);
  }


  public TestSuiteWorkItemsSearchModel states(Set<WorkItemStates> states) {
    this.states = JsonNullable.<Set<WorkItemStates>>of(states);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addStatesItem(WorkItemStates statesItem) {
    if (this.states == null || !this.states.isPresent()) {
      this.states = JsonNullable.<Set<WorkItemStates>>of(new LinkedHashSet<>());
    }
    try {
      this.states.get().add(statesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of states of work item
   * @return states
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of states of work item")
  @JsonIgnore

  public Set<WorkItemStates> getStates() {
        return states.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<WorkItemStates>> getStates_JsonNullable() {
    return states;
  }
  
  @JsonProperty(JSON_PROPERTY_STATES)
  public void setStates_JsonNullable(JsonNullable<Set<WorkItemStates>> states) {
    this.states = states;
  }

  public void setStates(Set<WorkItemStates> states) {
    this.states = JsonNullable.<Set<WorkItemStates>>of(states);
  }


  public TestSuiteWorkItemsSearchModel duration(Int32RangeSelectorModel duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32RangeSelectorModel getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Int32RangeSelectorModel duration) {
    this.duration = duration;
  }


  public TestSuiteWorkItemsSearchModel createdDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  public TestSuiteWorkItemsSearchModel modifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTimeRangeSelectorModel getModifiedDate() {
    return modifiedDate;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestSuiteWorkItemsSearchModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null || !this.createdByIds.isPresent()) {
      this.createdByIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.createdByIds.get().add(createdByIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of identifiers of users who created work item
   * @return createdByIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of identifiers of users who created work item")
  @JsonIgnore

  public Set<UUID> getCreatedByIds() {
        return createdByIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getCreatedByIds_JsonNullable() {
    return createdByIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY_IDS)
  public void setCreatedByIds_JsonNullable(JsonNullable<Set<UUID>> createdByIds) {
    this.createdByIds = createdByIds;
  }

  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
  }


  public TestSuiteWorkItemsSearchModel modifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = JsonNullable.<Set<UUID>>of(modifiedByIds);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null || !this.modifiedByIds.isPresent()) {
      this.modifiedByIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.modifiedByIds.get().add(modifiedByIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of identifiers of users who applied last modification to work item
   * @return modifiedByIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of identifiers of users who applied last modification to work item")
  @JsonIgnore

  public Set<UUID> getModifiedByIds() {
        return modifiedByIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getModifiedByIds_JsonNullable() {
    return modifiedByIds;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_IDS)
  public void setModifiedByIds_JsonNullable(JsonNullable<Set<UUID>> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }

  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = JsonNullable.<Set<UUID>>of(modifiedByIds);
  }


  public TestSuiteWorkItemsSearchModel attributes(Map<String, Set<String>> attributes) {
    this.attributes = JsonNullable.<Map<String, Set<String>>>of(attributes);
    return this;
  }

  public TestSuiteWorkItemsSearchModel putAttributesItem(String key, Set<String> attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<Map<String, Set<String>>>of(new HashMap<>());
    }
    try {
      this.attributes.get().put(key, attributesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Custom attributes of work item
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Custom attributes of work item")
  @JsonIgnore

  public Map<String, Set<String>> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Set<String>>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<Map<String, Set<String>>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = JsonNullable.<Map<String, Set<String>>>of(attributes);
  }


  public TestSuiteWorkItemsSearchModel isDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
    return this;
  }

   /**
   * Is result must consist of only actual/deleted work items
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Is result must consist of only actual/deleted work items")
  @JsonIgnore

  public Boolean getIsDeleted() {
        return isDeleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsDeleted_JsonNullable() {
    return isDeleted;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  public void setIsDeleted_JsonNullable(JsonNullable<Boolean> isDeleted) {
    this.isDeleted = isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
  }


  public TestSuiteWorkItemsSearchModel tagNames(Set<String> tagNames) {
    this.tagNames = JsonNullable.<Set<String>>of(tagNames);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addTagNamesItem(String tagNamesItem) {
    if (this.tagNames == null || !this.tagNames.isPresent()) {
      this.tagNames = JsonNullable.<Set<String>>of(new LinkedHashSet<>());
    }
    try {
      this.tagNames.get().add(tagNamesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of tags
   * @return tagNames
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of tags")
  @JsonIgnore

  public Set<String> getTagNames() {
        return tagNames.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAG_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<String>> getTagNames_JsonNullable() {
    return tagNames;
  }
  
  @JsonProperty(JSON_PROPERTY_TAG_NAMES)
  public void setTagNames_JsonNullable(JsonNullable<Set<String>> tagNames) {
    this.tagNames = tagNames;
  }

  public void setTagNames(Set<String> tagNames) {
    this.tagNames = JsonNullable.<Set<String>>of(tagNames);
  }


  public TestSuiteWorkItemsSearchModel entityTypes(Set<String> entityTypes) {
    this.entityTypes = JsonNullable.<Set<String>>of(entityTypes);
    return this;
  }

  public TestSuiteWorkItemsSearchModel addEntityTypesItem(String entityTypesItem) {
    if (this.entityTypes == null || !this.entityTypes.isPresent()) {
      this.entityTypes = JsonNullable.<Set<String>>of(new LinkedHashSet<>());
    }
    try {
      this.entityTypes.get().add(entityTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of types of work item  &lt;br&gt;Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60;
   * @return entityTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Collection of types of work item  <br>Allowed values: `TestCases`, `CheckLists`, `SharedSteps`")
  @JsonIgnore

  public Set<String> getEntityTypes() {
        return entityTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<String>> getEntityTypes_JsonNullable() {
    return entityTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPES)
  public void setEntityTypes_JsonNullable(JsonNullable<Set<String>> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public void setEntityTypes(Set<String> entityTypes) {
    this.entityTypes = JsonNullable.<Set<String>>of(entityTypes);
  }


  /**
   * Return true if this TestSuiteWorkItemsSearchModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel = (TestSuiteWorkItemsSearchModel) o;
    return equalsNullable(this.name, testSuiteWorkItemsSearchModel.name) &&
        equalsNullable(this.globalIds, testSuiteWorkItemsSearchModel.globalIds) &&
        equalsNullable(this.sectionIds, testSuiteWorkItemsSearchModel.sectionIds) &&
        equalsNullable(this.priorities, testSuiteWorkItemsSearchModel.priorities) &&
        equalsNullable(this.isAutomated, testSuiteWorkItemsSearchModel.isAutomated) &&
        equalsNullable(this.states, testSuiteWorkItemsSearchModel.states) &&
        Objects.equals(this.duration, testSuiteWorkItemsSearchModel.duration) &&
        Objects.equals(this.createdDate, testSuiteWorkItemsSearchModel.createdDate) &&
        Objects.equals(this.modifiedDate, testSuiteWorkItemsSearchModel.modifiedDate) &&
        equalsNullable(this.createdByIds, testSuiteWorkItemsSearchModel.createdByIds) &&
        equalsNullable(this.modifiedByIds, testSuiteWorkItemsSearchModel.modifiedByIds) &&
        equalsNullable(this.attributes, testSuiteWorkItemsSearchModel.attributes) &&
        equalsNullable(this.isDeleted, testSuiteWorkItemsSearchModel.isDeleted) &&
        equalsNullable(this.tagNames, testSuiteWorkItemsSearchModel.tagNames) &&
        equalsNullable(this.entityTypes, testSuiteWorkItemsSearchModel.entityTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(globalIds), hashCodeNullable(sectionIds), hashCodeNullable(priorities), hashCodeNullable(isAutomated), hashCodeNullable(states), duration, createdDate, modifiedDate, hashCodeNullable(createdByIds), hashCodeNullable(modifiedByIds), hashCodeNullable(attributes), hashCodeNullable(isDeleted), hashCodeNullable(tagNames), hashCodeNullable(entityTypes));
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
    sb.append("class TestSuiteWorkItemsSearchModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
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

