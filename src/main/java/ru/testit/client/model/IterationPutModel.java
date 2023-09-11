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
import ru.testit.client.model.ParameterIterationModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * IterationPutModel
 */
@JsonPropertyOrder({
  IterationPutModel.JSON_PROPERTY_PARAMETERS,
  IterationPutModel.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IterationPutModel {
  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<ParameterIterationModel> parameters = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public IterationPutModel() { 
  }

  public IterationPutModel parameters(List<ParameterIterationModel> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IterationPutModel addParametersItem(ParameterIterationModel parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ParameterIterationModel> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameters(List<ParameterIterationModel> parameters) {
    this.parameters = parameters;
  }


  public IterationPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  /**
   * Return true if this IterationPutModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IterationPutModel iterationPutModel = (IterationPutModel) o;
    return Objects.equals(this.parameters, iterationPutModel.parameters) &&
        Objects.equals(this.id, iterationPutModel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IterationPutModel {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

