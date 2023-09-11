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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.TestPlanStatusModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ProjectTestPlansFilterModel
 */
@JsonPropertyOrder({
  ProjectTestPlansFilterModel.JSON_PROPERTY_NAME,
  ProjectTestPlansFilterModel.JSON_PROPERTY_DESCRIPTION,
  ProjectTestPlansFilterModel.JSON_PROPERTY_BUILD,
  ProjectTestPlansFilterModel.JSON_PROPERTY_PRODUCT_NAME,
  ProjectTestPlansFilterModel.JSON_PROPERTY_STATUS,
  ProjectTestPlansFilterModel.JSON_PROPERTY_GLOBAL_IDS,
  ProjectTestPlansFilterModel.JSON_PROPERTY_IS_LOCKED,
  ProjectTestPlansFilterModel.JSON_PROPERTY_LOCKED_DATE,
  ProjectTestPlansFilterModel.JSON_PROPERTY_AUTOMATIC_DURATION_TIMER,
  ProjectTestPlansFilterModel.JSON_PROPERTY_CREATED_BY_IDS,
  ProjectTestPlansFilterModel.JSON_PROPERTY_CREATED_DATE,
  ProjectTestPlansFilterModel.JSON_PROPERTY_START_DATE,
  ProjectTestPlansFilterModel.JSON_PROPERTY_END_DATE,
  ProjectTestPlansFilterModel.JSON_PROPERTY_TAG_NAMES,
  ProjectTestPlansFilterModel.JSON_PROPERTY_ATTRIBUTES,
  ProjectTestPlansFilterModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectTestPlansFilterModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUILD = "build";
  private JsonNullable<String> build = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<Set<TestPlanStatusModel>> status = JsonNullable.<Set<TestPlanStatusModel>>undefined();

  public static final String JSON_PROPERTY_GLOBAL_IDS = "globalIds";
  private JsonNullable<Set<Long>> globalIds = JsonNullable.<Set<Long>>undefined();

  public static final String JSON_PROPERTY_IS_LOCKED = "isLocked";
  private JsonNullable<Boolean> isLocked = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LOCKED_DATE = "lockedDate";
  private JsonNullable<DateTimeRangeSelectorModel> lockedDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_AUTOMATIC_DURATION_TIMER = "automaticDurationTimer";
  private JsonNullable<Set<Boolean>> automaticDurationTimer = JsonNullable.<Set<Boolean>>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_IDS = "createdByIds";
  private JsonNullable<Set<UUID>> createdByIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<DateTimeRangeSelectorModel> createdDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private JsonNullable<DateTimeRangeSelectorModel> startDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private JsonNullable<DateTimeRangeSelectorModel> endDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public static final String JSON_PROPERTY_TAG_NAMES = "tagNames";
  private JsonNullable<Set<String>> tagNames = JsonNullable.<Set<String>>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, Set<String>>> attributes = JsonNullable.<Map<String, Set<String>>>undefined();

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private JsonNullable<Boolean> isDeleted = JsonNullable.<Boolean>undefined();

  public ProjectTestPlansFilterModel() { 
  }

  public ProjectTestPlansFilterModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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


  public ProjectTestPlansFilterModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public ProjectTestPlansFilterModel build(String build) {
    this.build = JsonNullable.<String>of(build);
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getBuild() {
        return build.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBuild_JsonNullable() {
    return build;
  }
  
  @JsonProperty(JSON_PROPERTY_BUILD)
  public void setBuild_JsonNullable(JsonNullable<String> build) {
    this.build = build;
  }

  public void setBuild(String build) {
    this.build = JsonNullable.<String>of(build);
  }


  public ProjectTestPlansFilterModel productName(String productName) {
    this.productName = JsonNullable.<String>of(productName);
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getProductName() {
        return productName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProductName_JsonNullable() {
    return productName;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  public void setProductName_JsonNullable(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public void setProductName(String productName) {
    this.productName = JsonNullable.<String>of(productName);
  }


  public ProjectTestPlansFilterModel status(Set<TestPlanStatusModel> status) {
    this.status = JsonNullable.<Set<TestPlanStatusModel>>of(status);
    return this;
  }

  public ProjectTestPlansFilterModel addStatusItem(TestPlanStatusModel statusItem) {
    if (this.status == null || !this.status.isPresent()) {
      this.status = JsonNullable.<Set<TestPlanStatusModel>>of(new LinkedHashSet<>());
    }
    try {
      this.status.get().add(statusItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<TestPlanStatusModel> getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<TestPlanStatusModel>> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<Set<TestPlanStatusModel>> status) {
    this.status = status;
  }

  public void setStatus(Set<TestPlanStatusModel> status) {
    this.status = JsonNullable.<Set<TestPlanStatusModel>>of(status);
  }


  public ProjectTestPlansFilterModel globalIds(Set<Long> globalIds) {
    this.globalIds = JsonNullable.<Set<Long>>of(globalIds);
    return this;
  }

  public ProjectTestPlansFilterModel addGlobalIdsItem(Long globalIdsItem) {
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


  public ProjectTestPlansFilterModel isLocked(Boolean isLocked) {
    this.isLocked = JsonNullable.<Boolean>of(isLocked);
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getIsLocked() {
        return isLocked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsLocked_JsonNullable() {
    return isLocked;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  public void setIsLocked_JsonNullable(JsonNullable<Boolean> isLocked) {
    this.isLocked = isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = JsonNullable.<Boolean>of(isLocked);
  }


  public ProjectTestPlansFilterModel lockedDate(DateTimeRangeSelectorModel lockedDate) {
    this.lockedDate = JsonNullable.<DateTimeRangeSelectorModel>of(lockedDate);
    return this;
  }

   /**
   * Get lockedDate
   * @return lockedDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getLockedDate() {
        return lockedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getLockedDate_JsonNullable() {
    return lockedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED_DATE)
  public void setLockedDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> lockedDate) {
    this.lockedDate = lockedDate;
  }

  public void setLockedDate(DateTimeRangeSelectorModel lockedDate) {
    this.lockedDate = JsonNullable.<DateTimeRangeSelectorModel>of(lockedDate);
  }


  public ProjectTestPlansFilterModel automaticDurationTimer(Set<Boolean> automaticDurationTimer) {
    this.automaticDurationTimer = JsonNullable.<Set<Boolean>>of(automaticDurationTimer);
    return this;
  }

  public ProjectTestPlansFilterModel addAutomaticDurationTimerItem(Boolean automaticDurationTimerItem) {
    if (this.automaticDurationTimer == null || !this.automaticDurationTimer.isPresent()) {
      this.automaticDurationTimer = JsonNullable.<Set<Boolean>>of(new LinkedHashSet<>());
    }
    try {
      this.automaticDurationTimer.get().add(automaticDurationTimerItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get automaticDurationTimer
   * @return automaticDurationTimer
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<Boolean> getAutomaticDurationTimer() {
        return automaticDurationTimer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTOMATIC_DURATION_TIMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<Boolean>> getAutomaticDurationTimer_JsonNullable() {
    return automaticDurationTimer;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTOMATIC_DURATION_TIMER)
  public void setAutomaticDurationTimer_JsonNullable(JsonNullable<Set<Boolean>> automaticDurationTimer) {
    this.automaticDurationTimer = automaticDurationTimer;
  }

  public void setAutomaticDurationTimer(Set<Boolean> automaticDurationTimer) {
    this.automaticDurationTimer = JsonNullable.<Set<Boolean>>of(automaticDurationTimer);
  }


  public ProjectTestPlansFilterModel createdByIds(Set<UUID> createdByIds) {
    this.createdByIds = JsonNullable.<Set<UUID>>of(createdByIds);
    return this;
  }

  public ProjectTestPlansFilterModel addCreatedByIdsItem(UUID createdByIdsItem) {
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


  public ProjectTestPlansFilterModel createdDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = JsonNullable.<DateTimeRangeSelectorModel>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = JsonNullable.<DateTimeRangeSelectorModel>of(createdDate);
  }


  public ProjectTestPlansFilterModel startDate(DateTimeRangeSelectorModel startDate) {
    this.startDate = JsonNullable.<DateTimeRangeSelectorModel>of(startDate);
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(DateTimeRangeSelectorModel startDate) {
    this.startDate = JsonNullable.<DateTimeRangeSelectorModel>of(startDate);
  }


  public ProjectTestPlansFilterModel endDate(DateTimeRangeSelectorModel endDate) {
    this.endDate = JsonNullable.<DateTimeRangeSelectorModel>of(endDate);
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public DateTimeRangeSelectorModel getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<DateTimeRangeSelectorModel> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<DateTimeRangeSelectorModel> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(DateTimeRangeSelectorModel endDate) {
    this.endDate = JsonNullable.<DateTimeRangeSelectorModel>of(endDate);
  }


  public ProjectTestPlansFilterModel tagNames(Set<String> tagNames) {
    this.tagNames = JsonNullable.<Set<String>>of(tagNames);
    return this;
  }

  public ProjectTestPlansFilterModel addTagNamesItem(String tagNamesItem) {
    if (this.tagNames == null || !this.tagNames.isPresent()) {
      this.tagNames = JsonNullable.<Set<String>>of(new LinkedHashSet<>());
    }
    try {
      this.tagNames.get().add(tagNamesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get tagNames
   * @return tagNames
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<String> getTagNames() {
        return tagNames.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAG_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<String>> getTagNames_JsonNullable() {
    return tagNames;
  }
  
  @JsonProperty(JSON_PROPERTY_TAG_NAMES)
  public void setTagNames_JsonNullable(JsonNullable<Set<String>> tagNames) {
    this.tagNames = tagNames;
  }

  public void setTagNames(Set<String> tagNames) {
    this.tagNames = JsonNullable.<Set<String>>of(tagNames);
  }


  public ProjectTestPlansFilterModel attributes(Map<String, Set<String>> attributes) {
    this.attributes = JsonNullable.<Map<String, Set<String>>>of(attributes);
    return this;
  }

  public ProjectTestPlansFilterModel putAttributesItem(String key, Set<String> attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<Map<String, Set<String>>>of(new HashMap<>());
    }
    try {
      this.attributes.get().put(key, attributesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, Set<String>> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Set<String>>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<Map<String, Set<String>>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = JsonNullable.<Map<String, Set<String>>>of(attributes);
  }


  public ProjectTestPlansFilterModel isDeleted(Boolean isDeleted) {
    this.isDeleted = JsonNullable.<Boolean>of(isDeleted);
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
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


  /**
   * Return true if this ProjectTestPlansFilterModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTestPlansFilterModel projectTestPlansFilterModel = (ProjectTestPlansFilterModel) o;
    return equalsNullable(this.name, projectTestPlansFilterModel.name) &&
        equalsNullable(this.description, projectTestPlansFilterModel.description) &&
        equalsNullable(this.build, projectTestPlansFilterModel.build) &&
        equalsNullable(this.productName, projectTestPlansFilterModel.productName) &&
        equalsNullable(this.status, projectTestPlansFilterModel.status) &&
        equalsNullable(this.globalIds, projectTestPlansFilterModel.globalIds) &&
        equalsNullable(this.isLocked, projectTestPlansFilterModel.isLocked) &&
        equalsNullable(this.lockedDate, projectTestPlansFilterModel.lockedDate) &&
        equalsNullable(this.automaticDurationTimer, projectTestPlansFilterModel.automaticDurationTimer) &&
        equalsNullable(this.createdByIds, projectTestPlansFilterModel.createdByIds) &&
        equalsNullable(this.createdDate, projectTestPlansFilterModel.createdDate) &&
        equalsNullable(this.startDate, projectTestPlansFilterModel.startDate) &&
        equalsNullable(this.endDate, projectTestPlansFilterModel.endDate) &&
        equalsNullable(this.tagNames, projectTestPlansFilterModel.tagNames) &&
        equalsNullable(this.attributes, projectTestPlansFilterModel.attributes) &&
        equalsNullable(this.isDeleted, projectTestPlansFilterModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(description), hashCodeNullable(build), hashCodeNullable(productName), hashCodeNullable(status), hashCodeNullable(globalIds), hashCodeNullable(isLocked), hashCodeNullable(lockedDate), hashCodeNullable(automaticDurationTimer), hashCodeNullable(createdByIds), hashCodeNullable(createdDate), hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(tagNames), hashCodeNullable(attributes), hashCodeNullable(isDeleted));
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
    sb.append("class ProjectTestPlansFilterModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
    sb.append("    automaticDurationTimer: ").append(toIndentedString(automaticDurationTimer)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

