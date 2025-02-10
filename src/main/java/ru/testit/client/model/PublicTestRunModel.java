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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.PublicTestPointModel;

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
 * PublicTestRunModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PublicTestRunModel {
  public static final String SERIALIZED_NAME_TEST_RUN_ID = "testRunId";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_ID)
  private UUID testRunId;

  public static final String SERIALIZED_NAME_TEST_PLAN_ID = "testPlanId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_ID)
  private UUID testPlanId;

  public static final String SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID = "testPlanGlobalId";
  @SerializedName(SERIALIZED_NAME_TEST_PLAN_GLOBAL_ID)
  private Long testPlanGlobalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_CONFIGURATIONS = "configurations";
  @SerializedName(SERIALIZED_NAME_CONFIGURATIONS)
  private List<ConfigurationModel> configurations = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_TESTS = "autoTests";
  @SerializedName(SERIALIZED_NAME_AUTO_TESTS)
  private List<AutoTestModel> autoTests = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEST_POINTS = "testPoints";
  @SerializedName(SERIALIZED_NAME_TEST_POINTS)
  private List<PublicTestPointModel> testPoints = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CUSTOM_PARAMETERS = "customParameters";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PARAMETERS)
  private Map<String, String> customParameters;

  public static final String SERIALIZED_NAME_TEST_RUN_DESCRIPTION = "testRunDescription";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_DESCRIPTION)
  private String testRunDescription;

  public PublicTestRunModel() {
  }

  public PublicTestRunModel testRunId(UUID testRunId) {
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


  public PublicTestRunModel testPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
    return this;
  }

  /**
   * Get testPlanId
   * @return testPlanId
   */
  @javax.annotation.Nullable
  public UUID getTestPlanId() {
    return testPlanId;
  }

  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public PublicTestRunModel testPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
    return this;
  }

  /**
   * Get testPlanGlobalId
   * @return testPlanGlobalId
   */
  @javax.annotation.Nonnull
  public Long getTestPlanGlobalId() {
    return testPlanGlobalId;
  }

  public void setTestPlanGlobalId(Long testPlanGlobalId) {
    this.testPlanGlobalId = testPlanGlobalId;
  }


  public PublicTestRunModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PublicTestRunModel productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
   */
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public PublicTestRunModel build(String build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
   */
  @javax.annotation.Nullable
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }


  public PublicTestRunModel configurations(List<ConfigurationModel> configurations) {
    this.configurations = configurations;
    return this;
  }

  public PublicTestRunModel addConfigurationsItem(ConfigurationModel configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * Get configurations
   * @return configurations
   */
  @javax.annotation.Nonnull
  public List<ConfigurationModel> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<ConfigurationModel> configurations) {
    this.configurations = configurations;
  }


  public PublicTestRunModel autoTests(List<AutoTestModel> autoTests) {
    this.autoTests = autoTests;
    return this;
  }

  public PublicTestRunModel addAutoTestsItem(AutoTestModel autoTestsItem) {
    if (this.autoTests == null) {
      this.autoTests = new ArrayList<>();
    }
    this.autoTests.add(autoTestsItem);
    return this;
  }

  /**
   * Get autoTests
   * @return autoTests
   */
  @javax.annotation.Nonnull
  public List<AutoTestModel> getAutoTests() {
    return autoTests;
  }

  public void setAutoTests(List<AutoTestModel> autoTests) {
    this.autoTests = autoTests;
  }


  public PublicTestRunModel testPoints(List<PublicTestPointModel> testPoints) {
    this.testPoints = testPoints;
    return this;
  }

  public PublicTestRunModel addTestPointsItem(PublicTestPointModel testPointsItem) {
    if (this.testPoints == null) {
      this.testPoints = new ArrayList<>();
    }
    this.testPoints.add(testPointsItem);
    return this;
  }

  /**
   * Get testPoints
   * @return testPoints
   */
  @javax.annotation.Nonnull
  public List<PublicTestPointModel> getTestPoints() {
    return testPoints;
  }

  public void setTestPoints(List<PublicTestPointModel> testPoints) {
    this.testPoints = testPoints;
  }


  public PublicTestRunModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public PublicTestRunModel customParameters(Map<String, String> customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  public PublicTestRunModel putCustomParametersItem(String key, String customParametersItem) {
    if (this.customParameters == null) {
      this.customParameters = new HashMap<>();
    }
    this.customParameters.put(key, customParametersItem);
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
   */
  @javax.annotation.Nullable
  public Map<String, String> getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(Map<String, String> customParameters) {
    this.customParameters = customParameters;
  }


  public PublicTestRunModel testRunDescription(String testRunDescription) {
    this.testRunDescription = testRunDescription;
    return this;
  }

  /**
   * Get testRunDescription
   * @return testRunDescription
   */
  @javax.annotation.Nullable
  public String getTestRunDescription() {
    return testRunDescription;
  }

  public void setTestRunDescription(String testRunDescription) {
    this.testRunDescription = testRunDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicTestRunModel publicTestRunModel = (PublicTestRunModel) o;
    return Objects.equals(this.testRunId, publicTestRunModel.testRunId) &&
        Objects.equals(this.testPlanId, publicTestRunModel.testPlanId) &&
        Objects.equals(this.testPlanGlobalId, publicTestRunModel.testPlanGlobalId) &&
        Objects.equals(this.name, publicTestRunModel.name) &&
        Objects.equals(this.productName, publicTestRunModel.productName) &&
        Objects.equals(this.build, publicTestRunModel.build) &&
        Objects.equals(this.configurations, publicTestRunModel.configurations) &&
        Objects.equals(this.autoTests, publicTestRunModel.autoTests) &&
        Objects.equals(this.testPoints, publicTestRunModel.testPoints) &&
        Objects.equals(this.status, publicTestRunModel.status) &&
        Objects.equals(this.customParameters, publicTestRunModel.customParameters) &&
        Objects.equals(this.testRunDescription, publicTestRunModel.testRunDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRunId, testPlanId, testPlanGlobalId, name, productName, build, configurations, autoTests, testPoints, status, customParameters, testRunDescription);
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
    sb.append("class PublicTestRunModel {\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    testPlanGlobalId: ").append(toIndentedString(testPlanGlobalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    testPoints: ").append(toIndentedString(testPoints)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    testRunDescription: ").append(toIndentedString(testRunDescription)).append("\n");
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
    openapiFields.add("testRunId");
    openapiFields.add("testPlanId");
    openapiFields.add("testPlanGlobalId");
    openapiFields.add("name");
    openapiFields.add("productName");
    openapiFields.add("build");
    openapiFields.add("configurations");
    openapiFields.add("autoTests");
    openapiFields.add("testPoints");
    openapiFields.add("status");
    openapiFields.add("customParameters");
    openapiFields.add("testRunDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("testRunId");
    openapiRequiredFields.add("testPlanGlobalId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("configurations");
    openapiRequiredFields.add("autoTests");
    openapiRequiredFields.add("testPoints");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PublicTestRunModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicTestRunModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicTestRunModel is not found in the empty JSON string", PublicTestRunModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PublicTestRunModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublicTestRunModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicTestRunModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("testRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunId").toString()));
      }
      if ((jsonObj.get("testPlanId") != null && !jsonObj.get("testPlanId").isJsonNull()) && !jsonObj.get("testPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testPlanId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("configurations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurations` to be an array in the JSON string but got `%s`", jsonObj.get("configurations").toString()));
      }

      JsonArray jsonArrayconfigurations = jsonObj.getAsJsonArray("configurations");
      // validate the required field `configurations` (array)
      for (int i = 0; i < jsonArrayconfigurations.size(); i++) {
        ConfigurationModel.validateJsonElement(jsonArrayconfigurations.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("autoTests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoTests` to be an array in the JSON string but got `%s`", jsonObj.get("autoTests").toString()));
      }

      JsonArray jsonArrayautoTests = jsonObj.getAsJsonArray("autoTests");
      // validate the required field `autoTests` (array)
      for (int i = 0; i < jsonArrayautoTests.size(); i++) {
        AutoTestModel.validateJsonElement(jsonArrayautoTests.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("testPoints").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testPoints` to be an array in the JSON string but got `%s`", jsonObj.get("testPoints").toString()));
      }

      JsonArray jsonArraytestPoints = jsonObj.getAsJsonArray("testPoints");
      // validate the required field `testPoints` (array)
      for (int i = 0; i < jsonArraytestPoints.size(); i++) {
        PublicTestPointModel.validateJsonElement(jsonArraytestPoints.get(i));
      };
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("testRunDescription") != null && !jsonObj.get("testRunDescription").isJsonNull()) && !jsonObj.get("testRunDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testRunDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testRunDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicTestRunModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicTestRunModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicTestRunModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicTestRunModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicTestRunModel>() {
           @Override
           public void write(JsonWriter out, PublicTestRunModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicTestRunModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PublicTestRunModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PublicTestRunModel
   * @throws IOException if the JSON string is invalid with respect to PublicTestRunModel
   */
  public static PublicTestRunModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicTestRunModel.class);
  }

  /**
   * Convert an instance of PublicTestRunModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

