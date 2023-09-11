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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets WebHookEventType
 */
public enum WebHookEventType {
  
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

  WebHookEventType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WebHookEventType fromValue(String value) {
    for (WebHookEventType b : WebHookEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

