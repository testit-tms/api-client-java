/*
 * API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.testit.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets WorkItemStates
 */
@JsonAdapter(WorkItemStates.Adapter.class)
public enum WorkItemStates {
  NEEDSWORK("NeedsWork"),
  NOTREADY("NotReady"),
  READY("Ready");

  private String value;

  WorkItemStates(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WorkItemStates fromValue(String input) {
    for (WorkItemStates b : WorkItemStates.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WorkItemStates> {
    @Override
    public void write(final JsonWriter jsonWriter, final WorkItemStates enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public WorkItemStates read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return WorkItemStates.fromValue((String)(value));
    }
  }
}
