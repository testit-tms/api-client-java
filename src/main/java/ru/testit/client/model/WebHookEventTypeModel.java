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
 * Gets or Sets WebHookEventTypeModel
 */
@JsonAdapter(WebHookEventTypeModel.Adapter.class)
public enum WebHookEventTypeModel {
  
  AUTOMATEDTESTRUNCREATED("AutomatedTestRunCreated"),
  
  TESTPLANSSTATUSCHANGED("TestPlansStatusChanged"),
  
  TESTRUNSTOPPED("TestRunStopped"),
  
  TESTPOINTASSIGNED("TestPointAssigned"),
  
  TESTRESULTJIRAISSUECREATED("TestResultJiraIssueCreated"),
  
  AUTOTESTFINISHED("AutoTestFinished"),
  
  USERMENTIONEDINCOMMENT("UserMentionedInComment"),
  
  USERSELECTEDINWORKITEMATTRIBUTE("UserSelectedInWorkItemAttribute"),
  
  ALLTESTPOINTSFINISHED("AllTestPointsFinished"),
  
  ALLAUTOTESTSFINISHED("AllAutoTestsFinished"),
  
  AUTOTESTCHANGED("AutoTestChanged"),
  
  WORKITEMAUTOTESTRELATIONCHANGED("WorkItemAutoTestRelationChanged"),
  
  WORKITEMATTRIBUTECHANGED("WorkItemAttributeChanged"),
  
  WORKITEMCHANGED("WorkItemChanged"),
  
  CONFIGURATIONCHANGED("ConfigurationChanged"),
  
  PROJECTCHANGED("ProjectChanged"),
  
  TESTPLANCHANGED("TestPlanChanged");

  private String value;

  WebHookEventTypeModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebHookEventTypeModel fromValue(String value) {
    for (WebHookEventTypeModel b : WebHookEventTypeModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebHookEventTypeModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebHookEventTypeModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebHookEventTypeModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebHookEventTypeModel.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WebHookEventTypeModel.fromValue(value);
  }
}

