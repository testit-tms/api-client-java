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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CustomAttributeTypesEnum
 */
@JsonAdapter(CustomAttributeTypesEnum.Adapter.class)
public enum CustomAttributeTypesEnum {
  
  STRING("string"),
  
  DATETIME("datetime"),
  
  OPTIONS("options"),
  
  USER("user"),
  
  MULTIPLE_OPTIONS("multipleOptions"),
  
  CHECKBOX("checkbox");

  private String value;

  CustomAttributeTypesEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomAttributeTypesEnum fromValue(String value) {
    for (CustomAttributeTypesEnum b : CustomAttributeTypesEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CustomAttributeTypesEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomAttributeTypesEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomAttributeTypesEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CustomAttributeTypesEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CustomAttributeTypesEnum.fromValue(value);
  }
}

