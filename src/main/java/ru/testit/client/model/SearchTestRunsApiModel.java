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
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.TestRunState;

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
 * SearchTestRunsApiModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class SearchTestRunsApiModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATES = "states";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_STATES)
  private Set<TestRunState> states;

  public static final String SERIALIZED_NAME_STATUS_CODES = "statusCodes";
  @SerializedName(SERIALIZED_NAME_STATUS_CODES)
  private Set<String> statusCodes;

  public static final String SERIALIZED_NAME_STARTED_DATE = "startedDate";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE)
  private DateTimeRangeSelectorModel startedDate;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private DateTimeRangeSelectorModel completedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds;

  public SearchTestRunsApiModel() {
  }

  public SearchTestRunsApiModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Deprecated
  public SearchTestRunsApiModel states(Set<TestRunState> states) {
    this.states = states;
    return this;
  }

  public SearchTestRunsApiModel addStatesItem(TestRunState statesItem) {
    if (this.states == null) {
      this.states = new LinkedHashSet<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public Set<TestRunState> getStates() {
    return states;
  }

  @Deprecated
  public void setStates(Set<TestRunState> states) {
    this.states = states;
  }


  public SearchTestRunsApiModel statusCodes(Set<String> statusCodes) {
    this.statusCodes = statusCodes;
    return this;
  }

  public SearchTestRunsApiModel addStatusCodesItem(String statusCodesItem) {
    if (this.statusCodes == null) {
      this.statusCodes = new LinkedHashSet<>();
    }
    this.statusCodes.add(statusCodesItem);
    return this;
  }

  /**
   * Get statusCodes
   * @return statusCodes
   */
  @javax.annotation.Nullable
  public Set<String> getStatusCodes() {
    return statusCodes;
  }

  public void setStatusCodes(Set<String> statusCodes) {
    this.statusCodes = statusCodes;
  }


  public SearchTestRunsApiModel startedDate(DateTimeRangeSelectorModel startedDate) {
    this.startedDate = startedDate;
    return this;
  }

  /**
   * Get startedDate
   * @return startedDate
   */
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getStartedDate() {
    return startedDate;
  }

  public void setStartedDate(DateTimeRangeSelectorModel startedDate) {
    this.startedDate = startedDate;
  }


  public SearchTestRunsApiModel completedDate(DateTimeRangeSelectorModel completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * Get completedDate
   * @return completedDate
   */
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(DateTimeRangeSelectorModel completedDate) {
    this.completedDate = completedDate;
  }


  public SearchTestRunsApiModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
    return this;
  }

  public SearchTestRunsApiModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

  /**
   * Get createdByIds
   * @return createdByIds
   */
  @javax.annotation.Nullable
  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }

  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public SearchTestRunsApiModel modifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public SearchTestRunsApiModel addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null) {
      this.modifiedByIds = new LinkedHashSet<>();
    }
    this.modifiedByIds.add(modifiedByIdsItem);
    return this;
  }

  /**
   * Get modifiedByIds
   * @return modifiedByIds
   */
  @javax.annotation.Nullable
  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }

  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTestRunsApiModel searchTestRunsApiModel = (SearchTestRunsApiModel) o;
    return Objects.equals(this.name, searchTestRunsApiModel.name) &&
        Objects.equals(this.states, searchTestRunsApiModel.states) &&
        Objects.equals(this.statusCodes, searchTestRunsApiModel.statusCodes) &&
        Objects.equals(this.startedDate, searchTestRunsApiModel.startedDate) &&
        Objects.equals(this.completedDate, searchTestRunsApiModel.completedDate) &&
        Objects.equals(this.createdByIds, searchTestRunsApiModel.createdByIds) &&
        Objects.equals(this.modifiedByIds, searchTestRunsApiModel.modifiedByIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, states, statusCodes, startedDate, completedDate, createdByIds, modifiedByIds);
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
    sb.append("class SearchTestRunsApiModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
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
    openapiFields.add("states");
    openapiFields.add("statusCodes");
    openapiFields.add("startedDate");
    openapiFields.add("completedDate");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedByIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchTestRunsApiModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchTestRunsApiModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchTestRunsApiModel is not found in the empty JSON string", SearchTestRunsApiModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchTestRunsApiModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchTestRunsApiModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("states") != null && !jsonObj.get("states").isJsonNull() && !jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statusCodes") != null && !jsonObj.get("statusCodes").isJsonNull() && !jsonObj.get("statusCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCodes` to be an array in the JSON string but got `%s`", jsonObj.get("statusCodes").toString()));
      }
      // validate the optional field `startedDate`
      if (jsonObj.get("startedDate") != null && !jsonObj.get("startedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonElement(jsonObj.get("startedDate"));
      }
      // validate the optional field `completedDate`
      if (jsonObj.get("completedDate") != null && !jsonObj.get("completedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonElement(jsonObj.get("completedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonNull() && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modifiedByIds") != null && !jsonObj.get("modifiedByIds").isJsonNull() && !jsonObj.get("modifiedByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByIds` to be an array in the JSON string but got `%s`", jsonObj.get("modifiedByIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchTestRunsApiModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchTestRunsApiModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchTestRunsApiModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchTestRunsApiModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchTestRunsApiModel>() {
           @Override
           public void write(JsonWriter out, SearchTestRunsApiModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchTestRunsApiModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchTestRunsApiModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchTestRunsApiModel
   * @throws IOException if the JSON string is invalid with respect to SearchTestRunsApiModel
   */
  public static SearchTestRunsApiModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchTestRunsApiModel.class);
  }

  /**
   * Convert an instance of SearchTestRunsApiModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

