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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.WorkItemEntityTypes;

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
 * WorkItemLinkUrlFilterApiModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkItemLinkUrlFilterApiModel {
  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private Set<WorkItemEntityTypes> types;

  public static final String SERIALIZED_NAME_SEARCH_URL = "searchUrl";
  @SerializedName(SERIALIZED_NAME_SEARCH_URL)
  private String searchUrl;

  public WorkItemLinkUrlFilterApiModel() {
  }

  public WorkItemLinkUrlFilterApiModel types(Set<WorkItemEntityTypes> types) {
    this.types = types;
    return this;
  }

  public WorkItemLinkUrlFilterApiModel addTypesItem(WorkItemEntityTypes typesItem) {
    if (this.types == null) {
      this.types = new LinkedHashSet<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
   */
  @javax.annotation.Nullable
  public Set<WorkItemEntityTypes> getTypes() {
    return types;
  }

  public void setTypes(Set<WorkItemEntityTypes> types) {
    this.types = types;
  }


  public WorkItemLinkUrlFilterApiModel searchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
    return this;
  }

  /**
   * Get searchUrl
   * @return searchUrl
   */
  @javax.annotation.Nullable
  public String getSearchUrl() {
    return searchUrl;
  }

  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemLinkUrlFilterApiModel workItemLinkUrlFilterApiModel = (WorkItemLinkUrlFilterApiModel) o;
    return Objects.equals(this.types, workItemLinkUrlFilterApiModel.types) &&
        Objects.equals(this.searchUrl, workItemLinkUrlFilterApiModel.searchUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, searchUrl);
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
    sb.append("class WorkItemLinkUrlFilterApiModel {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
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
    openapiFields.add("types");
    openapiFields.add("searchUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemLinkUrlFilterApiModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemLinkUrlFilterApiModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemLinkUrlFilterApiModel is not found in the empty JSON string", WorkItemLinkUrlFilterApiModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemLinkUrlFilterApiModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemLinkUrlFilterApiModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonNull() && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
      if ((jsonObj.get("searchUrl") != null && !jsonObj.get("searchUrl").isJsonNull()) && !jsonObj.get("searchUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemLinkUrlFilterApiModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemLinkUrlFilterApiModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemLinkUrlFilterApiModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemLinkUrlFilterApiModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemLinkUrlFilterApiModel>() {
           @Override
           public void write(JsonWriter out, WorkItemLinkUrlFilterApiModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemLinkUrlFilterApiModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemLinkUrlFilterApiModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemLinkUrlFilterApiModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemLinkUrlFilterApiModel
   */
  public static WorkItemLinkUrlFilterApiModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemLinkUrlFilterApiModel.class);
  }

  /**
   * Convert an instance of WorkItemLinkUrlFilterApiModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

