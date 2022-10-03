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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * AutotestExtractionModel
 */
@JsonPropertyOrder({
  AutotestExtractionModel.JSON_PROPERTY_INCLUDE_AUTOTESTS,
  AutotestExtractionModel.JSON_PROPERTY_EXCLUDE_AUTOTESTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotestExtractionModel {
  public static final String JSON_PROPERTY_INCLUDE_AUTOTESTS = "includeAutotests";
  private JsonNullable<Set<UUID>> includeAutotests = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_EXCLUDE_AUTOTESTS = "excludeAutotests";
  private JsonNullable<Set<UUID>> excludeAutotests = JsonNullable.<Set<UUID>>undefined();

  public AutotestExtractionModel() { 
  }

  public AutotestExtractionModel includeAutotests(Set<UUID> includeAutotests) {
    this.includeAutotests = JsonNullable.<Set<UUID>>of(includeAutotests);
    return this;
  }

  public AutotestExtractionModel addIncludeAutotestsItem(UUID includeAutotestsItem) {
    if (this.includeAutotests == null || !this.includeAutotests.isPresent()) {
      this.includeAutotests = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.includeAutotests.get().add(includeAutotestsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Identifiers of autotests to be included
   * @return includeAutotests
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifiers of autotests to be included")
  @JsonIgnore

  public Set<UUID> getIncludeAutotests() {
        return includeAutotests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_AUTOTESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getIncludeAutotests_JsonNullable() {
    return includeAutotests;
  }
  
  @JsonProperty(JSON_PROPERTY_INCLUDE_AUTOTESTS)
  public void setIncludeAutotests_JsonNullable(JsonNullable<Set<UUID>> includeAutotests) {
    this.includeAutotests = includeAutotests;
  }

  public void setIncludeAutotests(Set<UUID> includeAutotests) {
    this.includeAutotests = JsonNullable.<Set<UUID>>of(includeAutotests);
  }


  public AutotestExtractionModel excludeAutotests(Set<UUID> excludeAutotests) {
    this.excludeAutotests = JsonNullable.<Set<UUID>>of(excludeAutotests);
    return this;
  }

  public AutotestExtractionModel addExcludeAutotestsItem(UUID excludeAutotestsItem) {
    if (this.excludeAutotests == null || !this.excludeAutotests.isPresent()) {
      this.excludeAutotests = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.excludeAutotests.get().add(excludeAutotestsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Identifiers of autotests to be excluded
   * @return excludeAutotests
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifiers of autotests to be excluded")
  @JsonIgnore

  public Set<UUID> getExcludeAutotests() {
        return excludeAutotests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE_AUTOTESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getExcludeAutotests_JsonNullable() {
    return excludeAutotests;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCLUDE_AUTOTESTS)
  public void setExcludeAutotests_JsonNullable(JsonNullable<Set<UUID>> excludeAutotests) {
    this.excludeAutotests = excludeAutotests;
  }

  public void setExcludeAutotests(Set<UUID> excludeAutotests) {
    this.excludeAutotests = JsonNullable.<Set<UUID>>of(excludeAutotests);
  }


  /**
   * Return true if this AutotestExtractionModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotestExtractionModel autotestExtractionModel = (AutotestExtractionModel) o;
    return equalsNullable(this.includeAutotests, autotestExtractionModel.includeAutotests) &&
        equalsNullable(this.excludeAutotests, autotestExtractionModel.excludeAutotests);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(includeAutotests), hashCodeNullable(excludeAutotests));
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
    sb.append("class AutotestExtractionModel {\n");
    sb.append("    includeAutotests: ").append(toIndentedString(includeAutotests)).append("\n");
    sb.append("    excludeAutotests: ").append(toIndentedString(excludeAutotests)).append("\n");
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
