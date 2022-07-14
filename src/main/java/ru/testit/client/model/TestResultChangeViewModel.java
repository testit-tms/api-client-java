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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestResultChangeViewModel
 */
@JsonPropertyOrder({
  TestResultChangeViewModel.JSON_PROPERTY_TEST_POINT_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultChangeViewModel {
  public static final String JSON_PROPERTY_TEST_POINT_COUNT = "testPointCount";
  private Long testPointCount;

  public TestResultChangeViewModel() { 
  }

  public TestResultChangeViewModel testPointCount(Long testPointCount) {
    this.testPointCount = testPointCount;
    return this;
  }

   /**
   * Get testPointCount
   * @return testPointCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_POINT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTestPointCount() {
    return testPointCount;
  }


  @JsonProperty(JSON_PROPERTY_TEST_POINT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPointCount(Long testPointCount) {
    this.testPointCount = testPointCount;
  }


  /**
   * Return true if this TestResultChangeViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultChangeViewModel testResultChangeViewModel = (TestResultChangeViewModel) o;
    return Objects.equals(this.testPointCount, testResultChangeViewModel.testPointCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testPointCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultChangeViewModel {\n");
    sb.append("    testPointCount: ").append(toIndentedString(testPointCount)).append("\n");
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

