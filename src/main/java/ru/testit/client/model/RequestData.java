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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * RequestData
 */
@JsonPropertyOrder({
  RequestData.JSON_PROPERTY_URI,
  RequestData.JSON_PROPERTY_STATUS_CODE,
  RequestData.JSON_PROPERTY_REQUEST_BODY,
  RequestData.JSON_PROPERTY_REQUEST_META,
  RequestData.JSON_PROPERTY_RESPONSE_BODY,
  RequestData.JSON_PROPERTY_RESPONSE_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestData {
  public static final String JSON_PROPERTY_URI = "uri";
  private JsonNullable<String> uri = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_REQUEST_BODY = "requestBody";
  private JsonNullable<String> requestBody = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_META = "requestMeta";
  private String requestMeta;

  public static final String JSON_PROPERTY_RESPONSE_BODY = "responseBody";
  private String responseBody;

  public static final String JSON_PROPERTY_RESPONSE_META = "responseMeta";
  private String responseMeta;

  public RequestData() { 
  }

  public RequestData uri(String uri) {
    this.uri = JsonNullable.<String>of(uri);
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getUri() {
        return uri.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUri_JsonNullable() {
    return uri;
  }
  
  @JsonProperty(JSON_PROPERTY_URI)
  public void setUri_JsonNullable(JsonNullable<String> uri) {
    this.uri = uri;
  }

  public void setUri(String uri) {
    this.uri = JsonNullable.<String>of(uri);
  }


  public RequestData statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public RequestData requestBody(String requestBody) {
    this.requestBody = JsonNullable.<String>of(requestBody);
    return this;
  }

   /**
   * Get requestBody
   * @return requestBody
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getRequestBody() {
        return requestBody.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUEST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRequestBody_JsonNullable() {
    return requestBody;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_BODY)
  public void setRequestBody_JsonNullable(JsonNullable<String> requestBody) {
    this.requestBody = requestBody;
  }

  public void setRequestBody(String requestBody) {
    this.requestBody = JsonNullable.<String>of(requestBody);
  }


  public RequestData requestMeta(String requestMeta) {
    this.requestMeta = requestMeta;
    return this;
  }

   /**
   * Get requestMeta
   * @return requestMeta
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestMeta() {
    return requestMeta;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestMeta(String requestMeta) {
    this.requestMeta = requestMeta;
  }


  public RequestData responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResponseBody() {
    return responseBody;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }


  public RequestData responseMeta(String responseMeta) {
    this.responseMeta = responseMeta;
    return this;
  }

   /**
   * Get responseMeta
   * @return responseMeta
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSE_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResponseMeta() {
    return responseMeta;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseMeta(String responseMeta) {
    this.responseMeta = responseMeta;
  }


  /**
   * Return true if this RequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestData requestData = (RequestData) o;
    return equalsNullable(this.uri, requestData.uri) &&
        Objects.equals(this.statusCode, requestData.statusCode) &&
        equalsNullable(this.requestBody, requestData.requestBody) &&
        Objects.equals(this.requestMeta, requestData.requestMeta) &&
        Objects.equals(this.responseBody, requestData.responseBody) &&
        Objects.equals(this.responseMeta, requestData.responseMeta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(uri), statusCode, hashCodeNullable(requestBody), requestMeta, responseBody, responseMeta);
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
    sb.append("class RequestData {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    requestMeta: ").append(toIndentedString(requestMeta)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseMeta: ").append(toIndentedString(responseMeta)).append("\n");
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

