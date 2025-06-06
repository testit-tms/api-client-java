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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.ExternalLinkModel;
import ru.testit.client.model.LinkModel;

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
 * TestPlanLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestPlanLink {
  public static final String SERIALIZED_NAME_BUG_LINK = "bugLink";
  @SerializedName(SERIALIZED_NAME_BUG_LINK)
  private LinkModel bugLink;

  public static final String SERIALIZED_NAME_WORK_ITEM_GLOBAL_ID = "workItemGlobalId";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_GLOBAL_ID)
  private Long workItemGlobalId;

  public static final String SERIALIZED_NAME_WORK_ITEM_NAME = "workItemName";
  @SerializedName(SERIALIZED_NAME_WORK_ITEM_NAME)
  private String workItemName;

  public static final String SERIALIZED_NAME_CONFIGURATION_NAME = "configurationName";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_NAME)
  private String configurationName;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private ExternalLinkModel info;

  public TestPlanLink() {
  }

  public TestPlanLink bugLink(LinkModel bugLink) {
    this.bugLink = bugLink;
    return this;
  }

  /**
   * Get bugLink
   * @return bugLink
   */
  @javax.annotation.Nullable
  public LinkModel getBugLink() {
    return bugLink;
  }

  public void setBugLink(LinkModel bugLink) {
    this.bugLink = bugLink;
  }


  public TestPlanLink workItemGlobalId(Long workItemGlobalId) {
    this.workItemGlobalId = workItemGlobalId;
    return this;
  }

  /**
   * Get workItemGlobalId
   * @return workItemGlobalId
   */
  @javax.annotation.Nullable
  public Long getWorkItemGlobalId() {
    return workItemGlobalId;
  }

  public void setWorkItemGlobalId(Long workItemGlobalId) {
    this.workItemGlobalId = workItemGlobalId;
  }


  public TestPlanLink workItemName(String workItemName) {
    this.workItemName = workItemName;
    return this;
  }

  /**
   * Get workItemName
   * @return workItemName
   */
  @javax.annotation.Nullable
  public String getWorkItemName() {
    return workItemName;
  }

  public void setWorkItemName(String workItemName) {
    this.workItemName = workItemName;
  }


  public TestPlanLink configurationName(String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

  /**
   * Get configurationName
   * @return configurationName
   */
  @javax.annotation.Nullable
  public String getConfigurationName() {
    return configurationName;
  }

  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }


  public TestPlanLink createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * Get createdById
   * @return createdById
   */
  @javax.annotation.Nullable
  public UUID getCreatedById() {
    return createdById;
  }

  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestPlanLink comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public TestPlanLink info(ExternalLinkModel info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nullable
  public ExternalLinkModel getInfo() {
    return info;
  }

  public void setInfo(ExternalLinkModel info) {
    this.info = info;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanLink testPlanLink = (TestPlanLink) o;
    return Objects.equals(this.bugLink, testPlanLink.bugLink) &&
        Objects.equals(this.workItemGlobalId, testPlanLink.workItemGlobalId) &&
        Objects.equals(this.workItemName, testPlanLink.workItemName) &&
        Objects.equals(this.configurationName, testPlanLink.configurationName) &&
        Objects.equals(this.createdById, testPlanLink.createdById) &&
        Objects.equals(this.comment, testPlanLink.comment) &&
        Objects.equals(this.info, testPlanLink.info);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bugLink, workItemGlobalId, workItemName, configurationName, createdById, comment, info);
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
    sb.append("class TestPlanLink {\n");
    sb.append("    bugLink: ").append(toIndentedString(bugLink)).append("\n");
    sb.append("    workItemGlobalId: ").append(toIndentedString(workItemGlobalId)).append("\n");
    sb.append("    workItemName: ").append(toIndentedString(workItemName)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
    openapiFields.add("bugLink");
    openapiFields.add("workItemGlobalId");
    openapiFields.add("workItemName");
    openapiFields.add("configurationName");
    openapiFields.add("createdById");
    openapiFields.add("comment");
    openapiFields.add("info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TestPlanLink
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestPlanLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestPlanLink is not found in the empty JSON string", TestPlanLink.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestPlanLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestPlanLink` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bugLink`
      if (jsonObj.get("bugLink") != null && !jsonObj.get("bugLink").isJsonNull()) {
        LinkModel.validateJsonElement(jsonObj.get("bugLink"));
      }
      if ((jsonObj.get("workItemName") != null && !jsonObj.get("workItemName").isJsonNull()) && !jsonObj.get("workItemName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workItemName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workItemName").toString()));
      }
      if ((jsonObj.get("configurationName") != null && !jsonObj.get("configurationName").isJsonNull()) && !jsonObj.get("configurationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationName").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // validate the optional field `info`
      if (jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull()) {
        ExternalLinkModel.validateJsonElement(jsonObj.get("info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestPlanLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestPlanLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestPlanLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestPlanLink.class));

       return (TypeAdapter<T>) new TypeAdapter<TestPlanLink>() {
           @Override
           public void write(JsonWriter out, TestPlanLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestPlanLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TestPlanLink given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestPlanLink
   * @throws IOException if the JSON string is invalid with respect to TestPlanLink
   */
  public static TestPlanLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestPlanLink.class);
  }

  /**
   * Convert an instance of TestPlanLink to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

