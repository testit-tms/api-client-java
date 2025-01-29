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
 * Gets or Sets TestPlanStatus
 */
@JsonAdapter(TestPlanStatus.Adapter.class)
public enum TestPlanStatus {
  
  NEW("New"),
  
  IN_PROGRESS("InProgress"),
  
  PAUSED("Paused"),
  
  COMPLETED("Completed");

  private String value;

  TestPlanStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TestPlanStatus fromValue(String value) {
    for (TestPlanStatus b : TestPlanStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TestPlanStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TestPlanStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TestPlanStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TestPlanStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TestPlanStatus.fromValue(value);
  }
}

