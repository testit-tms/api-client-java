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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * GetXlsxTestPointsByTestPlanModel
 */
@JsonPropertyOrder({
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_NAME,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_SECTION,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_PRIORITY,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_AUTOMATED,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_STATUS,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_DURATION,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_CREATION_DATE,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_AUTHOR,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_MODIFICATION_DATE,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_MODIFIED_BY,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_TAGS,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_INCLUDE_ITERATIONS,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_CUSTOM_ATTRIBUTES_IDS,
  GetXlsxTestPointsByTestPlanModel.JSON_PROPERTY_CONFIGURATION_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetXlsxTestPointsByTestPlanModel {
  public static final String JSON_PROPERTY_INCLUDE_NAME = "includeName";
  private Boolean includeName;

  public static final String JSON_PROPERTY_INCLUDE_SECTION = "includeSection";
  private Boolean includeSection;

  public static final String JSON_PROPERTY_INCLUDE_PRIORITY = "includePriority";
  private Boolean includePriority;

  public static final String JSON_PROPERTY_INCLUDE_AUTOMATED = "includeAutomated";
  private Boolean includeAutomated;

  public static final String JSON_PROPERTY_INCLUDE_STATUS = "includeStatus";
  private Boolean includeStatus;

  public static final String JSON_PROPERTY_INCLUDE_DURATION = "includeDuration";
  private Boolean includeDuration;

  public static final String JSON_PROPERTY_INCLUDE_CREATION_DATE = "includeCreationDate";
  private Boolean includeCreationDate;

  public static final String JSON_PROPERTY_INCLUDE_AUTHOR = "includeAuthor";
  private Boolean includeAuthor;

  public static final String JSON_PROPERTY_INCLUDE_MODIFICATION_DATE = "includeModificationDate";
  private Boolean includeModificationDate;

  public static final String JSON_PROPERTY_INCLUDE_MODIFIED_BY = "includeModifiedBy";
  private Boolean includeModifiedBy;

  public static final String JSON_PROPERTY_INCLUDE_TAGS = "includeTags";
  private Boolean includeTags;

  public static final String JSON_PROPERTY_INCLUDE_ITERATIONS = "includeIterations";
  private Boolean includeIterations;

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES_IDS = "customAttributesIds";
  private JsonNullable<List<UUID>> customAttributesIds = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_CONFIGURATION_IDS = "configurationIds";
  private JsonNullable<List<UUID>> configurationIds = JsonNullable.<List<UUID>>undefined();

  public GetXlsxTestPointsByTestPlanModel() { 
  }

  public GetXlsxTestPointsByTestPlanModel includeName(Boolean includeName) {
    this.includeName = includeName;
    return this;
  }

   /**
   * Get includeName
   * @return includeName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeName() {
    return includeName;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeName(Boolean includeName) {
    this.includeName = includeName;
  }


  public GetXlsxTestPointsByTestPlanModel includeSection(Boolean includeSection) {
    this.includeSection = includeSection;
    return this;
  }

   /**
   * Get includeSection
   * @return includeSection
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_SECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeSection() {
    return includeSection;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_SECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeSection(Boolean includeSection) {
    this.includeSection = includeSection;
  }


  public GetXlsxTestPointsByTestPlanModel includePriority(Boolean includePriority) {
    this.includePriority = includePriority;
    return this;
  }

   /**
   * Get includePriority
   * @return includePriority
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludePriority() {
    return includePriority;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludePriority(Boolean includePriority) {
    this.includePriority = includePriority;
  }


  public GetXlsxTestPointsByTestPlanModel includeAutomated(Boolean includeAutomated) {
    this.includeAutomated = includeAutomated;
    return this;
  }

   /**
   * Get includeAutomated
   * @return includeAutomated
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeAutomated() {
    return includeAutomated;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeAutomated(Boolean includeAutomated) {
    this.includeAutomated = includeAutomated;
  }


  public GetXlsxTestPointsByTestPlanModel includeStatus(Boolean includeStatus) {
    this.includeStatus = includeStatus;
    return this;
  }

   /**
   * Get includeStatus
   * @return includeStatus
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeStatus() {
    return includeStatus;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeStatus(Boolean includeStatus) {
    this.includeStatus = includeStatus;
  }


  public GetXlsxTestPointsByTestPlanModel includeDuration(Boolean includeDuration) {
    this.includeDuration = includeDuration;
    return this;
  }

   /**
   * Get includeDuration
   * @return includeDuration
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeDuration() {
    return includeDuration;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeDuration(Boolean includeDuration) {
    this.includeDuration = includeDuration;
  }


  public GetXlsxTestPointsByTestPlanModel includeCreationDate(Boolean includeCreationDate) {
    this.includeCreationDate = includeCreationDate;
    return this;
  }

   /**
   * Get includeCreationDate
   * @return includeCreationDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeCreationDate() {
    return includeCreationDate;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeCreationDate(Boolean includeCreationDate) {
    this.includeCreationDate = includeCreationDate;
  }


  public GetXlsxTestPointsByTestPlanModel includeAuthor(Boolean includeAuthor) {
    this.includeAuthor = includeAuthor;
    return this;
  }

   /**
   * Get includeAuthor
   * @return includeAuthor
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeAuthor() {
    return includeAuthor;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeAuthor(Boolean includeAuthor) {
    this.includeAuthor = includeAuthor;
  }


  public GetXlsxTestPointsByTestPlanModel includeModificationDate(Boolean includeModificationDate) {
    this.includeModificationDate = includeModificationDate;
    return this;
  }

   /**
   * Get includeModificationDate
   * @return includeModificationDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_MODIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeModificationDate() {
    return includeModificationDate;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MODIFICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeModificationDate(Boolean includeModificationDate) {
    this.includeModificationDate = includeModificationDate;
  }


  public GetXlsxTestPointsByTestPlanModel includeModifiedBy(Boolean includeModifiedBy) {
    this.includeModifiedBy = includeModifiedBy;
    return this;
  }

   /**
   * Get includeModifiedBy
   * @return includeModifiedBy
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeModifiedBy() {
    return includeModifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeModifiedBy(Boolean includeModifiedBy) {
    this.includeModifiedBy = includeModifiedBy;
  }


  public GetXlsxTestPointsByTestPlanModel includeTags(Boolean includeTags) {
    this.includeTags = includeTags;
    return this;
  }

   /**
   * Get includeTags
   * @return includeTags
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeTags() {
    return includeTags;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }


  public GetXlsxTestPointsByTestPlanModel includeIterations(Boolean includeIterations) {
    this.includeIterations = includeIterations;
    return this;
  }

   /**
   * Get includeIterations
   * @return includeIterations
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_ITERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIncludeIterations() {
    return includeIterations;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_ITERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeIterations(Boolean includeIterations) {
    this.includeIterations = includeIterations;
  }


  public GetXlsxTestPointsByTestPlanModel customAttributesIds(List<UUID> customAttributesIds) {
    this.customAttributesIds = JsonNullable.<List<UUID>>of(customAttributesIds);
    return this;
  }

  public GetXlsxTestPointsByTestPlanModel addCustomAttributesIdsItem(UUID customAttributesIdsItem) {
    if (this.customAttributesIds == null || !this.customAttributesIds.isPresent()) {
      this.customAttributesIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.customAttributesIds.get().add(customAttributesIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customAttributesIds
   * @return customAttributesIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<UUID> getCustomAttributesIds() {
        return customAttributesIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getCustomAttributesIds_JsonNullable() {
    return customAttributesIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES_IDS)
  public void setCustomAttributesIds_JsonNullable(JsonNullable<List<UUID>> customAttributesIds) {
    this.customAttributesIds = customAttributesIds;
  }

  public void setCustomAttributesIds(List<UUID> customAttributesIds) {
    this.customAttributesIds = JsonNullable.<List<UUID>>of(customAttributesIds);
  }


  public GetXlsxTestPointsByTestPlanModel configurationIds(List<UUID> configurationIds) {
    this.configurationIds = JsonNullable.<List<UUID>>of(configurationIds);
    return this;
  }

  public GetXlsxTestPointsByTestPlanModel addConfigurationIdsItem(UUID configurationIdsItem) {
    if (this.configurationIds == null || !this.configurationIds.isPresent()) {
      this.configurationIds = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.configurationIds.get().add(configurationIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get configurationIds
   * @return configurationIds
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<UUID> getConfigurationIds() {
        return configurationIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIGURATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getConfigurationIds_JsonNullable() {
    return configurationIds;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_IDS)
  public void setConfigurationIds_JsonNullable(JsonNullable<List<UUID>> configurationIds) {
    this.configurationIds = configurationIds;
  }

  public void setConfigurationIds(List<UUID> configurationIds) {
    this.configurationIds = JsonNullable.<List<UUID>>of(configurationIds);
  }


  /**
   * Return true if this GetXlsxTestPointsByTestPlanModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxTestPointsByTestPlanModel getXlsxTestPointsByTestPlanModel = (GetXlsxTestPointsByTestPlanModel) o;
    return Objects.equals(this.includeName, getXlsxTestPointsByTestPlanModel.includeName) &&
        Objects.equals(this.includeSection, getXlsxTestPointsByTestPlanModel.includeSection) &&
        Objects.equals(this.includePriority, getXlsxTestPointsByTestPlanModel.includePriority) &&
        Objects.equals(this.includeAutomated, getXlsxTestPointsByTestPlanModel.includeAutomated) &&
        Objects.equals(this.includeStatus, getXlsxTestPointsByTestPlanModel.includeStatus) &&
        Objects.equals(this.includeDuration, getXlsxTestPointsByTestPlanModel.includeDuration) &&
        Objects.equals(this.includeCreationDate, getXlsxTestPointsByTestPlanModel.includeCreationDate) &&
        Objects.equals(this.includeAuthor, getXlsxTestPointsByTestPlanModel.includeAuthor) &&
        Objects.equals(this.includeModificationDate, getXlsxTestPointsByTestPlanModel.includeModificationDate) &&
        Objects.equals(this.includeModifiedBy, getXlsxTestPointsByTestPlanModel.includeModifiedBy) &&
        Objects.equals(this.includeTags, getXlsxTestPointsByTestPlanModel.includeTags) &&
        Objects.equals(this.includeIterations, getXlsxTestPointsByTestPlanModel.includeIterations) &&
        equalsNullable(this.customAttributesIds, getXlsxTestPointsByTestPlanModel.customAttributesIds) &&
        equalsNullable(this.configurationIds, getXlsxTestPointsByTestPlanModel.configurationIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeName, includeSection, includePriority, includeAutomated, includeStatus, includeDuration, includeCreationDate, includeAuthor, includeModificationDate, includeModifiedBy, includeTags, includeIterations, hashCodeNullable(customAttributesIds), hashCodeNullable(configurationIds));
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
    sb.append("class GetXlsxTestPointsByTestPlanModel {\n");
    sb.append("    includeName: ").append(toIndentedString(includeName)).append("\n");
    sb.append("    includeSection: ").append(toIndentedString(includeSection)).append("\n");
    sb.append("    includePriority: ").append(toIndentedString(includePriority)).append("\n");
    sb.append("    includeAutomated: ").append(toIndentedString(includeAutomated)).append("\n");
    sb.append("    includeStatus: ").append(toIndentedString(includeStatus)).append("\n");
    sb.append("    includeDuration: ").append(toIndentedString(includeDuration)).append("\n");
    sb.append("    includeCreationDate: ").append(toIndentedString(includeCreationDate)).append("\n");
    sb.append("    includeAuthor: ").append(toIndentedString(includeAuthor)).append("\n");
    sb.append("    includeModificationDate: ").append(toIndentedString(includeModificationDate)).append("\n");
    sb.append("    includeModifiedBy: ").append(toIndentedString(includeModifiedBy)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    includeIterations: ").append(toIndentedString(includeIterations)).append("\n");
    sb.append("    customAttributesIds: ").append(toIndentedString(customAttributesIds)).append("\n");
    sb.append("    configurationIds: ").append(toIndentedString(configurationIds)).append("\n");
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

