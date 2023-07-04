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
 * ValidateAntiForgeryTokenAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValidateAntiForgeryTokenAttribute {
  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_IS_REUSABLE = "isReusable";
  @SerializedName(SERIALIZED_NAME_IS_REUSABLE)
  private Boolean isReusable;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Object typeId = null;

  public ValidateAntiForgeryTokenAttribute() {
  }

  
  public ValidateAntiForgeryTokenAttribute(
     Boolean isReusable, 
     Object typeId
  ) {
    this();
    this.isReusable = isReusable;
    this.typeId = typeId;
  }

  public ValidateAntiForgeryTokenAttribute order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


   /**
   * Get isReusable
   * @return isReusable
  **/
  @javax.annotation.Nullable
  public Boolean getIsReusable() {
    return isReusable;
  }




   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nullable
  public Object getTypeId() {
    return typeId;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAntiForgeryTokenAttribute validateAntiForgeryTokenAttribute = (ValidateAntiForgeryTokenAttribute) o;
    return Objects.equals(this.order, validateAntiForgeryTokenAttribute.order) &&
        Objects.equals(this.isReusable, validateAntiForgeryTokenAttribute.isReusable) &&
        Objects.equals(this.typeId, validateAntiForgeryTokenAttribute.typeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, isReusable, typeId);
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
    sb.append("class ValidateAntiForgeryTokenAttribute {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    isReusable: ").append(toIndentedString(isReusable)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("isReusable");
    openapiFields.add("typeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ValidateAntiForgeryTokenAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValidateAntiForgeryTokenAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateAntiForgeryTokenAttribute is not found in the empty JSON string", ValidateAntiForgeryTokenAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ValidateAntiForgeryTokenAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidateAntiForgeryTokenAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateAntiForgeryTokenAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateAntiForgeryTokenAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateAntiForgeryTokenAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateAntiForgeryTokenAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateAntiForgeryTokenAttribute>() {
           @Override
           public void write(JsonWriter out, ValidateAntiForgeryTokenAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidateAntiForgeryTokenAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidateAntiForgeryTokenAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidateAntiForgeryTokenAttribute
  * @throws IOException if the JSON string is invalid with respect to ValidateAntiForgeryTokenAttribute
  */
  public static ValidateAntiForgeryTokenAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateAntiForgeryTokenAttribute.class);
  }

 /**
  * Convert an instance of ValidateAntiForgeryTokenAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

