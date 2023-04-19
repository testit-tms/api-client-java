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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * WebHookPostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebHookPostModel {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private WebHookEventTypeModel eventType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private RequestTypeModel requestType;

  public static final String SERIALIZED_NAME_SHOULD_SEND_BODY = "shouldSendBody";
  @SerializedName(SERIALIZED_NAME_SHOULD_SEND_BODY)
  private Boolean shouldSendBody;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers;

  public static final String SERIALIZED_NAME_QUERY_PARAMETERS = "queryParameters";
  @SerializedName(SERIALIZED_NAME_QUERY_PARAMETERS)
  private Map<String, String> queryParameters;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_SHOULD_SEND_CUSTOM_BODY = "shouldSendCustomBody";
  @SerializedName(SERIALIZED_NAME_SHOULD_SEND_CUSTOM_BODY)
  private Boolean shouldSendCustomBody;

  public static final String SERIALIZED_NAME_CUSTOM_BODY = "customBody";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BODY)
  private String customBody;

  public static final String SERIALIZED_NAME_SHOULD_REPLACE_PARAMETERS = "shouldReplaceParameters";
  @SerializedName(SERIALIZED_NAME_SHOULD_REPLACE_PARAMETERS)
  private Boolean shouldReplaceParameters;

  public static final String SERIALIZED_NAME_SHOULD_ESCAPE_PARAMETERS = "shouldEscapeParameters";
  @SerializedName(SERIALIZED_NAME_SHOULD_ESCAPE_PARAMETERS)
  private Boolean shouldEscapeParameters;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public WebHookPostModel() {
  }

  public WebHookPostModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Unique ID of the webhook project
   * @return projectId
  **/
  @javax.annotation.Nonnull

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public WebHookPostModel eventType(WebHookEventTypeModel eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull

  public WebHookEventTypeModel getEventType() {
    return eventType;
  }


  public void setEventType(WebHookEventTypeModel eventType) {
    this.eventType = eventType;
  }


  public WebHookPostModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the webhook
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebHookPostModel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Request URL of the webhook
   * @return url
  **/
  @javax.annotation.Nonnull

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebHookPostModel requestType(RequestTypeModel requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @javax.annotation.Nonnull

  public RequestTypeModel getRequestType() {
    return requestType;
  }


  public void setRequestType(RequestTypeModel requestType) {
    this.requestType = requestType;
  }


  public WebHookPostModel shouldSendBody(Boolean shouldSendBody) {
    
    this.shouldSendBody = shouldSendBody;
    return this;
  }

   /**
   * Indicates if the webhook sends body
   * @return shouldSendBody
  **/
  @javax.annotation.Nullable

  public Boolean getShouldSendBody() {
    return shouldSendBody;
  }


  public void setShouldSendBody(Boolean shouldSendBody) {
    this.shouldSendBody = shouldSendBody;
  }


  public WebHookPostModel headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public WebHookPostModel putHeadersItem(String key, String headersItem) {
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Collection of the webhook headers
   * @return headers
  **/
  @javax.annotation.Nullable

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public WebHookPostModel queryParameters(Map<String, String> queryParameters) {
    
    this.queryParameters = queryParameters;
    return this;
  }

  public WebHookPostModel putQueryParametersItem(String key, String queryParametersItem) {
    this.queryParameters.put(key, queryParametersItem);
    return this;
  }

   /**
   * Collection of the webhook query parameters
   * @return queryParameters
  **/
  @javax.annotation.Nullable

  public Map<String, String> getQueryParameters() {
    return queryParameters;
  }


  public void setQueryParameters(Map<String, String> queryParameters) {
    this.queryParameters = queryParameters;
  }


  public WebHookPostModel isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Indicates if the webhook is active
   * @return isEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public WebHookPostModel shouldSendCustomBody(Boolean shouldSendCustomBody) {
    
    this.shouldSendCustomBody = shouldSendCustomBody;
    return this;
  }

   /**
   * Indicates if the webhook sends custom body
   * @return shouldSendCustomBody
  **/
  @javax.annotation.Nullable

  public Boolean getShouldSendCustomBody() {
    return shouldSendCustomBody;
  }


  public void setShouldSendCustomBody(Boolean shouldSendCustomBody) {
    this.shouldSendCustomBody = shouldSendCustomBody;
  }


  public WebHookPostModel customBody(String customBody) {
    
    this.customBody = customBody;
    return this;
  }

   /**
   * Custom body of the webhook
   * @return customBody
  **/
  @javax.annotation.Nullable

  public String getCustomBody() {
    return customBody;
  }


  public void setCustomBody(String customBody) {
    this.customBody = customBody;
  }


  public WebHookPostModel shouldReplaceParameters(Boolean shouldReplaceParameters) {
    
    this.shouldReplaceParameters = shouldReplaceParameters;
    return this;
  }

   /**
   * Indicates if the webhook injects parameters
   * @return shouldReplaceParameters
  **/
  @javax.annotation.Nullable

  public Boolean getShouldReplaceParameters() {
    return shouldReplaceParameters;
  }


  public void setShouldReplaceParameters(Boolean shouldReplaceParameters) {
    this.shouldReplaceParameters = shouldReplaceParameters;
  }


  public WebHookPostModel shouldEscapeParameters(Boolean shouldEscapeParameters) {
    
    this.shouldEscapeParameters = shouldEscapeParameters;
    return this;
  }

   /**
   * Indicates if the webhook escapes invalid characters in parameters
   * @return shouldEscapeParameters
  **/
  @javax.annotation.Nullable

  public Boolean getShouldEscapeParameters() {
    return shouldEscapeParameters;
  }


  public void setShouldEscapeParameters(Boolean shouldEscapeParameters) {
    this.shouldEscapeParameters = shouldEscapeParameters;
  }


  public WebHookPostModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the webhook
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
    WebHookPostModel webHookPostModel = (WebHookPostModel) o;
    return Objects.equals(this.projectId, webHookPostModel.projectId) &&
        Objects.equals(this.eventType, webHookPostModel.eventType) &&
        Objects.equals(this.description, webHookPostModel.description) &&
        Objects.equals(this.url, webHookPostModel.url) &&
        Objects.equals(this.requestType, webHookPostModel.requestType) &&
        Objects.equals(this.shouldSendBody, webHookPostModel.shouldSendBody) &&
        Objects.equals(this.headers, webHookPostModel.headers) &&
        Objects.equals(this.queryParameters, webHookPostModel.queryParameters) &&
        Objects.equals(this.isEnabled, webHookPostModel.isEnabled) &&
        Objects.equals(this.shouldSendCustomBody, webHookPostModel.shouldSendCustomBody) &&
        Objects.equals(this.customBody, webHookPostModel.customBody) &&
        Objects.equals(this.shouldReplaceParameters, webHookPostModel.shouldReplaceParameters) &&
        Objects.equals(this.shouldEscapeParameters, webHookPostModel.shouldEscapeParameters) &&
        Objects.equals(this.name, webHookPostModel.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, eventType, description, url, requestType, shouldSendBody, headers, queryParameters, isEnabled, shouldSendCustomBody, customBody, shouldReplaceParameters, shouldEscapeParameters, name);
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
    sb.append("class WebHookPostModel {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    shouldSendBody: ").append(toIndentedString(shouldSendBody)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    shouldSendCustomBody: ").append(toIndentedString(shouldSendCustomBody)).append("\n");
    sb.append("    customBody: ").append(toIndentedString(customBody)).append("\n");
    sb.append("    shouldReplaceParameters: ").append(toIndentedString(shouldReplaceParameters)).append("\n");
    sb.append("    shouldEscapeParameters: ").append(toIndentedString(shouldEscapeParameters)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("eventType");
    openapiFields.add("description");
    openapiFields.add("url");
    openapiFields.add("requestType");
    openapiFields.add("shouldSendBody");
    openapiFields.add("headers");
    openapiFields.add("queryParameters");
    openapiFields.add("isEnabled");
    openapiFields.add("shouldSendCustomBody");
    openapiFields.add("customBody");
    openapiFields.add("shouldReplaceParameters");
    openapiFields.add("shouldEscapeParameters");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("eventType");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("requestType");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebHookPostModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebHookPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebHookPostModel is not found in the empty JSON string", WebHookPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebHookPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebHookPostModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebHookPostModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("customBody") != null && !jsonObj.get("customBody").isJsonNull()) && !jsonObj.get("customBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customBody").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebHookPostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebHookPostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebHookPostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebHookPostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WebHookPostModel>() {
           @Override
           public void write(JsonWriter out, WebHookPostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebHookPostModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebHookPostModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebHookPostModel
  * @throws IOException if the JSON string is invalid with respect to WebHookPostModel
  */
  public static WebHookPostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebHookPostModel.class);
  }

 /**
  * Convert an instance of WebHookPostModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

