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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * SectionMoveModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class SectionMoveModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_OLD_PARENT_ID = "oldParentId";
  @SerializedName(SERIALIZED_NAME_OLD_PARENT_ID)
  private UUID oldParentId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_NEXT_SECTION_ID = "nextSectionId";
  @SerializedName(SERIALIZED_NAME_NEXT_SECTION_ID)
  private UUID nextSectionId;

  public SectionMoveModel() {
  }

  public SectionMoveModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the section
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public SectionMoveModel oldParentId(UUID oldParentId) {
    this.oldParentId = oldParentId;
    return this;
  }

  /**
   * Unique ID of the section&#39;s current parent section
   * @return oldParentId
   */
  @javax.annotation.Nonnull
  public UUID getOldParentId() {
    return oldParentId;
  }

  public void setOldParentId(UUID oldParentId) {
    this.oldParentId = oldParentId;
  }


  public SectionMoveModel parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique ID of the section&#39;s target parent section
   * @return parentId
   */
  @javax.annotation.Nonnull
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public SectionMoveModel nextSectionId(UUID nextSectionId) {
    this.nextSectionId = nextSectionId;
    return this;
  }

  /**
   * Unique ID of the section&#39;s following section
   * @return nextSectionId
   */
  @javax.annotation.Nullable
  public UUID getNextSectionId() {
    return nextSectionId;
  }

  public void setNextSectionId(UUID nextSectionId) {
    this.nextSectionId = nextSectionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionMoveModel sectionMoveModel = (SectionMoveModel) o;
    return Objects.equals(this.id, sectionMoveModel.id) &&
        Objects.equals(this.oldParentId, sectionMoveModel.oldParentId) &&
        Objects.equals(this.parentId, sectionMoveModel.parentId) &&
        Objects.equals(this.nextSectionId, sectionMoveModel.nextSectionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oldParentId, parentId, nextSectionId);
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
    sb.append("class SectionMoveModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oldParentId: ").append(toIndentedString(oldParentId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    nextSectionId: ").append(toIndentedString(nextSectionId)).append("\n");
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
    openapiFields.add("oldParentId");
    openapiFields.add("parentId");
    openapiFields.add("nextSectionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("oldParentId");
    openapiRequiredFields.add("parentId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SectionMoveModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SectionMoveModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SectionMoveModel is not found in the empty JSON string", SectionMoveModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SectionMoveModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SectionMoveModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SectionMoveModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("oldParentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldParentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldParentId").toString()));
      }
      if (!jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if ((jsonObj.get("nextSectionId") != null && !jsonObj.get("nextSectionId").isJsonNull()) && !jsonObj.get("nextSectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextSectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextSectionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SectionMoveModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SectionMoveModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SectionMoveModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SectionMoveModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SectionMoveModel>() {
           @Override
           public void write(JsonWriter out, SectionMoveModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SectionMoveModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SectionMoveModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SectionMoveModel
   * @throws IOException if the JSON string is invalid with respect to SectionMoveModel
   */
  public static SectionMoveModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SectionMoveModel.class);
  }

  /**
   * Convert an instance of SectionMoveModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

