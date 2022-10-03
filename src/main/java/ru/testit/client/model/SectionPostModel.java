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
import ru.testit.client.model.StepPutModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * SectionPostModel
 */
@JsonPropertyOrder({
  SectionPostModel.JSON_PROPERTY_NAME,
  SectionPostModel.JSON_PROPERTY_PROJECT_ID,
  SectionPostModel.JSON_PROPERTY_PARENT_ID,
  SectionPostModel.JSON_PROPERTY_PRECONDITION_STEPS,
  SectionPostModel.JSON_PROPERTY_POSTCONDITION_STEPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SectionPostModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private JsonNullable<UUID> parentId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_PRECONDITION_STEPS = "preconditionSteps";
  private JsonNullable<List<StepPutModel>> preconditionSteps = JsonNullable.<List<StepPutModel>>undefined();

  public static final String JSON_PROPERTY_POSTCONDITION_STEPS = "postconditionSteps";
  private JsonNullable<List<StepPutModel>> postconditionSteps = JsonNullable.<List<StepPutModel>>undefined();

  public SectionPostModel() { 
  }

  public SectionPostModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SectionPostModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public SectionPostModel parentId(UUID parentId) {
    this.parentId = JsonNullable.<UUID>of(parentId);
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", value = "")
  @JsonIgnore

  public UUID getParentId() {
        return parentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getParentId_JsonNullable() {
    return parentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<UUID> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = JsonNullable.<UUID>of(parentId);
  }


  public SectionPostModel preconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = JsonNullable.<List<StepPutModel>>of(preconditionSteps);
    return this;
  }

  public SectionPostModel addPreconditionStepsItem(StepPutModel preconditionStepsItem) {
    if (this.preconditionSteps == null || !this.preconditionSteps.isPresent()) {
      this.preconditionSteps = JsonNullable.<List<StepPutModel>>of(new ArrayList<>());
    }
    try {
      this.preconditionSteps.get().add(preconditionStepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<StepPutModel> getPreconditionSteps() {
        return preconditionSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<StepPutModel>> getPreconditionSteps_JsonNullable() {
    return preconditionSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  public void setPreconditionSteps_JsonNullable(JsonNullable<List<StepPutModel>> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }

  public void setPreconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = JsonNullable.<List<StepPutModel>>of(preconditionSteps);
  }


  public SectionPostModel postconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = JsonNullable.<List<StepPutModel>>of(postconditionSteps);
    return this;
  }

  public SectionPostModel addPostconditionStepsItem(StepPutModel postconditionStepsItem) {
    if (this.postconditionSteps == null || !this.postconditionSteps.isPresent()) {
      this.postconditionSteps = JsonNullable.<List<StepPutModel>>of(new ArrayList<>());
    }
    try {
      this.postconditionSteps.get().add(postconditionStepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<StepPutModel> getPostconditionSteps() {
        return postconditionSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<StepPutModel>> getPostconditionSteps_JsonNullable() {
    return postconditionSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  public void setPostconditionSteps_JsonNullable(JsonNullable<List<StepPutModel>> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }

  public void setPostconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = JsonNullable.<List<StepPutModel>>of(postconditionSteps);
  }


  /**
   * Return true if this SectionPostModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionPostModel sectionPostModel = (SectionPostModel) o;
    return Objects.equals(this.name, sectionPostModel.name) &&
        Objects.equals(this.projectId, sectionPostModel.projectId) &&
        equalsNullable(this.parentId, sectionPostModel.parentId) &&
        equalsNullable(this.preconditionSteps, sectionPostModel.preconditionSteps) &&
        equalsNullable(this.postconditionSteps, sectionPostModel.postconditionSteps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId, hashCodeNullable(parentId), hashCodeNullable(preconditionSteps), hashCodeNullable(postconditionSteps));
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
    sb.append("class SectionPostModel {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

