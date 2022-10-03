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
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.Int32RangeSelectorModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ProjectSelectModel
 */
@JsonPropertyOrder({
  ProjectSelectModel.JSON_PROPERTY_NAME,
  ProjectSelectModel.JSON_PROPERTY_IS_FAVORITE,
  ProjectSelectModel.JSON_PROPERTY_IS_DELETED,
  ProjectSelectModel.JSON_PROPERTY_TEST_CASES_COUNT,
  ProjectSelectModel.JSON_PROPERTY_CHECKLISTS_COUNT,
  ProjectSelectModel.JSON_PROPERTY_SHARED_STEPS_COUNT,
  ProjectSelectModel.JSON_PROPERTY_AUTOTESTS_COUNT,
  ProjectSelectModel.JSON_PROPERTY_GLOBAL_IDS,
  ProjectSelectModel.JSON_PROPERTY_CREATED_BY_IDS,
  ProjectSelectModel.JSON_PROPERTY_CREATED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectSelectModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_FAVORITE = "isFavorite";
  private JsonNullable<Boolean> isFavorite = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private JsonNullable<Boolean> isDeleted = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TEST_CASES_COUNT = "testCasesCount";
  private Int32RangeSelectorModel testCasesCount;

  public static final String JSON_PROPERTY_CHECKLISTS_COUNT = "checklistsCount";
  private Int32RangeSelectorModel checklistsCount;

  public static final String JSON_PROPERTY_SHARED_STEPS_COUNT = "sharedStepsCount";
  private Int32RangeSelectorModel sharedStepsCount;

  public static final String JSON_PROPERTY_AUTOTESTS_COUNT = "autotestsCount";
  private Int32RangeSelectorModel autotestsCount;

  public static final String JSON_PROPERTY_GLOBAL_IDS = "globalIds";
  private JsonNullable<Set<Long>> globalIds = JsonNullable.<Set<Long>>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_IDS = "createdByIds";
  private JsonNullable<Set<UUID>> createdByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private DateTimeRangeSelectorModel createdDate;

  public ProjectSelectModel() { 
  }

  public ProjectSelectModel name(String name) {
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


  public ProjectSelectModel isFavorite(Boolean isFavorite) {
    this.isFavorite = JsonNullable.<Boolean>of(isFavorite);
    return this;
  }

   /**
   * Get isFavorite
   * @return isFavorite
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIsFavorite() {
        return isFavorite.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsFavorite_JsonNullable() {
    return isFavorite;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  public void setIsFavorite_JsonNullable(JsonNullable<Boolean> isFavorite) {
    this.isFavorite = isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = JsonNullable.<Boolean>of(isFavorite);
  }


  public ProjectSelectModel isDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIsDeleted() {
        return isDeleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsDeleted_JsonNullable() {
    return isDeleted;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  public void setIsDeleted_JsonNullable(JsonNullable<Boolean> isDeleted) {
    this.isDeleted = isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
  }


  public ProjectSelectModel testCasesCount(Int32RangeSelectorModel testCasesCount) {
    this.testCasesCount = testCasesCount;
    return this;
  }

   /**
   * Get testCasesCount
   * @return testCasesCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_CASES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32RangeSelectorModel getTestCasesCount() {
    return testCasesCount;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCasesCount(Int32RangeSelectorModel testCasesCount) {
    this.testCasesCount = testCasesCount;
  }


  public ProjectSelectModel checklistsCount(Int32RangeSelectorModel checklistsCount) {
    this.checklistsCount = checklistsCount;
    return this;
  }

   /**
   * Get checklistsCount
   * @return checklistsCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHECKLISTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32RangeSelectorModel getChecklistsCount() {
    return checklistsCount;
  }


  @JsonProperty(JSON_PROPERTY_CHECKLISTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChecklistsCount(Int32RangeSelectorModel checklistsCount) {
    this.checklistsCount = checklistsCount;
  }


  public ProjectSelectModel sharedStepsCount(Int32RangeSelectorModel sharedStepsCount) {
    this.sharedStepsCount = sharedStepsCount;
    return this;
  }

   /**
   * Get sharedStepsCount
   * @return sharedStepsCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_STEPS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32RangeSelectorModel getSharedStepsCount() {
    return sharedStepsCount;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_STEPS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedStepsCount(Int32RangeSelectorModel sharedStepsCount) {
    this.sharedStepsCount = sharedStepsCount;
  }


  public ProjectSelectModel autotestsCount(Int32RangeSelectorModel autotestsCount) {
    this.autotestsCount = autotestsCount;
    return this;
  }

   /**
   * Get autotestsCount
   * @return autotestsCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTOTESTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32RangeSelectorModel getAutotestsCount() {
    return autotestsCount;
  }


  @JsonProperty(JSON_PROPERTY_AUTOTESTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutotestsCount(Int32RangeSelectorModel autotestsCount) {
    this.autotestsCount = autotestsCount;
  }


  public ProjectSelectModel globalIds(Set<Long> globalIds) {
    this.globalIds = JsonNullable.<Set<Long>>of(globalIds);
    return this;
  }

  public ProjectSelectModel addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null || !this.globalIds.isPresent()) {
      this.globalIds = JsonNullable.<Set<Long>>of(new LinkedHashSet<>());
    }
    try {
      this.globalIds.get().add(globalIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get globalIds
   * @return globalIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<Long> getGlobalIds() {
        return globalIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GLOBAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<Long>> getGlobalIds_JsonNullable() {
    return globalIds;
  }
  
  @JsonProperty(JSON_PROPERTY_GLOBAL_IDS)
  public void setGlobalIds_JsonNullable(JsonNullable<Set<Long>> globalIds) {
    this.globalIds = globalIds;
  }

  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = JsonNullable.<Set<Long>>of(globalIds);
  }


  public ProjectSelectModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
    return this;
  }

  public ProjectSelectModel addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null || !this.createdByIds.isPresent()) {
      this.createdByIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.createdByIds.get().add(createdByIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get createdByIds
   * @return createdByIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Set<UUID> getCreatedByIds() {
        return createdByIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getCreatedByIds_JsonNullable() {
    return createdByIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY_IDS)
  public void setCreatedByIds_JsonNullable(JsonNullable<Set<UUID>> createdByIds) {
    this.createdByIds = createdByIds;
  }

  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
  }


  public ProjectSelectModel createdDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * Return true if this ProjectSelectModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSelectModel projectSelectModel = (ProjectSelectModel) o;
    return equalsNullable(this.name, projectSelectModel.name) &&
        equalsNullable(this.isFavorite, projectSelectModel.isFavorite) &&
        equalsNullable(this.isDeleted, projectSelectModel.isDeleted) &&
        Objects.equals(this.testCasesCount, projectSelectModel.testCasesCount) &&
        Objects.equals(this.checklistsCount, projectSelectModel.checklistsCount) &&
        Objects.equals(this.sharedStepsCount, projectSelectModel.sharedStepsCount) &&
        Objects.equals(this.autotestsCount, projectSelectModel.autotestsCount) &&
        equalsNullable(this.globalIds, projectSelectModel.globalIds) &&
        equalsNullable(this.createdByIds, projectSelectModel.createdByIds) &&
        Objects.equals(this.createdDate, projectSelectModel.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(isFavorite), hashCodeNullable(isDeleted), testCasesCount, checklistsCount, sharedStepsCount, autotestsCount, hashCodeNullable(globalIds), hashCodeNullable(createdByIds), createdDate);
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
    sb.append("class ProjectSelectModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    testCasesCount: ").append(toIndentedString(testCasesCount)).append("\n");
    sb.append("    checklistsCount: ").append(toIndentedString(checklistsCount)).append("\n");
    sb.append("    sharedStepsCount: ").append(toIndentedString(sharedStepsCount)).append("\n");
    sb.append("    autotestsCount: ").append(toIndentedString(autotestsCount)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

