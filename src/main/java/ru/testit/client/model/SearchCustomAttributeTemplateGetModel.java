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
import ru.testit.client.model.ProjectShortestModel;

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
 * SearchCustomAttributeTemplateGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class SearchCustomAttributeTemplateGetModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_SHORTEST_MODELS = "projectShortestModels";
  @SerializedName(SERIALIZED_NAME_PROJECT_SHORTEST_MODELS)
  private List<ProjectShortestModel> projectShortestModels = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTE_MODELS = "customAttributeModels";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTE_MODELS)
  private List<CustomAttributeModel> customAttributeModels = new ArrayList<>();

  public SearchCustomAttributeTemplateGetModel() {
  }

  public SearchCustomAttributeTemplateGetModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public SearchCustomAttributeTemplateGetModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public SearchCustomAttributeTemplateGetModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SearchCustomAttributeTemplateGetModel projectShortestModels(List<ProjectShortestModel> projectShortestModels) {
    this.projectShortestModels = projectShortestModels;
    return this;
  }

  public SearchCustomAttributeTemplateGetModel addProjectShortestModelsItem(ProjectShortestModel projectShortestModelsItem) {
    if (this.projectShortestModels == null) {
      this.projectShortestModels = new ArrayList<>();
    }
    this.projectShortestModels.add(projectShortestModelsItem);
    return this;
  }

  /**
   * Get projectShortestModels
   * @return projectShortestModels
   */
  @javax.annotation.Nonnull
  public List<ProjectShortestModel> getProjectShortestModels() {
    return projectShortestModels;
  }

  public void setProjectShortestModels(List<ProjectShortestModel> projectShortestModels) {
    this.projectShortestModels = projectShortestModels;
  }


  public SearchCustomAttributeTemplateGetModel customAttributeModels(List<CustomAttributeModel> customAttributeModels) {
    this.customAttributeModels = customAttributeModels;
    return this;
  }

  public SearchCustomAttributeTemplateGetModel addCustomAttributeModelsItem(CustomAttributeModel customAttributeModelsItem) {
    if (this.customAttributeModels == null) {
      this.customAttributeModels = new ArrayList<>();
    }
    this.customAttributeModels.add(customAttributeModelsItem);
    return this;
  }

  /**
   * Get customAttributeModels
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
    SearchCustomAttributeTemplateGetModel searchCustomAttributeTemplateGetModel = (SearchCustomAttributeTemplateGetModel) o;
    return Objects.equals(this.id, searchCustomAttributeTemplateGetModel.id) &&
        Objects.equals(this.isDeleted, searchCustomAttributeTemplateGetModel.isDeleted) &&
        Objects.equals(this.name, searchCustomAttributeTemplateGetModel.name) &&
        Objects.equals(this.projectShortestModels, searchCustomAttributeTemplateGetModel.projectShortestModels) &&
        Objects.equals(this.customAttributeModels, searchCustomAttributeTemplateGetModel.customAttributeModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isDeleted, name, projectShortestModels, customAttributeModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCustomAttributeTemplateGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectShortestModels: ").append(toIndentedString(projectShortestModels)).append("\n");
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
    openapiFields.add("projectShortestModels");
    openapiFields.add("customAttributeModels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("projectShortestModels");
    openapiRequiredFields.add("customAttributeModels");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchCustomAttributeTemplateGetModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchCustomAttributeTemplateGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchCustomAttributeTemplateGetModel is not found in the empty JSON string", SearchCustomAttributeTemplateGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchCustomAttributeTemplateGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchCustomAttributeTemplateGetModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchCustomAttributeTemplateGetModel.openapiRequiredFields) {
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
      if (!jsonObj.get("projectShortestModels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectShortestModels` to be an array in the JSON string but got `%s`", jsonObj.get("projectShortestModels").toString()));
      }

      JsonArray jsonArrayprojectShortestModels = jsonObj.getAsJsonArray("projectShortestModels");
      // validate the required field `projectShortestModels` (array)
      for (int i = 0; i < jsonArrayprojectShortestModels.size(); i++) {
        ProjectShortestModel.validateJsonElement(jsonArrayprojectShortestModels.get(i));
      };
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
       if (!SearchCustomAttributeTemplateGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchCustomAttributeTemplateGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchCustomAttributeTemplateGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchCustomAttributeTemplateGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchCustomAttributeTemplateGetModel>() {
           @Override
           public void write(JsonWriter out, SearchCustomAttributeTemplateGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchCustomAttributeTemplateGetModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchCustomAttributeTemplateGetModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchCustomAttributeTemplateGetModel
   * @throws IOException if the JSON string is invalid with respect to SearchCustomAttributeTemplateGetModel
   */
  public static SearchCustomAttributeTemplateGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchCustomAttributeTemplateGetModel.class);
  }

  /**
   * Convert an instance of SearchCustomAttributeTemplateGetModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

