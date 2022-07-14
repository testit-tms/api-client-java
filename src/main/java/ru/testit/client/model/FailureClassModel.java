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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.FailureCategoryModel;
import ru.testit.client.model.FailureClassRegexModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * FailureClassModel
 */
@JsonPropertyOrder({
  FailureClassModel.JSON_PROPERTY_NAME,
  FailureClassModel.JSON_PROPERTY_FAILURE_CATEGORY,
  FailureClassModel.JSON_PROPERTY_CREATED_DATE,
  FailureClassModel.JSON_PROPERTY_MODIFIED_DATE,
  FailureClassModel.JSON_PROPERTY_CREATED_BY_ID,
  FailureClassModel.JSON_PROPERTY_MODIFIED_BY_ID,
  FailureClassModel.JSON_PROPERTY_FAILURE_CLASS_REGEXES,
  FailureClassModel.JSON_PROPERTY_ID,
  FailureClassModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FailureClassModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FAILURE_CATEGORY = "failureCategory";
  private FailureCategoryModel failureCategory;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_FAILURE_CLASS_REGEXES = "failureClassRegexes";
  private JsonNullable<List<FailureClassRegexModel>> failureClassRegexes = JsonNullable.<List<FailureClassRegexModel>>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public FailureClassModel() { 
  }

  public FailureClassModel name(String name) {
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


  public FailureClassModel failureCategory(FailureCategoryModel failureCategory) {
    this.failureCategory = failureCategory;
    return this;
  }

   /**
   * Get failureCategory
   * @return failureCategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILURE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureCategoryModel getFailureCategory() {
    return failureCategory;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureCategory(FailureCategoryModel failureCategory) {
    this.failureCategory = failureCategory;
  }


  public FailureClassModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FailureClassModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FailureClassModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FailureClassModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FailureClassModel failureClassRegexes(List<FailureClassRegexModel> failureClassRegexes) {
    this.failureClassRegexes = JsonNullable.<List<FailureClassRegexModel>>of(failureClassRegexes);
    return this;
  }

  public FailureClassModel addFailureClassRegexesItem(FailureClassRegexModel failureClassRegexesItem) {
    if (this.failureClassRegexes == null || !this.failureClassRegexes.isPresent()) {
      this.failureClassRegexes = JsonNullable.<List<FailureClassRegexModel>>of(new ArrayList<>());
    }
    try {
      this.failureClassRegexes.get().add(failureClassRegexesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get failureClassRegexes
   * @return failureClassRegexes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<FailureClassRegexModel> getFailureClassRegexes() {
        return failureClassRegexes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_CLASS_REGEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FailureClassRegexModel>> getFailureClassRegexes_JsonNullable() {
    return failureClassRegexes;
  }
  
  @JsonProperty(JSON_PROPERTY_FAILURE_CLASS_REGEXES)
  public void setFailureClassRegexes_JsonNullable(JsonNullable<List<FailureClassRegexModel>> failureClassRegexes) {
    this.failureClassRegexes = failureClassRegexes;
  }

  public void setFailureClassRegexes(List<FailureClassRegexModel> failureClassRegexes) {
    this.failureClassRegexes = JsonNullable.<List<FailureClassRegexModel>>of(failureClassRegexes);
  }


  public FailureClassModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
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


  public FailureClassModel isDeleted(Boolean isDeleted) {
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
   * Return true if this FailureClassModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureClassModel failureClassModel = (FailureClassModel) o;
    return equalsNullable(this.name, failureClassModel.name) &&
        Objects.equals(this.failureCategory, failureClassModel.failureCategory) &&
        equalsNullable(this.createdDate, failureClassModel.createdDate) &&
        equalsNullable(this.modifiedDate, failureClassModel.modifiedDate) &&
        Objects.equals(this.createdById, failureClassModel.createdById) &&
        equalsNullable(this.modifiedById, failureClassModel.modifiedById) &&
        equalsNullable(this.failureClassRegexes, failureClassModel.failureClassRegexes) &&
        Objects.equals(this.id, failureClassModel.id) &&
        Objects.equals(this.isDeleted, failureClassModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), failureCategory, hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), createdById, hashCodeNullable(modifiedById), hashCodeNullable(failureClassRegexes), id, isDeleted);
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
    sb.append("class FailureClassModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    failureCategory: ").append(toIndentedString(failureCategory)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    failureClassRegexes: ").append(toIndentedString(failureClassRegexes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
