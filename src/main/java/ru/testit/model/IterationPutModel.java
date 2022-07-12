/*
 * API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.testit.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.testit.model.ParameterIterationModel;
/**
 * IterationPutModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class IterationPutModel {
  @SerializedName("parameters")
  private List<ParameterIterationModel> parameters = new ArrayList<ParameterIterationModel>();

  @SerializedName("id")
  private UUID id = null;

  public IterationPutModel parameters(List<ParameterIterationModel> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IterationPutModel addParametersItem(ParameterIterationModel parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(required = true, description = "")
  public List<ParameterIterationModel> getParameters() {
    return parameters;
  }

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
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
