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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.testit.client.invoker.JSON;


/**
 * Specifies an autotest range of creation date to search for
 */
@JsonPropertyOrder({
  AutotestFilterModelCreatedDate.JSON_PROPERTY_FROM,
  AutotestFilterModelCreatedDate.JSON_PROPERTY_TO
})
@JsonTypeName("AutotestFilterModel_createdDate")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutotestFilterModelCreatedDate {
  public static final String JSON_PROPERTY_FROM = "from";
  private JsonNullable<OffsetDateTime> from = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TO = "to";
  private JsonNullable<OffsetDateTime> to = JsonNullable.<OffsetDateTime>undefined();

  public AutotestFilterModelCreatedDate() { 
  }

  public AutotestFilterModelCreatedDate from(OffsetDateTime from) {
    this.from = JsonNullable.<OffsetDateTime>of(from);
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getFrom() {
        return from.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getFrom_JsonNullable() {
    return from;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM)
  public void setFrom_JsonNullable(JsonNullable<OffsetDateTime> from) {
    this.from = from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = JsonNullable.<OffsetDateTime>of(from);
  }


  public AutotestFilterModelCreatedDate to(OffsetDateTime to) {
    this.to = JsonNullable.<OffsetDateTime>of(to);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getTo() {
        return to.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTo_JsonNullable() {
    return to;
  }
  
  @JsonProperty(JSON_PROPERTY_TO)
  public void setTo_JsonNullable(JsonNullable<OffsetDateTime> to) {
    this.to = to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = JsonNullable.<OffsetDateTime>of(to);
  }


  /**
   * Return true if this AutotestFilterModel_createdDate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutotestFilterModelCreatedDate autotestFilterModelCreatedDate = (AutotestFilterModelCreatedDate) o;
    return equalsNullable(this.from, autotestFilterModelCreatedDate.from) &&
        equalsNullable(this.to, autotestFilterModelCreatedDate.to);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(from), hashCodeNullable(to));
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
    sb.append("class AutotestFilterModelCreatedDate {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

