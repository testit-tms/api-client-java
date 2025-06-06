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
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.LinkModel;
import ru.testit.client.model.TestPointShortModel;

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
 * TestResultV2ShortModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestResultV2ShortModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_WORK_ITEM_VERSION_ID = "workItemVersionId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_VERSION_ID)
  private UUID workItemVersionId;

  public static final String SERIALIZED_NAME_AUTO_TEST_ID = "autoTestId";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST_ID)
  private UUID autoTestId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TRACES = "traces";
  @SerializedName(SERIALIZED_NAME_TRACES)
  private String traces;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

  public static final String SERIALIZED_NAME_RUN_BY_USER_ID = "runByUserId";
  @SerializedName(SERIALIZED_NAME_RUN_BY_USER_ID)
  private UUID runByUserId;

  public static final String SERIALIZED_NAME_STOPPED_BY_USER_ID = "stoppedByUserId";
  @SerializedName(SERIALIZED_NAME_STOPPED_BY_USER_ID)
  private UUID stoppedByUserId;

  public static final String SERIALIZED_NAME_TEST_POINT_ID = "testPointId";
  @SerializedName(SERIALIZED_NAME_TEST_POINT_ID)
  private UUID testPointId;

  public static final String SERIALIZED_NAME_TEST_POINT = "testPoint";
  @SerializedName(SERIALIZED_NAME_TEST_POINT)
  private TestPointShortModel testPoint;

  public static final String SERIALIZED_NAME_TEST_RUN_ID = "testRunId";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_ID)
  private UUID testRunId;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkModel> links;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentModel> attachments;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties;

  public TestResultV2ShortModel() {
  }

  public TestResultV2ShortModel id(UUID id) {
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


  public TestResultV2ShortModel configurationId(UUID configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * Get configurationId
   * @return configurationId
   */
  @javax.annotation.Nonnull
  public UUID getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestResultV2ShortModel workItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
    return this;
  }

  /**
   * Get workItemVersionId
   * @return workItemVersionId
   */
  @javax.annotation.Nonnull
  public UUID getWorkItemVersionId() {
    return workItemVersionId;
  }

  public void setWorkItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
  }


  public TestResultV2ShortModel autoTestId(UUID autoTestId) {
    this.autoTestId = autoTestId;
    return this;
  }

  /**
   * Get autoTestId
   * @return autoTestId
   */
  @javax.annotation.Nullable
  public UUID getAutoTestId() {
    return autoTestId;
  }

  public void setAutoTestId(UUID autoTestId) {
    this.autoTestId = autoTestId;
  }


  public TestResultV2ShortModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public TestResultV2ShortModel traces(String traces) {
    this.traces = traces;
    return this;
  }

  /**
   * Get traces
   * @return traces
   */
  @javax.annotation.Nullable
  public String getTraces() {
    return traces;
  }

  public void setTraces(String traces) {
    this.traces = traces;
  }


  public TestResultV2ShortModel startedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
    return this;
  }

  /**
   * Get startedOn
   * @return startedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public TestResultV2ShortModel completedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
    return this;
  }

  /**
   * Get completedOn
   * @return completedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public TestResultV2ShortModel runByUserId(UUID runByUserId) {
    this.runByUserId = runByUserId;
    return this;
  }

  /**
   * Get runByUserId
   * @return runByUserId
   */
  @javax.annotation.Nullable
  public UUID getRunByUserId() {
    return runByUserId;
  }

  public void setRunByUserId(UUID runByUserId) {
    this.runByUserId = runByUserId;
  }


  public TestResultV2ShortModel stoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = stoppedByUserId;
    return this;
  }

  /**
   * Get stoppedByUserId
   * @return stoppedByUserId
   */
  @javax.annotation.Nullable
  public UUID getStoppedByUserId() {
    return stoppedByUserId;
  }

  public void setStoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = stoppedByUserId;
  }


  public TestResultV2ShortModel testPointId(UUID testPointId) {
    this.testPointId = testPointId;
    return this;
  }

  /**
   * Get testPointId
   * @return testPointId
   */
  @javax.annotation.Nullable
  public UUID getTestPointId() {
    return testPointId;
  }

  public void setTestPointId(UUID testPointId) {
    this.testPointId = testPointId;
  }


  public TestResultV2ShortModel testPoint(TestPointShortModel testPoint) {
    this.testPoint = testPoint;
    return this;
  }

  /**
   * Get testPoint
   * @return testPoint
   */
  @javax.annotation.Nullable
  public TestPointShortModel getTestPoint() {
    return testPoint;
  }

  public void setTestPoint(TestPointShortModel testPoint) {
    this.testPoint = testPoint;
  }


  public TestResultV2ShortModel testRunId(UUID testRunId) {
    this.testRunId = testRunId;
    return this;
  }

  /**
   * Get testRunId
   * @return testRunId
   */
  @javax.annotation.Nonnull
  public UUID getTestRunId() {
    return testRunId;
  }

  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public TestResultV2ShortModel outcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped
   * @return outcome
   */
  @javax.annotation.Nonnull
  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public TestResultV2ShortModel comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public TestResultV2ShortModel links(List<LinkModel> links) {
    this.links = links;
    return this;
  }

  public TestResultV2ShortModel addLinksItem(LinkModel linksItem) {
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
  @javax.annotation.Nullable
  public List<LinkModel> getLinks() {
    return links;
  }

  public void setLinks(List<LinkModel> links) {
    this.links = links;
  }


  public TestResultV2ShortModel attachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public TestResultV2ShortModel addAttachmentsItem(AttachmentModel attachmentsItem) {
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
  @javax.annotation.Nullable
  public List<AttachmentModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
  }


  public TestResultV2ShortModel parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TestResultV2ShortModel putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   */
  @javax.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public TestResultV2ShortModel properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public TestResultV2ShortModel putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @javax.annotation.Nullable
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultV2ShortModel testResultV2ShortModel = (TestResultV2ShortModel) o;
    return Objects.equals(this.id, testResultV2ShortModel.id) &&
        Objects.equals(this.configurationId, testResultV2ShortModel.configurationId) &&
        Objects.equals(this.workItemVersionId, testResultV2ShortModel.workItemVersionId) &&
        Objects.equals(this.autoTestId, testResultV2ShortModel.autoTestId) &&
        Objects.equals(this.message, testResultV2ShortModel.message) &&
        Objects.equals(this.traces, testResultV2ShortModel.traces) &&
        Objects.equals(this.startedOn, testResultV2ShortModel.startedOn) &&
        Objects.equals(this.completedOn, testResultV2ShortModel.completedOn) &&
        Objects.equals(this.runByUserId, testResultV2ShortModel.runByUserId) &&
        Objects.equals(this.stoppedByUserId, testResultV2ShortModel.stoppedByUserId) &&
        Objects.equals(this.testPointId, testResultV2ShortModel.testPointId) &&
        Objects.equals(this.testPoint, testResultV2ShortModel.testPoint) &&
        Objects.equals(this.testRunId, testResultV2ShortModel.testRunId) &&
        Objects.equals(this.outcome, testResultV2ShortModel.outcome) &&
        Objects.equals(this.comment, testResultV2ShortModel.comment) &&
        Objects.equals(this.links, testResultV2ShortModel.links) &&
        Objects.equals(this.attachments, testResultV2ShortModel.attachments) &&
        Objects.equals(this.parameters, testResultV2ShortModel.parameters) &&
        Objects.equals(this.properties, testResultV2ShortModel.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurationId, workItemVersionId, autoTestId, message, traces, startedOn, completedOn, runByUserId, stoppedByUserId, testPointId, testPoint, testRunId, outcome, comment, links, attachments, parameters, properties);
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
    sb.append("class TestResultV2ShortModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    workItemVersionId: ").append(toIndentedString(workItemVersionId)).append("\n");
    sb.append("    autoTestId: ").append(toIndentedString(autoTestId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    runByUserId: ").append(toIndentedString(runByUserId)).append("\n");
    sb.append("    stoppedByUserId: ").append(toIndentedString(stoppedByUserId)).append("\n");
    sb.append("    testPointId: ").append(toIndentedString(testPointId)).append("\n");
    sb.append("    testPoint: ").append(toIndentedString(testPoint)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("configurationId");
    openapiFields.add("workItemVersionId");
    openapiFields.add("autoTestId");
    openapiFields.add("message");
    openapiFields.add("traces");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("runByUserId");
    openapiFields.add("stoppedByUserId");
    openapiFields.add("testPointId");
    openapiFields.add("testPoint");
    openapiFields.add("testRunId");
    openapiFields.add("outcome");
    openapiFields.add("comment");
    openapiFields.add("links");
    openapiFields.add("attachments");
    openapiFields.add("parameters");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("configurationId");
    openapiRequiredFields.add("workItemVersionId");
    openapiRequiredFields.add("testRunId");
    openapiRequiredFields.add("outcome");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestResultV2ShortModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResultV2ShortModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultV2ShortModel is not found in the empty JSON string", TestResultV2ShortModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResultV2ShortModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultV2ShortModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestResultV2ShortModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if (!jsonObj.get("workItemVersionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemVersionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemVersionId").toString()));
      }
      if ((jsonObj.get("autoTestId") != null && !jsonObj.get("autoTestId").isJsonNull()) && !jsonObj.get("autoTestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoTestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoTestId").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("traces") != null && !jsonObj.get("traces").isJsonNull()) && !jsonObj.get("traces").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traces` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traces").toString()));
      }
      if ((jsonObj.get("runByUserId") != null && !jsonObj.get("runByUserId").isJsonNull()) && !jsonObj.get("runByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runByUserId").toString()));
      }
      if ((jsonObj.get("stoppedByUserId") != null && !jsonObj.get("stoppedByUserId").isJsonNull()) && !jsonObj.get("stoppedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stoppedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stoppedByUserId").toString()));
      }
      if ((jsonObj.get("testPointId") != null && !jsonObj.get("testPointId").isJsonNull()) && !jsonObj.get("testPointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPointId").toString()));
      }
      // validate the optional field `testPoint`
      if (jsonObj.get("testPoint") != null && !jsonObj.get("testPoint").isJsonNull()) {
        TestPointShortModel.validateJsonElement(jsonObj.get("testPoint"));
      }
      if (!jsonObj.get("testRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunId").toString()));
      }
      if (!jsonObj.get("outcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcome").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
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
            LinkModel.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentModel.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultV2ShortModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultV2ShortModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultV2ShortModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultV2ShortModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultV2ShortModel>() {
           @Override
           public void write(JsonWriter out, TestResultV2ShortModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultV2ShortModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestResultV2ShortModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestResultV2ShortModel
   * @throws IOException if the JSON string is invalid with respect to TestResultV2ShortModel
   */
  public static TestResultV2ShortModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultV2ShortModel.class);
  }

  /**
   * Convert an instance of TestResultV2ShortModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

