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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.UserWithRankModelUserRank;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * WorkItemCommentModelUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemCommentModelUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private String userType;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_AVATAR_METADATA = "avatarMetadata";
  @SerializedName(SERIALIZED_NAME_AVATAR_METADATA)
  private String avatarMetadata;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_IS_DISABLED = "isDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private UUID providerId;

  public static final String SERIALIZED_NAME_IS_ACTIVE_STATUS_BY_ENTITY = "isActiveStatusByEntity";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE_STATUS_BY_ENTITY)
  private Boolean isActiveStatusByEntity;

  public static final String SERIALIZED_NAME_USER_RANK = "userRank";
  @SerializedName(SERIALIZED_NAME_USER_RANK)
  private UserWithRankModelUserRank userRank;

  public WorkItemCommentModelUser() {
  }

  public WorkItemCommentModelUser id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public WorkItemCommentModelUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public WorkItemCommentModelUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public WorkItemCommentModelUser middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nonnull
  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public WorkItemCommentModelUser userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nonnull
  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public WorkItemCommentModelUser displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public WorkItemCommentModelUser userType(String userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @javax.annotation.Nonnull
  public String getUserType() {
    return userType;
  }


  public void setUserType(String userType) {
    this.userType = userType;
  }


  public WorkItemCommentModelUser avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nonnull
  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public WorkItemCommentModelUser avatarMetadata(String avatarMetadata) {
    
    this.avatarMetadata = avatarMetadata;
    return this;
  }

   /**
   * Get avatarMetadata
   * @return avatarMetadata
  **/
  @javax.annotation.Nonnull
  public String getAvatarMetadata() {
    return avatarMetadata;
  }


  public void setAvatarMetadata(String avatarMetadata) {
    this.avatarMetadata = avatarMetadata;
  }


  public WorkItemCommentModelUser isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public WorkItemCommentModelUser isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDisabled() {
    return isDisabled;
  }


  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public WorkItemCommentModelUser providerId(UUID providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @javax.annotation.Nullable
  public UUID getProviderId() {
    return providerId;
  }


  public void setProviderId(UUID providerId) {
    this.providerId = providerId;
  }


  public WorkItemCommentModelUser isActiveStatusByEntity(Boolean isActiveStatusByEntity) {
    
    this.isActiveStatusByEntity = isActiveStatusByEntity;
    return this;
  }

   /**
   * Get isActiveStatusByEntity
   * @return isActiveStatusByEntity
  **/
  @javax.annotation.Nonnull
  public Boolean getIsActiveStatusByEntity() {
    return isActiveStatusByEntity;
  }


  public void setIsActiveStatusByEntity(Boolean isActiveStatusByEntity) {
    this.isActiveStatusByEntity = isActiveStatusByEntity;
  }


  public WorkItemCommentModelUser userRank(UserWithRankModelUserRank userRank) {
    
    this.userRank = userRank;
    return this;
  }

   /**
   * Get userRank
   * @return userRank
  **/
  @javax.annotation.Nonnull
  public UserWithRankModelUserRank getUserRank() {
    return userRank;
  }


  public void setUserRank(UserWithRankModelUserRank userRank) {
    this.userRank = userRank;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemCommentModelUser workItemCommentModelUser = (WorkItemCommentModelUser) o;
    return Objects.equals(this.id, workItemCommentModelUser.id) &&
        Objects.equals(this.firstName, workItemCommentModelUser.firstName) &&
        Objects.equals(this.lastName, workItemCommentModelUser.lastName) &&
        Objects.equals(this.middleName, workItemCommentModelUser.middleName) &&
        Objects.equals(this.userName, workItemCommentModelUser.userName) &&
        Objects.equals(this.displayName, workItemCommentModelUser.displayName) &&
        Objects.equals(this.userType, workItemCommentModelUser.userType) &&
        Objects.equals(this.avatarUrl, workItemCommentModelUser.avatarUrl) &&
        Objects.equals(this.avatarMetadata, workItemCommentModelUser.avatarMetadata) &&
        Objects.equals(this.isDeleted, workItemCommentModelUser.isDeleted) &&
        Objects.equals(this.isDisabled, workItemCommentModelUser.isDisabled) &&
        Objects.equals(this.providerId, workItemCommentModelUser.providerId) &&
        Objects.equals(this.isActiveStatusByEntity, workItemCommentModelUser.isActiveStatusByEntity) &&
        Objects.equals(this.userRank, workItemCommentModelUser.userRank);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, middleName, userName, displayName, userType, avatarUrl, avatarMetadata, isDeleted, isDisabled, providerId, isActiveStatusByEntity, userRank);
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
    sb.append("class WorkItemCommentModelUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    avatarMetadata: ").append(toIndentedString(avatarMetadata)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    isActiveStatusByEntity: ").append(toIndentedString(isActiveStatusByEntity)).append("\n");
    sb.append("    userRank: ").append(toIndentedString(userRank)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("middleName");
    openapiFields.add("userName");
    openapiFields.add("displayName");
    openapiFields.add("userType");
    openapiFields.add("avatarUrl");
    openapiFields.add("avatarMetadata");
    openapiFields.add("isDeleted");
    openapiFields.add("isDisabled");
    openapiFields.add("providerId");
    openapiFields.add("isActiveStatusByEntity");
    openapiFields.add("userRank");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("middleName");
    openapiRequiredFields.add("userName");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("userType");
    openapiRequiredFields.add("avatarUrl");
    openapiRequiredFields.add("avatarMetadata");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("isDisabled");
    openapiRequiredFields.add("isActiveStatusByEntity");
    openapiRequiredFields.add("userRank");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemCommentModelUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemCommentModelUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemCommentModelUser is not found in the empty JSON string", WorkItemCommentModelUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemCommentModelUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemCommentModelUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemCommentModelUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if (!jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("userType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userType").toString()));
      }
      if (!jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if (!jsonObj.get("avatarMetadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarMetadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarMetadata").toString()));
      }
      if ((jsonObj.get("providerId") != null && !jsonObj.get("providerId").isJsonNull()) && !jsonObj.get("providerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerId").toString()));
      }
      // validate the required field `userRank`
      UserWithRankModelUserRank.validateJsonObject(jsonObj.getAsJsonObject("userRank"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemCommentModelUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemCommentModelUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemCommentModelUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemCommentModelUser.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemCommentModelUser>() {
           @Override
           public void write(JsonWriter out, WorkItemCommentModelUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemCommentModelUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemCommentModelUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemCommentModelUser
  * @throws IOException if the JSON string is invalid with respect to WorkItemCommentModelUser
  */
  public static WorkItemCommentModelUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemCommentModelUser.class);
  }

 /**
  * Convert an instance of WorkItemCommentModelUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
