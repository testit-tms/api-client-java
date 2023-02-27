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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * CustomAttributeChangeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributeChangeModel {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_OLD_ATTRIBUTE_NAME = "oldAttributeName";
  @SerializedName(SERIALIZED_NAME_OLD_ATTRIBUTE_NAME)
  private String oldAttributeName;

  public static final String SERIALIZED_NAME_NEW_ATTRIBUTE_NAME = "newAttributeName";
  @SerializedName(SERIALIZED_NAME_NEW_ATTRIBUTE_NAME)
  private String newAttributeName;

  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private Object oldValue = null;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private Object newValue = null;

  public CustomAttributeChangeModel() {
  }

  public CustomAttributeChangeModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CustomAttributeChangeModel oldAttributeName(String oldAttributeName) {
    
    this.oldAttributeName = oldAttributeName;
    return this;
  }

   /**
   * Get oldAttributeName
   * @return oldAttributeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOldAttributeName() {
    return oldAttributeName;
  }


  public void setOldAttributeName(String oldAttributeName) {
    this.oldAttributeName = oldAttributeName;
  }


  public CustomAttributeChangeModel newAttributeName(String newAttributeName) {
    
    this.newAttributeName = newAttributeName;
    return this;
  }

   /**
   * Get newAttributeName
   * @return newAttributeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewAttributeName() {
    return newAttributeName;
  }


  public void setNewAttributeName(String newAttributeName) {
    this.newAttributeName = newAttributeName;
  }


  public CustomAttributeChangeModel oldValue(Object oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getOldValue() {
    return oldValue;
  }


  public void setOldValue(Object oldValue) {
    this.oldValue = oldValue;
  }


  public CustomAttributeChangeModel newValue(Object newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getNewValue() {
    return newValue;
  }


  public void setNewValue(Object newValue) {
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
    CustomAttributeChangeModel customAttributeChangeModel = (CustomAttributeChangeModel) o;
    return Objects.equals(this.type, customAttributeChangeModel.type) &&
        Objects.equals(this.oldAttributeName, customAttributeChangeModel.oldAttributeName) &&
        Objects.equals(this.newAttributeName, customAttributeChangeModel.newAttributeName) &&
        Objects.equals(this.oldValue, customAttributeChangeModel.oldValue) &&
        Objects.equals(this.newValue, customAttributeChangeModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, oldAttributeName, newAttributeName, oldValue, newValue);
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
    sb.append("class CustomAttributeChangeModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    oldAttributeName: ").append(toIndentedString(oldAttributeName)).append("\n");
    sb.append("    newAttributeName: ").append(toIndentedString(newAttributeName)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("oldAttributeName");
    openapiFields.add("newAttributeName");
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomAttributeChangeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomAttributeChangeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomAttributeChangeModel is not found in the empty JSON string", CustomAttributeChangeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomAttributeChangeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomAttributeChangeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("oldAttributeName") != null && !jsonObj.get("oldAttributeName").isJsonNull()) && !jsonObj.get("oldAttributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldAttributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldAttributeName").toString()));
      }
      if ((jsonObj.get("newAttributeName") != null && !jsonObj.get("newAttributeName").isJsonNull()) && !jsonObj.get("newAttributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newAttributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newAttributeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomAttributeChangeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomAttributeChangeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomAttributeChangeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomAttributeChangeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomAttributeChangeModel>() {
           @Override
           public void write(JsonWriter out, CustomAttributeChangeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomAttributeChangeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomAttributeChangeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomAttributeChangeModel
  * @throws IOException if the JSON string is invalid with respect to CustomAttributeChangeModel
  */
  public static CustomAttributeChangeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomAttributeChangeModel.class);
  }

 /**
  * Convert an instance of CustomAttributeChangeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

