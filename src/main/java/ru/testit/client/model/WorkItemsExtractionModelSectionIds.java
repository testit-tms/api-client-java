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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * Extraction parameters for sections
 */
@JsonPropertyOrder({
  WorkItemsExtractionModelSectionIds.JSON_PROPERTY_INCLUDE,
  WorkItemsExtractionModelSectionIds.JSON_PROPERTY_EXCLUDE
})
@JsonTypeName("WorkItemsExtractionModel_sectionIds")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemsExtractionModelSectionIds {
  public static final String JSON_PROPERTY_INCLUDE = "include";
  private JsonNullable<List<UUID>> include = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private JsonNullable<List<UUID>> exclude = JsonNullable.<List<UUID>>undefined();

  public WorkItemsExtractionModelSectionIds() { 
  }

  public WorkItemsExtractionModelSectionIds include(List<UUID> include) {
    this.include = JsonNullable.<List<UUID>>of(include);
    return this;
  }

  public WorkItemsExtractionModelSectionIds addIncludeItem(UUID includeItem) {
    if (this.include == null || !this.include.isPresent()) {
      this.include = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.include.get().add(includeItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<UUID> getInclude() {
        return include.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getInclude_JsonNullable() {
    return include;
  }
  
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  public void setInclude_JsonNullable(JsonNullable<List<UUID>> include) {
    this.include = include;
  }

  public void setInclude(List<UUID> include) {
    this.include = JsonNullable.<List<UUID>>of(include);
  }


  public WorkItemsExtractionModelSectionIds exclude(List<UUID> exclude) {
    this.exclude = JsonNullable.<List<UUID>>of(exclude);
    return this;
  }

  public WorkItemsExtractionModelSectionIds addExcludeItem(UUID excludeItem) {
    if (this.exclude == null || !this.exclude.isPresent()) {
      this.exclude = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.exclude.get().add(excludeItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<UUID> getExclude() {
        return exclude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getExclude_JsonNullable() {
    return exclude;
  }
  
  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  public void setExclude_JsonNullable(JsonNullable<List<UUID>> exclude) {
    this.exclude = exclude;
  }

  public void setExclude(List<UUID> exclude) {
    this.exclude = JsonNullable.<List<UUID>>of(exclude);
  }


  /**
   * Return true if this WorkItemsExtractionModel_sectionIds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemsExtractionModelSectionIds workItemsExtractionModelSectionIds = (WorkItemsExtractionModelSectionIds) o;
    return equalsNullable(this.include, workItemsExtractionModelSectionIds.include) &&
        equalsNullable(this.exclude, workItemsExtractionModelSectionIds.exclude);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(include), hashCodeNullable(exclude));
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
    sb.append("class WorkItemsExtractionModelSectionIds {\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

