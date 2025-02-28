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
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentApiResult;
import ru.testit.client.model.AutoTestResultReasonShort;
import ru.testit.client.model.LinkShort;
import ru.testit.client.model.TestStatusApiResult;

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
 * TestResultShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestResultShortResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTOTEST_GLOBAL_ID = "autotestGlobalId";
  @SerializedName(SERIALIZED_NAME_AUTOTEST_GLOBAL_ID)
  private Long autotestGlobalId;

  public static final String SERIALIZED_NAME_TEST_RUN_ID = "testRunId";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_ID)
  private UUID testRunId;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private UUID configurationId;

  public static final String SERIALIZED_NAME_CONFIGURATION_NAME = "configurationName";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_NAME)
  private String configurationName;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TestStatusApiResult status;

  public static final String SERIALIZED_NAME_RESULT_REASONS = "resultReasons";
  @SerializedName(SERIALIZED_NAME_RESULT_REASONS)
  private List<AutoTestResultReasonShort> resultReasons = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DATE = "date";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkShort> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentApiResult> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_RERUN_COMPLETED_COUNT = "rerunCompletedCount";
  @SerializedName(SERIALIZED_NAME_RERUN_COMPLETED_COUNT)
  private Integer rerunCompletedCount;

  public TestResultShortResponse() {
  }

  public TestResultShortResponse id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the test result
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public TestResultShortResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of autotest represented by the test result
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestResultShortResponse autotestGlobalId(Long autotestGlobalId) {
    this.autotestGlobalId = autotestGlobalId;
    return this;
  }

  /**
   * Global ID of autotest represented by the test result
   * @return autotestGlobalId
   */
  @javax.annotation.Nonnull
  public Long getAutotestGlobalId() {
    return autotestGlobalId;
  }

  public void setAutotestGlobalId(Long autotestGlobalId) {
    this.autotestGlobalId = autotestGlobalId;
  }


  public TestResultShortResponse testRunId(UUID testRunId) {
    this.testRunId = testRunId;
    return this;
  }

  /**
   * Unique ID of test run where the test result is located
   * @return testRunId
   */
  @javax.annotation.Nonnull
  public UUID getTestRunId() {
    return testRunId;
  }

  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public TestResultShortResponse configurationId(UUID configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * Unique ID of configuration which the test result uses
   * @return configurationId
   */
  @javax.annotation.Nonnull
  public UUID getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestResultShortResponse configurationName(String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

  /**
   * Name of configuration which the test result uses
   * @return configurationName
   */
  @javax.annotation.Nonnull
  public String getConfigurationName() {
    return configurationName;
  }

  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }


  @Deprecated
  public TestResultShortResponse outcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Outcome of the test result
   * @return outcome
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getOutcome() {
    return outcome;
  }

  @Deprecated
  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public TestResultShortResponse status(TestStatusApiResult status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public TestStatusApiResult getStatus() {
    return status;
  }

  public void setStatus(TestStatusApiResult status) {
    this.status = status;
  }


  public TestResultShortResponse resultReasons(List<AutoTestResultReasonShort> resultReasons) {
    this.resultReasons = resultReasons;
    return this;
  }

  public TestResultShortResponse addResultReasonsItem(AutoTestResultReasonShort resultReasonsItem) {
    if (this.resultReasons == null) {
      this.resultReasons = new ArrayList<>();
    }
    this.resultReasons.add(resultReasonsItem);
    return this;
  }

  /**
   * Collection of result reasons which the test result have
   * @return resultReasons
   */
  @javax.annotation.Nonnull
  public List<AutoTestResultReasonShort> getResultReasons() {
    return resultReasons;
  }

  public void setResultReasons(List<AutoTestResultReasonShort> resultReasons) {
    this.resultReasons = resultReasons;
  }


  public TestResultShortResponse comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Comment to the test result
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Deprecated
  public TestResultShortResponse date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date when the test result was completed or started or created
   * @return date
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }

  @Deprecated
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public TestResultShortResponse createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Date when the test result has been created
   * @return createdDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestResultShortResponse modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Date when the test result has been modified
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestResultShortResponse startedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
    return this;
  }

  /**
   * Date when the test result has been started
   * @return startedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public TestResultShortResponse completedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
    return this;
  }

  /**
   * Date when the test result has been completed
   * @return completedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public TestResultShortResponse duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Time which it took to run the test
   * @return duration
   */
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public TestResultShortResponse links(List<LinkShort> links) {
    this.links = links;
    return this;
  }

  public TestResultShortResponse addLinksItem(LinkShort linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Collection of links attached to the test result
   * @return links
   */
  @javax.annotation.Nonnull
  public List<LinkShort> getLinks() {
    return links;
  }

  public void setLinks(List<LinkShort> links) {
    this.links = links;
  }


  public TestResultShortResponse attachments(List<AttachmentApiResult> attachments) {
    this.attachments = attachments;
    return this;
  }

  public TestResultShortResponse addAttachmentsItem(AttachmentApiResult attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Collection of files attached to the test result
   * @return attachments
   */
  @javax.annotation.Nonnull
  public List<AttachmentApiResult> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentApiResult> attachments) {
    this.attachments = attachments;
  }


  public TestResultShortResponse rerunCompletedCount(Integer rerunCompletedCount) {
    this.rerunCompletedCount = rerunCompletedCount;
    return this;
  }

  /**
   * Run count
   * @return rerunCompletedCount
   */
  @javax.annotation.Nonnull
  public Integer getRerunCompletedCount() {
    return rerunCompletedCount;
  }

  public void setRerunCompletedCount(Integer rerunCompletedCount) {
    this.rerunCompletedCount = rerunCompletedCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultShortResponse testResultShortResponse = (TestResultShortResponse) o;
    return Objects.equals(this.id, testResultShortResponse.id) &&
        Objects.equals(this.name, testResultShortResponse.name) &&
        Objects.equals(this.autotestGlobalId, testResultShortResponse.autotestGlobalId) &&
        Objects.equals(this.testRunId, testResultShortResponse.testRunId) &&
        Objects.equals(this.configurationId, testResultShortResponse.configurationId) &&
        Objects.equals(this.configurationName, testResultShortResponse.configurationName) &&
        Objects.equals(this.outcome, testResultShortResponse.outcome) &&
        Objects.equals(this.status, testResultShortResponse.status) &&
        Objects.equals(this.resultReasons, testResultShortResponse.resultReasons) &&
        Objects.equals(this.comment, testResultShortResponse.comment) &&
        Objects.equals(this.date, testResultShortResponse.date) &&
        Objects.equals(this.createdDate, testResultShortResponse.createdDate) &&
        Objects.equals(this.modifiedDate, testResultShortResponse.modifiedDate) &&
        Objects.equals(this.startedOn, testResultShortResponse.startedOn) &&
        Objects.equals(this.completedOn, testResultShortResponse.completedOn) &&
        Objects.equals(this.duration, testResultShortResponse.duration) &&
        Objects.equals(this.links, testResultShortResponse.links) &&
        Objects.equals(this.attachments, testResultShortResponse.attachments) &&
        Objects.equals(this.rerunCompletedCount, testResultShortResponse.rerunCompletedCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, autotestGlobalId, testRunId, configurationId, configurationName, outcome, status, resultReasons, comment, date, createdDate, modifiedDate, startedOn, completedOn, duration, links, attachments, rerunCompletedCount);
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
    sb.append("class TestResultShortResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autotestGlobalId: ").append(toIndentedString(autotestGlobalId)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resultReasons: ").append(toIndentedString(resultReasons)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    rerunCompletedCount: ").append(toIndentedString(rerunCompletedCount)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("autotestGlobalId");
    openapiFields.add("testRunId");
    openapiFields.add("configurationId");
    openapiFields.add("configurationName");
    openapiFields.add("outcome");
    openapiFields.add("status");
    openapiFields.add("resultReasons");
    openapiFields.add("comment");
    openapiFields.add("date");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("duration");
    openapiFields.add("links");
    openapiFields.add("attachments");
    openapiFields.add("rerunCompletedCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("autotestGlobalId");
    openapiRequiredFields.add("testRunId");
    openapiRequiredFields.add("configurationId");
    openapiRequiredFields.add("configurationName");
    openapiRequiredFields.add("resultReasons");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("attachments");
    openapiRequiredFields.add("rerunCompletedCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestResultShortResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResultShortResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultShortResponse is not found in the empty JSON string", TestResultShortResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResultShortResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultShortResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestResultShortResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("testRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunId").toString()));
      }
      if (!jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if (!jsonObj.get("configurationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationName").toString()));
      }
      if ((jsonObj.get("outcome") != null && !jsonObj.get("outcome").isJsonNull()) && !jsonObj.get("outcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcome").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        TestStatusApiResult.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("resultReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultReasons` to be an array in the JSON string but got `%s`", jsonObj.get("resultReasons").toString()));
      }

      JsonArray jsonArrayresultReasons = jsonObj.getAsJsonArray("resultReasons");
      // validate the required field `resultReasons` (array)
      for (int i = 0; i < jsonArrayresultReasons.size(); i++) {
        AutoTestResultReasonShort.validateJsonElement(jsonArrayresultReasons.get(i));
      };
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }

      JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
      // validate the required field `links` (array)
      for (int i = 0; i < jsonArraylinks.size(); i++) {
        LinkShort.validateJsonElement(jsonArraylinks.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }

      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      // validate the required field `attachments` (array)
      for (int i = 0; i < jsonArrayattachments.size(); i++) {
        AttachmentApiResult.validateJsonElement(jsonArrayattachments.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultShortResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultShortResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultShortResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultShortResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultShortResponse>() {
           @Override
           public void write(JsonWriter out, TestResultShortResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultShortResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestResultShortResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestResultShortResponse
   * @throws IOException if the JSON string is invalid with respect to TestResultShortResponse
   */
  public static TestResultShortResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultShortResponse.class);
  }

  /**
   * Convert an instance of TestResultShortResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

