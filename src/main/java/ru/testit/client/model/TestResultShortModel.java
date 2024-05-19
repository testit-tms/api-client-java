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
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.AutoTestShortModel;
import ru.testit.client.model.TestPointPutModel;

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
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * TestResultShortModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultShortModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;

  public static final String SERIALIZED_NAME_TRACES = "traces";
  @SerializedName(SERIALIZED_NAME_TRACES)
  private String traces;

  public static final String SERIALIZED_NAME_FAILURE_TYPE = "failureType";
  @SerializedName(SERIALIZED_NAME_FAILURE_TYPE)
  private String failureType;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TEST_POINT = "testPoint";
  @SerializedName(SERIALIZED_NAME_TEST_POINT)
  private TestPointPutModel testPoint;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_AUTO_TEST = "autoTest";
  @SerializedName(SERIALIZED_NAME_AUTO_TEST)
  private AutoTestShortModel autoTest;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentModel> attachments;

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
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public TestResultShortModel outcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

   /**
   * Get outcome
   * @return outcome
  **/
  @javax.annotation.Nonnull
  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public TestResultShortModel traces(String traces) {
    this.traces = traces;
    return this;
  }

   /**
   * Get traces
   * @return traces
  **/
  @javax.annotation.Nullable
  public String getTraces() {
    return traces;
  }

  public void setTraces(String traces) {
    this.traces = traces;
  }


  public TestResultShortModel failureType(String failureType) {
    this.failureType = failureType;
    return this;
  }

   /**
   * Get failureType
   * @return failureType
  **/
  @javax.annotation.Nonnull
  public String getFailureType() {
    return failureType;
  }

  public void setFailureType(String failureType) {
    this.failureType = failureType;
  }


  public TestResultShortModel message(String message) {
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


  public TestResultShortModel testPoint(TestPointPutModel testPoint) {
    this.testPoint = testPoint;
    return this;
  }

   /**
   * Get testPoint
   * @return testPoint
  **/
  @javax.annotation.Nullable
  public TestPointPutModel getTestPoint() {
    return testPoint;
  }

  public void setTestPoint(TestPointPutModel testPoint) {
    this.testPoint = testPoint;
  }


  public TestResultShortModel createdDate(OffsetDateTime createdDate) {
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


  public TestResultShortModel autoTest(AutoTestShortModel autoTest) {
    this.autoTest = autoTest;
    return this;
  }

   /**
   * Get autoTest
   * @return autoTest
  **/
  @javax.annotation.Nullable
  public AutoTestShortModel getAutoTest() {
    return autoTest;
  }

  public void setAutoTest(AutoTestShortModel autoTest) {
    this.autoTest = autoTest;
  }


  public TestResultShortModel attachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
    return this;
  }

  public TestResultShortModel addAttachmentsItem(AttachmentModel attachmentsItem) {
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
  public List<AttachmentModel> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
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
    TestResultShortModel testResultShortModel = (TestResultShortModel) o;
    return Objects.equals(this.id, testResultShortModel.id) &&
        Objects.equals(this.outcome, testResultShortModel.outcome) &&
        Objects.equals(this.traces, testResultShortModel.traces) &&
        Objects.equals(this.failureType, testResultShortModel.failureType) &&
        Objects.equals(this.message, testResultShortModel.message) &&
        Objects.equals(this.testPoint, testResultShortModel.testPoint) &&
        Objects.equals(this.createdDate, testResultShortModel.createdDate) &&
        Objects.equals(this.autoTest, testResultShortModel.autoTest) &&
        Objects.equals(this.attachments, testResultShortModel.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outcome, traces, failureType, message, testPoint, createdDate, autoTest, attachments);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("outcome");
    openapiFields.add("traces");
    openapiFields.add("failureType");
    openapiFields.add("message");
    openapiFields.add("testPoint");
    openapiFields.add("createdDate");
    openapiFields.add("autoTest");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("outcome");
    openapiRequiredFields.add("failureType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestResultShortModel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestResultShortModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestResultShortModel is not found in the empty JSON string", TestResultShortModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestResultShortModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestResultShortModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestResultShortModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("outcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcome").toString()));
      }
      if ((jsonObj.get("traces") != null && !jsonObj.get("traces").isJsonNull()) && !jsonObj.get("traces").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traces` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traces").toString()));
      }
      if (!jsonObj.get("failureType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failureType").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `testPoint`
      if (jsonObj.get("testPoint") != null && !jsonObj.get("testPoint").isJsonNull()) {
        TestPointPutModel.validateJsonElement(jsonObj.get("testPoint"));
      }
      // validate the optional field `autoTest`
      if (jsonObj.get("autoTest") != null && !jsonObj.get("autoTest").isJsonNull()) {
        AutoTestShortModel.validateJsonElement(jsonObj.get("autoTest"));
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
       if (!TestResultShortModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestResultShortModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestResultShortModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestResultShortModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestResultShortModel>() {
           @Override
           public void write(JsonWriter out, TestResultShortModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestResultShortModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestResultShortModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestResultShortModel
  * @throws IOException if the JSON string is invalid with respect to TestResultShortModel
  */
  public static TestResultShortModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestResultShortModel.class);
  }

 /**
  * Convert an instance of TestResultShortModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

