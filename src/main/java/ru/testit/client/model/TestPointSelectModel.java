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
import ru.testit.client.model.TestPointFilterModel;
import ru.testit.client.model.TestPointsExtractionModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestPointSelectModel
 */
@JsonPropertyOrder({
  TestPointSelectModel.JSON_PROPERTY_FILTER,
  TestPointSelectModel.JSON_PROPERTY_EXTRACTION_MODEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointSelectModel {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private JsonNullable<TestPointFilterModel> filter = JsonNullable.<TestPointFilterModel>undefined();

  public static final String JSON_PROPERTY_EXTRACTION_MODEL = "extractionModel";
  private JsonNullable<TestPointsExtractionModel> extractionModel = JsonNullable.<TestPointsExtractionModel>undefined();

  public TestPointSelectModel() { 
  }

  public TestPointSelectModel filter(TestPointFilterModel filter) {
    this.filter = JsonNullable.<TestPointFilterModel>of(filter);
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public TestPointFilterModel getFilter() {
        return filter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TestPointFilterModel> getFilter_JsonNullable() {
    return filter;
  }
  
  @JsonProperty(JSON_PROPERTY_FILTER)
  public void setFilter_JsonNullable(JsonNullable<TestPointFilterModel> filter) {
    this.filter = filter;
  }

  public void setFilter(TestPointFilterModel filter) {
    this.filter = JsonNullable.<TestPointFilterModel>of(filter);
  }


  public TestPointSelectModel extractionModel(TestPointsExtractionModel extractionModel) {
    this.extractionModel = JsonNullable.<TestPointsExtractionModel>of(extractionModel);
    return this;
  }

   /**
   * Get extractionModel
   * @return extractionModel
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public TestPointsExtractionModel getExtractionModel() {
        return extractionModel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTRACTION_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TestPointsExtractionModel> getExtractionModel_JsonNullable() {
    return extractionModel;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTRACTION_MODEL)
  public void setExtractionModel_JsonNullable(JsonNullable<TestPointsExtractionModel> extractionModel) {
    this.extractionModel = extractionModel;
  }

  public void setExtractionModel(TestPointsExtractionModel extractionModel) {
    this.extractionModel = JsonNullable.<TestPointsExtractionModel>of(extractionModel);
  }


  /**
   * Return true if this TestPointSelectModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointSelectModel testPointSelectModel = (TestPointSelectModel) o;
    return equalsNullable(this.filter, testPointSelectModel.filter) &&
        equalsNullable(this.extractionModel, testPointSelectModel.extractionModel);
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
    sb.append("class TestPointSelectModel {\n");
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

