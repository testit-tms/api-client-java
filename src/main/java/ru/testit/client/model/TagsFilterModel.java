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
import ru.testit.client.model.TagsFilterModelCreatedDate;

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
 * TagsFilterModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TagsFilterModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private TagsFilterModelCreatedDate createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public TagsFilterModel() {
  }

  public TagsFilterModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies a tag name to search for
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TagsFilterModel createdDate(TagsFilterModelCreatedDate createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public TagsFilterModelCreatedDate getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(TagsFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
  }


  public TagsFilterModel createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public TagsFilterModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Specifies a tag creator IDs to search for
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagsFilterModel tagsFilterModel = (TagsFilterModel) o;
    return Objects.equals(this.name, tagsFilterModel.name) &&
        Objects.equals(this.createdDate, tagsFilterModel.createdDate) &&
        Objects.equals(this.createdByIds, tagsFilterModel.createdByIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdDate, createdByIds);
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
    sb.append("class TagsFilterModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
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
    openapiFields.add("createdDate");
    openapiFields.add("createdByIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagsFilterModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagsFilterModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagsFilterModel is not found in the empty JSON string", TagsFilterModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TagsFilterModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TagsFilterModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        TagsFilterModelCreatedDate.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagsFilterModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagsFilterModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagsFilterModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagsFilterModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TagsFilterModel>() {
           @Override
           public void write(JsonWriter out, TagsFilterModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TagsFilterModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TagsFilterModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagsFilterModel
  * @throws IOException if the JSON string is invalid with respect to TagsFilterModel
  */
  public static TagsFilterModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagsFilterModel.class);
  }

 /**
  * Convert an instance of TagsFilterModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
