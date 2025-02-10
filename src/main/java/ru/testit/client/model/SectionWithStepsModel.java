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
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.StepModel;

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
 * SectionWithStepsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class SectionWithStepsModel {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentModel> attachments;

  public static final String SERIALIZED_NAME_PRECONDITION_STEPS = "preconditionSteps";
  @SerializedName(SERIALIZED_NAME_PRECONDITION_STEPS)
  private List<StepModel> preconditionSteps;

  public static final String SERIALIZED_NAME_POSTCONDITION_STEPS = "postconditionSteps";
  @SerializedName(SERIALIZED_NAME_POSTCONDITION_STEPS)
  private List<StepModel> postconditionSteps;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SectionWithStepsModel() {
  }

  public SectionWithStepsModel attachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public SectionWithStepsModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<AttachmentModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
  }


  public SectionWithStepsModel preconditionSteps(List<StepModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public SectionWithStepsModel addPreconditionStepsItem(StepModel preconditionStepsItem) {
    if (this.preconditionSteps == null) {
      this.preconditionSteps = new ArrayList<>();
    }
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

  /**
   * Get preconditionSteps
   * @return preconditionSteps
   */
  @javax.annotation.Nullable
  public List<StepModel> getPreconditionSteps() {
    return preconditionSteps;
  }

  public void setPreconditionSteps(List<StepModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public SectionWithStepsModel postconditionSteps(List<StepModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public SectionWithStepsModel addPostconditionStepsItem(StepModel postconditionStepsItem) {
    if (this.postconditionSteps == null) {
      this.postconditionSteps = new ArrayList<>();
    }
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

  /**
   * Get postconditionSteps
   * @return postconditionSteps
   */
  @javax.annotation.Nullable
  public List<StepModel> getPostconditionSteps() {
    return postconditionSteps;
  }

  public void setPostconditionSteps(List<StepModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  public SectionWithStepsModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nullable
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public SectionWithStepsModel parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  @javax.annotation.Nullable
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public SectionWithStepsModel isDeleted(Boolean isDeleted) {
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

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public SectionWithStepsModel id(UUID id) {
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


  public SectionWithStepsModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public SectionWithStepsModel modifiedDate(OffsetDateTime modifiedDate) {
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

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public SectionWithStepsModel createdById(UUID createdById) {
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

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public SectionWithStepsModel modifiedById(UUID modifiedById) {
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

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public SectionWithStepsModel name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionWithStepsModel sectionWithStepsModel = (SectionWithStepsModel) o;
    return Objects.equals(this.attachments, sectionWithStepsModel.attachments) &&
        Objects.equals(this.preconditionSteps, sectionWithStepsModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, sectionWithStepsModel.postconditionSteps) &&
        Objects.equals(this.projectId, sectionWithStepsModel.projectId) &&
        Objects.equals(this.parentId, sectionWithStepsModel.parentId) &&
        Objects.equals(this.isDeleted, sectionWithStepsModel.isDeleted) &&
        Objects.equals(this.id, sectionWithStepsModel.id) &&
        Objects.equals(this.createdDate, sectionWithStepsModel.createdDate) &&
        Objects.equals(this.modifiedDate, sectionWithStepsModel.modifiedDate) &&
        Objects.equals(this.createdById, sectionWithStepsModel.createdById) &&
        Objects.equals(this.modifiedById, sectionWithStepsModel.modifiedById) &&
        Objects.equals(this.name, sectionWithStepsModel.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, preconditionSteps, postconditionSteps, projectId, parentId, isDeleted, id, createdDate, modifiedDate, createdById, modifiedById, name);
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
    sb.append("class SectionWithStepsModel {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("preconditionSteps");
    openapiFields.add("postconditionSteps");
    openapiFields.add("projectId");
    openapiFields.add("parentId");
    openapiFields.add("isDeleted");
    openapiFields.add("id");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SectionWithStepsModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SectionWithStepsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SectionWithStepsModel is not found in the empty JSON string", SectionWithStepsModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SectionWithStepsModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SectionWithStepsModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SectionWithStepsModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentModel.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      if (jsonObj.get("preconditionSteps") != null && !jsonObj.get("preconditionSteps").isJsonNull()) {
        JsonArray jsonArraypreconditionSteps = jsonObj.getAsJsonArray("preconditionSteps");
        if (jsonArraypreconditionSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preconditionSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("preconditionSteps").toString()));
          }

          // validate the optional field `preconditionSteps` (array)
          for (int i = 0; i < jsonArraypreconditionSteps.size(); i++) {
            StepModel.validateJsonElement(jsonArraypreconditionSteps.get(i));
          };
        }
      }
      if (jsonObj.get("postconditionSteps") != null && !jsonObj.get("postconditionSteps").isJsonNull()) {
        JsonArray jsonArraypostconditionSteps = jsonObj.getAsJsonArray("postconditionSteps");
        if (jsonArraypostconditionSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("postconditionSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `postconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("postconditionSteps").toString()));
          }

          // validate the optional field `postconditionSteps` (array)
          for (int i = 0; i < jsonArraypostconditionSteps.size(); i++) {
            StepModel.validateJsonElement(jsonArraypostconditionSteps.get(i));
          };
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SectionWithStepsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SectionWithStepsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SectionWithStepsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SectionWithStepsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SectionWithStepsModel>() {
           @Override
           public void write(JsonWriter out, SectionWithStepsModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SectionWithStepsModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SectionWithStepsModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SectionWithStepsModel
   * @throws IOException if the JSON string is invalid with respect to SectionWithStepsModel
   */
  public static SectionWithStepsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SectionWithStepsModel.class);
  }

  /**
   * Convert an instance of SectionWithStepsModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

