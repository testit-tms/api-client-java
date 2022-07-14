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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestSuiteWithChildrenModel
 */
@JsonPropertyOrder({
  TestSuiteWithChildrenModel.JSON_PROPERTY_CHILDREN,
  TestSuiteWithChildrenModel.JSON_PROPERTY_TESTER_ID,
  TestSuiteWithChildrenModel.JSON_PROPERTY_PARENT_ID,
  TestSuiteWithChildrenModel.JSON_PROPERTY_TEST_PLAN_ID,
  TestSuiteWithChildrenModel.JSON_PROPERTY_NAME,
  TestSuiteWithChildrenModel.JSON_PROPERTY_ID,
  TestSuiteWithChildrenModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestSuiteWithChildrenModel {
  public static final String JSON_PROPERTY_CHILDREN = "children";
  private JsonNullable<List<TestSuiteWithChildrenModel>> children = JsonNullable.<List<TestSuiteWithChildrenModel>>undefined();

  public static final String JSON_PROPERTY_TESTER_ID = "testerId";
  private JsonNullable<UUID> testerId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private JsonNullable<UUID> parentId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TEST_PLAN_ID = "testPlanId";
  private UUID testPlanId;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public TestSuiteWithChildrenModel() { 
  }

  public TestSuiteWithChildrenModel children(List<TestSuiteWithChildrenModel> children) {
    this.children = JsonNullable.<List<TestSuiteWithChildrenModel>>of(children);
    return this;
  }

  public TestSuiteWithChildrenModel addChildrenItem(TestSuiteWithChildrenModel childrenItem) {
    if (this.children == null || !this.children.isPresent()) {
      this.children = JsonNullable.<List<TestSuiteWithChildrenModel>>of(new ArrayList<>());
    }
    try {
      this.children.get().add(childrenItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestSuiteWithChildrenModel> getChildren() {
        return children.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestSuiteWithChildrenModel>> getChildren_JsonNullable() {
    return children;
  }
  
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  public void setChildren_JsonNullable(JsonNullable<List<TestSuiteWithChildrenModel>> children) {
    this.children = children;
  }

  public void setChildren(List<TestSuiteWithChildrenModel> children) {
    this.children = JsonNullable.<List<TestSuiteWithChildrenModel>>of(children);
  }


  public TestSuiteWithChildrenModel testerId(UUID testerId) {
    this.testerId = JsonNullable.<UUID>of(testerId);
    return this;
  }

   /**
   * Get testerId
   * @return testerId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getTesterId() {
        return testerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TESTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getTesterId_JsonNullable() {
    return testerId;
  }
  
  @JsonProperty(JSON_PROPERTY_TESTER_ID)
  public void setTesterId_JsonNullable(JsonNullable<UUID> testerId) {
    this.testerId = testerId;
  }

  public void setTesterId(UUID testerId) {
    this.testerId = JsonNullable.<UUID>of(testerId);
  }


  public TestSuiteWithChildrenModel parentId(UUID parentId) {
    this.parentId = JsonNullable.<UUID>of(parentId);
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getParentId() {
        return parentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getParentId_JsonNullable() {
    return parentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  public void setParentId_JsonNullable(JsonNullable<UUID> parentId) {
    this.parentId = parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = JsonNullable.<UUID>of(parentId);
  }


  public TestSuiteWithChildrenModel testPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTestPlanId() {
    return testPlanId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestSuiteWithChildrenModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TestSuiteWithChildrenModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
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


  public TestSuiteWithChildrenModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  /**
   * Return true if this TestSuiteWithChildrenModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteWithChildrenModel testSuiteWithChildrenModel = (TestSuiteWithChildrenModel) o;
    return equalsNullable(this.children, testSuiteWithChildrenModel.children) &&
        equalsNullable(this.testerId, testSuiteWithChildrenModel.testerId) &&
        equalsNullable(this.parentId, testSuiteWithChildrenModel.parentId) &&
        Objects.equals(this.testPlanId, testSuiteWithChildrenModel.testPlanId) &&
        equalsNullable(this.name, testSuiteWithChildrenModel.name) &&
        Objects.equals(this.id, testSuiteWithChildrenModel.id) &&
        Objects.equals(this.isDeleted, testSuiteWithChildrenModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(children), hashCodeNullable(testerId), hashCodeNullable(parentId), testPlanId, hashCodeNullable(name), id, isDeleted);
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
    sb.append("class TestSuiteWithChildrenModel {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    testerId: ").append(toIndentedString(testerId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

