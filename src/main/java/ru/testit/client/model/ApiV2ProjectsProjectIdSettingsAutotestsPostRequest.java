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
 * ApiV2ProjectsProjectIdSettingsAutotestsPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2ProjectsProjectIdSettingsAutotestsPostRequest {
  public static final String SERIALIZED_NAME_IS_FLAKY_AUTO = "isFlakyAuto";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY_AUTO)
  private Boolean isFlakyAuto = false;

  public static final String SERIALIZED_NAME_FLAKY_STABILITY_PERCENTAGE = "flakyStabilityPercentage";
  @SerializedName(SERIALIZED_NAME_FLAKY_STABILITY_PERCENTAGE)
  private Integer flakyStabilityPercentage = 100;

  public static final String SERIALIZED_NAME_FLAKY_TEST_RUN_COUNT = "flakyTestRunCount";
  @SerializedName(SERIALIZED_NAME_FLAKY_TEST_RUN_COUNT)
  private Integer flakyTestRunCount = 100;

  public static final String SERIALIZED_NAME_RERUN_ENABLED = "rerunEnabled";
  @SerializedName(SERIALIZED_NAME_RERUN_ENABLED)
  private Boolean rerunEnabled;

  public static final String SERIALIZED_NAME_RERUN_ATTEMPTS_COUNT = "rerunAttemptsCount";
  @SerializedName(SERIALIZED_NAME_RERUN_ATTEMPTS_COUNT)
  private Integer rerunAttemptsCount;

  public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest() {
  }

  public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest isFlakyAuto(Boolean isFlakyAuto) {
    
    this.isFlakyAuto = isFlakyAuto;
    return this;
  }

   /**
   * Indicates if the status \&quot;Flaky/Stable\&quot; sets automatically
   * @return isFlakyAuto
  **/
  @javax.annotation.Nullable
  public Boolean getIsFlakyAuto() {
    return isFlakyAuto;
  }


  public void setIsFlakyAuto(Boolean isFlakyAuto) {
    this.isFlakyAuto = isFlakyAuto;
  }


  public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest flakyStabilityPercentage(Integer flakyStabilityPercentage) {
    
    this.flakyStabilityPercentage = flakyStabilityPercentage;
    return this;
  }

   /**
   * Stability percentage for autotest flaky computing
   * minimum: 0
   * maximum: 100
   * @return flakyStabilityPercentage
  **/
  @javax.annotation.Nullable
  public Integer getFlakyStabilityPercentage() {
    return flakyStabilityPercentage;
  }


  public void setFlakyStabilityPercentage(Integer flakyStabilityPercentage) {
    this.flakyStabilityPercentage = flakyStabilityPercentage;
  }


  public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest flakyTestRunCount(Integer flakyTestRunCount) {
    
    this.flakyTestRunCount = flakyTestRunCount;
    return this;
  }

   /**
   * Last test run count for autotest flaky computing
   * minimum: 1
   * maximum: 1000
   * @return flakyTestRunCount
  **/
  @javax.annotation.Nullable
  public Integer getFlakyTestRunCount() {
    return flakyTestRunCount;
  }


  public void setFlakyTestRunCount(Integer flakyTestRunCount) {
    this.flakyTestRunCount = flakyTestRunCount;
  }


  public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest rerunEnabled(Boolean rerunEnabled) {
    
    this.rerunEnabled = rerunEnabled;
    return this;
  }

   /**
   * Auto rerun enabled
   * @return rerunEnabled
  **/
  @javax.annotation.Nonnull
  public Boolean getRerunEnabled() {
    return rerunEnabled;
  }


  public void setRerunEnabled(Boolean rerunEnabled) {
    this.rerunEnabled = rerunEnabled;
  }


  public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest rerunAttemptsCount(Integer rerunAttemptsCount) {
    
    this.rerunAttemptsCount = rerunAttemptsCount;
    return this;
  }

   /**
   * Auto rerun attempt count
   * minimum: 1
   * maximum: 10
   * @return rerunAttemptsCount
  **/
  @javax.annotation.Nonnull
  public Integer getRerunAttemptsCount() {
    return rerunAttemptsCount;
  }


  public void setRerunAttemptsCount(Integer rerunAttemptsCount) {
    this.rerunAttemptsCount = rerunAttemptsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2ProjectsProjectIdSettingsAutotestsPostRequest apiV2ProjectsProjectIdSettingsAutotestsPostRequest = (ApiV2ProjectsProjectIdSettingsAutotestsPostRequest) o;
    return Objects.equals(this.isFlakyAuto, apiV2ProjectsProjectIdSettingsAutotestsPostRequest.isFlakyAuto) &&
        Objects.equals(this.flakyStabilityPercentage, apiV2ProjectsProjectIdSettingsAutotestsPostRequest.flakyStabilityPercentage) &&
        Objects.equals(this.flakyTestRunCount, apiV2ProjectsProjectIdSettingsAutotestsPostRequest.flakyTestRunCount) &&
        Objects.equals(this.rerunEnabled, apiV2ProjectsProjectIdSettingsAutotestsPostRequest.rerunEnabled) &&
        Objects.equals(this.rerunAttemptsCount, apiV2ProjectsProjectIdSettingsAutotestsPostRequest.rerunAttemptsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFlakyAuto, flakyStabilityPercentage, flakyTestRunCount, rerunEnabled, rerunAttemptsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2ProjectsProjectIdSettingsAutotestsPostRequest {\n");
    sb.append("    isFlakyAuto: ").append(toIndentedString(isFlakyAuto)).append("\n");
    sb.append("    flakyStabilityPercentage: ").append(toIndentedString(flakyStabilityPercentage)).append("\n");
    sb.append("    flakyTestRunCount: ").append(toIndentedString(flakyTestRunCount)).append("\n");
    sb.append("    rerunEnabled: ").append(toIndentedString(rerunEnabled)).append("\n");
    sb.append("    rerunAttemptsCount: ").append(toIndentedString(rerunAttemptsCount)).append("\n");
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
    openapiFields.add("isFlakyAuto");
    openapiFields.add("flakyStabilityPercentage");
    openapiFields.add("flakyTestRunCount");
    openapiFields.add("rerunEnabled");
    openapiFields.add("rerunAttemptsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rerunEnabled");
    openapiRequiredFields.add("rerunAttemptsCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2ProjectsProjectIdSettingsAutotestsPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2ProjectsProjectIdSettingsAutotestsPostRequest is not found in the empty JSON string", ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2ProjectsProjectIdSettingsAutotestsPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2ProjectsProjectIdSettingsAutotestsPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2ProjectsProjectIdSettingsAutotestsPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2ProjectsProjectIdSettingsAutotestsPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2ProjectsProjectIdSettingsAutotestsPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2ProjectsProjectIdSettingsAutotestsPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2ProjectsProjectIdSettingsAutotestsPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2ProjectsProjectIdSettingsAutotestsPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2ProjectsProjectIdSettingsAutotestsPostRequest
  */
  public static ApiV2ProjectsProjectIdSettingsAutotestsPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2ProjectsProjectIdSettingsAutotestsPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2ProjectsProjectIdSettingsAutotestsPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

