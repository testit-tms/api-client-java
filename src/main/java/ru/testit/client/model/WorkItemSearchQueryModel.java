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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.Int32RangeSelectorModel;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * WorkItemSearchQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemSearchQueryModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private Set<UUID> ids = null;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Set<String>> attributes = null;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds = null;

  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  private Set<UUID> sectionIds = null;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds = null;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds = null;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  private Set<WorkItemStates> states = null;

  public static final String SERIALIZED_NAME_PRIORITIES = "priorities";
  @SerializedName(SERIALIZED_NAME_PRIORITIES)
  private Set<WorkItemPriorityModel> priorities = null;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private Set<WorkItemEntityTypes> types = null;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateTimeRangeSelectorModel createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private DateTimeRangeSelectorModel modifiedDate;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Int32RangeSelectorModel duration;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<String> tags = null;

  public static final String SERIALIZED_NAME_AUTO_TEST_IDS = "autoTestIds";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_IDS)
  private Set<UUID> autoTestIds = null;

  public WorkItemSearchQueryModel() {
  }

  public WorkItemSearchQueryModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of work item
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of work item")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkItemSearchQueryModel ids(Set<UUID> ids) {
    
    this.ids = ids;
    return this;
  }

  public WorkItemSearchQueryModel addIdsItem(UUID idsItem) {
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
  @ApiModelProperty(value = "Specifies a work item unique IDs to search for")

  public Set<UUID> getIds() {
    return ids;
  }


  public void setIds(Set<UUID> ids) {
    this.ids = ids;
  }


  public WorkItemSearchQueryModel globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public WorkItemSearchQueryModel addGlobalIdsItem(Long globalIdsItem) {
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
  @ApiModelProperty(value = "Collection of global (integer) identifiers")

  public Set<Long> getGlobalIds() {
    return globalIds;
  }


  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }


  public WorkItemSearchQueryModel attributes(Map<String, Set<String>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public WorkItemSearchQueryModel putAttributesItem(String key, Set<String> attributesItem) {
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
  @ApiModelProperty(value = "Custom attributes of work item")

  public Map<String, Set<String>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = attributes;
  }


  public WorkItemSearchQueryModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Is result must consist of only actual/deleted work items
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is result must consist of only actual/deleted work items")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public WorkItemSearchQueryModel projectIds(Set<UUID> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public WorkItemSearchQueryModel addProjectIdsItem(UUID projectIdsItem) {
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
  @ApiModelProperty(value = "Collection of project identifiers")

  public Set<UUID> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public WorkItemSearchQueryModel sectionIds(Set<UUID> sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

  public WorkItemSearchQueryModel addSectionIdsItem(UUID sectionIdsItem) {
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
  @ApiModelProperty(value = "Collection of section identifiers")

  public Set<UUID> getSectionIds() {
    return sectionIds;
  }


  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = sectionIds;
  }


  public WorkItemSearchQueryModel createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public WorkItemSearchQueryModel addCreatedByIdsItem(UUID createdByIdsItem) {
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
  @ApiModelProperty(value = "Collection of identifiers of users who created work item")

  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public WorkItemSearchQueryModel modifiedByIds(Set<UUID> modifiedByIds) {
    
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public WorkItemSearchQueryModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
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
  @ApiModelProperty(value = "Collection of identifiers of users who applied last modification to work item")

  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }


  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }


  public WorkItemSearchQueryModel states(Set<WorkItemStates> states) {
    
    this.states = states;
    return this;
  }

  public WorkItemSearchQueryModel addStatesItem(WorkItemStates statesItem) {
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
  @ApiModelProperty(value = "Collection of states of work item")

  public Set<WorkItemStates> getStates() {
    return states;
  }


  public void setStates(Set<WorkItemStates> states) {
    this.states = states;
  }


  public WorkItemSearchQueryModel priorities(Set<WorkItemPriorityModel> priorities) {
    
    this.priorities = priorities;
    return this;
  }

  public WorkItemSearchQueryModel addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
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
  @ApiModelProperty(value = "Collection of priorities of work item")

  public Set<WorkItemPriorityModel> getPriorities() {
    return priorities;
  }


  public void setPriorities(Set<WorkItemPriorityModel> priorities) {
    this.priorities = priorities;
  }


  public WorkItemSearchQueryModel types(Set<WorkItemEntityTypes> types) {
    
    this.types = types;
    return this;
  }

  public WorkItemSearchQueryModel addTypesItem(WorkItemEntityTypes typesItem) {
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
  @ApiModelProperty(value = "Collection of types of work item")

  public Set<WorkItemEntityTypes> getTypes() {
    return types;
  }


  public void setTypes(Set<WorkItemEntityTypes> types) {
    this.types = types;
  }


  public WorkItemSearchQueryModel createdDate(DateTimeRangeSelectorModel createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  public WorkItemSearchQueryModel modifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateTimeRangeSelectorModel getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(DateTimeRangeSelectorModel modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public WorkItemSearchQueryModel duration(Int32RangeSelectorModel duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Int32RangeSelectorModel getDuration() {
    return duration;
  }


  public void setDuration(Int32RangeSelectorModel duration) {
    this.duration = duration;
  }


  public WorkItemSearchQueryModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Is result must consist of only manual/automated work items
   * @return isAutomated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is result must consist of only manual/automated work items")

  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public WorkItemSearchQueryModel tags(Set<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public WorkItemSearchQueryModel addTagsItem(String tagsItem) {
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
  @ApiModelProperty(value = "Collection of tags")

  public Set<String> getTags() {
    return tags;
  }


  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public WorkItemSearchQueryModel autoTestIds(Set<UUID> autoTestIds) {
    
    this.autoTestIds = autoTestIds;
    return this;
  }

  public WorkItemSearchQueryModel addAutoTestIdsItem(UUID autoTestIdsItem) {
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
  @ApiModelProperty(value = "Collection of identifiers of linked autotests")

  public Set<UUID> getAutoTestIds() {
    return autoTestIds;
  }


  public void setAutoTestIds(Set<UUID> autoTestIds) {
    this.autoTestIds = autoTestIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemSearchQueryModel workItemSearchQueryModel = (WorkItemSearchQueryModel) o;
    return Objects.equals(this.name, workItemSearchQueryModel.name) &&
        Objects.equals(this.ids, workItemSearchQueryModel.ids) &&
        Objects.equals(this.globalIds, workItemSearchQueryModel.globalIds) &&
        Objects.equals(this.attributes, workItemSearchQueryModel.attributes) &&
        Objects.equals(this.isDeleted, workItemSearchQueryModel.isDeleted) &&
        Objects.equals(this.projectIds, workItemSearchQueryModel.projectIds) &&
        Objects.equals(this.sectionIds, workItemSearchQueryModel.sectionIds) &&
        Objects.equals(this.createdByIds, workItemSearchQueryModel.createdByIds) &&
        Objects.equals(this.modifiedByIds, workItemSearchQueryModel.modifiedByIds) &&
        Objects.equals(this.states, workItemSearchQueryModel.states) &&
        Objects.equals(this.priorities, workItemSearchQueryModel.priorities) &&
        Objects.equals(this.types, workItemSearchQueryModel.types) &&
        Objects.equals(this.createdDate, workItemSearchQueryModel.createdDate) &&
        Objects.equals(this.modifiedDate, workItemSearchQueryModel.modifiedDate) &&
        Objects.equals(this.duration, workItemSearchQueryModel.duration) &&
        Objects.equals(this.isAutomated, workItemSearchQueryModel.isAutomated) &&
        Objects.equals(this.tags, workItemSearchQueryModel.tags) &&
        Objects.equals(this.autoTestIds, workItemSearchQueryModel.autoTestIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ids, globalIds, attributes, isDeleted, projectIds, sectionIds, createdByIds, modifiedByIds, states, priorities, types, createdDate, modifiedDate, duration, isAutomated, tags, autoTestIds);
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
    sb.append("class WorkItemSearchQueryModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    autoTestIds: ").append(toIndentedString(autoTestIds)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("ids");
    openapiFields.add("globalIds");
    openapiFields.add("attributes");
    openapiFields.add("isDeleted");
    openapiFields.add("projectIds");
    openapiFields.add("sectionIds");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedByIds");
    openapiFields.add("states");
    openapiFields.add("priorities");
    openapiFields.add("types");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("duration");
    openapiFields.add("isAutomated");
    openapiFields.add("tags");
    openapiFields.add("autoTestIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemSearchQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemSearchQueryModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemSearchQueryModel is not found in the empty JSON string", WorkItemSearchQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemSearchQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemSearchQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
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
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("modifiedDate"));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        Int32RangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("duration"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("autoTestIds") != null && !jsonObj.get("autoTestIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoTestIds` to be an array in the JSON string but got `%s`", jsonObj.get("autoTestIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemSearchQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemSearchQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemSearchQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemSearchQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemSearchQueryModel>() {
           @Override
           public void write(JsonWriter out, WorkItemSearchQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemSearchQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemSearchQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemSearchQueryModel
  * @throws IOException if the JSON string is invalid with respect to WorkItemSearchQueryModel
  */
  public static WorkItemSearchQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemSearchQueryModel.class);
  }

 /**
  * Convert an instance of WorkItemSearchQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

