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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutotestFilterModelCreatedDate;
import ru.testit.client.model.AutotestFilterModelModifiedDate;
import ru.testit.client.model.AutotestFilterModelStabilityPercentage;
import ru.testit.client.model.AutotestResultOutcome;

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
 * Object containing different filters to adjust search
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotestsSelectModelFilter {
  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<UUID> projectIds;

  public static final String SERIALIZED_NAME_EXTERNAL_IDS = "externalIds";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDS)
  private Set<String> externalIds;

  public static final String SERIALIZED_NAME_GLOBAL_IDS = "globalIds";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IDS)
  private Set<Long> globalIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_FLAKY = "isFlaky";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY)
  private Boolean isFlaky;

  public static final String SERIALIZED_NAME_MUST_BE_APPROVED = "mustBeApproved";
  @SerializedName(SERIALIZED_NAME_MUST_BE_APPROVED)
  private Boolean mustBeApproved;

  public static final String SERIALIZED_NAME_STABILITY_PERCENTAGE = "stabilityPercentage";
  @SerializedName(SERIALIZED_NAME_STABILITY_PERCENTAGE)
  private AutotestFilterModelStabilityPercentage stabilityPercentage;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private AutotestFilterModelCreatedDate createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_IDS = "createdByIds";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_IDS)
  private Set<UUID> createdByIds;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private AutotestFilterModelModifiedDate modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_IDS = "modifiedByIds";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_IDS)
  private Set<UUID> modifiedByIds;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_IS_EMPTY_NAMESPACE = "isEmptyNamespace";
  @SerializedName(SERIALIZED_NAME_IS_EMPTY_NAMESPACE)
  private Boolean isEmptyNamespace;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public static final String SERIALIZED_NAME_IS_EMPTY_CLASS_NAME = "isEmptyClassName";
  @SerializedName(SERIALIZED_NAME_IS_EMPTY_CLASS_NAME)
  private Boolean isEmptyClassName;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT_OUTCOME = "lastTestResultOutcome";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT_OUTCOME)
  private AutotestResultOutcome lastTestResultOutcome;

  public static final String SERIALIZED_NAME_EXTERNAL_KEY = "externalKey";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_KEY)
  private String externalKey;

  public AutotestsSelectModelFilter() {
  }

  public AutotestsSelectModelFilter projectIds(Set<UUID> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public AutotestsSelectModelFilter addProjectIdsItem(UUID projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new LinkedHashSet<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * Specifies an autotest projects IDs to search for
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(Set<UUID> projectIds) {
    this.projectIds = projectIds;
  }


  public AutotestsSelectModelFilter externalIds(Set<String> externalIds) {
    
    this.externalIds = externalIds;
    return this;
  }

  public AutotestsSelectModelFilter addExternalIdsItem(String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new LinkedHashSet<>();
    }
    this.externalIds.add(externalIdsItem);
    return this;
  }

   /**
   * Specifies an autotest external IDs to search for
   * @return externalIds
  **/
  @javax.annotation.Nullable
  public Set<String> getExternalIds() {
    return externalIds;
  }


  public void setExternalIds(Set<String> externalIds) {
    this.externalIds = externalIds;
  }


  public AutotestsSelectModelFilter globalIds(Set<Long> globalIds) {
    
    this.globalIds = globalIds;
    return this;
  }

  public AutotestsSelectModelFilter addGlobalIdsItem(Long globalIdsItem) {
    if (this.globalIds == null) {
      this.globalIds = new LinkedHashSet<>();
    }
    this.globalIds.add(globalIdsItem);
    return this;
  }

   /**
   * Specifies an autotest global IDs to search for
   * @return globalIds
  **/
  @javax.annotation.Nullable
  public Set<Long> getGlobalIds() {
    return globalIds;
  }


  public void setGlobalIds(Set<Long> globalIds) {
    this.globalIds = globalIds;
  }


  public AutotestsSelectModelFilter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies an autotest name to search for
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AutotestsSelectModelFilter isFlaky(Boolean isFlaky) {
    
    this.isFlaky = isFlaky;
    return this;
  }

   /**
   * Specifies an autotest flaky status to search for
   * @return isFlaky
  **/
  @javax.annotation.Nullable
  public Boolean getIsFlaky() {
    return isFlaky;
  }


  public void setIsFlaky(Boolean isFlaky) {
    this.isFlaky = isFlaky;
  }


  public AutotestsSelectModelFilter mustBeApproved(Boolean mustBeApproved) {
    
    this.mustBeApproved = mustBeApproved;
    return this;
  }

   /**
   * Specifies an autotest unapproved changes status to search for
   * @return mustBeApproved
  **/
  @javax.annotation.Nullable
  public Boolean getMustBeApproved() {
    return mustBeApproved;
  }


  public void setMustBeApproved(Boolean mustBeApproved) {
    this.mustBeApproved = mustBeApproved;
  }


  public AutotestsSelectModelFilter stabilityPercentage(AutotestFilterModelStabilityPercentage stabilityPercentage) {
    
    this.stabilityPercentage = stabilityPercentage;
    return this;
  }

   /**
   * Get stabilityPercentage
   * @return stabilityPercentage
  **/
  @javax.annotation.Nullable
  public AutotestFilterModelStabilityPercentage getStabilityPercentage() {
    return stabilityPercentage;
  }


  public void setStabilityPercentage(AutotestFilterModelStabilityPercentage stabilityPercentage) {
    this.stabilityPercentage = stabilityPercentage;
  }


  public AutotestsSelectModelFilter createdDate(AutotestFilterModelCreatedDate createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public AutotestFilterModelCreatedDate getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(AutotestFilterModelCreatedDate createdDate) {
    this.createdDate = createdDate;
  }


  public AutotestsSelectModelFilter createdByIds(Set<UUID> createdByIds) {
    
    this.createdByIds = createdByIds;
    return this;
  }

  public AutotestsSelectModelFilter addCreatedByIdsItem(UUID createdByIdsItem) {
    if (this.createdByIds == null) {
      this.createdByIds = new LinkedHashSet<>();
    }
    this.createdByIds.add(createdByIdsItem);
    return this;
  }

   /**
   * Specifies an autotest creator IDs to search for
   * @return createdByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getCreatedByIds() {
    return createdByIds;
  }


  public void setCreatedByIds(Set<UUID> createdByIds) {
    this.createdByIds = createdByIds;
  }


  public AutotestsSelectModelFilter modifiedDate(AutotestFilterModelModifiedDate modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public AutotestFilterModelModifiedDate getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(AutotestFilterModelModifiedDate modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public AutotestsSelectModelFilter modifiedByIds(Set<UUID> modifiedByIds) {
    
    this.modifiedByIds = modifiedByIds;
    return this;
  }

  public AutotestsSelectModelFilter addModifiedByIdsItem(UUID modifiedByIdsItem) {
    if (this.modifiedByIds == null) {
      this.modifiedByIds = new LinkedHashSet<>();
    }
    this.modifiedByIds.add(modifiedByIdsItem);
    return this;
  }

   /**
   * Specifies an autotest last editor IDs to search for
   * @return modifiedByIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getModifiedByIds() {
    return modifiedByIds;
  }


  public void setModifiedByIds(Set<UUID> modifiedByIds) {
    this.modifiedByIds = modifiedByIds;
  }


  public AutotestsSelectModelFilter isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Specifies an autotest deleted status to search for
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public AutotestsSelectModelFilter namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Specifies an autotest namespace to search for
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public AutotestsSelectModelFilter isEmptyNamespace(Boolean isEmptyNamespace) {
    
    this.isEmptyNamespace = isEmptyNamespace;
    return this;
  }

   /**
   * Specifies an autotest namespace name presence status to search for
   * @return isEmptyNamespace
  **/
  @javax.annotation.Nullable
  public Boolean getIsEmptyNamespace() {
    return isEmptyNamespace;
  }


  public void setIsEmptyNamespace(Boolean isEmptyNamespace) {
    this.isEmptyNamespace = isEmptyNamespace;
  }


  public AutotestsSelectModelFilter className(String className) {
    
    this.className = className;
    return this;
  }

   /**
   * Specifies an autotest class name to search for
   * @return className
  **/
  @javax.annotation.Nullable
  public String getClassName() {
    return className;
  }


  public void setClassName(String className) {
    this.className = className;
  }


  public AutotestsSelectModelFilter isEmptyClassName(Boolean isEmptyClassName) {
    
    this.isEmptyClassName = isEmptyClassName;
    return this;
  }

   /**
   * Specifies an autotest class name presence status to search for
   * @return isEmptyClassName
  **/
  @javax.annotation.Nullable
  public Boolean getIsEmptyClassName() {
    return isEmptyClassName;
  }


  public void setIsEmptyClassName(Boolean isEmptyClassName) {
    this.isEmptyClassName = isEmptyClassName;
  }


  public AutotestsSelectModelFilter lastTestResultOutcome(AutotestResultOutcome lastTestResultOutcome) {
    
    this.lastTestResultOutcome = lastTestResultOutcome;
    return this;
  }

   /**
   * Get lastTestResultOutcome
   * @return lastTestResultOutcome
  **/
  @javax.annotation.Nullable
  public AutotestResultOutcome getLastTestResultOutcome() {
    return lastTestResultOutcome;
  }


  public void setLastTestResultOutcome(AutotestResultOutcome lastTestResultOutcome) {
    this.lastTestResultOutcome = lastTestResultOutcome;
  }


  public AutotestsSelectModelFilter externalKey(String externalKey) {
    
    this.externalKey = externalKey;
    return this;
  }

   /**
   * Specifies an autotest external key to search for
   * @return externalKey
  **/
  @javax.annotation.Nullable
  public String getExternalKey() {
    return externalKey;
  }


  public void setExternalKey(String externalKey) {
    this.externalKey = externalKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotestsSelectModelFilter autotestsSelectModelFilter = (AutotestsSelectModelFilter) o;
    return Objects.equals(this.projectIds, autotestsSelectModelFilter.projectIds) &&
        Objects.equals(this.externalIds, autotestsSelectModelFilter.externalIds) &&
        Objects.equals(this.globalIds, autotestsSelectModelFilter.globalIds) &&
        Objects.equals(this.name, autotestsSelectModelFilter.name) &&
        Objects.equals(this.isFlaky, autotestsSelectModelFilter.isFlaky) &&
        Objects.equals(this.mustBeApproved, autotestsSelectModelFilter.mustBeApproved) &&
        Objects.equals(this.stabilityPercentage, autotestsSelectModelFilter.stabilityPercentage) &&
        Objects.equals(this.createdDate, autotestsSelectModelFilter.createdDate) &&
        Objects.equals(this.createdByIds, autotestsSelectModelFilter.createdByIds) &&
        Objects.equals(this.modifiedDate, autotestsSelectModelFilter.modifiedDate) &&
        Objects.equals(this.modifiedByIds, autotestsSelectModelFilter.modifiedByIds) &&
        Objects.equals(this.isDeleted, autotestsSelectModelFilter.isDeleted) &&
        Objects.equals(this.namespace, autotestsSelectModelFilter.namespace) &&
        Objects.equals(this.isEmptyNamespace, autotestsSelectModelFilter.isEmptyNamespace) &&
        Objects.equals(this.className, autotestsSelectModelFilter.className) &&
        Objects.equals(this.isEmptyClassName, autotestsSelectModelFilter.isEmptyClassName) &&
        Objects.equals(this.lastTestResultOutcome, autotestsSelectModelFilter.lastTestResultOutcome) &&
        Objects.equals(this.externalKey, autotestsSelectModelFilter.externalKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, externalIds, globalIds, name, isFlaky, mustBeApproved, stabilityPercentage, createdDate, createdByIds, modifiedDate, modifiedByIds, isDeleted, namespace, isEmptyNamespace, className, isEmptyClassName, lastTestResultOutcome, externalKey);
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
    sb.append("class AutotestsSelectModelFilter {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    globalIds: ").append(toIndentedString(globalIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFlaky: ").append(toIndentedString(isFlaky)).append("\n");
    sb.append("    mustBeApproved: ").append(toIndentedString(mustBeApproved)).append("\n");
    sb.append("    stabilityPercentage: ").append(toIndentedString(stabilityPercentage)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByIds: ").append(toIndentedString(createdByIds)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedByIds: ").append(toIndentedString(modifiedByIds)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    isEmptyNamespace: ").append(toIndentedString(isEmptyNamespace)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    isEmptyClassName: ").append(toIndentedString(isEmptyClassName)).append("\n");
    sb.append("    lastTestResultOutcome: ").append(toIndentedString(lastTestResultOutcome)).append("\n");
    sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
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
    openapiFields.add("projectIds");
    openapiFields.add("externalIds");
    openapiFields.add("globalIds");
    openapiFields.add("name");
    openapiFields.add("isFlaky");
    openapiFields.add("mustBeApproved");
    openapiFields.add("stabilityPercentage");
    openapiFields.add("createdDate");
    openapiFields.add("createdByIds");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedByIds");
    openapiFields.add("isDeleted");
    openapiFields.add("namespace");
    openapiFields.add("isEmptyNamespace");
    openapiFields.add("className");
    openapiFields.add("isEmptyClassName");
    openapiFields.add("lastTestResultOutcome");
    openapiFields.add("externalKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutotestsSelectModelFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutotestsSelectModelFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutotestsSelectModelFilter is not found in the empty JSON string", AutotestsSelectModelFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutotestsSelectModelFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutotestsSelectModelFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("externalIds") != null && !jsonObj.get("externalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalIds` to be an array in the JSON string but got `%s`", jsonObj.get("externalIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("globalIds") != null && !jsonObj.get("globalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalIds` to be an array in the JSON string but got `%s`", jsonObj.get("globalIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `stabilityPercentage`
      if (jsonObj.get("stabilityPercentage") != null && !jsonObj.get("stabilityPercentage").isJsonNull()) {
        AutotestFilterModelStabilityPercentage.validateJsonObject(jsonObj.getAsJsonObject("stabilityPercentage"));
      }
      // validate the optional field `createdDate`
      if (jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) {
        AutotestFilterModelCreatedDate.validateJsonObject(jsonObj.getAsJsonObject("createdDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("createdByIds") != null && !jsonObj.get("createdByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdByIds` to be an array in the JSON string but got `%s`", jsonObj.get("createdByIds").toString()));
      }
      // validate the optional field `modifiedDate`
      if (jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) {
        AutotestFilterModelModifiedDate.validateJsonObject(jsonObj.getAsJsonObject("modifiedDate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modifiedByIds") != null && !jsonObj.get("modifiedByIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedByIds` to be an array in the JSON string but got `%s`", jsonObj.get("modifiedByIds").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("className") != null && !jsonObj.get("className").isJsonNull()) && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
      if ((jsonObj.get("externalKey") != null && !jsonObj.get("externalKey").isJsonNull()) && !jsonObj.get("externalKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutotestsSelectModelFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutotestsSelectModelFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutotestsSelectModelFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutotestsSelectModelFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<AutotestsSelectModelFilter>() {
           @Override
           public void write(JsonWriter out, AutotestsSelectModelFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutotestsSelectModelFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutotestsSelectModelFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutotestsSelectModelFilter
  * @throws IOException if the JSON string is invalid with respect to AutotestsSelectModelFilter
  */
  public static AutotestsSelectModelFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutotestsSelectModelFilter.class);
  }

 /**
  * Convert an instance of AutotestsSelectModelFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

