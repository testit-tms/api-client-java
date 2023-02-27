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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets ImageResizeType
 */
@JsonAdapter(ImageResizeType.Adapter.class)
public enum ImageResizeType {
  
  CROP("Crop"),
  
  ADDBACKGROUNDSTRIPES("AddBackgroundStripes");

  private String value;

  ImageResizeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageResizeType fromValue(String value) {
    for (ImageResizeType b : ImageResizeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ImageResizeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageResizeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageResizeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImageResizeType.fromValue(value);
    }
  }
}

