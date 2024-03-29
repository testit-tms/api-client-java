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
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentPutModel;
import ru.testit.client.model.StepPutModel;

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
 * UpdateSectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSectionRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_PRECONDITION_STEPS = "preconditionSteps";
  @SerializedName(SERIALIZED_NAME_PRECONDITION_STEPS)
  private List<StepPutModel> preconditionSteps;

  public static final String SERIALIZED_NAME_POSTCONDITION_STEPS = "postconditionSteps";
  @SerializedName(SERIALIZED_NAME_POSTCONDITION_STEPS)
  private List<StepPutModel> postconditionSteps;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentPutModel> attachments = new ArrayList<>();

  public UpdateSectionRequest() {
  }

  public UpdateSectionRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public UpdateSectionRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateSectionRequest projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public UpdateSectionRequest parentId(UUID parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  public UUID getParentId() {
    return parentId;
  }


  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public UpdateSectionRequest preconditionSteps(List<StepPutModel> preconditionSteps) {
    
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public UpdateSectionRequest addPreconditionStepsItem(StepPutModel preconditionStepsItem) {
    if (this.preconditionSteps == null) {
      this.preconditionSteps = new ArrayList<>();
    }
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @javax.annotation.Nullable
  public List<StepPutModel> getPreconditionSteps() {
    return preconditionSteps;
  }


  public void setPreconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public UpdateSectionRequest postconditionSteps(List<StepPutModel> postconditionSteps) {
    
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public UpdateSectionRequest addPostconditionStepsItem(StepPutModel postconditionStepsItem) {
    if (this.postconditionSteps == null) {
      this.postconditionSteps = new ArrayList<>();
    }
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @javax.annotation.Nullable
  public List<StepPutModel> getPostconditionSteps() {
    return postconditionSteps;
  }


  public void setPostconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  public UpdateSectionRequest attachments(List<AttachmentPutModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public UpdateSectionRequest addAttachmentsItem(AttachmentPutModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nonnull
  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSectionRequest updateSectionRequest = (UpdateSectionRequest) o;
    return Objects.equals(this.id, updateSectionRequest.id) &&
        Objects.equals(this.name, updateSectionRequest.name) &&
        Objects.equals(this.projectId, updateSectionRequest.projectId) &&
        Objects.equals(this.parentId, updateSectionRequest.parentId) &&
        Objects.equals(this.preconditionSteps, updateSectionRequest.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, updateSectionRequest.postconditionSteps) &&
        Objects.equals(this.attachments, updateSectionRequest.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, projectId, parentId, preconditionSteps, postconditionSteps, attachments);
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
    sb.append("class UpdateSectionRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("projectId");
    openapiFields.add("parentId");
    openapiFields.add("preconditionSteps");
    openapiFields.add("postconditionSteps");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("attachments");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSectionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSectionRequest is not found in the empty JSON string", UpdateSectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateSectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSectionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSectionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
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
            StepPutModel.validateJsonObject(jsonArraypreconditionSteps.get(i).getAsJsonObject());
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
            StepPutModel.validateJsonObject(jsonArraypostconditionSteps.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }

      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      // validate the required field `attachments` (array)
      for (int i = 0; i < jsonArrayattachments.size(); i++) {
        AttachmentPutModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSectionRequest>() {
           @Override
           public void write(JsonWriter out, UpdateSectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSectionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSectionRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateSectionRequest
  */
  public static UpdateSectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSectionRequest.class);
  }

 /**
  * Convert an instance of UpdateSectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

