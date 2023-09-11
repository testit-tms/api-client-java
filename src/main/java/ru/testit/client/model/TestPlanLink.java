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
import ru.testit.client.model.ExternalLinkModel;
import ru.testit.client.model.LinkModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestPlanLink
 */
@JsonPropertyOrder({
  TestPlanLink.JSON_PROPERTY_BUG_LINK,
  TestPlanLink.JSON_PROPERTY_WORK_ITEM_GLOBAL_ID,
  TestPlanLink.JSON_PROPERTY_WORK_ITEM_NAME,
  TestPlanLink.JSON_PROPERTY_CONFIGURATION_NAME,
  TestPlanLink.JSON_PROPERTY_CREATED_BY_ID,
  TestPlanLink.JSON_PROPERTY_COMMENT,
  TestPlanLink.JSON_PROPERTY_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanLink {
  public static final String JSON_PROPERTY_BUG_LINK = "bugLink";
  private JsonNullable<LinkModel> bugLink = JsonNullable.<LinkModel>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_GLOBAL_ID = "workItemGlobalId";
  private JsonNullable<Long> workItemGlobalId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_WORK_ITEM_NAME = "workItemName";
  private JsonNullable<String> workItemName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONFIGURATION_NAME = "configurationName";
  private JsonNullable<String> configurationName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private JsonNullable<UUID> createdById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  private JsonNullable<ExternalLinkModel> info = JsonNullable.<ExternalLinkModel>undefined();

  public TestPlanLink() { 
  }

  public TestPlanLink bugLink(LinkModel bugLink) {
    this.bugLink = JsonNullable.<LinkModel>of(bugLink);
    return this;
  }

   /**
   * Get bugLink
   * @return bugLink
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public LinkModel getBugLink() {
        return bugLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUG_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LinkModel> getBugLink_JsonNullable() {
    return bugLink;
  }
  
  @JsonProperty(JSON_PROPERTY_BUG_LINK)
  public void setBugLink_JsonNullable(JsonNullable<LinkModel> bugLink) {
    this.bugLink = bugLink;
  }

  public void setBugLink(LinkModel bugLink) {
    this.bugLink = JsonNullable.<LinkModel>of(bugLink);
  }


  public TestPlanLink workItemGlobalId(Long workItemGlobalId) {
    this.workItemGlobalId = JsonNullable.<Long>of(workItemGlobalId);
    return this;
  }

   /**
   * Get workItemGlobalId
   * @return workItemGlobalId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Long getWorkItemGlobalId() {
        return workItemGlobalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getWorkItemGlobalId_JsonNullable() {
    return workItemGlobalId;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_GLOBAL_ID)
  public void setWorkItemGlobalId_JsonNullable(JsonNullable<Long> workItemGlobalId) {
    this.workItemGlobalId = workItemGlobalId;
  }

  public void setWorkItemGlobalId(Long workItemGlobalId) {
    this.workItemGlobalId = JsonNullable.<Long>of(workItemGlobalId);
  }


  public TestPlanLink workItemName(String workItemName) {
    this.workItemName = JsonNullable.<String>of(workItemName);
    return this;
  }

   /**
   * Get workItemName
   * @return workItemName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getWorkItemName() {
        return workItemName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWorkItemName_JsonNullable() {
    return workItemName;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_NAME)
  public void setWorkItemName_JsonNullable(JsonNullable<String> workItemName) {
    this.workItemName = workItemName;
  }

  public void setWorkItemName(String workItemName) {
    this.workItemName = JsonNullable.<String>of(workItemName);
  }


  public TestPlanLink configurationName(String configurationName) {
    this.configurationName = JsonNullable.<String>of(configurationName);
    return this;
  }

   /**
   * Get configurationName
   * @return configurationName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getConfigurationName() {
        return configurationName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIGURATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConfigurationName_JsonNullable() {
    return configurationName;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_NAME)
  public void setConfigurationName_JsonNullable(JsonNullable<String> configurationName) {
    this.configurationName = configurationName;
  }

  public void setConfigurationName(String configurationName) {
    this.configurationName = JsonNullable.<String>of(configurationName);
  }


  public TestPlanLink createdById(UUID createdById) {
    this.createdById = JsonNullable.<UUID>of(createdById);
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getCreatedById() {
        return createdById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getCreatedById_JsonNullable() {
    return createdById;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  public void setCreatedById_JsonNullable(JsonNullable<UUID> createdById) {
    this.createdById = createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = JsonNullable.<UUID>of(createdById);
  }


  public TestPlanLink comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }


  public TestPlanLink info(ExternalLinkModel info) {
    this.info = JsonNullable.<ExternalLinkModel>of(info);
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public ExternalLinkModel getInfo() {
        return info.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ExternalLinkModel> getInfo_JsonNullable() {
    return info;
  }
  
  @JsonProperty(JSON_PROPERTY_INFO)
  public void setInfo_JsonNullable(JsonNullable<ExternalLinkModel> info) {
    this.info = info;
  }

  public void setInfo(ExternalLinkModel info) {
    this.info = JsonNullable.<ExternalLinkModel>of(info);
  }


  /**
   * Return true if this TestPlanLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanLink testPlanLink = (TestPlanLink) o;
    return equalsNullable(this.bugLink, testPlanLink.bugLink) &&
        equalsNullable(this.workItemGlobalId, testPlanLink.workItemGlobalId) &&
        equalsNullable(this.workItemName, testPlanLink.workItemName) &&
        equalsNullable(this.configurationName, testPlanLink.configurationName) &&
        equalsNullable(this.createdById, testPlanLink.createdById) &&
        equalsNullable(this.comment, testPlanLink.comment) &&
        equalsNullable(this.info, testPlanLink.info);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bugLink), hashCodeNullable(workItemGlobalId), hashCodeNullable(workItemName), hashCodeNullable(configurationName), hashCodeNullable(createdById), hashCodeNullable(comment), hashCodeNullable(info));
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
    sb.append("class TestPlanLink {\n");
    sb.append("    bugLink: ").append(toIndentedString(bugLink)).append("\n");
    sb.append("    workItemGlobalId: ").append(toIndentedString(workItemGlobalId)).append("\n");
    sb.append("    workItemName: ").append(toIndentedString(workItemName)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

