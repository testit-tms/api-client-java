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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.TestPlanChangedFieldsViewModel;

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
 * TestPlanChangeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestPlanChangeModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_TEST_PLAN_CHANGED_FIELDS = "testPlanChangedFields";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_CHANGED_FIELDS)
  private TestPlanChangedFieldsViewModel testPlanChangedFields;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public TestPlanChangeModel() {
  }

  public TestPlanChangeModel id(UUID id) {
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


  public TestPlanChangeModel testPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
    return this;
  }

  /**
   * Get testPlanId
   * @return testPlanId
   */
  @javax.annotation.Nonnull
  public UUID getTestPlanId() {
    return testPlanId;
  }

  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestPlanChangeModel testPlanChangedFields(TestPlanChangedFieldsViewModel testPlanChangedFields) {
    this.testPlanChangedFields = testPlanChangedFields;
    return this;
  }

  /**
   * Get testPlanChangedFields
   * @return testPlanChangedFields
   */
  @javax.annotation.Nonnull
  public TestPlanChangedFieldsViewModel getTestPlanChangedFields() {
    return testPlanChangedFields;
  }

  public void setTestPlanChangedFields(TestPlanChangedFieldsViewModel testPlanChangedFields) {
    this.testPlanChangedFields = testPlanChangedFields;
  }


  public TestPlanChangeModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * Get createdById
   * @return createdById
   */
  @javax.annotation.Nonnull
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestPlanChangeModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanChangeModel testPlanChangeModel = (TestPlanChangeModel) o;
    return Objects.equals(this.id, testPlanChangeModel.id) &&
        Objects.equals(this.testPlanId, testPlanChangeModel.testPlanId) &&
        Objects.equals(this.testPlanChangedFields, testPlanChangeModel.testPlanChangedFields) &&
        Objects.equals(this.createdById, testPlanChangeModel.createdById) &&
        Objects.equals(this.createdDate, testPlanChangeModel.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, testPlanId, testPlanChangedFields, createdById, createdDate);
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
    sb.append("class TestPlanChangeModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testPlanChangedFields: ").append(toIndentedString(testPlanChangedFields)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
    openapiFields.add("testPlanId");
    openapiFields.add("testPlanChangedFields");
    openapiFields.add("createdById");
    openapiFields.add("createdDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("testPlanId");
    openapiRequiredFields.add("testPlanChangedFields");
    openapiRequiredFields.add("createdById");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestPlanChangeModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestPlanChangeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanChangeModel is not found in the empty JSON string", TestPlanChangeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestPlanChangeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanChangeModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestPlanChangeModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      // validate the required field `testPlanChangedFields`
      TestPlanChangedFieldsViewModel.validateJsonElement(jsonObj.get("testPlanChangedFields"));
      if (!jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPlanChangeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanChangeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanChangeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanChangeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanChangeModel>() {
           @Override
           public void write(JsonWriter out, TestPlanChangeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanChangeModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestPlanChangeModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestPlanChangeModel
   * @throws IOException if the JSON string is invalid with respect to TestPlanChangeModel
   */
  public static TestPlanChangeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanChangeModel.class);
  }

  /**
   * Convert an instance of TestPlanChangeModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

