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
import java.util.HashMap;
import java.util.Map;
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
 * CreateConfigurationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateConfigurationRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CreateConfigurationRequest() {
  }

  public CreateConfigurationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateConfigurationRequest parameters(Map<String, String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public CreateConfigurationRequest putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nonnull
  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public CreateConfigurationRequest projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link configuration with project
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public CreateConfigurationRequest isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public CreateConfigurationRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfigurationRequest createConfigurationRequest = (CreateConfigurationRequest) o;
    return Objects.equals(this.description, createConfigurationRequest.description) &&
        Objects.equals(this.parameters, createConfigurationRequest.parameters) &&
        Objects.equals(this.projectId, createConfigurationRequest.projectId) &&
        Objects.equals(this.isDefault, createConfigurationRequest.isDefault) &&
        Objects.equals(this.name, createConfigurationRequest.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, parameters, projectId, isDefault, name);
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
    sb.append("class CreateConfigurationRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("parameters");
    openapiFields.add("projectId");
    openapiFields.add("isDefault");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parameters");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateConfigurationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateConfigurationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConfigurationRequest is not found in the empty JSON string", CreateConfigurationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateConfigurationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConfigurationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateConfigurationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConfigurationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConfigurationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConfigurationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConfigurationRequest>() {
           @Override
           public void write(JsonWriter out, CreateConfigurationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConfigurationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateConfigurationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateConfigurationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateConfigurationRequest
  */
  public static CreateConfigurationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConfigurationRequest.class);
  }

 /**
  * Convert an instance of CreateConfigurationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

