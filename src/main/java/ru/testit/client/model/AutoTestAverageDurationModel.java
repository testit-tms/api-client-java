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
 * AutoTestAverageDurationModel
 */
@JsonPropertyOrder({
  AutoTestAverageDurationModel.JSON_PROPERTY_PASSED_AVERAGE_DURATION,
  AutoTestAverageDurationModel.JSON_PROPERTY_FAILED_AVERAGE_DURATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestAverageDurationModel {
  public static final String JSON_PROPERTY_PASSED_AVERAGE_DURATION = "passedAverageDuration";
  private Double passedAverageDuration;

  public static final String JSON_PROPERTY_FAILED_AVERAGE_DURATION = "failedAverageDuration";
  private Double failedAverageDuration;

  public AutoTestAverageDurationModel() { 
  }

  public AutoTestAverageDurationModel passedAverageDuration(Double passedAverageDuration) {
    this.passedAverageDuration = passedAverageDuration;
    return this;
  }

   /**
   * Get passedAverageDuration
   * @return passedAverageDuration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2.5555", value = "")
  @JsonProperty(JSON_PROPERTY_PASSED_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPassedAverageDuration() {
    return passedAverageDuration;
  }


  @JsonProperty(JSON_PROPERTY_PASSED_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassedAverageDuration(Double passedAverageDuration) {
    this.passedAverageDuration = passedAverageDuration;
  }


  public AutoTestAverageDurationModel failedAverageDuration(Double failedAverageDuration) {
    this.failedAverageDuration = failedAverageDuration;
    return this;
  }

   /**
   * Get failedAverageDuration
   * @return failedAverageDuration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2.5555", value = "")
  @JsonProperty(JSON_PROPERTY_FAILED_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFailedAverageDuration() {
    return failedAverageDuration;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedAverageDuration(Double failedAverageDuration) {
    this.failedAverageDuration = failedAverageDuration;
  }


  /**
   * Return true if this AutoTestAverageDurationModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestAverageDurationModel autoTestAverageDurationModel = (AutoTestAverageDurationModel) o;
    return Objects.equals(this.passedAverageDuration, autoTestAverageDurationModel.passedAverageDuration) &&
        Objects.equals(this.failedAverageDuration, autoTestAverageDurationModel.failedAverageDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passedAverageDuration, failedAverageDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoTestAverageDurationModel {\n");
    sb.append("    passedAverageDuration: ").append(toIndentedString(passedAverageDuration)).append("\n");
    sb.append("    failedAverageDuration: ").append(toIndentedString(failedAverageDuration)).append("\n");
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

