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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.NotificationTypeModel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * NotificationModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class NotificationModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_IS_READ = "isRead";
  @SerializedName(SERIALIZED_NAME_IS_READ)
  private Boolean isRead;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private UUID entityId;

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationTypeModel notificationType;

  public static final String SERIALIZED_NAME_PROJECT_GLOBAL_ID = "projectGlobalId";
  @SerializedName(SERIALIZED_NAME_PROJECT_GLOBAL_ID)
  private Long projectGlobalId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "projectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID = "testPlanGlobalId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID)
  private Long testPlanGlobalId;

  public static final String SERIALIZED_NAME_TEST_PLAN_NAME = "testPlanName";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_NAME)
  private String testPlanName;

  public static final String SERIALIZED_NAME_WORKITEM_GLOBAL_ID = "workitemGlobalId";
  @SerializedName(SERIALIZED_NAME_WORKITEM_GLOBAL_ID)
  private Long workitemGlobalId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_WORK_ITEM_NAME = "workItemName";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_NAME)
  private String workItemName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public NotificationModel() {
  }

  public NotificationModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public NotificationModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public NotificationModel isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * Get isRead
   * @return isRead
   */
  @javax.annotation.Nonnull
  public Boolean getIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }


  public NotificationModel entityId(UUID entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nonnull
  public UUID getEntityId() {
    return entityId;
  }

  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }


  public NotificationModel notificationType(NotificationTypeModel notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   * @return notificationType
   */
  @javax.annotation.Nonnull
  public NotificationTypeModel getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationTypeModel notificationType) {
    this.notificationType = notificationType;
  }


  public NotificationModel projectGlobalId(Long projectGlobalId) {
    this.projectGlobalId = projectGlobalId;
    return this;
  }

  /**
   * Get projectGlobalId
   * @return projectGlobalId
   */
  @javax.annotation.Nullable
  public Long getProjectGlobalId() {
    return projectGlobalId;
  }

  public void setProjectGlobalId(Long projectGlobalId) {
    this.projectGlobalId = projectGlobalId;
  }


  public NotificationModel projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   */
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public NotificationModel testPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
    return this;
  }

  /**
   * Get testPlanGlobalId
   * @return testPlanGlobalId
   */
  @javax.annotation.Nonnull
  public Long getTestPlanGlobalId() {
    return testPlanGlobalId;
  }

  public void setTestPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
  }


  public NotificationModel testPlanName(String testPlanName) {
    this.testPlanName = testPlanName;
    return this;
  }

  /**
   * Get testPlanName
   * @return testPlanName
   */
  @javax.annotation.Nonnull
  public String getTestPlanName() {
    return testPlanName;
  }

  public void setTestPlanName(String testPlanName) {
    this.testPlanName = testPlanName;
  }


  public NotificationModel workitemGlobalId(Long workitemGlobalId) {
    this.workitemGlobalId = workitemGlobalId;
    return this;
  }

  /**
   * Get workitemGlobalId
   * @return workitemGlobalId
   */
  @javax.annotation.Nullable
  public Long getWorkitemGlobalId() {
    return workitemGlobalId;
  }

  public void setWorkitemGlobalId(Long workitemGlobalId) {
    this.workitemGlobalId = workitemGlobalId;
  }


  public NotificationModel comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nonnull
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public NotificationModel workItemName(String workItemName) {
    this.workItemName = workItemName;
    return this;
  }

  /**
   * Get workItemName
   * @return workItemName
   */
  @javax.annotation.Nonnull
  public String getWorkItemName() {
    return workItemName;
  }

  public void setWorkItemName(String workItemName) {
    this.workItemName = workItemName;
  }


  public NotificationModel attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * Get attributeName
   * @return attributeName
   */
  @javax.annotation.Nullable
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public NotificationModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * Get createdById
   * @return createdById
   */
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationModel notificationModel = (NotificationModel) o;
    return Objects.equals(this.id, notificationModel.id) &&
        Objects.equals(this.createdDate, notificationModel.createdDate) &&
        Objects.equals(this.isRead, notificationModel.isRead) &&
        Objects.equals(this.entityId, notificationModel.entityId) &&
        Objects.equals(this.notificationType, notificationModel.notificationType) &&
        Objects.equals(this.projectGlobalId, notificationModel.projectGlobalId) &&
        Objects.equals(this.projectName, notificationModel.projectName) &&
        Objects.equals(this.testPlanGlobalId, notificationModel.testPlanGlobalId) &&
        Objects.equals(this.testPlanName, notificationModel.testPlanName) &&
        Objects.equals(this.workitemGlobalId, notificationModel.workitemGlobalId) &&
        Objects.equals(this.comment, notificationModel.comment) &&
        Objects.equals(this.workItemName, notificationModel.workItemName) &&
        Objects.equals(this.attributeName, notificationModel.attributeName) &&
        Objects.equals(this.createdById, notificationModel.createdById);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, isRead, entityId, notificationType, projectGlobalId, projectName, testPlanGlobalId, testPlanName, workitemGlobalId, comment, workItemName, attributeName, createdById);
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
    sb.append("class NotificationModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    projectGlobalId: ").append(toIndentedString(projectGlobalId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    testPlanGlobalId: ").append(toIndentedString(testPlanGlobalId)).append("\n");
    sb.append("    testPlanName: ").append(toIndentedString(testPlanName)).append("\n");
    sb.append("    workitemGlobalId: ").append(toIndentedString(workitemGlobalId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    workItemName: ").append(toIndentedString(workItemName)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("createdDate");
    openapiFields.add("isRead");
    openapiFields.add("entityId");
    openapiFields.add("notificationType");
    openapiFields.add("projectGlobalId");
    openapiFields.add("projectName");
    openapiFields.add("testPlanGlobalId");
    openapiFields.add("testPlanName");
    openapiFields.add("workitemGlobalId");
    openapiFields.add("comment");
    openapiFields.add("workItemName");
    openapiFields.add("attributeName");
    openapiFields.add("createdById");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isRead");
    openapiRequiredFields.add("entityId");
    openapiRequiredFields.add("notificationType");
    openapiRequiredFields.add("testPlanGlobalId");
    openapiRequiredFields.add("testPlanName");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("workItemName");
    openapiRequiredFields.add("createdById");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotificationModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationModel is not found in the empty JSON string", NotificationModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotificationModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      // validate the required field `notificationType`
      NotificationTypeModel.validateJsonElement(jsonObj.get("notificationType"));
      if ((jsonObj.get("projectName") != null && !jsonObj.get("projectName").isJsonNull()) && !jsonObj.get("projectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectName").toString()));
      }
      if (!jsonObj.get("testPlanName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanName").toString()));
      }
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (!jsonObj.get("workItemName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemName").toString()));
      }
      if ((jsonObj.get("attributeName") != null && !jsonObj.get("attributeName").isJsonNull()) && !jsonObj.get("attributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeName").toString()));
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationModel.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationModel>() {
           @Override
           public void write(JsonWriter out, NotificationModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotificationModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationModel
   * @throws IOException if the JSON string is invalid with respect to NotificationModel
   */
  public static NotificationModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationModel.class);
  }

  /**
   * Convert an instance of NotificationModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

