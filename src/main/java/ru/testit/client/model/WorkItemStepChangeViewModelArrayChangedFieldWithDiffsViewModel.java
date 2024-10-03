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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.WorkItemStepChangeViewModel;

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
 * WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel {
  public static final String SERIALIZED_NAME_DIFF_VALUE = "diffValue";
  @SerializedName(SERIALIZED_NAME_DIFF_VALUE)
  private List<WorkItemStepChangeViewModel> diffValue;

  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private List<WorkItemStepChangeViewModel> oldValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private List<WorkItemStepChangeViewModel> newValue;

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel() {
  }

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel diffValue(List<WorkItemStepChangeViewModel> diffValue) {
    
    this.diffValue = diffValue;
    return this;
  }

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel addDiffValueItem(WorkItemStepChangeViewModel diffValueItem) {
    if (this.diffValue == null) {
      this.diffValue = new ArrayList<>();
    }
    this.diffValue.add(diffValueItem);
    return this;
  }

   /**
   * Get diffValue
   * @return diffValue
  **/
  @javax.annotation.Nullable
  public List<WorkItemStepChangeViewModel> getDiffValue() {
    return diffValue;
  }


  public void setDiffValue(List<WorkItemStepChangeViewModel> diffValue) {
    this.diffValue = diffValue;
  }


  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel oldValue(List<WorkItemStepChangeViewModel> oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel addOldValueItem(WorkItemStepChangeViewModel oldValueItem) {
    if (this.oldValue == null) {
      this.oldValue = new ArrayList<>();
    }
    this.oldValue.add(oldValueItem);
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  public List<WorkItemStepChangeViewModel> getOldValue() {
    return oldValue;
  }


  public void setOldValue(List<WorkItemStepChangeViewModel> oldValue) {
    this.oldValue = oldValue;
  }


  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel newValue(List<WorkItemStepChangeViewModel> newValue) {
    
    this.newValue = newValue;
    return this;
  }

  public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel addNewValueItem(WorkItemStepChangeViewModel newValueItem) {
    if (this.newValue == null) {
      this.newValue = new ArrayList<>();
    }
    this.newValue.add(newValueItem);
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  public List<WorkItemStepChangeViewModel> getNewValue() {
    return newValue;
  }


  public void setNewValue(List<WorkItemStepChangeViewModel> newValue) {
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
    WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel workItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel = (WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel) o;
    return Objects.equals(this.diffValue, workItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.diffValue) &&
        Objects.equals(this.oldValue, workItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.oldValue) &&
        Objects.equals(this.newValue, workItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(diffValue, oldValue, newValue);
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
    sb.append("class WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel {\n");
    sb.append("    diffValue: ").append(toIndentedString(diffValue)).append("\n");
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
    openapiFields.add("diffValue");
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel is not found in the empty JSON string", WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("diffValue") != null && !jsonObj.get("diffValue").isJsonNull()) {
        JsonArray jsonArraydiffValue = jsonObj.getAsJsonArray("diffValue");
        if (jsonArraydiffValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("diffValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `diffValue` to be an array in the JSON string but got `%s`", jsonObj.get("diffValue").toString()));
          }

          // validate the optional field `diffValue` (array)
          for (int i = 0; i < jsonArraydiffValue.size(); i++) {
            WorkItemStepChangeViewModel.validateJsonObject(jsonArraydiffValue.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("oldValue") != null && !jsonObj.get("oldValue").isJsonNull()) {
        JsonArray jsonArrayoldValue = jsonObj.getAsJsonArray("oldValue");
        if (jsonArrayoldValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("oldValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `oldValue` to be an array in the JSON string but got `%s`", jsonObj.get("oldValue").toString()));
          }

          // validate the optional field `oldValue` (array)
          for (int i = 0; i < jsonArrayoldValue.size(); i++) {
            WorkItemStepChangeViewModel.validateJsonObject(jsonArrayoldValue.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull()) {
        JsonArray jsonArraynewValue = jsonObj.getAsJsonArray("newValue");
        if (jsonArraynewValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("newValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `newValue` to be an array in the JSON string but got `%s`", jsonObj.get("newValue").toString()));
          }

          // validate the optional field `newValue` (array)
          for (int i = 0; i < jsonArraynewValue.size(); i++) {
            WorkItemStepChangeViewModel.validateJsonObject(jsonArraynewValue.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel>() {
           @Override
           public void write(JsonWriter out, WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel
  * @throws IOException if the JSON string is invalid with respect to WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel
  */
  public static WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel.class);
  }

 /**
  * Convert an instance of WorkItemStepChangeViewModelArrayChangedFieldWithDiffsViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

