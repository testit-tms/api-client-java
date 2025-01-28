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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.testit.client.model.ExternalFormAllowedValueModel;
import ru.testit.client.model.ExternalFormFieldModel;
import ru.testit.client.model.ExternalFormLinkModel;

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
 * ExternalFormCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalFormCreateModel {
  public static final String SERIALIZED_NAME_POSSIBLE_VALUES = "possibleValues";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_VALUES)
  private Map<String, List<ExternalFormAllowedValueModel>> possibleValues = new HashMap<>();

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<ExternalFormFieldModel> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ExternalFormLinkModel> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Map<String, Object> values = new HashMap<>();

  public ExternalFormCreateModel() {
  }

  public ExternalFormCreateModel possibleValues(Map<String, List<ExternalFormAllowedValueModel>> possibleValues) {
    
    this.possibleValues = possibleValues;
    return this;
  }

  public ExternalFormCreateModel putPossibleValuesItem(String key, List<ExternalFormAllowedValueModel> possibleValuesItem) {
    if (this.possibleValues == null) {
      this.possibleValues = new HashMap<>();
    }
    this.possibleValues.put(key, possibleValuesItem);
    return this;
  }

   /**
   * Get possibleValues
   * @return possibleValues
  **/
  @javax.annotation.Nonnull
  public Map<String, List<ExternalFormAllowedValueModel>> getPossibleValues() {
    return possibleValues;
  }


  public void setPossibleValues(Map<String, List<ExternalFormAllowedValueModel>> possibleValues) {
    this.possibleValues = possibleValues;
  }


  public ExternalFormCreateModel fields(List<ExternalFormFieldModel> fields) {
    
    this.fields = fields;
    return this;
  }

  public ExternalFormCreateModel addFieldsItem(ExternalFormFieldModel fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nonnull
  public List<ExternalFormFieldModel> getFields() {
    return fields;
  }


  public void setFields(List<ExternalFormFieldModel> fields) {
    this.fields = fields;
  }


  public ExternalFormCreateModel links(List<ExternalFormLinkModel> links) {
    
    this.links = links;
    return this;
  }

  public ExternalFormCreateModel addLinksItem(ExternalFormLinkModel linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull
  public List<ExternalFormLinkModel> getLinks() {
    return links;
  }


  public void setLinks(List<ExternalFormLinkModel> links) {
    this.links = links;
  }


  public ExternalFormCreateModel values(Map<String, Object> values) {
    
    this.values = values;
    return this;
  }

  public ExternalFormCreateModel putValuesItem(String key, Object valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nonnull
  public Map<String, Object> getValues() {
    return values;
  }


  public void setValues(Map<String, Object> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalFormCreateModel externalFormCreateModel = (ExternalFormCreateModel) o;
    return Objects.equals(this.possibleValues, externalFormCreateModel.possibleValues) &&
        Objects.equals(this.fields, externalFormCreateModel.fields) &&
        Objects.equals(this.links, externalFormCreateModel.links) &&
        Objects.equals(this.values, externalFormCreateModel.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(possibleValues, fields, links, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalFormCreateModel {\n");
    sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("possibleValues");
    openapiFields.add("fields");
    openapiFields.add("links");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("possibleValues");
    openapiRequiredFields.add("fields");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalFormCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalFormCreateModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalFormCreateModel is not found in the empty JSON string", ExternalFormCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalFormCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalFormCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalFormCreateModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }

      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      // validate the required field `fields` (array)
      for (int i = 0; i < jsonArrayfields.size(); i++) {
        ExternalFormFieldModel.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        ExternalFormLinkModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalFormCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalFormCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalFormCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalFormCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalFormCreateModel>() {
           @Override
           public void write(JsonWriter out, ExternalFormCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalFormCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalFormCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalFormCreateModel
  * @throws IOException if the JSON string is invalid with respect to ExternalFormCreateModel
  */
  public static ExternalFormCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalFormCreateModel.class);
  }

 /**
  * Convert an instance of ExternalFormCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

