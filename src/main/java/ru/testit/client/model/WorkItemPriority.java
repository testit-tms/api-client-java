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
 * Gets or Sets WorkItemPriority
 */
@JsonAdapter(WorkItemPriority.Adapter.class)
public enum WorkItemPriority {
  
  LOWEST("Lowest"),
  
  LOW("Low"),
  
  MEDIUM("Medium"),
  
  HIGH("High"),
  
  HIGHEST("Highest");

  private String value;

  WorkItemPriority(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WorkItemPriority fromValue(String value) {
    for (WorkItemPriority b : WorkItemPriority.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WorkItemPriority> {
    @Override
    public void write(final JsonWriter jsonWriter, final WorkItemPriority enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WorkItemPriority read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WorkItemPriority.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WorkItemPriority.fromValue(value);
  }
}

