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
import ru.testit.client.model.AutoTestStepModel;
import ru.testit.client.model.LabelShortModel;
import ru.testit.client.model.LinkModel;

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
 * AutoTestRelatedToTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestRelatedToTestResult {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkModel> links;

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

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

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

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<LabelShortModel> labels;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public AutoTestRelatedToTestResult() {
  }

  public AutoTestRelatedToTestResult externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * This property is used to set autotest identifier from client system
   * @return externalId
  **/
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AutoTestRelatedToTestResult links(List<LinkModel> links) {
    
    this.links = links;
    return this;
  }

  public AutoTestRelatedToTestResult addLinksItem(LinkModel linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public List<LinkModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkModel> links) {
    this.links = links;
  }


  public AutoTestRelatedToTestResult projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link autotest with project
   * @return projectId
  **/
  @javax.annotation.Nullable
  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public AutoTestRelatedToTestResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AutoTestRelatedToTestResult namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public AutoTestRelatedToTestResult classname(String classname) {
    
    this.classname = classname;
    return this;
  }

   /**
   * Get classname
   * @return classname
  **/
  @javax.annotation.Nullable
  public String getClassname() {
    return classname;
  }


  public void setClassname(String classname) {
    this.classname = classname;
  }


  public AutoTestRelatedToTestResult steps(List<AutoTestStepModel> steps) {
    
    this.steps = steps;
    return this;
  }

  public AutoTestRelatedToTestResult addStepsItem(AutoTestStepModel stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  public List<AutoTestStepModel> getSteps() {
    return steps;
  }


  public void setSteps(List<AutoTestStepModel> steps) {
    this.steps = steps;
  }


  public AutoTestRelatedToTestResult setup(List<AutoTestStepModel> setup) {
    
    this.setup = setup;
    return this;
  }

  public AutoTestRelatedToTestResult addSetupItem(AutoTestStepModel setupItem) {
    if (this.setup == null) {
      this.setup = new ArrayList<>();
    }
    this.setup.add(setupItem);
    return this;
  }

   /**
   * Get setup
   * @return setup
  **/
  @javax.annotation.Nullable
  public List<AutoTestStepModel> getSetup() {
    return setup;
  }


  public void setSetup(List<AutoTestStepModel> setup) {
    this.setup = setup;
  }


  public AutoTestRelatedToTestResult teardown(List<AutoTestStepModel> teardown) {
    
    this.teardown = teardown;
    return this;
  }

  public AutoTestRelatedToTestResult addTeardownItem(AutoTestStepModel teardownItem) {
    if (this.teardown == null) {
      this.teardown = new ArrayList<>();
    }
    this.teardown.add(teardownItem);
    return this;
  }

   /**
   * Get teardown
   * @return teardown
  **/
  @javax.annotation.Nullable
  public List<AutoTestStepModel> getTeardown() {
    return teardown;
  }


  public void setTeardown(List<AutoTestStepModel> teardown) {
    this.teardown = teardown;
  }


  public AutoTestRelatedToTestResult globalId(Long globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @javax.annotation.Nullable
  public Long getGlobalId() {
    return globalId;
  }


  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public AutoTestRelatedToTestResult createdDate(OffsetDateTime createdDate) {
    
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


  public AutoTestRelatedToTestResult modifiedDate(OffsetDateTime modifiedDate) {
    
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


  public AutoTestRelatedToTestResult createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public AutoTestRelatedToTestResult modifiedById(UUID modifiedById) {
    
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


  public AutoTestRelatedToTestResult labels(List<LabelShortModel> labels) {
    
    this.labels = labels;
    return this;
  }

  public AutoTestRelatedToTestResult addLabelsItem(LabelShortModel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<LabelShortModel> getLabels() {
    return labels;
  }


  public void setLabels(List<LabelShortModel> labels) {
    this.labels = labels;
  }


  public AutoTestRelatedToTestResult id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AutoTestRelatedToTestResult isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the entity is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
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
    AutoTestRelatedToTestResult autoTestRelatedToTestResult = (AutoTestRelatedToTestResult) o;
    return Objects.equals(this.externalId, autoTestRelatedToTestResult.externalId) &&
        Objects.equals(this.links, autoTestRelatedToTestResult.links) &&
        Objects.equals(this.projectId, autoTestRelatedToTestResult.projectId) &&
        Objects.equals(this.name, autoTestRelatedToTestResult.name) &&
        Objects.equals(this.namespace, autoTestRelatedToTestResult.namespace) &&
        Objects.equals(this.classname, autoTestRelatedToTestResult.classname) &&
        Objects.equals(this.steps, autoTestRelatedToTestResult.steps) &&
        Objects.equals(this.setup, autoTestRelatedToTestResult.setup) &&
        Objects.equals(this.teardown, autoTestRelatedToTestResult.teardown) &&
        Objects.equals(this.globalId, autoTestRelatedToTestResult.globalId) &&
        Objects.equals(this.createdDate, autoTestRelatedToTestResult.createdDate) &&
        Objects.equals(this.modifiedDate, autoTestRelatedToTestResult.modifiedDate) &&
        Objects.equals(this.createdById, autoTestRelatedToTestResult.createdById) &&
        Objects.equals(this.modifiedById, autoTestRelatedToTestResult.modifiedById) &&
        Objects.equals(this.labels, autoTestRelatedToTestResult.labels) &&
        Objects.equals(this.id, autoTestRelatedToTestResult.id) &&
        Objects.equals(this.isDeleted, autoTestRelatedToTestResult.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, links, projectId, name, namespace, classname, steps, setup, teardown, globalId, createdDate, modifiedDate, createdById, modifiedById, labels, id, isDeleted);
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
    sb.append("class AutoTestRelatedToTestResult {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    teardown: ").append(toIndentedString(teardown)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("externalId");
    openapiFields.add("links");
    openapiFields.add("projectId");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("classname");
    openapiFields.add("steps");
    openapiFields.add("setup");
    openapiFields.add("teardown");
    openapiFields.add("globalId");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("labels");
    openapiFields.add("id");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoTestRelatedToTestResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutoTestRelatedToTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestRelatedToTestResult is not found in the empty JSON string", AutoTestRelatedToTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoTestRelatedToTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestRelatedToTestResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
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
            LinkModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
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
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
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
            LabelShortModel.validateJsonObject(jsonArraylabels.get(i).getAsJsonObject());
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
       if (!AutoTestRelatedToTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestRelatedToTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestRelatedToTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestRelatedToTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestRelatedToTestResult>() {
           @Override
           public void write(JsonWriter out, AutoTestRelatedToTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestRelatedToTestResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoTestRelatedToTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoTestRelatedToTestResult
  * @throws IOException if the JSON string is invalid with respect to AutoTestRelatedToTestResult
  */
  public static AutoTestRelatedToTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestRelatedToTestResult.class);
  }

 /**
  * Convert an instance of AutoTestRelatedToTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
