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
import ru.testit.client.model.SetOfAttachmentIds;
import ru.testit.client.model.SetOfLinks;
import ru.testit.client.model.TestRunSelectionModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * TestRunUpdateMultipleModel
 */
@JsonPropertyOrder({
  TestRunUpdateMultipleModel.JSON_PROPERTY_SELECT_MODEL,
  TestRunUpdateMultipleModel.JSON_PROPERTY_DESCRIPTION,
  TestRunUpdateMultipleModel.JSON_PROPERTY_ATTACHMENT_UPDATE_SCHEME,
  TestRunUpdateMultipleModel.JSON_PROPERTY_LINK_UPDATE_SCHEME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunUpdateMultipleModel {
  public static final String JSON_PROPERTY_SELECT_MODEL = "selectModel";
  private TestRunSelectionModel selectModel;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ATTACHMENT_UPDATE_SCHEME = "attachmentUpdateScheme";
  private JsonNullable<SetOfAttachmentIds> attachmentUpdateScheme = JsonNullable.<SetOfAttachmentIds>undefined();

  public static final String JSON_PROPERTY_LINK_UPDATE_SCHEME = "linkUpdateScheme";
  private JsonNullable<SetOfLinks> linkUpdateScheme = JsonNullable.<SetOfLinks>undefined();

  public TestRunUpdateMultipleModel() { 
  }

  public TestRunUpdateMultipleModel selectModel(TestRunSelectionModel selectModel) {
    this.selectModel = selectModel;
    return this;
  }

   /**
   * Get selectModel
   * @return selectModel
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SELECT_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestRunSelectionModel getSelectModel() {
    return selectModel;
  }


  @JsonProperty(JSON_PROPERTY_SELECT_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelectModel(TestRunSelectionModel selectModel) {
    this.selectModel = selectModel;
  }


  public TestRunUpdateMultipleModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
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


  public TestRunUpdateMultipleModel attachmentUpdateScheme(SetOfAttachmentIds attachmentUpdateScheme) {
    this.attachmentUpdateScheme = JsonNullable.<SetOfAttachmentIds>of(attachmentUpdateScheme);
    return this;
  }

   /**
   * Get attachmentUpdateScheme
   * @return attachmentUpdateScheme
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public SetOfAttachmentIds getAttachmentUpdateScheme() {
        return attachmentUpdateScheme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENT_UPDATE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SetOfAttachmentIds> getAttachmentUpdateScheme_JsonNullable() {
    return attachmentUpdateScheme;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_UPDATE_SCHEME)
  public void setAttachmentUpdateScheme_JsonNullable(JsonNullable<SetOfAttachmentIds> attachmentUpdateScheme) {
    this.attachmentUpdateScheme = attachmentUpdateScheme;
  }

  public void setAttachmentUpdateScheme(SetOfAttachmentIds attachmentUpdateScheme) {
    this.attachmentUpdateScheme = JsonNullable.<SetOfAttachmentIds>of(attachmentUpdateScheme);
  }


  public TestRunUpdateMultipleModel linkUpdateScheme(SetOfLinks linkUpdateScheme) {
    this.linkUpdateScheme = JsonNullable.<SetOfLinks>of(linkUpdateScheme);
    return this;
  }

   /**
   * Get linkUpdateScheme
   * @return linkUpdateScheme
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public SetOfLinks getLinkUpdateScheme() {
        return linkUpdateScheme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK_UPDATE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SetOfLinks> getLinkUpdateScheme_JsonNullable() {
    return linkUpdateScheme;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK_UPDATE_SCHEME)
  public void setLinkUpdateScheme_JsonNullable(JsonNullable<SetOfLinks> linkUpdateScheme) {
    this.linkUpdateScheme = linkUpdateScheme;
  }

  public void setLinkUpdateScheme(SetOfLinks linkUpdateScheme) {
    this.linkUpdateScheme = JsonNullable.<SetOfLinks>of(linkUpdateScheme);
  }


  /**
   * Return true if this TestRunUpdateMultipleModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunUpdateMultipleModel testRunUpdateMultipleModel = (TestRunUpdateMultipleModel) o;
    return Objects.equals(this.selectModel, testRunUpdateMultipleModel.selectModel) &&
        equalsNullable(this.description, testRunUpdateMultipleModel.description) &&
        equalsNullable(this.attachmentUpdateScheme, testRunUpdateMultipleModel.attachmentUpdateScheme) &&
        equalsNullable(this.linkUpdateScheme, testRunUpdateMultipleModel.linkUpdateScheme);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectModel, hashCodeNullable(description), hashCodeNullable(attachmentUpdateScheme), hashCodeNullable(linkUpdateScheme));
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
    sb.append("class TestRunUpdateMultipleModel {\n");
    sb.append("    selectModel: ").append(toIndentedString(selectModel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attachmentUpdateScheme: ").append(toIndentedString(attachmentUpdateScheme)).append("\n");
    sb.append("    linkUpdateScheme: ").append(toIndentedString(linkUpdateScheme)).append("\n");
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

