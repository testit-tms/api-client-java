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
import ru.testit.client.model.FailureCategoryModel;
import ru.testit.client.model.TestResultOutcome;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestResultsLocalFilterModel
 */
@JsonPropertyOrder({
  TestResultsLocalFilterModel.JSON_PROPERTY_CONFIGURATION_IDS,
  TestResultsLocalFilterModel.JSON_PROPERTY_OUTCOMES,
  TestResultsLocalFilterModel.JSON_PROPERTY_FAILURE_CATEGORIES,
  TestResultsLocalFilterModel.JSON_PROPERTY_NAMESPACE,
  TestResultsLocalFilterModel.JSON_PROPERTY_CLASS_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsLocalFilterModel {
  public static final String JSON_PROPERTY_CONFIGURATION_IDS = "configurationIds";
  private JsonNullable<Set<UUID>> configurationIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_OUTCOMES = "outcomes";
  private JsonNullable<Set<TestResultOutcome>> outcomes = JsonNullable.<Set<TestResultOutcome>>undefined();

  public static final String JSON_PROPERTY_FAILURE_CATEGORIES = "failureCategories";
  private JsonNullable<Set<FailureCategoryModel>> failureCategories = JsonNullable.<Set<FailureCategoryModel>>undefined();

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private JsonNullable<String> namespace = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLASS_NAME = "className";
  private JsonNullable<String> className = JsonNullable.<String>undefined();

  public TestResultsLocalFilterModel() { 
  }

  public TestResultsLocalFilterModel configurationIds(Set<UUID> configurationIds) {
    this.configurationIds = JsonNullable.<Set<UUID>>of(configurationIds);
    return this;
  }

  public TestResultsLocalFilterModel addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null || !this.configurationIds.isPresent()) {
      this.configurationIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.configurationIds.get().add(configurationIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get configurationIds
   * @return configurationIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<UUID> getConfigurationIds() {
        return configurationIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIGURATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getConfigurationIds_JsonNullable() {
    return configurationIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_IDS)
  public void setConfigurationIds_JsonNullable(JsonNullable<Set<UUID>> configurationIds) {
    this.configurationIds = configurationIds;
  }

  public void setConfigurationIds(Set<UUID> configurationIds) {
    this.configurationIds = JsonNullable.<Set<UUID>>of(configurationIds);
  }


  public TestResultsLocalFilterModel outcomes(Set<TestResultOutcome> outcomes) {
    this.outcomes = JsonNullable.<Set<TestResultOutcome>>of(outcomes);
    return this;
  }

  public TestResultsLocalFilterModel addOutcomesItem(TestResultOutcome outcomesItem) {
    if (this.outcomes == null || !this.outcomes.isPresent()) {
      this.outcomes = JsonNullable.<Set<TestResultOutcome>>of(new LinkedHashSet<>());
    }
    try {
      this.outcomes.get().add(outcomesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get outcomes
   * @return outcomes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<TestResultOutcome> getOutcomes() {
        return outcomes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<TestResultOutcome>> getOutcomes_JsonNullable() {
    return outcomes;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTCOMES)
  public void setOutcomes_JsonNullable(JsonNullable<Set<TestResultOutcome>> outcomes) {
    this.outcomes = outcomes;
  }

  public void setOutcomes(Set<TestResultOutcome> outcomes) {
    this.outcomes = JsonNullable.<Set<TestResultOutcome>>of(outcomes);
  }


  public TestResultsLocalFilterModel failureCategories(Set<FailureCategoryModel> failureCategories) {
    this.failureCategories = JsonNullable.<Set<FailureCategoryModel>>of(failureCategories);
    return this;
  }

  public TestResultsLocalFilterModel addFailureCategoriesItem(FailureCategoryModel failureCategoriesItem) {
    if (this.failureCategories == null || !this.failureCategories.isPresent()) {
      this.failureCategories = JsonNullable.<Set<FailureCategoryModel>>of(new LinkedHashSet<>());
    }
    try {
      this.failureCategories.get().add(failureCategoriesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get failureCategories
   * @return failureCategories
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<FailureCategoryModel> getFailureCategories() {
        return failureCategories.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<FailureCategoryModel>> getFailureCategories_JsonNullable() {
    return failureCategories;
  }
  
  @JsonProperty(JSON_PROPERTY_FAILURE_CATEGORIES)
  public void setFailureCategories_JsonNullable(JsonNullable<Set<FailureCategoryModel>> failureCategories) {
    this.failureCategories = failureCategories;
  }

  public void setFailureCategories(Set<FailureCategoryModel> failureCategories) {
    this.failureCategories = JsonNullable.<Set<FailureCategoryModel>>of(failureCategories);
  }


  public TestResultsLocalFilterModel namespace(String namespace) {
    this.namespace = JsonNullable.<String>of(namespace);
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNamespace() {
        return namespace.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNamespace_JsonNullable() {
    return namespace;
  }
  
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  public void setNamespace_JsonNullable(JsonNullable<String> namespace) {
    this.namespace = namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = JsonNullable.<String>of(namespace);
  }


  public TestResultsLocalFilterModel className(String className) {
    this.className = JsonNullable.<String>of(className);
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getClassName() {
        return className.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClassName_JsonNullable() {
    return className;
  }
  
  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  public void setClassName_JsonNullable(JsonNullable<String> className) {
    this.className = className;
  }

  public void setClassName(String className) {
    this.className = JsonNullable.<String>of(className);
  }


  /**
   * Return true if this TestResultsLocalFilterModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultsLocalFilterModel testResultsLocalFilterModel = (TestResultsLocalFilterModel) o;
    return equalsNullable(this.configurationIds, testResultsLocalFilterModel.configurationIds) &&
        equalsNullable(this.outcomes, testResultsLocalFilterModel.outcomes) &&
        equalsNullable(this.failureCategories, testResultsLocalFilterModel.failureCategories) &&
        equalsNullable(this.namespace, testResultsLocalFilterModel.namespace) &&
        equalsNullable(this.className, testResultsLocalFilterModel.className);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(configurationIds), hashCodeNullable(outcomes), hashCodeNullable(failureCategories), hashCodeNullable(namespace), hashCodeNullable(className));
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
    sb.append("class TestResultsLocalFilterModel {\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    failureCategories: ").append(toIndentedString(failureCategories)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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
