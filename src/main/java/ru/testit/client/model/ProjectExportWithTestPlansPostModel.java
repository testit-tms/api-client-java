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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * ProjectExportWithTestPlansPostModel
 */
@JsonPropertyOrder({
  ProjectExportWithTestPlansPostModel.JSON_PROPERTY_TEST_PLANS_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectExportWithTestPlansPostModel {
  public static final String JSON_PROPERTY_TEST_PLANS_IDS = "testPlansIds";
  private JsonNullable<Set<UUID>> testPlansIds = JsonNullable.<Set<UUID>>undefined();

  public ProjectExportWithTestPlansPostModel() { 
  }

  public ProjectExportWithTestPlansPostModel testPlansIds(Set<UUID> testPlansIds) {
    this.testPlansIds = JsonNullable.<Set<UUID>>of(testPlansIds);
    return this;
  }

  public ProjectExportWithTestPlansPostModel addTestPlansIdsItem(UUID testPlansIdsItem) {
    if (this.testPlansIds == null || !this.testPlansIds.isPresent()) {
      this.testPlansIds = JsonNullable.<Set<UUID>>of(new LinkedHashSet<>());
    }
    try {
      this.testPlansIds.get().add(testPlansIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Specifies the IDs of test plans to be exported with the project.&lt;br /&gt;  In this parameter, \&quot;&lt;b&gt;string&lt;/b&gt;\&quot; values are IDs of the test plans.&lt;br /&gt;  To get the test plan IDs, use the &#x60;GET /api/v2/projects/{projectId}/testPlans&#x60; method.
   * @return testPlansIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the IDs of test plans to be exported with the project.<br />  In this parameter, \"<b>string</b>\" values are IDs of the test plans.<br />  To get the test plan IDs, use the `GET /api/v2/projects/{projectId}/testPlans` method.")
  @JsonIgnore

  public Set<UUID> getTestPlansIds() {
        return testPlansIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_PLANS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<UUID>> getTestPlansIds_JsonNullable() {
    return testPlansIds;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_PLANS_IDS)
  public void setTestPlansIds_JsonNullable(JsonNullable<Set<UUID>> testPlansIds) {
    this.testPlansIds = testPlansIds;
  }

  public void setTestPlansIds(Set<UUID> testPlansIds) {
    this.testPlansIds = JsonNullable.<Set<UUID>>of(testPlansIds);
  }


  /**
   * Return true if this ProjectExportWithTestPlansPostModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectExportWithTestPlansPostModel projectExportWithTestPlansPostModel = (ProjectExportWithTestPlansPostModel) o;
    return equalsNullable(this.testPlansIds, projectExportWithTestPlansPostModel.testPlansIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(testPlansIds));
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
    sb.append("class ProjectExportWithTestPlansPostModel {\n");
    sb.append("    testPlansIds: ").append(toIndentedString(testPlansIds)).append("\n");
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
