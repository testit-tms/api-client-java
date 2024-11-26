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
import ru.testit.client.model.WebhooksDeleteRequestExtractor;
import ru.testit.client.model.WebhooksUpdateRequestFilter;
import ru.testit.client.model.WebhooksUpdateRequestModel;

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
 * ApiV2WebhooksPutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2WebhooksPutRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private WebhooksUpdateRequestFilter filter;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private WebhooksUpdateRequestModel model;

  public static final String SERIALIZED_NAME_EXTRACTOR = "extractor";
  @SerializedName(SERIALIZED_NAME_EXTRACTOR)
  private WebhooksDeleteRequestExtractor extractor;

  public ApiV2WebhooksPutRequest() {
  }

  public ApiV2WebhooksPutRequest filter(WebhooksUpdateRequestFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  public WebhooksUpdateRequestFilter getFilter() {
    return filter;
  }


  public void setFilter(WebhooksUpdateRequestFilter filter) {
    this.filter = filter;
  }


  public ApiV2WebhooksPutRequest model(WebhooksUpdateRequestModel model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  public WebhooksUpdateRequestModel getModel() {
    return model;
  }


  public void setModel(WebhooksUpdateRequestModel model) {
    this.model = model;
  }


  public ApiV2WebhooksPutRequest extractor(WebhooksDeleteRequestExtractor extractor) {
    
    this.extractor = extractor;
    return this;
  }

   /**
   * Get extractor
   * @return extractor
  **/
  @javax.annotation.Nonnull
  public WebhooksDeleteRequestExtractor getExtractor() {
    return extractor;
  }


  public void setExtractor(WebhooksDeleteRequestExtractor extractor) {
    this.extractor = extractor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2WebhooksPutRequest apiV2WebhooksPutRequest = (ApiV2WebhooksPutRequest) o;
    return Objects.equals(this.filter, apiV2WebhooksPutRequest.filter) &&
        Objects.equals(this.model, apiV2WebhooksPutRequest.model) &&
        Objects.equals(this.extractor, apiV2WebhooksPutRequest.extractor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, model, extractor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2WebhooksPutRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    extractor: ").append(toIndentedString(extractor)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("model");
    openapiFields.add("extractor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("extractor");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2WebhooksPutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2WebhooksPutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2WebhooksPutRequest is not found in the empty JSON string", ApiV2WebhooksPutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2WebhooksPutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2WebhooksPutRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiV2WebhooksPutRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `filter`
      WebhooksUpdateRequestFilter.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      // validate the required field `model`
      WebhooksUpdateRequestModel.validateJsonObject(jsonObj.getAsJsonObject("model"));
      // validate the required field `extractor`
      WebhooksDeleteRequestExtractor.validateJsonObject(jsonObj.getAsJsonObject("extractor"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2WebhooksPutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2WebhooksPutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2WebhooksPutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2WebhooksPutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2WebhooksPutRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2WebhooksPutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2WebhooksPutRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2WebhooksPutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2WebhooksPutRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2WebhooksPutRequest
  */
  public static ApiV2WebhooksPutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2WebhooksPutRequest.class);
  }

 /**
  * Convert an instance of ApiV2WebhooksPutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

