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
 * SearchAutoTestsQueryIncludesModel
 */
@JsonPropertyOrder({
  SearchAutoTestsQueryIncludesModel.JSON_PROPERTY_INCLUDE_STEPS,
  SearchAutoTestsQueryIncludesModel.JSON_PROPERTY_INCLUDE_LINKS,
  SearchAutoTestsQueryIncludesModel.JSON_PROPERTY_INCLUDE_LABELS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchAutoTestsQueryIncludesModel {
  public static final String JSON_PROPERTY_INCLUDE_STEPS = "includeSteps";
  private Boolean includeSteps;

  public static final String JSON_PROPERTY_INCLUDE_LINKS = "includeLinks";
  private Boolean includeLinks;

  public static final String JSON_PROPERTY_INCLUDE_LABELS = "includeLabels";
  private Boolean includeLabels;

  public SearchAutoTestsQueryIncludesModel() { 
  }

  public SearchAutoTestsQueryIncludesModel includeSteps(Boolean includeSteps) {
    this.includeSteps = includeSteps;
    return this;
  }

   /**
   * If autotest steps will be included
   * @return includeSteps
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeSteps() {
    return includeSteps;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeSteps(Boolean includeSteps) {
    this.includeSteps = includeSteps;
  }


  public SearchAutoTestsQueryIncludesModel includeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * If autotest links will be included
   * @return includeLinks
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeLinks() {
    return includeLinks;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }


  public SearchAutoTestsQueryIncludesModel includeLabels(Boolean includeLabels) {
    this.includeLabels = includeLabels;
    return this;
  }

   /**
   * If autotest labels will be included
   * @return includeLabels
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeLabels() {
    return includeLabels;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_LABELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeLabels(Boolean includeLabels) {
    this.includeLabels = includeLabels;
  }


  /**
   * Return true if this SearchAutoTestsQueryIncludesModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAutoTestsQueryIncludesModel searchAutoTestsQueryIncludesModel = (SearchAutoTestsQueryIncludesModel) o;
    return Objects.equals(this.includeSteps, searchAutoTestsQueryIncludesModel.includeSteps) &&
        Objects.equals(this.includeLinks, searchAutoTestsQueryIncludesModel.includeLinks) &&
        Objects.equals(this.includeLabels, searchAutoTestsQueryIncludesModel.includeLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSteps, includeLinks, includeLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAutoTestsQueryIncludesModel {\n");
    sb.append("    includeSteps: ").append(toIndentedString(includeSteps)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
    sb.append("    includeLabels: ").append(toIndentedString(includeLabels)).append("\n");
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

