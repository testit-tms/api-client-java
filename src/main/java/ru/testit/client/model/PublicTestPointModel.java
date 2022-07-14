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
import ru.testit.client.model.ParameterShortModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * PublicTestPointModel
 */
@JsonPropertyOrder({
  PublicTestPointModel.JSON_PROPERTY_CONFIGURATION_ID,
  PublicTestPointModel.JSON_PROPERTY_CONFIGURATION_GLOBAL_ID,
  PublicTestPointModel.JSON_PROPERTY_AUTO_TEST_IDS,
  PublicTestPointModel.JSON_PROPERTY_ITERATION_ID,
  PublicTestPointModel.JSON_PROPERTY_PARAMETER_MODELS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublicTestPointModel {
  public static final String JSON_PROPERTY_CONFIGURATION_ID = "configurationId";
  private UUID configurationId;

  public static final String JSON_PROPERTY_CONFIGURATION_GLOBAL_ID = "configurationGlobalId";
  private Long configurationGlobalId;

  public static final String JSON_PROPERTY_AUTO_TEST_IDS = "autoTestIds";
  private JsonNullable<List<UUID>> autoTestIds = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_ITERATION_ID = "iterationId";
  private UUID iterationId;

  public static final String JSON_PROPERTY_PARAMETER_MODELS = "parameterModels";
  private JsonNullable<List<ParameterShortModel>> parameterModels = JsonNullable.<List<ParameterShortModel>>undefined();

  public PublicTestPointModel() { 
  }

  public PublicTestPointModel configurationId(UUID configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Get configurationId
   * @return configurationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getConfigurationId() {
    return configurationId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public PublicTestPointModel configurationGlobalId(Long configurationGlobalId) {
    this.configurationGlobalId = configurationGlobalId;
    return this;
  }

   /**
   * Get configurationGlobalId
   * @return configurationGlobalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfigurationGlobalId() {
    return configurationGlobalId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationGlobalId(Long configurationGlobalId) {
    this.configurationGlobalId = configurationGlobalId;
  }


  public PublicTestPointModel autoTestIds(List<UUID> autoTestIds) {
    this.autoTestIds = JsonNullable.<List<UUID>>of(autoTestIds);
    return this;
  }

  public PublicTestPointModel addAutoTestIdsItem(UUID autoTestIdsItem) {
    if (this.autoTestIds == null || !this.autoTestIds.isPresent()) {
      this.autoTestIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.autoTestIds.get().add(autoTestIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get autoTestIds
   * @return autoTestIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<UUID> getAutoTestIds() {
        return autoTestIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TEST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getAutoTestIds_JsonNullable() {
    return autoTestIds;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TEST_IDS)
  public void setAutoTestIds_JsonNullable(JsonNullable<List<UUID>> autoTestIds) {
    this.autoTestIds = autoTestIds;
  }

  public void setAutoTestIds(List<UUID> autoTestIds) {
    this.autoTestIds = JsonNullable.<List<UUID>>of(autoTestIds);
  }


  public PublicTestPointModel iterationId(UUID iterationId) {
    this.iterationId = iterationId;
    return this;
  }

   /**
   * Get iterationId
   * @return iterationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITERATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getIterationId() {
    return iterationId;
  }


  @JsonProperty(JSON_PROPERTY_ITERATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIterationId(UUID iterationId) {
    this.iterationId = iterationId;
  }


  public PublicTestPointModel parameterModels(List<ParameterShortModel> parameterModels) {
    this.parameterModels = JsonNullable.<List<ParameterShortModel>>of(parameterModels);
    return this;
  }

  public PublicTestPointModel addParameterModelsItem(ParameterShortModel parameterModelsItem) {
    if (this.parameterModels == null || !this.parameterModels.isPresent()) {
      this.parameterModels = JsonNullable.<List<ParameterShortModel>>of(new ArrayList<>());
    }
    try {
      this.parameterModels.get().add(parameterModelsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get parameterModels
   * @return parameterModels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<ParameterShortModel> getParameterModels() {
        return parameterModels.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETER_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ParameterShortModel>> getParameterModels_JsonNullable() {
    return parameterModels;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETER_MODELS)
  public void setParameterModels_JsonNullable(JsonNullable<List<ParameterShortModel>> parameterModels) {
    this.parameterModels = parameterModels;
  }

  public void setParameterModels(List<ParameterShortModel> parameterModels) {
    this.parameterModels = JsonNullable.<List<ParameterShortModel>>of(parameterModels);
  }


  /**
   * Return true if this PublicTestPointModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicTestPointModel publicTestPointModel = (PublicTestPointModel) o;
    return Objects.equals(this.configurationId, publicTestPointModel.configurationId) &&
        Objects.equals(this.configurationGlobalId, publicTestPointModel.configurationGlobalId) &&
        equalsNullable(this.autoTestIds, publicTestPointModel.autoTestIds) &&
        Objects.equals(this.iterationId, publicTestPointModel.iterationId) &&
        equalsNullable(this.parameterModels, publicTestPointModel.parameterModels);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationId, configurationGlobalId, hashCodeNullable(autoTestIds), iterationId, hashCodeNullable(parameterModels));
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
    sb.append("class PublicTestPointModel {\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    configurationGlobalId: ").append(toIndentedString(configurationGlobalId)).append("\n");
    sb.append("    autoTestIds: ").append(toIndentedString(autoTestIds)).append("\n");
    sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
    sb.append("    parameterModels: ").append(toIndentedString(parameterModels)).append("\n");
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

