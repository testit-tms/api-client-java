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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * TestRunGroupByFailureClassModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunGroupByFailureClassModel {
  public static final String SERIALIZED_NAME_FAILURE_CATEGORY = "failureCategory";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORY)
  private String failureCategory;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public TestRunGroupByFailureClassModel() {
  }

  public TestRunGroupByFailureClassModel failureCategory(String failureCategory) {
    this.failureCategory = failureCategory;
    return this;
  }

   /**
   * Get failureCategory
   * @return failureCategory
  **/
  @javax.annotation.Nonnull
  public String getFailureCategory() {
    return failureCategory;
  }

  public void setFailureCategory(String failureCategory) {
    this.failureCategory = failureCategory;
  }


  public TestRunGroupByFailureClassModel value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunGroupByFailureClassModel testRunGroupByFailureClassModel = (TestRunGroupByFailureClassModel) o;
    return Objects.equals(this.failureCategory, testRunGroupByFailureClassModel.failureCategory) &&
        Objects.equals(this.value, testRunGroupByFailureClassModel.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCategory, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRunGroupByFailureClassModel {\n");
    sb.append("    failureCategory: ").append(toIndentedString(failureCategory)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("failureCategory");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestRunGroupByFailureClassModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestRunGroupByFailureClassModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunGroupByFailureClassModel is not found in the empty JSON string", TestRunGroupByFailureClassModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestRunGroupByFailureClassModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunGroupByFailureClassModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestRunGroupByFailureClassModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("failureCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failureCategory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestRunGroupByFailureClassModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunGroupByFailureClassModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunGroupByFailureClassModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunGroupByFailureClassModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunGroupByFailureClassModel>() {
           @Override
           public void write(JsonWriter out, TestRunGroupByFailureClassModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunGroupByFailureClassModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunGroupByFailureClassModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunGroupByFailureClassModel
  * @throws IOException if the JSON string is invalid with respect to TestRunGroupByFailureClassModel
  */
  public static TestRunGroupByFailureClassModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunGroupByFailureClassModel.class);
  }

 /**
  * Convert an instance of TestRunGroupByFailureClassModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

