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
import ru.testit.client.model.AutoTestSelectModel;

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
 * AutoTestBulkDeleteApiModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AutoTestBulkDeleteApiModel {
  public static final String SERIALIZED_NAME_AUTO_TEST_SELECT = "autoTestSelect";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_SELECT)
  @javax.annotation.Nonnull
  private AutoTestSelectModel autoTestSelect;

  public AutoTestBulkDeleteApiModel() {
  }

  public AutoTestBulkDeleteApiModel autoTestSelect(@javax.annotation.Nonnull AutoTestSelectModel autoTestSelect) {
    this.autoTestSelect = autoTestSelect;
    return this;
  }

  /**
   * Get autoTestSelect
   * @return autoTestSelect
   */
  @javax.annotation.Nonnull
  public AutoTestSelectModel getAutoTestSelect() {
    return autoTestSelect;
  }

  public void setAutoTestSelect(@javax.annotation.Nonnull AutoTestSelectModel autoTestSelect) {
    this.autoTestSelect = autoTestSelect;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestBulkDeleteApiModel autoTestBulkDeleteApiModel = (AutoTestBulkDeleteApiModel) o;
    return Objects.equals(this.autoTestSelect, autoTestBulkDeleteApiModel.autoTestSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTestSelect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoTestBulkDeleteApiModel {\n");
    sb.append("    autoTestSelect: ").append(toIndentedString(autoTestSelect)).append("\n");
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
    openapiFields.add("autoTestSelect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("autoTestSelect");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AutoTestBulkDeleteApiModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutoTestBulkDeleteApiModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestBulkDeleteApiModel is not found in the empty JSON string", AutoTestBulkDeleteApiModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutoTestBulkDeleteApiModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestBulkDeleteApiModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutoTestBulkDeleteApiModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `autoTestSelect`
      AutoTestSelectModel.validateJsonElement(jsonObj.get("autoTestSelect"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTestBulkDeleteApiModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestBulkDeleteApiModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestBulkDeleteApiModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestBulkDeleteApiModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestBulkDeleteApiModel>() {
           @Override
           public void write(JsonWriter out, AutoTestBulkDeleteApiModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestBulkDeleteApiModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AutoTestBulkDeleteApiModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AutoTestBulkDeleteApiModel
   * @throws IOException if the JSON string is invalid with respect to AutoTestBulkDeleteApiModel
   */
  public static AutoTestBulkDeleteApiModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestBulkDeleteApiModel.class);
  }

  /**
   * Convert an instance of AutoTestBulkDeleteApiModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

