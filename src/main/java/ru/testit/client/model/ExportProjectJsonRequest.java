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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ExportProjectJsonRequest
 */
@JsonPropertyOrder({
  ExportProjectJsonRequest.JSON_PROPERTY_SECTION_IDS,
  ExportProjectJsonRequest.JSON_PROPERTY_WORK_ITEM_IDS
})
@JsonTypeName("ExportProjectJson_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportProjectJsonRequest {
  public static final String JSON_PROPERTY_SECTION_IDS = "sectionIds";
  private JsonNullable<Set<UUID>> sectionIds = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_IDS = "workItemIds";
  private JsonNullable<Set<UUID>> workItemIds = JsonNullable.<Set<UUID>>undefined();

  public ExportProjectJsonRequest() { 
  }

  public ExportProjectJsonRequest sectionIds(Set<UUID> sectionIds) {
    this.sectionIds = JsonNullable.<Set<UUID>>of(sectionIds);
    return this;
  }

  public ExportProjectJsonRequest addSectionIdsItem(UUID sectionIdsItem) {
    if (this.sectionIds == null || !this.sectionIds.isPresent()) {
      this.sectionIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.sectionIds.get().add(sectionIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Specifies the IDs of the sections you want to export.&lt;br /&gt;  Use this parameter if you want to export certain parts of the project.&lt;br /&gt;  In this parameter, \&quot;&lt;b&gt;string&lt;/b&gt;\&quot; values are IDs of the test library sections.
   * @return sectionIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<UUID> getSectionIds() {
        return sectionIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getSectionIds_JsonNullable() {
    return sectionIds;
  }
  
  @JsonProperty(JSON_PROPERTY_SECTION_IDS)
  public void setSectionIds_JsonNullable(JsonNullable<Set<UUID>> sectionIds) {
    this.sectionIds = sectionIds;
  }

  public void setSectionIds(Set<UUID> sectionIds) {
    this.sectionIds = JsonNullable.<Set<UUID>>of(sectionIds);
  }


  public ExportProjectJsonRequest workItemIds(Set<UUID> workItemIds) {
    this.workItemIds = JsonNullable.<Set<UUID>>of(workItemIds);
    return this;
  }

  public ExportProjectJsonRequest addWorkItemIdsItem(UUID workItemIdsItem) {
    if (this.workItemIds == null || !this.workItemIds.isPresent()) {
      this.workItemIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.workItemIds.get().add(workItemIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Specifies the work items you want to export from a project.&lt;br /&gt;  Use this parameter if you want to export certain work items.&lt;br /&gt;  In this parameter, \&quot;&lt;b&gt;string&lt;/b&gt;\&quot; values are IDs of the work items.
   * @return workItemIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<UUID> getWorkItemIds() {
        return workItemIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getWorkItemIds_JsonNullable() {
    return workItemIds;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_IDS)
  public void setWorkItemIds_JsonNullable(JsonNullable<Set<UUID>> workItemIds) {
    this.workItemIds = workItemIds;
  }

  public void setWorkItemIds(Set<UUID> workItemIds) {
    this.workItemIds = JsonNullable.<Set<UUID>>of(workItemIds);
  }


  /**
   * Return true if this ExportProjectJson_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportProjectJsonRequest exportProjectJsonRequest = (ExportProjectJsonRequest) o;
    return equalsNullable(this.sectionIds, exportProjectJsonRequest.sectionIds) &&
        equalsNullable(this.workItemIds, exportProjectJsonRequest.workItemIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(sectionIds), hashCodeNullable(workItemIds));
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
    sb.append("class ExportProjectJsonRequest {\n");
    sb.append("    sectionIds: ").append(toIndentedString(sectionIds)).append("\n");
    sb.append("    workItemIds: ").append(toIndentedString(workItemIds)).append("\n");
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

