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
import ru.testit.client.model.ConfigurationExtractionModelProjectIds;
import ru.testit.client.model.WorkItemsExtractionModelIds;
import ru.testit.client.model.WorkItemsExtractionModelSectionIds;

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
 * Rules for different level entities inclusion/exclusion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemsExtractionModel {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private WorkItemsExtractionModelIds ids;

  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  private WorkItemsExtractionModelSectionIds sectionIds;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private ConfigurationExtractionModelProjectIds projectIds;

  public WorkItemsExtractionModel() {
  }

  public WorkItemsExtractionModel ids(WorkItemsExtractionModelIds ids) {
    
    this.ids = ids;
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  public WorkItemsExtractionModelIds getIds() {
    return ids;
  }


  public void setIds(WorkItemsExtractionModelIds ids) {
    this.ids = ids;
  }


  public WorkItemsExtractionModel sectionIds(WorkItemsExtractionModelSectionIds sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

   /**
   * Get sectionIds
   * @return sectionIds
  **/
  @javax.annotation.Nullable
  public WorkItemsExtractionModelSectionIds getSectionIds() {
    return sectionIds;
  }


  public void setSectionIds(WorkItemsExtractionModelSectionIds sectionIds) {
    this.sectionIds = sectionIds;
  }


  public WorkItemsExtractionModel projectIds(ConfigurationExtractionModelProjectIds projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

   /**
   * Get projectIds
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public ConfigurationExtractionModelProjectIds getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(ConfigurationExtractionModelProjectIds projectIds) {
    this.projectIds = projectIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemsExtractionModel workItemsExtractionModel = (WorkItemsExtractionModel) o;
    return Objects.equals(this.ids, workItemsExtractionModel.ids) &&
        Objects.equals(this.sectionIds, workItemsExtractionModel.sectionIds) &&
        Objects.equals(this.projectIds, workItemsExtractionModel.projectIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, sectionIds, projectIds);
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
    sb.append("class WorkItemsExtractionModel {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("sectionIds");
    openapiFields.add("projectIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemsExtractionModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemsExtractionModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemsExtractionModel is not found in the empty JSON string", WorkItemsExtractionModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemsExtractionModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemsExtractionModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ids`
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull()) {
        WorkItemsExtractionModelIds.validateJsonObject(jsonObj.getAsJsonObject("ids"));
      }
      // validate the optional field `sectionIds`
      if (jsonObj.get("sectionIds") != null && !jsonObj.get("sectionIds").isJsonNull()) {
        WorkItemsExtractionModelSectionIds.validateJsonObject(jsonObj.getAsJsonObject("sectionIds"));
      }
      // validate the optional field `projectIds`
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull()) {
        ConfigurationExtractionModelProjectIds.validateJsonObject(jsonObj.getAsJsonObject("projectIds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemsExtractionModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemsExtractionModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemsExtractionModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemsExtractionModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemsExtractionModel>() {
           @Override
           public void write(JsonWriter out, WorkItemsExtractionModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemsExtractionModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemsExtractionModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemsExtractionModel
  * @throws IOException if the JSON string is invalid with respect to WorkItemsExtractionModel
  */
  public static WorkItemsExtractionModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemsExtractionModel.class);
  }

 /**
  * Convert an instance of WorkItemsExtractionModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

