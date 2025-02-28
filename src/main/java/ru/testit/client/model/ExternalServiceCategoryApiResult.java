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
 * Gets or Sets ExternalServiceCategoryApiResult
 */
@JsonAdapter(ExternalServiceCategoryApiResult.Adapter.class)
public enum ExternalServiceCategoryApiResult {
  
  AI("AI"),
  
  ISSUE_TRACKER("IssueTracker");

  private String value;

  ExternalServiceCategoryApiResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExternalServiceCategoryApiResult fromValue(String value) {
    for (ExternalServiceCategoryApiResult b : ExternalServiceCategoryApiResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExternalServiceCategoryApiResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExternalServiceCategoryApiResult enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExternalServiceCategoryApiResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExternalServiceCategoryApiResult.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ExternalServiceCategoryApiResult.fromValue(value);
  }
}

