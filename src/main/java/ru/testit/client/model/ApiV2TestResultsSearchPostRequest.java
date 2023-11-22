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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.FailureCategoryModel;
import ru.testit.client.model.TestResultOutcome;

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
 * ApiV2TestResultsSearchPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2TestResultsSearchPostRequest {
  public static final String SERIALIZED_NAME_TEST_RUN_IDS = "testRunIds";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_IDS)
  private List<UUID> testRunIds;

  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private List<UUID> configurationIds;

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private List<TestResultOutcome> outcomes;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORIES = "failureCategories";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORIES)
  private List<FailureCategoryModel> failureCategories;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public ApiV2TestResultsSearchPostRequest() {
  }

  public ApiV2TestResultsSearchPostRequest testRunIds(List<UUID> testRunIds) {
    
    this.testRunIds = testRunIds;
    return this;
  }

  public ApiV2TestResultsSearchPostRequest addTestRunIdsItem(UUID testRunIdsItem) {
    if (this.testRunIds == null) {
      this.testRunIds = new ArrayList<>();
    }
    this.testRunIds.add(testRunIdsItem);
    return this;
  }

   /**
   * Specifies a test result test run IDs to search for
   * @return testRunIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getTestRunIds() {
    return testRunIds;
  }


  public void setTestRunIds(List<UUID> testRunIds) {
    this.testRunIds = testRunIds;
  }


  public ApiV2TestResultsSearchPostRequest configurationIds(List<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public ApiV2TestResultsSearchPostRequest addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new ArrayList<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies a test result configuration IDs to search for
   * @return configurationIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public ApiV2TestResultsSearchPostRequest outcomes(List<TestResultOutcome> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public ApiV2TestResultsSearchPostRequest addOutcomesItem(TestResultOutcome outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Specifies a test result outcomes to search for
   * @return outcomes
  **/
  @javax.annotation.Nullable
  public List<TestResultOutcome> getOutcomes() {
    return outcomes;
  }


  public void setOutcomes(List<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  public ApiV2TestResultsSearchPostRequest failureCategories(List<FailureCategoryModel> failureCategories) {
    
    this.failureCategories = failureCategories;
    return this;
  }

  public ApiV2TestResultsSearchPostRequest addFailureCategoriesItem(FailureCategoryModel failureCategoriesItem) {
    if (this.failureCategories == null) {
      this.failureCategories = new ArrayList<>();
    }
    this.failureCategories.add(failureCategoriesItem);
    return this;
  }

   /**
   * Specifies a test result failure categories to search for
   * @return failureCategories
  **/
  @javax.annotation.Nullable
  public List<FailureCategoryModel> getFailureCategories() {
    return failureCategories;
  }


  public void setFailureCategories(List<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
  }


  public ApiV2TestResultsSearchPostRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies a test result namespace to search for
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public ApiV2TestResultsSearchPostRequest className(String className) {
    
    this.className = className;
    return this;
  }

   /**
   * Specifies a test result class name to search for
   * @return className
  **/
  @javax.annotation.Nullable
  public String getClassName() {
    return className;
  }


  public void setClassName(String className) {
    this.className = className;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2TestResultsSearchPostRequest apiV2TestResultsSearchPostRequest = (ApiV2TestResultsSearchPostRequest) o;
    return Objects.equals(this.testRunIds, apiV2TestResultsSearchPostRequest.testRunIds) &&
        Objects.equals(this.configurationIds, apiV2TestResultsSearchPostRequest.configurationIds) &&
        Objects.equals(this.outcomes, apiV2TestResultsSearchPostRequest.outcomes) &&
        Objects.equals(this.failureCategories, apiV2TestResultsSearchPostRequest.failureCategories) &&
        Objects.equals(this.namespace, apiV2TestResultsSearchPostRequest.namespace) &&
        Objects.equals(this.className, apiV2TestResultsSearchPostRequest.className);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRunIds, configurationIds, outcomes, failureCategories, namespace, className);
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
    sb.append("class ApiV2TestResultsSearchPostRequest {\n");
    sb.append("    testRunIds: ").append(toIndentedString(testRunIds)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    failureCategories: ").append(toIndentedString(failureCategories)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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
    openapiFields.add("testRunIds");
    openapiFields.add("configurationIds");
    openapiFields.add("outcomes");
    openapiFields.add("failureCategories");
    openapiFields.add("namespace");
    openapiFields.add("className");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2TestResultsSearchPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2TestResultsSearchPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2TestResultsSearchPostRequest is not found in the empty JSON string", ApiV2TestResultsSearchPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2TestResultsSearchPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2TestResultsSearchPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testRunIds") != null && !jsonObj.get("testRunIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunIds` to be an array in the JSON string but got `%s`", jsonObj.get("testRunIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configurationIds") != null && !jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outcomes") != null && !jsonObj.get("outcomes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcomes` to be an array in the JSON string but got `%s`", jsonObj.get("outcomes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureCategories") != null && !jsonObj.get("failureCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureCategories` to be an array in the JSON string but got `%s`", jsonObj.get("failureCategories").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("className") != null && !jsonObj.get("className").isJsonNull()) && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2TestResultsSearchPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2TestResultsSearchPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2TestResultsSearchPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2TestResultsSearchPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2TestResultsSearchPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2TestResultsSearchPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2TestResultsSearchPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2TestResultsSearchPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2TestResultsSearchPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2TestResultsSearchPostRequest
  */
  public static ApiV2TestResultsSearchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2TestResultsSearchPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2TestResultsSearchPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

