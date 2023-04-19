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
 * TestRunFillByConfigurationsPostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunFillByConfigurationsPostModel {
  public static final String SERIALIZED_NAME_TEST_POINT_SELECTORS = "testPointSelectors";
  @SerializedName(SERIALIZED_NAME_TEST_POINT_SELECTORS)
  private List<TestPointSelector> testPointSelectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LAUNCH_SOURCE = "launchSource";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SOURCE)
  private String launchSource;

  public TestRunFillByConfigurationsPostModel() {
  }

  public TestRunFillByConfigurationsPostModel testPointSelectors(List<TestPointSelector> testPointSelectors) {
    
    this.testPointSelectors = testPointSelectors;
    return this;
  }

  public TestRunFillByConfigurationsPostModel addTestPointSelectorsItem(TestPointSelector testPointSelectorsItem) {
    this.testPointSelectors.add(testPointSelectorsItem);
    return this;
  }

   /**
   * Specifies an array of work items and configuration to create a test run for.
   * @return testPointSelectors
  **/
  @javax.annotation.Nonnull

  public List<TestPointSelector> getTestPointSelectors() {
    return testPointSelectors;
  }


  public void setTestPointSelectors(List<TestPointSelector> testPointSelectors) {
    this.testPointSelectors = testPointSelectors;
  }


  public TestRunFillByConfigurationsPostModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Specifies the GUID of the project, in which a test run will be created.
   * @return projectId
  **/
  @javax.annotation.Nonnull

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunFillByConfigurationsPostModel testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Specifies the GUID of the test plan, within which the test run will be created.
   * @return testPlanId
  **/
  @javax.annotation.Nonnull

  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestRunFillByConfigurationsPostModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the test run.
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestRunFillByConfigurationsPostModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies the test run description.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestRunFillByConfigurationsPostModel launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Specifies the test run launch source.
   * @return launchSource
  **/
  @javax.annotation.Nullable

  public String getLaunchSource() {
    return launchSource;
  }


  public void setLaunchSource(String launchSource) {
    this.launchSource = launchSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunFillByConfigurationsPostModel testRunFillByConfigurationsPostModel = (TestRunFillByConfigurationsPostModel) o;
    return Objects.equals(this.testPointSelectors, testRunFillByConfigurationsPostModel.testPointSelectors) &&
        Objects.equals(this.projectId, testRunFillByConfigurationsPostModel.projectId) &&
        Objects.equals(this.testPlanId, testRunFillByConfigurationsPostModel.testPlanId) &&
        Objects.equals(this.name, testRunFillByConfigurationsPostModel.name) &&
        Objects.equals(this.description, testRunFillByConfigurationsPostModel.description) &&
        Objects.equals(this.launchSource, testRunFillByConfigurationsPostModel.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testPointSelectors, projectId, testPlanId, name, description, launchSource);
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
    sb.append("class TestRunFillByConfigurationsPostModel {\n");
    sb.append("    testPointSelectors: ").append(toIndentedString(testPointSelectors)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
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
    openapiFields.add("testPointSelectors");
    openapiFields.add("projectId");
    openapiFields.add("testPlanId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("launchSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("testPointSelectors");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("testPlanId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunFillByConfigurationsPostModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunFillByConfigurationsPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunFillByConfigurationsPostModel is not found in the empty JSON string", TestRunFillByConfigurationsPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunFillByConfigurationsPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunFillByConfigurationsPostModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestRunFillByConfigurationsPostModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("testPointSelectors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPointSelectors` to be an array in the JSON string but got `%s`", jsonObj.get("testPointSelectors").toString()));
      }

      JsonArray jsonArraytestPointSelectors = jsonObj.getAsJsonArray("testPointSelectors");
      // validate the required field `testPointSelectors` (array)
      for (int i = 0; i < jsonArraytestPointSelectors.size(); i++) {
        TestPointSelector.validateJsonObject(jsonArraytestPointSelectors.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("launchSource") != null && !jsonObj.get("launchSource").isJsonNull()) && !jsonObj.get("launchSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `launchSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("launchSource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestRunFillByConfigurationsPostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunFillByConfigurationsPostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunFillByConfigurationsPostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunFillByConfigurationsPostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunFillByConfigurationsPostModel>() {
           @Override
           public void write(JsonWriter out, TestRunFillByConfigurationsPostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunFillByConfigurationsPostModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunFillByConfigurationsPostModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunFillByConfigurationsPostModel
  * @throws IOException if the JSON string is invalid with respect to TestRunFillByConfigurationsPostModel
  */
  public static TestRunFillByConfigurationsPostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunFillByConfigurationsPostModel.class);
  }

 /**
  * Convert an instance of TestRunFillByConfigurationsPostModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

