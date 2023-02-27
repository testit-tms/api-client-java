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
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * TestRunV2GetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunV2GetModel {
  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

  public static final String SERIALIZED_NAME_STATE_NAME = "stateName";
  @SerializedName(SERIALIZED_NAME_STATE_NAME)
  private TestRunState stateName;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_TEST_RESULTS = "testResults";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS)
  private List<TestResultV2GetModel> testResults = null;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_CREATED_BY_USER_NAME = "createdByUserName";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_NAME)
  private String createdByUserName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LAUNCH_SOURCE = "launchSource";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SOURCE)
  private String launchSource;

  public TestRunV2GetModel() {
  }

  public TestRunV2GetModel startedOn(OffsetDateTime startedOn) {
    
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "")

  public OffsetDateTime getStartedOn() {
    return startedOn;
  }


  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public TestRunV2GetModel completedOn(OffsetDateTime completedOn) {
    
    this.completedOn = completedOn;
    return this;
  }

   /**
   * Get completedOn
   * @return completedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "")

  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }


  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public TestRunV2GetModel stateName(TestRunState stateName) {
    
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestRunState getStateName() {
    return stateName;
  }


  public void setStateName(TestRunState stateName) {
    this.stateName = stateName;
  }


  public TestRunV2GetModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link test run with project
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "This property is used to link test run with project")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunV2GetModel testPlanId(UUID testPlanId) {
    
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * This property is used to link test run with test plan
   * @return testPlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "This property is used to link test run with test plan")

  public UUID getTestPlanId() {
    return testPlanId;
  }


  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestRunV2GetModel testResults(List<TestResultV2GetModel> testResults) {
    
    this.testResults = testResults;
    return this;
  }

  public TestRunV2GetModel addTestResultsItem(TestResultV2GetModel testResultsItem) {
    if (this.testResults == null) {
      this.testResults = new ArrayList<>();
    }
    this.testResults.add(testResultsItem);
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TestResultV2GetModel> getTestResults() {
    return testResults;
  }


  public void setTestResults(List<TestResultV2GetModel> testResults) {
    this.testResults = testResults;
  }


  public TestRunV2GetModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestRunV2GetModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestRunV2GetModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestRunV2GetModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public TestRunV2GetModel createdByUserName(String createdByUserName) {
    
    this.createdByUserName = createdByUserName;
    return this;
  }

   /**
   * Get createdByUserName
   * @return createdByUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example", value = "")

  public String getCreatedByUserName() {
    return createdByUserName;
  }


  public void setCreatedByUserName(String createdByUserName) {
    this.createdByUserName = createdByUserName;
  }


  public TestRunV2GetModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestRunV2GetModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "First run", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestRunV2GetModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestRunV2GetModel launchSource(String launchSource) {
    
    this.launchSource = launchSource;
    return this;
  }

   /**
   * Once launch source is specified it cannot be updated
   * @return launchSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "By user via API", value = "Once launch source is specified it cannot be updated")

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
    TestRunV2GetModel testRunV2GetModel = (TestRunV2GetModel) o;
    return Objects.equals(this.startedOn, testRunV2GetModel.startedOn) &&
        Objects.equals(this.completedOn, testRunV2GetModel.completedOn) &&
        Objects.equals(this.stateName, testRunV2GetModel.stateName) &&
        Objects.equals(this.projectId, testRunV2GetModel.projectId) &&
        Objects.equals(this.testPlanId, testRunV2GetModel.testPlanId) &&
        Objects.equals(this.testResults, testRunV2GetModel.testResults) &&
        Objects.equals(this.createdDate, testRunV2GetModel.createdDate) &&
        Objects.equals(this.modifiedDate, testRunV2GetModel.modifiedDate) &&
        Objects.equals(this.createdById, testRunV2GetModel.createdById) &&
        Objects.equals(this.modifiedById, testRunV2GetModel.modifiedById) &&
        Objects.equals(this.createdByUserName, testRunV2GetModel.createdByUserName) &&
        Objects.equals(this.id, testRunV2GetModel.id) &&
        Objects.equals(this.name, testRunV2GetModel.name) &&
        Objects.equals(this.description, testRunV2GetModel.description) &&
        Objects.equals(this.launchSource, testRunV2GetModel.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedOn, completedOn, stateName, projectId, testPlanId, testResults, createdDate, modifiedDate, createdById, modifiedById, createdByUserName, id, name, description, launchSource);
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
    sb.append("class TestRunV2GetModel {\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdByUserName: ").append(toIndentedString(createdByUserName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("stateName");
    openapiFields.add("projectId");
    openapiFields.add("testPlanId");
    openapiFields.add("testResults");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("createdByUserName");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("launchSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunV2GetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunV2GetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunV2GetModel is not found in the empty JSON string", TestRunV2GetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunV2GetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunV2GetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestRunV2GetModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("testPlanId") != null && !jsonObj.get("testPlanId").isJsonNull()) && !jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if (jsonObj.get("testResults") != null && !jsonObj.get("testResults").isJsonNull()) {
        JsonArray jsonArraytestResults = jsonObj.getAsJsonArray("testResults");
        if (jsonArraytestResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("testResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `testResults` to be an array in the JSON string but got `%s`", jsonObj.get("testResults").toString()));
          }

          // validate the optional field `testResults` (array)
          for (int i = 0; i < jsonArraytestResults.size(); i++) {
            TestResultV2GetModel.validateJsonObject(jsonArraytestResults.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if ((jsonObj.get("createdByUserName") != null && !jsonObj.get("createdByUserName").isJsonNull()) && !jsonObj.get("createdByUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdByUserName").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
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
       if (!TestRunV2GetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunV2GetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunV2GetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunV2GetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunV2GetModel>() {
           @Override
           public void write(JsonWriter out, TestRunV2GetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunV2GetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunV2GetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunV2GetModel
  * @throws IOException if the JSON string is invalid with respect to TestRunV2GetModel
  */
  public static TestRunV2GetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunV2GetModel.class);
  }

 /**
  * Convert an instance of TestRunV2GetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

