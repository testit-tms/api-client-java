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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Specifies a work item median duration range to search for
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestSuiteWorkItemsSearchModelMedianDuration {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Long from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Long to;

  public TestSuiteWorkItemsSearchModelMedianDuration() {
  }

  public TestSuiteWorkItemsSearchModelMedianDuration from(Long from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  public Long getFrom() {
    return from;
  }


  public void setFrom(Long from) {
    this.from = from;
  }


  public TestSuiteWorkItemsSearchModelMedianDuration to(Long to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  public Long getTo() {
    return to;
  }


  public void setTo(Long to) {
    this.to = to;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteWorkItemsSearchModelMedianDuration testSuiteWorkItemsSearchModelMedianDuration = (TestSuiteWorkItemsSearchModelMedianDuration) o;
    return Objects.equals(this.from, testSuiteWorkItemsSearchModelMedianDuration.from) &&
        Objects.equals(this.to, testSuiteWorkItemsSearchModelMedianDuration.to);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
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
    sb.append("class TestSuiteWorkItemsSearchModelMedianDuration {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestSuiteWorkItemsSearchModelMedianDuration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestSuiteWorkItemsSearchModelMedianDuration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestSuiteWorkItemsSearchModelMedianDuration is not found in the empty JSON string", TestSuiteWorkItemsSearchModelMedianDuration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestSuiteWorkItemsSearchModelMedianDuration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestSuiteWorkItemsSearchModelMedianDuration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestSuiteWorkItemsSearchModelMedianDuration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestSuiteWorkItemsSearchModelMedianDuration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestSuiteWorkItemsSearchModelMedianDuration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestSuiteWorkItemsSearchModelMedianDuration.class));

       return (TypeAdapter<T>) new TypeAdapter<TestSuiteWorkItemsSearchModelMedianDuration>() {
           @Override
           public void write(JsonWriter out, TestSuiteWorkItemsSearchModelMedianDuration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestSuiteWorkItemsSearchModelMedianDuration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestSuiteWorkItemsSearchModelMedianDuration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestSuiteWorkItemsSearchModelMedianDuration
  * @throws IOException if the JSON string is invalid with respect to TestSuiteWorkItemsSearchModelMedianDuration
  */
  public static TestSuiteWorkItemsSearchModelMedianDuration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestSuiteWorkItemsSearchModelMedianDuration.class);
  }

 /**
  * Convert an instance of TestSuiteWorkItemsSearchModelMedianDuration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

