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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * CustomAttributeTemplatePutModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class CustomAttributeTemplatePutModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("customAttributeIds")
  private List<UUID> customAttributeIds = null;

  @SerializedName("name")
  private String name = null;

  public CustomAttributeTemplatePutModel id(UUID id) {
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

  public CustomAttributeTemplatePutModel customAttributeIds(List<UUID> customAttributeIds) {
    this.customAttributeIds = customAttributeIds;
    return this;
  }

  public CustomAttributeTemplatePutModel addCustomAttributeIdsItem(UUID customAttributeIdsItem) {
    if (this.customAttributeIds == null) {
      this.customAttributeIds = new ArrayList<UUID>();
    }
    this.customAttributeIds.add(customAttributeIdsItem);
    return this;
  }

   /**
   * Get customAttributeIds
   * @return customAttributeIds
  **/
  @Schema(description = "")
  public List<UUID> getCustomAttributeIds() {
    return customAttributeIds;
  }

  public void setCustomAttributeIds(List<UUID> customAttributeIds) {
    this.customAttributeIds = customAttributeIds;
  }

  public CustomAttributeTemplatePutModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
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
    CustomAttributeTemplatePutModel customAttributeTemplatePutModel = (CustomAttributeTemplatePutModel) o;
    return Objects.equals(this.id, customAttributeTemplatePutModel.id) &&
        Objects.equals(this.customAttributeIds, customAttributeTemplatePutModel.customAttributeIds) &&
        Objects.equals(this.name, customAttributeTemplatePutModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customAttributeIds, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributeTemplatePutModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customAttributeIds: ").append(toIndentedString(customAttributeIds)).append("\n");
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
