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
 * TestPlanPutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanPutModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LOCKED_BY_ID = "lockedById";
  @SerializedName(SERIALIZED_NAME_LOCKED_BY_ID)
  private UUID lockedById;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagShortModel> tags = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_HAS_AUTOMATIC_DURATION_TIMER = "hasAutomaticDurationTimer";
  @SerializedName(SERIALIZED_NAME_HAS_AUTOMATIC_DURATION_TIMER)
  private Boolean hasAutomaticDurationTimer;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public TestPlanPutModel() {
  }

  public TestPlanPutModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "da46bde3-b022-44d3-8b4f-28783aca8944", required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestPlanPutModel lockedById(UUID lockedById) {
    
    this.lockedById = lockedById;
    return this;
  }

   /**
   * Get lockedById
   * @return lockedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getLockedById() {
    return lockedById;
  }


  public void setLockedById(UUID lockedById) {
    this.lockedById = lockedById;
  }


  public TestPlanPutModel tags(List<TagShortModel> tags) {
    
    this.tags = tags;
    return this;
  }

  public TestPlanPutModel addTagsItem(TagShortModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TagShortModel> getTags() {
    return tags;
  }


  public void setTags(List<TagShortModel> tags) {
    this.tags = tags;
  }


  public TestPlanPutModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Base test plan", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestPlanPutModel startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Used for analytics
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "Used for analytics")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TestPlanPutModel endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Used for analytics
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-17T16:49:51.791323Z", value = "Used for analytics")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TestPlanPutModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a base test plan", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestPlanPutModel build(String build) {
    
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v.3.0.0-b94f3055", value = "")

  public String getBuild() {
    return build;
  }


  public void setBuild(String build) {
    this.build = build;
  }


  public TestPlanPutModel projectId(UUID projectId) {
    
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


  public TestPlanPutModel productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Billing service", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public TestPlanPutModel hasAutomaticDurationTimer(Boolean hasAutomaticDurationTimer) {
    
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
    return this;
  }

   /**
   * Get hasAutomaticDurationTimer
   * @return hasAutomaticDurationTimer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getHasAutomaticDurationTimer() {
    return hasAutomaticDurationTimer;
  }


  public void setHasAutomaticDurationTimer(Boolean hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
  }


  public TestPlanPutModel attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TestPlanPutModel putAttributesItem(String key, Object attributesItem) {
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
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanPutModel testPlanPutModel = (TestPlanPutModel) o;
    return Objects.equals(this.id, testPlanPutModel.id) &&
        Objects.equals(this.lockedById, testPlanPutModel.lockedById) &&
        Objects.equals(this.tags, testPlanPutModel.tags) &&
        Objects.equals(this.name, testPlanPutModel.name) &&
        Objects.equals(this.startDate, testPlanPutModel.startDate) &&
        Objects.equals(this.endDate, testPlanPutModel.endDate) &&
        Objects.equals(this.description, testPlanPutModel.description) &&
        Objects.equals(this.build, testPlanPutModel.build) &&
        Objects.equals(this.projectId, testPlanPutModel.projectId) &&
        Objects.equals(this.productName, testPlanPutModel.productName) &&
        Objects.equals(this.hasAutomaticDurationTimer, testPlanPutModel.hasAutomaticDurationTimer) &&
        Objects.equals(this.attributes, testPlanPutModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lockedById, tags, name, startDate, endDate, description, build, projectId, productName, hasAutomaticDurationTimer, attributes);
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
    sb.append("class TestPlanPutModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockedById: ").append(toIndentedString(lockedById)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    hasAutomaticDurationTimer: ").append(toIndentedString(hasAutomaticDurationTimer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("lockedById");
    openapiFields.add("tags");
    openapiFields.add("name");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("description");
    openapiFields.add("build");
    openapiFields.add("projectId");
    openapiFields.add("productName");
    openapiFields.add("hasAutomaticDurationTimer");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("projectId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPlanPutModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPlanPutModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanPutModel is not found in the empty JSON string", TestPlanPutModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPlanPutModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanPutModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestPlanPutModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("lockedById") != null && !jsonObj.get("lockedById").isJsonNull()) && !jsonObj.get("lockedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lockedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lockedById").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            TagShortModel.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPlanPutModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanPutModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanPutModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanPutModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanPutModel>() {
           @Override
           public void write(JsonWriter out, TestPlanPutModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanPutModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPlanPutModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPlanPutModel
  * @throws IOException if the JSON string is invalid with respect to TestPlanPutModel
  */
  public static TestPlanPutModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanPutModel.class);
  }

 /**
  * Convert an instance of TestPlanPutModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

