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
/**
 * AutoTestNamespaceModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-12T16:29:55.695125+03:00[Europe/Moscow]")
public class AutoTestNamespaceModel {
  @SerializedName("name")
  private String name = null;

  @SerializedName("classes")
  private List<String> classes = null;

  public AutoTestNamespaceModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "WebApi.Core.Tests", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AutoTestNamespaceModel classes(List<String> classes) {
    this.classes = classes;
    return this;
  }

  public AutoTestNamespaceModel addClassesItem(String classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<String>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Get classes
   * @return classes
  **/
  @Schema(description = "")
  public List<String> getClasses() {
    return classes;
  }

  public void setClasses(List<String> classes) {
    this.classes = classes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestNamespaceModel autoTestNamespaceModel = (AutoTestNamespaceModel) o;
    return Objects.equals(this.name, autoTestNamespaceModel.name) &&
        Objects.equals(this.classes, autoTestNamespaceModel.classes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, classes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoTestNamespaceModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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
