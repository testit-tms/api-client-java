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
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TagModel;
import ru.testit.client.model.WorkItemPriorityModel;

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
 * SharedStepReferenceModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SharedStepReferenceModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  @javax.annotation.Nonnull
  private Long globalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_TYPE_NAME = "entityTypeName";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_NAME)
  @javax.annotation.Nonnull
  private String entityTypeName;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_STEP = "hasThisSharedStepAsStep";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_STEP)
  @javax.annotation.Nonnull
  private Boolean hasThisSharedStepAsStep;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_PRECONDITION = "hasThisSharedStepAsPrecondition";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  @javax.annotation.Nonnull
  private Boolean hasThisSharedStepAsPrecondition;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_POSTCONDITION = "hasThisSharedStepAsPostcondition";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  @javax.annotation.Nonnull
  private Boolean hasThisSharedStepAsPostcondition;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  @javax.annotation.Nonnull
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  @javax.annotation.Nullable
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nonnull
  private String state;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @javax.annotation.Nonnull
  private WorkItemPriorityModel priority;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  @javax.annotation.Nonnull
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  @javax.annotation.Nonnull
  private UUID versionId;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  @javax.annotation.Nonnull
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_SECTION_ID = "sectionId";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  @javax.annotation.Nonnull
  private UUID sectionId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<TagModel> tags;

  public SharedStepReferenceModel() {
  }

  public SharedStepReferenceModel id(@javax.annotation.Nonnull UUID id) {
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

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public SharedStepReferenceModel globalId(@javax.annotation.Nonnull Long globalId) {
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

  public void setGlobalId(@javax.annotation.Nonnull Long globalId) {
    this.globalId = globalId;
  }


  public SharedStepReferenceModel name(@javax.annotation.Nonnull String name) {
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

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public SharedStepReferenceModel entityTypeName(@javax.annotation.Nonnull String entityTypeName) {
    this.entityTypeName = entityTypeName;
    return this;
  }

  /**
   * Get entityTypeName
   * @return entityTypeName
   */
  @javax.annotation.Nonnull
  public String getEntityTypeName() {
    return entityTypeName;
  }

  public void setEntityTypeName(@javax.annotation.Nonnull String entityTypeName) {
    this.entityTypeName = entityTypeName;
  }


  public SharedStepReferenceModel hasThisSharedStepAsStep(@javax.annotation.Nonnull Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
    return this;
  }

  /**
   * Get hasThisSharedStepAsStep
   * @return hasThisSharedStepAsStep
   */
  @javax.annotation.Nonnull
  public Boolean getHasThisSharedStepAsStep() {
    return hasThisSharedStepAsStep;
  }

  public void setHasThisSharedStepAsStep(@javax.annotation.Nonnull Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
  }


  public SharedStepReferenceModel hasThisSharedStepAsPrecondition(@javax.annotation.Nonnull Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
    return this;
  }

  /**
   * Get hasThisSharedStepAsPrecondition
   * @return hasThisSharedStepAsPrecondition
   */
  @javax.annotation.Nonnull
  public Boolean getHasThisSharedStepAsPrecondition() {
    return hasThisSharedStepAsPrecondition;
  }

  public void setHasThisSharedStepAsPrecondition(@javax.annotation.Nonnull Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
  }


  public SharedStepReferenceModel hasThisSharedStepAsPostcondition(@javax.annotation.Nonnull Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
    return this;
  }

  /**
   * Get hasThisSharedStepAsPostcondition
   * @return hasThisSharedStepAsPostcondition
   */
  @javax.annotation.Nonnull
  public Boolean getHasThisSharedStepAsPostcondition() {
    return hasThisSharedStepAsPostcondition;
  }

  public void setHasThisSharedStepAsPostcondition(@javax.annotation.Nonnull Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
  }


  public SharedStepReferenceModel createdById(@javax.annotation.Nonnull UUID createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * Get createdById
   * @return createdById
   */
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(@javax.annotation.Nonnull UUID createdById) {
    this.createdById = createdById;
  }


  public SharedStepReferenceModel modifiedById(@javax.annotation.Nullable UUID modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

  /**
   * Get modifiedById
   * @return modifiedById
   */
  @javax.annotation.Nullable
  public UUID getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(@javax.annotation.Nullable UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public SharedStepReferenceModel createdDate(@javax.annotation.Nullable OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public SharedStepReferenceModel modifiedDate(@javax.annotation.Nullable OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(@javax.annotation.Nullable OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public SharedStepReferenceModel state(@javax.annotation.Nonnull String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nonnull String state) {
    this.state = state;
  }


  public SharedStepReferenceModel priority(@javax.annotation.Nonnull WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nonnull
  public WorkItemPriorityModel getPriority() {
    return priority;
  }

  public void setPriority(@javax.annotation.Nonnull WorkItemPriorityModel priority) {
    this.priority = priority;
  }


  public SharedStepReferenceModel isDeleted(@javax.annotation.Nonnull Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(@javax.annotation.Nonnull Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public SharedStepReferenceModel versionId(@javax.annotation.Nonnull UUID versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * used for versioning changes in workitem
   * @return versionId
   */
  @javax.annotation.Nonnull
  public UUID getVersionId() {
    return versionId;
  }

  public void setVersionId(@javax.annotation.Nonnull UUID versionId) {
    this.versionId = versionId;
  }


  public SharedStepReferenceModel isAutomated(@javax.annotation.Nonnull Boolean isAutomated) {
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

  public void setIsAutomated(@javax.annotation.Nonnull Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public SharedStepReferenceModel sectionId(@javax.annotation.Nonnull UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Get sectionId
   * @return sectionId
   */
  @javax.annotation.Nonnull
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(@javax.annotation.Nonnull UUID sectionId) {
    this.sectionId = sectionId;
  }


  public SharedStepReferenceModel tags(@javax.annotation.Nullable List<TagModel> tags) {
    this.tags = tags;
    return this;
  }

  public SharedStepReferenceModel addTagsItem(TagModel tagsItem) {
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
  @javax.annotation.Nullable
  public List<TagModel> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<TagModel> tags) {
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
    SharedStepReferenceModel sharedStepReferenceModel = (SharedStepReferenceModel) o;
    return Objects.equals(this.id, sharedStepReferenceModel.id) &&
        Objects.equals(this.globalId, sharedStepReferenceModel.globalId) &&
        Objects.equals(this.name, sharedStepReferenceModel.name) &&
        Objects.equals(this.entityTypeName, sharedStepReferenceModel.entityTypeName) &&
        Objects.equals(this.hasThisSharedStepAsStep, sharedStepReferenceModel.hasThisSharedStepAsStep) &&
        Objects.equals(this.hasThisSharedStepAsPrecondition, sharedStepReferenceModel.hasThisSharedStepAsPrecondition) &&
        Objects.equals(this.hasThisSharedStepAsPostcondition, sharedStepReferenceModel.hasThisSharedStepAsPostcondition) &&
        Objects.equals(this.createdById, sharedStepReferenceModel.createdById) &&
        Objects.equals(this.modifiedById, sharedStepReferenceModel.modifiedById) &&
        Objects.equals(this.createdDate, sharedStepReferenceModel.createdDate) &&
        Objects.equals(this.modifiedDate, sharedStepReferenceModel.modifiedDate) &&
        Objects.equals(this.state, sharedStepReferenceModel.state) &&
        Objects.equals(this.priority, sharedStepReferenceModel.priority) &&
        Objects.equals(this.isDeleted, sharedStepReferenceModel.isDeleted) &&
        Objects.equals(this.versionId, sharedStepReferenceModel.versionId) &&
        Objects.equals(this.isAutomated, sharedStepReferenceModel.isAutomated) &&
        Objects.equals(this.sectionId, sharedStepReferenceModel.sectionId) &&
        Objects.equals(this.tags, sharedStepReferenceModel.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, globalId, name, entityTypeName, hasThisSharedStepAsStep, hasThisSharedStepAsPrecondition, hasThisSharedStepAsPostcondition, createdById, modifiedById, createdDate, modifiedDate, state, priority, isDeleted, versionId, isAutomated, sectionId, tags);
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
    sb.append("class SharedStepReferenceModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
    sb.append("    hasThisSharedStepAsStep: ").append(toIndentedString(hasThisSharedStepAsStep)).append("\n");
    sb.append("    hasThisSharedStepAsPrecondition: ").append(toIndentedString(hasThisSharedStepAsPrecondition)).append("\n");
    sb.append("    hasThisSharedStepAsPostcondition: ").append(toIndentedString(hasThisSharedStepAsPostcondition)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("globalId");
    openapiFields.add("name");
    openapiFields.add("entityTypeName");
    openapiFields.add("hasThisSharedStepAsStep");
    openapiFields.add("hasThisSharedStepAsPrecondition");
    openapiFields.add("hasThisSharedStepAsPostcondition");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("state");
    openapiFields.add("priority");
    openapiFields.add("isDeleted");
    openapiFields.add("versionId");
    openapiFields.add("isAutomated");
    openapiFields.add("sectionId");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("globalId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("entityTypeName");
    openapiRequiredFields.add("hasThisSharedStepAsStep");
    openapiRequiredFields.add("hasThisSharedStepAsPrecondition");
    openapiRequiredFields.add("hasThisSharedStepAsPostcondition");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("versionId");
    openapiRequiredFields.add("isAutomated");
    openapiRequiredFields.add("sectionId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SharedStepReferenceModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SharedStepReferenceModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharedStepReferenceModel is not found in the empty JSON string", SharedStepReferenceModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SharedStepReferenceModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SharedStepReferenceModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SharedStepReferenceModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("entityTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityTypeName").toString()));
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `priority`
      WorkItemPriorityModel.validateJsonElement(jsonObj.get("priority"));
      if (!jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      if (!jsonObj.get("sectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionId").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TagModel.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedStepReferenceModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedStepReferenceModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedStepReferenceModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedStepReferenceModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedStepReferenceModel>() {
           @Override
           public void write(JsonWriter out, SharedStepReferenceModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedStepReferenceModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SharedStepReferenceModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SharedStepReferenceModel
   * @throws IOException if the JSON string is invalid with respect to SharedStepReferenceModel
   */
  public static SharedStepReferenceModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedStepReferenceModel.class);
  }

  /**
   * Convert an instance of SharedStepReferenceModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

