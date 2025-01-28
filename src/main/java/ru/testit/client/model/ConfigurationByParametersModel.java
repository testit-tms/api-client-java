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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * ConfigurationByParametersModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ConfigurationByParametersModel {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  @javax.annotation.Nonnull
  private UUID projectId;

  public static final String SERIALIZED_NAME_PARAMETER_IDS = "parameterIds";
  @SerializedName(SERIALIZED_NAME_PARAMETER_IDS)
  @javax.annotation.Nonnull
  private Set<UUID> parameterIds = new LinkedHashSet<>();

  public ConfigurationByParametersModel() {
  }

  public ConfigurationByParametersModel projectId(@javax.annotation.Nonnull UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * This property is used to link configuration with project
   * @return projectId
   */
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(@javax.annotation.Nonnull UUID projectId) {
    this.projectId = projectId;
  }


  public ConfigurationByParametersModel parameterIds(@javax.annotation.Nonnull Set<UUID> parameterIds) {
    this.parameterIds = parameterIds;
    return this;
  }

  public ConfigurationByParametersModel addParameterIdsItem(UUID parameterIdsItem) {
    if (this.parameterIds == null) {
      this.parameterIds = new LinkedHashSet<>();
    }
    this.parameterIds.add(parameterIdsItem);
    return this;
  }

  /**
   * Get parameterIds
   * @return parameterIds
   */
  @javax.annotation.Nonnull
  public Set<UUID> getParameterIds() {
    return parameterIds;
  }

  public void setParameterIds(@javax.annotation.Nonnull Set<UUID> parameterIds) {
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
    ConfigurationByParametersModel configurationByParametersModel = (ConfigurationByParametersModel) o;
    return Objects.equals(this.projectId, configurationByParametersModel.projectId) &&
        Objects.equals(this.parameterIds, configurationByParametersModel.parameterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, parameterIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationByParametersModel {\n");
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
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("parameterIds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigurationByParametersModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigurationByParametersModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationByParametersModel is not found in the empty JSON string", ConfigurationByParametersModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigurationByParametersModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurationByParametersModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfigurationByParametersModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
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
       if (!ConfigurationByParametersModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationByParametersModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationByParametersModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationByParametersModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationByParametersModel>() {
           @Override
           public void write(JsonWriter out, ConfigurationByParametersModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationByParametersModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigurationByParametersModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigurationByParametersModel
   * @throws IOException if the JSON string is invalid with respect to ConfigurationByParametersModel
   */
  public static ConfigurationByParametersModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationByParametersModel.class);
  }

  /**
   * Convert an instance of ConfigurationByParametersModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

