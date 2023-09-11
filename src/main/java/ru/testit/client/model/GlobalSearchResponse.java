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
import java.util.ArrayList;
import java.util.List;
import ru.testit.client.model.GlobalSearchItemResult;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * GlobalSearchResponse
 */
@JsonPropertyOrder({
  GlobalSearchResponse.JSON_PROPERTY_RESULTS,
  GlobalSearchResponse.JSON_PROPERTY_MORE_RESULTS_AVAILABLE,
  GlobalSearchResponse.JSON_PROPERTY_AVAILABLE_RESOURCE_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GlobalSearchResponse {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<GlobalSearchItemResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_MORE_RESULTS_AVAILABLE = "moreResultsAvailable";
  private Boolean moreResultsAvailable;

  public static final String JSON_PROPERTY_AVAILABLE_RESOURCE_TYPES = "availableResourceTypes";
  private List<String> availableResourceTypes = new ArrayList<>();

  public GlobalSearchResponse() { 
  }

  public GlobalSearchResponse results(List<GlobalSearchItemResult> results) {
    this.results = results;
    return this;
  }

  public GlobalSearchResponse addResultsItem(GlobalSearchItemResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GlobalSearchItemResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResults(List<GlobalSearchItemResult> results) {
    this.results = results;
  }


  public GlobalSearchResponse moreResultsAvailable(Boolean moreResultsAvailable) {
    this.moreResultsAvailable = moreResultsAvailable;
    return this;
  }

   /**
   * Get moreResultsAvailable
   * @return moreResultsAvailable
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MORE_RESULTS_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMoreResultsAvailable() {
    return moreResultsAvailable;
  }


  @JsonProperty(JSON_PROPERTY_MORE_RESULTS_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMoreResultsAvailable(Boolean moreResultsAvailable) {
    this.moreResultsAvailable = moreResultsAvailable;
  }


  public GlobalSearchResponse availableResourceTypes(List<String> availableResourceTypes) {
    this.availableResourceTypes = availableResourceTypes;
    return this;
  }

  public GlobalSearchResponse addAvailableResourceTypesItem(String availableResourceTypesItem) {
    if (this.availableResourceTypes == null) {
      this.availableResourceTypes = new ArrayList<>();
    }
    this.availableResourceTypes.add(availableResourceTypesItem);
    return this;
  }

   /**
   * Get availableResourceTypes
   * @return availableResourceTypes
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABLE_RESOURCE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAvailableResourceTypes() {
    return availableResourceTypes;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_RESOURCE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableResourceTypes(List<String> availableResourceTypes) {
    this.availableResourceTypes = availableResourceTypes;
  }


  /**
   * Return true if this GlobalSearchResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalSearchResponse globalSearchResponse = (GlobalSearchResponse) o;
    return Objects.equals(this.results, globalSearchResponse.results) &&
        Objects.equals(this.moreResultsAvailable, globalSearchResponse.moreResultsAvailable) &&
        Objects.equals(this.availableResourceTypes, globalSearchResponse.availableResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, moreResultsAvailable, availableResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSearchResponse {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    moreResultsAvailable: ").append(toIndentedString(moreResultsAvailable)).append("\n");
    sb.append("    availableResourceTypes: ").append(toIndentedString(availableResourceTypes)).append("\n");
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

