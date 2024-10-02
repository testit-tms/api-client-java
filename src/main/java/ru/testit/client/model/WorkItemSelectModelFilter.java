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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TestPointFilterModelWorkItemCreatedDate;
import ru.testit.client.model.TestPointFilterModelWorkItemModifiedDate;
import ru.testit.client.model.TestSuiteWorkItemsSearchModelDuration;
import ru.testit.client.model.TestSuiteWorkItemsSearchModelMedianDuration;
import ru.testit.client.model.WorkItemEntityTypes;
import ru.testit.client.model.WorkItemPriorityModel;
import ru.testit.client.model.WorkItemStates;

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
 * Collection of filters to apply to search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemSelectModelFilter {
  public static final String SERIALIZED_NAME_NAME_OR_ID = "nameOrId";
  @SerializedName(SERIALIZED_NAME_NAME_OR_ID)
  private String nameOrId;

  public static final String SERIALIZED_NAME_INCLUDE_IDS = "includeIds";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IDS)
  private Set<UUID> includeIds;

  public static final String SERIALIZED_NAME_EXCLUDE_IDS = "excludeIds";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_IDS)
  private Set<UUID> excludeIds;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private Set<UUID> ids;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Set<String>> attributes;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  private Set<UUID> sectionIds;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  private Set<WorkItemStates> states;

  public static final String SERIALIZED_NAME_PRIORITIES = "priorities";
  @SerializedName(SERIALIZED_NAME_PRIORITIES)
  private Set<WorkItemPriorityModel> priorities;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private Set<WorkItemEntityTypes> types;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private TestPointFilterModelWorkItemCreatedDate createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private TestPointFilterModelWorkItemModifiedDate modifiedDate;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private TestSuiteWorkItemsSearchModelDuration duration;

  public static final String SERIALIZED_NAME_MEDIAN_DURATION = "medianDuration";
  @SerializedName(SERIALIZED_NAME_MEDIAN_DURATION)
  private TestSuiteWorkItemsSearchModelMedianDuration medianDuration;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<String> tags;

  public static final String SERIALIZED_NAME_AUTO_TEST_IDS = "autoTestIds";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_IDS)
  private Set<UUID> autoTestIds;

  public static final String SERIALIZED_NAME_WORK_ITEM_VERSION_IDS = "workItemVersionIds";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_VERSION_IDS)
  private List<UUID> workItemVersionIds;

  public WorkItemSelectModelFilter() {
  }

  public WorkItemSelectModelFilter nameOrId(String nameOrId) {
    
    this.nameOrId = nameOrId;
    return this;
  }

   /**
   * Name or identifier (UUID) of work item
   * @return nameOrId
  **/
  @javax.annotation.Nullable
  public String getNameOrId() {
    return nameOrId;
  }


  public void setNameOrId(String nameOrId) {
    this.nameOrId = nameOrId;
  }


  public WorkItemSelectModelFilter includeIds(Set<UUID> includeIds) {
    
    this.includeIds = includeIds;
    return this;
  }

  public WorkItemSelectModelFilter addIncludeIdsItem(UUID includeIdsItem) {
    if (this.includeIds == null) {
      this.includeIds = new LinkedHashSet<>();
    }
    this.includeIds.add(includeIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of work items which need to be included in result regardless of filtering
   * @return includeIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getIncludeIds() {
    return includeIds;
  }


  public void setIncludeIds(Set<UUID> includeIds) {
    this.includeIds = includeIds;
  }


  public WorkItemSelectModelFilter excludeIds(Set<UUID> excludeIds) {
    
    this.excludeIds = excludeIds;
    return this;
  }

  public WorkItemSelectModelFilter addExcludeIdsItem(UUID excludeIdsItem) {
    if (this.excludeIds == null) {
      this.excludeIds = new LinkedHashSet<>();
    }
    this.excludeIds.add(excludeIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of work items which need to be excluded from result regardless of filtering
   * @return excludeIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getExcludeIds() {
    return excludeIds;
  }


  public void setExcludeIds(Set<UUID> excludeIds) {
    this.excludeIds = excludeIds;
  }


  public WorkItemSelectModelFilter projectIds(Set<UUID> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public WorkItemSelectModelFilter addProjectIdsItem(UUID projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new LinkedHashSet<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * Collection of project identifiers
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public WorkItemSelectModelFilter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of work item
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkItemSelectModelFilter ids(Set<UUID> ids) {
    
    this.ids = ids;
    return this;
  }

  public WorkItemSelectModelFilter addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Specifies a work item unique IDs to search for
   * @return ids
  **/
  @javax.annotation.Nullable
  public Set<UUID> getIds() {
    return ids;
  }


  public void setIds(Set<UUID> ids) {
    this.ids = ids;
  }


  public WorkItemSelectModelFilter globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public WorkItemSelectModelFilter addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null) {
      this.globalIds = new LinkedHashSet<>();
    }
    this.globalIds.add(globalIdsItem);
    return this;
  }

   /**
   * Collection of global (integer) identifiers
   * @return globalIds
  **/
  @javax.annotation.Nullable
  public Set<Long> getGlobalIds() {
    return globalIds;
  }


  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }


  public WorkItemSelectModelFilter attributes(Map<String, Set<String>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public WorkItemSelectModelFilter putAttributesItem(String key, Set<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Custom attributes of work item
   * @return attributes
  **/
  @javax.annotation.Nullable
  public Map<String, Set<String>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = attributes;
  }


  public WorkItemSelectModelFilter isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Is result must consist of only actual/deleted work items
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public WorkItemSelectModelFilter sectionIds(Set<UUID> sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

  public WorkItemSelectModelFilter addSectionIdsItem(UUID sectionIdsItem) {
    if (this.sectionIds == null) {
      this.sectionIds = new LinkedHashSet<>();
    }
    this.sectionIds.add(sectionIdsItem);
    return this;
  }

   /**
   * Collection of section identifiers
   * @return sectionIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getSectionIds() {
    return sectionIds;
  }


  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = sectionIds;
  }


  public WorkItemSelectModelFilter createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public WorkItemSelectModelFilter addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of users who created work item
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public WorkItemSelectModelFilter modifiedByIds(Set<UUID> modifiedByIds) {
    
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public WorkItemSelectModelFilter addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null) {
      this.modifiedByIds = new LinkedHashSet<>();
    }
    this.modifiedByIds.add(modifiedByIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of users who applied last modification to work item
   * @return modifiedByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }


  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }


  public WorkItemSelectModelFilter states(Set<WorkItemStates> states) {
    
    this.states = states;
    return this;
  }

  public WorkItemSelectModelFilter addStatesItem(WorkItemStates statesItem) {
    if (this.states == null) {
      this.states = new LinkedHashSet<>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Collection of states of work item
   * @return states
  **/
  @javax.annotation.Nullable
  public Set<WorkItemStates> getStates() {
    return states;
  }


  public void setStates(Set<WorkItemStates> states) {
    this.states = states;
  }


  public WorkItemSelectModelFilter priorities(Set<WorkItemPriorityModel> priorities) {
    
    this.priorities = priorities;
    return this;
  }

  public WorkItemSelectModelFilter addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new LinkedHashSet<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

   /**
   * Collection of priorities of work item
   * @return priorities
  **/
  @javax.annotation.Nullable
  public Set<WorkItemPriorityModel> getPriorities() {
    return priorities;
  }


  public void setPriorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = priorities;
  }


  public WorkItemSelectModelFilter types(Set<WorkItemEntityTypes> types) {
    
    this.types = types;
    return this;
  }

  public WorkItemSelectModelFilter addTypesItem(WorkItemEntityTypes typesItem) {
    if (this.types == null) {
      this.types = new LinkedHashSet<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Collection of types of work item
   * @return types
  **/
  @javax.annotation.Nullable
  public Set<WorkItemEntityTypes> getTypes() {
    return types;
  }


  public void setTypes(Set<WorkItemEntityTypes> types) {
    this.types = types;
  }


  public WorkItemSelectModelFilter createdDate(TestPointFilterModelWorkItemCreatedDate createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public TestPointFilterModelWorkItemCreatedDate getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(TestPointFilterModelWorkItemCreatedDate createdDate) {
    this.createdDate = createdDate;
  }


  public WorkItemSelectModelFilter modifiedDate(TestPointFilterModelWorkItemModifiedDate modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public TestPointFilterModelWorkItemModifiedDate getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(TestPointFilterModelWorkItemModifiedDate modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public WorkItemSelectModelFilter duration(TestSuiteWorkItemsSearchModelDuration duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  public TestSuiteWorkItemsSearchModelDuration getDuration() {
    return duration;
  }


  public void setDuration(TestSuiteWorkItemsSearchModelDuration duration) {
    this.duration = duration;
  }


  public WorkItemSelectModelFilter medianDuration(TestSuiteWorkItemsSearchModelMedianDuration medianDuration) {
    
    this.medianDuration = medianDuration;
    return this;
  }

   /**
   * Get medianDuration
   * @return medianDuration
  **/
  @javax.annotation.Nullable
  public TestSuiteWorkItemsSearchModelMedianDuration getMedianDuration() {
    return medianDuration;
  }


  public void setMedianDuration(TestSuiteWorkItemsSearchModelMedianDuration medianDuration) {
    this.medianDuration = medianDuration;
  }


  public WorkItemSelectModelFilter isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Is result must consist of only manual/automated work items
   * @return isAutomated
  **/
  @javax.annotation.Nullable
  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public WorkItemSelectModelFilter tags(Set<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public WorkItemSelectModelFilter addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Collection of tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Set<String> getTags() {
    return tags;
  }


  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public WorkItemSelectModelFilter autoTestIds(Set<UUID> autoTestIds) {
    
    this.autoTestIds = autoTestIds;
    return this;
  }

  public WorkItemSelectModelFilter addAutoTestIdsItem(UUID autoTestIdsItem) {
    if (this.autoTestIds == null) {
      this.autoTestIds = new LinkedHashSet<>();
    }
    this.autoTestIds.add(autoTestIdsItem);
    return this;
  }

   /**
   * Collection of identifiers of linked autotests
   * @return autoTestIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getAutoTestIds() {
    return autoTestIds;
  }


  public void setAutoTestIds(Set<UUID> autoTestIds) {
    this.autoTestIds = autoTestIds;
  }


  public WorkItemSelectModelFilter workItemVersionIds(List<UUID> workItemVersionIds) {
    
    this.workItemVersionIds = workItemVersionIds;
    return this;
  }

  public WorkItemSelectModelFilter addWorkItemVersionIdsItem(UUID workItemVersionIdsItem) {
    if (this.workItemVersionIds == null) {
      this.workItemVersionIds = new ArrayList<>();
    }
    this.workItemVersionIds.add(workItemVersionIdsItem);
    return this;
  }

   /**
   * Collection of identifiers work items versions.
   * @return workItemVersionIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getWorkItemVersionIds() {
    return workItemVersionIds;
  }


  public void setWorkItemVersionIds(List<UUID> workItemVersionIds) {
    this.workItemVersionIds = workItemVersionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemSelectModelFilter workItemSelectModelFilter = (WorkItemSelectModelFilter) o;
    return Objects.equals(this.nameOrId, workItemSelectModelFilter.nameOrId) &&
        Objects.equals(this.includeIds, workItemSelectModelFilter.includeIds) &&
        Objects.equals(this.excludeIds, workItemSelectModelFilter.excludeIds) &&
        Objects.equals(this.projectIds, workItemSelectModelFilter.projectIds) &&
        Objects.equals(this.name, workItemSelectModelFilter.name) &&
        Objects.equals(this.ids, workItemSelectModelFilter.ids) &&
        Objects.equals(this.globalIds, workItemSelectModelFilter.globalIds) &&
        Objects.equals(this.attributes, workItemSelectModelFilter.attributes) &&
        Objects.equals(this.isDeleted, workItemSelectModelFilter.isDeleted) &&
        Objects.equals(this.sectionIds, workItemSelectModelFilter.sectionIds) &&
        Objects.equals(this.createdByIds, workItemSelectModelFilter.createdByIds) &&
        Objects.equals(this.modifiedByIds, workItemSelectModelFilter.modifiedByIds) &&
        Objects.equals(this.states, workItemSelectModelFilter.states) &&
        Objects.equals(this.priorities, workItemSelectModelFilter.priorities) &&
        Objects.equals(this.types, workItemSelectModelFilter.types) &&
        Objects.equals(this.createdDate, workItemSelectModelFilter.createdDate) &&
        Objects.equals(this.modifiedDate, workItemSelectModelFilter.modifiedDate) &&
        Objects.equals(this.duration, workItemSelectModelFilter.duration) &&
        Objects.equals(this.medianDuration, workItemSelectModelFilter.medianDuration) &&
        Objects.equals(this.isAutomated, workItemSelectModelFilter.isAutomated) &&
        Objects.equals(this.tags, workItemSelectModelFilter.tags) &&
        Objects.equals(this.autoTestIds, workItemSelectModelFilter.autoTestIds) &&
        Objects.equals(this.workItemVersionIds, workItemSelectModelFilter.workItemVersionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameOrId, includeIds, excludeIds, projectIds, name, ids, globalIds, attributes, isDeleted, sectionIds, createdByIds, modifiedByIds, states, priorities, types, createdDate, modifiedDate, duration, medianDuration, isAutomated, tags, autoTestIds, workItemVersionIds);
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
    sb.append("class WorkItemSelectModelFilter {\n");
    sb.append("    nameOrId: ").append(toIndentedString(nameOrId)).append("\n");
    sb.append("    includeIds: ").append(toIndentedString(includeIds)).append("\n");
    sb.append("    excludeIds: ").append(toIndentedString(excludeIds)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    medianDuration: ").append(toIndentedString(medianDuration)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    autoTestIds: ").append(toIndentedString(autoTestIds)).append("\n");
    sb.append("    workItemVersionIds: ").append(toIndentedString(workItemVersionIds)).append("\n");
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
    openapiFields.add("nameOrId");
    openapiFields.add("includeIds");
    openapiFields.add("excludeIds");
    openapiFields.add("projectIds");
    openapiFields.add("name");
    openapiFields.add("ids");
    openapiFields.add("globalIds");
    openapiFields.add("attributes");
    openapiFields.add("isDeleted");
    openapiFields.add("sectionIds");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedByIds");
    openapiFields.add("states");
    openapiFields.add("priorities");
    openapiFields.add("types");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("duration");
    openapiFields.add("medianDuration");
    openapiFields.add("isAutomated");
    openapiFields.add("tags");
    openapiFields.add("autoTestIds");
    openapiFields.add("workItemVersionIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemSelectModelFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemSelectModelFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemSelectModelFilter is not found in the empty JSON string", WorkItemSelectModelFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemSelectModelFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemSelectModelFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("nameOrId") != null && !jsonObj.get("nameOrId").isJsonNull()) && !jsonObj.get("nameOrId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameOrId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameOrId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("includeIds") != null && !jsonObj.get("includeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeIds` to be an array in the JSON string but got `%s`", jsonObj.get("includeIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("excludeIds") != null && !jsonObj.get("excludeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeIds` to be an array in the JSON string but got `%s`", jsonObj.get("excludeIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("globalIds") != null && !jsonObj.get("globalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalIds` to be an array in the JSON string but got `%s`", jsonObj.get("globalIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sectionIds") != null && !jsonObj.get("sectionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionIds` to be an array in the JSON string but got `%s`", jsonObj.get("sectionIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modifiedByIds") != null && !jsonObj.get("modifiedByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByIds` to be an array in the JSON string but got `%s`", jsonObj.get("modifiedByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("states") != null && !jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("priorities") != null && !jsonObj.get("priorities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorities` to be an array in the JSON string but got `%s`", jsonObj.get("priorities").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        TestPointFilterModelWorkItemCreatedDate.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        TestPointFilterModelWorkItemModifiedDate.validateJsonObject(jsonObj.getAsJsonObject("modifiedDate"));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        TestSuiteWorkItemsSearchModelDuration.validateJsonObject(jsonObj.getAsJsonObject("duration"));
      }
      // validate the optional field `medianDuration`
      if (jsonObj.get("medianDuration") != null && !jsonObj.get("medianDuration").isJsonNull()) {
        TestSuiteWorkItemsSearchModelMedianDuration.validateJsonObject(jsonObj.getAsJsonObject("medianDuration"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("autoTestIds") != null && !jsonObj.get("autoTestIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoTestIds` to be an array in the JSON string but got `%s`", jsonObj.get("autoTestIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workItemVersionIds") != null && !jsonObj.get("workItemVersionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemVersionIds` to be an array in the JSON string but got `%s`", jsonObj.get("workItemVersionIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemSelectModelFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemSelectModelFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemSelectModelFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemSelectModelFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemSelectModelFilter>() {
           @Override
           public void write(JsonWriter out, WorkItemSelectModelFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemSelectModelFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemSelectModelFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemSelectModelFilter
  * @throws IOException if the JSON string is invalid with respect to WorkItemSelectModelFilter
  */
  public static WorkItemSelectModelFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemSelectModelFilter.class);
  }

 /**
  * Convert an instance of WorkItemSelectModelFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

