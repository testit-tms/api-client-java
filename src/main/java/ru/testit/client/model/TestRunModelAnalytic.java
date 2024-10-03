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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TestRunGroupByFailureClassModel;
import ru.testit.client.model.TestRunGroupByStatusModel;

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
 * TestRunModelAnalytic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunModelAnalytic {
  public static final String SERIALIZED_NAME_COUNT_GROUP_BY_STATUS = "countGroupByStatus";
  @SerializedName(SERIALIZED_NAME_COUNT_GROUP_BY_STATUS)
  private List<TestRunGroupByStatusModel> countGroupByStatus;

  public static final String SERIALIZED_NAME_COUNT_GROUP_BY_FAILURE_CLASS = "countGroupByFailureClass";
  @SerializedName(SERIALIZED_NAME_COUNT_GROUP_BY_FAILURE_CLASS)
  private List<TestRunGroupByFailureClassModel> countGroupByFailureClass;

  public TestRunModelAnalytic() {
  }

  public TestRunModelAnalytic countGroupByStatus(List<TestRunGroupByStatusModel> countGroupByStatus) {
    
    this.countGroupByStatus = countGroupByStatus;
    return this;
  }

  public TestRunModelAnalytic addCountGroupByStatusItem(TestRunGroupByStatusModel countGroupByStatusItem) {
    if (this.countGroupByStatus == null) {
      this.countGroupByStatus = new ArrayList<>();
    }
    this.countGroupByStatus.add(countGroupByStatusItem);
    return this;
  }

   /**
   * Get countGroupByStatus
   * @return countGroupByStatus
  **/
  @javax.annotation.Nullable
  public List<TestRunGroupByStatusModel> getCountGroupByStatus() {
    return countGroupByStatus;
  }


  public void setCountGroupByStatus(List<TestRunGroupByStatusModel> countGroupByStatus) {
    this.countGroupByStatus = countGroupByStatus;
  }


  public TestRunModelAnalytic countGroupByFailureClass(List<TestRunGroupByFailureClassModel> countGroupByFailureClass) {
    
    this.countGroupByFailureClass = countGroupByFailureClass;
    return this;
  }

  public TestRunModelAnalytic addCountGroupByFailureClassItem(TestRunGroupByFailureClassModel countGroupByFailureClassItem) {
    if (this.countGroupByFailureClass == null) {
      this.countGroupByFailureClass = new ArrayList<>();
    }
    this.countGroupByFailureClass.add(countGroupByFailureClassItem);
    return this;
  }

   /**
   * Get countGroupByFailureClass
   * @return countGroupByFailureClass
  **/
  @javax.annotation.Nullable
  public List<TestRunGroupByFailureClassModel> getCountGroupByFailureClass() {
    return countGroupByFailureClass;
  }


  public void setCountGroupByFailureClass(List<TestRunGroupByFailureClassModel> countGroupByFailureClass) {
    this.countGroupByFailureClass = countGroupByFailureClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunModelAnalytic testRunModelAnalytic = (TestRunModelAnalytic) o;
    return Objects.equals(this.countGroupByStatus, testRunModelAnalytic.countGroupByStatus) &&
        Objects.equals(this.countGroupByFailureClass, testRunModelAnalytic.countGroupByFailureClass);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(countGroupByStatus, countGroupByFailureClass);
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
    sb.append("class TestRunModelAnalytic {\n");
    sb.append("    countGroupByStatus: ").append(toIndentedString(countGroupByStatus)).append("\n");
    sb.append("    countGroupByFailureClass: ").append(toIndentedString(countGroupByFailureClass)).append("\n");
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
    openapiFields.add("countGroupByStatus");
    openapiFields.add("countGroupByFailureClass");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunModelAnalytic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunModelAnalytic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunModelAnalytic is not found in the empty JSON string", TestRunModelAnalytic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunModelAnalytic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunModelAnalytic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("countGroupByStatus") != null && !jsonObj.get("countGroupByStatus").isJsonNull()) {
        JsonArray jsonArraycountGroupByStatus = jsonObj.getAsJsonArray("countGroupByStatus");
        if (jsonArraycountGroupByStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("countGroupByStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `countGroupByStatus` to be an array in the JSON string but got `%s`", jsonObj.get("countGroupByStatus").toString()));
          }

          // validate the optional field `countGroupByStatus` (array)
          for (int i = 0; i < jsonArraycountGroupByStatus.size(); i++) {
            TestRunGroupByStatusModel.validateJsonObject(jsonArraycountGroupByStatus.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("countGroupByFailureClass") != null && !jsonObj.get("countGroupByFailureClass").isJsonNull()) {
        JsonArray jsonArraycountGroupByFailureClass = jsonObj.getAsJsonArray("countGroupByFailureClass");
        if (jsonArraycountGroupByFailureClass != null) {
          // ensure the json data is an array
          if (!jsonObj.get("countGroupByFailureClass").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `countGroupByFailureClass` to be an array in the JSON string but got `%s`", jsonObj.get("countGroupByFailureClass").toString()));
          }

          // validate the optional field `countGroupByFailureClass` (array)
          for (int i = 0; i < jsonArraycountGroupByFailureClass.size(); i++) {
            TestRunGroupByFailureClassModel.validateJsonObject(jsonArraycountGroupByFailureClass.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestRunModelAnalytic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunModelAnalytic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunModelAnalytic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunModelAnalytic.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunModelAnalytic>() {
           @Override
           public void write(JsonWriter out, TestRunModelAnalytic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunModelAnalytic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunModelAnalytic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunModelAnalytic
  * @throws IOException if the JSON string is invalid with respect to TestRunModelAnalytic
  */
  public static TestRunModelAnalytic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunModelAnalytic.class);
  }

 /**
  * Convert an instance of TestRunModelAnalytic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
