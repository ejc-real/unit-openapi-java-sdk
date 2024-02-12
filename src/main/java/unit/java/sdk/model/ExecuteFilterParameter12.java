/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package unit.java.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ExecuteFilterParameter12
 */
@JsonPropertyOrder({
  ExecuteFilterParameter12.JSON_PROPERTY_SINCE,
  ExecuteFilterParameter12.JSON_PROPERTY_UNTIL,
  ExecuteFilterParameter12.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter12 {
  public static final String JSON_PROPERTY_SINCE = "since";
  private String since;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private String until;

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<String> type;

  public ExecuteFilterParameter12() { 
  }

  public ExecuteFilterParameter12 since(String since) {
    this.since = since;
    return this;
  }

   /**
   * Get since
   * @return since
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSince() {
    return since;
  }


  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSince(String since) {
    this.since = since;
  }


  public ExecuteFilterParameter12 until(String until) {
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUntil() {
    return until;
  }


  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUntil(String until) {
    this.until = until;
  }


  public ExecuteFilterParameter12 type(List<String> type) {
    this.type = type;
    return this;
  }

  public ExecuteFilterParameter12 addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(List<String> type) {
    this.type = type;
  }


  /**
   * Return true if this execute_filter_parameter_12 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter12 executeFilterParameter12 = (ExecuteFilterParameter12) o;
    return Objects.equals(this.since, executeFilterParameter12.since) &&
        Objects.equals(this.until, executeFilterParameter12.until) &&
        Objects.equals(this.type, executeFilterParameter12.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(since, until, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter12 {\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `since` to the URL query string
    if (getSince() != null) {
      joiner.add(String.format("%ssince%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `until` to the URL query string
    if (getUntil() != null) {
      joiner.add(String.format("%suntil%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUntil()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      for (int i = 0; i < getType().size(); i++) {
        joiner.add(String.format("%stype%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getType().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

