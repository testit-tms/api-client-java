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
import ru.testit.client.model.CustomAttributeOptionModel;
import ru.testit.client.model.CustomAttributeTypesEnum;

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
 * CustomAttributeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CustomAttributeModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<CustomAttributeOptionModel> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CustomAttributeTypesEnum type;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_IS_GLOBAL = "isGlobal";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL)
  private Boolean isGlobal;

  public static final String SERIALIZED_WORKITEM_USAGE = "workItemUsage";
  @SerializedName(SERIALIZED_WORKITEM_USAGE)
  private List<ProjectShortestModel> workItemUsage = new ArrayList<>();

  public static final String SERIALIZED_TESTPLAN_USAGE = "testPlanUsage";
  @SerializedName(SERIALIZED_TESTPLAN_USAGE)
  private List<ProjectShortestModel> testPlanUsage = new ArrayList<>();

  public CustomAttributeModel() {
  }

  public CustomAttributeModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the attribute
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public CustomAttributeModel options(List<CustomAttributeOptionModel> options) {
    this.options = options;
    return this;
  }

  public CustomAttributeModel addOptionsItem(CustomAttributeOptionModel optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Collection of the attribute options   Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only
   * @return options
   */
  @javax.annotation.Nonnull
  public List<CustomAttributeOptionModel> getOptions() {
    return options;
  }

  public void setOptions(List<CustomAttributeOptionModel> options) {
    this.options = options;
  }


  public CustomAttributeModel type(CustomAttributeTypesEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the attribute
   * @return type
   */
  @javax.annotation.Nonnull
  public CustomAttributeTypesEnum getType() {
    return type;
  }

  public void setType(CustomAttributeTypesEnum type) {
    this.type = type;
  }


  public CustomAttributeModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Indicates if the attribute is deleted
   * @return isDeleted
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public CustomAttributeModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the attribute
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CustomAttributeModel isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Indicates if the attribute is enabled
   * @return isEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public CustomAttributeModel isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Indicates if the attribute value is mandatory to specify
   * @return isRequired
   */
  @javax.annotation.Nonnull
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public CustomAttributeModel isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

  /**
   * Indicates if the attribute is available across all projects
   * @return isGlobal
   */
  @javax.annotation.Nonnull
  public Boolean getIsGlobal() {
    return isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributeModel customAttributeModel = (CustomAttributeModel) o;
    return Objects.equals(this.id, customAttributeModel.id) &&
        Objects.equals(this.options, customAttributeModel.options) &&
        Objects.equals(this.type, customAttributeModel.type) &&
        Objects.equals(this.isDeleted, customAttributeModel.isDeleted) &&
        Objects.equals(this.name, customAttributeModel.name) &&
        Objects.equals(this.isEnabled, customAttributeModel.isEnabled) &&
        Objects.equals(this.isRequired, customAttributeModel.isRequired) &&
        Objects.equals(this.isGlobal, customAttributeModel.isGlobal) &&
        Objects.equals(this.workItemUsage, customAttributeModel.workItemUsage) &&
        Objects.equals(this.testPlanUsage, customAttributeModel.testPlanUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, options, type, isDeleted, name, isEnabled, isRequired, isGlobal, testPlanUsage, workItemUsage);  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    testPlanUsage: ").append(toIndentedString(testPlanUsage)).append("\n");
    sb.append("    workItemUsage: ").append(toIndentedString(workItemUsage)).append("\n");
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
    openapiFields.add("options");
    openapiFields.add("type");
    openapiFields.add("isDeleted");
    openapiFields.add("name");
    openapiFields.add("isEnabled");
    openapiFields.add("isRequired");
    openapiFields.add("isGlobal");
    openapiFields.add("workItemUsage");
    openapiFields.add("testPlanUsage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("options");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("isEnabled");
    openapiRequiredFields.add("isRequired");
    openapiRequiredFields.add("isGlobal");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomAttributeModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomAttributeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomAttributeModel is not found in the empty JSON string", CustomAttributeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomAttributeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomAttributeModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomAttributeModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }

      JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
      // validate the required field `options` (array)
      for (int i = 0; i < jsonArrayoptions.size(); i++) {
        CustomAttributeOptionModel.validateJsonElement(jsonArrayoptions.get(i));
      };
      // validate the required field `type`
      CustomAttributeTypesEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomAttributeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomAttributeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomAttributeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomAttributeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomAttributeModel>() {
           @Override
           public void write(JsonWriter out, CustomAttributeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomAttributeModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomAttributeModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomAttributeModel
   * @throws IOException if the JSON string is invalid with respect to CustomAttributeModel
   */
  public static CustomAttributeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomAttributeModel.class);
  }

  /**
   * Convert an instance of CustomAttributeModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

