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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TagShortModel;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * SharedStepReferenceModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedStepReferenceModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENTITY_TYPE_NAME = "entityTypeName";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_NAME)
  private String entityTypeName;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_STEP = "hasThisSharedStepAsStep";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_STEP)
  private Boolean hasThisSharedStepAsStep;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_PRECONDITION = "hasThisSharedStepAsPrecondition";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  private Boolean hasThisSharedStepAsPrecondition;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_POSTCONDITION = "hasThisSharedStepAsPostcondition";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  private Boolean hasThisSharedStepAsPostcondition;

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
  private String state;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private WorkItemPriorityModel priority;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private UUID versionId;

  public static final String SERIALIZED_NAME_IS_AUTOMATED = "isAutomated";
  @SerializedName(SERIALIZED_NAME_IS_AUTOMATED)
  private Boolean isAutomated;

  public static final String SERIALIZED_NAME_SECTION_ID = "sectionId";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private UUID sectionId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagShortModel> tags;

  public SharedStepReferenceModel() {
  }

  public SharedStepReferenceModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public SharedStepReferenceModel globalId(Long globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @javax.annotation.Nullable
  public Long getGlobalId() {
    return globalId;
  }


  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public SharedStepReferenceModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SharedStepReferenceModel entityTypeName(String entityTypeName) {
    
    this.entityTypeName = entityTypeName;
    return this;
  }

   /**
   * Get entityTypeName
   * @return entityTypeName
  **/
  @javax.annotation.Nullable
  public String getEntityTypeName() {
    return entityTypeName;
  }


  public void setEntityTypeName(String entityTypeName) {
    this.entityTypeName = entityTypeName;
  }


  public SharedStepReferenceModel hasThisSharedStepAsStep(Boolean hasThisSharedStepAsStep) {
    
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
    return this;
  }

   /**
   * Get hasThisSharedStepAsStep
   * @return hasThisSharedStepAsStep
  **/
  @javax.annotation.Nullable
  public Boolean getHasThisSharedStepAsStep() {
    return hasThisSharedStepAsStep;
  }


  public void setHasThisSharedStepAsStep(Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
  }


  public SharedStepReferenceModel hasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPrecondition
   * @return hasThisSharedStepAsPrecondition
  **/
  @javax.annotation.Nullable
  public Boolean getHasThisSharedStepAsPrecondition() {
    return hasThisSharedStepAsPrecondition;
  }


  public void setHasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
  }


  public SharedStepReferenceModel hasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPostcondition
   * @return hasThisSharedStepAsPostcondition
  **/
  @javax.annotation.Nullable
  public Boolean getHasThisSharedStepAsPostcondition() {
    return hasThisSharedStepAsPostcondition;
  }


  public void setHasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
  }


  public SharedStepReferenceModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public SharedStepReferenceModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public SharedStepReferenceModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public SharedStepReferenceModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public SharedStepReferenceModel state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public SharedStepReferenceModel priority(WorkItemPriorityModel priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  public WorkItemPriorityModel getPriority() {
    return priority;
  }


  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }


  public SharedStepReferenceModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public SharedStepReferenceModel versionId(UUID versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * used for versioning changes in workitem
   * @return versionId
  **/
  @javax.annotation.Nullable
  public UUID getVersionId() {
    return versionId;
  }


  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  public SharedStepReferenceModel isAutomated(Boolean isAutomated) {
    
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @javax.annotation.Nullable
  public Boolean getIsAutomated() {
    return isAutomated;
  }


  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }


  public SharedStepReferenceModel sectionId(UUID sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @javax.annotation.Nullable
  public UUID getSectionId() {
    return sectionId;
  }


  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }


  public SharedStepReferenceModel tags(List<TagShortModel> tags) {
    
    this.tags = tags;
    return this;
  }

  public SharedStepReferenceModel addTagsItem(TagShortModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<TagShortModel> getTags() {
    return tags;
  }


  public void setTags(List<TagShortModel> tags) {
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
    openapiRequiredFields.add("priority");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SharedStepReferenceModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SharedStepReferenceModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharedStepReferenceModel is not found in the empty JSON string", SharedStepReferenceModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SharedStepReferenceModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SharedStepReferenceModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SharedStepReferenceModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("entityTypeName") != null && !jsonObj.get("entityTypeName").isJsonNull()) && !jsonObj.get("entityTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityTypeName").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonNull()) && !jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      if ((jsonObj.get("sectionId") != null && !jsonObj.get("sectionId").isJsonNull()) && !jsonObj.get("sectionId").isJsonPrimitive()) {
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
            TagShortModel.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

