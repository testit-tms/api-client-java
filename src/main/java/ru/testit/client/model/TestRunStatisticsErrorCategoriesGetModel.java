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
 * TestRunStatisticsErrorCategoriesGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunStatisticsErrorCategoriesGetModel {
  public static final String SERIALIZED_NAME_NO_ANALYTICS = "noAnalytics";
  @SerializedName(SERIALIZED_NAME_NO_ANALYTICS)
  private Integer noAnalytics;

  public static final String SERIALIZED_NAME_NO_DEFECT = "noDefect";
  @SerializedName(SERIALIZED_NAME_NO_DEFECT)
  private Integer noDefect;

  public static final String SERIALIZED_NAME_INFRASTRUCTURE_DEFECT = "infrastructureDefect";
  @SerializedName(SERIALIZED_NAME_INFRASTRUCTURE_DEFECT)
  private Integer infrastructureDefect;

  public static final String SERIALIZED_NAME_PRODUCT_DEFECT = "productDefect";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DEFECT)
  private Integer productDefect;

  public static final String SERIALIZED_NAME_TEST_DEFECT = "testDefect";
  @SerializedName(SERIALIZED_NAME_TEST_DEFECT)
  private Integer testDefect;

  public TestRunStatisticsErrorCategoriesGetModel() {
  }

  public TestRunStatisticsErrorCategoriesGetModel noAnalytics(Integer noAnalytics) {
    this.noAnalytics = noAnalytics;
    return this;
  }

   /**
   * Number of test results which outcomes were not analyzed
   * @return noAnalytics
  **/
  @javax.annotation.Nonnull
  public Integer getNoAnalytics() {
    return noAnalytics;
  }

  public void setNoAnalytics(Integer noAnalytics) {
    this.noAnalytics = noAnalytics;
  }


  public TestRunStatisticsErrorCategoriesGetModel noDefect(Integer noDefect) {
    this.noDefect = noDefect;
    return this;
  }

   /**
   * Number of test results which outcomes were not caused by any defect
   * @return noDefect
  **/
  @javax.annotation.Nonnull
  public Integer getNoDefect() {
    return noDefect;
  }

  public void setNoDefect(Integer noDefect) {
    this.noDefect = noDefect;
  }


  public TestRunStatisticsErrorCategoriesGetModel infrastructureDefect(Integer infrastructureDefect) {
    this.infrastructureDefect = infrastructureDefect;
    return this;
  }

   /**
   * Number of test results which outcomes were caused by some infrastructure defect
   * @return infrastructureDefect
  **/
  @javax.annotation.Nonnull
  public Integer getInfrastructureDefect() {
    return infrastructureDefect;
  }

  public void setInfrastructureDefect(Integer infrastructureDefect) {
    this.infrastructureDefect = infrastructureDefect;
  }


  public TestRunStatisticsErrorCategoriesGetModel productDefect(Integer productDefect) {
    this.productDefect = productDefect;
    return this;
  }

   /**
   * Number of test results which outcomes were caused by some tested product defect
   * @return productDefect
  **/
  @javax.annotation.Nonnull
  public Integer getProductDefect() {
    return productDefect;
  }

  public void setProductDefect(Integer productDefect) {
    this.productDefect = productDefect;
  }


  public TestRunStatisticsErrorCategoriesGetModel testDefect(Integer testDefect) {
    this.testDefect = testDefect;
    return this;
  }

   /**
   * Number of test results which outcomes were caused by test itself
   * @return testDefect
  **/
  @javax.annotation.Nonnull
  public Integer getTestDefect() {
    return testDefect;
  }

  public void setTestDefect(Integer testDefect) {
    this.testDefect = testDefect;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunStatisticsErrorCategoriesGetModel testRunStatisticsErrorCategoriesGetModel = (TestRunStatisticsErrorCategoriesGetModel) o;
    return Objects.equals(this.noAnalytics, testRunStatisticsErrorCategoriesGetModel.noAnalytics) &&
        Objects.equals(this.noDefect, testRunStatisticsErrorCategoriesGetModel.noDefect) &&
        Objects.equals(this.infrastructureDefect, testRunStatisticsErrorCategoriesGetModel.infrastructureDefect) &&
        Objects.equals(this.productDefect, testRunStatisticsErrorCategoriesGetModel.productDefect) &&
        Objects.equals(this.testDefect, testRunStatisticsErrorCategoriesGetModel.testDefect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noAnalytics, noDefect, infrastructureDefect, productDefect, testDefect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRunStatisticsErrorCategoriesGetModel {\n");
    sb.append("    noAnalytics: ").append(toIndentedString(noAnalytics)).append("\n");
    sb.append("    noDefect: ").append(toIndentedString(noDefect)).append("\n");
    sb.append("    infrastructureDefect: ").append(toIndentedString(infrastructureDefect)).append("\n");
    sb.append("    productDefect: ").append(toIndentedString(productDefect)).append("\n");
    sb.append("    testDefect: ").append(toIndentedString(testDefect)).append("\n");
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
    openapiFields.add("noAnalytics");
    openapiFields.add("noDefect");
    openapiFields.add("infrastructureDefect");
    openapiFields.add("productDefect");
    openapiFields.add("testDefect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("noAnalytics");
    openapiRequiredFields.add("noDefect");
    openapiRequiredFields.add("infrastructureDefect");
    openapiRequiredFields.add("productDefect");
    openapiRequiredFields.add("testDefect");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestRunStatisticsErrorCategoriesGetModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestRunStatisticsErrorCategoriesGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunStatisticsErrorCategoriesGetModel is not found in the empty JSON string", TestRunStatisticsErrorCategoriesGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestRunStatisticsErrorCategoriesGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunStatisticsErrorCategoriesGetModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestRunStatisticsErrorCategoriesGetModel.openapiRequiredFields) {
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
       if (!TestRunStatisticsErrorCategoriesGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunStatisticsErrorCategoriesGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunStatisticsErrorCategoriesGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunStatisticsErrorCategoriesGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunStatisticsErrorCategoriesGetModel>() {
           @Override
           public void write(JsonWriter out, TestRunStatisticsErrorCategoriesGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunStatisticsErrorCategoriesGetModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunStatisticsErrorCategoriesGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunStatisticsErrorCategoriesGetModel
  * @throws IOException if the JSON string is invalid with respect to TestRunStatisticsErrorCategoriesGetModel
  */
  public static TestRunStatisticsErrorCategoriesGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunStatisticsErrorCategoriesGetModel.class);
  }

 /**
  * Convert an instance of TestRunStatisticsErrorCategoriesGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

