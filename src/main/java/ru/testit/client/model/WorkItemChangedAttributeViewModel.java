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
 * WorkItemChangedAttributeViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkItemChangedAttributeViewModel {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_OLD_ATTRIBUTE_NAME = "oldAttributeName";
  @SerializedName(SERIALIZED_NAME_OLD_ATTRIBUTE_NAME)
  private String oldAttributeName;

  public static final String SERIALIZED_NAME_NEW_ATTRIBUTE_NAME = "newAttributeName";
  @SerializedName(SERIALIZED_NAME_NEW_ATTRIBUTE_NAME)
  private String newAttributeName;

  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private Object oldValue = null;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private Object newValue = null;

  public WorkItemChangedAttributeViewModel() {
  }

  public WorkItemChangedAttributeViewModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public WorkItemChangedAttributeViewModel oldAttributeName(String oldAttributeName) {
    this.oldAttributeName = oldAttributeName;
    return this;
  }

  /**
   * Get oldAttributeName
   * @return oldAttributeName
   */
  @javax.annotation.Nonnull
  public String getOldAttributeName() {
    return oldAttributeName;
  }

  public void setOldAttributeName(String oldAttributeName) {
    this.oldAttributeName = oldAttributeName;
  }


  public WorkItemChangedAttributeViewModel newAttributeName(String newAttributeName) {
    this.newAttributeName = newAttributeName;
    return this;
  }

  /**
   * Get newAttributeName
   * @return newAttributeName
   */
  @javax.annotation.Nonnull
  public String getNewAttributeName() {
    return newAttributeName;
  }

  public void setNewAttributeName(String newAttributeName) {
    this.newAttributeName = newAttributeName;
  }


  public WorkItemChangedAttributeViewModel oldValue(Object oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  /**
   * Get oldValue
   * @return oldValue
   */
  @javax.annotation.Nullable
  public Object getOldValue() {
    return oldValue;
  }

  public void setOldValue(Object oldValue) {
    this.oldValue = oldValue;
  }


  public WorkItemChangedAttributeViewModel newValue(Object newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * Get newValue
   * @return newValue
   */
  @javax.annotation.Nullable
  public Object getNewValue() {
    return newValue;
  }

  public void setNewValue(Object newValue) {
    this.newValue = newValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemChangedAttributeViewModel workItemChangedAttributeViewModel = (WorkItemChangedAttributeViewModel) o;
    return Objects.equals(this.type, workItemChangedAttributeViewModel.type) &&
        Objects.equals(this.oldAttributeName, workItemChangedAttributeViewModel.oldAttributeName) &&
        Objects.equals(this.newAttributeName, workItemChangedAttributeViewModel.newAttributeName) &&
        Objects.equals(this.oldValue, workItemChangedAttributeViewModel.oldValue) &&
        Objects.equals(this.newValue, workItemChangedAttributeViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, oldAttributeName, newAttributeName, oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemChangedAttributeViewModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    oldAttributeName: ").append(toIndentedString(oldAttributeName)).append("\n");
    sb.append("    newAttributeName: ").append(toIndentedString(newAttributeName)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("oldAttributeName");
    openapiFields.add("newAttributeName");
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("oldAttributeName");
    openapiRequiredFields.add("newAttributeName");
    openapiRequiredFields.add("oldValue");
    openapiRequiredFields.add("newValue");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemChangedAttributeViewModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemChangedAttributeViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemChangedAttributeViewModel is not found in the empty JSON string", WorkItemChangedAttributeViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemChangedAttributeViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemChangedAttributeViewModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemChangedAttributeViewModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("oldAttributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldAttributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldAttributeName").toString()));
      }
      if (!jsonObj.get("newAttributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newAttributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newAttributeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemChangedAttributeViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemChangedAttributeViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemChangedAttributeViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemChangedAttributeViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemChangedAttributeViewModel>() {
           @Override
           public void write(JsonWriter out, WorkItemChangedAttributeViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemChangedAttributeViewModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemChangedAttributeViewModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemChangedAttributeViewModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemChangedAttributeViewModel
   */
  public static WorkItemChangedAttributeViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemChangedAttributeViewModel.class);
  }

  /**
   * Convert an instance of WorkItemChangedAttributeViewModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

