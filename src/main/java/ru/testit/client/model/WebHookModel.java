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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.RequestTypeModel;
import ru.testit.client.model.WebHookEventTypeModel;

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
 * WebHookModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WebHookModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  @javax.annotation.Nonnull
  private WebHookEventTypeModel eventType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  @javax.annotation.Nonnull
  private RequestTypeModel requestType;

  public static final String SERIALIZED_NAME_SHOULD_SEND_BODY = "shouldSendBody";
  @SerializedName(SERIALIZED_NAME_SHOULD_SEND_BODY)
  @javax.annotation.Nonnull
  private Boolean shouldSendBody;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  @javax.annotation.Nullable
  private Map<String, String> headers;

  public static final String SERIALIZED_NAME_QUERY_PARAMETERS = "queryParameters";
  @SerializedName(SERIALIZED_NAME_QUERY_PARAMETERS)
  @javax.annotation.Nullable
  private Map<String, String> queryParameters;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  @javax.annotation.Nonnull
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_SHOULD_SEND_CUSTOM_BODY = "shouldSendCustomBody";
  @SerializedName(SERIALIZED_NAME_SHOULD_SEND_CUSTOM_BODY)
  @javax.annotation.Nonnull
  private Boolean shouldSendCustomBody;

  public static final String SERIALIZED_NAME_CUSTOM_BODY = "customBody";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BODY)
  @javax.annotation.Nullable
  private String customBody;

  public static final String SERIALIZED_NAME_CUSTOM_BODY_MEDIA_TYPE = "customBodyMediaType";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BODY_MEDIA_TYPE)
  @javax.annotation.Nullable
  private String customBodyMediaType;

  public static final String SERIALIZED_NAME_SHOULD_REPLACE_PARAMETERS = "shouldReplaceParameters";
  @SerializedName(SERIALIZED_NAME_SHOULD_REPLACE_PARAMETERS)
  @javax.annotation.Nonnull
  private Boolean shouldReplaceParameters;

  public static final String SERIALIZED_NAME_SHOULD_ESCAPE_PARAMETERS = "shouldEscapeParameters";
  @SerializedName(SERIALIZED_NAME_SHOULD_ESCAPE_PARAMETERS)
  @javax.annotation.Nonnull
  private Boolean shouldEscapeParameters;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  @javax.annotation.Nonnull
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  @javax.annotation.Nullable
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  @javax.annotation.Nonnull
  private UUID projectId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  @javax.annotation.Nonnull
  private Boolean isDeleted;

  public WebHookModel() {
  }

  public WebHookModel name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the webhook
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public WebHookModel eventType(@javax.annotation.Nonnull WebHookEventTypeModel eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Type of event which triggers the webhook
   * @return eventType
   */
  @javax.annotation.Nonnull
  public WebHookEventTypeModel getEventType() {
    return eventType;
  }

  public void setEventType(@javax.annotation.Nonnull WebHookEventTypeModel eventType) {
    this.eventType = eventType;
  }


  public WebHookModel description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the webhook
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public WebHookModel url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Url to which the webhook sends request
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public WebHookModel requestType(@javax.annotation.Nonnull RequestTypeModel requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * Method which the webhook uses
   * @return requestType
   */
  @javax.annotation.Nonnull
  public RequestTypeModel getRequestType() {
    return requestType;
  }

  public void setRequestType(@javax.annotation.Nonnull RequestTypeModel requestType) {
    this.requestType = requestType;
  }


  public WebHookModel shouldSendBody(@javax.annotation.Nonnull Boolean shouldSendBody) {
    this.shouldSendBody = shouldSendBody;
    return this;
  }

  /**
   * Indicates if the webhook sends body
   * @return shouldSendBody
   */
  @javax.annotation.Nonnull
  public Boolean getShouldSendBody() {
    return shouldSendBody;
  }

  public void setShouldSendBody(@javax.annotation.Nonnull Boolean shouldSendBody) {
    this.shouldSendBody = shouldSendBody;
  }


  public WebHookModel headers(@javax.annotation.Nullable Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public WebHookModel putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Collection of headers which the webhook sends
   * @return headers
   */
  @javax.annotation.Nullable
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(@javax.annotation.Nullable Map<String, String> headers) {
    this.headers = headers;
  }


  public WebHookModel queryParameters(@javax.annotation.Nullable Map<String, String> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  public WebHookModel putQueryParametersItem(String key, String queryParametersItem) {
    if (this.queryParameters == null) {
      this.queryParameters = new HashMap<>();
    }
    this.queryParameters.put(key, queryParametersItem);
    return this;
  }

  /**
   * Collection of query parameters which the webhook sends
   * @return queryParameters
   */
  @javax.annotation.Nullable
  public Map<String, String> getQueryParameters() {
    return queryParameters;
  }

  public void setQueryParameters(@javax.annotation.Nullable Map<String, String> queryParameters) {
    this.queryParameters = queryParameters;
  }


  public WebHookModel isEnabled(@javax.annotation.Nonnull Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Indicates if the webhook is active
   * @return isEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(@javax.annotation.Nonnull Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public WebHookModel shouldSendCustomBody(@javax.annotation.Nonnull Boolean shouldSendCustomBody) {
    this.shouldSendCustomBody = shouldSendCustomBody;
    return this;
  }

  /**
   * Indicates if the webhook sends custom body
   * @return shouldSendCustomBody
   */
  @javax.annotation.Nonnull
  public Boolean getShouldSendCustomBody() {
    return shouldSendCustomBody;
  }

  public void setShouldSendCustomBody(@javax.annotation.Nonnull Boolean shouldSendCustomBody) {
    this.shouldSendCustomBody = shouldSendCustomBody;
  }


  public WebHookModel customBody(@javax.annotation.Nullable String customBody) {
    this.customBody = customBody;
    return this;
  }

  /**
   * Custom body of the webhook
   * @return customBody
   */
  @javax.annotation.Nullable
  public String getCustomBody() {
    return customBody;
  }

  public void setCustomBody(@javax.annotation.Nullable String customBody) {
    this.customBody = customBody;
  }


  public WebHookModel customBodyMediaType(@javax.annotation.Nullable String customBodyMediaType) {
    this.customBodyMediaType = customBodyMediaType;
    return this;
  }

  /**
   * MIME type of body of the webhook
   * @return customBodyMediaType
   */
  @javax.annotation.Nullable
  public String getCustomBodyMediaType() {
    return customBodyMediaType;
  }

  public void setCustomBodyMediaType(@javax.annotation.Nullable String customBodyMediaType) {
    this.customBodyMediaType = customBodyMediaType;
  }


  public WebHookModel shouldReplaceParameters(@javax.annotation.Nonnull Boolean shouldReplaceParameters) {
    this.shouldReplaceParameters = shouldReplaceParameters;
    return this;
  }

  /**
   * Indicates if the webhook injects parameters
   * @return shouldReplaceParameters
   */
  @javax.annotation.Nonnull
  public Boolean getShouldReplaceParameters() {
    return shouldReplaceParameters;
  }

  public void setShouldReplaceParameters(@javax.annotation.Nonnull Boolean shouldReplaceParameters) {
    this.shouldReplaceParameters = shouldReplaceParameters;
  }


  public WebHookModel shouldEscapeParameters(@javax.annotation.Nonnull Boolean shouldEscapeParameters) {
    this.shouldEscapeParameters = shouldEscapeParameters;
    return this;
  }

  /**
   * Indicates if the webhook escapes invalid characters in parameters
   * @return shouldEscapeParameters
   */
  @javax.annotation.Nonnull
  public Boolean getShouldEscapeParameters() {
    return shouldEscapeParameters;
  }

  public void setShouldEscapeParameters(@javax.annotation.Nonnull Boolean shouldEscapeParameters) {
    this.shouldEscapeParameters = shouldEscapeParameters;
  }


  public WebHookModel createdDate(@javax.annotation.Nonnull OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Creation date of the webhook
   * @return createdDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nonnull OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public WebHookModel createdById(@javax.annotation.Nonnull UUID createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * Unique ID of user who created the webhook
   * @return createdById
   */
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(@javax.annotation.Nonnull UUID createdById) {
    this.createdById = createdById;
  }


  public WebHookModel modifiedDate(@javax.annotation.Nullable OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Last modification date of the webhook
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(@javax.annotation.Nullable OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public WebHookModel modifiedById(@javax.annotation.Nullable UUID modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

  /**
   * Unique ID of user who modified the webhook last time
   * @return modifiedById
   */
  @javax.annotation.Nullable
  public UUID getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(@javax.annotation.Nullable UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public WebHookModel projectId(@javax.annotation.Nonnull UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Unique ID of project where the webhook is located
   * @return projectId
   */
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(@javax.annotation.Nonnull UUID projectId) {
    this.projectId = projectId;
  }


  public WebHookModel id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the entity
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public WebHookModel isDeleted(@javax.annotation.Nonnull Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Indicates if the entity is deleted
   * @return isDeleted
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(@javax.annotation.Nonnull Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookModel webHookModel = (WebHookModel) o;
    return Objects.equals(this.name, webHookModel.name) &&
        Objects.equals(this.eventType, webHookModel.eventType) &&
        Objects.equals(this.description, webHookModel.description) &&
        Objects.equals(this.url, webHookModel.url) &&
        Objects.equals(this.requestType, webHookModel.requestType) &&
        Objects.equals(this.shouldSendBody, webHookModel.shouldSendBody) &&
        Objects.equals(this.headers, webHookModel.headers) &&
        Objects.equals(this.queryParameters, webHookModel.queryParameters) &&
        Objects.equals(this.isEnabled, webHookModel.isEnabled) &&
        Objects.equals(this.shouldSendCustomBody, webHookModel.shouldSendCustomBody) &&
        Objects.equals(this.customBody, webHookModel.customBody) &&
        Objects.equals(this.customBodyMediaType, webHookModel.customBodyMediaType) &&
        Objects.equals(this.shouldReplaceParameters, webHookModel.shouldReplaceParameters) &&
        Objects.equals(this.shouldEscapeParameters, webHookModel.shouldEscapeParameters) &&
        Objects.equals(this.createdDate, webHookModel.createdDate) &&
        Objects.equals(this.createdById, webHookModel.createdById) &&
        Objects.equals(this.modifiedDate, webHookModel.modifiedDate) &&
        Objects.equals(this.modifiedById, webHookModel.modifiedById) &&
        Objects.equals(this.projectId, webHookModel.projectId) &&
        Objects.equals(this.id, webHookModel.id) &&
        Objects.equals(this.isDeleted, webHookModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, eventType, description, url, requestType, shouldSendBody, headers, queryParameters, isEnabled, shouldSendCustomBody, customBody, customBodyMediaType, shouldReplaceParameters, shouldEscapeParameters, createdDate, createdById, modifiedDate, modifiedById, projectId, id, isDeleted);
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
    sb.append("class WebHookModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    customBodyMediaType: ").append(toIndentedString(customBodyMediaType)).append("\n");
    sb.append("    shouldReplaceParameters: ").append(toIndentedString(shouldReplaceParameters)).append("\n");
    sb.append("    shouldEscapeParameters: ").append(toIndentedString(shouldEscapeParameters)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("customBodyMediaType");
    openapiFields.add("shouldReplaceParameters");
    openapiFields.add("shouldEscapeParameters");
    openapiFields.add("createdDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedById");
    openapiFields.add("projectId");
    openapiFields.add("id");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("eventType");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("requestType");
    openapiRequiredFields.add("shouldSendBody");
    openapiRequiredFields.add("isEnabled");
    openapiRequiredFields.add("shouldSendCustomBody");
    openapiRequiredFields.add("shouldReplaceParameters");
    openapiRequiredFields.add("shouldEscapeParameters");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isDeleted");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebHookModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebHookModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebHookModel is not found in the empty JSON string", WebHookModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebHookModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebHookModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebHookModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `eventType`
      WebHookEventTypeModel.validateJsonElement(jsonObj.get("eventType"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `requestType`
      RequestTypeModel.validateJsonElement(jsonObj.get("requestType"));
      if ((jsonObj.get("customBody") != null && !jsonObj.get("customBody").isJsonNull()) && !jsonObj.get("customBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customBody").toString()));
      }
      if ((jsonObj.get("customBodyMediaType") != null && !jsonObj.get("customBodyMediaType").isJsonNull()) && !jsonObj.get("customBodyMediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customBodyMediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customBodyMediaType").toString()));
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebHookModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebHookModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebHookModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebHookModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WebHookModel>() {
           @Override
           public void write(JsonWriter out, WebHookModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebHookModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebHookModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebHookModel
   * @throws IOException if the JSON string is invalid with respect to WebHookModel
   */
  public static WebHookModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebHookModel.class);
  }

  /**
   * Convert an instance of WebHookModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

