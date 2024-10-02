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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.ProjectExtractionModel;
import ru.testit.client.model.ProjectsFilterModel;

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
 * ApiV2ProjectsRestoreBulkPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2ProjectsRestoreBulkPostRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private ProjectsFilterModel filter;

  public static final String SERIALIZED_NAME_EXTRACTION_MODEL = "extractionModel";
  @SerializedName(SERIALIZED_NAME_EXTRACTION_MODEL)
  private ProjectExtractionModel extractionModel;

  public ApiV2ProjectsRestoreBulkPostRequest() {
  }

  public ApiV2ProjectsRestoreBulkPostRequest filter(ProjectsFilterModel filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  public ProjectsFilterModel getFilter() {
    return filter;
  }


  public void setFilter(ProjectsFilterModel filter) {
    this.filter = filter;
  }


  public ApiV2ProjectsRestoreBulkPostRequest extractionModel(ProjectExtractionModel extractionModel) {
    
    this.extractionModel = extractionModel;
    return this;
  }

   /**
   * Get extractionModel
   * @return extractionModel
  **/
  @javax.annotation.Nullable
  public ProjectExtractionModel getExtractionModel() {
    return extractionModel;
  }


  public void setExtractionModel(ProjectExtractionModel extractionModel) {
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
    ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest = (ApiV2ProjectsRestoreBulkPostRequest) o;
    return Objects.equals(this.filter, apiV2ProjectsRestoreBulkPostRequest.filter) &&
        Objects.equals(this.extractionModel, apiV2ProjectsRestoreBulkPostRequest.extractionModel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, extractionModel);
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
    sb.append("class ApiV2ProjectsRestoreBulkPostRequest {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2ProjectsRestoreBulkPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2ProjectsRestoreBulkPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2ProjectsRestoreBulkPostRequest is not found in the empty JSON string", ApiV2ProjectsRestoreBulkPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2ProjectsRestoreBulkPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2ProjectsRestoreBulkPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        ProjectsFilterModel.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      }
      // validate the optional field `extractionModel`
      if (jsonObj.get("extractionModel") != null && !jsonObj.get("extractionModel").isJsonNull()) {
        ProjectExtractionModel.validateJsonObject(jsonObj.getAsJsonObject("extractionModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2ProjectsRestoreBulkPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2ProjectsRestoreBulkPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2ProjectsRestoreBulkPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2ProjectsRestoreBulkPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2ProjectsRestoreBulkPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2ProjectsRestoreBulkPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2ProjectsRestoreBulkPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2ProjectsRestoreBulkPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2ProjectsRestoreBulkPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2ProjectsRestoreBulkPostRequest
  */
  public static ApiV2ProjectsRestoreBulkPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2ProjectsRestoreBulkPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2ProjectsRestoreBulkPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

