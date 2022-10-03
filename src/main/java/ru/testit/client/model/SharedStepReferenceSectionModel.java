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
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * SharedStepReferenceSectionModel
 */
@JsonPropertyOrder({
  SharedStepReferenceSectionModel.JSON_PROPERTY_ID,
  SharedStepReferenceSectionModel.JSON_PROPERTY_NAME,
  SharedStepReferenceSectionModel.JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION,
  SharedStepReferenceSectionModel.JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION,
  SharedStepReferenceSectionModel.JSON_PROPERTY_CREATED_BY_ID,
  SharedStepReferenceSectionModel.JSON_PROPERTY_MODIFIED_BY_ID,
  SharedStepReferenceSectionModel.JSON_PROPERTY_CREATED_DATE,
  SharedStepReferenceSectionModel.JSON_PROPERTY_MODIFIED_DATE,
  SharedStepReferenceSectionModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedStepReferenceSectionModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION = "hasThisSharedStepAsPrecondition";
  private Boolean hasThisSharedStepAsPrecondition;

  public static final String JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION = "hasThisSharedStepAsPostcondition";
  private Boolean hasThisSharedStepAsPostcondition;

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public SharedStepReferenceSectionModel() { 
  }

  public SharedStepReferenceSectionModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", value = "")
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


  public SharedStepReferenceSectionModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Basic template", value = "")
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


  public SharedStepReferenceSectionModel hasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPrecondition
   * @return hasThisSharedStepAsPrecondition
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasThisSharedStepAsPrecondition() {
    return hasThisSharedStepAsPrecondition;
  }


  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
  }


  public SharedStepReferenceSectionModel hasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPostcondition
   * @return hasThisSharedStepAsPostcondition
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasThisSharedStepAsPostcondition() {
    return hasThisSharedStepAsPostcondition;
  }


  @JsonProperty(JSON_PROPERTY_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
  }


  public SharedStepReferenceSectionModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCreatedById() {
    return createdById;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public SharedStepReferenceSectionModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", value = "")
  @JsonIgnore

  public UUID getModifiedById() {
        return modifiedById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getModifiedById_JsonNullable() {
    return modifiedById;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  public void setModifiedById_JsonNullable(JsonNullable<UUID> modifiedById) {
    this.modifiedById = modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
  }


  public SharedStepReferenceSectionModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-10-03T10:29:25.447304600Z", value = "")
  @JsonIgnore

  public OffsetDateTime getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
  }


  public SharedStepReferenceSectionModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-10-03T10:29:25.447304600Z", value = "")
  @JsonIgnore

  public OffsetDateTime getModifiedDate() {
        return modifiedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getModifiedDate_JsonNullable() {
    return modifiedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  public void setModifiedDate_JsonNullable(JsonNullable<OffsetDateTime> modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
  }


  public SharedStepReferenceSectionModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  /**
   * Return true if this SharedStepReferenceSectionModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedStepReferenceSectionModel sharedStepReferenceSectionModel = (SharedStepReferenceSectionModel) o;
    return Objects.equals(this.id, sharedStepReferenceSectionModel.id) &&
        equalsNullable(this.name, sharedStepReferenceSectionModel.name) &&
        Objects.equals(this.hasThisSharedStepAsPrecondition, sharedStepReferenceSectionModel.hasThisSharedStepAsPrecondition) &&
        Objects.equals(this.hasThisSharedStepAsPostcondition, sharedStepReferenceSectionModel.hasThisSharedStepAsPostcondition) &&
        Objects.equals(this.createdById, sharedStepReferenceSectionModel.createdById) &&
        equalsNullable(this.modifiedById, sharedStepReferenceSectionModel.modifiedById) &&
        equalsNullable(this.createdDate, sharedStepReferenceSectionModel.createdDate) &&
        equalsNullable(this.modifiedDate, sharedStepReferenceSectionModel.modifiedDate) &&
        Objects.equals(this.isDeleted, sharedStepReferenceSectionModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hasThisSharedStepAsPrecondition, hasThisSharedStepAsPostcondition, createdById, hashCodeNullable(modifiedById), hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), isDeleted);
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
    sb.append("class SharedStepReferenceSectionModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasThisSharedStepAsPrecondition: ").append(toIndentedString(hasThisSharedStepAsPrecondition)).append("\n");
    sb.append("    hasThisSharedStepAsPostcondition: ").append(toIndentedString(hasThisSharedStepAsPostcondition)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
