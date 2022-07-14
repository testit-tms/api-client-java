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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.ShortConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestSuiteChangeViewModel
 */
@JsonPropertyOrder({
  TestSuiteChangeViewModel.JSON_PROPERTY_ID,
  TestSuiteChangeViewModel.JSON_PROPERTY_NAME,
  TestSuiteChangeViewModel.JSON_PROPERTY_CONFIGURATIONS,
  TestSuiteChangeViewModel.JSON_PROPERTY_WORK_ITEM_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestSuiteChangeViewModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONFIGURATIONS = "configurations";
  private JsonNullable<List<ShortConfiguration>> configurations = JsonNullable.<List<ShortConfiguration>>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_COUNT = "workItemCount";
  private Long workItemCount;

  public TestSuiteChangeViewModel() { 
  }

  public TestSuiteChangeViewModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TestSuiteChangeViewModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TestSuiteChangeViewModel configurations(List<ShortConfiguration> configurations) {
    this.configurations = JsonNullable.<List<ShortConfiguration>>of(configurations);
    return this;
  }

  public TestSuiteChangeViewModel addConfigurationsItem(ShortConfiguration configurationsItem) {
    if (this.configurations == null || !this.configurations.isPresent()) {
      this.configurations = JsonNullable.<List<ShortConfiguration>>of(new ArrayList<>());
    }
    try {
      this.configurations.get().add(configurationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<ShortConfiguration> getConfigurations() {
        return configurations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ShortConfiguration>> getConfigurations_JsonNullable() {
    return configurations;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS)
  public void setConfigurations_JsonNullable(JsonNullable<List<ShortConfiguration>> configurations) {
    this.configurations = configurations;
  }

  public void setConfigurations(List<ShortConfiguration> configurations) {
    this.configurations = JsonNullable.<List<ShortConfiguration>>of(configurations);
  }


  public TestSuiteChangeViewModel workItemCount(Long workItemCount) {
    this.workItemCount = workItemCount;
    return this;
  }

   /**
   * Get workItemCount
   * @return workItemCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWorkItemCount() {
    return workItemCount;
  }


  @JsonProperty(JSON_PROPERTY_WORK_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkItemCount(Long workItemCount) {
    this.workItemCount = workItemCount;
  }


  /**
   * Return true if this TestSuiteChangeViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteChangeViewModel testSuiteChangeViewModel = (TestSuiteChangeViewModel) o;
    return Objects.equals(this.id, testSuiteChangeViewModel.id) &&
        equalsNullable(this.name, testSuiteChangeViewModel.name) &&
        equalsNullable(this.configurations, testSuiteChangeViewModel.configurations) &&
        Objects.equals(this.workItemCount, testSuiteChangeViewModel.workItemCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(configurations), workItemCount);
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
    sb.append("class TestSuiteChangeViewModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    workItemCount: ").append(toIndentedString(workItemCount)).append("\n");
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

