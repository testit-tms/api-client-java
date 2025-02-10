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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.IterationModel;
import ru.testit.client.model.LinkShortModel;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * WorkItemShortModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkItemShortModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private UUID versionId;

  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private Integer versionNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_TYPE_NAME = "entityTypeName";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_NAME)
  private String entityTypeName;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_SECTION_ID = "sectionId";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private UUID sectionId;

  public static final String SERIALIZED_NAME_SECTION_NAME = "sectionName";
  @SerializedName(SERIALIZED_NAME_SECTION_NAME)
  private String sectionName;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_MEDIAN_DURATION = "medianDuration";
  @SerializedName(SERIALIZED_NAME_MEDIAN_DURATION)
  private Long medianDuration;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private WorkItemStates state;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private WorkItemPriorityModel priority;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_TAG_NAMES = "tagNames";
  @SerializedName(SERIALIZED_NAME_TAG_NAMES)
  private List<String> tagNames;

  public static final String SERIALIZED_NAME_ITERATIONS = "iterations";
  @SerializedName(SERIALIZED_NAME_ITERATIONS)
  private List<IterationModel> iterations = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkShortModel> links = new ArrayList<>();

  public WorkItemShortModel() {
  }

  public WorkItemShortModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Work Item internal unique identifier
   * @return id
   */
  @javax.annotation.Nonnull
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
   * Work Item version identifier
   * @return versionId
   */
  @javax.annotation.Nonnull
  public UUID getVersionId() {
    return versionId;
  }

  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  public WorkItemShortModel versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Work Item version number
   * @return versionNumber
   */
  @javax.annotation.Nonnull
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public WorkItemShortModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Work Item name
   * @return name
   */
  @javax.annotation.Nonnull
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
   * Work Item type. Possible values: CheckLists, SharedSteps, TestCases
   * @return entityTypeName
   */
  @javax.annotation.Nonnull
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
   * Project unique identifier
   * @return projectId
   */
  @javax.annotation.Nonnull
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
   * Identifier of Section where Work Item is located
   * @return sectionId
   */
  @javax.annotation.Nonnull
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }


  public WorkItemShortModel sectionName(String sectionName) {
    this.sectionName = sectionName;
    return this;
  }

  /**
   * Section name of Work Item
   * @return sectionName
   */
  @javax.annotation.Nonnull
  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }


  public WorkItemShortModel isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

  /**
   * Boolean flag determining whether Work Item is automated
   * @return isAutomated
   */
  @javax.annotation.Nonnull
  public Boolean getIsAutomated() {
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
   * Work Item global identifier
   * @return globalId
   */
  @javax.annotation.Nonnull
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
   * Work Item duration
   * @return duration
   */
  @javax.annotation.Nonnull
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public WorkItemShortModel medianDuration(Long medianDuration) {
    this.medianDuration = medianDuration;
    return this;
  }

  /**
   * Work Item median duration
   * @return medianDuration
   */
  @javax.annotation.Nullable
  public Long getMedianDuration() {
    return medianDuration;
  }

  public void setMedianDuration(Long medianDuration) {
    this.medianDuration = medianDuration;
  }


  public WorkItemShortModel attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public WorkItemShortModel putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Work Item attributes
   * @return attributes
   */
  @javax.annotation.Nullable
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
   * Unique identifier of user who created Work Item
   * @return createdById
   */
  @javax.annotation.Nonnull
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
   * Unique identifier of user who applied the latest modification of Work Item
   * @return modifiedById
   */
  @javax.annotation.Nullable
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
   * Date and time of Work Item creation
   * @return createdDate
   */
  @javax.annotation.Nullable
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
   * Date and time of the latest modification of Work Item
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public WorkItemShortModel state(WorkItemStates state) {
    this.state = state;
    return this;
  }

  /**
   * The current state of Work Item
   * @return state
   */
  @javax.annotation.Nonnull
  public WorkItemStates getState() {
    return state;
  }

  public void setState(WorkItemStates state) {
    this.state = state;
  }


  public WorkItemShortModel priority(WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Work Item priority level
   * @return priority
   */
  @javax.annotation.Nonnull
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
   * Flag determining whether Work Item is deleted
   * @return isDeleted
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
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
      this.tagNames = new ArrayList<>();
    }
    this.tagNames.add(tagNamesItem);
    return this;
  }

  /**
   * Array of tag names of Work Item
   * @return tagNames
   */
  @javax.annotation.Nullable
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
      this.iterations = new ArrayList<>();
    }
    this.iterations.add(iterationsItem);
    return this;
  }

  /**
   * Set of iterations related to Work Item
   * @return iterations
   */
  @javax.annotation.Nonnull
  public List<IterationModel> getIterations() {
    return iterations;
  }

  public void setIterations(List<IterationModel> iterations) {
    this.iterations = iterations;
  }


  public WorkItemShortModel links(List<LinkShortModel> links) {
    this.links = links;
    return this;
  }

  public WorkItemShortModel addLinksItem(LinkShortModel linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Set of links related to Work Item
   * @return links
   */
  @javax.annotation.Nonnull
  public List<LinkShortModel> getLinks() {
    return links;
  }

  public void setLinks(List<LinkShortModel> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemShortModel workItemShortModel = (WorkItemShortModel) o;
    return Objects.equals(this.id, workItemShortModel.id) &&
        Objects.equals(this.versionId, workItemShortModel.versionId) &&
        Objects.equals(this.versionNumber, workItemShortModel.versionNumber) &&
        Objects.equals(this.name, workItemShortModel.name) &&
        Objects.equals(this.entityTypeName, workItemShortModel.entityTypeName) &&
        Objects.equals(this.projectId, workItemShortModel.projectId) &&
        Objects.equals(this.sectionId, workItemShortModel.sectionId) &&
        Objects.equals(this.sectionName, workItemShortModel.sectionName) &&
        Objects.equals(this.isAutomated, workItemShortModel.isAutomated) &&
        Objects.equals(this.globalId, workItemShortModel.globalId) &&
        Objects.equals(this.duration, workItemShortModel.duration) &&
        Objects.equals(this.medianDuration, workItemShortModel.medianDuration) &&
        Objects.equals(this.attributes, workItemShortModel.attributes) &&
        Objects.equals(this.createdById, workItemShortModel.createdById) &&
        Objects.equals(this.modifiedById, workItemShortModel.modifiedById) &&
        Objects.equals(this.createdDate, workItemShortModel.createdDate) &&
        Objects.equals(this.modifiedDate, workItemShortModel.modifiedDate) &&
        Objects.equals(this.state, workItemShortModel.state) &&
        Objects.equals(this.priority, workItemShortModel.priority) &&
        Objects.equals(this.isDeleted, workItemShortModel.isDeleted) &&
        Objects.equals(this.tagNames, workItemShortModel.tagNames) &&
        Objects.equals(this.iterations, workItemShortModel.iterations) &&
        Objects.equals(this.links, workItemShortModel.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionId, versionNumber, name, entityTypeName, projectId, sectionId, sectionName, isAutomated, globalId, duration, medianDuration, attributes, createdById, modifiedById, createdDate, modifiedDate, state, priority, isDeleted, tagNames, iterations, links);
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
    sb.append("class WorkItemShortModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    medianDuration: ").append(toIndentedString(medianDuration)).append("\n");
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
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("versionId");
    openapiFields.add("versionNumber");
    openapiFields.add("name");
    openapiFields.add("entityTypeName");
    openapiFields.add("projectId");
    openapiFields.add("sectionId");
    openapiFields.add("sectionName");
    openapiFields.add("isAutomated");
    openapiFields.add("globalId");
    openapiFields.add("duration");
    openapiFields.add("medianDuration");
    openapiFields.add("attributes");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("state");
    openapiFields.add("priority");
    openapiFields.add("isDeleted");
    openapiFields.add("tagNames");
    openapiFields.add("iterations");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("versionId");
    openapiRequiredFields.add("versionNumber");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("entityTypeName");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("sectionId");
    openapiRequiredFields.add("sectionName");
    openapiRequiredFields.add("isAutomated");
    openapiRequiredFields.add("globalId");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("iterations");
    openapiRequiredFields.add("links");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemShortModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemShortModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemShortModel is not found in the empty JSON string", WorkItemShortModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemShortModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemShortModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemShortModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("entityTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityTypeName").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("sectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionId").toString()));
      }
      if (!jsonObj.get("sectionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionName").toString()));
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      // validate the required field `state`
      WorkItemStates.validateJsonElement(jsonObj.get("state"));
      // validate the required field `priority`
      WorkItemPriorityModel.validateJsonElement(jsonObj.get("priority"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagNames") != null && !jsonObj.get("tagNames").isJsonNull() && !jsonObj.get("tagNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagNames` to be an array in the JSON string but got `%s`", jsonObj.get("tagNames").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("iterations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `iterations` to be an array in the JSON string but got `%s`", jsonObj.get("iterations").toString()));
      }

      JsonArray jsonArrayiterations = jsonObj.getAsJsonArray("iterations");
      // validate the required field `iterations` (array)
      for (int i = 0; i < jsonArrayiterations.size(); i++) {
        IterationModel.validateJsonElement(jsonArrayiterations.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        LinkShortModel.validateJsonElement(jsonArraylinks.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemShortModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemShortModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemShortModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemShortModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemShortModel>() {
           @Override
           public void write(JsonWriter out, WorkItemShortModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemShortModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemShortModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemShortModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemShortModel
   */
  public static WorkItemShortModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemShortModel.class);
  }

  /**
   * Convert an instance of WorkItemShortModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

