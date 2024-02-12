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
import unit.java.sdk.model.ApplicationFormPrefill;
import unit.java.sdk.model.ApplicationFormSettingsOverride;
import unit.java.sdk.model.RequireIdVerification;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateApplicationFormDataAttributes
 */
@JsonPropertyOrder({
  CreateApplicationFormDataAttributes.JSON_PROPERTY_TAGS,
  CreateApplicationFormDataAttributes.JSON_PROPERTY_APPLICANT_DETAILS,
  CreateApplicationFormDataAttributes.JSON_PROPERTY_SETTINGS_OVERRIDE,
  CreateApplicationFormDataAttributes.JSON_PROPERTY_REQUIRE_ID_VERIFICATION,
  CreateApplicationFormDataAttributes.JSON_PROPERTY_ALLOWED_APPLICATION_TYPES,
  CreateApplicationFormDataAttributes.JSON_PROPERTY_LANG,
  CreateApplicationFormDataAttributes.JSON_PROPERTY_HIDE_APPLICATION_PROGRESS_TRACKER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApplicationFormDataAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_APPLICANT_DETAILS = "applicantDetails";
  private ApplicationFormPrefill applicantDetails;

  public static final String JSON_PROPERTY_SETTINGS_OVERRIDE = "settingsOverride";
  private ApplicationFormSettingsOverride settingsOverride;

  public static final String JSON_PROPERTY_REQUIRE_ID_VERIFICATION = "requireIdVerification";
  private RequireIdVerification requireIdVerification;

  /**
   * Gets or Sets allowedApplicationTypes
   */
  public enum AllowedApplicationTypesEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business"),
    
    SOLEPROPRIETORSHIP("SoleProprietorship");

    private String value;

    AllowedApplicationTypesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AllowedApplicationTypesEnum fromValue(String value) {
      for (AllowedApplicationTypesEnum b : AllowedApplicationTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALLOWED_APPLICATION_TYPES = "allowedApplicationTypes";
  private List<AllowedApplicationTypesEnum> allowedApplicationTypes;

  /**
   * Gets or Sets lang
   */
  public enum LangEnum {
    EN("en"),
    
    ES("es");

    private String value;

    LangEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LangEnum fromValue(String value) {
      for (LangEnum b : LangEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LANG = "lang";
  private LangEnum lang;

  public static final String JSON_PROPERTY_HIDE_APPLICATION_PROGRESS_TRACKER = "hideApplicationProgressTracker";
  private Boolean hideApplicationProgressTracker;

  public CreateApplicationFormDataAttributes() { 
  }

  public CreateApplicationFormDataAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public CreateApplicationFormDataAttributes applicantDetails(ApplicationFormPrefill applicantDetails) {
    this.applicantDetails = applicantDetails;
    return this;
  }

   /**
   * Get applicantDetails
   * @return applicantDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplicationFormPrefill getApplicantDetails() {
    return applicantDetails;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicantDetails(ApplicationFormPrefill applicantDetails) {
    this.applicantDetails = applicantDetails;
  }


  public CreateApplicationFormDataAttributes settingsOverride(ApplicationFormSettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
    return this;
  }

   /**
   * Get settingsOverride
   * @return settingsOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplicationFormSettingsOverride getSettingsOverride() {
    return settingsOverride;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettingsOverride(ApplicationFormSettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
  }


  public CreateApplicationFormDataAttributes requireIdVerification(RequireIdVerification requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
    return this;
  }

   /**
   * Get requireIdVerification
   * @return requireIdVerification
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_ID_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequireIdVerification getRequireIdVerification() {
    return requireIdVerification;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_ID_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireIdVerification(RequireIdVerification requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
  }


  public CreateApplicationFormDataAttributes allowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
    return this;
  }

  public CreateApplicationFormDataAttributes addAllowedApplicationTypesItem(AllowedApplicationTypesEnum allowedApplicationTypesItem) {
    if (this.allowedApplicationTypes == null) {
      this.allowedApplicationTypes = new ArrayList<>();
    }
    this.allowedApplicationTypes.add(allowedApplicationTypesItem);
    return this;
  }

   /**
   * Get allowedApplicationTypes
   * @return allowedApplicationTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_APPLICATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AllowedApplicationTypesEnum> getAllowedApplicationTypes() {
    return allowedApplicationTypes;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_APPLICATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
  }


  public CreateApplicationFormDataAttributes lang(LangEnum lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LangEnum getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLang(LangEnum lang) {
    this.lang = lang;
  }


  public CreateApplicationFormDataAttributes hideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
    return this;
  }

   /**
   * Get hideApplicationProgressTracker
   * @return hideApplicationProgressTracker
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_APPLICATION_PROGRESS_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideApplicationProgressTracker() {
    return hideApplicationProgressTracker;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_APPLICATION_PROGRESS_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
  }


  /**
   * Return true if this createApplicationForm_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicationFormDataAttributes createApplicationFormDataAttributes = (CreateApplicationFormDataAttributes) o;
    return Objects.equals(this.tags, createApplicationFormDataAttributes.tags) &&
        Objects.equals(this.applicantDetails, createApplicationFormDataAttributes.applicantDetails) &&
        Objects.equals(this.settingsOverride, createApplicationFormDataAttributes.settingsOverride) &&
        Objects.equals(this.requireIdVerification, createApplicationFormDataAttributes.requireIdVerification) &&
        Objects.equals(this.allowedApplicationTypes, createApplicationFormDataAttributes.allowedApplicationTypes) &&
        Objects.equals(this.lang, createApplicationFormDataAttributes.lang) &&
        Objects.equals(this.hideApplicationProgressTracker, createApplicationFormDataAttributes.hideApplicationProgressTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, applicantDetails, settingsOverride, requireIdVerification, allowedApplicationTypes, lang, hideApplicationProgressTracker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicationFormDataAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applicantDetails: ").append(toIndentedString(applicantDetails)).append("\n");
    sb.append("    settingsOverride: ").append(toIndentedString(settingsOverride)).append("\n");
    sb.append("    requireIdVerification: ").append(toIndentedString(requireIdVerification)).append("\n");
    sb.append("    allowedApplicationTypes: ").append(toIndentedString(allowedApplicationTypes)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    hideApplicationProgressTracker: ").append(toIndentedString(hideApplicationProgressTracker)).append("\n");
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

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `applicantDetails` to the URL query string
    if (getApplicantDetails() != null) {
      joiner.add(getApplicantDetails().toUrlQueryString(prefix + "applicantDetails" + suffix));
    }

    // add `settingsOverride` to the URL query string
    if (getSettingsOverride() != null) {
      joiner.add(getSettingsOverride().toUrlQueryString(prefix + "settingsOverride" + suffix));
    }

    // add `requireIdVerification` to the URL query string
    if (getRequireIdVerification() != null) {
      joiner.add(getRequireIdVerification().toUrlQueryString(prefix + "requireIdVerification" + suffix));
    }

    // add `allowedApplicationTypes` to the URL query string
    if (getAllowedApplicationTypes() != null) {
      for (int i = 0; i < getAllowedApplicationTypes().size(); i++) {
        joiner.add(String.format("%sallowedApplicationTypes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedApplicationTypes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `lang` to the URL query string
    if (getLang() != null) {
      joiner.add(String.format("%slang%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLang()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hideApplicationProgressTracker` to the URL query string
    if (getHideApplicationProgressTracker() != null) {
      joiner.add(String.format("%shideApplicationProgressTracker%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHideApplicationProgressTracker()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

