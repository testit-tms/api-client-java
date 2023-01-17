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
 * SharedStepReferenceSectionModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedStepReferenceSectionModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_PRECONDITION = "hasThisSharedStepAsPrecondition";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_PRECONDITION)
  private Boolean hasThisSharedStepAsPrecondition;

  public static final String SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_POSTCONDITION = "hasThisSharedStepAsPostcondition";
  @SerializedName(SERIALIZED_NAME_HAS_THIS_SHARED_STEP_AS_POSTCONDITION)
  private Boolean hasThisSharedStepAsPostcondition;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public SharedStepReferenceSectionModel() {
  }

  public SharedStepReferenceSectionModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public SharedStepReferenceSectionModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Basic template", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SharedStepReferenceSectionModel hasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPrecondition
   * @return hasThisSharedStepAsPrecondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getHasThisSharedStepAsPrecondition() {
    return hasThisSharedStepAsPrecondition;
  }


  public void setHasThisSharedStepAsPrecondition(Boolean hasThisSharedStepAsPrecondition) {
    this.hasThisSharedStepAsPrecondition = hasThisSharedStepAsPrecondition;
  }


  public SharedStepReferenceSectionModel hasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
    return this;
  }

   /**
   * Get hasThisSharedStepAsPostcondition
   * @return hasThisSharedStepAsPostcondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getHasThisSharedStepAsPostcondition() {
    return hasThisSharedStepAsPostcondition;
  }


  public void setHasThisSharedStepAsPostcondition(Boolean hasThisSharedStepAsPostcondition) {
    this.hasThisSharedStepAsPostcondition = hasThisSharedStepAsPostcondition;
  }


  public SharedStepReferenceSectionModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public SharedStepReferenceSectionModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public SharedStepReferenceSectionModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public SharedStepReferenceSectionModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public SharedStepReferenceSectionModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

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
    SharedStepReferenceSectionModel sharedStepReferenceSectionModel = (SharedStepReferenceSectionModel) o;
    return Objects.equals(this.id, sharedStepReferenceSectionModel.id) &&
        Objects.equals(this.name, sharedStepReferenceSectionModel.name) &&
        Objects.equals(this.hasThisSharedStepAsPrecondition, sharedStepReferenceSectionModel.hasThisSharedStepAsPrecondition) &&
        Objects.equals(this.hasThisSharedStepAsPostcondition, sharedStepReferenceSectionModel.hasThisSharedStepAsPostcondition) &&
        Objects.equals(this.createdById, sharedStepReferenceSectionModel.createdById) &&
        Objects.equals(this.modifiedById, sharedStepReferenceSectionModel.modifiedById) &&
        Objects.equals(this.createdDate, sharedStepReferenceSectionModel.createdDate) &&
        Objects.equals(this.modifiedDate, sharedStepReferenceSectionModel.modifiedDate) &&
        Objects.equals(this.isDeleted, sharedStepReferenceSectionModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hasThisSharedStepAsPrecondition, hasThisSharedStepAsPostcondition, createdById, modifiedById, createdDate, modifiedDate, isDeleted);
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
    sb.append("class SharedStepReferenceSectionModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasThisSharedStepAsPrecondition: ").append(toIndentedString(hasThisSharedStepAsPrecondition)).append("\n");
    sb.append("    hasThisSharedStepAsPostcondition: ").append(toIndentedString(hasThisSharedStepAsPostcondition)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("hasThisSharedStepAsPrecondition");
    openapiFields.add("hasThisSharedStepAsPostcondition");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SharedStepReferenceSectionModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SharedStepReferenceSectionModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharedStepReferenceSectionModel is not found in the empty JSON string", SharedStepReferenceSectionModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SharedStepReferenceSectionModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SharedStepReferenceSectionModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedStepReferenceSectionModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedStepReferenceSectionModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedStepReferenceSectionModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedStepReferenceSectionModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedStepReferenceSectionModel>() {
           @Override
           public void write(JsonWriter out, SharedStepReferenceSectionModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedStepReferenceSectionModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedStepReferenceSectionModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedStepReferenceSectionModel
  * @throws IOException if the JSON string is invalid with respect to SharedStepReferenceSectionModel
  */
  public static SharedStepReferenceSectionModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedStepReferenceSectionModel.class);
  }

 /**
  * Convert an instance of SharedStepReferenceSectionModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

