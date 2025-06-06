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
 * Gets or Sets AutotestResultOutcome
 */
@JsonAdapter(AutotestResultOutcome.Adapter.class)
public enum AutotestResultOutcome {
  
  IN_PROGRESS("InProgress"),
  
  PASSED("Passed"),
  
  FAILED("Failed"),
  
  SKIPPED("Skipped"),
  
  BLOCKED("Blocked");

  private String value;

  AutotestResultOutcome(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AutotestResultOutcome fromValue(String value) {
    for (AutotestResultOutcome b : AutotestResultOutcome.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AutotestResultOutcome> {
    @Override
    public void write(final JsonWriter jsonWriter, final AutotestResultOutcome enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AutotestResultOutcome read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AutotestResultOutcome.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AutotestResultOutcome.fromValue(value);
  }
}

