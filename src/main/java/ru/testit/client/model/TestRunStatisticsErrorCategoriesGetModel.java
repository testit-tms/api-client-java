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
 * TestRunStatisticsErrorCategoriesGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunStatisticsErrorCategoriesGetModel {
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
    return Objects.equals(this.infrastructureDefect, testRunStatisticsErrorCategoriesGetModel.infrastructureDefect) &&
        Objects.equals(this.productDefect, testRunStatisticsErrorCategoriesGetModel.productDefect) &&
        Objects.equals(this.testDefect, testRunStatisticsErrorCategoriesGetModel.testDefect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infrastructureDefect, productDefect, testDefect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRunStatisticsErrorCategoriesGetModel {\n");
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
    openapiFields.add("infrastructureDefect");
    openapiFields.add("productDefect");
    openapiFields.add("testDefect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("infrastructureDefect");
    openapiRequiredFields.add("productDefect");
    openapiRequiredFields.add("testDefect");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunStatisticsErrorCategoriesGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunStatisticsErrorCategoriesGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunStatisticsErrorCategoriesGetModel is not found in the empty JSON string", TestRunStatisticsErrorCategoriesGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunStatisticsErrorCategoriesGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunStatisticsErrorCategoriesGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestRunStatisticsErrorCategoriesGetModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

