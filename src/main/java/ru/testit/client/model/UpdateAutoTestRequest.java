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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutoTestStepModel;
import ru.testit.client.model.LabelPostModel;
import ru.testit.client.model.LinkPutModel;

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
 * UpdateAutoTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAutoTestRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_WORK_ITEM_IDS_FOR_LINK_WITH_AUTO_TEST = "workItemIdsForLinkWithAutoTest";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_IDS_FOR_LINK_WITH_AUTO_TEST)
  private Set<UUID> workItemIdsForLinkWithAutoTest;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkPutModel> links;

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
  private List<AutoTestStepModel> steps;

  public static final String SERIALIZED_NAME_SETUP = "setup";
  @SerializedName(SERIALIZED_NAME_SETUP)
  private List<AutoTestStepModel> setup;

  public static final String SERIALIZED_NAME_TEARDOWN = "teardown";
  @SerializedName(SERIALIZED_NAME_TEARDOWN)
  private List<AutoTestStepModel> teardown;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<LabelPostModel> labels;

  public static final String SERIALIZED_NAME_IS_FLAKY = "isFlaky";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY)
  private Boolean isFlaky;

  public static final String SERIALIZED_NAME_EXTERNAL_KEY = "externalKey";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_KEY)
  private String externalKey;

  public UpdateAutoTestRequest() {
  }

  public UpdateAutoTestRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Used for search autotest. If value is null or equals Guid mask filled with zeros, search will be executed using ExternalId
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public UpdateAutoTestRequest workItemIdsForLinkWithAutoTest(Set<UUID> workItemIdsForLinkWithAutoTest) {
    
    this.workItemIdsForLinkWithAutoTest = workItemIdsForLinkWithAutoTest;
    return this;
  }

  public UpdateAutoTestRequest addWorkItemIdsForLinkWithAutoTestItem(UUID workItemIdsForLinkWithAutoTestItem) {
    if (this.workItemIdsForLinkWithAutoTest == null) {
      this.workItemIdsForLinkWithAutoTest = new LinkedHashSet<>();
    }
    this.workItemIdsForLinkWithAutoTest.add(workItemIdsForLinkWithAutoTestItem);
    return this;
  }

   /**
   * Get workItemIdsForLinkWithAutoTest
   * @return workItemIdsForLinkWithAutoTest
  **/
  @javax.annotation.Nullable
  public Set<UUID> getWorkItemIdsForLinkWithAutoTest() {
    return workItemIdsForLinkWithAutoTest;
  }


  public void setWorkItemIdsForLinkWithAutoTest(Set<UUID> workItemIdsForLinkWithAutoTest) {
    this.workItemIdsForLinkWithAutoTest = workItemIdsForLinkWithAutoTest;
  }


  public UpdateAutoTestRequest externalId(String externalId) {
    
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


  public UpdateAutoTestRequest links(List<LinkPutModel> links) {
    
    this.links = links;
    return this;
  }

  public UpdateAutoTestRequest addLinksItem(LinkPutModel linksItem) {
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
  public List<LinkPutModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkPutModel> links) {
    this.links = links;
  }


  public UpdateAutoTestRequest projectId(UUID projectId) {
    
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


  public UpdateAutoTestRequest name(String name) {
    
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


  public UpdateAutoTestRequest namespace(String namespace) {
    
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


  public UpdateAutoTestRequest classname(String classname) {
    
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


  public UpdateAutoTestRequest steps(List<AutoTestStepModel> steps) {
    
    this.steps = steps;
    return this;
  }

  public UpdateAutoTestRequest addStepsItem(AutoTestStepModel stepsItem) {
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
  public List<AutoTestStepModel> getSteps() {
    return steps;
  }


  public void setSteps(List<AutoTestStepModel> steps) {
    this.steps = steps;
  }


  public UpdateAutoTestRequest setup(List<AutoTestStepModel> setup) {
    
    this.setup = setup;
    return this;
  }

  public UpdateAutoTestRequest addSetupItem(AutoTestStepModel setupItem) {
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
  public List<AutoTestStepModel> getSetup() {
    return setup;
  }


  public void setSetup(List<AutoTestStepModel> setup) {
    this.setup = setup;
  }


  public UpdateAutoTestRequest teardown(List<AutoTestStepModel> teardown) {
    
    this.teardown = teardown;
    return this;
  }

  public UpdateAutoTestRequest addTeardownItem(AutoTestStepModel teardownItem) {
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
  public List<AutoTestStepModel> getTeardown() {
    return teardown;
  }


  public void setTeardown(List<AutoTestStepModel> teardown) {
    this.teardown = teardown;
  }


  public UpdateAutoTestRequest title(String title) {
    
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


  public UpdateAutoTestRequest description(String description) {
    
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


  public UpdateAutoTestRequest labels(List<LabelPostModel> labels) {
    
    this.labels = labels;
    return this;
  }

  public UpdateAutoTestRequest addLabelsItem(LabelPostModel labelsItem) {
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
  public List<LabelPostModel> getLabels() {
    return labels;
  }


  public void setLabels(List<LabelPostModel> labels) {
    this.labels = labels;
  }


  public UpdateAutoTestRequest isFlaky(Boolean isFlaky) {
    
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


  public UpdateAutoTestRequest externalKey(String externalKey) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAutoTestRequest updateAutoTestRequest = (UpdateAutoTestRequest) o;
    return Objects.equals(this.id, updateAutoTestRequest.id) &&
        Objects.equals(this.workItemIdsForLinkWithAutoTest, updateAutoTestRequest.workItemIdsForLinkWithAutoTest) &&
        Objects.equals(this.externalId, updateAutoTestRequest.externalId) &&
        Objects.equals(this.links, updateAutoTestRequest.links) &&
        Objects.equals(this.projectId, updateAutoTestRequest.projectId) &&
        Objects.equals(this.name, updateAutoTestRequest.name) &&
        Objects.equals(this.namespace, updateAutoTestRequest.namespace) &&
        Objects.equals(this.classname, updateAutoTestRequest.classname) &&
        Objects.equals(this.steps, updateAutoTestRequest.steps) &&
        Objects.equals(this.setup, updateAutoTestRequest.setup) &&
        Objects.equals(this.teardown, updateAutoTestRequest.teardown) &&
        Objects.equals(this.title, updateAutoTestRequest.title) &&
        Objects.equals(this.description, updateAutoTestRequest.description) &&
        Objects.equals(this.labels, updateAutoTestRequest.labels) &&
        Objects.equals(this.isFlaky, updateAutoTestRequest.isFlaky) &&
        Objects.equals(this.externalKey, updateAutoTestRequest.externalKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workItemIdsForLinkWithAutoTest, externalId, links, projectId, name, namespace, classname, steps, setup, teardown, title, description, labels, isFlaky, externalKey);
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
    sb.append("class UpdateAutoTestRequest {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("workItemIdsForLinkWithAutoTest");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("externalId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateAutoTestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateAutoTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAutoTestRequest is not found in the empty JSON string", UpdateAutoTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateAutoTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateAutoTestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateAutoTestRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workItemIdsForLinkWithAutoTest") != null && !jsonObj.get("workItemIdsForLinkWithAutoTest").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemIdsForLinkWithAutoTest` to be an array in the JSON string but got `%s`", jsonObj.get("workItemIdsForLinkWithAutoTest").toString()));
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
            LinkPutModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
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
            AutoTestStepModel.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
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
            AutoTestStepModel.validateJsonObject(jsonArraysetup.get(i).getAsJsonObject());
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
            AutoTestStepModel.validateJsonObject(jsonArrayteardown.get(i).getAsJsonObject());
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
            LabelPostModel.validateJsonObject(jsonArraylabels.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("externalKey") != null && !jsonObj.get("externalKey").isJsonNull()) && !jsonObj.get("externalKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAutoTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAutoTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAutoTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAutoTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAutoTestRequest>() {
           @Override
           public void write(JsonWriter out, UpdateAutoTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateAutoTestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateAutoTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAutoTestRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateAutoTestRequest
  */
  public static UpdateAutoTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAutoTestRequest.class);
  }

 /**
  * Convert an instance of UpdateAutoTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

