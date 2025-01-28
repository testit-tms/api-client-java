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
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentPutModel;
import ru.testit.client.model.StepPostModel;

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
 * SectionPostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SectionPostModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  @javax.annotation.Nonnull
  private UUID projectId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  @javax.annotation.Nullable
  private UUID parentId;

  public static final String SERIALIZED_NAME_PRECONDITION_STEPS = "preconditionSteps";
  @SerializedName(SERIALIZED_NAME_PRECONDITION_STEPS)
  @javax.annotation.Nullable
  private List<StepPostModel> preconditionSteps;

  public static final String SERIALIZED_NAME_POSTCONDITION_STEPS = "postconditionSteps";
  @SerializedName(SERIALIZED_NAME_POSTCONDITION_STEPS)
  @javax.annotation.Nullable
  private List<StepPostModel> postconditionSteps;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nonnull
  private List<AttachmentPutModel> attachments = new ArrayList<>();

  public SectionPostModel() {
  }

  public SectionPostModel name(@javax.annotation.Nonnull String name) {
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


  public SectionPostModel projectId(@javax.annotation.Nonnull UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(@javax.annotation.Nonnull UUID projectId) {
    this.projectId = projectId;
  }


  public SectionPostModel parentId(@javax.annotation.Nullable UUID parentId) {
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

  public void setParentId(@javax.annotation.Nullable UUID parentId) {
    this.parentId = parentId;
  }


  public SectionPostModel preconditionSteps(@javax.annotation.Nullable List<StepPostModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public SectionPostModel addPreconditionStepsItem(StepPostModel preconditionStepsItem) {
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
  public List<StepPostModel> getPreconditionSteps() {
    return preconditionSteps;
  }

  public void setPreconditionSteps(@javax.annotation.Nullable List<StepPostModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public SectionPostModel postconditionSteps(@javax.annotation.Nullable List<StepPostModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public SectionPostModel addPostconditionStepsItem(StepPostModel postconditionStepsItem) {
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
  public List<StepPostModel> getPostconditionSteps() {
    return postconditionSteps;
  }

  public void setPostconditionSteps(@javax.annotation.Nullable List<StepPostModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  public SectionPostModel attachments(@javax.annotation.Nonnull List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public SectionPostModel addAttachmentsItem(AttachmentPutModel attachmentsItem) {
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
  @javax.annotation.Nonnull
  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nonnull List<AttachmentPutModel> attachments) {
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
    SectionPostModel sectionPostModel = (SectionPostModel) o;
    return Objects.equals(this.name, sectionPostModel.name) &&
        Objects.equals(this.projectId, sectionPostModel.projectId) &&
        Objects.equals(this.parentId, sectionPostModel.parentId) &&
        Objects.equals(this.preconditionSteps, sectionPostModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, sectionPostModel.postconditionSteps) &&
        Objects.equals(this.attachments, sectionPostModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId, parentId, preconditionSteps, postconditionSteps, attachments);
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
    sb.append("class SectionPostModel {\n");
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
    openapiFields.add("name");
    openapiFields.add("projectId");
    openapiFields.add("parentId");
    openapiFields.add("preconditionSteps");
    openapiFields.add("postconditionSteps");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("attachments");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SectionPostModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SectionPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SectionPostModel is not found in the empty JSON string", SectionPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SectionPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SectionPostModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SectionPostModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
            StepPostModel.validateJsonElement(jsonArraypreconditionSteps.get(i));
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
            StepPostModel.validateJsonElement(jsonArraypostconditionSteps.get(i));
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
        AttachmentPutModel.validateJsonElement(jsonArrayattachments.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SectionPostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SectionPostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SectionPostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SectionPostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SectionPostModel>() {
           @Override
           public void write(JsonWriter out, SectionPostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SectionPostModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SectionPostModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SectionPostModel
   * @throws IOException if the JSON string is invalid with respect to SectionPostModel
   */
  public static SectionPostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SectionPostModel.class);
  }

  /**
   * Convert an instance of SectionPostModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

