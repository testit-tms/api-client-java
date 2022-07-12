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
import org.threeten.bp.OffsetDateTime;
import ru.testit.model.WorkItemPriorityModel;
/**
 * SharedStepReferenceModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class SharedStepReferenceModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("globalId")
  private Long globalId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("entityTypeName")
  private String entityTypeName = null;

  @SerializedName("hasThisSharedStepAsStep")
  private Boolean hasThisSharedStepAsStep = null;

  @SerializedName("hasThisSharedStepAsPrecondition")
  private Boolean hasThisSharedStepAsPrecondition = null;

  @SerializedName("hasThisSharedStepAsPostcondition")
  private Boolean hasThisSharedStepAsPostcondition = null;

  @SerializedName("createdById")
  private UUID createdById = null;

  @SerializedName("modifiedById")
  private UUID modifiedById = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("priority")
  private WorkItemPriorityModel priority = null;

  @SerializedName("isDeleted")
  private Boolean isDeleted = null;

  @SerializedName("versionId")
  private UUID versionId = null;

  public SharedStepReferenceModel id(UUID id) {
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

  public SharedStepReferenceModel globalId(Long globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @Schema(description = "")
  public Long getGlobalId() {
    return globalId;
  }

  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }

  public SharedStepReferenceModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SharedStepReferenceModel entityTypeName(String entityTypeName) {
    this.entityTypeName = entityTypeName;
    return this;
  }

   /**
   * Get entityTypeName
   * @return entityTypeName
  **/
  @Schema(description = "")
  public String getEntityTypeName() {
    return entityTypeName;
  }

  public void setEntityTypeName(String entityTypeName) {
    this.entityTypeName = entityTypeName;
  }

  public SharedStepReferenceModel hasThisSharedStepAsStep(Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
    return this;
  }

   /**
   * Get hasThisSharedStepAsStep
   * @return hasThisSharedStepAsStep
  **/
  @Schema(description = "")
  public Boolean isHasThisSharedStepAsStep() {
    return hasThisSharedStepAsStep;
  }

  public void setHasThisSharedStepAsStep(Boolean hasThisSharedStepAsStep) {
    this.hasThisSharedStepAsStep = hasThisSharedStepAsStep;
  }

  public SharedStepReferenceModel hasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPrecondition
   * @return hasThisSharedStepAsPrecondition
  **/
  @Schema(description = "")
  public Boolean isHasThisSharedStepAsPrecondition() {
    return hasThisSharedStepAsPrecondition;
  }

  public void setHasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
  }

  public SharedStepReferenceModel hasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPostcondition
   * @return hasThisSharedStepAsPostcondition
  **/
  @Schema(description = "")
  public Boolean isHasThisSharedStepAsPostcondition() {
    return hasThisSharedStepAsPostcondition;
  }

  public void setHasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
  }

  public SharedStepReferenceModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @Schema(description = "")
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }

  public SharedStepReferenceModel modifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @Schema(description = "")
  public UUID getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }

  public SharedStepReferenceModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public SharedStepReferenceModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @Schema(description = "")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public SharedStepReferenceModel state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SharedStepReferenceModel priority(WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public WorkItemPriorityModel getPriority() {
    return priority;
  }

  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }

  public SharedStepReferenceModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @Schema(description = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public SharedStepReferenceModel versionId(UUID versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @Schema(description = "")
  public UUID getVersionId() {
    return versionId;
  }

  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedStepReferenceModel sharedStepReferenceModel = (SharedStepReferenceModel) o;
    return Objects.equals(this.id, sharedStepReferenceModel.id) &&
        Objects.equals(this.globalId, sharedStepReferenceModel.globalId) &&
        Objects.equals(this.name, sharedStepReferenceModel.name) &&
        Objects.equals(this.entityTypeName, sharedStepReferenceModel.entityTypeName) &&
        Objects.equals(this.hasThisSharedStepAsStep, sharedStepReferenceModel.hasThisSharedStepAsStep) &&
        Objects.equals(this.hasThisSharedStepAsPrecondition, sharedStepReferenceModel.hasThisSharedStepAsPrecondition) &&
        Objects.equals(this.hasThisSharedStepAsPostcondition, sharedStepReferenceModel.hasThisSharedStepAsPostcondition) &&
        Objects.equals(this.createdById, sharedStepReferenceModel.createdById) &&
        Objects.equals(this.modifiedById, sharedStepReferenceModel.modifiedById) &&
        Objects.equals(this.createdDate, sharedStepReferenceModel.createdDate) &&
        Objects.equals(this.modifiedDate, sharedStepReferenceModel.modifiedDate) &&
        Objects.equals(this.state, sharedStepReferenceModel.state) &&
        Objects.equals(this.priority, sharedStepReferenceModel.priority) &&
        Objects.equals(this.isDeleted, sharedStepReferenceModel.isDeleted) &&
        Objects.equals(this.versionId, sharedStepReferenceModel.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, globalId, name, entityTypeName, hasThisSharedStepAsStep, hasThisSharedStepAsPrecondition, hasThisSharedStepAsPostcondition, createdById, modifiedById, createdDate, modifiedDate, state, priority, isDeleted, versionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedStepReferenceModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
    sb.append("    hasThisSharedStepAsStep: ").append(toIndentedString(hasThisSharedStepAsStep)).append("\n");
    sb.append("    hasThisSharedStepAsPrecondition: ").append(toIndentedString(hasThisSharedStepAsPrecondition)).append("\n");
    sb.append("    hasThisSharedStepAsPostcondition: ").append(toIndentedString(hasThisSharedStepAsPostcondition)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
