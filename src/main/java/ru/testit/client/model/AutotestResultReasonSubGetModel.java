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
import ru.testit.client.model.FailureCategoryModel;

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
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * AutotestResultReasonSubGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotestResultReasonSubGetModel {
  public static final String SERIALIZED_NAME_FAILURE_CATEGORY = "failureCategory";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORY)
  private FailureCategoryModel failureCategory;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AutotestResultReasonSubGetModel() {
  }

  public AutotestResultReasonSubGetModel failureCategory(FailureCategoryModel failureCategory) {
    this.failureCategory = failureCategory;
    return this;
  }

   /**
   * Get failureCategory
   * @return failureCategory
  **/
  @javax.annotation.Nonnull
  public FailureCategoryModel getFailureCategory() {
    return failureCategory;
  }

  public void setFailureCategory(FailureCategoryModel failureCategory) {
    this.failureCategory = failureCategory;
  }


  public AutotestResultReasonSubGetModel name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotestResultReasonSubGetModel autotestResultReasonSubGetModel = (AutotestResultReasonSubGetModel) o;
    return Objects.equals(this.failureCategory, autotestResultReasonSubGetModel.failureCategory) &&
        Objects.equals(this.name, autotestResultReasonSubGetModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCategory, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutotestResultReasonSubGetModel {\n");
    sb.append("    failureCategory: ").append(toIndentedString(failureCategory)).append("\n");
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
    openapiFields.add("failureCategory");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("failureCategory");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutotestResultReasonSubGetModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutotestResultReasonSubGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutotestResultReasonSubGetModel is not found in the empty JSON string", AutotestResultReasonSubGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutotestResultReasonSubGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutotestResultReasonSubGetModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutotestResultReasonSubGetModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `failureCategory`
      FailureCategoryModel.validateJsonElement(jsonObj.get("failureCategory"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutotestResultReasonSubGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutotestResultReasonSubGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutotestResultReasonSubGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutotestResultReasonSubGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutotestResultReasonSubGetModel>() {
           @Override
           public void write(JsonWriter out, AutotestResultReasonSubGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutotestResultReasonSubGetModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutotestResultReasonSubGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutotestResultReasonSubGetModel
  * @throws IOException if the JSON string is invalid with respect to AutotestResultReasonSubGetModel
  */
  public static AutotestResultReasonSubGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutotestResultReasonSubGetModel.class);
  }

 /**
  * Convert an instance of AutotestResultReasonSubGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

