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
import ru.testit.client.model.TestSuiteType;

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
 * TestSuiteV2TreeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestSuiteV2TreeModel {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<TestSuiteV2TreeModel> children;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REFRESH_DATE = "refreshDate";
  @SerializedName(SERIALIZED_NAME_REFRESH_DATE)
  private OffsetDateTime refreshDate;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TestSuiteType type;

  public static final String SERIALIZED_NAME_SAVE_STRUCTURE = "saveStructure";
  @SerializedName(SERIALIZED_NAME_SAVE_STRUCTURE)
  private Boolean saveStructure;

  public static final String SERIALIZED_NAME_AUTO_REFRESH = "autoRefresh";
  @SerializedName(SERIALIZED_NAME_AUTO_REFRESH)
  private Boolean autoRefresh;

  public TestSuiteV2TreeModel() {
  }

  @Deprecated
  public TestSuiteV2TreeModel children(List<TestSuiteV2TreeModel> children) {
    this.children = children;
    return this;
  }

  public TestSuiteV2TreeModel addChildrenItem(TestSuiteV2TreeModel childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * nested enumeration of children is allowed
   * @return children
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public List<TestSuiteV2TreeModel> getChildren() {
    return children;
  }

  @Deprecated
  public void setChildren(List<TestSuiteV2TreeModel> children) {
    this.children = children;
  }


  public TestSuiteV2TreeModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the test suite
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public TestSuiteV2TreeModel refreshDate(OffsetDateTime refreshDate) {
    this.refreshDate = refreshDate;
    return this;
  }

  /**
   * Date of the last refresh of the test suite
   * @return refreshDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRefreshDate() {
    return refreshDate;
  }

  public void setRefreshDate(OffsetDateTime refreshDate) {
    this.refreshDate = refreshDate;
  }


  public TestSuiteV2TreeModel parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique ID of the parent test suite in hierarchy
   * @return parentId
   */
  @javax.annotation.Nullable
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public TestSuiteV2TreeModel testPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
    return this;
  }

  /**
   * Unique ID of test plan to which the test suite belongs
   * @return testPlanId
   */
  @javax.annotation.Nonnull
  public UUID getTestPlanId() {
    return testPlanId;
  }

  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestSuiteV2TreeModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the test suite
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TestSuiteV2TreeModel type(TestSuiteType type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the test suite
   * @return type
   */
  @javax.annotation.Nullable
  public TestSuiteType getType() {
    return type;
  }

  public void setType(TestSuiteType type) {
    this.type = type;
  }


  public TestSuiteV2TreeModel saveStructure(Boolean saveStructure) {
    this.saveStructure = saveStructure;
    return this;
  }

  /**
   * Indicates if the test suite retains section tree structure
   * @return saveStructure
   */
  @javax.annotation.Nullable
  public Boolean getSaveStructure() {
    return saveStructure;
  }

  public void setSaveStructure(Boolean saveStructure) {
    this.saveStructure = saveStructure;
  }


  public TestSuiteV2TreeModel autoRefresh(Boolean autoRefresh) {
    this.autoRefresh = autoRefresh;
    return this;
  }

  /**
   * Indicates if scheduled auto refresh is enabled for the test suite
   * @return autoRefresh
   */
  @javax.annotation.Nullable
  public Boolean getAutoRefresh() {
    return autoRefresh;
  }

  public void setAutoRefresh(Boolean autoRefresh) {
    this.autoRefresh = autoRefresh;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteV2TreeModel testSuiteV2TreeModel = (TestSuiteV2TreeModel) o;
    return Objects.equals(this.children, testSuiteV2TreeModel.children) &&
        Objects.equals(this.id, testSuiteV2TreeModel.id) &&
        Objects.equals(this.refreshDate, testSuiteV2TreeModel.refreshDate) &&
        Objects.equals(this.parentId, testSuiteV2TreeModel.parentId) &&
        Objects.equals(this.testPlanId, testSuiteV2TreeModel.testPlanId) &&
        Objects.equals(this.name, testSuiteV2TreeModel.name) &&
        Objects.equals(this.type, testSuiteV2TreeModel.type) &&
        Objects.equals(this.saveStructure, testSuiteV2TreeModel.saveStructure) &&
        Objects.equals(this.autoRefresh, testSuiteV2TreeModel.autoRefresh);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, id, refreshDate, parentId, testPlanId, name, type, saveStructure, autoRefresh);
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
    sb.append("class TestSuiteV2TreeModel {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refreshDate: ").append(toIndentedString(refreshDate)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    saveStructure: ").append(toIndentedString(saveStructure)).append("\n");
    sb.append("    autoRefresh: ").append(toIndentedString(autoRefresh)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("id");
    openapiFields.add("refreshDate");
    openapiFields.add("parentId");
    openapiFields.add("testPlanId");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("saveStructure");
    openapiFields.add("autoRefresh");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("testPlanId");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestSuiteV2TreeModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestSuiteV2TreeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestSuiteV2TreeModel is not found in the empty JSON string", TestSuiteV2TreeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestSuiteV2TreeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestSuiteV2TreeModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestSuiteV2TreeModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull()) {
        JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
        if (jsonArraychildren != null) {
          // ensure the json data is an array
          if (!jsonObj.get("children").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
          }

          // validate the optional field `children` (array)
          for (int i = 0; i < jsonArraychildren.size(); i++) {
            TestSuiteV2TreeModel.validateJsonElement(jsonArraychildren.get(i));
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if (!jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TestSuiteType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestSuiteV2TreeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestSuiteV2TreeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestSuiteV2TreeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestSuiteV2TreeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestSuiteV2TreeModel>() {
           @Override
           public void write(JsonWriter out, TestSuiteV2TreeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestSuiteV2TreeModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestSuiteV2TreeModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestSuiteV2TreeModel
   * @throws IOException if the JSON string is invalid with respect to TestSuiteV2TreeModel
   */
  public static TestSuiteV2TreeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestSuiteV2TreeModel.class);
  }

  /**
   * Convert an instance of TestSuiteV2TreeModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

