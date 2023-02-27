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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * TestResultsStatisticsGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsStatisticsGetModel {
  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private TestRunStatisticsStatusesGetModel statuses;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORIES = "failureCategories";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORIES)
  private TestRunStatisticsErrorCategoriesGetModel failureCategories;

  public TestResultsStatisticsGetModel() {
  }

  public TestResultsStatisticsGetModel statuses(TestRunStatisticsStatusesGetModel statuses) {
    
    this.statuses = statuses;
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestRunStatisticsStatusesGetModel getStatuses() {
    return statuses;
  }


  public void setStatuses(TestRunStatisticsStatusesGetModel statuses) {
    this.statuses = statuses;
  }


  public TestResultsStatisticsGetModel failureCategories(TestRunStatisticsErrorCategoriesGetModel failureCategories) {
    
    this.failureCategories = failureCategories;
    return this;
  }

   /**
   * Get failureCategories
   * @return failureCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestRunStatisticsErrorCategoriesGetModel getFailureCategories() {
    return failureCategories;
  }


  public void setFailureCategories(TestRunStatisticsErrorCategoriesGetModel failureCategories) {
    this.failureCategories = failureCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsStatisticsGetModel testResultsStatisticsGetModel = (TestResultsStatisticsGetModel) o;
    return Objects.equals(this.statuses, testResultsStatisticsGetModel.statuses) &&
        Objects.equals(this.failureCategories, testResultsStatisticsGetModel.failureCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, failureCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultsStatisticsGetModel {\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    failureCategories: ").append(toIndentedString(failureCategories)).append("\n");
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
    openapiFields.add("statuses");
    openapiFields.add("failureCategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultsStatisticsGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultsStatisticsGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultsStatisticsGetModel is not found in the empty JSON string", TestResultsStatisticsGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultsStatisticsGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultsStatisticsGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `statuses`
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        TestRunStatisticsStatusesGetModel.validateJsonObject(jsonObj.getAsJsonObject("statuses"));
      }
      // validate the optional field `failureCategories`
      if (jsonObj.get("failureCategories") != null && !jsonObj.get("failureCategories").isJsonNull()) {
        TestRunStatisticsErrorCategoriesGetModel.validateJsonObject(jsonObj.getAsJsonObject("failureCategories"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultsStatisticsGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultsStatisticsGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultsStatisticsGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultsStatisticsGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultsStatisticsGetModel>() {
           @Override
           public void write(JsonWriter out, TestResultsStatisticsGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultsStatisticsGetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultsStatisticsGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultsStatisticsGetModel
  * @throws IOException if the JSON string is invalid with respect to TestResultsStatisticsGetModel
  */
  public static TestResultsStatisticsGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultsStatisticsGetModel.class);
  }

 /**
  * Convert an instance of TestResultsStatisticsGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

