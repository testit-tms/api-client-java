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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

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
 * ApiV2ConfigurationsCreateByParametersPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2ConfigurationsCreateByParametersPostRequest {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_PARAMETER_IDS = "parameterIds";
  @SerializedName(SERIALIZED_NAME_PARAMETER_IDS)
  private Set<UUID> parameterIds = new LinkedHashSet<>();

  public ApiV2ConfigurationsCreateByParametersPostRequest() {
  }

  public ApiV2ConfigurationsCreateByParametersPostRequest projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link configuration with project
   * @return projectId
  **/
  @javax.annotation.Nullable
  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public ApiV2ConfigurationsCreateByParametersPostRequest parameterIds(Set<UUID> parameterIds) {
    
    this.parameterIds = parameterIds;
    return this;
  }

  public ApiV2ConfigurationsCreateByParametersPostRequest addParameterIdsItem(UUID parameterIdsItem) {
    if (this.parameterIds == null) {
      this.parameterIds = new LinkedHashSet<>();
    }
    this.parameterIds.add(parameterIdsItem);
    return this;
  }

   /**
   * Get parameterIds
   * @return parameterIds
  **/
  @javax.annotation.Nonnull
  public Set<UUID> getParameterIds() {
    return parameterIds;
  }


  public void setParameterIds(Set<UUID> parameterIds) {
    this.parameterIds = parameterIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2ConfigurationsCreateByParametersPostRequest apiV2ConfigurationsCreateByParametersPostRequest = (ApiV2ConfigurationsCreateByParametersPostRequest) o;
    return Objects.equals(this.projectId, apiV2ConfigurationsCreateByParametersPostRequest.projectId) &&
        Objects.equals(this.parameterIds, apiV2ConfigurationsCreateByParametersPostRequest.parameterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, parameterIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2ConfigurationsCreateByParametersPostRequest {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    parameterIds: ").append(toIndentedString(parameterIds)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("parameterIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parameterIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2ConfigurationsCreateByParametersPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2ConfigurationsCreateByParametersPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2ConfigurationsCreateByParametersPostRequest is not found in the empty JSON string", ApiV2ConfigurationsCreateByParametersPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2ConfigurationsCreateByParametersPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2ConfigurationsCreateByParametersPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV2ConfigurationsCreateByParametersPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("parameterIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("parameterIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameterIds` to be an array in the JSON string but got `%s`", jsonObj.get("parameterIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2ConfigurationsCreateByParametersPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2ConfigurationsCreateByParametersPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2ConfigurationsCreateByParametersPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2ConfigurationsCreateByParametersPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2ConfigurationsCreateByParametersPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2ConfigurationsCreateByParametersPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2ConfigurationsCreateByParametersPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2ConfigurationsCreateByParametersPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2ConfigurationsCreateByParametersPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2ConfigurationsCreateByParametersPostRequest
  */
  public static ApiV2ConfigurationsCreateByParametersPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2ConfigurationsCreateByParametersPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2ConfigurationsCreateByParametersPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

