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
 * SearchWebhooksQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchWebhooksQueryModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "eventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private Set<WebHookEventTypeModel> eventTypes;

  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private Set<RequestTypeModel> methods;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public SearchWebhooksQueryModel() {
  }

  public SearchWebhooksQueryModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies a webhook name to search for
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SearchWebhooksQueryModel eventTypes(Set<WebHookEventTypeModel> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public SearchWebhooksQueryModel addEventTypesItem(WebHookEventTypeModel eventTypesItem) {
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Specifies a webhook event types to search for
   * @return eventTypes
  **/
  @javax.annotation.Nullable

  public Set<WebHookEventTypeModel> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(Set<WebHookEventTypeModel> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public SearchWebhooksQueryModel methods(Set<RequestTypeModel> methods) {
    
    this.methods = methods;
    return this;
  }

  public SearchWebhooksQueryModel addMethodsItem(RequestTypeModel methodsItem) {
    this.methods.add(methodsItem);
    return this;
  }

   /**
   * Specifies a webhook methods to search for
   * @return methods
  **/
  @javax.annotation.Nullable

  public Set<RequestTypeModel> getMethods() {
    return methods;
  }


  public void setMethods(Set<RequestTypeModel> methods) {
    this.methods = methods;
  }


  public SearchWebhooksQueryModel projectIds(Set<UUID> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public SearchWebhooksQueryModel addProjectIdsItem(UUID projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * Specifies a webhook project IDs to search for
   * @return projectIds
  **/
  @javax.annotation.Nullable

  public Set<UUID> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public SearchWebhooksQueryModel isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Specifies a webhook deleted status to search for
   * @return isEnabled
  **/
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
    SearchWebhooksQueryModel searchWebhooksQueryModel = (SearchWebhooksQueryModel) o;
    return Objects.equals(this.name, searchWebhooksQueryModel.name) &&
        Objects.equals(this.eventTypes, searchWebhooksQueryModel.eventTypes) &&
        Objects.equals(this.methods, searchWebhooksQueryModel.methods) &&
        Objects.equals(this.projectIds, searchWebhooksQueryModel.projectIds) &&
        Objects.equals(this.isEnabled, searchWebhooksQueryModel.isEnabled);
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
    sb.append("class SearchWebhooksQueryModel {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchWebhooksQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchWebhooksQueryModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchWebhooksQueryModel is not found in the empty JSON string", SearchWebhooksQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchWebhooksQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchWebhooksQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("eventTypes") != null && !jsonObj.get("eventTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTypes` to be an array in the JSON string but got `%s`", jsonObj.get("eventTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("methods") != null && !jsonObj.get("methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `methods` to be an array in the JSON string but got `%s`", jsonObj.get("methods").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchWebhooksQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchWebhooksQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchWebhooksQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchWebhooksQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchWebhooksQueryModel>() {
           @Override
           public void write(JsonWriter out, SearchWebhooksQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchWebhooksQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchWebhooksQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchWebhooksQueryModel
  * @throws IOException if the JSON string is invalid with respect to SearchWebhooksQueryModel
  */
  public static SearchWebhooksQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchWebhooksQueryModel.class);
  }

 /**
  * Convert an instance of SearchWebhooksQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

