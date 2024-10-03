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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TestSuiteType;

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
 * ApiV2TestSuitesPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2TestSuitesPostRequest {
  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TestSuiteType type;

  public static final String SERIALIZED_NAME_SAVE_STRUCTURE = "saveStructure";
  @SerializedName(SERIALIZED_NAME_SAVE_STRUCTURE)
  private Boolean saveStructure;

  public static final String SERIALIZED_NAME_AUTO_REFRESH = "autoRefresh";
  @SerializedName(SERIALIZED_NAME_AUTO_REFRESH)
  private Boolean autoRefresh;

  public ApiV2TestSuitesPostRequest() {
  }

  public ApiV2TestSuitesPostRequest parentId(UUID parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Unique ID of the parent test suite in hierarchy
   * @return parentId
  **/
  @javax.annotation.Nullable
  public UUID getParentId() {
    return parentId;
  }


  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public ApiV2TestSuitesPostRequest testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Unique ID of test plan to which the test suite belongs
   * @return testPlanId
  **/
  @javax.annotation.Nonnull
  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public ApiV2TestSuitesPostRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the test suite
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApiV2TestSuitesPostRequest type(TestSuiteType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TestSuiteType getType() {
    return type;
  }


  public void setType(TestSuiteType type) {
    this.type = type;
  }


  public ApiV2TestSuitesPostRequest saveStructure(Boolean saveStructure) {
    
    this.saveStructure = saveStructure;
    return this;
  }

   /**
   * Indicates if the test suite retains section tree structure
   * @return saveStructure
  **/
  @javax.annotation.Nullable
  public Boolean getSaveStructure() {
    return saveStructure;
  }


  public void setSaveStructure(Boolean saveStructure) {
    this.saveStructure = saveStructure;
  }


  public ApiV2TestSuitesPostRequest autoRefresh(Boolean autoRefresh) {
    
    this.autoRefresh = autoRefresh;
    return this;
  }

   /**
   * Indicates if scheduled auto refresh is enabled for the test suite
   * @return autoRefresh
  **/
  @javax.annotation.Nullable
  public Boolean getAutoRefresh() {
    return autoRefresh;
  }


  public void setAutoRefresh(Boolean autoRefresh) {
    this.autoRefresh = autoRefresh;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2TestSuitesPostRequest apiV2TestSuitesPostRequest = (ApiV2TestSuitesPostRequest) o;
    return Objects.equals(this.parentId, apiV2TestSuitesPostRequest.parentId) &&
        Objects.equals(this.testPlanId, apiV2TestSuitesPostRequest.testPlanId) &&
        Objects.equals(this.name, apiV2TestSuitesPostRequest.name) &&
        Objects.equals(this.type, apiV2TestSuitesPostRequest.type) &&
        Objects.equals(this.saveStructure, apiV2TestSuitesPostRequest.saveStructure) &&
        Objects.equals(this.autoRefresh, apiV2TestSuitesPostRequest.autoRefresh);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, testPlanId, name, type, saveStructure, autoRefresh);
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
    sb.append("class ApiV2TestSuitesPostRequest {\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    saveStructure: ").append(toIndentedString(saveStructure)).append("\n");
    sb.append("    autoRefresh: ").append(toIndentedString(autoRefresh)).append("\n");
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
    openapiFields.add("parentId");
    openapiFields.add("testPlanId");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("saveStructure");
    openapiFields.add("autoRefresh");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("testPlanId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2TestSuitesPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2TestSuitesPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2TestSuitesPostRequest is not found in the empty JSON string", ApiV2TestSuitesPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2TestSuitesPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2TestSuitesPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV2TestSuitesPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if (!jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2TestSuitesPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2TestSuitesPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2TestSuitesPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2TestSuitesPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2TestSuitesPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2TestSuitesPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2TestSuitesPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2TestSuitesPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2TestSuitesPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2TestSuitesPostRequest
  */
  public static ApiV2TestSuitesPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2TestSuitesPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2TestSuitesPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
