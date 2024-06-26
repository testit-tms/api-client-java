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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
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
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * ProjectExportWithTestPlansPostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectExportWithTestPlansPostModel {
  public static final String SERIALIZED_NAME_TEST_PLANS_IDS = "testPlansIds";
  @SerializedName(SERIALIZED_NAME_TEST_PLANS_IDS)
  private Set<UUID> testPlansIds;

  public ProjectExportWithTestPlansPostModel() {
  }

  public ProjectExportWithTestPlansPostModel testPlansIds(Set<UUID> testPlansIds) {
    this.testPlansIds = testPlansIds;
    return this;
  }

  public ProjectExportWithTestPlansPostModel addTestPlansIdsItem(UUID testPlansIdsItem) {
    if (this.testPlansIds == null) {
      this.testPlansIds = new LinkedHashSet<>();
    }
    this.testPlansIds.add(testPlansIdsItem);
    return this;
  }

   /**
   * Specifies the IDs of test plans to be exported with the project.&lt;br /&gt;  In this parameter, \&quot;&lt;b&gt;string&lt;/b&gt;\&quot; values are IDs of the test plans.&lt;br /&gt;  To get the test plan IDs, use the &#x60;GET /api/v2/projects/{projectId}/testPlans&#x60; method.
   * @return testPlansIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getTestPlansIds() {
    return testPlansIds;
  }

  public void setTestPlansIds(Set<UUID> testPlansIds) {
    this.testPlansIds = testPlansIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectExportWithTestPlansPostModel projectExportWithTestPlansPostModel = (ProjectExportWithTestPlansPostModel) o;
    return Objects.equals(this.testPlansIds, projectExportWithTestPlansPostModel.testPlansIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testPlansIds);
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
    sb.append("class ProjectExportWithTestPlansPostModel {\n");
    sb.append("    testPlansIds: ").append(toIndentedString(testPlansIds)).append("\n");
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
    openapiFields.add("testPlansIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProjectExportWithTestPlansPostModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectExportWithTestPlansPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectExportWithTestPlansPostModel is not found in the empty JSON string", ProjectExportWithTestPlansPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectExportWithTestPlansPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectExportWithTestPlansPostModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("testPlansIds") != null && !jsonObj.get("testPlansIds").isJsonNull() && !jsonObj.get("testPlansIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlansIds` to be an array in the JSON string but got `%s`", jsonObj.get("testPlansIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectExportWithTestPlansPostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectExportWithTestPlansPostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectExportWithTestPlansPostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectExportWithTestPlansPostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectExportWithTestPlansPostModel>() {
           @Override
           public void write(JsonWriter out, ProjectExportWithTestPlansPostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectExportWithTestPlansPostModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectExportWithTestPlansPostModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectExportWithTestPlansPostModel
  * @throws IOException if the JSON string is invalid with respect to ProjectExportWithTestPlansPostModel
  */
  public static ProjectExportWithTestPlansPostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectExportWithTestPlansPostModel.class);
  }

 /**
  * Convert an instance of ProjectExportWithTestPlansPostModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

