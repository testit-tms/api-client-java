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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.CustomAttributeModel;
import ru.testit.client.model.ProjectTypeModel;

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
 * ProjectModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_FAVORITE = "isFavorite";
  @SerializedName(SERIALIZED_NAME_IS_FAVORITE)
  private Boolean isFavorite;

  public static final String SERIALIZED_NAME_ATTRIBUTES_SCHEME = "attributesScheme";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_SCHEME)
  private List<CustomAttributeModel> attributesScheme;

  public static final String SERIALIZED_NAME_TEST_PLANS_ATTRIBUTES_SCHEME = "testPlansAttributesScheme";
  @SerializedName(SERIALIZED_NAME_TEST_PLANS_ATTRIBUTES_SCHEME)
  private List<CustomAttributeModel> testPlansAttributesScheme;

  public static final String SERIALIZED_NAME_TEST_CASES_COUNT = "testCasesCount";
  @SerializedName(SERIALIZED_NAME_TEST_CASES_COUNT)
  private Integer testCasesCount;

  public static final String SERIALIZED_NAME_SHARED_STEPS_COUNT = "sharedStepsCount";
  @SerializedName(SERIALIZED_NAME_SHARED_STEPS_COUNT)
  private Integer sharedStepsCount;

  public static final String SERIALIZED_NAME_CHECK_LISTS_COUNT = "checkListsCount";
  @SerializedName(SERIALIZED_NAME_CHECK_LISTS_COUNT)
  private Integer checkListsCount;

  public static final String SERIALIZED_NAME_AUTO_TESTS_COUNT = "autoTestsCount";
  @SerializedName(SERIALIZED_NAME_AUTO_TESTS_COUNT)
  private Integer autoTestsCount;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

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

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ProjectTypeModel type;

  public static final String SERIALIZED_NAME_IS_FLAKY_AUTO = "isFlakyAuto";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY_AUTO)
  private Boolean isFlakyAuto;

  public ProjectModel() {
  }

  public ProjectModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the project
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ProjectModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the project
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProjectModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the project
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectModel isFavorite(Boolean isFavorite) {
    
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Indicates if the project is marked as favorite
   * @return isFavorite
  **/
  @javax.annotation.Nonnull
  public Boolean getIsFavorite() {
    return isFavorite;
  }


  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }


  public ProjectModel attributesScheme(List<CustomAttributeModel> attributesScheme) {
    
    this.attributesScheme = attributesScheme;
    return this;
  }

  public ProjectModel addAttributesSchemeItem(CustomAttributeModel attributesSchemeItem) {
    if (this.attributesScheme == null) {
      this.attributesScheme = new ArrayList<>();
    }
    this.attributesScheme.add(attributesSchemeItem);
    return this;
  }

   /**
   * Collection of the project attributes
   * @return attributesScheme
  **/
  @javax.annotation.Nullable
  public List<CustomAttributeModel> getAttributesScheme() {
    return attributesScheme;
  }


  public void setAttributesScheme(List<CustomAttributeModel> attributesScheme) {
    this.attributesScheme = attributesScheme;
  }


  public ProjectModel testPlansAttributesScheme(List<CustomAttributeModel> testPlansAttributesScheme) {
    
    this.testPlansAttributesScheme = testPlansAttributesScheme;
    return this;
  }

  public ProjectModel addTestPlansAttributesSchemeItem(CustomAttributeModel testPlansAttributesSchemeItem) {
    if (this.testPlansAttributesScheme == null) {
      this.testPlansAttributesScheme = new ArrayList<>();
    }
    this.testPlansAttributesScheme.add(testPlansAttributesSchemeItem);
    return this;
  }

   /**
   * Collection of the project test plans attributes
   * @return testPlansAttributesScheme
  **/
  @javax.annotation.Nullable
  public List<CustomAttributeModel> getTestPlansAttributesScheme() {
    return testPlansAttributesScheme;
  }


  public void setTestPlansAttributesScheme(List<CustomAttributeModel> testPlansAttributesScheme) {
    this.testPlansAttributesScheme = testPlansAttributesScheme;
  }


  public ProjectModel testCasesCount(Integer testCasesCount) {
    
    this.testCasesCount = testCasesCount;
    return this;
  }

   /**
   * Number of test cases in the project
   * @return testCasesCount
  **/
  @javax.annotation.Nullable
  public Integer getTestCasesCount() {
    return testCasesCount;
  }


  public void setTestCasesCount(Integer testCasesCount) {
    this.testCasesCount = testCasesCount;
  }


  public ProjectModel sharedStepsCount(Integer sharedStepsCount) {
    
    this.sharedStepsCount = sharedStepsCount;
    return this;
  }

   /**
   * Number of shared steps in the project
   * @return sharedStepsCount
  **/
  @javax.annotation.Nullable
  public Integer getSharedStepsCount() {
    return sharedStepsCount;
  }


  public void setSharedStepsCount(Integer sharedStepsCount) {
    this.sharedStepsCount = sharedStepsCount;
  }


  public ProjectModel checkListsCount(Integer checkListsCount) {
    
    this.checkListsCount = checkListsCount;
    return this;
  }

   /**
   * Number of checklists in the project
   * @return checkListsCount
  **/
  @javax.annotation.Nullable
  public Integer getCheckListsCount() {
    return checkListsCount;
  }


  public void setCheckListsCount(Integer checkListsCount) {
    this.checkListsCount = checkListsCount;
  }


  public ProjectModel autoTestsCount(Integer autoTestsCount) {
    
    this.autoTestsCount = autoTestsCount;
    return this;
  }

   /**
   * Number of autotests in the project
   * @return autoTestsCount
  **/
  @javax.annotation.Nullable
  public Integer getAutoTestsCount() {
    return autoTestsCount;
  }


  public void setAutoTestsCount(Integer autoTestsCount) {
    this.autoTestsCount = autoTestsCount;
  }


  public ProjectModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the project is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ProjectModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Creation date of the project
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public ProjectModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Last modification date of the project
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public ProjectModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Unique ID of the project creator
   * @return createdById
  **/
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public ProjectModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Unique ID of the project last editor
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public ProjectModel globalId(Long globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * Global ID of the project
   * @return globalId
  **/
  @javax.annotation.Nonnull
  public Long getGlobalId() {
    return globalId;
  }


  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public ProjectModel type(ProjectTypeModel type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public ProjectTypeModel getType() {
    return type;
  }


  public void setType(ProjectTypeModel type) {
    this.type = type;
  }


  public ProjectModel isFlakyAuto(Boolean isFlakyAuto) {
    
    this.isFlakyAuto = isFlakyAuto;
    return this;
  }

   /**
   * Indicates if the status \&quot;Flaky/Stable\&quot; sets automatically
   * @return isFlakyAuto
  **/
  @javax.annotation.Nonnull
  public Boolean getIsFlakyAuto() {
    return isFlakyAuto;
  }


  public void setIsFlakyAuto(Boolean isFlakyAuto) {
    this.isFlakyAuto = isFlakyAuto;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectModel projectModel = (ProjectModel) o;
    return Objects.equals(this.id, projectModel.id) &&
        Objects.equals(this.description, projectModel.description) &&
        Objects.equals(this.name, projectModel.name) &&
        Objects.equals(this.isFavorite, projectModel.isFavorite) &&
        Objects.equals(this.attributesScheme, projectModel.attributesScheme) &&
        Objects.equals(this.testPlansAttributesScheme, projectModel.testPlansAttributesScheme) &&
        Objects.equals(this.testCasesCount, projectModel.testCasesCount) &&
        Objects.equals(this.sharedStepsCount, projectModel.sharedStepsCount) &&
        Objects.equals(this.checkListsCount, projectModel.checkListsCount) &&
        Objects.equals(this.autoTestsCount, projectModel.autoTestsCount) &&
        Objects.equals(this.isDeleted, projectModel.isDeleted) &&
        Objects.equals(this.createdDate, projectModel.createdDate) &&
        Objects.equals(this.modifiedDate, projectModel.modifiedDate) &&
        Objects.equals(this.createdById, projectModel.createdById) &&
        Objects.equals(this.modifiedById, projectModel.modifiedById) &&
        Objects.equals(this.globalId, projectModel.globalId) &&
        Objects.equals(this.type, projectModel.type) &&
        Objects.equals(this.isFlakyAuto, projectModel.isFlakyAuto);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, name, isFavorite, attributesScheme, testPlansAttributesScheme, testCasesCount, sharedStepsCount, checkListsCount, autoTestsCount, isDeleted, createdDate, modifiedDate, createdById, modifiedById, globalId, type, isFlakyAuto);
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
    sb.append("class ProjectModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    attributesScheme: ").append(toIndentedString(attributesScheme)).append("\n");
    sb.append("    testPlansAttributesScheme: ").append(toIndentedString(testPlansAttributesScheme)).append("\n");
    sb.append("    testCasesCount: ").append(toIndentedString(testCasesCount)).append("\n");
    sb.append("    sharedStepsCount: ").append(toIndentedString(sharedStepsCount)).append("\n");
    sb.append("    checkListsCount: ").append(toIndentedString(checkListsCount)).append("\n");
    sb.append("    autoTestsCount: ").append(toIndentedString(autoTestsCount)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isFlakyAuto: ").append(toIndentedString(isFlakyAuto)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("isFavorite");
    openapiFields.add("attributesScheme");
    openapiFields.add("testPlansAttributesScheme");
    openapiFields.add("testCasesCount");
    openapiFields.add("sharedStepsCount");
    openapiFields.add("checkListsCount");
    openapiFields.add("autoTestsCount");
    openapiFields.add("isDeleted");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("globalId");
    openapiFields.add("type");
    openapiFields.add("isFlakyAuto");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("isFavorite");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("globalId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("isFlakyAuto");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectModel is not found in the empty JSON string", ProjectModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("attributesScheme") != null && !jsonObj.get("attributesScheme").isJsonNull()) {
        JsonArray jsonArrayattributesScheme = jsonObj.getAsJsonArray("attributesScheme");
        if (jsonArrayattributesScheme != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributesScheme").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributesScheme` to be an array in the JSON string but got `%s`", jsonObj.get("attributesScheme").toString()));
          }

          // validate the optional field `attributesScheme` (array)
          for (int i = 0; i < jsonArrayattributesScheme.size(); i++) {
            CustomAttributeModel.validateJsonObject(jsonArrayattributesScheme.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("testPlansAttributesScheme") != null && !jsonObj.get("testPlansAttributesScheme").isJsonNull()) {
        JsonArray jsonArraytestPlansAttributesScheme = jsonObj.getAsJsonArray("testPlansAttributesScheme");
        if (jsonArraytestPlansAttributesScheme != null) {
          // ensure the json data is an array
          if (!jsonObj.get("testPlansAttributesScheme").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `testPlansAttributesScheme` to be an array in the JSON string but got `%s`", jsonObj.get("testPlansAttributesScheme").toString()));
          }

          // validate the optional field `testPlansAttributesScheme` (array)
          for (int i = 0; i < jsonArraytestPlansAttributesScheme.size(); i++) {
            CustomAttributeModel.validateJsonObject(jsonArraytestPlansAttributesScheme.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
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
       if (!ProjectModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectModel>() {
           @Override
           public void write(JsonWriter out, ProjectModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectModel
  * @throws IOException if the JSON string is invalid with respect to ProjectModel
  */
  public static ProjectModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectModel.class);
  }

 /**
  * Convert an instance of ProjectModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

