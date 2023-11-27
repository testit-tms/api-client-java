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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ActionUpdate
 */
@JsonAdapter(ActionUpdate.Adapter.class)
public enum ActionUpdate {
  
  ADD("Add"),
  
  REPLACE("Replace"),
  
  TOREMOVE("ToRemove"),
  
  CLEARALL("ClearAll");

  private String value;

  ActionUpdate(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionUpdate fromValue(String value) {
    for (ActionUpdate b : ActionUpdate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActionUpdate> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActionUpdate enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActionUpdate read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActionUpdate.fromValue(value);
    }
  }
}

