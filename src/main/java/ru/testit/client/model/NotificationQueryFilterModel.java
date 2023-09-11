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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.NotificationTypeModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * NotificationQueryFilterModel
 */
@JsonPropertyOrder({
  NotificationQueryFilterModel.JSON_PROPERTY_TYPES,
  NotificationQueryFilterModel.JSON_PROPERTY_IS_READ,
  NotificationQueryFilterModel.JSON_PROPERTY_CREATED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationQueryFilterModel {
  public static final String JSON_PROPERTY_TYPES = "types";
  private JsonNullable<Set<NotificationTypeModel>> types = JsonNullable.<Set<NotificationTypeModel>>undefined();

  public static final String JSON_PROPERTY_IS_READ = "isRead";
  private JsonNullable<Boolean> isRead = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<DateTimeRangeSelectorModel> createdDate = JsonNullable.<DateTimeRangeSelectorModel>undefined();

  public NotificationQueryFilterModel() { 
  }

  public NotificationQueryFilterModel types(Set<NotificationTypeModel> types) {
    this.types = JsonNullable.<Set<NotificationTypeModel>>of(types);
    return this;
  }

  public NotificationQueryFilterModel addTypesItem(NotificationTypeModel typesItem) {
    if (this.types == null || !this.types.isPresent()) {
      this.types = JsonNullable.<Set<NotificationTypeModel>>of(new LinkedHashSet<>());
    }
    try {
      this.types.get().add(typesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<NotificationTypeModel> getTypes() {
        return types.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<NotificationTypeModel>> getTypes_JsonNullable() {
    return types;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPES)
  public void setTypes_JsonNullable(JsonNullable<Set<NotificationTypeModel>> types) {
    this.types = types;
  }

  public void setTypes(Set<NotificationTypeModel> types) {
    this.types = JsonNullable.<Set<NotificationTypeModel>>of(types);
  }


  public NotificationQueryFilterModel isRead(Boolean isRead) {
    this.isRead = JsonNullable.<Boolean>of(isRead);
    return this;
  }

   /**
   * Get isRead
   * @return isRead
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getIsRead() {
        return isRead.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsRead_JsonNullable() {
    return isRead;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_READ)
  public void setIsRead_JsonNullable(JsonNullable<Boolean> isRead) {
    this.isRead = isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = JsonNullable.<Boolean>of(isRead);
  }


  public NotificationQueryFilterModel createdDate(DateTimeRangeSelectorModel createdDate) {
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


  /**
   * Return true if this NotificationQueryFilterModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationQueryFilterModel notificationQueryFilterModel = (NotificationQueryFilterModel) o;
    return equalsNullable(this.types, notificationQueryFilterModel.types) &&
        equalsNullable(this.isRead, notificationQueryFilterModel.isRead) &&
        equalsNullable(this.createdDate, notificationQueryFilterModel.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(types), hashCodeNullable(isRead), hashCodeNullable(createdDate));
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
    sb.append("class NotificationQueryFilterModel {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
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

