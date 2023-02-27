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
 * Gets or Sets NotificationTypeModel
 */
@JsonAdapter(NotificationTypeModel.Adapter.class)
public enum NotificationTypeModel {
  
  MENTIONINCOMMENT("MentionInComment"),
  
  TESTPOINTISSETINTESTPLAN("TestPointIsSetInTestPlan"),
  
  MENTIONINCUSTOMATTRIBUTE("MentionInCustomAttribute"),
  
  TESTPLANUNLOCKREQUEST("TestPlanUnlockRequest");

  private String value;

  NotificationTypeModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NotificationTypeModel fromValue(String value) {
    for (NotificationTypeModel b : NotificationTypeModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NotificationTypeModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final NotificationTypeModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NotificationTypeModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NotificationTypeModel.fromValue(value);
    }
  }
}

