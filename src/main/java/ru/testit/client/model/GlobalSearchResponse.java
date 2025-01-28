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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.testit.client.model.GlobalSearchItemResult;

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
 * GlobalSearchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GlobalSearchResponse {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  @javax.annotation.Nonnull
  private List<GlobalSearchItemResult> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_MORE_RESULTS_AVAILABLE = "moreResultsAvailable";
  @SerializedName(SERIALIZED_NAME_MORE_RESULTS_AVAILABLE)
  @javax.annotation.Nonnull
  private Boolean moreResultsAvailable;

  public static final String SERIALIZED_NAME_AVAILABLE_RESOURCE_TYPES = "availableResourceTypes";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_RESOURCE_TYPES)
  @javax.annotation.Nonnull
  private List<String> availableResourceTypes = new ArrayList<>();

  public GlobalSearchResponse() {
  }

  public GlobalSearchResponse results(@javax.annotation.Nonnull List<GlobalSearchItemResult> results) {
    this.results = results;
    return this;
  }

  public GlobalSearchResponse addResultsItem(GlobalSearchItemResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @javax.annotation.Nonnull
  public List<GlobalSearchItemResult> getResults() {
    return results;
  }

  public void setResults(@javax.annotation.Nonnull List<GlobalSearchItemResult> results) {
    this.results = results;
  }


  public GlobalSearchResponse moreResultsAvailable(@javax.annotation.Nonnull Boolean moreResultsAvailable) {
    this.moreResultsAvailable = moreResultsAvailable;
    return this;
  }

  /**
   * Get moreResultsAvailable
   * @return moreResultsAvailable
   */
  @javax.annotation.Nonnull
  public Boolean getMoreResultsAvailable() {
    return moreResultsAvailable;
  }

  public void setMoreResultsAvailable(@javax.annotation.Nonnull Boolean moreResultsAvailable) {
    this.moreResultsAvailable = moreResultsAvailable;
  }


  public GlobalSearchResponse availableResourceTypes(@javax.annotation.Nonnull List<String> availableResourceTypes) {
    this.availableResourceTypes = availableResourceTypes;
    return this;
  }

  public GlobalSearchResponse addAvailableResourceTypesItem(String availableResourceTypesItem) {
    if (this.availableResourceTypes == null) {
      this.availableResourceTypes = new ArrayList<>();
    }
    this.availableResourceTypes.add(availableResourceTypesItem);
    return this;
  }

  /**
   * Get availableResourceTypes
   * @return availableResourceTypes
   */
  @javax.annotation.Nonnull
  public List<String> getAvailableResourceTypes() {
    return availableResourceTypes;
  }

  public void setAvailableResourceTypes(@javax.annotation.Nonnull List<String> availableResourceTypes) {
    this.availableResourceTypes = availableResourceTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalSearchResponse globalSearchResponse = (GlobalSearchResponse) o;
    return Objects.equals(this.results, globalSearchResponse.results) &&
        Objects.equals(this.moreResultsAvailable, globalSearchResponse.moreResultsAvailable) &&
        Objects.equals(this.availableResourceTypes, globalSearchResponse.availableResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, moreResultsAvailable, availableResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSearchResponse {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    moreResultsAvailable: ").append(toIndentedString(moreResultsAvailable)).append("\n");
    sb.append("    availableResourceTypes: ").append(toIndentedString(availableResourceTypes)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("moreResultsAvailable");
    openapiFields.add("availableResourceTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("results");
    openapiRequiredFields.add("moreResultsAvailable");
    openapiRequiredFields.add("availableResourceTypes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GlobalSearchResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GlobalSearchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GlobalSearchResponse is not found in the empty JSON string", GlobalSearchResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GlobalSearchResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GlobalSearchResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GlobalSearchResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        GlobalSearchItemResult.validateJsonElement(jsonArrayresults.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("availableResourceTypes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("availableResourceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableResourceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("availableResourceTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GlobalSearchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GlobalSearchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GlobalSearchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GlobalSearchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GlobalSearchResponse>() {
           @Override
           public void write(JsonWriter out, GlobalSearchResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GlobalSearchResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GlobalSearchResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GlobalSearchResponse
   * @throws IOException if the JSON string is invalid with respect to GlobalSearchResponse
   */
  public static GlobalSearchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GlobalSearchResponse.class);
  }

  /**
   * Convert an instance of GlobalSearchResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

