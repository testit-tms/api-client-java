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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.GuidExtractionModel;

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
 * Rules for different level entities inclusion/exclusion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WorkItemExtractionModel {
  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  @javax.annotation.Nullable
  private GuidExtractionModel projectIds;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  @javax.annotation.Nullable
  private GuidExtractionModel ids;

  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  @javax.annotation.Nullable
  private GuidExtractionModel sectionIds;

  public WorkItemExtractionModel() {
  }

  public WorkItemExtractionModel projectIds(@javax.annotation.Nullable GuidExtractionModel projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  /**
   * Extraction parameters for projects
   * @return projectIds
   */
  @javax.annotation.Nullable
  public GuidExtractionModel getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(@javax.annotation.Nullable GuidExtractionModel projectIds) {
    this.projectIds = projectIds;
  }


  public WorkItemExtractionModel ids(@javax.annotation.Nullable GuidExtractionModel ids) {
    this.ids = ids;
    return this;
  }

  /**
   * Extraction parameters for work items
   * @return ids
   */
  @javax.annotation.Nullable
  public GuidExtractionModel getIds() {
    return ids;
  }

  public void setIds(@javax.annotation.Nullable GuidExtractionModel ids) {
    this.ids = ids;
  }


  public WorkItemExtractionModel sectionIds(@javax.annotation.Nullable GuidExtractionModel sectionIds) {
    this.sectionIds = sectionIds;
    return this;
  }

  /**
   * Extraction parameters for sections
   * @return sectionIds
   */
  @javax.annotation.Nullable
  public GuidExtractionModel getSectionIds() {
    return sectionIds;
  }

  public void setSectionIds(@javax.annotation.Nullable GuidExtractionModel sectionIds) {
    this.sectionIds = sectionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemExtractionModel workItemExtractionModel = (WorkItemExtractionModel) o;
    return Objects.equals(this.projectIds, workItemExtractionModel.projectIds) &&
        Objects.equals(this.ids, workItemExtractionModel.ids) &&
        Objects.equals(this.sectionIds, workItemExtractionModel.sectionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, ids, sectionIds);
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
    sb.append("class WorkItemExtractionModel {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
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
    openapiFields.add("projectIds");
    openapiFields.add("ids");
    openapiFields.add("sectionIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemExtractionModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemExtractionModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemExtractionModel is not found in the empty JSON string", WorkItemExtractionModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemExtractionModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemExtractionModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `projectIds`
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull()) {
        GuidExtractionModel.validateJsonElement(jsonObj.get("projectIds"));
      }
      // validate the optional field `ids`
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull()) {
        GuidExtractionModel.validateJsonElement(jsonObj.get("ids"));
      }
      // validate the optional field `sectionIds`
      if (jsonObj.get("sectionIds") != null && !jsonObj.get("sectionIds").isJsonNull()) {
        GuidExtractionModel.validateJsonElement(jsonObj.get("sectionIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemExtractionModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemExtractionModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemExtractionModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemExtractionModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemExtractionModel>() {
           @Override
           public void write(JsonWriter out, WorkItemExtractionModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemExtractionModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemExtractionModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemExtractionModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemExtractionModel
   */
  public static WorkItemExtractionModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemExtractionModel.class);
  }

  /**
   * Convert an instance of WorkItemExtractionModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

