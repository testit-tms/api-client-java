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
 * BooleanTestPlanChangedFieldViewModel
 */
@JsonPropertyOrder({
  BooleanTestPlanChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  BooleanTestPlanChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BooleanTestPlanChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private Boolean oldValue;

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private Boolean newValue;

  public BooleanTestPlanChangedFieldViewModel() { 
  }

  public BooleanTestPlanChangedFieldViewModel oldValue(Boolean oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOldValue() {
    return oldValue;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldValue(Boolean oldValue) {
    this.oldValue = oldValue;
  }


  public BooleanTestPlanChangedFieldViewModel newValue(Boolean newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNewValue() {
    return newValue;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewValue(Boolean newValue) {
    this.newValue = newValue;
  }


  /**
   * Return true if this BooleanTestPlanChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BooleanTestPlanChangedFieldViewModel booleanTestPlanChangedFieldViewModel = (BooleanTestPlanChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, booleanTestPlanChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, booleanTestPlanChangedFieldViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooleanTestPlanChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

