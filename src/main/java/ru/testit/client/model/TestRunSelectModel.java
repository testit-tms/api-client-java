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
import ru.testit.client.model.TestRunFilterModel;
import ru.testit.client.model.TestRunSelectModelExtractionModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * Model containing options to filter test runs
 */
@JsonPropertyOrder({
  TestRunSelectModel.JSON_PROPERTY_FILTER,
  TestRunSelectModel.JSON_PROPERTY_EXTRACTION_MODEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunSelectModel {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private JsonNullable<TestRunFilterModel> filter = JsonNullable.<TestRunFilterModel>undefined();

  public static final String JSON_PROPERTY_EXTRACTION_MODEL = "extractionModel";
  private JsonNullable<TestRunSelectModelExtractionModel> extractionModel = JsonNullable.<TestRunSelectModelExtractionModel>undefined();

  public TestRunSelectModel() { 
  }

  public TestRunSelectModel filter(TestRunFilterModel filter) {
    this.filter = JsonNullable.<TestRunFilterModel>of(filter);
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public TestRunFilterModel getFilter() {
        return filter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TestRunFilterModel> getFilter_JsonNullable() {
    return filter;
  }
  
  @JsonProperty(JSON_PROPERTY_FILTER)
  public void setFilter_JsonNullable(JsonNullable<TestRunFilterModel> filter) {
    this.filter = filter;
  }

  public void setFilter(TestRunFilterModel filter) {
    this.filter = JsonNullable.<TestRunFilterModel>of(filter);
  }


  public TestRunSelectModel extractionModel(TestRunSelectModelExtractionModel extractionModel) {
    this.extractionModel = JsonNullable.<TestRunSelectModelExtractionModel>of(extractionModel);
    return this;
  }

   /**
   * Get extractionModel
   * @return extractionModel
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public TestRunSelectModelExtractionModel getExtractionModel() {
        return extractionModel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTRACTION_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TestRunSelectModelExtractionModel> getExtractionModel_JsonNullable() {
    return extractionModel;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTRACTION_MODEL)
  public void setExtractionModel_JsonNullable(JsonNullable<TestRunSelectModelExtractionModel> extractionModel) {
    this.extractionModel = extractionModel;
  }

  public void setExtractionModel(TestRunSelectModelExtractionModel extractionModel) {
    this.extractionModel = JsonNullable.<TestRunSelectModelExtractionModel>of(extractionModel);
  }


  /**
   * Return true if this TestRunSelectModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunSelectModel testRunSelectModel = (TestRunSelectModel) o;
    return equalsNullable(this.filter, testRunSelectModel.filter) &&
        equalsNullable(this.extractionModel, testRunSelectModel.extractionModel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(filter), hashCodeNullable(extractionModel));
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
    sb.append("class TestRunSelectModel {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    extractionModel: ").append(toIndentedString(extractionModel)).append("\n");
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

