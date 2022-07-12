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
import ru.testit.model.StepPutModel;
/**
 * SectionPutModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class SectionPutModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectId")
  private UUID projectId = null;

  @SerializedName("parentId")
  private UUID parentId = null;

  @SerializedName("preconditionSteps")
  private List<StepPutModel> preconditionSteps = null;

  @SerializedName("postconditionSteps")
  private List<StepPutModel> postconditionSteps = null;

  public SectionPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SectionPutModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SectionPutModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", required = true, description = "")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public SectionPutModel parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", description = "")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public SectionPutModel preconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public SectionPutModel addPreconditionStepsItem(StepPutModel preconditionStepsItem) {
    if (this.preconditionSteps == null) {
      this.preconditionSteps = new ArrayList<StepPutModel>();
    }
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @Schema(description = "")
  public List<StepPutModel> getPreconditionSteps() {
    return preconditionSteps;
  }

  public void setPreconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }

  public SectionPutModel postconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public SectionPutModel addPostconditionStepsItem(StepPutModel postconditionStepsItem) {
    if (this.postconditionSteps == null) {
      this.postconditionSteps = new ArrayList<StepPutModel>();
    }
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @Schema(description = "")
  public List<StepPutModel> getPostconditionSteps() {
    return postconditionSteps;
  }

  public void setPostconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionPutModel sectionPutModel = (SectionPutModel) o;
    return Objects.equals(this.id, sectionPutModel.id) &&
        Objects.equals(this.name, sectionPutModel.name) &&
        Objects.equals(this.projectId, sectionPutModel.projectId) &&
        Objects.equals(this.parentId, sectionPutModel.parentId) &&
        Objects.equals(this.preconditionSteps, sectionPutModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, sectionPutModel.postconditionSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, projectId, parentId, preconditionSteps, postconditionSteps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionPutModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
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
