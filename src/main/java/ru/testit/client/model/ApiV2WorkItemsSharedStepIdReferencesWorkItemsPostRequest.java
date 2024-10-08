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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.SharedStepReferenceSectionsQueryFilterModelCreatedDate;
import ru.testit.client.model.SharedStepReferenceSectionsQueryFilterModelModifiedDate;
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
 * ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds;

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

  public static final String SERIALIZED_NAME_ENTITY_TYPES = "entityTypes";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPES)
  private Set<String> entityTypes;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private SharedStepReferenceSectionsQueryFilterModelCreatedDate createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private SharedStepReferenceSectionsQueryFilterModelModifiedDate modifiedDate;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Set<String> tags;

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest() {
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest name(String name) {
    
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addGlobalIdsItem(Long globalIdsItem) {
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest sectionIds(Set<UUID> sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addSectionIdsItem(UUID sectionIdsItem) {
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addCreatedByIdsItem(UUID createdByIdsItem) {
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest modifiedByIds(Set<UUID> modifiedByIds) {
    
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addModifiedByIdsItem(UUID modifiedByIdsItem) {
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest states(Set<WorkItemStates> states) {
    
    this.states = states;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addStatesItem(WorkItemStates statesItem) {
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest priorities(Set<WorkItemPriorityModel> priorities) {
    
    this.priorities = priorities;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addPrioritiesItem(WorkItemPriorityModel prioritiesItem) {
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest entityTypes(Set<String> entityTypes) {
    
    this.entityTypes = entityTypes;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addEntityTypesItem(String entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = new LinkedHashSet<>();
    }
    this.entityTypes.add(entityTypesItem);
    return this;
  }

   /**
   * Collection of types of work item   Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60;
   * @return entityTypes
  **/
  @javax.annotation.Nullable
  public Set<String> getEntityTypes() {
    return entityTypes;
  }


  public void setEntityTypes(Set<String> entityTypes) {
    this.entityTypes = entityTypes;
  }


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest createdDate(SharedStepReferenceSectionsQueryFilterModelCreatedDate createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public SharedStepReferenceSectionsQueryFilterModelCreatedDate getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(SharedStepReferenceSectionsQueryFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
  }


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest modifiedDate(SharedStepReferenceSectionsQueryFilterModelModifiedDate modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public SharedStepReferenceSectionsQueryFilterModelModifiedDate getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(SharedStepReferenceSectionsQueryFilterModelModifiedDate modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest isAutomated(Boolean isAutomated) {
    
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


  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest tags(Set<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest addTagsItem(String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest = (ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest) o;
    return Objects.equals(this.name, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.name) &&
        Objects.equals(this.globalIds, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.globalIds) &&
        Objects.equals(this.sectionIds, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.sectionIds) &&
        Objects.equals(this.createdByIds, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.createdByIds) &&
        Objects.equals(this.modifiedByIds, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.modifiedByIds) &&
        Objects.equals(this.states, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.states) &&
        Objects.equals(this.priorities, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.priorities) &&
        Objects.equals(this.entityTypes, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.entityTypes) &&
        Objects.equals(this.createdDate, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.createdDate) &&
        Objects.equals(this.modifiedDate, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.modifiedDate) &&
        Objects.equals(this.isAutomated, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.isAutomated) &&
        Objects.equals(this.tags, apiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, globalIds, sectionIds, createdByIds, modifiedByIds, states, priorities, entityTypes, createdDate, modifiedDate, isAutomated, tags);
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
    sb.append("class ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("globalIds");
    openapiFields.add("sectionIds");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedByIds");
    openapiFields.add("states");
    openapiFields.add("priorities");
    openapiFields.add("entityTypes");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("isAutomated");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest is not found in the empty JSON string", ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      if (jsonObj.get("entityTypes") != null && !jsonObj.get("entityTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityTypes` to be an array in the JSON string but got `%s`", jsonObj.get("entityTypes").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        SharedStepReferenceSectionsQueryFilterModelCreatedDate.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        SharedStepReferenceSectionsQueryFilterModelModifiedDate.validateJsonObject(jsonObj.getAsJsonObject("modifiedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest
  */
  public static ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2WorkItemsSharedStepIdReferencesWorkItemsPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

