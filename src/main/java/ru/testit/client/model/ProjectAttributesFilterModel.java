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
import org.openapitools.jackson.nullable.JsonNullable;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * ProjectAttributesFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectAttributesFilterModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_IS_GLOBAL = "isGlobal";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL)
  private Boolean isGlobal;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private Set<CustomAttributeTypesEnum> types;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public ProjectAttributesFilterModel() {
  }

  public ProjectAttributesFilterModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies an attribute name to search for
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectAttributesFilterModel isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Specifies an attribute mandatory status to search for
   * @return isRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public ProjectAttributesFilterModel isGlobal(Boolean isGlobal) {
    
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * Specifies an attribute global status to search for
   * @return isGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getIsGlobal() {
    return isGlobal;
  }


  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  public ProjectAttributesFilterModel types(Set<CustomAttributeTypesEnum> types) {
    
    this.types = types;
    return this;
  }

  public ProjectAttributesFilterModel addTypesItem(CustomAttributeTypesEnum typesItem) {
    if (this.types == null) {
      this.types = new LinkedHashSet<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Specifies an attribute types to search for
   * @return types
  **/
  @javax.annotation.Nullable
  public Set<CustomAttributeTypesEnum> getTypes() {
    return types;
  }


  public void setTypes(Set<CustomAttributeTypesEnum> types) {
    this.types = types;
  }


  public ProjectAttributesFilterModel isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Specifies an attribute enabled status to search for
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectAttributesFilterModel projectAttributesFilterModel = (ProjectAttributesFilterModel) o;
    return Objects.equals(this.name, projectAttributesFilterModel.name) &&
        Objects.equals(this.isRequired, projectAttributesFilterModel.isRequired) &&
        Objects.equals(this.isGlobal, projectAttributesFilterModel.isGlobal) &&
        Objects.equals(this.types, projectAttributesFilterModel.types) &&
        Objects.equals(this.isEnabled, projectAttributesFilterModel.isEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isRequired, isGlobal, types, isEnabled);
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
    sb.append("class ProjectAttributesFilterModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("isRequired");
    openapiFields.add("isGlobal");
    openapiFields.add("types");
    openapiFields.add("isEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectAttributesFilterModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectAttributesFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectAttributesFilterModel is not found in the empty JSON string", ProjectAttributesFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectAttributesFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectAttributesFilterModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectAttributesFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectAttributesFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectAttributesFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectAttributesFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectAttributesFilterModel>() {
           @Override
           public void write(JsonWriter out, ProjectAttributesFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectAttributesFilterModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectAttributesFilterModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectAttributesFilterModel
  * @throws IOException if the JSON string is invalid with respect to ProjectAttributesFilterModel
  */
  public static ProjectAttributesFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectAttributesFilterModel.class);
  }

 /**
  * Convert an instance of ProjectAttributesFilterModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

