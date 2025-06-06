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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AuditApiResult;
import ru.testit.client.model.TestPlanTestPointsSectionSearchApiResult;
import ru.testit.client.model.WorkItemPriority;
import ru.testit.client.model.WorkItemState;

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
 * TestPlanTestPointsWorkItemSearchApiResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestPlanTestPointsWorkItemSearchApiResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private UUID versionId;

  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private Integer versionNumber;

  public static final String SERIALIZED_NAME_MEDIAN_DURATION = "medianDuration";
  @SerializedName(SERIALIZED_NAME_MEDIAN_DURATION)
  private Long medianDuration;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private WorkItemState state;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_ORDER_RANK = "orderRank";
  @SerializedName(SERIALIZED_NAME_ORDER_RANK)
  private String orderRank;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private WorkItemPriority priority;

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private TestPlanTestPointsSectionSearchApiResult section;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private AuditApiResult created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private AuditApiResult modified;

  public TestPlanTestPointsWorkItemSearchApiResult() {
  }

  public TestPlanTestPointsWorkItemSearchApiResult id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public TestPlanTestPointsWorkItemSearchApiResult globalId(Long globalId) {
    this.globalId = globalId;
    return this;
  }

  /**
   * Get globalId
   * @return globalId
   */
  @javax.annotation.Nonnull
  public Long getGlobalId() {
    return globalId;
  }

  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public TestPlanTestPointsWorkItemSearchApiResult versionId(UUID versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId
   * @return versionId
   */
  @javax.annotation.Nonnull
  public UUID getVersionId() {
    return versionId;
  }

  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  public TestPlanTestPointsWorkItemSearchApiResult versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
   */
  @javax.annotation.Nonnull
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public TestPlanTestPointsWorkItemSearchApiResult medianDuration(Long medianDuration) {
    this.medianDuration = medianDuration;
    return this;
  }

  /**
   * Get medianDuration
   * @return medianDuration
   */
  @javax.annotation.Nullable
  public Long getMedianDuration() {
    return medianDuration;
  }

  public void setMedianDuration(Long medianDuration) {
    this.medianDuration = medianDuration;
  }


  public TestPlanTestPointsWorkItemSearchApiResult isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
   */
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public TestPlanTestPointsWorkItemSearchApiResult duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  @javax.annotation.Nonnull
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public TestPlanTestPointsWorkItemSearchApiResult state(WorkItemState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  public WorkItemState getState() {
    return state;
  }

  public void setState(WorkItemState state) {
    this.state = state;
  }


  public TestPlanTestPointsWorkItemSearchApiResult tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TestPlanTestPointsWorkItemSearchApiResult addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nonnull
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TestPlanTestPointsWorkItemSearchApiResult attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TestPlanTestPointsWorkItemSearchApiResult putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nonnull
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public TestPlanTestPointsWorkItemSearchApiResult orderRank(String orderRank) {
    this.orderRank = orderRank;
    return this;
  }

  /**
   * Get orderRank
   * @return orderRank
   */
  @javax.annotation.Nullable
  public String getOrderRank() {
    return orderRank;
  }

  public void setOrderRank(String orderRank) {
    this.orderRank = orderRank;
  }


  public TestPlanTestPointsWorkItemSearchApiResult isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

  /**
   * Get isAutomated
   * @return isAutomated
   */
  @javax.annotation.Nonnull
  public Boolean getIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public TestPlanTestPointsWorkItemSearchApiResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestPlanTestPointsWorkItemSearchApiResult priority(WorkItemPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nonnull
  public WorkItemPriority getPriority() {
    return priority;
  }

  public void setPriority(WorkItemPriority priority) {
    this.priority = priority;
  }


  public TestPlanTestPointsWorkItemSearchApiResult section(TestPlanTestPointsSectionSearchApiResult section) {
    this.section = section;
    return this;
  }

  /**
   * Get section
   * @return section
   */
  @javax.annotation.Nonnull
  public TestPlanTestPointsSectionSearchApiResult getSection() {
    return section;
  }

  public void setSection(TestPlanTestPointsSectionSearchApiResult section) {
    this.section = section;
  }


  public TestPlanTestPointsWorkItemSearchApiResult created(AuditApiResult created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nonnull
  public AuditApiResult getCreated() {
    return created;
  }

  public void setCreated(AuditApiResult created) {
    this.created = created;
  }


  public TestPlanTestPointsWorkItemSearchApiResult modified(AuditApiResult modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   */
  @javax.annotation.Nullable
  public AuditApiResult getModified() {
    return modified;
  }

  public void setModified(AuditApiResult modified) {
    this.modified = modified;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanTestPointsWorkItemSearchApiResult testPlanTestPointsWorkItemSearchApiResult = (TestPlanTestPointsWorkItemSearchApiResult) o;
    return Objects.equals(this.id, testPlanTestPointsWorkItemSearchApiResult.id) &&
        Objects.equals(this.globalId, testPlanTestPointsWorkItemSearchApiResult.globalId) &&
        Objects.equals(this.versionId, testPlanTestPointsWorkItemSearchApiResult.versionId) &&
        Objects.equals(this.versionNumber, testPlanTestPointsWorkItemSearchApiResult.versionNumber) &&
        Objects.equals(this.medianDuration, testPlanTestPointsWorkItemSearchApiResult.medianDuration) &&
        Objects.equals(this.isDeleted, testPlanTestPointsWorkItemSearchApiResult.isDeleted) &&
        Objects.equals(this.duration, testPlanTestPointsWorkItemSearchApiResult.duration) &&
        Objects.equals(this.state, testPlanTestPointsWorkItemSearchApiResult.state) &&
        Objects.equals(this.tags, testPlanTestPointsWorkItemSearchApiResult.tags) &&
        Objects.equals(this.attributes, testPlanTestPointsWorkItemSearchApiResult.attributes) &&
        Objects.equals(this.orderRank, testPlanTestPointsWorkItemSearchApiResult.orderRank) &&
        Objects.equals(this.isAutomated, testPlanTestPointsWorkItemSearchApiResult.isAutomated) &&
        Objects.equals(this.name, testPlanTestPointsWorkItemSearchApiResult.name) &&
        Objects.equals(this.priority, testPlanTestPointsWorkItemSearchApiResult.priority) &&
        Objects.equals(this.section, testPlanTestPointsWorkItemSearchApiResult.section) &&
        Objects.equals(this.created, testPlanTestPointsWorkItemSearchApiResult.created) &&
        Objects.equals(this.modified, testPlanTestPointsWorkItemSearchApiResult.modified);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, globalId, versionId, versionNumber, medianDuration, isDeleted, duration, state, tags, attributes, orderRank, isAutomated, name, priority, section, created, modified);
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
    sb.append("class TestPlanTestPointsWorkItemSearchApiResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    medianDuration: ").append(toIndentedString(medianDuration)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    orderRank: ").append(toIndentedString(orderRank)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
    openapiFields.add("globalId");
    openapiFields.add("versionId");
    openapiFields.add("versionNumber");
    openapiFields.add("medianDuration");
    openapiFields.add("isDeleted");
    openapiFields.add("duration");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("attributes");
    openapiFields.add("orderRank");
    openapiFields.add("isAutomated");
    openapiFields.add("name");
    openapiFields.add("priority");
    openapiFields.add("section");
    openapiFields.add("created");
    openapiFields.add("modified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("globalId");
    openapiRequiredFields.add("versionId");
    openapiRequiredFields.add("versionNumber");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("attributes");
    openapiRequiredFields.add("isAutomated");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("section");
    openapiRequiredFields.add("created");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestPlanTestPointsWorkItemSearchApiResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestPlanTestPointsWorkItemSearchApiResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanTestPointsWorkItemSearchApiResult is not found in the empty JSON string", TestPlanTestPointsWorkItemSearchApiResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestPlanTestPointsWorkItemSearchApiResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanTestPointsWorkItemSearchApiResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestPlanTestPointsWorkItemSearchApiResult.openapiRequiredFields) {
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
      // validate the required field `state`
      WorkItemState.validateJsonElement(jsonObj.get("state"));
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("orderRank") != null && !jsonObj.get("orderRank").isJsonNull()) && !jsonObj.get("orderRank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderRank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderRank").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `priority`
      WorkItemPriority.validateJsonElement(jsonObj.get("priority"));
      // validate the required field `section`
      TestPlanTestPointsSectionSearchApiResult.validateJsonElement(jsonObj.get("section"));
      // validate the required field `created`
      AuditApiResult.validateJsonElement(jsonObj.get("created"));
      // validate the optional field `modified`
      if (jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonNull()) {
        AuditApiResult.validateJsonElement(jsonObj.get("modified"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPlanTestPointsWorkItemSearchApiResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanTestPointsWorkItemSearchApiResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanTestPointsWorkItemSearchApiResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanTestPointsWorkItemSearchApiResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanTestPointsWorkItemSearchApiResult>() {
           @Override
           public void write(JsonWriter out, TestPlanTestPointsWorkItemSearchApiResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanTestPointsWorkItemSearchApiResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestPlanTestPointsWorkItemSearchApiResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestPlanTestPointsWorkItemSearchApiResult
   * @throws IOException if the JSON string is invalid with respect to TestPlanTestPointsWorkItemSearchApiResult
   */
  public static TestPlanTestPointsWorkItemSearchApiResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanTestPointsWorkItemSearchApiResult.class);
  }

  /**
   * Convert an instance of TestPlanTestPointsWorkItemSearchApiResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

