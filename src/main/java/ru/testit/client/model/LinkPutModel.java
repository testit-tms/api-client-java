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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import ru.testit.client.model.LinkType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * LinkPutModel
 */
@JsonPropertyOrder({
  LinkPutModel.JSON_PROPERTY_ID,
  LinkPutModel.JSON_PROPERTY_TITLE,
  LinkPutModel.JSON_PROPERTY_URL,
  LinkPutModel.JSON_PROPERTY_DESCRIPTION,
  LinkPutModel.JSON_PROPERTY_TYPE,
  LinkPutModel.JSON_PROPERTY_HAS_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkPutModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LinkType type;

  public static final String JSON_PROPERTY_HAS_INFO = "hasInfo";
  private Boolean hasInfo;

  public LinkPutModel() { 
  }

  public LinkPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ffdc45d-64c4-4b68-9a42-1744f46625b6", value = "")
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


  public LinkPutModel title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Link name.
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Link name.")
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public LinkPutModel url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Address can be specified without protocol, but necessarily with the domain.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Address can be specified without protocol, but necessarily with the domain.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public LinkPutModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Link description.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Link description.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public LinkPutModel type(LinkType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinkType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LinkType type) {
    this.type = type;
  }


  public LinkPutModel hasInfo(Boolean hasInfo) {
    this.hasInfo = hasInfo;
    return this;
  }

   /**
   * Get hasInfo
   * @return hasInfo
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasInfo() {
    return hasInfo;
  }


  @JsonProperty(JSON_PROPERTY_HAS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasInfo(Boolean hasInfo) {
    this.hasInfo = hasInfo;
  }


  /**
   * Return true if this LinkPutModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPutModel linkPutModel = (LinkPutModel) o;
    return Objects.equals(this.id, linkPutModel.id) &&
        equalsNullable(this.title, linkPutModel.title) &&
        Objects.equals(this.url, linkPutModel.url) &&
        equalsNullable(this.description, linkPutModel.description) &&
        Objects.equals(this.type, linkPutModel.type) &&
        Objects.equals(this.hasInfo, linkPutModel.hasInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(title), url, hashCodeNullable(description), type, hasInfo);
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
    sb.append("class LinkPutModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hasInfo: ").append(toIndentedString(hasInfo)).append("\n");
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

