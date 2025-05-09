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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentPutModel;
import ru.testit.client.model.AutoTestIdModel;
import ru.testit.client.model.IterationPutModel;
import ru.testit.client.model.LinkPutModel;
import ru.testit.client.model.StepPutModel;
import ru.testit.client.model.TagPutModel;
import ru.testit.client.model.WorkItemPriorityModel;
import ru.testit.client.model.WorkItemStates;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * WorkItemPutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkItemPutModel {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentPutModel> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITERATIONS = "iterations";
  @SerializedName(SERIALIZED_NAME_ITERATIONS)
  private List<IterationPutModel> iterations;

  public static final String SERIALIZED_NAME_AUTO_TESTS = "autoTests";
  @SerializedName(SERIALIZED_NAME_AUTO_TESTS)
  private List<AutoTestIdModel> autoTests;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_SECTION_ID = "sectionId";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private UUID sectionId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private WorkItemStates state;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private WorkItemPriorityModel priority;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<StepPutModel> steps = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRECONDITION_STEPS = "preconditionSteps";
  @SerializedName(SERIALIZED_NAME_PRECONDITION_STEPS)
  private List<StepPutModel> preconditionSteps = new ArrayList<>();

  public static final String SERIALIZED_NAME_POSTCONDITION_STEPS = "postconditionSteps";
  @SerializedName(SERIALIZED_NAME_POSTCONDITION_STEPS)
  private List<StepPutModel> postconditionSteps = new ArrayList<>();

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<TagPutModel> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkPutModel> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public WorkItemPutModel() {
  }

  public WorkItemPutModel attachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public WorkItemPutModel addAttachmentsItem(AttachmentPutModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
   */
  @javax.annotation.Nonnull
  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }


  public WorkItemPutModel iterations(List<IterationPutModel> iterations) {
    this.iterations = iterations;
    return this;
  }

  public WorkItemPutModel addIterationsItem(IterationPutModel iterationsItem) {
    if (this.iterations == null) {
      this.iterations = new ArrayList<>();
    }
    this.iterations.add(iterationsItem);
    return this;
  }

  /**
   * Get iterations
   * @return iterations
   */
  @javax.annotation.Nullable
  public List<IterationPutModel> getIterations() {
    return iterations;
  }

  public void setIterations(List<IterationPutModel> iterations) {
    this.iterations = iterations;
  }


  public WorkItemPutModel autoTests(List<AutoTestIdModel> autoTests) {
    this.autoTests = autoTests;
    return this;
  }

  public WorkItemPutModel addAutoTestsItem(AutoTestIdModel autoTestsItem) {
    if (this.autoTests == null) {
      this.autoTests = new ArrayList<>();
    }
    this.autoTests.add(autoTestsItem);
    return this;
  }

  /**
   * Get autoTests
   * @return autoTests
   */
  @javax.annotation.Nullable
  public List<AutoTestIdModel> getAutoTests() {
    return autoTests;
  }

  public void setAutoTests(List<AutoTestIdModel> autoTests) {
    this.autoTests = autoTests;
  }


  public WorkItemPutModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public WorkItemPutModel sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Get sectionId
   * @return sectionId
   */
  @javax.annotation.Nonnull
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }


  public WorkItemPutModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public WorkItemPutModel state(WorkItemStates state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nonnull
  public WorkItemStates getState() {
    return state;
  }

  public void setState(WorkItemStates state) {
    this.state = state;
  }


  public WorkItemPutModel priority(WorkItemPriorityModel priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nonnull
  public WorkItemPriorityModel getPriority() {
    return priority;
  }

  public void setPriority(WorkItemPriorityModel priority) {
    this.priority = priority;
  }


  public WorkItemPutModel steps(List<StepPutModel> steps) {
    this.steps = steps;
    return this;
  }

  public WorkItemPutModel addStepsItem(StepPutModel stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
   */
  @javax.annotation.Nonnull
  public List<StepPutModel> getSteps() {
    return steps;
  }

  public void setSteps(List<StepPutModel> steps) {
    this.steps = steps;
  }


  public WorkItemPutModel preconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

  public WorkItemPutModel addPreconditionStepsItem(StepPutModel preconditionStepsItem) {
    if (this.preconditionSteps == null) {
      this.preconditionSteps = new ArrayList<>();
    }
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

  /**
   * Get preconditionSteps
   * @return preconditionSteps
   */
  @javax.annotation.Nonnull
  public List<StepPutModel> getPreconditionSteps() {
    return preconditionSteps;
  }

  public void setPreconditionSteps(List<StepPutModel> preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public WorkItemPutModel postconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

  public WorkItemPutModel addPostconditionStepsItem(StepPutModel postconditionStepsItem) {
    if (this.postconditionSteps == null) {
      this.postconditionSteps = new ArrayList<>();
    }
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

  /**
   * Get postconditionSteps
   * @return postconditionSteps
   */
  @javax.annotation.Nonnull
  public List<StepPutModel> getPostconditionSteps() {
    return postconditionSteps;
  }

  public void setPostconditionSteps(List<StepPutModel> postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  public WorkItemPutModel duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * minimum: 0
   * maximum: 86400000
   * @return duration
   */
  @javax.annotation.Nonnull
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public WorkItemPutModel attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public WorkItemPutModel putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nonnull
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public WorkItemPutModel tags(List<TagPutModel> tags) {
    this.tags = tags;
    return this;
  }

  public WorkItemPutModel addTagsItem(TagPutModel tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nonnull
  public List<TagPutModel> getTags() {
    return tags;
  }

  public void setTags(List<TagPutModel> tags) {
    this.tags = tags;
  }


  public WorkItemPutModel links(List<LinkPutModel> links) {
    this.links = links;
    return this;
  }

  public WorkItemPutModel addLinksItem(LinkPutModel linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nonnull
  public List<LinkPutModel> getLinks() {
    return links;
  }

  public void setLinks(List<LinkPutModel> links) {
    this.links = links;
  }


  public WorkItemPutModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemPutModel workItemPutModel = (WorkItemPutModel) o;
    return Objects.equals(this.attachments, workItemPutModel.attachments) &&
        Objects.equals(this.iterations, workItemPutModel.iterations) &&
        Objects.equals(this.autoTests, workItemPutModel.autoTests) &&
        Objects.equals(this.id, workItemPutModel.id) &&
        Objects.equals(this.sectionId, workItemPutModel.sectionId) &&
        Objects.equals(this.description, workItemPutModel.description) &&
        Objects.equals(this.state, workItemPutModel.state) &&
        Objects.equals(this.priority, workItemPutModel.priority) &&
        Objects.equals(this.steps, workItemPutModel.steps) &&
        Objects.equals(this.preconditionSteps, workItemPutModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, workItemPutModel.postconditionSteps) &&
        Objects.equals(this.duration, workItemPutModel.duration) &&
        Objects.equals(this.attributes, workItemPutModel.attributes) &&
        Objects.equals(this.tags, workItemPutModel.tags) &&
        Objects.equals(this.links, workItemPutModel.links) &&
        Objects.equals(this.name, workItemPutModel.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, iterations, autoTests, id, sectionId, description, state, priority, steps, preconditionSteps, postconditionSteps, duration, attributes, tags, links, name);
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
    sb.append("class WorkItemPutModel {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("iterations");
    openapiFields.add("autoTests");
    openapiFields.add("id");
    openapiFields.add("sectionId");
    openapiFields.add("description");
    openapiFields.add("state");
    openapiFields.add("priority");
    openapiFields.add("steps");
    openapiFields.add("preconditionSteps");
    openapiFields.add("postconditionSteps");
    openapiFields.add("duration");
    openapiFields.add("attributes");
    openapiFields.add("tags");
    openapiFields.add("links");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachments");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("sectionId");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("steps");
    openapiRequiredFields.add("preconditionSteps");
    openapiRequiredFields.add("postconditionSteps");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("attributes");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkItemPutModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkItemPutModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemPutModel is not found in the empty JSON string", WorkItemPutModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkItemPutModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemPutModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemPutModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }

      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      // validate the required field `attachments` (array)
      for (int i = 0; i < jsonArrayattachments.size(); i++) {
        AttachmentPutModel.validateJsonElement(jsonArrayattachments.get(i));
      };
      if (jsonObj.get("iterations") != null && !jsonObj.get("iterations").isJsonNull()) {
        JsonArray jsonArrayiterations = jsonObj.getAsJsonArray("iterations");
        if (jsonArrayiterations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("iterations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `iterations` to be an array in the JSON string but got `%s`", jsonObj.get("iterations").toString()));
          }

          // validate the optional field `iterations` (array)
          for (int i = 0; i < jsonArrayiterations.size(); i++) {
            IterationPutModel.validateJsonElement(jsonArrayiterations.get(i));
          };
        }
      }
      if (jsonObj.get("autoTests") != null && !jsonObj.get("autoTests").isJsonNull()) {
        JsonArray jsonArrayautoTests = jsonObj.getAsJsonArray("autoTests");
        if (jsonArrayautoTests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("autoTests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `autoTests` to be an array in the JSON string but got `%s`", jsonObj.get("autoTests").toString()));
          }

          // validate the optional field `autoTests` (array)
          for (int i = 0; i < jsonArrayautoTests.size(); i++) {
            AutoTestIdModel.validateJsonElement(jsonArrayautoTests.get(i));
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("sectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `state`
      WorkItemStates.validateJsonElement(jsonObj.get("state"));
      // validate the required field `priority`
      WorkItemPriorityModel.validateJsonElement(jsonObj.get("priority"));
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        StepPutModel.validateJsonElement(jsonArraysteps.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("preconditionSteps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("preconditionSteps").toString()));
      }

      JsonArray jsonArraypreconditionSteps = jsonObj.getAsJsonArray("preconditionSteps");
      // validate the required field `preconditionSteps` (array)
      for (int i = 0; i < jsonArraypreconditionSteps.size(); i++) {
        StepPutModel.validateJsonElement(jsonArraypreconditionSteps.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("postconditionSteps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `postconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("postconditionSteps").toString()));
      }

      JsonArray jsonArraypostconditionSteps = jsonObj.getAsJsonArray("postconditionSteps");
      // validate the required field `postconditionSteps` (array)
      for (int i = 0; i < jsonArraypostconditionSteps.size(); i++) {
        StepPutModel.validateJsonElement(jsonArraypostconditionSteps.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }

      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      // validate the required field `tags` (array)
      for (int i = 0; i < jsonArraytags.size(); i++) {
        TagPutModel.validateJsonElement(jsonArraytags.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        LinkPutModel.validateJsonElement(jsonArraylinks.get(i));
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemPutModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemPutModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemPutModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemPutModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemPutModel>() {
           @Override
           public void write(JsonWriter out, WorkItemPutModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemPutModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkItemPutModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkItemPutModel
   * @throws IOException if the JSON string is invalid with respect to WorkItemPutModel
   */
  public static WorkItemPutModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemPutModel.class);
  }

  /**
   * Convert an instance of WorkItemPutModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

