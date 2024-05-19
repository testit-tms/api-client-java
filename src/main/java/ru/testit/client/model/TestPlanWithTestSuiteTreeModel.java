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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TagPostModel;
import ru.testit.client.model.TestPlanStatusModel;
import ru.testit.client.model.TestSuiteWithChildrenModel;

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
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * TestPlanWithTestSuiteTreeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanWithTestSuiteTreeModel {
  public static final String SERIALIZED_NAME_TEST_SUITES = "testSuites";
  @SerializedName(SERIALIZED_NAME_TEST_SUITES)
  private List<TestSuiteWithChildrenModel> testSuites = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TestPlanStatusModel status;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

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

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_LOCKED_DATE = "lockedDate";
  @SerializedName(SERIALIZED_NAME_LOCKED_DATE)
  private OffsetDateTime lockedDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LOCKED_BY_ID = "lockedById";
  @SerializedName(SERIALIZED_NAME_LOCKED_BY_ID)
  private UUID lockedById;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagPostModel> tags;

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
  private Map<String, Object> attributes = new HashMap<>();

  public TestPlanWithTestSuiteTreeModel() {
  }

  public TestPlanWithTestSuiteTreeModel testSuites(List<TestSuiteWithChildrenModel> testSuites) {
    this.testSuites = testSuites;
    return this;
  }

  public TestPlanWithTestSuiteTreeModel addTestSuitesItem(TestSuiteWithChildrenModel testSuitesItem) {
    if (this.testSuites == null) {
      this.testSuites = new ArrayList<>();
    }
    this.testSuites.add(testSuitesItem);
    return this;
  }

   /**
   * Get testSuites
   * @return testSuites
  **/
  @javax.annotation.Nonnull
  public List<TestSuiteWithChildrenModel> getTestSuites() {
    return testSuites;
  }

  public void setTestSuites(List<TestSuiteWithChildrenModel> testSuites) {
    this.testSuites = testSuites;
  }


  public TestPlanWithTestSuiteTreeModel status(TestPlanStatusModel status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public TestPlanStatusModel getStatus() {
    return status;
  }

  public void setStatus(TestPlanStatusModel status) {
    this.status = status;
  }


  public TestPlanWithTestSuiteTreeModel startedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Set when test plan is starter (status changed to: In Progress)
   * @return startedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public TestPlanWithTestSuiteTreeModel completedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
    return this;
  }

   /**
   * set when test plan status is completed (status changed to: Completed)
   * @return completedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public TestPlanWithTestSuiteTreeModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestPlanWithTestSuiteTreeModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestPlanWithTestSuiteTreeModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestPlanWithTestSuiteTreeModel modifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  public UUID getModifiedById() {
    return modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public TestPlanWithTestSuiteTreeModel globalId(Long globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Used for search Test plan
   * @return globalId
  **/
  @javax.annotation.Nonnull
  public Long getGlobalId() {
    return globalId;
  }

  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public TestPlanWithTestSuiteTreeModel isDeleted(Boolean isDeleted) {
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


  public TestPlanWithTestSuiteTreeModel lockedDate(OffsetDateTime lockedDate) {
    this.lockedDate = lockedDate;
    return this;
  }

   /**
   * Get lockedDate
   * @return lockedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLockedDate() {
    return lockedDate;
  }

  public void setLockedDate(OffsetDateTime lockedDate) {
    this.lockedDate = lockedDate;
  }


  public TestPlanWithTestSuiteTreeModel id(UUID id) {
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


  public TestPlanWithTestSuiteTreeModel lockedById(UUID lockedById) {
    this.lockedById = lockedById;
    return this;
  }

   /**
   * Get lockedById
   * @return lockedById
  **/
  @javax.annotation.Nullable
  public UUID getLockedById() {
    return lockedById;
  }

  public void setLockedById(UUID lockedById) {
    this.lockedById = lockedById;
  }


  public TestPlanWithTestSuiteTreeModel tags(List<TagPostModel> tags) {
    this.tags = tags;
    return this;
  }

  public TestPlanWithTestSuiteTreeModel addTagsItem(TagPostModel tagsItem) {
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
  public List<TagPostModel> getTags() {
    return tags;
  }

  public void setTags(List<TagPostModel> tags) {
    this.tags = tags;
  }


  public TestPlanWithTestSuiteTreeModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestPlanWithTestSuiteTreeModel startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Used for analytics
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TestPlanWithTestSuiteTreeModel endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Used for analytics
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TestPlanWithTestSuiteTreeModel description(String description) {
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


  public TestPlanWithTestSuiteTreeModel build(String build) {
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


  public TestPlanWithTestSuiteTreeModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestPlanWithTestSuiteTreeModel productName(String productName) {
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


  public TestPlanWithTestSuiteTreeModel hasAutomaticDurationTimer(Boolean hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
    return this;
  }

   /**
   * Get hasAutomaticDurationTimer
   * @return hasAutomaticDurationTimer
  **/
  @javax.annotation.Nullable
  public Boolean getHasAutomaticDurationTimer() {
    return hasAutomaticDurationTimer;
  }

  public void setHasAutomaticDurationTimer(Boolean hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
  }


  public TestPlanWithTestSuiteTreeModel attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TestPlanWithTestSuiteTreeModel putAttributesItem(String key, Object attributesItem) {
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
  @javax.annotation.Nonnull
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
    TestPlanWithTestSuiteTreeModel testPlanWithTestSuiteTreeModel = (TestPlanWithTestSuiteTreeModel) o;
    return Objects.equals(this.testSuites, testPlanWithTestSuiteTreeModel.testSuites) &&
        Objects.equals(this.status, testPlanWithTestSuiteTreeModel.status) &&
        Objects.equals(this.startedOn, testPlanWithTestSuiteTreeModel.startedOn) &&
        Objects.equals(this.completedOn, testPlanWithTestSuiteTreeModel.completedOn) &&
        Objects.equals(this.createdDate, testPlanWithTestSuiteTreeModel.createdDate) &&
        Objects.equals(this.modifiedDate, testPlanWithTestSuiteTreeModel.modifiedDate) &&
        Objects.equals(this.createdById, testPlanWithTestSuiteTreeModel.createdById) &&
        Objects.equals(this.modifiedById, testPlanWithTestSuiteTreeModel.modifiedById) &&
        Objects.equals(this.globalId, testPlanWithTestSuiteTreeModel.globalId) &&
        Objects.equals(this.isDeleted, testPlanWithTestSuiteTreeModel.isDeleted) &&
        Objects.equals(this.lockedDate, testPlanWithTestSuiteTreeModel.lockedDate) &&
        Objects.equals(this.id, testPlanWithTestSuiteTreeModel.id) &&
        Objects.equals(this.lockedById, testPlanWithTestSuiteTreeModel.lockedById) &&
        Objects.equals(this.tags, testPlanWithTestSuiteTreeModel.tags) &&
        Objects.equals(this.name, testPlanWithTestSuiteTreeModel.name) &&
        Objects.equals(this.startDate, testPlanWithTestSuiteTreeModel.startDate) &&
        Objects.equals(this.endDate, testPlanWithTestSuiteTreeModel.endDate) &&
        Objects.equals(this.description, testPlanWithTestSuiteTreeModel.description) &&
        Objects.equals(this.build, testPlanWithTestSuiteTreeModel.build) &&
        Objects.equals(this.projectId, testPlanWithTestSuiteTreeModel.projectId) &&
        Objects.equals(this.productName, testPlanWithTestSuiteTreeModel.productName) &&
        Objects.equals(this.hasAutomaticDurationTimer, testPlanWithTestSuiteTreeModel.hasAutomaticDurationTimer) &&
        Objects.equals(this.attributes, testPlanWithTestSuiteTreeModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testSuites, status, startedOn, completedOn, createdDate, modifiedDate, createdById, modifiedById, globalId, isDeleted, lockedDate, id, lockedById, tags, name, startDate, endDate, description, build, projectId, productName, hasAutomaticDurationTimer, attributes);
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
    sb.append("class TestPlanWithTestSuiteTreeModel {\n");
    sb.append("    testSuites: ").append(toIndentedString(testSuites)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
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
    openapiFields.add("testSuites");
    openapiFields.add("status");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("globalId");
    openapiFields.add("isDeleted");
    openapiFields.add("lockedDate");
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
    openapiRequiredFields.add("testSuites");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdById");
    openapiRequiredFields.add("globalId");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("attributes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestPlanWithTestSuiteTreeModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestPlanWithTestSuiteTreeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanWithTestSuiteTreeModel is not found in the empty JSON string", TestPlanWithTestSuiteTreeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestPlanWithTestSuiteTreeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanWithTestSuiteTreeModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestPlanWithTestSuiteTreeModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("testSuites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testSuites` to be an array in the JSON string but got `%s`", jsonObj.get("testSuites").toString()));
      }

      JsonArray jsonArraytestSuites = jsonObj.getAsJsonArray("testSuites");
      // validate the required field `testSuites` (array)
      for (int i = 0; i < jsonArraytestSuites.size(); i++) {
        TestSuiteWithChildrenModel.validateJsonElement(jsonArraytestSuites.get(i));
      };
      // validate the required field `status`
      TestPlanStatusModel.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
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
            TagPostModel.validateJsonElement(jsonArraytags.get(i));
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
       if (!TestPlanWithTestSuiteTreeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanWithTestSuiteTreeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanWithTestSuiteTreeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanWithTestSuiteTreeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanWithTestSuiteTreeModel>() {
           @Override
           public void write(JsonWriter out, TestPlanWithTestSuiteTreeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanWithTestSuiteTreeModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPlanWithTestSuiteTreeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPlanWithTestSuiteTreeModel
  * @throws IOException if the JSON string is invalid with respect to TestPlanWithTestSuiteTreeModel
  */
  public static TestPlanWithTestSuiteTreeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanWithTestSuiteTreeModel.class);
  }

 /**
  * Convert an instance of TestPlanWithTestSuiteTreeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

