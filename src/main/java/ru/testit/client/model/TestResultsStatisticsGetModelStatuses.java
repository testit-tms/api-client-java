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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * Test results counts aggregated by outcome
 */
@JsonPropertyOrder({
  TestResultsStatisticsGetModelStatuses.JSON_PROPERTY_IN_PROGRESS,
  TestResultsStatisticsGetModelStatuses.JSON_PROPERTY_PASSED,
  TestResultsStatisticsGetModelStatuses.JSON_PROPERTY_FAILED,
  TestResultsStatisticsGetModelStatuses.JSON_PROPERTY_SKIPPED,
  TestResultsStatisticsGetModelStatuses.JSON_PROPERTY_BLOCKED
})
@JsonTypeName("TestResultsStatisticsGetModel_statuses")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsStatisticsGetModelStatuses {
  public static final String JSON_PROPERTY_IN_PROGRESS = "inProgress";
  private Integer inProgress;

  public static final String JSON_PROPERTY_PASSED = "passed";
  private Integer passed;

  public static final String JSON_PROPERTY_FAILED = "failed";
  private Integer failed;

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  private Integer skipped;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private Integer blocked;

  public TestResultsStatisticsGetModelStatuses() { 
  }

  public TestResultsStatisticsGetModelStatuses inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

   /**
   * Number of test results which is running currently
   * @return inProgress
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getInProgress() {
    return inProgress;
  }


  @JsonProperty(JSON_PROPERTY_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }


  public TestResultsStatisticsGetModelStatuses passed(Integer passed) {
    this.passed = passed;
    return this;
  }

   /**
   * Number of test results which successfully passed
   * @return passed
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPassed() {
    return passed;
  }


  @JsonProperty(JSON_PROPERTY_PASSED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassed(Integer passed) {
    this.passed = passed;
  }


  public TestResultsStatisticsGetModelStatuses failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Number of test results which failed with an error
   * @return failed
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFailed() {
    return failed;
  }


  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public TestResultsStatisticsGetModelStatuses skipped(Integer skipped) {
    this.skipped = skipped;
    return this;
  }

   /**
   * Number of test results which did not run and were skipped
   * @return skipped
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SKIPPED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSkipped() {
    return skipped;
  }


  @JsonProperty(JSON_PROPERTY_SKIPPED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }


  public TestResultsStatisticsGetModelStatuses blocked(Integer blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Number of test results which cannot be launched
   * @return blocked
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBlocked() {
    return blocked;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlocked(Integer blocked) {
    this.blocked = blocked;
  }


  /**
   * Return true if this TestResultsStatisticsGetModel_statuses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsStatisticsGetModelStatuses testResultsStatisticsGetModelStatuses = (TestResultsStatisticsGetModelStatuses) o;
    return Objects.equals(this.inProgress, testResultsStatisticsGetModelStatuses.inProgress) &&
        Objects.equals(this.passed, testResultsStatisticsGetModelStatuses.passed) &&
        Objects.equals(this.failed, testResultsStatisticsGetModelStatuses.failed) &&
        Objects.equals(this.skipped, testResultsStatisticsGetModelStatuses.skipped) &&
        Objects.equals(this.blocked, testResultsStatisticsGetModelStatuses.blocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProgress, passed, failed, skipped, blocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultsStatisticsGetModelStatuses {\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

