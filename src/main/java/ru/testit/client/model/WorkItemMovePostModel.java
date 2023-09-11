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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * WorkItemMovePostModel
 */
@JsonPropertyOrder({
  WorkItemMovePostModel.JSON_PROPERTY_ID,
  WorkItemMovePostModel.JSON_PROPERTY_NEW_SECTION_ID,
  WorkItemMovePostModel.JSON_PROPERTY_OLD_SECTION_ID,
  WorkItemMovePostModel.JSON_PROPERTY_NEXT_WORK_ITEM_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemMovePostModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NEW_SECTION_ID = "newSectionId";
  private UUID newSectionId;

  public static final String JSON_PROPERTY_OLD_SECTION_ID = "oldSectionId";
  private JsonNullable<UUID> oldSectionId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_NEXT_WORK_ITEM_ID = "nextWorkItemId";
  private JsonNullable<UUID> nextWorkItemId = JsonNullable.<UUID>undefined();

  public WorkItemMovePostModel() { 
  }

  public WorkItemMovePostModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public WorkItemMovePostModel newSectionId(UUID newSectionId) {
    this.newSectionId = newSectionId;
    return this;
  }

   /**
   * Get newSectionId
   * @return newSectionId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEW_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getNewSectionId() {
    return newSectionId;
  }


  @JsonProperty(JSON_PROPERTY_NEW_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNewSectionId(UUID newSectionId) {
    this.newSectionId = newSectionId;
  }


  public WorkItemMovePostModel oldSectionId(UUID oldSectionId) {
    this.oldSectionId = JsonNullable.<UUID>of(oldSectionId);
    return this;
  }

   /**
   * Get oldSectionId
   * @return oldSectionId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getOldSectionId() {
        return oldSectionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getOldSectionId_JsonNullable() {
    return oldSectionId;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_SECTION_ID)
  public void setOldSectionId_JsonNullable(JsonNullable<UUID> oldSectionId) {
    this.oldSectionId = oldSectionId;
  }

  public void setOldSectionId(UUID oldSectionId) {
    this.oldSectionId = JsonNullable.<UUID>of(oldSectionId);
  }


  public WorkItemMovePostModel nextWorkItemId(UUID nextWorkItemId) {
    this.nextWorkItemId = JsonNullable.<UUID>of(nextWorkItemId);
    return this;
  }

   /**
   * Get nextWorkItemId
   * @return nextWorkItemId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getNextWorkItemId() {
        return nextWorkItemId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_WORK_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getNextWorkItemId_JsonNullable() {
    return nextWorkItemId;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_WORK_ITEM_ID)
  public void setNextWorkItemId_JsonNullable(JsonNullable<UUID> nextWorkItemId) {
    this.nextWorkItemId = nextWorkItemId;
  }

  public void setNextWorkItemId(UUID nextWorkItemId) {
    this.nextWorkItemId = JsonNullable.<UUID>of(nextWorkItemId);
  }


  /**
   * Return true if this WorkItemMovePostModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemMovePostModel workItemMovePostModel = (WorkItemMovePostModel) o;
    return Objects.equals(this.id, workItemMovePostModel.id) &&
        Objects.equals(this.newSectionId, workItemMovePostModel.newSectionId) &&
        equalsNullable(this.oldSectionId, workItemMovePostModel.oldSectionId) &&
        equalsNullable(this.nextWorkItemId, workItemMovePostModel.nextWorkItemId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newSectionId, hashCodeNullable(oldSectionId), hashCodeNullable(nextWorkItemId));
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
    sb.append("class WorkItemMovePostModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newSectionId: ").append(toIndentedString(newSectionId)).append("\n");
    sb.append("    oldSectionId: ").append(toIndentedString(oldSectionId)).append("\n");
    sb.append("    nextWorkItemId: ").append(toIndentedString(nextWorkItemId)).append("\n");
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

