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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectExportWithTestPlansPostModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectExportWithTestPlansPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectExportWithTestPlansPostModel is not found in the empty JSON string", ProjectExportWithTestPlansPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectExportWithTestPlansPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectExportWithTestPlansPostModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testPlansIds") != null && !jsonObj.get("testPlansIds").isJsonArray()) {
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

