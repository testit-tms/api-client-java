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
 * ExternalFormFieldModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ExternalFormFieldModel {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  @javax.annotation.Nullable
  private String fieldId;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  @javax.annotation.Nullable
  private String fieldName;

  public static final String SERIALIZED_NAME_HELP_TEXT = "helpText";
  @SerializedName(SERIALIZED_NAME_HELP_TEXT)
  @javax.annotation.Nullable
  private String helpText;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_ARRAY_VALUES_TYPE = "arrayValuesType";
  @SerializedName(SERIALIZED_NAME_ARRAY_VALUES_TYPE)
  @javax.annotation.Nullable
  private String arrayValuesType;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  @javax.annotation.Nullable
  private Object defaultValue = null;

  public static final String SERIALIZED_NAME_IS_CUSTOM_VALUE_ALLOWED = "isCustomValueAllowed";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOM_VALUE_ALLOWED)
  @javax.annotation.Nonnull
  private Boolean isCustomValueAllowed;

  public static final String SERIALIZED_NAME_AUTO_COMPLETE_URL = "autoCompleteUrl";
  @SerializedName(SERIALIZED_NAME_AUTO_COMPLETE_URL)
  @javax.annotation.Nullable
  private String autoCompleteUrl;

  public static final String SERIALIZED_NAME_CONTROL_TYPE = "controlType";
  @SerializedName(SERIALIZED_NAME_CONTROL_TYPE)
  @javax.annotation.Nullable
  private String controlType;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "minLength";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  @javax.annotation.Nullable
  private Integer minLength;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  @javax.annotation.Nullable
  private Integer maxLength;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  @javax.annotation.Nullable
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  @javax.annotation.Nullable
  private Object min = null;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  @javax.annotation.Nullable
  private Object max = null;

  public ExternalFormFieldModel() {
  }

  public ExternalFormFieldModel fieldId(@javax.annotation.Nullable String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Get fieldId
   * @return fieldId
   */
  @javax.annotation.Nullable
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(@javax.annotation.Nullable String fieldId) {
    this.fieldId = fieldId;
  }


  public ExternalFormFieldModel fieldName(@javax.annotation.Nullable String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(@javax.annotation.Nullable String fieldName) {
    this.fieldName = fieldName;
  }


  public ExternalFormFieldModel helpText(@javax.annotation.Nullable String helpText) {
    this.helpText = helpText;
    return this;
  }

  /**
   * Get helpText
   * @return helpText
   */
  @javax.annotation.Nullable
  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(@javax.annotation.Nullable String helpText) {
    this.helpText = helpText;
  }


  public ExternalFormFieldModel type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public ExternalFormFieldModel arrayValuesType(@javax.annotation.Nullable String arrayValuesType) {
    this.arrayValuesType = arrayValuesType;
    return this;
  }

  /**
   * Get arrayValuesType
   * @return arrayValuesType
   */
  @javax.annotation.Nullable
  public String getArrayValuesType() {
    return arrayValuesType;
  }

  public void setArrayValuesType(@javax.annotation.Nullable String arrayValuesType) {
    this.arrayValuesType = arrayValuesType;
  }


  public ExternalFormFieldModel defaultValue(@javax.annotation.Nullable Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   */
  @javax.annotation.Nullable
  public Object getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(@javax.annotation.Nullable Object defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ExternalFormFieldModel isCustomValueAllowed(@javax.annotation.Nonnull Boolean isCustomValueAllowed) {
    this.isCustomValueAllowed = isCustomValueAllowed;
    return this;
  }

  /**
   * Get isCustomValueAllowed
   * @return isCustomValueAllowed
   */
  @javax.annotation.Nonnull
  public Boolean getIsCustomValueAllowed() {
    return isCustomValueAllowed;
  }

  public void setIsCustomValueAllowed(@javax.annotation.Nonnull Boolean isCustomValueAllowed) {
    this.isCustomValueAllowed = isCustomValueAllowed;
  }


  public ExternalFormFieldModel autoCompleteUrl(@javax.annotation.Nullable String autoCompleteUrl) {
    this.autoCompleteUrl = autoCompleteUrl;
    return this;
  }

  /**
   * Get autoCompleteUrl
   * @return autoCompleteUrl
   */
  @javax.annotation.Nullable
  public String getAutoCompleteUrl() {
    return autoCompleteUrl;
  }

  public void setAutoCompleteUrl(@javax.annotation.Nullable String autoCompleteUrl) {
    this.autoCompleteUrl = autoCompleteUrl;
  }


  public ExternalFormFieldModel controlType(@javax.annotation.Nullable String controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * Get controlType
   * @return controlType
   */
  @javax.annotation.Nullable
  public String getControlType() {
    return controlType;
  }

  public void setControlType(@javax.annotation.Nullable String controlType) {
    this.controlType = controlType;
  }


  public ExternalFormFieldModel minLength(@javax.annotation.Nullable Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
   */
  @javax.annotation.Nullable
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(@javax.annotation.Nullable Integer minLength) {
    this.minLength = minLength;
  }


  public ExternalFormFieldModel maxLength(@javax.annotation.Nullable Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
   */
  @javax.annotation.Nullable
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(@javax.annotation.Nullable Integer maxLength) {
    this.maxLength = maxLength;
  }


  public ExternalFormFieldModel isRequired(@javax.annotation.Nullable Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   * @return isRequired
   */
  @javax.annotation.Nullable
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(@javax.annotation.Nullable Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public ExternalFormFieldModel min(@javax.annotation.Nullable Object min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   */
  @javax.annotation.Nullable
  public Object getMin() {
    return min;
  }

  public void setMin(@javax.annotation.Nullable Object min) {
    this.min = min;
  }


  public ExternalFormFieldModel max(@javax.annotation.Nullable Object max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   */
  @javax.annotation.Nullable
  public Object getMax() {
    return max;
  }

  public void setMax(@javax.annotation.Nullable Object max) {
    this.max = max;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalFormFieldModel externalFormFieldModel = (ExternalFormFieldModel) o;
    return Objects.equals(this.fieldId, externalFormFieldModel.fieldId) &&
        Objects.equals(this.fieldName, externalFormFieldModel.fieldName) &&
        Objects.equals(this.helpText, externalFormFieldModel.helpText) &&
        Objects.equals(this.type, externalFormFieldModel.type) &&
        Objects.equals(this.arrayValuesType, externalFormFieldModel.arrayValuesType) &&
        Objects.equals(this.defaultValue, externalFormFieldModel.defaultValue) &&
        Objects.equals(this.isCustomValueAllowed, externalFormFieldModel.isCustomValueAllowed) &&
        Objects.equals(this.autoCompleteUrl, externalFormFieldModel.autoCompleteUrl) &&
        Objects.equals(this.controlType, externalFormFieldModel.controlType) &&
        Objects.equals(this.minLength, externalFormFieldModel.minLength) &&
        Objects.equals(this.maxLength, externalFormFieldModel.maxLength) &&
        Objects.equals(this.isRequired, externalFormFieldModel.isRequired) &&
        Objects.equals(this.min, externalFormFieldModel.min) &&
        Objects.equals(this.max, externalFormFieldModel.max);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, fieldName, helpText, type, arrayValuesType, defaultValue, isCustomValueAllowed, autoCompleteUrl, controlType, minLength, maxLength, isRequired, min, max);
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
    sb.append("class ExternalFormFieldModel {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    arrayValuesType: ").append(toIndentedString(arrayValuesType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    isCustomValueAllowed: ").append(toIndentedString(isCustomValueAllowed)).append("\n");
    sb.append("    autoCompleteUrl: ").append(toIndentedString(autoCompleteUrl)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
    openapiFields.add("fieldId");
    openapiFields.add("fieldName");
    openapiFields.add("helpText");
    openapiFields.add("type");
    openapiFields.add("arrayValuesType");
    openapiFields.add("defaultValue");
    openapiFields.add("isCustomValueAllowed");
    openapiFields.add("autoCompleteUrl");
    openapiFields.add("controlType");
    openapiFields.add("minLength");
    openapiFields.add("maxLength");
    openapiFields.add("isRequired");
    openapiFields.add("min");
    openapiFields.add("max");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isCustomValueAllowed");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExternalFormFieldModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExternalFormFieldModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalFormFieldModel is not found in the empty JSON string", ExternalFormFieldModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExternalFormFieldModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalFormFieldModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalFormFieldModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fieldId") != null && !jsonObj.get("fieldId").isJsonNull()) && !jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      if ((jsonObj.get("helpText") != null && !jsonObj.get("helpText").isJsonNull()) && !jsonObj.get("helpText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `helpText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("helpText").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("arrayValuesType") != null && !jsonObj.get("arrayValuesType").isJsonNull()) && !jsonObj.get("arrayValuesType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arrayValuesType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arrayValuesType").toString()));
      }
      if ((jsonObj.get("autoCompleteUrl") != null && !jsonObj.get("autoCompleteUrl").isJsonNull()) && !jsonObj.get("autoCompleteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoCompleteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoCompleteUrl").toString()));
      }
      if ((jsonObj.get("controlType") != null && !jsonObj.get("controlType").isJsonNull()) && !jsonObj.get("controlType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controlType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controlType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalFormFieldModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalFormFieldModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalFormFieldModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalFormFieldModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalFormFieldModel>() {
           @Override
           public void write(JsonWriter out, ExternalFormFieldModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalFormFieldModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExternalFormFieldModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExternalFormFieldModel
   * @throws IOException if the JSON string is invalid with respect to ExternalFormFieldModel
   */
  public static ExternalFormFieldModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalFormFieldModel.class);
  }

  /**
   * Convert an instance of ExternalFormFieldModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

