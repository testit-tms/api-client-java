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
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * CreateAndFillByWorkItemsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAndFillByWorkItemsRequest {
  public static final String SERIALIZED_NAME_CONFIGURATION_IDS = "configurationIds";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_IDS)
  private List<UUID> configurationIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORK_ITEM_IDS = "workItemIds";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_IDS)
  private List<UUID> workItemIds = new ArrayList<>();

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

  public CreateAndFillByWorkItemsRequest() {
  }

  public CreateAndFillByWorkItemsRequest configurationIds(List<UUID> configurationIds) {
    
    this.configurationIds = configurationIds;
    return this;
  }

  public CreateAndFillByWorkItemsRequest addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null) {
      this.configurationIds = new ArrayList<>();
    }
    this.configurationIds.add(configurationIdsItem);
    return this;
  }

   /**
   * Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs.
   * @return configurationIds
  **/
  @javax.annotation.Nonnull
  public List<UUID> getConfigurationIds() {
    return configurationIds;
  }


  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = configurationIds;
  }


  public CreateAndFillByWorkItemsRequest workItemIds(List<UUID> workItemIds) {
    
    this.workItemIds = workItemIds;
    return this;
  }

  public CreateAndFillByWorkItemsRequest addWorkItemIdsItem(UUID workItemIdsItem) {
    if (this.workItemIds == null) {
      this.workItemIds = new ArrayList<>();
    }
    this.workItemIds.add(workItemIdsItem);
    return this;
  }

   /**
   * Specifies the work item GUIDs, from which test points are created. You can specify several GUIDs.
   * @return workItemIds
  **/
  @javax.annotation.Nonnull
  public List<UUID> getWorkItemIds() {
    return workItemIds;
  }


  public void setWorkItemIds(List<UUID> workItemIds) {
    this.workItemIds = workItemIds;
  }


  public CreateAndFillByWorkItemsRequest projectId(UUID projectId) {
    
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


  public CreateAndFillByWorkItemsRequest testPlanId(UUID testPlanId) {
    
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


  public CreateAndFillByWorkItemsRequest name(String name) {
    
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


  public CreateAndFillByWorkItemsRequest description(String description) {
    
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


  public CreateAndFillByWorkItemsRequest launchSource(String launchSource) {
    
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
    CreateAndFillByWorkItemsRequest createAndFillByWorkItemsRequest = (CreateAndFillByWorkItemsRequest) o;
    return Objects.equals(this.configurationIds, createAndFillByWorkItemsRequest.configurationIds) &&
        Objects.equals(this.workItemIds, createAndFillByWorkItemsRequest.workItemIds) &&
        Objects.equals(this.projectId, createAndFillByWorkItemsRequest.projectId) &&
        Objects.equals(this.testPlanId, createAndFillByWorkItemsRequest.testPlanId) &&
        Objects.equals(this.name, createAndFillByWorkItemsRequest.name) &&
        Objects.equals(this.description, createAndFillByWorkItemsRequest.description) &&
        Objects.equals(this.launchSource, createAndFillByWorkItemsRequest.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationIds, workItemIds, projectId, testPlanId, name, description, launchSource);
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
    sb.append("class CreateAndFillByWorkItemsRequest {\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    workItemIds: ").append(toIndentedString(workItemIds)).append("\n");
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
    openapiFields.add("workItemIds");
    openapiFields.add("projectId");
    openapiFields.add("testPlanId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("launchSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configurationIds");
    openapiRequiredFields.add("workItemIds");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("testPlanId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAndFillByWorkItemsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAndFillByWorkItemsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAndFillByWorkItemsRequest is not found in the empty JSON string", CreateAndFillByWorkItemsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAndFillByWorkItemsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAndFillByWorkItemsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAndFillByWorkItemsRequest.openapiRequiredFields) {
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
      if (jsonObj.get("workItemIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("workItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("workItemIds").toString()));
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
       if (!CreateAndFillByWorkItemsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAndFillByWorkItemsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAndFillByWorkItemsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAndFillByWorkItemsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAndFillByWorkItemsRequest>() {
           @Override
           public void write(JsonWriter out, CreateAndFillByWorkItemsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAndFillByWorkItemsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAndFillByWorkItemsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAndFillByWorkItemsRequest
  * @throws IOException if the JSON string is invalid with respect to CreateAndFillByWorkItemsRequest
  */
  public static CreateAndFillByWorkItemsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAndFillByWorkItemsRequest.class);
  }

 /**
  * Convert an instance of CreateAndFillByWorkItemsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

