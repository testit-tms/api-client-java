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
import ru.testit.client.model.RerunTestResultModel;

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
 * RerunsModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class RerunsModel {
  public static final String SERIALIZED_NAME_RERUN_COUNT = "rerunCount";
  @SerializedName(SERIALIZED_NAME_RERUN_COUNT)
  private Integer rerunCount;

  public static final String SERIALIZED_NAME_RERUN_TEST_RESULTS = "rerunTestResults";
  @SerializedName(SERIALIZED_NAME_RERUN_TEST_RESULTS)
  private List<RerunTestResultModel> rerunTestResults = new ArrayList<>();

  public RerunsModel() {
  }

  public RerunsModel rerunCount(Integer rerunCount) {
    this.rerunCount = rerunCount;
    return this;
  }

  /**
   * Get rerunCount
   * @return rerunCount
   */
  @javax.annotation.Nonnull
  public Integer getRerunCount() {
    return rerunCount;
  }

  public void setRerunCount(Integer rerunCount) {
    this.rerunCount = rerunCount;
  }


  public RerunsModel rerunTestResults(List<RerunTestResultModel> rerunTestResults) {
    this.rerunTestResults = rerunTestResults;
    return this;
  }

  public RerunsModel addRerunTestResultsItem(RerunTestResultModel rerunTestResultsItem) {
    if (this.rerunTestResults == null) {
      this.rerunTestResults = new ArrayList<>();
    }
    this.rerunTestResults.add(rerunTestResultsItem);
    return this;
  }

  /**
   * Get rerunTestResults
   * @return rerunTestResults
   */
  @javax.annotation.Nonnull
  public List<RerunTestResultModel> getRerunTestResults() {
    return rerunTestResults;
  }

  public void setRerunTestResults(List<RerunTestResultModel> rerunTestResults) {
    this.rerunTestResults = rerunTestResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RerunsModel rerunsModel = (RerunsModel) o;
    return Objects.equals(this.rerunCount, rerunsModel.rerunCount) &&
        Objects.equals(this.rerunTestResults, rerunsModel.rerunTestResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rerunCount, rerunTestResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RerunsModel {\n");
    sb.append("    rerunCount: ").append(toIndentedString(rerunCount)).append("\n");
    sb.append("    rerunTestResults: ").append(toIndentedString(rerunTestResults)).append("\n");
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
    openapiFields.add("rerunCount");
    openapiFields.add("rerunTestResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rerunCount");
    openapiRequiredFields.add("rerunTestResults");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RerunsModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RerunsModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RerunsModel is not found in the empty JSON string", RerunsModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RerunsModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RerunsModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RerunsModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("rerunTestResults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rerunTestResults` to be an array in the JSON string but got `%s`", jsonObj.get("rerunTestResults").toString()));
      }

      JsonArray jsonArrayrerunTestResults = jsonObj.getAsJsonArray("rerunTestResults");
      // validate the required field `rerunTestResults` (array)
      for (int i = 0; i < jsonArrayrerunTestResults.size(); i++) {
        RerunTestResultModel.validateJsonElement(jsonArrayrerunTestResults.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RerunsModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RerunsModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RerunsModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RerunsModel.class));

       return (TypeAdapter<T>) new TypeAdapter<RerunsModel>() {
           @Override
           public void write(JsonWriter out, RerunsModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RerunsModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RerunsModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RerunsModel
   * @throws IOException if the JSON string is invalid with respect to RerunsModel
   */
  public static RerunsModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RerunsModel.class);
  }

  /**
   * Convert an instance of RerunsModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

