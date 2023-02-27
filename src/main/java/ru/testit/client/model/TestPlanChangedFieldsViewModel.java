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
import java.util.*;
import java.util.Map.Entry;

/**
 * TestPlanChangedFieldsViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanChangedFieldsViewModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private StringTestPlanChangedFieldViewModel name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private StringTestPlanChangedFieldViewModel description;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private StringTestPlanChangedFieldViewModel productName;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private StringTestPlanChangedFieldViewModel build;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private PeriodViewModelTestPlanChangedFieldViewModel period;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StringTestPlanChangedFieldViewModel status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private StringArrayTestPlanChangedFieldViewModel tags;

  public static final String SERIALIZED_NAME_TEST_SUITE = "testSuite";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE)
  private TestSuiteChangeViewModelTestPlanChangedFieldViewModel testSuite;

  public static final String SERIALIZED_NAME_TEST_POINTS = "testPoints";
  @SerializedName(SERIALIZED_NAME_TEST_POINTS)
  private TestPointChangeViewModelTestPlanChangedFieldViewModel testPoints;

  public static final String SERIALIZED_NAME_TEST_RESULTS = "testResults";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS)
  private TestResultChangeViewModelTestPlanChangedFieldViewModel testResults;

  public static final String SERIALIZED_NAME_LOCKING = "locking";
  @SerializedName(SERIALIZED_NAME_LOCKING)
  private BooleanTestPlanChangedFieldViewModel locking;

  public static final String SERIALIZED_NAME_HAS_AUTOMATIC_DURATION_TIMER = "hasAutomaticDurationTimer";
  @SerializedName(SERIALIZED_NAME_HAS_AUTOMATIC_DURATION_TIMER)
  private BooleanNullableTestPlanChangedFieldViewModel hasAutomaticDurationTimer;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, CustomAttributeChangeModel> attributes = null;

  public TestPlanChangedFieldsViewModel() {
  }

  public TestPlanChangedFieldsViewModel name(StringTestPlanChangedFieldViewModel name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringTestPlanChangedFieldViewModel getName() {
    return name;
  }


  public void setName(StringTestPlanChangedFieldViewModel name) {
    this.name = name;
  }


  public TestPlanChangedFieldsViewModel description(StringTestPlanChangedFieldViewModel description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringTestPlanChangedFieldViewModel getDescription() {
    return description;
  }


  public void setDescription(StringTestPlanChangedFieldViewModel description) {
    this.description = description;
  }


  public TestPlanChangedFieldsViewModel productName(StringTestPlanChangedFieldViewModel productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringTestPlanChangedFieldViewModel getProductName() {
    return productName;
  }


  public void setProductName(StringTestPlanChangedFieldViewModel productName) {
    this.productName = productName;
  }


  public TestPlanChangedFieldsViewModel build(StringTestPlanChangedFieldViewModel build) {
    
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringTestPlanChangedFieldViewModel getBuild() {
    return build;
  }


  public void setBuild(StringTestPlanChangedFieldViewModel build) {
    this.build = build;
  }


  public TestPlanChangedFieldsViewModel period(PeriodViewModelTestPlanChangedFieldViewModel period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PeriodViewModelTestPlanChangedFieldViewModel getPeriod() {
    return period;
  }


  public void setPeriod(PeriodViewModelTestPlanChangedFieldViewModel period) {
    this.period = period;
  }


  public TestPlanChangedFieldsViewModel status(StringTestPlanChangedFieldViewModel status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringTestPlanChangedFieldViewModel getStatus() {
    return status;
  }


  public void setStatus(StringTestPlanChangedFieldViewModel status) {
    this.status = status;
  }


  public TestPlanChangedFieldsViewModel tags(StringArrayTestPlanChangedFieldViewModel tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringArrayTestPlanChangedFieldViewModel getTags() {
    return tags;
  }


  public void setTags(StringArrayTestPlanChangedFieldViewModel tags) {
    this.tags = tags;
  }


  public TestPlanChangedFieldsViewModel testSuite(TestSuiteChangeViewModelTestPlanChangedFieldViewModel testSuite) {
    
    this.testSuite = testSuite;
    return this;
  }

   /**
   * Get testSuite
   * @return testSuite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestSuiteChangeViewModelTestPlanChangedFieldViewModel getTestSuite() {
    return testSuite;
  }


  public void setTestSuite(TestSuiteChangeViewModelTestPlanChangedFieldViewModel testSuite) {
    this.testSuite = testSuite;
  }


  public TestPlanChangedFieldsViewModel testPoints(TestPointChangeViewModelTestPlanChangedFieldViewModel testPoints) {
    
    this.testPoints = testPoints;
    return this;
  }

   /**
   * Get testPoints
   * @return testPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestPointChangeViewModelTestPlanChangedFieldViewModel getTestPoints() {
    return testPoints;
  }


  public void setTestPoints(TestPointChangeViewModelTestPlanChangedFieldViewModel testPoints) {
    this.testPoints = testPoints;
  }


  public TestPlanChangedFieldsViewModel testResults(TestResultChangeViewModelTestPlanChangedFieldViewModel testResults) {
    
    this.testResults = testResults;
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestResultChangeViewModelTestPlanChangedFieldViewModel getTestResults() {
    return testResults;
  }


  public void setTestResults(TestResultChangeViewModelTestPlanChangedFieldViewModel testResults) {
    this.testResults = testResults;
  }


  public TestPlanChangedFieldsViewModel locking(BooleanTestPlanChangedFieldViewModel locking) {
    
    this.locking = locking;
    return this;
  }

   /**
   * Get locking
   * @return locking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BooleanTestPlanChangedFieldViewModel getLocking() {
    return locking;
  }


  public void setLocking(BooleanTestPlanChangedFieldViewModel locking) {
    this.locking = locking;
  }


  public TestPlanChangedFieldsViewModel hasAutomaticDurationTimer(BooleanNullableTestPlanChangedFieldViewModel hasAutomaticDurationTimer) {
    
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
    return this;
  }

   /**
   * Get hasAutomaticDurationTimer
   * @return hasAutomaticDurationTimer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BooleanNullableTestPlanChangedFieldViewModel getHasAutomaticDurationTimer() {
    return hasAutomaticDurationTimer;
  }


  public void setHasAutomaticDurationTimer(BooleanNullableTestPlanChangedFieldViewModel hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
  }


  public TestPlanChangedFieldsViewModel attributes(Map<String, CustomAttributeChangeModel> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TestPlanChangedFieldsViewModel putAttributesItem(String key, CustomAttributeChangeModel attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CustomAttributeChangeModel> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, CustomAttributeChangeModel> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanChangedFieldsViewModel testPlanChangedFieldsViewModel = (TestPlanChangedFieldsViewModel) o;
    return Objects.equals(this.name, testPlanChangedFieldsViewModel.name) &&
        Objects.equals(this.description, testPlanChangedFieldsViewModel.description) &&
        Objects.equals(this.productName, testPlanChangedFieldsViewModel.productName) &&
        Objects.equals(this.build, testPlanChangedFieldsViewModel.build) &&
        Objects.equals(this.period, testPlanChangedFieldsViewModel.period) &&
        Objects.equals(this.status, testPlanChangedFieldsViewModel.status) &&
        Objects.equals(this.tags, testPlanChangedFieldsViewModel.tags) &&
        Objects.equals(this.testSuite, testPlanChangedFieldsViewModel.testSuite) &&
        Objects.equals(this.testPoints, testPlanChangedFieldsViewModel.testPoints) &&
        Objects.equals(this.testResults, testPlanChangedFieldsViewModel.testResults) &&
        Objects.equals(this.locking, testPlanChangedFieldsViewModel.locking) &&
        Objects.equals(this.hasAutomaticDurationTimer, testPlanChangedFieldsViewModel.hasAutomaticDurationTimer) &&
        Objects.equals(this.attributes, testPlanChangedFieldsViewModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, productName, build, period, status, tags, testSuite, testPoints, testResults, locking, hasAutomaticDurationTimer, attributes);
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
    sb.append("class TestPlanChangedFieldsViewModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
    sb.append("    testPoints: ").append(toIndentedString(testPoints)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    locking: ").append(toIndentedString(locking)).append("\n");
    sb.append("    hasAutomaticDurationTimer: ").append(toIndentedString(hasAutomaticDurationTimer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("productName");
    openapiFields.add("build");
    openapiFields.add("period");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("testSuite");
    openapiFields.add("testPoints");
    openapiFields.add("testResults");
    openapiFields.add("locking");
    openapiFields.add("hasAutomaticDurationTimer");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestPlanChangedFieldsViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestPlanChangedFieldsViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanChangedFieldsViewModel is not found in the empty JSON string", TestPlanChangedFieldsViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestPlanChangedFieldsViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanChangedFieldsViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        StringTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        StringTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("description"));
      }
      // validate the optional field `productName`
      if (jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) {
        StringTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("productName"));
      }
      // validate the optional field `build`
      if (jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) {
        StringTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("build"));
      }
      // validate the optional field `period`
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) {
        PeriodViewModelTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("period"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StringTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      // validate the optional field `tags`
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        StringArrayTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("tags"));
      }
      // validate the optional field `testSuite`
      if (jsonObj.get("testSuite") != null && !jsonObj.get("testSuite").isJsonNull()) {
        TestSuiteChangeViewModelTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("testSuite"));
      }
      // validate the optional field `testPoints`
      if (jsonObj.get("testPoints") != null && !jsonObj.get("testPoints").isJsonNull()) {
        TestPointChangeViewModelTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("testPoints"));
      }
      // validate the optional field `testResults`
      if (jsonObj.get("testResults") != null && !jsonObj.get("testResults").isJsonNull()) {
        TestResultChangeViewModelTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("testResults"));
      }
      // validate the optional field `locking`
      if (jsonObj.get("locking") != null && !jsonObj.get("locking").isJsonNull()) {
        BooleanTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("locking"));
      }
      // validate the optional field `hasAutomaticDurationTimer`
      if (jsonObj.get("hasAutomaticDurationTimer") != null && !jsonObj.get("hasAutomaticDurationTimer").isJsonNull()) {
        BooleanNullableTestPlanChangedFieldViewModel.validateJsonObject(jsonObj.getAsJsonObject("hasAutomaticDurationTimer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPlanChangedFieldsViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanChangedFieldsViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanChangedFieldsViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanChangedFieldsViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanChangedFieldsViewModel>() {
           @Override
           public void write(JsonWriter out, TestPlanChangedFieldsViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanChangedFieldsViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestPlanChangedFieldsViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestPlanChangedFieldsViewModel
  * @throws IOException if the JSON string is invalid with respect to TestPlanChangedFieldsViewModel
  */
  public static TestPlanChangedFieldsViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanChangedFieldsViewModel.class);
  }

 /**
  * Convert an instance of TestPlanChangedFieldsViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

