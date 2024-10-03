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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.LinkPostModel;
import ru.testit.client.model.TestRunTestResultsPartialBulkSetModelSelector;

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
import java.util.Map.Entry;
import java.util.Set;

import ru.testit.client.invoker.JSON;

/**
 * ApiV2TestRunsIdTestResultsBulkPutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV2TestRunsIdTestResultsBulkPutRequest {
  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private TestRunTestResultsPartialBulkSetModelSelector selector;

  public static final String SERIALIZED_NAME_RESULT_REASON_IDS = "resultReasonIds";
  @SerializedName(SERIALIZED_NAME_RESULT_REASON_IDS)
  private Set<UUID> resultReasonIds;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Set<LinkPostModel> links;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_ATTACHMENT_IDS = "attachmentIds";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_IDS)
  private Set<UUID> attachmentIds;

  public ApiV2TestRunsIdTestResultsBulkPutRequest() {
  }

  public ApiV2TestRunsIdTestResultsBulkPutRequest selector(TestRunTestResultsPartialBulkSetModelSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  public TestRunTestResultsPartialBulkSetModelSelector getSelector() {
    return selector;
  }


  public void setSelector(TestRunTestResultsPartialBulkSetModelSelector selector) {
    this.selector = selector;
  }


  public ApiV2TestRunsIdTestResultsBulkPutRequest resultReasonIds(Set<UUID> resultReasonIds) {
    
    this.resultReasonIds = resultReasonIds;
    return this;
  }

  public ApiV2TestRunsIdTestResultsBulkPutRequest addResultReasonIdsItem(UUID resultReasonIdsItem) {
    if (this.resultReasonIds == null) {
      this.resultReasonIds = new LinkedHashSet<>();
    }
    this.resultReasonIds.add(resultReasonIdsItem);
    return this;
  }

   /**
   * Unique IDs of result reasons to be assigned to test results
   * @return resultReasonIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getResultReasonIds() {
    return resultReasonIds;
  }


  public void setResultReasonIds(Set<UUID> resultReasonIds) {
    this.resultReasonIds = resultReasonIds;
  }


  public ApiV2TestRunsIdTestResultsBulkPutRequest links(Set<LinkPostModel> links) {
    
    this.links = links;
    return this;
  }

  public ApiV2TestRunsIdTestResultsBulkPutRequest addLinksItem(LinkPostModel linksItem) {
    if (this.links == null) {
      this.links = new LinkedHashSet<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links to be assigned to test results
   * @return links
  **/
  @javax.annotation.Nullable
  public Set<LinkPostModel> getLinks() {
    return links;
  }


  public void setLinks(Set<LinkPostModel> links) {
    this.links = links;
  }


  public ApiV2TestRunsIdTestResultsBulkPutRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment to be added to test results
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public ApiV2TestRunsIdTestResultsBulkPutRequest attachmentIds(Set<UUID> attachmentIds) {
    
    this.attachmentIds = attachmentIds;
    return this;
  }

  public ApiV2TestRunsIdTestResultsBulkPutRequest addAttachmentIdsItem(UUID attachmentIdsItem) {
    if (this.attachmentIds == null) {
      this.attachmentIds = new LinkedHashSet<>();
    }
    this.attachmentIds.add(attachmentIdsItem);
    return this;
  }

   /**
   * Unique IDs of files to be attached to test results
   * @return attachmentIds
  **/
  @javax.annotation.Nullable
  public Set<UUID> getAttachmentIds() {
    return attachmentIds;
  }


  public void setAttachmentIds(Set<UUID> attachmentIds) {
    this.attachmentIds = attachmentIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV2TestRunsIdTestResultsBulkPutRequest apiV2TestRunsIdTestResultsBulkPutRequest = (ApiV2TestRunsIdTestResultsBulkPutRequest) o;
    return Objects.equals(this.selector, apiV2TestRunsIdTestResultsBulkPutRequest.selector) &&
        Objects.equals(this.resultReasonIds, apiV2TestRunsIdTestResultsBulkPutRequest.resultReasonIds) &&
        Objects.equals(this.links, apiV2TestRunsIdTestResultsBulkPutRequest.links) &&
        Objects.equals(this.comment, apiV2TestRunsIdTestResultsBulkPutRequest.comment) &&
        Objects.equals(this.attachmentIds, apiV2TestRunsIdTestResultsBulkPutRequest.attachmentIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(selector, resultReasonIds, links, comment, attachmentIds);
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
    sb.append("class ApiV2TestRunsIdTestResultsBulkPutRequest {\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    resultReasonIds: ").append(toIndentedString(resultReasonIds)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    attachmentIds: ").append(toIndentedString(attachmentIds)).append("\n");
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
    openapiFields.add("selector");
    openapiFields.add("resultReasonIds");
    openapiFields.add("links");
    openapiFields.add("comment");
    openapiFields.add("attachmentIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiV2TestRunsIdTestResultsBulkPutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiV2TestRunsIdTestResultsBulkPutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiV2TestRunsIdTestResultsBulkPutRequest is not found in the empty JSON string", ApiV2TestRunsIdTestResultsBulkPutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiV2TestRunsIdTestResultsBulkPutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiV2TestRunsIdTestResultsBulkPutRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        TestRunTestResultsPartialBulkSetModelSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resultReasonIds") != null && !jsonObj.get("resultReasonIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultReasonIds` to be an array in the JSON string but got `%s`", jsonObj.get("resultReasonIds").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkPostModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("attachmentIds") != null && !jsonObj.get("attachmentIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachmentIds` to be an array in the JSON string but got `%s`", jsonObj.get("attachmentIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiV2TestRunsIdTestResultsBulkPutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiV2TestRunsIdTestResultsBulkPutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiV2TestRunsIdTestResultsBulkPutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiV2TestRunsIdTestResultsBulkPutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiV2TestRunsIdTestResultsBulkPutRequest>() {
           @Override
           public void write(JsonWriter out, ApiV2TestRunsIdTestResultsBulkPutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiV2TestRunsIdTestResultsBulkPutRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiV2TestRunsIdTestResultsBulkPutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiV2TestRunsIdTestResultsBulkPutRequest
  * @throws IOException if the JSON string is invalid with respect to ApiV2TestRunsIdTestResultsBulkPutRequest
  */
  public static ApiV2TestRunsIdTestResultsBulkPutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiV2TestRunsIdTestResultsBulkPutRequest.class);
  }

 /**
  * Convert an instance of ApiV2TestRunsIdTestResultsBulkPutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
