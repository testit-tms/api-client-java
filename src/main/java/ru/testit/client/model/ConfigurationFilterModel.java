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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * ConfigurationFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ConfigurationFilterModel {
  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds;

  public ConfigurationFilterModel() {
  }

  public ConfigurationFilterModel projectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public ConfigurationFilterModel addProjectIdsItem(UUID projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new LinkedHashSet<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * Collection of identifiers of projects from which configurations will be taken
   * @return projectIds
   */
  @javax.annotation.Nullable
  public Set<UUID> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public ConfigurationFilterModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Filter to search by name (case-insensitive, partial match)
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ConfigurationFilterModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Is configurations deleted or existing
   * @return isDeleted
   */
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ConfigurationFilterModel globalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
    return this;
  }

  public ConfigurationFilterModel addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null) {
      this.globalIds = new LinkedHashSet<>();
    }
    this.globalIds.add(globalIdsItem);
    return this;
  }

  /**
   * Collection of global (integer) identifiers to filter configurations
   * @return globalIds
   */
  @javax.annotation.Nullable
  public Set<Long> getGlobalIds() {
    return globalIds;
  }

  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationFilterModel configurationFilterModel = (ConfigurationFilterModel) o;
    return Objects.equals(this.projectIds, configurationFilterModel.projectIds) &&
        Objects.equals(this.name, configurationFilterModel.name) &&
        Objects.equals(this.isDeleted, configurationFilterModel.isDeleted) &&
        Objects.equals(this.globalIds, configurationFilterModel.globalIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, name, isDeleted, globalIds);
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
    sb.append("class ConfigurationFilterModel {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
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
    openapiFields.add("projectIds");
    openapiFields.add("name");
    openapiFields.add("isDeleted");
    openapiFields.add("globalIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConfigurationFilterModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigurationFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationFilterModel is not found in the empty JSON string", ConfigurationFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigurationFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigurationFilterModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull() && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("globalIds") != null && !jsonObj.get("globalIds").isJsonNull() && !jsonObj.get("globalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalIds` to be an array in the JSON string but got `%s`", jsonObj.get("globalIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurationFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationFilterModel>() {
           @Override
           public void write(JsonWriter out, ConfigurationFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationFilterModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConfigurationFilterModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConfigurationFilterModel
   * @throws IOException if the JSON string is invalid with respect to ConfigurationFilterModel
   */
  public static ConfigurationFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationFilterModel.class);
  }

  /**
   * Convert an instance of ConfigurationFilterModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

