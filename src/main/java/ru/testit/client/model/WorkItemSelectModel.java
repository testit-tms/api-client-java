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
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * Model containing options to filter work items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemSelectModel {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private WorkItemFilterModel filter;

  public static final String SERIALIZED_NAME_EXTRACTION_MODEL = "extractionModel";
  @SerializedName(SERIALIZED_NAME_EXTRACTION_MODEL)
  private WorkItemsExtractionModel extractionModel;

  public WorkItemSelectModel() {
  }

  public WorkItemSelectModel filter(WorkItemFilterModel filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable

  public WorkItemFilterModel getFilter() {
    return filter;
  }


  public void setFilter(WorkItemFilterModel filter) {
    this.filter = filter;
  }


  public WorkItemSelectModel extractionModel(WorkItemsExtractionModel extractionModel) {
    
    this.extractionModel = extractionModel;
    return this;
  }

   /**
   * Get extractionModel
   * @return extractionModel
  **/
  @javax.annotation.Nullable

  public WorkItemsExtractionModel getExtractionModel() {
    return extractionModel;
  }


  public void setExtractionModel(WorkItemsExtractionModel extractionModel) {
    this.extractionModel = extractionModel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemSelectModel workItemSelectModel = (WorkItemSelectModel) o;
    return Objects.equals(this.filter, workItemSelectModel.filter) &&
        Objects.equals(this.extractionModel, workItemSelectModel.extractionModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, extractionModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemSelectModel {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    extractionModel: ").append(toIndentedString(extractionModel)).append("\n");
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
    openapiFields.add("extractionModel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemSelectModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemSelectModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemSelectModel is not found in the empty JSON string", WorkItemSelectModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemSelectModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemSelectModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        WorkItemFilterModel.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      }
      // validate the optional field `extractionModel`
      if (jsonObj.get("extractionModel") != null && !jsonObj.get("extractionModel").isJsonNull()) {
        WorkItemsExtractionModel.validateJsonObject(jsonObj.getAsJsonObject("extractionModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemSelectModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemSelectModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemSelectModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemSelectModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemSelectModel>() {
           @Override
           public void write(JsonWriter out, WorkItemSelectModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemSelectModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemSelectModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemSelectModel
  * @throws IOException if the JSON string is invalid with respect to WorkItemSelectModel
  */
  public static WorkItemSelectModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemSelectModel.class);
  }

 /**
  * Convert an instance of WorkItemSelectModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

