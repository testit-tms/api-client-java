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
import ru.testit.client.model.TestResultsSelectApiModelExtractionModel;
import ru.testit.client.model.TestResultsSelectApiModelFilter;

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
 * ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private TestResultsSelectApiModelFilter filter;

  public static final String SERIALIZED_NAME_EXTRACTION_MODEL = "extractionModel";
  @SerializedName(SERIALIZED_NAME_EXTRACTION_MODEL)
  private TestResultsSelectApiModelExtractionModel extractionModel;

  public ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest() {
  }

  public ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest filter(TestResultsSelectApiModelFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  public TestResultsSelectApiModelFilter getFilter() {
    return filter;
  }


  public void setFilter(TestResultsSelectApiModelFilter filter) {
    this.filter = filter;
  }


  public ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest extractionModel(TestResultsSelectApiModelExtractionModel extractionModel) {
    
    this.extractionModel = extractionModel;
    return this;
  }

   /**
   * Get extractionModel
   * @return extractionModel
  **/
  @javax.annotation.Nonnull
  public TestResultsSelectApiModelExtractionModel getExtractionModel() {
    return extractionModel;
  }


  public void setExtractionModel(TestResultsSelectApiModelExtractionModel extractionModel) {
    this.extractionModel = extractionModel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest = (ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest) o;
    return Objects.equals(this.filter, apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.filter) &&
        Objects.equals(this.extractionModel, apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.extractionModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, extractionModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    extractionModel: ").append(toIndentedString(extractionModel)).append("\n");
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
    openapiFields.add("extractionModel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("extractionModel");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest is not found in the empty JSON string", ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `filter`
      TestResultsSelectApiModelFilter.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      // validate the required field `extractionModel`
      TestResultsSelectApiModelExtractionModel.validateJsonObject(jsonObj.getAsJsonObject("extractionModel"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest
  */
  public static ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
