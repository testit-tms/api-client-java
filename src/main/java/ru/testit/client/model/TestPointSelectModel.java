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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TestPointFilterModel;
import ru.testit.client.model.TestPointsExtractionModel;

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
 * TestPointSelectModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestPointSelectModel {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private TestPointFilterModel filter;

  public static final String SERIALIZED_NAME_EXTRACTION_MODEL = "extractionModel";
  @SerializedName(SERIALIZED_NAME_EXTRACTION_MODEL)
  private TestPointsExtractionModel extractionModel;

  public TestPointSelectModel() {
  }

  public TestPointSelectModel filter(TestPointFilterModel filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public TestPointFilterModel getFilter() {
    return filter;
  }

  public void setFilter(TestPointFilterModel filter) {
    this.filter = filter;
  }


  public TestPointSelectModel extractionModel(TestPointsExtractionModel extractionModel) {
    this.extractionModel = extractionModel;
    return this;
  }

  /**
   * Get extractionModel
   * @return extractionModel
   */
  @javax.annotation.Nullable
  public TestPointsExtractionModel getExtractionModel() {
    return extractionModel;
  }

  public void setExtractionModel(TestPointsExtractionModel extractionModel) {
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
    TestPointSelectModel testPointSelectModel = (TestPointSelectModel) o;
    return Objects.equals(this.filter, testPointSelectModel.filter) &&
        Objects.equals(this.extractionModel, testPointSelectModel.extractionModel);
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
    sb.append("class TestPointSelectModel {\n");
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestPointSelectModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestPointSelectModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPointSelectModel is not found in the empty JSON string", TestPointSelectModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestPointSelectModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPointSelectModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        TestPointFilterModel.validateJsonElement(jsonObj.get("filter"));
      }
      // validate the optional field `extractionModel`
      if (jsonObj.get("extractionModel") != null && !jsonObj.get("extractionModel").isJsonNull()) {
        TestPointsExtractionModel.validateJsonElement(jsonObj.get("extractionModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPointSelectModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPointSelectModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPointSelectModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPointSelectModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPointSelectModel>() {
           @Override
           public void write(JsonWriter out, TestPointSelectModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPointSelectModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestPointSelectModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestPointSelectModel
   * @throws IOException if the JSON string is invalid with respect to TestPointSelectModel
   */
  public static TestPointSelectModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPointSelectModel.class);
  }

  /**
   * Convert an instance of TestPointSelectModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

