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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutotestSelectModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ApiV2AutoTestsFlakyBulkPostRequest
 */
@JsonPropertyOrder({
  ApiV2AutoTestsFlakyBulkPostRequest.JSON_PROPERTY_AUTOTEST_SELECT,
  ApiV2AutoTestsFlakyBulkPostRequest.JSON_PROPERTY_VALUE
})
@JsonTypeName("_api_v2_autoTests_flaky_bulk_post_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2AutoTestsFlakyBulkPostRequest {
  public static final String JSON_PROPERTY_AUTOTEST_SELECT = "autotestSelect";
  private JsonNullable<AutotestSelectModel> autotestSelect = JsonNullable.<AutotestSelectModel>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  private Boolean value;

  public ApiV2AutoTestsFlakyBulkPostRequest() { 
  }

  public ApiV2AutoTestsFlakyBulkPostRequest autotestSelect(AutotestSelectModel autotestSelect) {
    this.autotestSelect = JsonNullable.<AutotestSelectModel>of(autotestSelect);
    return this;
  }

   /**
   * Get autotestSelect
   * @return autotestSelect
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public AutotestSelectModel getAutotestSelect() {
        return autotestSelect.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTOTEST_SELECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AutotestSelectModel> getAutotestSelect_JsonNullable() {
    return autotestSelect;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTOTEST_SELECT)
  public void setAutotestSelect_JsonNullable(JsonNullable<AutotestSelectModel> autotestSelect) {
    this.autotestSelect = autotestSelect;
  }

  public void setAutotestSelect(AutotestSelectModel autotestSelect) {
    this.autotestSelect = JsonNullable.<AutotestSelectModel>of(autotestSelect);
  }


  public ApiV2AutoTestsFlakyBulkPostRequest value(Boolean value) {
    this.value = value;
    return this;
  }

   /**
   * Are autotests flaky
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Boolean value) {
    this.value = value;
  }


  /**
   * Return true if this _api_v2_autoTests_flaky_bulk_post_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2AutoTestsFlakyBulkPostRequest apiV2AutoTestsFlakyBulkPostRequest = (ApiV2AutoTestsFlakyBulkPostRequest) o;
    return equalsNullable(this.autotestSelect, apiV2AutoTestsFlakyBulkPostRequest.autotestSelect) &&
        Objects.equals(this.value, apiV2AutoTestsFlakyBulkPostRequest.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(autotestSelect), value);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV2AutoTestsFlakyBulkPostRequest {\n");
    sb.append("    autotestSelect: ").append(toIndentedString(autotestSelect)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

