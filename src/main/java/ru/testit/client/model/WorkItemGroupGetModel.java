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
import ru.testit.client.model.WorkItemGroupType;
import ru.testit.client.model.WorkItemLocalSelectModel;

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
 * WorkItemGroupGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkItemGroupGetModel {
  public static final String SERIALIZED_NAME_SELECT_MODEL = "selectModel";
  @SerializedName(SERIALIZED_NAME_SELECT_MODEL)
  private WorkItemLocalSelectModel selectModel;

  public static final String SERIALIZED_NAME_GROUP_TYPE = "groupType";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE)
  private WorkItemGroupType groupType;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTE_ID = "customAttributeId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTE_ID)
  private UUID customAttributeId;

  public WorkItemGroupGetModel() {
  }

  public WorkItemGroupGetModel selectModel(WorkItemLocalSelectModel selectModel) {
    this.selectModel = selectModel;
    return this;
  }

  /**
   * Model containing options to filter work items
   * @return selectModel
   */
  @javax.annotation.Nullable
  public WorkItemLocalSelectModel getSelectModel() {
    return selectModel;
  }

  public void setSelectModel(WorkItemLocalSelectModel selectModel) {
    this.selectModel = selectModel;
  }


  public WorkItemGroupGetModel groupType(WorkItemGroupType groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Get groupType
   * @return groupType
   */
  @javax.annotation.Nonnull
  public WorkItemGroupType getGroupType() {
    return groupType;
  }

  public void setGroupType(WorkItemGroupType groupType) {
    this.groupType = groupType;
  }


  public WorkItemGroupGetModel customAttributeId(UUID customAttributeId) {
    this.customAttributeId = customAttributeId;
    return this;
  }

  /**
   * Get customAttributeId
   * @return customAttributeId
   */
  @javax.annotation.Nullable
  public UUID getCustomAttributeId() {
    return customAttributeId;
  }

  public void setCustomAttributeId(UUID customAttributeId) {
    this.customAttributeId = customAttributeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemGroupGetModel workItemGroupGetModel = (WorkItemGroupGetModel) o;
    return Objects.equals(this.selectModel, workItemGroupGetModel.selectModel) &&
        Objects.equals(this.groupType, workItemGroupGetModel.groupType) &&
        Objects.equals(this.customAttributeId, workItemGroupGetModel.customAttributeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectModel, groupType, customAttributeId);
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
    sb.append("class WorkItemGroupGetModel {\n");
    sb.append("    selectModel: ").append(toIndentedString(selectModel)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    customAttributeId: ").append(toIndentedString(customAttributeId)).append("\n");
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
    openapiFields.add("selectModel");
    openapiFields.add("groupType");
    openapiFields.add("customAttributeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groupType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemGroupGetModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemGroupGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemGroupGetModel is not found in the empty JSON string", WorkItemGroupGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemGroupGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemGroupGetModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemGroupGetModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `selectModel`
      if (jsonObj.get("selectModel") != null && !jsonObj.get("selectModel").isJsonNull()) {
        WorkItemLocalSelectModel.validateJsonElement(jsonObj.get("selectModel"));
      }
      // validate the required field `groupType`
      WorkItemGroupType.validateJsonElement(jsonObj.get("groupType"));
      if ((jsonObj.get("customAttributeId") != null && !jsonObj.get("customAttributeId").isJsonNull()) && !jsonObj.get("customAttributeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customAttributeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customAttributeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemGroupGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemGroupGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemGroupGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemGroupGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemGroupGetModel>() {
           @Override
           public void write(JsonWriter out, WorkItemGroupGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemGroupGetModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemGroupGetModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemGroupGetModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemGroupGetModel
   */
  public static WorkItemGroupGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemGroupGetModel.class);
  }

  /**
   * Convert an instance of WorkItemGroupGetModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

