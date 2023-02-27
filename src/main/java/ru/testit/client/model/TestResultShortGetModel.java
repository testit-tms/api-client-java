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
 * TestResultShortGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultShortGetModel {
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
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private TestResultOutcome outcome;

  public static final String SERIALIZED_NAME_RESULT_REASONS = "resultReasons";
  @SerializedName(SERIALIZED_NAME_RESULT_REASONS)
  private List<AutotestResultReasonSubGetModel> resultReasons = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkSubGetModel> links = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentSubGetModel> attachments = null;

  public TestResultShortGetModel() {
  }

  public TestResultShortGetModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of test result
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of test result")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestResultShortGetModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of autotest represented by the test result
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of autotest represented by the test result")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestResultShortGetModel autotestGlobalId(Long autotestGlobalId) {
    
    this.autotestGlobalId = autotestGlobalId;
    return this;
  }

   /**
   * Global ID of autotest represented by test result
   * @return autotestGlobalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global ID of autotest represented by test result")

  public Long getAutotestGlobalId() {
    return autotestGlobalId;
  }


  public void setAutotestGlobalId(Long autotestGlobalId) {
    this.autotestGlobalId = autotestGlobalId;
  }


  public TestResultShortGetModel testRunId(UUID testRunId) {
    
    this.testRunId = testRunId;
    return this;
  }

   /**
   * Unique ID of test run where test result is located
   * @return testRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of test run where test result is located")

  public UUID getTestRunId() {
    return testRunId;
  }


  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public TestResultShortGetModel configurationId(UUID configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Unique ID of configuration which test result uses
   * @return configurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of configuration which test result uses")

  public UUID getConfigurationId() {
    return configurationId;
  }


  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestResultShortGetModel configurationName(String configurationName) {
    
    this.configurationName = configurationName;
    return this;
  }

   /**
   * Name of configuration which test result uses
   * @return configurationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of configuration which test result uses")

  public String getConfigurationName() {
    return configurationName;
  }


  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }


  public TestResultShortGetModel outcome(TestResultOutcome outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestResultOutcome getOutcome() {
    return outcome;
  }


  public void setOutcome(TestResultOutcome outcome) {
    this.outcome = outcome;
  }


  public TestResultShortGetModel resultReasons(List<AutotestResultReasonSubGetModel> resultReasons) {
    
    this.resultReasons = resultReasons;
    return this;
  }

  public TestResultShortGetModel addResultReasonsItem(AutotestResultReasonSubGetModel resultReasonsItem) {
    if (this.resultReasons == null) {
      this.resultReasons = new ArrayList<>();
    }
    this.resultReasons.add(resultReasonsItem);
    return this;
  }

   /**
   * Collection of result reasons which test result have
   * @return resultReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of result reasons which test result have")

  public List<AutotestResultReasonSubGetModel> getResultReasons() {
    return resultReasons;
  }


  public void setResultReasons(List<AutotestResultReasonSubGetModel> resultReasons) {
    this.resultReasons = resultReasons;
  }


  public TestResultShortGetModel comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment to test result
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment to test result")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TestResultShortGetModel date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date when test result has been set
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when test result has been set")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public TestResultShortGetModel duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Time which it took to run the test
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time which it took to run the test")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public TestResultShortGetModel links(List<LinkSubGetModel> links) {
    
    this.links = links;
    return this;
  }

  public TestResultShortGetModel addLinksItem(LinkSubGetModel linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links attached to test result
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of links attached to test result")

  public List<LinkSubGetModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkSubGetModel> links) {
    this.links = links;
  }


  public TestResultShortGetModel attachments(List<AttachmentSubGetModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public TestResultShortGetModel addAttachmentsItem(AttachmentSubGetModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Collection of files attached to test result
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of files attached to test result")

  public List<AttachmentSubGetModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentSubGetModel> attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultShortGetModel testResultShortGetModel = (TestResultShortGetModel) o;
    return Objects.equals(this.id, testResultShortGetModel.id) &&
        Objects.equals(this.name, testResultShortGetModel.name) &&
        Objects.equals(this.autotestGlobalId, testResultShortGetModel.autotestGlobalId) &&
        Objects.equals(this.testRunId, testResultShortGetModel.testRunId) &&
        Objects.equals(this.configurationId, testResultShortGetModel.configurationId) &&
        Objects.equals(this.configurationName, testResultShortGetModel.configurationName) &&
        Objects.equals(this.outcome, testResultShortGetModel.outcome) &&
        Objects.equals(this.resultReasons, testResultShortGetModel.resultReasons) &&
        Objects.equals(this.comment, testResultShortGetModel.comment) &&
        Objects.equals(this.date, testResultShortGetModel.date) &&
        Objects.equals(this.duration, testResultShortGetModel.duration) &&
        Objects.equals(this.links, testResultShortGetModel.links) &&
        Objects.equals(this.attachments, testResultShortGetModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, autotestGlobalId, testRunId, configurationId, configurationName, outcome, resultReasons, comment, date, duration, links, attachments);
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
    sb.append("class TestResultShortGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autotestGlobalId: ").append(toIndentedString(autotestGlobalId)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    resultReasons: ").append(toIndentedString(resultReasons)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("resultReasons");
    openapiFields.add("comment");
    openapiFields.add("date");
    openapiFields.add("duration");
    openapiFields.add("links");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestResultShortGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestResultShortGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultShortGetModel is not found in the empty JSON string", TestResultShortGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestResultShortGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultShortGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("testRunId") != null && !jsonObj.get("testRunId").isJsonNull()) && !jsonObj.get("testRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunId").toString()));
      }
      if ((jsonObj.get("configurationId") != null && !jsonObj.get("configurationId").isJsonNull()) && !jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if ((jsonObj.get("configurationName") != null && !jsonObj.get("configurationName").isJsonNull()) && !jsonObj.get("configurationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationName").toString()));
      }
      if (jsonObj.get("resultReasons") != null && !jsonObj.get("resultReasons").isJsonNull()) {
        JsonArray jsonArrayresultReasons = jsonObj.getAsJsonArray("resultReasons");
        if (jsonArrayresultReasons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resultReasons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resultReasons` to be an array in the JSON string but got `%s`", jsonObj.get("resultReasons").toString()));
          }

          // validate the optional field `resultReasons` (array)
          for (int i = 0; i < jsonArrayresultReasons.size(); i++) {
            AutotestResultReasonSubGetModel.validateJsonObject(jsonArrayresultReasons.get(i).getAsJsonObject());
          };
        }
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
            LinkSubGetModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
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
            AttachmentSubGetModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestResultShortGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultShortGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultShortGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultShortGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultShortGetModel>() {
           @Override
           public void write(JsonWriter out, TestResultShortGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultShortGetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultShortGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultShortGetModel
  * @throws IOException if the JSON string is invalid with respect to TestResultShortGetModel
  */
  public static TestResultShortGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultShortGetModel.class);
  }

 /**
  * Convert an instance of TestResultShortGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

