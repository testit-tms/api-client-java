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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutotestResultOutcome;
import ru.testit.client.model.Int64RangeSelectorModel;

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
 * ApiV2AutoTestsIdTestResultsSearchPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2AutoTestsIdTestResultsSearchPostRequest {
  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private Set<AutotestResultOutcome> outcomes;

  public static final String SERIALIZED_NAME_TEST_PLAN_IDS = "testPlanIds";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_IDS)
  private Set<UUID> testPlanIds;

  public static final String SERIALIZED_NAME_TEST_RUN_IDS = "testRunIds";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_IDS)
  private Set<UUID> testRunIds;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private Set<UUID> configurationIds;

  public static final String SERIALIZED_NAME_LAUNCH_SOURCE = "launchSource";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SOURCE)
  private String launchSource;

  public static final String SERIALIZED_NAME_USER_IDS = "userIds";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private Set<UUID> userIds;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Int64RangeSelectorModel duration;

  public ApiV2AutoTestsIdTestResultsSearchPostRequest() {
  }

  public ApiV2AutoTestsIdTestResultsSearchPostRequest outcomes(Set<AutotestResultOutcome> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public ApiV2AutoTestsIdTestResultsSearchPostRequest addOutcomesItem(AutotestResultOutcome outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new LinkedHashSet<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Get outcomes
   * @return outcomes
  **/
  @javax.annotation.Nullable
  public Set<AutotestResultOutcome> getOutcomes() {
    return outcomes;
  }


  public void setOutcomes(Set<AutotestResultOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  public ApiV2AutoTestsIdTestResultsSearchPostRequest testPlanIds(Set<UUID> testPlanIds) {
    
    this.testPlanIds = testPlanIds;
    return this;
  }

  public ApiV2AutoTestsIdTestResultsSearchPostRequest addTestPlanIdsItem(UUID testPlanIdsItem) {
    if (this.testPlanIds == null) {
      this.testPlanIds = new LinkedHashSet<>();
    }
    this.testPlanIds.add(testPlanIdsItem);
    return this;
  }

   /**
   * Get testPlanIds
   * @return testPlanIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getTestPlanIds() {
    return testPlanIds;
  }


  public void setTestPlanIds(Set<UUID> testPlanIds) {
    this.testPlanIds = testPlanIds;
  }


  public ApiV2AutoTestsIdTestResultsSearchPostRequest testRunIds(Set<UUID> testRunIds) {
    
    this.testRunIds = testRunIds;
    return this;
  }

  public ApiV2AutoTestsIdTestResultsSearchPostRequest addTestRunIdsItem(UUID testRunIdsItem) {
    if (this.testRunIds == null) {
      this.testRunIds = new LinkedHashSet<>();
    }
    this.testRunIds.add(testRunIdsItem);
    return this;
  }

   /**
   * Get testRunIds
   * @return testRunIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getTestRunIds() {
    return testRunIds;
  }


  public void setTestRunIds(Set<UUID> testRunIds) {
    this.testRunIds = testRunIds;
  }


  public ApiV2AutoTestsIdTestResultsSearchPostRequest configurationIds(Set<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public ApiV2AutoTestsIdTestResultsSearchPostRequest addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new LinkedHashSet<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Get configurationIds
   * @return configurationIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(Set<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public ApiV2AutoTestsIdTestResultsSearchPostRequest launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Get launchSource
   * @return launchSource
  **/
  @javax.annotation.Nullable
  public String getLaunchSource() {
    return launchSource;
  }


  public void setLaunchSource(String launchSource) {
    this.launchSource = launchSource;
  }


  public ApiV2AutoTestsIdTestResultsSearchPostRequest userIds(Set<UUID> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public ApiV2AutoTestsIdTestResultsSearchPostRequest addUserIdsItem(UUID userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new LinkedHashSet<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getUserIds() {
    return userIds;
  }


  public void setUserIds(Set<UUID> userIds) {
    this.userIds = userIds;
  }


  public ApiV2AutoTestsIdTestResultsSearchPostRequest duration(Int64RangeSelectorModel duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  public Int64RangeSelectorModel getDuration() {
    return duration;
  }


  public void setDuration(Int64RangeSelectorModel duration) {
    this.duration = duration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2AutoTestsIdTestResultsSearchPostRequest apiV2AutoTestsIdTestResultsSearchPostRequest = (ApiV2AutoTestsIdTestResultsSearchPostRequest) o;
    return Objects.equals(this.outcomes, apiV2AutoTestsIdTestResultsSearchPostRequest.outcomes) &&
        Objects.equals(this.testPlanIds, apiV2AutoTestsIdTestResultsSearchPostRequest.testPlanIds) &&
        Objects.equals(this.testRunIds, apiV2AutoTestsIdTestResultsSearchPostRequest.testRunIds) &&
        Objects.equals(this.configurationIds, apiV2AutoTestsIdTestResultsSearchPostRequest.configurationIds) &&
        Objects.equals(this.launchSource, apiV2AutoTestsIdTestResultsSearchPostRequest.launchSource) &&
        Objects.equals(this.userIds, apiV2AutoTestsIdTestResultsSearchPostRequest.userIds) &&
        Objects.equals(this.duration, apiV2AutoTestsIdTestResultsSearchPostRequest.duration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomes, testPlanIds, testRunIds, configurationIds, launchSource, userIds, duration);
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
    sb.append("class ApiV2AutoTestsIdTestResultsSearchPostRequest {\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    testPlanIds: ").append(toIndentedString(testPlanIds)).append("\n");
    sb.append("    testRunIds: ").append(toIndentedString(testRunIds)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
    openapiFields.add("outcomes");
    openapiFields.add("testPlanIds");
    openapiFields.add("testRunIds");
    openapiFields.add("configurationIds");
    openapiFields.add("launchSource");
    openapiFields.add("userIds");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2AutoTestsIdTestResultsSearchPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2AutoTestsIdTestResultsSearchPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2AutoTestsIdTestResultsSearchPostRequest is not found in the empty JSON string", ApiV2AutoTestsIdTestResultsSearchPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2AutoTestsIdTestResultsSearchPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2AutoTestsIdTestResultsSearchPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outcomes") != null && !jsonObj.get("outcomes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcomes` to be an array in the JSON string but got `%s`", jsonObj.get("outcomes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testPlanIds") != null && !jsonObj.get("testPlanIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanIds` to be an array in the JSON string but got `%s`", jsonObj.get("testPlanIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testRunIds") != null && !jsonObj.get("testRunIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunIds` to be an array in the JSON string but got `%s`", jsonObj.get("testRunIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      if ((jsonObj.get("launchSource") != null && !jsonObj.get("launchSource").isJsonNull()) && !jsonObj.get("launchSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `launchSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("launchSource").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("userIds") != null && !jsonObj.get("userIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIds` to be an array in the JSON string but got `%s`", jsonObj.get("userIds").toString()));
      }
      // validate the optional field `duration`
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) {
        Int64RangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("duration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2AutoTestsIdTestResultsSearchPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2AutoTestsIdTestResultsSearchPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2AutoTestsIdTestResultsSearchPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2AutoTestsIdTestResultsSearchPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2AutoTestsIdTestResultsSearchPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2AutoTestsIdTestResultsSearchPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2AutoTestsIdTestResultsSearchPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2AutoTestsIdTestResultsSearchPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2AutoTestsIdTestResultsSearchPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2AutoTestsIdTestResultsSearchPostRequest
  */
  public static ApiV2AutoTestsIdTestResultsSearchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2AutoTestsIdTestResultsSearchPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2AutoTestsIdTestResultsSearchPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

