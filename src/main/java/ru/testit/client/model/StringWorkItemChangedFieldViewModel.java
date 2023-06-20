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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * StringWorkItemChangedFieldViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StringWorkItemChangedFieldViewModel {
  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private String oldValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private String newValue;

  public StringWorkItemChangedFieldViewModel() {
  }

  public StringWorkItemChangedFieldViewModel oldValue(String oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOldValue() {
    return oldValue;
  }


  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  public StringWorkItemChangedFieldViewModel newValue(String newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewValue() {
    return newValue;
  }


  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringWorkItemChangedFieldViewModel stringWorkItemChangedFieldViewModel = (StringWorkItemChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, stringWorkItemChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, stringWorkItemChangedFieldViewModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
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
    sb.append("class StringWorkItemChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StringWorkItemChangedFieldViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StringWorkItemChangedFieldViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StringWorkItemChangedFieldViewModel is not found in the empty JSON string", StringWorkItemChangedFieldViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StringWorkItemChangedFieldViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StringWorkItemChangedFieldViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("oldValue") != null && !jsonObj.get("oldValue").isJsonNull()) && !jsonObj.get("oldValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldValue").toString()));
      }
      if ((jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull()) && !jsonObj.get("newValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StringWorkItemChangedFieldViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StringWorkItemChangedFieldViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StringWorkItemChangedFieldViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StringWorkItemChangedFieldViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<StringWorkItemChangedFieldViewModel>() {
           @Override
           public void write(JsonWriter out, StringWorkItemChangedFieldViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StringWorkItemChangedFieldViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StringWorkItemChangedFieldViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StringWorkItemChangedFieldViewModel
  * @throws IOException if the JSON string is invalid with respect to StringWorkItemChangedFieldViewModel
  */
  public static StringWorkItemChangedFieldViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StringWorkItemChangedFieldViewModel.class);
  }

 /**
  * Convert an instance of StringWorkItemChangedFieldViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

