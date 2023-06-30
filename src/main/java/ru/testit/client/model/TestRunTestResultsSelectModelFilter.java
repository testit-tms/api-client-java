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
 * Collection of filters to apply to search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunTestResultsSelectModelFilter {
  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private Set<UUID> configurationIds;

  public static final String SERIALIZED_NAME_OUTCOMES = "outcomes";
  @SerializedName(SERIALIZED_NAME_OUTCOMES)
  private Set<TestResultOutcome> outcomes;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORIES = "failureCategories";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORIES)
  private Set<FailureCategoryModel> failureCategories;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public TestRunTestResultsSelectModelFilter() {
  }

  public TestRunTestResultsSelectModelFilter configurationIds(Set<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public TestRunTestResultsSelectModelFilter addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new LinkedHashSet<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies a test result configuration IDs to search for
   * @return configurationIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(Set<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public TestRunTestResultsSelectModelFilter outcomes(Set<TestResultOutcome> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public TestRunTestResultsSelectModelFilter addOutcomesItem(TestResultOutcome outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new LinkedHashSet<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Specifies a test result outcomes to search for
   * @return outcomes
  **/
  @javax.annotation.Nullable
  public Set<TestResultOutcome> getOutcomes() {
    return outcomes;
  }


  public void setOutcomes(Set<TestResultOutcome> outcomes) {
    this.outcomes = outcomes;
  }


  public TestRunTestResultsSelectModelFilter failureCategories(Set<FailureCategoryModel> failureCategories) {
    
    this.failureCategories = failureCategories;
    return this;
  }

  public TestRunTestResultsSelectModelFilter addFailureCategoriesItem(FailureCategoryModel failureCategoriesItem) {
    if (this.failureCategories == null) {
      this.failureCategories = new LinkedHashSet<>();
    }
    this.failureCategories.add(failureCategoriesItem);
    return this;
  }

   /**
   * Specifies a test result failure categories to search for
   * @return failureCategories
  **/
  @javax.annotation.Nullable
  public Set<FailureCategoryModel> getFailureCategories() {
    return failureCategories;
  }


  public void setFailureCategories(Set<FailureCategoryModel> failureCategories) {
    this.failureCategories = failureCategories;
  }


  public TestRunTestResultsSelectModelFilter namespace(String namespace) {
    
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


  public TestRunTestResultsSelectModelFilter className(String className) {
    
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
    TestRunTestResultsSelectModelFilter testRunTestResultsSelectModelFilter = (TestRunTestResultsSelectModelFilter) o;
    return Objects.equals(this.configurationIds, testRunTestResultsSelectModelFilter.configurationIds) &&
        Objects.equals(this.outcomes, testRunTestResultsSelectModelFilter.outcomes) &&
        Objects.equals(this.failureCategories, testRunTestResultsSelectModelFilter.failureCategories) &&
        Objects.equals(this.namespace, testRunTestResultsSelectModelFilter.namespace) &&
        Objects.equals(this.className, testRunTestResultsSelectModelFilter.className);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIds, outcomes, failureCategories, namespace, className);
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
    sb.append("class TestRunTestResultsSelectModelFilter {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to TestRunTestResultsSelectModelFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunTestResultsSelectModelFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunTestResultsSelectModelFilter is not found in the empty JSON string", TestRunTestResultsSelectModelFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunTestResultsSelectModelFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunTestResultsSelectModelFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
       if (!TestRunTestResultsSelectModelFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunTestResultsSelectModelFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunTestResultsSelectModelFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunTestResultsSelectModelFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunTestResultsSelectModelFilter>() {
           @Override
           public void write(JsonWriter out, TestRunTestResultsSelectModelFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunTestResultsSelectModelFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunTestResultsSelectModelFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunTestResultsSelectModelFilter
  * @throws IOException if the JSON string is invalid with respect to TestRunTestResultsSelectModelFilter
  */
  public static TestRunTestResultsSelectModelFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunTestResultsSelectModelFilter.class);
  }

 /**
  * Convert an instance of TestRunTestResultsSelectModelFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

