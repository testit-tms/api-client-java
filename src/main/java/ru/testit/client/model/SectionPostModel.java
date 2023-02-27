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
import java.util.*;
import java.util.Map.Entry;

/**
 * SectionPostModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SectionPostModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_PRECONDITION_STEPS = "preconditionSteps";
  @SerializedName(SERIALIZED_NAME_PRECONDITION_STEPS)
  private List<StepPutModel> preconditionSteps = null;

  public static final String SERIALIZED_NAME_POSTCONDITION_STEPS = "postconditionSteps";
  @SerializedName(SERIALIZED_NAME_POSTCONDITION_STEPS)
  private List<StepPutModel> postconditionSteps = null;

  public SectionPostModel() {
  }

  public SectionPostModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SectionPostModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", required = true, value = "")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public SectionPostModel parentId(UUID parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", value = "")

  public UUID getParentId() {
    return parentId;
  }


  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public SectionPostModel preconditionSteps(List<StepPutModel> preconditionSteps) {
    
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public SectionPostModel addPreconditionStepsItem(StepPutModel preconditionStepsItem) {
    if (this.preconditionSteps == null) {
      this.preconditionSteps = new ArrayList<>();
    }
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StepPutModel> getPreconditionSteps() {
    return preconditionSteps;
  }


  public void setPreconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public SectionPostModel postconditionSteps(List<StepPutModel> postconditionSteps) {
    
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public SectionPostModel addPostconditionStepsItem(StepPutModel postconditionStepsItem) {
    if (this.postconditionSteps == null) {
      this.postconditionSteps = new ArrayList<>();
    }
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StepPutModel> getPostconditionSteps() {
    return postconditionSteps;
  }


  public void setPostconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionPostModel sectionPostModel = (SectionPostModel) o;
    return Objects.equals(this.name, sectionPostModel.name) &&
        Objects.equals(this.projectId, sectionPostModel.projectId) &&
        Objects.equals(this.parentId, sectionPostModel.parentId) &&
        Objects.equals(this.preconditionSteps, sectionPostModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, sectionPostModel.postconditionSteps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId, parentId, preconditionSteps, postconditionSteps);
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
    sb.append("class SectionPostModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("parentId");
    openapiFields.add("preconditionSteps");
    openapiFields.add("postconditionSteps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("projectId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SectionPostModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SectionPostModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SectionPostModel is not found in the empty JSON string", SectionPostModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SectionPostModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SectionPostModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SectionPostModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if (jsonObj.get("preconditionSteps") != null && !jsonObj.get("preconditionSteps").isJsonNull()) {
        JsonArray jsonArraypreconditionSteps = jsonObj.getAsJsonArray("preconditionSteps");
        if (jsonArraypreconditionSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("preconditionSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `preconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("preconditionSteps").toString()));
          }

          // validate the optional field `preconditionSteps` (array)
          for (int i = 0; i < jsonArraypreconditionSteps.size(); i++) {
            StepPutModel.validateJsonObject(jsonArraypreconditionSteps.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("postconditionSteps") != null && !jsonObj.get("postconditionSteps").isJsonNull()) {
        JsonArray jsonArraypostconditionSteps = jsonObj.getAsJsonArray("postconditionSteps");
        if (jsonArraypostconditionSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("postconditionSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `postconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("postconditionSteps").toString()));
          }

          // validate the optional field `postconditionSteps` (array)
          for (int i = 0; i < jsonArraypostconditionSteps.size(); i++) {
            StepPutModel.validateJsonObject(jsonArraypostconditionSteps.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SectionPostModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SectionPostModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SectionPostModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SectionPostModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SectionPostModel>() {
           @Override
           public void write(JsonWriter out, SectionPostModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SectionPostModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SectionPostModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SectionPostModel
  * @throws IOException if the JSON string is invalid with respect to SectionPostModel
  */
  public static SectionPostModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SectionPostModel.class);
  }

 /**
  * Convert an instance of SectionPostModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

