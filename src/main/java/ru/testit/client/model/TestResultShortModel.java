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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.AutoTestShortModel;
import ru.testit.client.model.TestPointPutModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestResultShortModel
 */
@JsonPropertyOrder({
  TestResultShortModel.JSON_PROPERTY_ID,
  TestResultShortModel.JSON_PROPERTY_OUTCOME,
  TestResultShortModel.JSON_PROPERTY_TRACES,
  TestResultShortModel.JSON_PROPERTY_FAILURE_TYPE,
  TestResultShortModel.JSON_PROPERTY_MESSAGE,
  TestResultShortModel.JSON_PROPERTY_TEST_POINT,
  TestResultShortModel.JSON_PROPERTY_CREATED_DATE,
  TestResultShortModel.JSON_PROPERTY_AUTO_TEST,
  TestResultShortModel.JSON_PROPERTY_ATTACHMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultShortModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private JsonNullable<String> outcome = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRACES = "traces";
  private JsonNullable<String> traces = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FAILURE_TYPE = "failureType";
  private JsonNullable<String> failureType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TEST_POINT = "testPoint";
  private TestPointPutModel testPoint;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_AUTO_TEST = "autoTest";
  private AutoTestShortModel autoTest;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<List<AttachmentModel>> attachments = JsonNullable.<List<AttachmentModel>>undefined();

  public TestResultShortModel() { 
  }

  public TestResultShortModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TestResultShortModel outcome(String outcome) {
    this.outcome = JsonNullable.<String>of(outcome);
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOutcome() {
        return outcome.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOutcome_JsonNullable() {
    return outcome;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  public void setOutcome_JsonNullable(JsonNullable<String> outcome) {
    this.outcome = outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = JsonNullable.<String>of(outcome);
  }


  public TestResultShortModel traces(String traces) {
    this.traces = JsonNullable.<String>of(traces);
    return this;
  }

   /**
   * Get traces
   * @return traces
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTraces() {
        return traces.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTraces_JsonNullable() {
    return traces;
  }
  
  @JsonProperty(JSON_PROPERTY_TRACES)
  public void setTraces_JsonNullable(JsonNullable<String> traces) {
    this.traces = traces;
  }

  public void setTraces(String traces) {
    this.traces = JsonNullable.<String>of(traces);
  }


  public TestResultShortModel failureType(String failureType) {
    this.failureType = JsonNullable.<String>of(failureType);
    return this;
  }

   /**
   * Get failureType
   * @return failureType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFailureType() {
        return failureType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAILURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFailureType_JsonNullable() {
    return failureType;
  }
  
  @JsonProperty(JSON_PROPERTY_FAILURE_TYPE)
  public void setFailureType_JsonNullable(JsonNullable<String> failureType) {
    this.failureType = failureType;
  }

  public void setFailureType(String failureType) {
    this.failureType = JsonNullable.<String>of(failureType);
  }


  public TestResultShortModel message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }


  public TestResultShortModel testPoint(TestPointPutModel testPoint) {
    this.testPoint = testPoint;
    return this;
  }

   /**
   * Get testPoint
   * @return testPoint
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPointPutModel getTestPoint() {
    return testPoint;
  }


  @JsonProperty(JSON_PROPERTY_TEST_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPoint(TestPointPutModel testPoint) {
    this.testPoint = testPoint;
  }


  public TestResultShortModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
  }


  public TestResultShortModel autoTest(AutoTestShortModel autoTest) {
    this.autoTest = autoTest;
    return this;
  }

   /**
   * Get autoTest
   * @return autoTest
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutoTestShortModel getAutoTest() {
    return autoTest;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTest(AutoTestShortModel autoTest) {
    this.autoTest = autoTest;
  }


  public TestResultShortModel attachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
    return this;
  }

  public TestResultShortModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null || !this.attachments.isPresent()) {
      this.attachments = JsonNullable.<List<AttachmentModel>>of(new ArrayList<>());
    }
    try {
      this.attachments.get().add(attachmentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AttachmentModel> getAttachments() {
        return attachments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AttachmentModel>> getAttachments_JsonNullable() {
    return attachments;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  public void setAttachments_JsonNullable(JsonNullable<List<AttachmentModel>> attachments) {
    this.attachments = attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
  }


  /**
   * Return true if this TestResultShortModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultShortModel testResultShortModel = (TestResultShortModel) o;
    return Objects.equals(this.id, testResultShortModel.id) &&
        equalsNullable(this.outcome, testResultShortModel.outcome) &&
        equalsNullable(this.traces, testResultShortModel.traces) &&
        equalsNullable(this.failureType, testResultShortModel.failureType) &&
        equalsNullable(this.message, testResultShortModel.message) &&
        Objects.equals(this.testPoint, testResultShortModel.testPoint) &&
        equalsNullable(this.createdDate, testResultShortModel.createdDate) &&
        Objects.equals(this.autoTest, testResultShortModel.autoTest) &&
        equalsNullable(this.attachments, testResultShortModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(outcome), hashCodeNullable(traces), hashCodeNullable(failureType), hashCodeNullable(message), testPoint, hashCodeNullable(createdDate), autoTest, hashCodeNullable(attachments));
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
    sb.append("class TestResultShortModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    failureType: ").append(toIndentedString(failureType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    testPoint: ").append(toIndentedString(testPoint)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    autoTest: ").append(toIndentedString(autoTest)).append("\n");
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

}

