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
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentPutModel;
import ru.testit.client.model.AttachmentPutModelAutoTestStepResultsModel;
import ru.testit.client.model.LinkModel;
import ru.testit.client.model.StepResultModel;
import ru.testit.client.model.TestResultOutcome;
import ru.testit.client.model.TestResultStepCommentPutModel;

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
 * ApiV2TestResultsIdPutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2TestResultsIdPutRequest {
  public static final String SERIALIZED_NAME_FAILURE_CLASS_IDS = "failureClassIds";
  @SerializedName(SERIALIZED_NAME_FAILURE_CLASS_IDS)
  private List<UUID> failureClassIds;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private TestResultOutcome outcome;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkModel> links;

  public static final String SERIALIZED_NAME_STEP_RESULTS = "stepResults";
  @SerializedName(SERIALIZED_NAME_STEP_RESULTS)
  private List<StepResultModel> stepResults;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentPutModel> attachments;

  public static final String SERIALIZED_NAME_DURATION_IN_MS = "durationInMs";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_DURATION_IN_MS)
  private Long durationInMs;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_STEP_COMMENTS = "stepComments";
  @SerializedName(SERIALIZED_NAME_STEP_COMMENTS)
  private List<TestResultStepCommentPutModel> stepComments;

  public static final String SERIALIZED_NAME_SETUP_RESULTS = "setupResults";
  @SerializedName(SERIALIZED_NAME_SETUP_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> setupResults;

  public static final String SERIALIZED_NAME_TEARDOWN_RESULTS = "teardownResults";
  @SerializedName(SERIALIZED_NAME_TEARDOWN_RESULTS)
  private List<AttachmentPutModelAutoTestStepResultsModel> teardownResults;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TRACE = "trace";
  @SerializedName(SERIALIZED_NAME_TRACE)
  private String trace;

  public ApiV2TestResultsIdPutRequest() {
  }

  public ApiV2TestResultsIdPutRequest failureClassIds(List<UUID> failureClassIds) {
    
    this.failureClassIds = failureClassIds;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addFailureClassIdsItem(UUID failureClassIdsItem) {
    if (this.failureClassIds == null) {
      this.failureClassIds = new ArrayList<>();
    }
    this.failureClassIds.add(failureClassIdsItem);
    return this;
  }

   /**
   * Get failureClassIds
   * @return failureClassIds
  **/
  @javax.annotation.Nullable
  public List<UUID> getFailureClassIds() {
    return failureClassIds;
  }


  public void setFailureClassIds(List<UUID> failureClassIds) {
    this.failureClassIds = failureClassIds;
  }


  public ApiV2TestResultsIdPutRequest outcome(TestResultOutcome outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nullable
  public TestResultOutcome getOutcome() {
    return outcome;
  }


  public void setOutcome(TestResultOutcome outcome) {
    this.outcome = outcome;
  }


  public ApiV2TestResultsIdPutRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public ApiV2TestResultsIdPutRequest links(List<LinkModel> links) {
    
    this.links = links;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addLinksItem(LinkModel linksItem) {
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


  public ApiV2TestResultsIdPutRequest stepResults(List<StepResultModel> stepResults) {
    
    this.stepResults = stepResults;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addStepResultsItem(StepResultModel stepResultsItem) {
    if (this.stepResults == null) {
      this.stepResults = new ArrayList<>();
    }
    this.stepResults.add(stepResultsItem);
    return this;
  }

   /**
   * Get stepResults
   * @return stepResults
  **/
  @javax.annotation.Nullable
  public List<StepResultModel> getStepResults() {
    return stepResults;
  }


  public void setStepResults(List<StepResultModel> stepResults) {
    this.stepResults = stepResults;
  }


  public ApiV2TestResultsIdPutRequest attachments(List<AttachmentPutModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addAttachmentsItem(AttachmentPutModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<AttachmentPutModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentPutModel> attachments) {
    this.attachments = attachments;
  }


  @Deprecated
  public ApiV2TestResultsIdPutRequest durationInMs(Long durationInMs) {
    
    this.durationInMs = durationInMs;
    return this;
  }

   /**
   * Get durationInMs
   * minimum: 0
   * @return durationInMs
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public Long getDurationInMs() {
    return durationInMs;
  }


  @Deprecated
  public void setDurationInMs(Long durationInMs) {
    this.durationInMs = durationInMs;
  }


  public ApiV2TestResultsIdPutRequest duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ApiV2TestResultsIdPutRequest stepComments(List<TestResultStepCommentPutModel> stepComments) {
    
    this.stepComments = stepComments;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addStepCommentsItem(TestResultStepCommentPutModel stepCommentsItem) {
    if (this.stepComments == null) {
      this.stepComments = new ArrayList<>();
    }
    this.stepComments.add(stepCommentsItem);
    return this;
  }

   /**
   * Get stepComments
   * @return stepComments
  **/
  @javax.annotation.Nullable
  public List<TestResultStepCommentPutModel> getStepComments() {
    return stepComments;
  }


  public void setStepComments(List<TestResultStepCommentPutModel> stepComments) {
    this.stepComments = stepComments;
  }


  public ApiV2TestResultsIdPutRequest setupResults(List<AttachmentPutModelAutoTestStepResultsModel> setupResults) {
    
    this.setupResults = setupResults;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addSetupResultsItem(AttachmentPutModelAutoTestStepResultsModel setupResultsItem) {
    if (this.setupResults == null) {
      this.setupResults = new ArrayList<>();
    }
    this.setupResults.add(setupResultsItem);
    return this;
  }

   /**
   * Get setupResults
   * @return setupResults
  **/
  @javax.annotation.Nullable
  public List<AttachmentPutModelAutoTestStepResultsModel> getSetupResults() {
    return setupResults;
  }


  public void setSetupResults(List<AttachmentPutModelAutoTestStepResultsModel> setupResults) {
    this.setupResults = setupResults;
  }


  public ApiV2TestResultsIdPutRequest teardownResults(List<AttachmentPutModelAutoTestStepResultsModel> teardownResults) {
    
    this.teardownResults = teardownResults;
    return this;
  }

  public ApiV2TestResultsIdPutRequest addTeardownResultsItem(AttachmentPutModelAutoTestStepResultsModel teardownResultsItem) {
    if (this.teardownResults == null) {
      this.teardownResults = new ArrayList<>();
    }
    this.teardownResults.add(teardownResultsItem);
    return this;
  }

   /**
   * Get teardownResults
   * @return teardownResults
  **/
  @javax.annotation.Nullable
  public List<AttachmentPutModelAutoTestStepResultsModel> getTeardownResults() {
    return teardownResults;
  }


  public void setTeardownResults(List<AttachmentPutModelAutoTestStepResultsModel> teardownResults) {
    this.teardownResults = teardownResults;
  }


  public ApiV2TestResultsIdPutRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ApiV2TestResultsIdPutRequest trace(String trace) {
    
    this.trace = trace;
    return this;
  }

   /**
   * Get trace
   * @return trace
  **/
  @javax.annotation.Nullable
  public String getTrace() {
    return trace;
  }


  public void setTrace(String trace) {
    this.trace = trace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2TestResultsIdPutRequest apiV2TestResultsIdPutRequest = (ApiV2TestResultsIdPutRequest) o;
    return Objects.equals(this.failureClassIds, apiV2TestResultsIdPutRequest.failureClassIds) &&
        Objects.equals(this.outcome, apiV2TestResultsIdPutRequest.outcome) &&
        Objects.equals(this.comment, apiV2TestResultsIdPutRequest.comment) &&
        Objects.equals(this.links, apiV2TestResultsIdPutRequest.links) &&
        Objects.equals(this.stepResults, apiV2TestResultsIdPutRequest.stepResults) &&
        Objects.equals(this.attachments, apiV2TestResultsIdPutRequest.attachments) &&
        Objects.equals(this.durationInMs, apiV2TestResultsIdPutRequest.durationInMs) &&
        Objects.equals(this.duration, apiV2TestResultsIdPutRequest.duration) &&
        Objects.equals(this.stepComments, apiV2TestResultsIdPutRequest.stepComments) &&
        Objects.equals(this.setupResults, apiV2TestResultsIdPutRequest.setupResults) &&
        Objects.equals(this.teardownResults, apiV2TestResultsIdPutRequest.teardownResults) &&
        Objects.equals(this.message, apiV2TestResultsIdPutRequest.message) &&
        Objects.equals(this.trace, apiV2TestResultsIdPutRequest.trace);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureClassIds, outcome, comment, links, stepResults, attachments, durationInMs, duration, stepComments, setupResults, teardownResults, message, trace);
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
    sb.append("class ApiV2TestResultsIdPutRequest {\n");
    sb.append("    failureClassIds: ").append(toIndentedString(failureClassIds)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    stepResults: ").append(toIndentedString(stepResults)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    durationInMs: ").append(toIndentedString(durationInMs)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    stepComments: ").append(toIndentedString(stepComments)).append("\n");
    sb.append("    setupResults: ").append(toIndentedString(setupResults)).append("\n");
    sb.append("    teardownResults: ").append(toIndentedString(teardownResults)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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
    openapiFields.add("failureClassIds");
    openapiFields.add("outcome");
    openapiFields.add("comment");
    openapiFields.add("links");
    openapiFields.add("stepResults");
    openapiFields.add("attachments");
    openapiFields.add("durationInMs");
    openapiFields.add("duration");
    openapiFields.add("stepComments");
    openapiFields.add("setupResults");
    openapiFields.add("teardownResults");
    openapiFields.add("message");
    openapiFields.add("trace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2TestResultsIdPutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2TestResultsIdPutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2TestResultsIdPutRequest is not found in the empty JSON string", ApiV2TestResultsIdPutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2TestResultsIdPutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2TestResultsIdPutRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("failureClassIds") != null && !jsonObj.get("failureClassIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureClassIds` to be an array in the JSON string but got `%s`", jsonObj.get("failureClassIds").toString()));
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
            LinkModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("stepResults") != null && !jsonObj.get("stepResults").isJsonNull()) {
        JsonArray jsonArraystepResults = jsonObj.getAsJsonArray("stepResults");
        if (jsonArraystepResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stepResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stepResults` to be an array in the JSON string but got `%s`", jsonObj.get("stepResults").toString()));
          }

          // validate the optional field `stepResults` (array)
          for (int i = 0; i < jsonArraystepResults.size(); i++) {
            StepResultModel.validateJsonObject(jsonArraystepResults.get(i).getAsJsonObject());
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
            AttachmentPutModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("stepComments") != null && !jsonObj.get("stepComments").isJsonNull()) {
        JsonArray jsonArraystepComments = jsonObj.getAsJsonArray("stepComments");
        if (jsonArraystepComments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stepComments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stepComments` to be an array in the JSON string but got `%s`", jsonObj.get("stepComments").toString()));
          }

          // validate the optional field `stepComments` (array)
          for (int i = 0; i < jsonArraystepComments.size(); i++) {
            TestResultStepCommentPutModel.validateJsonObject(jsonArraystepComments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("setupResults") != null && !jsonObj.get("setupResults").isJsonNull()) {
        JsonArray jsonArraysetupResults = jsonObj.getAsJsonArray("setupResults");
        if (jsonArraysetupResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("setupResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `setupResults` to be an array in the JSON string but got `%s`", jsonObj.get("setupResults").toString()));
          }

          // validate the optional field `setupResults` (array)
          for (int i = 0; i < jsonArraysetupResults.size(); i++) {
            AttachmentPutModelAutoTestStepResultsModel.validateJsonObject(jsonArraysetupResults.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("teardownResults") != null && !jsonObj.get("teardownResults").isJsonNull()) {
        JsonArray jsonArrayteardownResults = jsonObj.getAsJsonArray("teardownResults");
        if (jsonArrayteardownResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teardownResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teardownResults` to be an array in the JSON string but got `%s`", jsonObj.get("teardownResults").toString()));
          }

          // validate the optional field `teardownResults` (array)
          for (int i = 0; i < jsonArrayteardownResults.size(); i++) {
            AttachmentPutModelAutoTestStepResultsModel.validateJsonObject(jsonArrayteardownResults.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("trace") != null && !jsonObj.get("trace").isJsonNull()) && !jsonObj.get("trace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2TestResultsIdPutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2TestResultsIdPutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2TestResultsIdPutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2TestResultsIdPutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2TestResultsIdPutRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2TestResultsIdPutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2TestResultsIdPutRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2TestResultsIdPutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2TestResultsIdPutRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2TestResultsIdPutRequest
  */
  public static ApiV2TestResultsIdPutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2TestResultsIdPutRequest.class);
  }

 /**
  * Convert an instance of ApiV2TestResultsIdPutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

