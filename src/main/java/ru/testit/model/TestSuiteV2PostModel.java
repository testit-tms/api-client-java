/*
 * API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.testit.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * TestSuiteV2PostModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-12T16:29:55.695125+03:00[Europe/Moscow]")
public class TestSuiteV2PostModel {
  @SerializedName("parentId")
  private UUID parentId = null;

  @SerializedName("testPlanId")
  private UUID testPlanId = null;

  @SerializedName("name")
  private String name = null;

  public TestSuiteV2PostModel parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(example = "a70fa497-5526-4fb2-8f44-749ea5533c00", description = "")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public TestSuiteV2PostModel testPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Get testPlanId
   * @return testPlanId
  **/
  @Schema(example = "a70fa497-5526-4fb2-8f44-749ea5533c00", description = "")
  public UUID getTestPlanId() {
    return testPlanId;
  }

  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }

  public TestSuiteV2PostModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "base test suite", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteV2PostModel testSuiteV2PostModel = (TestSuiteV2PostModel) o;
    return Objects.equals(this.parentId, testSuiteV2PostModel.parentId) &&
        Objects.equals(this.testPlanId, testSuiteV2PostModel.testPlanId) &&
        Objects.equals(this.name, testSuiteV2PostModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, testPlanId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSuiteV2PostModel {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
