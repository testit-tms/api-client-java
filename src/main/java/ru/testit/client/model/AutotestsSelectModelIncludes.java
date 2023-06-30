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
 * Object specifying data to be included
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotestsSelectModelIncludes {
  public static final String SERIALIZED_NAME_INCLUDE_STEPS = "includeSteps";
  @SerializedName(SERIALIZED_NAME_INCLUDE_STEPS)
  private Boolean includeSteps;

  public static final String SERIALIZED_NAME_INCLUDE_LINKS = "includeLinks";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LINKS)
  private Boolean includeLinks;

  public static final String SERIALIZED_NAME_INCLUDE_LABELS = "includeLabels";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LABELS)
  private Boolean includeLabels;

  public AutotestsSelectModelIncludes() {
  }

  public AutotestsSelectModelIncludes includeSteps(Boolean includeSteps) {
    
    this.includeSteps = includeSteps;
    return this;
  }

   /**
   * If autotest steps will be included
   * @return includeSteps
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeSteps() {
    return includeSteps;
  }


  public void setIncludeSteps(Boolean includeSteps) {
    this.includeSteps = includeSteps;
  }


  public AutotestsSelectModelIncludes includeLinks(Boolean includeLinks) {
    
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * If autotest links will be included
   * @return includeLinks
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeLinks() {
    return includeLinks;
  }


  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }


  public AutotestsSelectModelIncludes includeLabels(Boolean includeLabels) {
    
    this.includeLabels = includeLabels;
    return this;
  }

   /**
   * If autotest labels will be included
   * @return includeLabels
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeLabels() {
    return includeLabels;
  }


  public void setIncludeLabels(Boolean includeLabels) {
    this.includeLabels = includeLabels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotestsSelectModelIncludes autotestsSelectModelIncludes = (AutotestsSelectModelIncludes) o;
    return Objects.equals(this.includeSteps, autotestsSelectModelIncludes.includeSteps) &&
        Objects.equals(this.includeLinks, autotestsSelectModelIncludes.includeLinks) &&
        Objects.equals(this.includeLabels, autotestsSelectModelIncludes.includeLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSteps, includeLinks, includeLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutotestsSelectModelIncludes {\n");
    sb.append("    includeSteps: ").append(toIndentedString(includeSteps)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
    sb.append("    includeLabels: ").append(toIndentedString(includeLabels)).append("\n");
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
    openapiFields.add("includeSteps");
    openapiFields.add("includeLinks");
    openapiFields.add("includeLabels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutotestsSelectModelIncludes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutotestsSelectModelIncludes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutotestsSelectModelIncludes is not found in the empty JSON string", AutotestsSelectModelIncludes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutotestsSelectModelIncludes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutotestsSelectModelIncludes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutotestsSelectModelIncludes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutotestsSelectModelIncludes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutotestsSelectModelIncludes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutotestsSelectModelIncludes.class));

       return (TypeAdapter<T>) new TypeAdapter<AutotestsSelectModelIncludes>() {
           @Override
           public void write(JsonWriter out, AutotestsSelectModelIncludes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutotestsSelectModelIncludes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutotestsSelectModelIncludes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutotestsSelectModelIncludes
  * @throws IOException if the JSON string is invalid with respect to AutotestsSelectModelIncludes
  */
  public static AutotestsSelectModelIncludes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutotestsSelectModelIncludes.class);
  }

 /**
  * Convert an instance of AutotestsSelectModelIncludes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
