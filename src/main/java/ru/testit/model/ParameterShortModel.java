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
import java.util.UUID;
/**
 * ParameterShortModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-12T16:29:55.695125+03:00[Europe/Moscow]")
public class ParameterShortModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("parameterKeyId")
  private UUID parameterKeyId = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("name")
  private String name = null;

  public ParameterShortModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ParameterShortModel parameterKeyId(UUID parameterKeyId) {
    this.parameterKeyId = parameterKeyId;
    return this;
  }

   /**
   * Get parameterKeyId
   * @return parameterKeyId
  **/
  @Schema(description = "")
  public UUID getParameterKeyId() {
    return parameterKeyId;
  }

  public void setParameterKeyId(UUID parameterKeyId) {
    this.parameterKeyId = parameterKeyId;
  }

  public ParameterShortModel value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(required = true, description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ParameterShortModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterShortModel parameterShortModel = (ParameterShortModel) o;
    return Objects.equals(this.id, parameterShortModel.id) &&
        Objects.equals(this.parameterKeyId, parameterShortModel.parameterKeyId) &&
        Objects.equals(this.value, parameterShortModel.value) &&
        Objects.equals(this.name, parameterShortModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameterKeyId, value, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterShortModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameterKeyId: ").append(toIndentedString(parameterKeyId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
