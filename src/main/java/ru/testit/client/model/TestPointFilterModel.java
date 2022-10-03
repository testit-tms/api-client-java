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
import ru.testit.client.model.Int64RangeSelectorModel;
import ru.testit.client.model.TestPointStatus;
import ru.testit.client.model.WorkItemPriorityModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestPointFilterModel
 */
@JsonPropertyOrder({
  TestPointFilterModel.JSON_PROPERTY_TEST_SUITE_IDS,
  TestPointFilterModel.JSON_PROPERTY_WORK_ITEM_GLOBAL_IDS,
  TestPointFilterModel.JSON_PROPERTY_STATUSES,
  TestPointFilterModel.JSON_PROPERTY_PRIORITIES,
  TestPointFilterModel.JSON_PROPERTY_IS_AUTOMATED,
  TestPointFilterModel.JSON_PROPERTY_NAME,
  TestPointFilterModel.JSON_PROPERTY_CONFIGURATION_IDS,
  TestPointFilterModel.JSON_PROPERTY_TESTER_IDS,
  TestPointFilterModel.JSON_PROPERTY_DURATION,
  TestPointFilterModel.JSON_PROPERTY_SECTION_IDS,
  TestPointFilterModel.JSON_PROPERTY_CREATED_DATE,
  TestPointFilterModel.JSON_PROPERTY_CREATED_BY_IDS,
  TestPointFilterModel.JSON_PROPERTY_MODIFIED_DATE,
  TestPointFilterModel.JSON_PROPERTY_MODIFIED_BY_IDS,
  TestPointFilterModel.JSON_PROPERTY_TAGS,
  TestPointFilterModel.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointFilterModel {
  public static final String JSON_PROPERTY_TEST_SUITE_IDS = "testSuiteIds";
  private JsonNullable<Set<UUID>> testSuiteIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_GLOBAL_IDS = "workItemGlobalIds";
  private JsonNullable<Set<Long>> workItemGlobalIds = JsonNullable.<Set<Long>>undefined();

  public static final String JSON_PROPERTY_STATUSES = "statuses";
  private JsonNullable<Set<TestPointStatus>> statuses = JsonNullable.<Set<TestPointStatus>>undefined();

  public static final String JSON_PROPERTY_PRIORITIES = "priorities";
  private JsonNullable<Set<WorkItemPriorityModel>> priorities = JsonNullable.<Set<WorkItemPriorityModel>>undefined();

  public static final String JSON_PROPERTY_IS_AUTOMATED = "isAutomated";
  private JsonNullable<Boolean> isAutomated = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONFIGURATION_IDS = "configurationIds";
  private JsonNullable<Set<UUID>> configurationIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_TESTER_IDS = "testerIds";
  private JsonNullable<Set<UUID>> testerIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Int64RangeSelectorModel duration;

  public static final String JSON_PROPERTY_SECTION_IDS = "sectionIds";
  private JsonNullable<Set<UUID>> sectionIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private DateTimeRangeSelectorModel createdDate;

  public static final String JSON_PROPERTY_CREATED_BY_IDS = "createdByIds";
  private JsonNullable<Set<UUID>> createdByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private DateTimeRangeSelectorModel modifiedDate;

  public static final String JSON_PROPERTY_MODIFIED_BY_IDS = "modifiedByIds";
  private JsonNullable<Set<UUID>> modifiedByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Set<String>> tags = JsonNullable.<Set<String>>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, Set<String>>> attributes = JsonNullable.<Map<String, Set<String>>>undefined();

  public TestPointFilterModel() { 
  }

  public TestPointFilterModel testSuiteIds(Set<UUID> testSuiteIds) {
    this.testSuiteIds = JsonNullable.<Set<UUID>>of(testSuiteIds);
    return this;
  }

  public TestPointFilterModel addTestSuiteIdsItem(UUID testSuiteIdsItem) {
    if (this.testSuiteIds == null || !this.testSuiteIds.isPresent()) {
      this.testSuiteIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
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

  public Set<UUID> getTestSuiteIds() {
        return testSuiteIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_SUITE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getTestSuiteIds_JsonNullable() {
    return testSuiteIds;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_SUITE_IDS)
  public void setTestSuiteIds_JsonNullable(JsonNullable<Set<UUID>> testSuiteIds) {
    this.testSuiteIds = testSuiteIds;
  }

  public void setTestSuiteIds(Set<UUID> testSuiteIds) {
    this.testSuiteIds = JsonNullable.<Set<UUID>>of(testSuiteIds);
  }


  public TestPointFilterModel workItemGlobalIds(Set<Long> workItemGlobalIds) {
    this.workItemGlobalIds = JsonNullable.<Set<Long>>of(workItemGlobalIds);
    return this;
  }

  public TestPointFilterModel addWorkItemGlobalIdsItem(Long workItemGlobalIdsItem) {
    if (this.workItemGlobalIds == null || !this.workItemGlobalIds.isPresent()) {
      this.workItemGlobalIds = JsonNullable.<Set<Long>>of(new LinkedHashSet<>());
    }
    try {
      this.workItemGlobalIds.get().add(workItemGlobalIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get workItemGlobalIds
   * @return workItemGlobalIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<Long> getWorkItemGlobalIds() {
        return workItemGlobalIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM_GLOBAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<Long>> getWorkItemGlobalIds_JsonNullable() {
    return workItemGlobalIds;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_GLOBAL_IDS)
  public void setWorkItemGlobalIds_JsonNullable(JsonNullable<Set<Long>> workItemGlobalIds) {
    this.workItemGlobalIds = workItemGlobalIds;
  }

  public void setWorkItemGlobalIds(Set<Long> workItemGlobalIds) {
    this.workItemGlobalIds = JsonNullable.<Set<Long>>of(workItemGlobalIds);
  }


  public TestPointFilterModel statuses(Set<TestPointStatus> statuses) {
    this.statuses = JsonNullable.<Set<TestPointStatus>>of(statuses);
    return this;
  }

  public TestPointFilterModel addStatusesItem(TestPointStatus statusesItem) {
    if (this.statuses == null || !this.statuses.isPresent()) {
      this.statuses = JsonNullable.<Set<TestPointStatus>>of(new LinkedHashSet<>());
    }
    try {
      this.statuses.get().add(statusesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<TestPointStatus> getStatuses() {
        return statuses.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<TestPointStatus>> getStatuses_JsonNullable() {
    return statuses;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUSES)
  public void setStatuses_JsonNullable(JsonNullable<Set<TestPointStatus>> statuses) {
    this.statuses = statuses;
  }

  public void setStatuses(Set<TestPointStatus> statuses) {
    this.statuses = JsonNullable.<Set<TestPointStatus>>of(statuses);
  }


  public TestPointFilterModel priorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = JsonNullable.<Set<WorkItemPriorityModel>>of(priorities);
    return this;
  }

  public TestPointFilterModel addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
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
   * Get priorities
   * @return priorities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TestPointFilterModel isAutomated(Boolean isAutomated) {
    this.isAutomated = JsonNullable.<Boolean>of(isAutomated);
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TestPointFilterModel name(String name) {
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


  public TestPointFilterModel configurationIds(Set<UUID> configurationIds) {
    this.configurationIds = JsonNullable.<Set<UUID>>of(configurationIds);
    return this;
  }

  public TestPointFilterModel addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null || !this.configurationIds.isPresent()) {
      this.configurationIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.configurationIds.get().add(configurationIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get configurationIds
   * @return configurationIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<UUID> getConfigurationIds() {
        return configurationIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIGURATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getConfigurationIds_JsonNullable() {
    return configurationIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_IDS)
  public void setConfigurationIds_JsonNullable(JsonNullable<Set<UUID>> configurationIds) {
    this.configurationIds = configurationIds;
  }

  public void setConfigurationIds(Set<UUID> configurationIds) {
    this.configurationIds = JsonNullable.<Set<UUID>>of(configurationIds);
  }


  public TestPointFilterModel testerIds(Set<UUID> testerIds) {
    this.testerIds = JsonNullable.<Set<UUID>>of(testerIds);
    return this;
  }

  public TestPointFilterModel addTesterIdsItem(UUID testerIdsItem) {
    if (this.testerIds == null || !this.testerIds.isPresent()) {
      this.testerIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.testerIds.get().add(testerIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get testerIds
   * @return testerIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<UUID> getTesterIds() {
        return testerIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TESTER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getTesterIds_JsonNullable() {
    return testerIds;
  }
  
  @JsonProperty(JSON_PROPERTY_TESTER_IDS)
  public void setTesterIds_JsonNullable(JsonNullable<Set<UUID>> testerIds) {
    this.testerIds = testerIds;
  }

  public void setTesterIds(Set<UUID> testerIds) {
    this.testerIds = JsonNullable.<Set<UUID>>of(testerIds);
  }


  public TestPointFilterModel duration(Int64RangeSelectorModel duration) {
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

  public Int64RangeSelectorModel getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Int64RangeSelectorModel duration) {
    this.duration = duration;
  }


  public TestPointFilterModel sectionIds(Set<UUID> sectionIds) {
    this.sectionIds = JsonNullable.<Set<UUID>>of(sectionIds);
    return this;
  }

  public TestPointFilterModel addSectionIdsItem(UUID sectionIdsItem) {
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
   * Get sectionIds
   * @return sectionIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TestPointFilterModel createdDate(DateTimeRangeSelectorModel createdDate) {
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


  public TestPointFilterModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
    return this;
  }

  public TestPointFilterModel addCreatedByIdsItem(UUID createdByIdsItem) {
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
   * Get createdByIds
   * @return createdByIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TestPointFilterModel modifiedDate(DateTimeRangeSelectorModel modifiedDate) {
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


  public TestPointFilterModel modifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = JsonNullable.<Set<UUID>>of(modifiedByIds);
    return this;
  }

  public TestPointFilterModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
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
   * Get modifiedByIds
   * @return modifiedByIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TestPointFilterModel tags(Set<String> tags) {
    this.tags = JsonNullable.<Set<String>>of(tags);
    return this;
  }

  public TestPointFilterModel addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<Set<String>>of(new LinkedHashSet<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<String> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<String>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<Set<String>> tags) {
    this.tags = tags;
  }

  public void setTags(Set<String> tags) {
    this.tags = JsonNullable.<Set<String>>of(tags);
  }


  public TestPointFilterModel attributes(Map<String, Set<String>> attributes) {
    this.attributes = JsonNullable.<Map<String, Set<String>>>of(attributes);
    return this;
  }

  public TestPointFilterModel putAttributesItem(String key, Set<String> attributesItem) {
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
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  /**
   * Return true if this TestPointFilterModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointFilterModel testPointFilterModel = (TestPointFilterModel) o;
    return equalsNullable(this.testSuiteIds, testPointFilterModel.testSuiteIds) &&
        equalsNullable(this.workItemGlobalIds, testPointFilterModel.workItemGlobalIds) &&
        equalsNullable(this.statuses, testPointFilterModel.statuses) &&
        equalsNullable(this.priorities, testPointFilterModel.priorities) &&
        equalsNullable(this.isAutomated, testPointFilterModel.isAutomated) &&
        equalsNullable(this.name, testPointFilterModel.name) &&
        equalsNullable(this.configurationIds, testPointFilterModel.configurationIds) &&
        equalsNullable(this.testerIds, testPointFilterModel.testerIds) &&
        Objects.equals(this.duration, testPointFilterModel.duration) &&
        equalsNullable(this.sectionIds, testPointFilterModel.sectionIds) &&
        Objects.equals(this.createdDate, testPointFilterModel.createdDate) &&
        equalsNullable(this.createdByIds, testPointFilterModel.createdByIds) &&
        Objects.equals(this.modifiedDate, testPointFilterModel.modifiedDate) &&
        equalsNullable(this.modifiedByIds, testPointFilterModel.modifiedByIds) &&
        equalsNullable(this.tags, testPointFilterModel.tags) &&
        equalsNullable(this.attributes, testPointFilterModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(testSuiteIds), hashCodeNullable(workItemGlobalIds), hashCodeNullable(statuses), hashCodeNullable(priorities), hashCodeNullable(isAutomated), hashCodeNullable(name), hashCodeNullable(configurationIds), hashCodeNullable(testerIds), duration, hashCodeNullable(sectionIds), createdDate, hashCodeNullable(createdByIds), modifiedDate, hashCodeNullable(modifiedByIds), hashCodeNullable(tags), hashCodeNullable(attributes));
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
    sb.append("class TestPointFilterModel {\n");
    sb.append("    testSuiteIds: ").append(toIndentedString(testSuiteIds)).append("\n");
    sb.append("    workItemGlobalIds: ").append(toIndentedString(workItemGlobalIds)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    testerIds: ").append(toIndentedString(testerIds)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

