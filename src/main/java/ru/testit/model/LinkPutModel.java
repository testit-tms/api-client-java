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
import ru.testit.model.LinkType;
/**
 * LinkPutModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class LinkPutModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("type")
  private LinkType type = null;

  @SerializedName("hasInfo")
  private Boolean hasInfo = null;

  public LinkPutModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "9891bb36-71eb-4a4a-a049-eae838db9514", description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public LinkPutModel title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LinkPutModel url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(example = "https://google.com/", required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LinkPutModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "This link leads to google main page (no advertising)", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LinkPutModel type(LinkType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public LinkType getType() {
    return type;
  }

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
  @Schema(description = "")
  public Boolean isHasInfo() {
    return hasInfo;
  }

  public void setHasInfo(Boolean hasInfo) {
    this.hasInfo = hasInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPutModel linkPutModel = (LinkPutModel) o;
    return Objects.equals(this.id, linkPutModel.id) &&
        Objects.equals(this.title, linkPutModel.title) &&
        Objects.equals(this.url, linkPutModel.url) &&
        Objects.equals(this.description, linkPutModel.description) &&
        Objects.equals(this.type, linkPutModel.type) &&
        Objects.equals(this.hasInfo, linkPutModel.hasInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, url, description, type, hasInfo);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
