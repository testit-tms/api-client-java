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
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.NotificationTypeModel;

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
 * ApiV2NotificationsSearchPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2NotificationsSearchPostRequest {
  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private Set<NotificationTypeModel> types;

  public static final String SERIALIZED_NAME_IS_READ = "isRead";
  @SerializedName(SERIALIZED_NAME_IS_READ)
  private Boolean isRead;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateTimeRangeSelectorModel createdDate;

  public ApiV2NotificationsSearchPostRequest() {
  }

  public ApiV2NotificationsSearchPostRequest types(Set<NotificationTypeModel> types) {
    
    this.types = types;
    return this;
  }

  public ApiV2NotificationsSearchPostRequest addTypesItem(NotificationTypeModel typesItem) {
    if (this.types == null) {
      this.types = new LinkedHashSet<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  public Set<NotificationTypeModel> getTypes() {
    return types;
  }


  public void setTypes(Set<NotificationTypeModel> types) {
    this.types = types;
  }


  public ApiV2NotificationsSearchPostRequest isRead(Boolean isRead) {
    
    this.isRead = isRead;
    return this;
  }

   /**
   * Get isRead
   * @return isRead
  **/
  @javax.annotation.Nullable
  public Boolean getIsRead() {
    return isRead;
  }


  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }


  public ApiV2NotificationsSearchPostRequest createdDate(DateTimeRangeSelectorModel createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2NotificationsSearchPostRequest apiV2NotificationsSearchPostRequest = (ApiV2NotificationsSearchPostRequest) o;
    return Objects.equals(this.types, apiV2NotificationsSearchPostRequest.types) &&
        Objects.equals(this.isRead, apiV2NotificationsSearchPostRequest.isRead) &&
        Objects.equals(this.createdDate, apiV2NotificationsSearchPostRequest.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, isRead, createdDate);
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
    sb.append("class ApiV2NotificationsSearchPostRequest {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
    openapiFields.add("isRead");
    openapiFields.add("createdDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2NotificationsSearchPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2NotificationsSearchPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2NotificationsSearchPostRequest is not found in the empty JSON string", ApiV2NotificationsSearchPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2NotificationsSearchPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2NotificationsSearchPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2NotificationsSearchPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2NotificationsSearchPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2NotificationsSearchPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2NotificationsSearchPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2NotificationsSearchPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2NotificationsSearchPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2NotificationsSearchPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2NotificationsSearchPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2NotificationsSearchPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2NotificationsSearchPostRequest
  */
  public static ApiV2NotificationsSearchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2NotificationsSearchPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2NotificationsSearchPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
