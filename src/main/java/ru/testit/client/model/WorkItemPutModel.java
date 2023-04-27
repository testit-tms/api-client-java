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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.invoker.JSON;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * WorkItemPutModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
  private List<TagShortModel> tags = new ArrayList<>();

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
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
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
    this.iterations.add(iterationsItem);
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
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
    this.autoTests.add(autoTestsItem);
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
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
  **/
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
  **/
  @javax.annotation.Nullable

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
  **/
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
  **/
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
  **/
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
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
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
    this.preconditionSteps.add(preconditionStepsItem);
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
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
    this.postconditionSteps.add(postconditionStepsItem);
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
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
   * maximum: 86400
   * @return duration
  **/
  @javax.annotation.Nullable

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


  public WorkItemPutModel tags(List<TagShortModel> tags) {
    
    this.tags = tags;
    return this;
  }

  public WorkItemPutModel addTagsItem(TagShortModel tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull

  public List<TagShortModel> getTags() {
    return tags;
  }


  public void setTags(List<TagShortModel> tags) {
    this.tags = tags;
  }


  public WorkItemPutModel links(List<LinkPutModel> links) {
    
    this.links = links;
    return this;
  }

  public WorkItemPutModel addLinksItem(LinkPutModel linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
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
  **/
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
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("steps");
    openapiRequiredFields.add("preconditionSteps");
    openapiRequiredFields.add("postconditionSteps");
    openapiRequiredFields.add("attributes");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemPutModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemPutModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemPutModel is not found in the empty JSON string", WorkItemPutModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemPutModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemPutModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkItemPutModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }

      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      // validate the required field `attachments` (array)
      for (int i = 0; i < jsonArrayattachments.size(); i++) {
        AttachmentPutModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
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
            IterationPutModel.validateJsonObject(jsonArrayiterations.get(i).getAsJsonObject());
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
            AutoTestIdModel.validateJsonObject(jsonArrayautoTests.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("sectionId") != null && !jsonObj.get("sectionId").isJsonNull()) && !jsonObj.get("sectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sectionId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        StepPutModel.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("preconditionSteps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `preconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("preconditionSteps").toString()));
      }

      JsonArray jsonArraypreconditionSteps = jsonObj.getAsJsonArray("preconditionSteps");
      // validate the required field `preconditionSteps` (array)
      for (int i = 0; i < jsonArraypreconditionSteps.size(); i++) {
        StepPutModel.validateJsonObject(jsonArraypreconditionSteps.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("postconditionSteps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `postconditionSteps` to be an array in the JSON string but got `%s`", jsonObj.get("postconditionSteps").toString()));
      }

      JsonArray jsonArraypostconditionSteps = jsonObj.getAsJsonArray("postconditionSteps");
      // validate the required field `postconditionSteps` (array)
      for (int i = 0; i < jsonArraypostconditionSteps.size(); i++) {
        StepPutModel.validateJsonObject(jsonArraypostconditionSteps.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }

      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      // validate the required field `tags` (array)
      for (int i = 0; i < jsonArraytags.size(); i++) {
        TagShortModel.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        LinkPutModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

