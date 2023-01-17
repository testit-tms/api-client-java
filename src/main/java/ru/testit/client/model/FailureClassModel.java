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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * FailureClassModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FailureClassModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FAILURE_CATEGORY = "failureCategory";
  @SerializedName(SERIALIZED_NAME_FAILURE_CATEGORY)
  private FailureCategoryModel failureCategory;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_FAILURE_CLASS_REGEXES = "failureClassRegexes";
  @SerializedName(SERIALIZED_NAME_FAILURE_CLASS_REGEXES)
  private List<FailureClassRegexModel> failureClassRegexes = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public FailureClassModel() {
  }

  public FailureClassModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FailureClassModel failureCategory(FailureCategoryModel failureCategory) {
    
    this.failureCategory = failureCategory;
    return this;
  }

   /**
   * Get failureCategory
   * @return failureCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FailureCategoryModel getFailureCategory() {
    return failureCategory;
  }


  public void setFailureCategory(FailureCategoryModel failureCategory) {
    this.failureCategory = failureCategory;
  }


  public FailureClassModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public FailureClassModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public FailureClassModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public FailureClassModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public FailureClassModel failureClassRegexes(List<FailureClassRegexModel> failureClassRegexes) {
    
    this.failureClassRegexes = failureClassRegexes;
    return this;
  }

  public FailureClassModel addFailureClassRegexesItem(FailureClassRegexModel failureClassRegexesItem) {
    if (this.failureClassRegexes == null) {
      this.failureClassRegexes = new ArrayList<>();
    }
    this.failureClassRegexes.add(failureClassRegexesItem);
    return this;
  }

   /**
   * Get failureClassRegexes
   * @return failureClassRegexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FailureClassRegexModel> getFailureClassRegexes() {
    return failureClassRegexes;
  }


  public void setFailureClassRegexes(List<FailureClassRegexModel> failureClassRegexes) {
    this.failureClassRegexes = failureClassRegexes;
  }


  public FailureClassModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the entity")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public FailureClassModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the entity is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the entity is deleted")

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
    FailureClassModel failureClassModel = (FailureClassModel) o;
    return Objects.equals(this.name, failureClassModel.name) &&
        Objects.equals(this.failureCategory, failureClassModel.failureCategory) &&
        Objects.equals(this.createdDate, failureClassModel.createdDate) &&
        Objects.equals(this.modifiedDate, failureClassModel.modifiedDate) &&
        Objects.equals(this.createdById, failureClassModel.createdById) &&
        Objects.equals(this.modifiedById, failureClassModel.modifiedById) &&
        Objects.equals(this.failureClassRegexes, failureClassModel.failureClassRegexes) &&
        Objects.equals(this.id, failureClassModel.id) &&
        Objects.equals(this.isDeleted, failureClassModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, failureCategory, createdDate, modifiedDate, createdById, modifiedById, failureClassRegexes, id, isDeleted);
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
    sb.append("class FailureClassModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    failureCategory: ").append(toIndentedString(failureCategory)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    failureClassRegexes: ").append(toIndentedString(failureClassRegexes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("failureCategory");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("failureClassRegexes");
    openapiFields.add("id");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FailureClassModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FailureClassModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FailureClassModel is not found in the empty JSON string", FailureClassModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FailureClassModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FailureClassModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if (jsonObj.get("failureClassRegexes") != null && !jsonObj.get("failureClassRegexes").isJsonNull()) {
        JsonArray jsonArrayfailureClassRegexes = jsonObj.getAsJsonArray("failureClassRegexes");
        if (jsonArrayfailureClassRegexes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("failureClassRegexes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `failureClassRegexes` to be an array in the JSON string but got `%s`", jsonObj.get("failureClassRegexes").toString()));
          }

          // validate the optional field `failureClassRegexes` (array)
          for (int i = 0; i < jsonArrayfailureClassRegexes.size(); i++) {
            FailureClassRegexModel.validateJsonObject(jsonArrayfailureClassRegexes.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FailureClassModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FailureClassModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FailureClassModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FailureClassModel.class));

       return (TypeAdapter<T>) new TypeAdapter<FailureClassModel>() {
           @Override
           public void write(JsonWriter out, FailureClassModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FailureClassModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FailureClassModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FailureClassModel
  * @throws IOException if the JSON string is invalid with respect to FailureClassModel
  */
  public static FailureClassModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FailureClassModel.class);
  }

 /**
  * Convert an instance of FailureClassModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

