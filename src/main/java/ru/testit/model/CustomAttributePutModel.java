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
import ru.testit.model.CustomAttributeOptionModel;
import ru.testit.model.CustomAttributeTypesEnum;
/**
 * CustomAttributePutModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class CustomAttributePutModel {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("options")
  private List<CustomAttributeOptionModel> options = null;

  @SerializedName("type")
  private CustomAttributeTypesEnum type = null;

  @SerializedName("isDeleted")
  private Boolean isDeleted = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("isGlobal")
  private Boolean isGlobal = null;

  public CustomAttributePutModel id(UUID id) {
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

  public CustomAttributePutModel options(List<CustomAttributeOptionModel> options) {
    this.options = options;
    return this;
  }

  public CustomAttributePutModel addOptionsItem(CustomAttributeOptionModel optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<CustomAttributeOptionModel>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public List<CustomAttributeOptionModel> getOptions() {
    return options;
  }

  public void setOptions(List<CustomAttributeOptionModel> options) {
    this.options = options;
  }

  public CustomAttributePutModel type(CustomAttributeTypesEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CustomAttributeTypesEnum getType() {
    return type;
  }

  public void setType(CustomAttributeTypesEnum type) {
    this.type = type;
  }

  public CustomAttributePutModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CustomAttributePutModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Original estimate", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomAttributePutModel enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(example = "true", description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CustomAttributePutModel required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @Schema(example = "true", description = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CustomAttributePutModel isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @Schema(description = "")
  public Boolean isIsGlobal() {
    return isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributePutModel customAttributePutModel = (CustomAttributePutModel) o;
    return Objects.equals(this.id, customAttributePutModel.id) &&
        Objects.equals(this.options, customAttributePutModel.options) &&
        Objects.equals(this.type, customAttributePutModel.type) &&
        Objects.equals(this.isDeleted, customAttributePutModel.isDeleted) &&
        Objects.equals(this.name, customAttributePutModel.name) &&
        Objects.equals(this.enabled, customAttributePutModel.enabled) &&
        Objects.equals(this.required, customAttributePutModel.required) &&
        Objects.equals(this.isGlobal, customAttributePutModel.isGlobal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, options, type, isDeleted, name, enabled, required, isGlobal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributePutModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
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
