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
 * TestResultStepCommentPutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultStepCommentPutModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_STEP_ID = "stepId";
  @SerializedName(SERIALIZED_NAME_STEP_ID)
  private UUID stepId;

  public static final String SERIALIZED_NAME_PARENT_STEP_ID = "parentStepId";
  @SerializedName(SERIALIZED_NAME_PARENT_STEP_ID)
  private UUID parentStepId;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentPutModel> attachments;

  public TestResultStepCommentPutModel() {
  }

  public TestResultStepCommentPutModel id(UUID id) {
    
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


  public TestResultStepCommentPutModel text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public TestResultStepCommentPutModel stepId(UUID stepId) {
    
    this.stepId = stepId;
    return this;
  }

   /**
   * Get stepId
   * @return stepId
  **/
  @javax.annotation.Nonnull
  public UUID getStepId() {
    return stepId;
  }


  public void setStepId(UUID stepId) {
    this.stepId = stepId;
  }


  public TestResultStepCommentPutModel parentStepId(UUID parentStepId) {
    
    this.parentStepId = parentStepId;
    return this;
  }

   /**
   * Get parentStepId
   * @return parentStepId
  **/
  @javax.annotation.Nullable
  public UUID getParentStepId() {
    return parentStepId;
  }


  public void setParentStepId(UUID parentStepId) {
    this.parentStepId = parentStepId;
  }


  public TestResultStepCommentPutModel attachments(List<AttachmentPutModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public TestResultStepCommentPutModel addAttachmentsItem(AttachmentPutModel attachmentsItem) {
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
  @javax.annotation.Nullable
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
    TestResultStepCommentPutModel testResultStepCommentPutModel = (TestResultStepCommentPutModel) o;
    return Objects.equals(this.id, testResultStepCommentPutModel.id) &&
        Objects.equals(this.text, testResultStepCommentPutModel.text) &&
        Objects.equals(this.stepId, testResultStepCommentPutModel.stepId) &&
        Objects.equals(this.parentStepId, testResultStepCommentPutModel.parentStepId) &&
        Objects.equals(this.attachments, testResultStepCommentPutModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, stepId, parentStepId, attachments);
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
    sb.append("class TestResultStepCommentPutModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    parentStepId: ").append(toIndentedString(parentStepId)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("stepId");
    openapiFields.add("parentStepId");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("stepId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultStepCommentPutModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultStepCommentPutModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultStepCommentPutModel is not found in the empty JSON string", TestResultStepCommentPutModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultStepCommentPutModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultStepCommentPutModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestResultStepCommentPutModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("stepId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stepId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stepId").toString()));
      }
      if ((jsonObj.get("parentStepId") != null && !jsonObj.get("parentStepId").isJsonNull()) && !jsonObj.get("parentStepId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentStepId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentStepId").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentPutModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultStepCommentPutModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultStepCommentPutModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultStepCommentPutModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultStepCommentPutModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultStepCommentPutModel>() {
           @Override
           public void write(JsonWriter out, TestResultStepCommentPutModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultStepCommentPutModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultStepCommentPutModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultStepCommentPutModel
  * @throws IOException if the JSON string is invalid with respect to TestResultStepCommentPutModel
  */
  public static TestResultStepCommentPutModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultStepCommentPutModel.class);
  }

 /**
  * Convert an instance of TestResultStepCommentPutModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

