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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.DateTimeRangeSelectorModel;
import ru.testit.client.model.TestPlanStatusModel;

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
 * ApiV2ProjectsIdTestPlansSearchPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2ProjectsIdTestPlansSearchPostRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Set<TestPlanStatusModel> status;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds;

  public static final String SERIALIZED_NAME_IS_LOCKED = "isLocked";
  @SerializedName(SERIALIZED_NAME_IS_LOCKED)
  private Boolean isLocked;

  public static final String SERIALIZED_NAME_LOCKED_DATE = "lockedDate";
  @SerializedName(SERIALIZED_NAME_LOCKED_DATE)
  private DateTimeRangeSelectorModel lockedDate;

  public static final String SERIALIZED_NAME_AUTOMATIC_DURATION_TIMER = "automaticDurationTimer";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_DURATION_TIMER)
  private Set<Boolean> automaticDurationTimer;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private DateTimeRangeSelectorModel createdDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private DateTimeRangeSelectorModel startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private DateTimeRangeSelectorModel endDate;

  public static final String SERIALIZED_NAME_TAG_NAMES = "tagNames";
  @SerializedName(SERIALIZED_NAME_TAG_NAMES)
  private Set<String> tagNames;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Set<String>> attributes;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public ApiV2ProjectsIdTestPlansSearchPostRequest() {
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest build(String build) {
    
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @javax.annotation.Nullable
  public String getBuild() {
    return build;
  }


  public void setBuild(String build) {
    this.build = build;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest status(Set<TestPlanStatusModel> status) {
    
    this.status = status;
    return this;
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest addStatusItem(TestPlanStatusModel statusItem) {
    if (this.status == null) {
      this.status = new LinkedHashSet<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Set<TestPlanStatusModel> getStatus() {
    return status;
  }


  public void setStatus(Set<TestPlanStatusModel> status) {
    this.status = status;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null) {
      this.globalIds = new LinkedHashSet<>();
    }
    this.globalIds.add(globalIdsItem);
    return this;
  }

   /**
   * Get globalIds
   * @return globalIds
  **/
  @javax.annotation.Nullable
  public Set<Long> getGlobalIds() {
    return globalIds;
  }


  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @javax.annotation.Nullable
  public Boolean getIsLocked() {
    return isLocked;
  }


  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest lockedDate(DateTimeRangeSelectorModel lockedDate) {
    
    this.lockedDate = lockedDate;
    return this;
  }

   /**
   * Get lockedDate
   * @return lockedDate
  **/
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getLockedDate() {
    return lockedDate;
  }


  public void setLockedDate(DateTimeRangeSelectorModel lockedDate) {
    this.lockedDate = lockedDate;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest automaticDurationTimer(Set<Boolean> automaticDurationTimer) {
    
    this.automaticDurationTimer = automaticDurationTimer;
    return this;
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest addAutomaticDurationTimerItem(Boolean automaticDurationTimerItem) {
    if (this.automaticDurationTimer == null) {
      this.automaticDurationTimer = new LinkedHashSet<>();
    }
    this.automaticDurationTimer.add(automaticDurationTimerItem);
    return this;
  }

   /**
   * Get automaticDurationTimer
   * @return automaticDurationTimer
  **/
  @javax.annotation.Nullable
  public Set<Boolean> getAutomaticDurationTimer() {
    return automaticDurationTimer;
  }


  public void setAutomaticDurationTimer(Set<Boolean> automaticDurationTimer) {
    this.automaticDurationTimer = automaticDurationTimer;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Get createdByIds
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest createdDate(DateTimeRangeSelectorModel createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(DateTimeRangeSelectorModel createdDate) {
    this.createdDate = createdDate;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest startDate(DateTimeRangeSelectorModel startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getStartDate() {
    return startDate;
  }


  public void setStartDate(DateTimeRangeSelectorModel startDate) {
    this.startDate = startDate;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest endDate(DateTimeRangeSelectorModel endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  public DateTimeRangeSelectorModel getEndDate() {
    return endDate;
  }


  public void setEndDate(DateTimeRangeSelectorModel endDate) {
    this.endDate = endDate;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest tagNames(Set<String> tagNames) {
    
    this.tagNames = tagNames;
    return this;
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest addTagNamesItem(String tagNamesItem) {
    if (this.tagNames == null) {
      this.tagNames = new LinkedHashSet<>();
    }
    this.tagNames.add(tagNamesItem);
    return this;
  }

   /**
   * Get tagNames
   * @return tagNames
  **/
  @javax.annotation.Nullable
  public Set<String> getTagNames() {
    return tagNames;
  }


  public void setTagNames(Set<String> tagNames) {
    this.tagNames = tagNames;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest attributes(Map<String, Set<String>> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ApiV2ProjectsIdTestPlansSearchPostRequest putAttributesItem(String key, Set<String> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public Map<String, Set<String>> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Set<String>> attributes) {
    this.attributes = attributes;
  }


  public ApiV2ProjectsIdTestPlansSearchPostRequest isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2ProjectsIdTestPlansSearchPostRequest apiV2ProjectsIdTestPlansSearchPostRequest = (ApiV2ProjectsIdTestPlansSearchPostRequest) o;
    return Objects.equals(this.name, apiV2ProjectsIdTestPlansSearchPostRequest.name) &&
        Objects.equals(this.description, apiV2ProjectsIdTestPlansSearchPostRequest.description) &&
        Objects.equals(this.build, apiV2ProjectsIdTestPlansSearchPostRequest.build) &&
        Objects.equals(this.productName, apiV2ProjectsIdTestPlansSearchPostRequest.productName) &&
        Objects.equals(this.status, apiV2ProjectsIdTestPlansSearchPostRequest.status) &&
        Objects.equals(this.globalIds, apiV2ProjectsIdTestPlansSearchPostRequest.globalIds) &&
        Objects.equals(this.isLocked, apiV2ProjectsIdTestPlansSearchPostRequest.isLocked) &&
        Objects.equals(this.lockedDate, apiV2ProjectsIdTestPlansSearchPostRequest.lockedDate) &&
        Objects.equals(this.automaticDurationTimer, apiV2ProjectsIdTestPlansSearchPostRequest.automaticDurationTimer) &&
        Objects.equals(this.createdByIds, apiV2ProjectsIdTestPlansSearchPostRequest.createdByIds) &&
        Objects.equals(this.createdDate, apiV2ProjectsIdTestPlansSearchPostRequest.createdDate) &&
        Objects.equals(this.startDate, apiV2ProjectsIdTestPlansSearchPostRequest.startDate) &&
        Objects.equals(this.endDate, apiV2ProjectsIdTestPlansSearchPostRequest.endDate) &&
        Objects.equals(this.tagNames, apiV2ProjectsIdTestPlansSearchPostRequest.tagNames) &&
        Objects.equals(this.attributes, apiV2ProjectsIdTestPlansSearchPostRequest.attributes) &&
        Objects.equals(this.isDeleted, apiV2ProjectsIdTestPlansSearchPostRequest.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, build, productName, status, globalIds, isLocked, lockedDate, automaticDurationTimer, createdByIds, createdDate, startDate, endDate, tagNames, attributes, isDeleted);
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
    sb.append("class ApiV2ProjectsIdTestPlansSearchPostRequest {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("build");
    openapiFields.add("productName");
    openapiFields.add("status");
    openapiFields.add("globalIds");
    openapiFields.add("isLocked");
    openapiFields.add("lockedDate");
    openapiFields.add("automaticDurationTimer");
    openapiFields.add("createdByIds");
    openapiFields.add("createdDate");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("tagNames");
    openapiFields.add("attributes");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2ProjectsIdTestPlansSearchPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2ProjectsIdTestPlansSearchPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2ProjectsIdTestPlansSearchPostRequest is not found in the empty JSON string", ApiV2ProjectsIdTestPlansSearchPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2ProjectsIdTestPlansSearchPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2ProjectsIdTestPlansSearchPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("globalIds") != null && !jsonObj.get("globalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalIds` to be an array in the JSON string but got `%s`", jsonObj.get("globalIds").toString()));
      }
      // validate the optional field `lockedDate`
      if (jsonObj.get("lockedDate") != null && !jsonObj.get("lockedDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("lockedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("automaticDurationTimer") != null && !jsonObj.get("automaticDurationTimer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `automaticDurationTimer` to be an array in the JSON string but got `%s`", jsonObj.get("automaticDurationTimer").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // validate the optional field `startDate`
      if (jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("startDate"));
      }
      // validate the optional field `endDate`
      if (jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) {
        DateTimeRangeSelectorModel.validateJsonObject(jsonObj.getAsJsonObject("endDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tagNames") != null && !jsonObj.get("tagNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagNames` to be an array in the JSON string but got `%s`", jsonObj.get("tagNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2ProjectsIdTestPlansSearchPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2ProjectsIdTestPlansSearchPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2ProjectsIdTestPlansSearchPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2ProjectsIdTestPlansSearchPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2ProjectsIdTestPlansSearchPostRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2ProjectsIdTestPlansSearchPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2ProjectsIdTestPlansSearchPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2ProjectsIdTestPlansSearchPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2ProjectsIdTestPlansSearchPostRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2ProjectsIdTestPlansSearchPostRequest
  */
  public static ApiV2ProjectsIdTestPlansSearchPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2ProjectsIdTestPlansSearchPostRequest.class);
  }

 /**
  * Convert an instance of ApiV2ProjectsIdTestPlansSearchPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

