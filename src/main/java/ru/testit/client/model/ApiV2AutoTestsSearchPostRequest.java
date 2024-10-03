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
import ru.testit.client.model.AutotestsSelectModelFilter;
import ru.testit.client.model.AutotestsSelectModelIncludes;

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
 * ApiV2AutoTestsSearchPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2AutoTestsSearchPostRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private AutotestsSelectModelFilter filter;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private AutotestsSelectModelIncludes includes;

  public ApiV2AutoTestsSearchPostRequest() {
  }

  public ApiV2AutoTestsSearchPostRequest filter(AutotestsSelectModelFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  public AutotestsSelectModelFilter getFilter() {
    return filter;
  }


  public void setFilter(AutotestsSelectModelFilter filter) {
    this.filter = filter;
  }


  public ApiV2AutoTestsSearchPostRequest includes(AutotestsSelectModelIncludes includes) {
    
    this.includes = includes;
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @javax.annotation.Nonnull
  public AutotestsSelectModelIncludes getIncludes() {
    return includes;
  }


  public void setIncludes(AutotestsSelectModelIncludes includes) {
    this.includes = includes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2AutoTestsSearchPostRequest apiV2AutoTestsSearchPostRequest = (ApiV2AutoTestsSearchPostRequest) o;
    return Objects.equals(this.filter, apiV2AutoTestsSearchPostRequest.filter) &&
        Objects.equals(this.includes, apiV2AutoTestsSearchPostRequest.includes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, includes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2AutoTestsSearchPostRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("includes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("includes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2AutoTestsSearchPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2AutoTestsSearchPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2AutoTestsSearchPostRequest is not found in the empty JSON string", ApiV2AutoTestsSearchPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2AutoTestsSearchPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2AutoTestsSearchPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV2AutoTestsSearchPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `filter`
      AutotestsSelectModelFilter.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      // validate the required field `includes`
      AutotestsSelectModelIncludes.validateJsonObject(jsonObj.getAsJsonObject("includes"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2AutoTestsSearchPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2AutoTestsSearchPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2AutoTestsSearchPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2AutoTestsSearchPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2AutoTestsSearchPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2AutoTestsSearchPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2AutoTestsSearchPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2AutoTestsSearchPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2AutoTestsSearchPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2AutoTestsSearchPostRequest
  */
  public static ApiV2AutoTestsSearchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2AutoTestsSearchPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2AutoTestsSearchPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
