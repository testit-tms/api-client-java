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
import java.util.UUID;
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
 * ProjectExportQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectExportQueryModel {
  public static final String SERIALIZED_NAME_SECTION_IDS = "sectionIds";
  @SerializedName(SERIALIZED_NAME_SECTION_IDS)
  private Set<UUID> sectionIds;

  public static final String SERIALIZED_NAME_WORK_ITEM_IDS = "workItemIds";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_IDS)
  private Set<UUID> workItemIds;

  public ProjectExportQueryModel() {
  }

  public ProjectExportQueryModel sectionIds(Set<UUID> sectionIds) {
    
    this.sectionIds = sectionIds;
    return this;
  }

  public ProjectExportQueryModel addSectionIdsItem(UUID sectionIdsItem) {
    if (this.sectionIds == null) {
      this.sectionIds = new LinkedHashSet<>();
    }
    this.sectionIds.add(sectionIdsItem);
    return this;
  }

   /**
   * Specifies the IDs of the sections you want to export.&lt;br /&gt;  Use this parameter if you want to export certain parts of the project.&lt;br /&gt;  In this parameter, \&quot;&lt;b&gt;string&lt;/b&gt;\&quot; values are IDs of the test library sections.
   * @return sectionIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getSectionIds() {
    return sectionIds;
  }


  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = sectionIds;
  }


  public ProjectExportQueryModel workItemIds(Set<UUID> workItemIds) {
    
    this.workItemIds = workItemIds;
    return this;
  }

  public ProjectExportQueryModel addWorkItemIdsItem(UUID workItemIdsItem) {
    if (this.workItemIds == null) {
      this.workItemIds = new LinkedHashSet<>();
    }
    this.workItemIds.add(workItemIdsItem);
    return this;
  }

   /**
   * Specifies the work items you want to export from a project.&lt;br /&gt;  Use this parameter if you want to export certain work items.&lt;br /&gt;  In this parameter, \&quot;&lt;b&gt;string&lt;/b&gt;\&quot; values are IDs of the work items.
   * @return workItemIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getWorkItemIds() {
    return workItemIds;
  }


  public void setWorkItemIds(Set<UUID> workItemIds) {
    this.workItemIds = workItemIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectExportQueryModel projectExportQueryModel = (ProjectExportQueryModel) o;
    return Objects.equals(this.sectionIds, projectExportQueryModel.sectionIds) &&
        Objects.equals(this.workItemIds, projectExportQueryModel.workItemIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionIds, workItemIds);
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
    sb.append("class ProjectExportQueryModel {\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    workItemIds: ").append(toIndentedString(workItemIds)).append("\n");
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
    openapiFields.add("sectionIds");
    openapiFields.add("workItemIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectExportQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectExportQueryModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectExportQueryModel is not found in the empty JSON string", ProjectExportQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectExportQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectExportQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sectionIds") != null && !jsonObj.get("sectionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionIds` to be an array in the JSON string but got `%s`", jsonObj.get("sectionIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workItemIds") != null && !jsonObj.get("workItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("workItemIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectExportQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectExportQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectExportQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectExportQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectExportQueryModel>() {
           @Override
           public void write(JsonWriter out, ProjectExportQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectExportQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectExportQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectExportQueryModel
  * @throws IOException if the JSON string is invalid with respect to ProjectExportQueryModel
  */
  public static ProjectExportQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectExportQueryModel.class);
  }

 /**
  * Convert an instance of ProjectExportQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

