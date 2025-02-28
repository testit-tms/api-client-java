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
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentApiResult;
import ru.testit.client.model.AvailableTestResultOutcome;

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
 * AutoTestStepResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AutoTestStepResult {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_STARTED_ON = "startedOn";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private OffsetDateTime startedOn;

  public static final String SERIALIZED_NAME_COMPLETED_ON = "completedOn";
  @SerializedName(SERIALIZED_NAME_COMPLETED_ON)
  private OffsetDateTime completedOn;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private AvailableTestResultOutcome outcome;

  public static final String SERIALIZED_NAME_STEP_RESULTS = "stepResults";
  @SerializedName(SERIALIZED_NAME_STEP_RESULTS)
  private List<AutoTestStepResult> stepResults;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentApiResult> attachments;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters;

  public AutoTestStepResult() {
  }

  public AutoTestStepResult title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The name of the step.
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public AutoTestStepResult description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the step result.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AutoTestStepResult info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Extended description of the step result.
   * @return info
   */
  @javax.annotation.Nullable
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }


  public AutoTestStepResult startedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
    return this;
  }

  /**
   * Step start date.
   * @return startedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = startedOn;
  }


  public AutoTestStepResult completedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
    return this;
  }

  /**
   * Step end date.
   * @return completedOn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = completedOn;
  }


  public AutoTestStepResult duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Expected or actual duration of the test run execution in milliseconds.
   * minimum: 0
   * maximum: 43200000000
   * @return duration
   */
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public AutoTestStepResult outcome(AvailableTestResultOutcome outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Specifies the result of the autotest execution.
   * @return outcome
   */
  @javax.annotation.Nullable
  public AvailableTestResultOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(AvailableTestResultOutcome outcome) {
    this.outcome = outcome;
  }


  public AutoTestStepResult stepResults(List<AutoTestStepResult> stepResults) {
    this.stepResults = stepResults;
    return this;
  }

  public AutoTestStepResult addStepResultsItem(AutoTestStepResult stepResultsItem) {
    if (this.stepResults == null) {
      this.stepResults = new ArrayList<>();
    }
    this.stepResults.add(stepResultsItem);
    return this;
  }

  /**
   * Nested step results. The maximum nesting level is 15.
   * @return stepResults
   */
  @javax.annotation.Nullable
  public List<AutoTestStepResult> getStepResults() {
    return stepResults;
  }

  public void setStepResults(List<AutoTestStepResult> stepResults) {
    this.stepResults = stepResults;
  }


  public AutoTestStepResult attachments(List<AttachmentApiResult> attachments) {
    this.attachments = attachments;
    return this;
  }

  public AutoTestStepResult addAttachmentsItem(AttachmentApiResult attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * /// &lt;summary&gt;  Specifies an attachment GUID. Multiple values can be sent.  &lt;/summary&gt;
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<AttachmentApiResult> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentApiResult> attachments) {
    this.attachments = attachments;
  }


  public AutoTestStepResult parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AutoTestStepResult putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * \&quot;&lt;b&gt;parameter&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom parameters. Multiple parameters can be sent.
   * @return parameters
   */
  @javax.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestStepResult autoTestStepResult = (AutoTestStepResult) o;
    return Objects.equals(this.title, autoTestStepResult.title) &&
        Objects.equals(this.description, autoTestStepResult.description) &&
        Objects.equals(this.info, autoTestStepResult.info) &&
        Objects.equals(this.startedOn, autoTestStepResult.startedOn) &&
        Objects.equals(this.completedOn, autoTestStepResult.completedOn) &&
        Objects.equals(this.duration, autoTestStepResult.duration) &&
        Objects.equals(this.outcome, autoTestStepResult.outcome) &&
        Objects.equals(this.stepResults, autoTestStepResult.stepResults) &&
        Objects.equals(this.attachments, autoTestStepResult.attachments) &&
        Objects.equals(this.parameters, autoTestStepResult.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, info, startedOn, completedOn, duration, outcome, stepResults, attachments, parameters);
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
    sb.append("class AutoTestStepResult {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    stepResults: ").append(toIndentedString(stepResults)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("info");
    openapiFields.add("startedOn");
    openapiFields.add("completedOn");
    openapiFields.add("duration");
    openapiFields.add("outcome");
    openapiFields.add("stepResults");
    openapiFields.add("attachments");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AutoTestStepResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutoTestStepResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestStepResult is not found in the empty JSON string", AutoTestStepResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutoTestStepResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestStepResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull()) && !jsonObj.get("info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("info").toString()));
      }
      // validate the optional field `outcome`
      if (jsonObj.get("outcome") != null && !jsonObj.get("outcome").isJsonNull()) {
        AvailableTestResultOutcome.validateJsonElement(jsonObj.get("outcome"));
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
            AutoTestStepResult.validateJsonElement(jsonArraystepResults.get(i));
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
            AttachmentApiResult.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTestStepResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestStepResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestStepResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestStepResult.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestStepResult>() {
           @Override
           public void write(JsonWriter out, AutoTestStepResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestStepResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AutoTestStepResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AutoTestStepResult
   * @throws IOException if the JSON string is invalid with respect to AutoTestStepResult
   */
  public static AutoTestStepResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestStepResult.class);
  }

  /**
   * Convert an instance of AutoTestStepResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

