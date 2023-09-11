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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * AutoTestNamespaceModel
 */
@JsonPropertyOrder({
  AutoTestNamespaceModel.JSON_PROPERTY_NAME,
  AutoTestNamespaceModel.JSON_PROPERTY_CLASSES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestNamespaceModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLASSES = "classes";
  private JsonNullable<Set<String>> classes = JsonNullable.<Set<String>>undefined();

  public AutoTestNamespaceModel() { 
  }

  public AutoTestNamespaceModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public AutoTestNamespaceModel classes(Set<String> classes) {
    this.classes = JsonNullable.<Set<String>>of(classes);
    return this;
  }

  public AutoTestNamespaceModel addClassesItem(String classesItem) {
    if (this.classes == null || !this.classes.isPresent()) {
      this.classes = JsonNullable.<Set<String>>of(new LinkedHashSet<>());
    }
    try {
      this.classes.get().add(classesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get classes
   * @return classes
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Set<String> getClasses() {
        return classes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<String>> getClasses_JsonNullable() {
    return classes;
  }
  
  @JsonProperty(JSON_PROPERTY_CLASSES)
  public void setClasses_JsonNullable(JsonNullable<Set<String>> classes) {
    this.classes = classes;
  }

  public void setClasses(Set<String> classes) {
    this.classes = JsonNullable.<Set<String>>of(classes);
  }


  /**
   * Return true if this AutoTestNamespaceModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestNamespaceModel autoTestNamespaceModel = (AutoTestNamespaceModel) o;
    return equalsNullable(this.name, autoTestNamespaceModel.name) &&
        equalsNullable(this.classes, autoTestNamespaceModel.classes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(classes));
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

