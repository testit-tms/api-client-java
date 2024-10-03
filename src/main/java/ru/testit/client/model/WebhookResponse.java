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
 * WebhookResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookResponse {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_REQUEST_BODY = "requestBody";
  @SerializedName(SERIALIZED_NAME_REQUEST_BODY)
  private String requestBody;

  public static final String SERIALIZED_NAME_REQUEST_META = "requestMeta";
  @SerializedName(SERIALIZED_NAME_REQUEST_META)
  private String requestMeta;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "responseBody";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  private String responseBody;

  public static final String SERIALIZED_NAME_RESPONSE_META = "responseMeta";
  @SerializedName(SERIALIZED_NAME_RESPONSE_META)
  private String responseMeta;

  public WebhookResponse() {
  }

  public WebhookResponse uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public WebhookResponse statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nonnull
  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public WebhookResponse requestBody(String requestBody) {
    
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Get requestBody
   * @return requestBody
  **/
  @javax.annotation.Nullable
  public String getRequestBody() {
    return requestBody;
  }


  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }


  public WebhookResponse requestMeta(String requestMeta) {
    
    this.requestMeta = requestMeta;
    return this;
  }

   /**
   * Get requestMeta
   * @return requestMeta
  **/
  @javax.annotation.Nonnull
  public String getRequestMeta() {
    return requestMeta;
  }


  public void setRequestMeta(String requestMeta) {
    this.requestMeta = requestMeta;
  }


  public WebhookResponse responseBody(String responseBody) {
    
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @javax.annotation.Nonnull
  public String getResponseBody() {
    return responseBody;
  }


  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }


  public WebhookResponse responseMeta(String responseMeta) {
    
    this.responseMeta = responseMeta;
    return this;
  }

   /**
   * Get responseMeta
   * @return responseMeta
  **/
  @javax.annotation.Nonnull
  public String getResponseMeta() {
    return responseMeta;
  }


  public void setResponseMeta(String responseMeta) {
    this.responseMeta = responseMeta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.uri, webhookResponse.uri) &&
        Objects.equals(this.statusCode, webhookResponse.statusCode) &&
        Objects.equals(this.requestBody, webhookResponse.requestBody) &&
        Objects.equals(this.requestMeta, webhookResponse.requestMeta) &&
        Objects.equals(this.responseBody, webhookResponse.responseBody) &&
        Objects.equals(this.responseMeta, webhookResponse.responseMeta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, statusCode, requestBody, requestMeta, responseBody, responseMeta);
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
    sb.append("class WebhookResponse {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    requestMeta: ").append(toIndentedString(requestMeta)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseMeta: ").append(toIndentedString(responseMeta)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("statusCode");
    openapiFields.add("requestBody");
    openapiFields.add("requestMeta");
    openapiFields.add("responseBody");
    openapiFields.add("responseMeta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("statusCode");
    openapiRequiredFields.add("requestMeta");
    openapiRequiredFields.add("responseBody");
    openapiRequiredFields.add("responseMeta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookResponse is not found in the empty JSON string", WebhookResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("requestBody") != null && !jsonObj.get("requestBody").isJsonNull()) && !jsonObj.get("requestBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestBody").toString()));
      }
      if (!jsonObj.get("requestMeta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestMeta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestMeta").toString()));
      }
      if (!jsonObj.get("responseBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseBody").toString()));
      }
      if (!jsonObj.get("responseMeta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseMeta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseMeta").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookResponse>() {
           @Override
           public void write(JsonWriter out, WebhookResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookResponse
  * @throws IOException if the JSON string is invalid with respect to WebhookResponse
  */
  public static WebhookResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookResponse.class);
  }

 /**
  * Convert an instance of WebhookResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

