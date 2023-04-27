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
 * PeriodViewModelTestPlanChangedFieldViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeriodViewModelTestPlanChangedFieldViewModel {
  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private PeriodViewModel oldValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private PeriodViewModel newValue;

  public PeriodViewModelTestPlanChangedFieldViewModel() {
  }

  public PeriodViewModelTestPlanChangedFieldViewModel oldValue(PeriodViewModel oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable

  public PeriodViewModel getOldValue() {
    return oldValue;
  }


  public void setOldValue(PeriodViewModel oldValue) {
    this.oldValue = oldValue;
  }


  public PeriodViewModelTestPlanChangedFieldViewModel newValue(PeriodViewModel newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable

  public PeriodViewModel getNewValue() {
    return newValue;
  }


  public void setNewValue(PeriodViewModel newValue) {
    this.newValue = newValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodViewModelTestPlanChangedFieldViewModel periodViewModelTestPlanChangedFieldViewModel = (PeriodViewModelTestPlanChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, periodViewModelTestPlanChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, periodViewModelTestPlanChangedFieldViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodViewModelTestPlanChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeriodViewModelTestPlanChangedFieldViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeriodViewModelTestPlanChangedFieldViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeriodViewModelTestPlanChangedFieldViewModel is not found in the empty JSON string", PeriodViewModelTestPlanChangedFieldViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PeriodViewModelTestPlanChangedFieldViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeriodViewModelTestPlanChangedFieldViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `oldValue`
      if (jsonObj.get("oldValue") != null && !jsonObj.get("oldValue").isJsonNull()) {
        PeriodViewModel.validateJsonObject(jsonObj.getAsJsonObject("oldValue"));
      }
      // validate the optional field `newValue`
      if (jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull()) {
        PeriodViewModel.validateJsonObject(jsonObj.getAsJsonObject("newValue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeriodViewModelTestPlanChangedFieldViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeriodViewModelTestPlanChangedFieldViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeriodViewModelTestPlanChangedFieldViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeriodViewModelTestPlanChangedFieldViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PeriodViewModelTestPlanChangedFieldViewModel>() {
           @Override
           public void write(JsonWriter out, PeriodViewModelTestPlanChangedFieldViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeriodViewModelTestPlanChangedFieldViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PeriodViewModelTestPlanChangedFieldViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeriodViewModelTestPlanChangedFieldViewModel
  * @throws IOException if the JSON string is invalid with respect to PeriodViewModelTestPlanChangedFieldViewModel
  */
  public static PeriodViewModelTestPlanChangedFieldViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeriodViewModelTestPlanChangedFieldViewModel.class);
  }

 /**
  * Convert an instance of PeriodViewModelTestPlanChangedFieldViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

