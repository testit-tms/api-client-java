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
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * TestRunFillByWorkItemsPostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunFillByWorkItemsPostModel {
  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private List<UUID> configurationIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKITEM_IDS = "workitemIds";
  @SerializedName(SERIALIZED_NAME_WORKITEM_IDS)
  private List<UUID> workitemIds = new ArrayList<>();

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

  public TestRunFillByWorkItemsPostModel() {
  }

  public TestRunFillByWorkItemsPostModel configurationIds(List<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public TestRunFillByWorkItemsPostModel addConfigurationIdsItem(UUID configurationIdsItem) {
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs.
   * @return configurationIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs.")

  public List<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public TestRunFillByWorkItemsPostModel workitemIds(List<UUID> workitemIds) {
    
    this.workitemIds = workitemIds;
    return this;
  }

  public TestRunFillByWorkItemsPostModel addWorkitemIdsItem(UUID workitemIdsItem) {
    this.workitemIds.add(workitemIdsItem);
    return this;
  }

   /**
   * Specifies the work item GUIDs, from which test points are created. You can specify several GUIDs.
   * @return workitemIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the work item GUIDs, from which test points are created. You can specify several GUIDs.")

  public List<UUID> getWorkitemIds() {
    return workitemIds;
  }


  public void setWorkitemIds(List<UUID> workitemIds) {
    this.workitemIds = workitemIds;
  }


  public TestRunFillByWorkItemsPostModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Specifies the GUID of the project, in which a test run will be created.
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the GUID of the project, in which a test run will be created.")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunFillByWorkItemsPostModel testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Specifies the GUID of the test plan, within which the test run will be created.
   * @return testPlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the GUID of the test plan, within which the test run will be created.")

  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestRunFillByWorkItemsPostModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the test run.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the test run.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestRunFillByWorkItemsPostModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies the test run description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the test run description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestRunFillByWorkItemsPostModel launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Specifies the test run launch source.
   * @return launchSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the test run launch source.")

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
    TestRunFillByWorkItemsPostModel testRunFillByWorkItemsPostModel = (TestRunFillByWorkItemsPostModel) o;
    return Objects.equals(this.configurationIds, testRunFillByWorkItemsPostModel.configurationIds) &&
        Objects.equals(this.workitemIds, testRunFillByWorkItemsPostModel.workitemIds) &&
        Objects.equals(this.projectId, testRunFillByWorkItemsPostModel.projectId) &&
        Objects.equals(this.testPlanId, testRunFillByWorkItemsPostModel.testPlanId) &&
        Objects.equals(this.name, testRunFillByWorkItemsPostModel.name) &&
        Objects.equals(this.description, testRunFillByWorkItemsPostModel.description) &&
        Objects.equals(this.launchSource, testRunFillByWorkItemsPostModel.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIds, workitemIds, projectId, testPlanId, name, description, launchSource);
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
    sb.append("class TestRunFillByWorkItemsPostModel {\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    workitemIds: ").append(toIndentedString(workitemIds)).append("\n");
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
    openapiFields.add("configurationIds");
    openapiFields.add("workitemIds");
    openapiFields.add("projectId");
    openapiFields.add("testPlanId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("launchSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configurationIds");
    openapiRequiredFields.add("workitemIds");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("testPlanId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunFillByWorkItemsPostModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunFillByWorkItemsPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunFillByWorkItemsPostModel is not found in the empty JSON string", TestRunFillByWorkItemsPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunFillByWorkItemsPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunFillByWorkItemsPostModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestRunFillByWorkItemsPostModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("configurationIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("configurationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIds` to be an array in the JSON string but got `%s`", jsonObj.get("configurationIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("workitemIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("workitemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workitemIds` to be an array in the JSON string but got `%s`", jsonObj.get("workitemIds").toString()));
      }
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
       if (!TestRunFillByWorkItemsPostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunFillByWorkItemsPostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunFillByWorkItemsPostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunFillByWorkItemsPostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunFillByWorkItemsPostModel>() {
           @Override
           public void write(JsonWriter out, TestRunFillByWorkItemsPostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunFillByWorkItemsPostModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunFillByWorkItemsPostModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunFillByWorkItemsPostModel
  * @throws IOException if the JSON string is invalid with respect to TestRunFillByWorkItemsPostModel
  */
  public static TestRunFillByWorkItemsPostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunFillByWorkItemsPostModel.class);
  }

 /**
  * Convert an instance of TestRunFillByWorkItemsPostModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

