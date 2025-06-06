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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutoTestClassCountApiModel;

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
 * AutoTestNamespaceCountApiModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AutoTestNamespaceCountApiModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<AutoTestClassCountApiModel> classes = new ArrayList<>();

  public AutoTestNamespaceCountApiModel() {
  }

  public AutoTestNamespaceCountApiModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AutoTestNamespaceCountApiModel count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nonnull
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  public AutoTestNamespaceCountApiModel classes(List<AutoTestClassCountApiModel> classes) {
    this.classes = classes;
    return this;
  }

  public AutoTestNamespaceCountApiModel addClassesItem(AutoTestClassCountApiModel classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<>();
    }
    this.classes.add(classesItem);
    return this;
  }

  /**
   * Get classes
   * @return classes
   */
  @javax.annotation.Nonnull
  public List<AutoTestClassCountApiModel> getClasses() {
    return classes;
  }

  public void setClasses(List<AutoTestClassCountApiModel> classes) {
    this.classes = classes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestNamespaceCountApiModel autoTestNamespaceCountApiModel = (AutoTestNamespaceCountApiModel) o;
    return Objects.equals(this.name, autoTestNamespaceCountApiModel.name) &&
        Objects.equals(this.count, autoTestNamespaceCountApiModel.count) &&
        Objects.equals(this.classes, autoTestNamespaceCountApiModel.classes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, count, classes);
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
    sb.append("class AutoTestNamespaceCountApiModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("classes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("classes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AutoTestNamespaceCountApiModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutoTestNamespaceCountApiModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestNamespaceCountApiModel is not found in the empty JSON string", AutoTestNamespaceCountApiModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutoTestNamespaceCountApiModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestNamespaceCountApiModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutoTestNamespaceCountApiModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("classes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `classes` to be an array in the JSON string but got `%s`", jsonObj.get("classes").toString()));
      }

      JsonArray jsonArrayclasses = jsonObj.getAsJsonArray("classes");
      // validate the required field `classes` (array)
      for (int i = 0; i < jsonArrayclasses.size(); i++) {
        AutoTestClassCountApiModel.validateJsonElement(jsonArrayclasses.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTestNamespaceCountApiModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestNamespaceCountApiModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestNamespaceCountApiModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestNamespaceCountApiModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestNamespaceCountApiModel>() {
           @Override
           public void write(JsonWriter out, AutoTestNamespaceCountApiModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestNamespaceCountApiModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AutoTestNamespaceCountApiModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AutoTestNamespaceCountApiModel
   * @throws IOException if the JSON string is invalid with respect to AutoTestNamespaceCountApiModel
   */
  public static AutoTestNamespaceCountApiModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestNamespaceCountApiModel.class);
  }

  /**
   * Convert an instance of AutoTestNamespaceCountApiModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

