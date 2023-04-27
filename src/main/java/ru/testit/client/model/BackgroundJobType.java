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
 * Gets or Sets BackgroundJobType
 */
@JsonAdapter(BackgroundJobType.Adapter.class)
public enum BackgroundJobType {
  
  EXPORTXLSXTESTRESULTSBYTESTPLAN("ExportXlsxTestResultsByTestPlan"),
  
  EXPORTXLSXWORKITEMSBYPROJECT("ExportXlsxWorkItemsByProject"),
  
  EXPORTXLSXTESTPOINTSBYTESTPLAN("ExportXlsxTestPointsByTestPlan"),
  
  EXPORTJSONPROJECT("ExportJsonProject"),
  
  EXPORTZIPPROJECT("ExportZipProject"),
  
  EXPORTJSONPROJECTWITHTESTPLANS("ExportJsonProjectWithTestPlans"),
  
  EXPORTZIPPROJECTWITHTESTPLANS("ExportZipProjectWithTestPlans"),
  
  IMPORTJSONPROJECT("ImportJsonProject"),
  
  IMPORTZIPPROJECT("ImportZipProject"),
  
  IMPORTXLSXPROJECT("ImportXlsxProject"),
  
  IMPORTTESTRAILXMLPROJECT("ImportTestRailXmlProject");

  private String value;

  BackgroundJobType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackgroundJobType fromValue(String value) {
    for (BackgroundJobType b : BackgroundJobType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BackgroundJobType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackgroundJobType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackgroundJobType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackgroundJobType.fromValue(value);
    }
  }
}
