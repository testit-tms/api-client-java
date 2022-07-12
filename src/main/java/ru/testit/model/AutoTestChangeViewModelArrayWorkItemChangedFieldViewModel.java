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
import ru.testit.model.AutoTestChangeViewModel;
/**
 * AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-05T10:40:26.135191+03:00[Europe/Moscow]")
public class AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel {
  @SerializedName("oldValue")
  private List<AutoTestChangeViewModel> oldValue = null;

  @SerializedName("newValue")
  private List<AutoTestChangeViewModel> newValue = null;

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel oldValue(List<AutoTestChangeViewModel> oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel addOldValueItem(AutoTestChangeViewModel oldValueItem) {
    if (this.oldValue == null) {
      this.oldValue = new ArrayList<AutoTestChangeViewModel>();
    }
    this.oldValue.add(oldValueItem);
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @Schema(description = "")
  public List<AutoTestChangeViewModel> getOldValue() {
    return oldValue;
  }

  public void setOldValue(List<AutoTestChangeViewModel> oldValue) {
    this.oldValue = oldValue;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel newValue(List<AutoTestChangeViewModel> newValue) {
    this.newValue = newValue;
    return this;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel addNewValueItem(AutoTestChangeViewModel newValueItem) {
    if (this.newValue == null) {
      this.newValue = new ArrayList<AutoTestChangeViewModel>();
    }
    this.newValue.add(newValueItem);
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @Schema(description = "")
  public List<AutoTestChangeViewModel> getNewValue() {
    return newValue;
  }

  public void setNewValue(List<AutoTestChangeViewModel> newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel autoTestChangeViewModelArrayWorkItemChangedFieldViewModel = (AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, autoTestChangeViewModelArrayWorkItemChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, autoTestChangeViewModelArrayWorkItemChangedFieldViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel {\n");
    
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
