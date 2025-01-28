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
import ru.testit.client.model.AutoTestLastTestResultConfiguration;
import ru.testit.client.model.AutoTestStep;
import ru.testit.client.model.Label;
import ru.testit.client.model.Link;

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
 * AutoTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTest {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASSNAME = "classname";
  @SerializedName(SERIALIZED_NAME_CLASSNAME)
  private String classname;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<AutoTestStep> steps;

  public static final String SERIALIZED_NAME_SETUP = "setup";
  @SerializedName(SERIALIZED_NAME_SETUP)
  private List<AutoTestStep> setup;

  public static final String SERIALIZED_NAME_TEARDOWN = "teardown";
  @SerializedName(SERIALIZED_NAME_TEARDOWN)
  private List<AutoTestStep> teardown;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels;

  public static final String SERIALIZED_NAME_IS_FLAKY = "isFlaky";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY)
  private Boolean isFlaky;

  public static final String SERIALIZED_NAME_EXTERNAL_KEY = "externalKey";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_KEY)
  private String externalKey;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_MUST_BE_APPROVED = "mustBeApproved";
  @SerializedName(SERIALIZED_NAME_MUST_BE_APPROVED)
  private Boolean mustBeApproved;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

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

  public static final String SERIALIZED_NAME_LAST_TEST_RUN_ID = "lastTestRunId";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RUN_ID)
  private UUID lastTestRunId;

  public static final String SERIALIZED_NAME_LAST_TEST_RUN_NAME = "lastTestRunName";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RUN_NAME)
  private String lastTestRunName;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT_ID = "lastTestResultId";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT_ID)
  private UUID lastTestResultId;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT_CONFIGURATION = "lastTestResultConfiguration";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT_CONFIGURATION)
  private AutoTestLastTestResultConfiguration lastTestResultConfiguration;

  public static final String SERIALIZED_NAME_LAST_TEST_RESULT_OUTCOME = "lastTestResultOutcome";
  @SerializedName(SERIALIZED_NAME_LAST_TEST_RESULT_OUTCOME)
  private String lastTestResultOutcome;

  public static final String SERIALIZED_NAME_STABILITY_PERCENTAGE = "stabilityPercentage";
  @SerializedName(SERIALIZED_NAME_STABILITY_PERCENTAGE)
  private Integer stabilityPercentage;

  public AutoTest() {
  }

  public AutoTest externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External ID of the autotest
   * @return externalId
  **/
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AutoTest links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public AutoTest addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of the autotest links
   * @return links
  **/
  @javax.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }


  public AutoTest projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Unique ID of the autotest project
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public AutoTest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the autotest
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AutoTest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Name of the autotest namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public AutoTest classname(String classname) {
    
    this.classname = classname;
    return this;
  }

   /**
   * Name of the autotest class
   * @return classname
  **/
  @javax.annotation.Nullable
  public String getClassname() {
    return classname;
  }


  public void setClassname(String classname) {
    this.classname = classname;
  }


  public AutoTest steps(List<AutoTestStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public AutoTest addStepsItem(AutoTestStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Collection of the autotest steps
   * @return steps
  **/
  @javax.annotation.Nullable
  public List<AutoTestStep> getSteps() {
    return steps;
  }


  public void setSteps(List<AutoTestStep> steps) {
    this.steps = steps;
  }


  public AutoTest setup(List<AutoTestStep> setup) {
    
    this.setup = setup;
    return this;
  }

  public AutoTest addSetupItem(AutoTestStep setupItem) {
    if (this.setup == null) {
      this.setup = new ArrayList<>();
    }
    this.setup.add(setupItem);
    return this;
  }

   /**
   * Collection of the autotest setup steps
   * @return setup
  **/
  @javax.annotation.Nullable
  public List<AutoTestStep> getSetup() {
    return setup;
  }


  public void setSetup(List<AutoTestStep> setup) {
    this.setup = setup;
  }


  public AutoTest teardown(List<AutoTestStep> teardown) {
    
    this.teardown = teardown;
    return this;
  }

  public AutoTest addTeardownItem(AutoTestStep teardownItem) {
    if (this.teardown == null) {
      this.teardown = new ArrayList<>();
    }
    this.teardown.add(teardownItem);
    return this;
  }

   /**
   * Collection of the autotest teardown steps
   * @return teardown
  **/
  @javax.annotation.Nullable
  public List<AutoTestStep> getTeardown() {
    return teardown;
  }


  public void setTeardown(List<AutoTestStep> teardown) {
    this.teardown = teardown;
  }


  public AutoTest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Name of the autotest in autotest&#39;s card
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AutoTest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the autotest in autotest&#39;s card
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AutoTest labels(List<Label> labels) {
    
    this.labels = labels;
    return this;
  }

  public AutoTest addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Collection of the autotest labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<Label> getLabels() {
    return labels;
  }


  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }


  public AutoTest isFlaky(Boolean isFlaky) {
    
    this.isFlaky = isFlaky;
    return this;
  }

   /**
   * Indicates if the autotest is marked as flaky
   * @return isFlaky
  **/
  @javax.annotation.Nullable
  public Boolean getIsFlaky() {
    return isFlaky;
  }


  public void setIsFlaky(Boolean isFlaky) {
    this.isFlaky = isFlaky;
  }


  public AutoTest externalKey(String externalKey) {
    
    this.externalKey = externalKey;
    return this;
  }

   /**
   * External key of the autotest
   * @return externalKey
  **/
  @javax.annotation.Nullable
  public String getExternalKey() {
    return externalKey;
  }


  public void setExternalKey(String externalKey) {
    this.externalKey = externalKey;
  }


  public AutoTest globalId(Long globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * Global ID of the autotest
   * @return globalId
  **/
  @javax.annotation.Nonnull
  public Long getGlobalId() {
    return globalId;
  }


  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public AutoTest isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the autotest is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public AutoTest mustBeApproved(Boolean mustBeApproved) {
    
    this.mustBeApproved = mustBeApproved;
    return this;
  }

   /**
   * Indicates if the autotest has unapproved changes from linked work items
   * @return mustBeApproved
  **/
  @javax.annotation.Nonnull
  public Boolean getMustBeApproved() {
    return mustBeApproved;
  }


  public void setMustBeApproved(Boolean mustBeApproved) {
    this.mustBeApproved = mustBeApproved;
  }


  public AutoTest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the autotest
   * @return id
  **/
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AutoTest createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Creation date of the autotest
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public AutoTest modifiedDate(OffsetDateTime modifiedDate) {
    
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


  public AutoTest createdById(UUID createdById) {
    
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


  public AutoTest modifiedById(UUID modifiedById) {
    
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


  public AutoTest lastTestRunId(UUID lastTestRunId) {
    
    this.lastTestRunId = lastTestRunId;
    return this;
  }

   /**
   * Unique ID of the autotest last test run
   * @return lastTestRunId
  **/
  @javax.annotation.Nullable
  public UUID getLastTestRunId() {
    return lastTestRunId;
  }


  public void setLastTestRunId(UUID lastTestRunId) {
    this.lastTestRunId = lastTestRunId;
  }


  public AutoTest lastTestRunName(String lastTestRunName) {
    
    this.lastTestRunName = lastTestRunName;
    return this;
  }

   /**
   * Name of the autotest last test run
   * @return lastTestRunName
  **/
  @javax.annotation.Nullable
  public String getLastTestRunName() {
    return lastTestRunName;
  }


  public void setLastTestRunName(String lastTestRunName) {
    this.lastTestRunName = lastTestRunName;
  }


  public AutoTest lastTestResultId(UUID lastTestResultId) {
    
    this.lastTestResultId = lastTestResultId;
    return this;
  }

   /**
   * Unique ID of the autotest last test result
   * @return lastTestResultId
  **/
  @javax.annotation.Nullable
  public UUID getLastTestResultId() {
    return lastTestResultId;
  }


  public void setLastTestResultId(UUID lastTestResultId) {
    this.lastTestResultId = lastTestResultId;
  }


  public AutoTest lastTestResultConfiguration(AutoTestLastTestResultConfiguration lastTestResultConfiguration) {
    
    this.lastTestResultConfiguration = lastTestResultConfiguration;
    return this;
  }

   /**
   * Get lastTestResultConfiguration
   * @return lastTestResultConfiguration
  **/
  @javax.annotation.Nullable
  public AutoTestLastTestResultConfiguration getLastTestResultConfiguration() {
    return lastTestResultConfiguration;
  }


  public void setLastTestResultConfiguration(AutoTestLastTestResultConfiguration lastTestResultConfiguration) {
    this.lastTestResultConfiguration = lastTestResultConfiguration;
  }


  public AutoTest lastTestResultOutcome(String lastTestResultOutcome) {
    
    this.lastTestResultOutcome = lastTestResultOutcome;
    return this;
  }

   /**
   * Outcome of the autotest last test result
   * @return lastTestResultOutcome
  **/
  @javax.annotation.Nullable
  public String getLastTestResultOutcome() {
    return lastTestResultOutcome;
  }


  public void setLastTestResultOutcome(String lastTestResultOutcome) {
    this.lastTestResultOutcome = lastTestResultOutcome;
  }


  public AutoTest stabilityPercentage(Integer stabilityPercentage) {
    
    this.stabilityPercentage = stabilityPercentage;
    return this;
  }

   /**
   * Stability percentage of the autotest
   * @return stabilityPercentage
  **/
  @javax.annotation.Nullable
  public Integer getStabilityPercentage() {
    return stabilityPercentage;
  }


  public void setStabilityPercentage(Integer stabilityPercentage) {
    this.stabilityPercentage = stabilityPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTest autoTest = (AutoTest) o;
    return Objects.equals(this.externalId, autoTest.externalId) &&
        Objects.equals(this.links, autoTest.links) &&
        Objects.equals(this.projectId, autoTest.projectId) &&
        Objects.equals(this.name, autoTest.name) &&
        Objects.equals(this.namespace, autoTest.namespace) &&
        Objects.equals(this.classname, autoTest.classname) &&
        Objects.equals(this.steps, autoTest.steps) &&
        Objects.equals(this.setup, autoTest.setup) &&
        Objects.equals(this.teardown, autoTest.teardown) &&
        Objects.equals(this.title, autoTest.title) &&
        Objects.equals(this.description, autoTest.description) &&
        Objects.equals(this.labels, autoTest.labels) &&
        Objects.equals(this.isFlaky, autoTest.isFlaky) &&
        Objects.equals(this.externalKey, autoTest.externalKey) &&
        Objects.equals(this.globalId, autoTest.globalId) &&
        Objects.equals(this.isDeleted, autoTest.isDeleted) &&
        Objects.equals(this.mustBeApproved, autoTest.mustBeApproved) &&
        Objects.equals(this.id, autoTest.id) &&
        Objects.equals(this.createdDate, autoTest.createdDate) &&
        Objects.equals(this.modifiedDate, autoTest.modifiedDate) &&
        Objects.equals(this.createdById, autoTest.createdById) &&
        Objects.equals(this.modifiedById, autoTest.modifiedById) &&
        Objects.equals(this.lastTestRunId, autoTest.lastTestRunId) &&
        Objects.equals(this.lastTestRunName, autoTest.lastTestRunName) &&
        Objects.equals(this.lastTestResultId, autoTest.lastTestResultId) &&
        Objects.equals(this.lastTestResultConfiguration, autoTest.lastTestResultConfiguration) &&
        Objects.equals(this.lastTestResultOutcome, autoTest.lastTestResultOutcome) &&
        Objects.equals(this.stabilityPercentage, autoTest.stabilityPercentage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, links, projectId, name, namespace, classname, steps, setup, teardown, title, description, labels, isFlaky, externalKey, globalId, isDeleted, mustBeApproved, id, createdDate, modifiedDate, createdById, modifiedById, lastTestRunId, lastTestRunName, lastTestResultId, lastTestResultConfiguration, lastTestResultOutcome, stabilityPercentage);
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
    sb.append("class AutoTest {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    teardown: ").append(toIndentedString(teardown)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    isFlaky: ").append(toIndentedString(isFlaky)).append("\n");
    sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    mustBeApproved: ").append(toIndentedString(mustBeApproved)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    lastTestRunId: ").append(toIndentedString(lastTestRunId)).append("\n");
    sb.append("    lastTestRunName: ").append(toIndentedString(lastTestRunName)).append("\n");
    sb.append("    lastTestResultId: ").append(toIndentedString(lastTestResultId)).append("\n");
    sb.append("    lastTestResultConfiguration: ").append(toIndentedString(lastTestResultConfiguration)).append("\n");
    sb.append("    lastTestResultOutcome: ").append(toIndentedString(lastTestResultOutcome)).append("\n");
    sb.append("    stabilityPercentage: ").append(toIndentedString(stabilityPercentage)).append("\n");
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
    openapiFields.add("externalId");
    openapiFields.add("links");
    openapiFields.add("projectId");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("classname");
    openapiFields.add("steps");
    openapiFields.add("setup");
    openapiFields.add("teardown");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("labels");
    openapiFields.add("isFlaky");
    openapiFields.add("externalKey");
    openapiFields.add("globalId");
    openapiFields.add("isDeleted");
    openapiFields.add("mustBeApproved");
    openapiFields.add("id");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("lastTestRunId");
    openapiFields.add("lastTestRunName");
    openapiFields.add("lastTestResultId");
    openapiFields.add("lastTestResultConfiguration");
    openapiFields.add("lastTestResultOutcome");
    openapiFields.add("stabilityPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("externalId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("globalId");
    openapiRequiredFields.add("isDeleted");
    openapiRequiredFields.add("mustBeApproved");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("createdById");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoTest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutoTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTest is not found in the empty JSON string", AutoTest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutoTest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("classname") != null && !jsonObj.get("classname").isJsonNull()) && !jsonObj.get("classname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classname").toString()));
      }
      if (jsonObj.get("steps") != null && !jsonObj.get("steps").isJsonNull()) {
        JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
        if (jsonArraysteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
          }

          // validate the optional field `steps` (array)
          for (int i = 0; i < jsonArraysteps.size(); i++) {
            AutoTestStep.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("setup") != null && !jsonObj.get("setup").isJsonNull()) {
        JsonArray jsonArraysetup = jsonObj.getAsJsonArray("setup");
        if (jsonArraysetup != null) {
          // ensure the json data is an array
          if (!jsonObj.get("setup").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `setup` to be an array in the JSON string but got `%s`", jsonObj.get("setup").toString()));
          }

          // validate the optional field `setup` (array)
          for (int i = 0; i < jsonArraysetup.size(); i++) {
            AutoTestStep.validateJsonObject(jsonArraysetup.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("teardown") != null && !jsonObj.get("teardown").isJsonNull()) {
        JsonArray jsonArrayteardown = jsonObj.getAsJsonArray("teardown");
        if (jsonArrayteardown != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teardown").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teardown` to be an array in the JSON string but got `%s`", jsonObj.get("teardown").toString()));
          }

          // validate the optional field `teardown` (array)
          for (int i = 0; i < jsonArrayteardown.size(); i++) {
            AutoTestStep.validateJsonObject(jsonArrayteardown.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            Label.validateJsonObject(jsonArraylabels.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("externalKey") != null && !jsonObj.get("externalKey").isJsonNull()) && !jsonObj.get("externalKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalKey").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if ((jsonObj.get("lastTestRunId") != null && !jsonObj.get("lastTestRunId").isJsonNull()) && !jsonObj.get("lastTestRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTestRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTestRunId").toString()));
      }
      if ((jsonObj.get("lastTestRunName") != null && !jsonObj.get("lastTestRunName").isJsonNull()) && !jsonObj.get("lastTestRunName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTestRunName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTestRunName").toString()));
      }
      if ((jsonObj.get("lastTestResultId") != null && !jsonObj.get("lastTestResultId").isJsonNull()) && !jsonObj.get("lastTestResultId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTestResultId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTestResultId").toString()));
      }
      // validate the optional field `lastTestResultConfiguration`
      if (jsonObj.get("lastTestResultConfiguration") != null && !jsonObj.get("lastTestResultConfiguration").isJsonNull()) {
        AutoTestLastTestResultConfiguration.validateJsonObject(jsonObj.getAsJsonObject("lastTestResultConfiguration"));
      }
      if ((jsonObj.get("lastTestResultOutcome") != null && !jsonObj.get("lastTestResultOutcome").isJsonNull()) && !jsonObj.get("lastTestResultOutcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTestResultOutcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTestResultOutcome").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTest.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTest>() {
           @Override
           public void write(JsonWriter out, AutoTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoTest
  * @throws IOException if the JSON string is invalid with respect to AutoTest
  */
  public static AutoTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTest.class);
  }

 /**
  * Convert an instance of AutoTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

