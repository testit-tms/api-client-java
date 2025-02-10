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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.RequestTypeRequest;
import ru.testit.client.model.WebHookEventTypeRequest;

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
 * WebhooksDeleteFilterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WebhooksDeleteFilterRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "eventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private Set<WebHookEventTypeRequest> eventTypes;

  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private Set<RequestTypeRequest> methods;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public WebhooksDeleteFilterRequest() {
  }

  public WebhooksDeleteFilterRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies a webhook name to search for
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public WebhooksDeleteFilterRequest eventTypes(Set<WebHookEventTypeRequest> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public WebhooksDeleteFilterRequest addEventTypesItem(WebHookEventTypeRequest eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new LinkedHashSet<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Specifies a webhook event types to search for
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public Set<WebHookEventTypeRequest> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(Set<WebHookEventTypeRequest> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public WebhooksDeleteFilterRequest methods(Set<RequestTypeRequest> methods) {
    this.methods = methods;
    return this;
  }

  public WebhooksDeleteFilterRequest addMethodsItem(RequestTypeRequest methodsItem) {
    if (this.methods == null) {
      this.methods = new LinkedHashSet<>();
    }
    this.methods.add(methodsItem);
    return this;
  }

  /**
   * Specifies a webhook methods to search for
   * @return methods
   */
  @javax.annotation.Nullable
  public Set<RequestTypeRequest> getMethods() {
    return methods;
  }

  public void setMethods(Set<RequestTypeRequest> methods) {
    this.methods = methods;
  }


  public WebhooksDeleteFilterRequest projectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public WebhooksDeleteFilterRequest addProjectIdsItem(UUID projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new LinkedHashSet<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * Specifies a webhook project IDs to search for
   * @return projectIds
   */
  @javax.annotation.Nullable
  public Set<UUID> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public WebhooksDeleteFilterRequest isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Specifies a webhook deleted status to search for
   * @return isEnabled
   */
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksDeleteFilterRequest webhooksDeleteFilterRequest = (WebhooksDeleteFilterRequest) o;
    return Objects.equals(this.name, webhooksDeleteFilterRequest.name) &&
        Objects.equals(this.eventTypes, webhooksDeleteFilterRequest.eventTypes) &&
        Objects.equals(this.methods, webhooksDeleteFilterRequest.methods) &&
        Objects.equals(this.projectIds, webhooksDeleteFilterRequest.projectIds) &&
        Objects.equals(this.isEnabled, webhooksDeleteFilterRequest.isEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, eventTypes, methods, projectIds, isEnabled);
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
    sb.append("class WebhooksDeleteFilterRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
    openapiFields.add("eventTypes");
    openapiFields.add("methods");
    openapiFields.add("projectIds");
    openapiFields.add("isEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhooksDeleteFilterRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhooksDeleteFilterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksDeleteFilterRequest is not found in the empty JSON string", WebhooksDeleteFilterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhooksDeleteFilterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhooksDeleteFilterRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("eventTypes") != null && !jsonObj.get("eventTypes").isJsonNull() && !jsonObj.get("eventTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTypes` to be an array in the JSON string but got `%s`", jsonObj.get("eventTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("methods") != null && !jsonObj.get("methods").isJsonNull() && !jsonObj.get("methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `methods` to be an array in the JSON string but got `%s`", jsonObj.get("methods").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull() && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksDeleteFilterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksDeleteFilterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksDeleteFilterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksDeleteFilterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksDeleteFilterRequest>() {
           @Override
           public void write(JsonWriter out, WebhooksDeleteFilterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhooksDeleteFilterRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhooksDeleteFilterRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhooksDeleteFilterRequest
   * @throws IOException if the JSON string is invalid with respect to WebhooksDeleteFilterRequest
   */
  public static WebhooksDeleteFilterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksDeleteFilterRequest.class);
  }

  /**
   * Convert an instance of WebhooksDeleteFilterRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

