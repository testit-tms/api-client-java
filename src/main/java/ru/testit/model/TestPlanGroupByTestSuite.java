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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * TestPlanGroupByTestSuite
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class TestPlanGroupByTestSuite {
  @SerializedName("testSuiteId")
  private UUID testSuiteId = null;

  @SerializedName("testSuiteName")
  private String testSuiteName = null;

  @SerializedName("value")
  private Integer value = null;

  public TestPlanGroupByTestSuite testSuiteId(UUID testSuiteId) {
    this.testSuiteId = testSuiteId;
    return this;
  }

   /**
   * Get testSuiteId
   * @return testSuiteId
  **/
  @Schema(description = "")
  public UUID getTestSuiteId() {
    return testSuiteId;
  }

  public void setTestSuiteId(UUID testSuiteId) {
    this.testSuiteId = testSuiteId;
  }

  public TestPlanGroupByTestSuite testSuiteName(String testSuiteName) {
    this.testSuiteName = testSuiteName;
    return this;
  }

   /**
   * Get testSuiteName
   * @return testSuiteName
  **/
  @Schema(description = "")
  public String getTestSuiteName() {
    return testSuiteName;
  }

  public void setTestSuiteName(String testSuiteName) {
    this.testSuiteName = testSuiteName;
  }

  public TestPlanGroupByTestSuite value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanGroupByTestSuite testPlanGroupByTestSuite = (TestPlanGroupByTestSuite) o;
    return Objects.equals(this.testSuiteId, testPlanGroupByTestSuite.testSuiteId) &&
        Objects.equals(this.testSuiteName, testPlanGroupByTestSuite.testSuiteName) &&
        Objects.equals(this.value, testPlanGroupByTestSuite.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testSuiteId, testSuiteName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestPlanGroupByTestSuite {\n");
    
    sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
    sb.append("    testSuiteName: ").append(toIndentedString(testSuiteName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
