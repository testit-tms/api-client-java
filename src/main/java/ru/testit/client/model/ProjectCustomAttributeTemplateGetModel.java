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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import ru.testit.client.model.CustomAttributeModel;

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
 * ProjectCustomAttributeTemplateGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ProjectCustomAttributeTemplateGetModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTE_MODELS = "customAttributeModels";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTE_MODELS)
  private List<CustomAttributeModel> customAttributeModels = new ArrayList<>();

  public ProjectCustomAttributeTemplateGetModel() {
  }

  public ProjectCustomAttributeTemplateGetModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the custom attributes template
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public ProjectCustomAttributeTemplateGetModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Indicates if the custom attribute template is deleted
   * @return isDeleted
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ProjectCustomAttributeTemplateGetModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the custom attribute template
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ProjectCustomAttributeTemplateGetModel customAttributeModels(List<CustomAttributeModel> customAttributeModels) {
    this.customAttributeModels = customAttributeModels;
    return this;
  }

  public ProjectCustomAttributeTemplateGetModel addCustomAttributeModelsItem(CustomAttributeModel customAttributeModelsItem) {
    if (this.customAttributeModels == null) {
      this.customAttributeModels = new ArrayList<>();
    }
    this.customAttributeModels.add(customAttributeModelsItem);
    return this;
  }

  /**
   * Attributes of the template
   * @return customAttributeModels
   */
  @javax.annotation.Nonnull
  public List<CustomAttributeModel> getCustomAttributeModels() {
    return customAttributeModels;
  }

  public void setCustomAttributeModels(List<CustomAttributeModel> customAttributeModels) {
    this.customAttributeModels = customAttributeModels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCustomAttributeTemplateGetModel projectCustomAttributeTemplateGetModel = (ProjectCustomAttributeTemplateGetModel) o;
    return Objects.equals(this.id, projectCustomAttributeTemplateGetModel.id) &&
        Objects.equals(this.isDeleted, projectCustomAttributeTemplateGetModel.isDeleted) &&
        Objects.equals(this.name, projectCustomAttributeTemplateGetModel.name) &&
        Objects.equals(this.customAttributeModels, projectCustomAttributeTemplateGetModel.customAttributeModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isDeleted, name, customAttributeModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCustomAttributeTemplateGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customAttributeModels: ").append(toIndentedString(customAttributeModels)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("isDeleted");
    openapiFields.add("name");
    openapiFields.add("customAttributeModels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("customAttributeModels");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectCustomAttributeTemplateGetModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectCustomAttributeTemplateGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectCustomAttributeTemplateGetModel is not found in the empty JSON string", ProjectCustomAttributeTemplateGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProjectCustomAttributeTemplateGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectCustomAttributeTemplateGetModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectCustomAttributeTemplateGetModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("customAttributeModels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customAttributeModels` to be an array in the JSON string but got `%s`", jsonObj.get("customAttributeModels").toString()));
      }

      JsonArray jsonArraycustomAttributeModels = jsonObj.getAsJsonArray("customAttributeModels");
      // validate the required field `customAttributeModels` (array)
      for (int i = 0; i < jsonArraycustomAttributeModels.size(); i++) {
        CustomAttributeModel.validateJsonElement(jsonArraycustomAttributeModels.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCustomAttributeTemplateGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCustomAttributeTemplateGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCustomAttributeTemplateGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCustomAttributeTemplateGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCustomAttributeTemplateGetModel>() {
           @Override
           public void write(JsonWriter out, ProjectCustomAttributeTemplateGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCustomAttributeTemplateGetModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProjectCustomAttributeTemplateGetModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectCustomAttributeTemplateGetModel
   * @throws IOException if the JSON string is invalid with respect to ProjectCustomAttributeTemplateGetModel
   */
  public static ProjectCustomAttributeTemplateGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCustomAttributeTemplateGetModel.class);
  }

  /**
   * Convert an instance of ProjectCustomAttributeTemplateGetModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

