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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.WorkItemChangedFieldsViewModel;

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
 * WorkItemChangeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WorkItemChangeModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_WORK_ITEM_ID = "workItemId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_ID)
  @javax.annotation.Nonnull
  private UUID workItemId;

  public static final String SERIALIZED_NAME_OLD_VERSION_ID = "oldVersionId";
  @SerializedName(SERIALIZED_NAME_OLD_VERSION_ID)
  @javax.annotation.Nonnull
  private UUID oldVersionId;

  public static final String SERIALIZED_NAME_NEW_VERSION_ID = "newVersionId";
  @SerializedName(SERIALIZED_NAME_NEW_VERSION_ID)
  @javax.annotation.Nonnull
  private UUID newVersionId;

  public static final String SERIALIZED_NAME_WORK_ITEM_CHANGED_FIELDS = "workItemChangedFields";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_CHANGED_FIELDS)
  @javax.annotation.Nonnull
  private WorkItemChangedFieldsViewModel workItemChangedFields;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  @javax.annotation.Nonnull
  private UUID createdById;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime createdDate;

  public WorkItemChangeModel() {
  }

  public WorkItemChangeModel id(@javax.annotation.Nonnull UUID id) {
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


  public WorkItemChangeModel workItemId(@javax.annotation.Nonnull UUID workItemId) {
    this.workItemId = workItemId;
    return this;
  }

  /**
   * Get workItemId
   * @return workItemId
   */
  @javax.annotation.Nonnull
  public UUID getWorkItemId() {
    return workItemId;
  }

  public void setWorkItemId(@javax.annotation.Nonnull UUID workItemId) {
    this.workItemId = workItemId;
  }


  public WorkItemChangeModel oldVersionId(@javax.annotation.Nonnull UUID oldVersionId) {
    this.oldVersionId = oldVersionId;
    return this;
  }

  /**
   * Get oldVersionId
   * @return oldVersionId
   */
  @javax.annotation.Nonnull
  public UUID getOldVersionId() {
    return oldVersionId;
  }

  public void setOldVersionId(@javax.annotation.Nonnull UUID oldVersionId) {
    this.oldVersionId = oldVersionId;
  }


  public WorkItemChangeModel newVersionId(@javax.annotation.Nonnull UUID newVersionId) {
    this.newVersionId = newVersionId;
    return this;
  }

  /**
   * Get newVersionId
   * @return newVersionId
   */
  @javax.annotation.Nonnull
  public UUID getNewVersionId() {
    return newVersionId;
  }

  public void setNewVersionId(@javax.annotation.Nonnull UUID newVersionId) {
    this.newVersionId = newVersionId;
  }


  public WorkItemChangeModel workItemChangedFields(@javax.annotation.Nonnull WorkItemChangedFieldsViewModel workItemChangedFields) {
    this.workItemChangedFields = workItemChangedFields;
    return this;
  }

  /**
   * Get workItemChangedFields
   * @return workItemChangedFields
   */
  @javax.annotation.Nonnull
  public WorkItemChangedFieldsViewModel getWorkItemChangedFields() {
    return workItemChangedFields;
  }

  public void setWorkItemChangedFields(@javax.annotation.Nonnull WorkItemChangedFieldsViewModel workItemChangedFields) {
    this.workItemChangedFields = workItemChangedFields;
  }


  public WorkItemChangeModel createdById(@javax.annotation.Nonnull UUID createdById) {
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


  public WorkItemChangeModel createdDate(@javax.annotation.Nullable OffsetDateTime createdDate) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemChangeModel workItemChangeModel = (WorkItemChangeModel) o;
    return Objects.equals(this.id, workItemChangeModel.id) &&
        Objects.equals(this.workItemId, workItemChangeModel.workItemId) &&
        Objects.equals(this.oldVersionId, workItemChangeModel.oldVersionId) &&
        Objects.equals(this.newVersionId, workItemChangeModel.newVersionId) &&
        Objects.equals(this.workItemChangedFields, workItemChangeModel.workItemChangedFields) &&
        Objects.equals(this.createdById, workItemChangeModel.createdById) &&
        Objects.equals(this.createdDate, workItemChangeModel.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workItemId, oldVersionId, newVersionId, workItemChangedFields, createdById, createdDate);
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
    sb.append("class WorkItemChangeModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
    sb.append("    oldVersionId: ").append(toIndentedString(oldVersionId)).append("\n");
    sb.append("    newVersionId: ").append(toIndentedString(newVersionId)).append("\n");
    sb.append("    workItemChangedFields: ").append(toIndentedString(workItemChangedFields)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
    openapiFields.add("workItemId");
    openapiFields.add("oldVersionId");
    openapiFields.add("newVersionId");
    openapiFields.add("workItemChangedFields");
    openapiFields.add("createdById");
    openapiFields.add("createdDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("workItemId");
    openapiRequiredFields.add("oldVersionId");
    openapiRequiredFields.add("newVersionId");
    openapiRequiredFields.add("workItemChangedFields");
    openapiRequiredFields.add("createdById");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemChangeModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemChangeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemChangeModel is not found in the empty JSON string", WorkItemChangeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemChangeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemChangeModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemChangeModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("workItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemId").toString()));
      }
      if (!jsonObj.get("oldVersionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldVersionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldVersionId").toString()));
      }
      if (!jsonObj.get("newVersionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newVersionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newVersionId").toString()));
      }
      // validate the required field `workItemChangedFields`
      WorkItemChangedFieldsViewModel.validateJsonElement(jsonObj.get("workItemChangedFields"));
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemChangeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemChangeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemChangeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemChangeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemChangeModel>() {
           @Override
           public void write(JsonWriter out, WorkItemChangeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemChangeModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemChangeModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemChangeModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemChangeModel
   */
  public static WorkItemChangeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemChangeModel.class);
  }

  /**
   * Convert an instance of WorkItemChangeModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

