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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutoTestStepModel;
import ru.testit.client.model.LabelPostModel;
import ru.testit.client.model.LinkPutModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * AutoTestPutModel
 */
@JsonPropertyOrder({
  AutoTestPutModel.JSON_PROPERTY_ID,
  AutoTestPutModel.JSON_PROPERTY_WORK_ITEM_IDS_FOR_LINK_WITH_AUTO_TEST,
  AutoTestPutModel.JSON_PROPERTY_EXTERNAL_ID,
  AutoTestPutModel.JSON_PROPERTY_LINKS,
  AutoTestPutModel.JSON_PROPERTY_PROJECT_ID,
  AutoTestPutModel.JSON_PROPERTY_NAME,
  AutoTestPutModel.JSON_PROPERTY_NAMESPACE,
  AutoTestPutModel.JSON_PROPERTY_CLASSNAME,
  AutoTestPutModel.JSON_PROPERTY_STEPS,
  AutoTestPutModel.JSON_PROPERTY_SETUP,
  AutoTestPutModel.JSON_PROPERTY_TEARDOWN,
  AutoTestPutModel.JSON_PROPERTY_TITLE,
  AutoTestPutModel.JSON_PROPERTY_DESCRIPTION,
  AutoTestPutModel.JSON_PROPERTY_LABELS,
  AutoTestPutModel.JSON_PROPERTY_IS_FLAKY,
  AutoTestPutModel.JSON_PROPERTY_EXTERNAL_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestPutModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_WORK_ITEM_IDS_FOR_LINK_WITH_AUTO_TEST = "workItemIdsForLinkWithAutoTest";
  private JsonNullable<Set<UUID>> workItemIdsForLinkWithAutoTest = JsonNullable.<Set<UUID>>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<List<LinkPutModel>> links = JsonNullable.<List<LinkPutModel>>undefined();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private JsonNullable<String> namespace = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLASSNAME = "classname";
  private JsonNullable<String> classname = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STEPS = "steps";
  private JsonNullable<List<AutoTestStepModel>> steps = JsonNullable.<List<AutoTestStepModel>>undefined();

  public static final String JSON_PROPERTY_SETUP = "setup";
  private JsonNullable<List<AutoTestStepModel>> setup = JsonNullable.<List<AutoTestStepModel>>undefined();

  public static final String JSON_PROPERTY_TEARDOWN = "teardown";
  private JsonNullable<List<AutoTestStepModel>> teardown = JsonNullable.<List<AutoTestStepModel>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LABELS = "labels";
  private JsonNullable<List<LabelPostModel>> labels = JsonNullable.<List<LabelPostModel>>undefined();

  public static final String JSON_PROPERTY_IS_FLAKY = "isFlaky";
  private JsonNullable<Boolean> isFlaky = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_KEY = "externalKey";
  private JsonNullable<String> externalKey = JsonNullable.<String>undefined();

  public AutoTestPutModel() { 
  }

  public AutoTestPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Used for search autotest. If value equals Guid mask filled with zeros, search will be executed using ExternalId
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public AutoTestPutModel workItemIdsForLinkWithAutoTest(Set<UUID> workItemIdsForLinkWithAutoTest) {
    this.workItemIdsForLinkWithAutoTest = JsonNullable.<Set<UUID>>of(workItemIdsForLinkWithAutoTest);
    return this;
  }

  public AutoTestPutModel addWorkItemIdsForLinkWithAutoTestItem(UUID workItemIdsForLinkWithAutoTestItem) {
    if (this.workItemIdsForLinkWithAutoTest == null || !this.workItemIdsForLinkWithAutoTest.isPresent()) {
      this.workItemIdsForLinkWithAutoTest = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.workItemIdsForLinkWithAutoTest.get().add(workItemIdsForLinkWithAutoTestItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get workItemIdsForLinkWithAutoTest
   * @return workItemIdsForLinkWithAutoTest
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<UUID> getWorkItemIdsForLinkWithAutoTest() {
        return workItemIdsForLinkWithAutoTest.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORK_ITEM_IDS_FOR_LINK_WITH_AUTO_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getWorkItemIdsForLinkWithAutoTest_JsonNullable() {
    return workItemIdsForLinkWithAutoTest;
  }
  
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_IDS_FOR_LINK_WITH_AUTO_TEST)
  public void setWorkItemIdsForLinkWithAutoTest_JsonNullable(JsonNullable<Set<UUID>> workItemIdsForLinkWithAutoTest) {
    this.workItemIdsForLinkWithAutoTest = workItemIdsForLinkWithAutoTest;
  }

  public void setWorkItemIdsForLinkWithAutoTest(Set<UUID> workItemIdsForLinkWithAutoTest) {
    this.workItemIdsForLinkWithAutoTest = JsonNullable.<Set<UUID>>of(workItemIdsForLinkWithAutoTest);
  }


  public AutoTestPutModel externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External ID of the autotest
   * @return externalId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AutoTestPutModel links(List<LinkPutModel> links) {
    this.links = JsonNullable.<List<LinkPutModel>>of(links);
    return this;
  }

  public AutoTestPutModel addLinksItem(LinkPutModel linksItem) {
    if (this.links == null || !this.links.isPresent()) {
      this.links = JsonNullable.<List<LinkPutModel>>of(new ArrayList<>());
    }
    try {
      this.links.get().add(linksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of the autotest links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<LinkPutModel> getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<LinkPutModel>> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<List<LinkPutModel>> links) {
    this.links = links;
  }

  public void setLinks(List<LinkPutModel> links) {
    this.links = JsonNullable.<List<LinkPutModel>>of(links);
  }


  public AutoTestPutModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Unique ID of the autotest project
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public AutoTestPutModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the autotest
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AutoTestPutModel namespace(String namespace) {
    this.namespace = JsonNullable.<String>of(namespace);
    return this;
  }

   /**
   * Name of the autotest namespace
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getNamespace() {
        return namespace.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNamespace_JsonNullable() {
    return namespace;
  }
  
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  public void setNamespace_JsonNullable(JsonNullable<String> namespace) {
    this.namespace = namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = JsonNullable.<String>of(namespace);
  }


  public AutoTestPutModel classname(String classname) {
    this.classname = JsonNullable.<String>of(classname);
    return this;
  }

   /**
   * Name of the autotest class
   * @return classname
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getClassname() {
        return classname.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLASSNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClassname_JsonNullable() {
    return classname;
  }
  
  @JsonProperty(JSON_PROPERTY_CLASSNAME)
  public void setClassname_JsonNullable(JsonNullable<String> classname) {
    this.classname = classname;
  }

  public void setClassname(String classname) {
    this.classname = JsonNullable.<String>of(classname);
  }


  public AutoTestPutModel steps(List<AutoTestStepModel> steps) {
    this.steps = JsonNullable.<List<AutoTestStepModel>>of(steps);
    return this;
  }

  public AutoTestPutModel addStepsItem(AutoTestStepModel stepsItem) {
    if (this.steps == null || !this.steps.isPresent()) {
      this.steps = JsonNullable.<List<AutoTestStepModel>>of(new ArrayList<>());
    }
    try {
      this.steps.get().add(stepsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of the autotest steps
   * @return steps
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<AutoTestStepModel> getSteps() {
        return steps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestStepModel>> getSteps_JsonNullable() {
    return steps;
  }
  
  @JsonProperty(JSON_PROPERTY_STEPS)
  public void setSteps_JsonNullable(JsonNullable<List<AutoTestStepModel>> steps) {
    this.steps = steps;
  }

  public void setSteps(List<AutoTestStepModel> steps) {
    this.steps = JsonNullable.<List<AutoTestStepModel>>of(steps);
  }


  public AutoTestPutModel setup(List<AutoTestStepModel> setup) {
    this.setup = JsonNullable.<List<AutoTestStepModel>>of(setup);
    return this;
  }

  public AutoTestPutModel addSetupItem(AutoTestStepModel setupItem) {
    if (this.setup == null || !this.setup.isPresent()) {
      this.setup = JsonNullable.<List<AutoTestStepModel>>of(new ArrayList<>());
    }
    try {
      this.setup.get().add(setupItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of the autotest setup steps
   * @return setup
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<AutoTestStepModel> getSetup() {
        return setup.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestStepModel>> getSetup_JsonNullable() {
    return setup;
  }
  
  @JsonProperty(JSON_PROPERTY_SETUP)
  public void setSetup_JsonNullable(JsonNullable<List<AutoTestStepModel>> setup) {
    this.setup = setup;
  }

  public void setSetup(List<AutoTestStepModel> setup) {
    this.setup = JsonNullable.<List<AutoTestStepModel>>of(setup);
  }


  public AutoTestPutModel teardown(List<AutoTestStepModel> teardown) {
    this.teardown = JsonNullable.<List<AutoTestStepModel>>of(teardown);
    return this;
  }

  public AutoTestPutModel addTeardownItem(AutoTestStepModel teardownItem) {
    if (this.teardown == null || !this.teardown.isPresent()) {
      this.teardown = JsonNullable.<List<AutoTestStepModel>>of(new ArrayList<>());
    }
    try {
      this.teardown.get().add(teardownItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of the autotest teardown steps
   * @return teardown
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<AutoTestStepModel> getTeardown() {
        return teardown.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEARDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AutoTestStepModel>> getTeardown_JsonNullable() {
    return teardown;
  }
  
  @JsonProperty(JSON_PROPERTY_TEARDOWN)
  public void setTeardown_JsonNullable(JsonNullable<List<AutoTestStepModel>> teardown) {
    this.teardown = teardown;
  }

  public void setTeardown(List<AutoTestStepModel> teardown) {
    this.teardown = JsonNullable.<List<AutoTestStepModel>>of(teardown);
  }


  public AutoTestPutModel title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Name of the autotest in autotest&#39;s card
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public AutoTestPutModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Description of the autotest in autotest&#39;s card
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public AutoTestPutModel labels(List<LabelPostModel> labels) {
    this.labels = JsonNullable.<List<LabelPostModel>>of(labels);
    return this;
  }

  public AutoTestPutModel addLabelsItem(LabelPostModel labelsItem) {
    if (this.labels == null || !this.labels.isPresent()) {
      this.labels = JsonNullable.<List<LabelPostModel>>of(new ArrayList<>());
    }
    try {
      this.labels.get().add(labelsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Collection of the autotest labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<LabelPostModel> getLabels() {
        return labels.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<LabelPostModel>> getLabels_JsonNullable() {
    return labels;
  }
  
  @JsonProperty(JSON_PROPERTY_LABELS)
  public void setLabels_JsonNullable(JsonNullable<List<LabelPostModel>> labels) {
    this.labels = labels;
  }

  public void setLabels(List<LabelPostModel> labels) {
    this.labels = JsonNullable.<List<LabelPostModel>>of(labels);
  }


  public AutoTestPutModel isFlaky(Boolean isFlaky) {
    this.isFlaky = JsonNullable.<Boolean>of(isFlaky);
    return this;
  }

   /**
   * Indicates if the autotest is marked as flaky
   * @return isFlaky
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean getIsFlaky() {
        return isFlaky.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_FLAKY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsFlaky_JsonNullable() {
    return isFlaky;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_FLAKY)
  public void setIsFlaky_JsonNullable(JsonNullable<Boolean> isFlaky) {
    this.isFlaky = isFlaky;
  }

  public void setIsFlaky(Boolean isFlaky) {
    this.isFlaky = JsonNullable.<Boolean>of(isFlaky);
  }


  public AutoTestPutModel externalKey(String externalKey) {
    this.externalKey = JsonNullable.<String>of(externalKey);
    return this;
  }

   /**
   * External key of the autotest
   * @return externalKey
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getExternalKey() {
        return externalKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalKey_JsonNullable() {
    return externalKey;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_KEY)
  public void setExternalKey_JsonNullable(JsonNullable<String> externalKey) {
    this.externalKey = externalKey;
  }

  public void setExternalKey(String externalKey) {
    this.externalKey = JsonNullable.<String>of(externalKey);
  }


  /**
   * Return true if this AutoTestPutModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestPutModel autoTestPutModel = (AutoTestPutModel) o;
    return Objects.equals(this.id, autoTestPutModel.id) &&
        equalsNullable(this.workItemIdsForLinkWithAutoTest, autoTestPutModel.workItemIdsForLinkWithAutoTest) &&
        Objects.equals(this.externalId, autoTestPutModel.externalId) &&
        equalsNullable(this.links, autoTestPutModel.links) &&
        Objects.equals(this.projectId, autoTestPutModel.projectId) &&
        Objects.equals(this.name, autoTestPutModel.name) &&
        equalsNullable(this.namespace, autoTestPutModel.namespace) &&
        equalsNullable(this.classname, autoTestPutModel.classname) &&
        equalsNullable(this.steps, autoTestPutModel.steps) &&
        equalsNullable(this.setup, autoTestPutModel.setup) &&
        equalsNullable(this.teardown, autoTestPutModel.teardown) &&
        equalsNullable(this.title, autoTestPutModel.title) &&
        equalsNullable(this.description, autoTestPutModel.description) &&
        equalsNullable(this.labels, autoTestPutModel.labels) &&
        equalsNullable(this.isFlaky, autoTestPutModel.isFlaky) &&
        equalsNullable(this.externalKey, autoTestPutModel.externalKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(workItemIdsForLinkWithAutoTest), externalId, hashCodeNullable(links), projectId, name, hashCodeNullable(namespace), hashCodeNullable(classname), hashCodeNullable(steps), hashCodeNullable(setup), hashCodeNullable(teardown), hashCodeNullable(title), hashCodeNullable(description), hashCodeNullable(labels), hashCodeNullable(isFlaky), hashCodeNullable(externalKey));
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
    sb.append("class AutoTestPutModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workItemIdsForLinkWithAutoTest: ").append(toIndentedString(workItemIdsForLinkWithAutoTest)).append("\n");
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

}

