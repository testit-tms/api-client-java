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
import ru.testit.client.model.PeriodViewModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * PeriodViewModelChangedFieldViewModel
 */
@JsonPropertyOrder({
  PeriodViewModelChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  PeriodViewModelChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeriodViewModelChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private JsonNullable<PeriodViewModel> oldValue = JsonNullable.<PeriodViewModel>undefined();

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private JsonNullable<PeriodViewModel> newValue = JsonNullable.<PeriodViewModel>undefined();

  public PeriodViewModelChangedFieldViewModel() { 
  }

  public PeriodViewModelChangedFieldViewModel oldValue(PeriodViewModel oldValue) {
    this.oldValue = JsonNullable.<PeriodViewModel>of(oldValue);
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public PeriodViewModel getOldValue() {
        return oldValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PeriodViewModel> getOldValue_JsonNullable() {
    return oldValue;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  public void setOldValue_JsonNullable(JsonNullable<PeriodViewModel> oldValue) {
    this.oldValue = oldValue;
  }

  public void setOldValue(PeriodViewModel oldValue) {
    this.oldValue = JsonNullable.<PeriodViewModel>of(oldValue);
  }


  public PeriodViewModelChangedFieldViewModel newValue(PeriodViewModel newValue) {
    this.newValue = JsonNullable.<PeriodViewModel>of(newValue);
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public PeriodViewModel getNewValue() {
        return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PeriodViewModel> getNewValue_JsonNullable() {
    return newValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<PeriodViewModel> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(PeriodViewModel newValue) {
    this.newValue = JsonNullable.<PeriodViewModel>of(newValue);
  }


  /**
   * Return true if this PeriodViewModelChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodViewModelChangedFieldViewModel periodViewModelChangedFieldViewModel = (PeriodViewModelChangedFieldViewModel) o;
    return equalsNullable(this.oldValue, periodViewModelChangedFieldViewModel.oldValue) &&
        equalsNullable(this.newValue, periodViewModelChangedFieldViewModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(oldValue), hashCodeNullable(newValue));
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
    sb.append("class PeriodViewModelChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

