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
 * CustomAttributeTemplatePostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributeTemplatePostModel {
  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTE_IDS = "customAttributeIds";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTE_IDS)
  private Set<UUID> customAttributeIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CustomAttributeTemplatePostModel() {
  }

  public CustomAttributeTemplatePostModel customAttributeIds(Set<UUID> customAttributeIds) {
    
    this.customAttributeIds = customAttributeIds;
    return this;
  }

  public CustomAttributeTemplatePostModel addCustomAttributeIdsItem(UUID customAttributeIdsItem) {
    if (this.customAttributeIds == null) {
      this.customAttributeIds = new LinkedHashSet<>();
    }
    this.customAttributeIds.add(customAttributeIdsItem);
    return this;
  }

   /**
   * Collection of attribute IDs
   * @return customAttributeIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getCustomAttributeIds() {
    return customAttributeIds;
  }


  public void setCustomAttributeIds(Set<UUID> customAttributeIds) {
    this.customAttributeIds = customAttributeIds;
  }


  public CustomAttributeTemplatePostModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Custom attributes template name
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
    CustomAttributeTemplatePostModel customAttributeTemplatePostModel = (CustomAttributeTemplatePostModel) o;
    return Objects.equals(this.customAttributeIds, customAttributeTemplatePostModel.customAttributeIds) &&
        Objects.equals(this.name, customAttributeTemplatePostModel.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributeIds, name);
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
    sb.append("class CustomAttributeTemplatePostModel {\n");
    sb.append("    customAttributeIds: ").append(toIndentedString(customAttributeIds)).append("\n");
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
    openapiFields.add("customAttributeIds");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomAttributeTemplatePostModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomAttributeTemplatePostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomAttributeTemplatePostModel is not found in the empty JSON string", CustomAttributeTemplatePostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomAttributeTemplatePostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomAttributeTemplatePostModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomAttributeTemplatePostModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("customAttributeIds") != null && !jsonObj.get("customAttributeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customAttributeIds` to be an array in the JSON string but got `%s`", jsonObj.get("customAttributeIds").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomAttributeTemplatePostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomAttributeTemplatePostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomAttributeTemplatePostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomAttributeTemplatePostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomAttributeTemplatePostModel>() {
           @Override
           public void write(JsonWriter out, CustomAttributeTemplatePostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomAttributeTemplatePostModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomAttributeTemplatePostModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomAttributeTemplatePostModel
  * @throws IOException if the JSON string is invalid with respect to CustomAttributeTemplatePostModel
  */
  public static CustomAttributeTemplatePostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomAttributeTemplatePostModel.class);
  }

 /**
  * Convert an instance of CustomAttributeTemplatePostModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

