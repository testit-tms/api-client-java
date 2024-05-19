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
 * Test results counts aggregated by outcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsStatisticsGetModelStatuses {
  public static final String SERIALIZED_NAME_IN_PROGRESS = "inProgress";
  @SerializedName(SERIALIZED_NAME_IN_PROGRESS)
  private Integer inProgress;

  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  private Integer passed;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_SKIPPED = "skipped";
  @SerializedName(SERIALIZED_NAME_SKIPPED)
  private Integer skipped;

  public static final String SERIALIZED_NAME_BLOCKED = "blocked";
  @SerializedName(SERIALIZED_NAME_BLOCKED)
  private Integer blocked;

  public TestResultsStatisticsGetModelStatuses() {
  }

  public TestResultsStatisticsGetModelStatuses inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

   /**
   * Number of test results which is running currently
   * @return inProgress
  **/
  @javax.annotation.Nonnull
  public Integer getInProgress() {
    return inProgress;
  }

  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }


  public TestResultsStatisticsGetModelStatuses passed(Integer passed) {
    this.passed = passed;
    return this;
  }

   /**
   * Number of test results which successfully passed
   * @return passed
  **/
  @javax.annotation.Nonnull
  public Integer getPassed() {
    return passed;
  }

  public void setPassed(Integer passed) {
    this.passed = passed;
  }


  public TestResultsStatisticsGetModelStatuses failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Number of test results which failed with an error
   * @return failed
  **/
  @javax.annotation.Nonnull
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public TestResultsStatisticsGetModelStatuses skipped(Integer skipped) {
    this.skipped = skipped;
    return this;
  }

   /**
   * Number of test results which did not run and were skipped
   * @return skipped
  **/
  @javax.annotation.Nonnull
  public Integer getSkipped() {
    return skipped;
  }

  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }


  public TestResultsStatisticsGetModelStatuses blocked(Integer blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Number of test results which cannot be launched
   * @return blocked
  **/
  @javax.annotation.Nonnull
  public Integer getBlocked() {
    return blocked;
  }

  public void setBlocked(Integer blocked) {
    this.blocked = blocked;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsStatisticsGetModelStatuses testResultsStatisticsGetModelStatuses = (TestResultsStatisticsGetModelStatuses) o;
    return Objects.equals(this.inProgress, testResultsStatisticsGetModelStatuses.inProgress) &&
        Objects.equals(this.passed, testResultsStatisticsGetModelStatuses.passed) &&
        Objects.equals(this.failed, testResultsStatisticsGetModelStatuses.failed) &&
        Objects.equals(this.skipped, testResultsStatisticsGetModelStatuses.skipped) &&
        Objects.equals(this.blocked, testResultsStatisticsGetModelStatuses.blocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProgress, passed, failed, skipped, blocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultsStatisticsGetModelStatuses {\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
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
    openapiFields.add("inProgress");
    openapiFields.add("passed");
    openapiFields.add("failed");
    openapiFields.add("skipped");
    openapiFields.add("blocked");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inProgress");
    openapiRequiredFields.add("passed");
    openapiRequiredFields.add("failed");
    openapiRequiredFields.add("skipped");
    openapiRequiredFields.add("blocked");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestResultsStatisticsGetModelStatuses
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResultsStatisticsGetModelStatuses.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultsStatisticsGetModelStatuses is not found in the empty JSON string", TestResultsStatisticsGetModelStatuses.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResultsStatisticsGetModelStatuses.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultsStatisticsGetModelStatuses` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestResultsStatisticsGetModelStatuses.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultsStatisticsGetModelStatuses.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultsStatisticsGetModelStatuses' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultsStatisticsGetModelStatuses> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultsStatisticsGetModelStatuses.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultsStatisticsGetModelStatuses>() {
           @Override
           public void write(JsonWriter out, TestResultsStatisticsGetModelStatuses value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultsStatisticsGetModelStatuses read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultsStatisticsGetModelStatuses given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultsStatisticsGetModelStatuses
  * @throws IOException if the JSON string is invalid with respect to TestResultsStatisticsGetModelStatuses
  */
  public static TestResultsStatisticsGetModelStatuses fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultsStatisticsGetModelStatuses.class);
  }

 /**
  * Convert an instance of TestResultsStatisticsGetModelStatuses to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

