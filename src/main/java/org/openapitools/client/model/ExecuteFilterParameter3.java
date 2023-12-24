/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.openapitools.client.JSON;
import org.openapitools.client.Pair;

/**
 * ExecuteFilterParameter3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter3 {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("Active"),
    
    ARCHIVED("Archived");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<StatusEnum> status;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public ExecuteFilterParameter3() {
  }

  public ExecuteFilterParameter3 query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public ExecuteFilterParameter3 status(List<StatusEnum> status) {
    
    this.status = status;
    return this;
  }

  public ExecuteFilterParameter3 addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public List<StatusEnum> getStatus() {
    return status;
  }


  public void setStatus(List<StatusEnum> status) {
    this.status = status;
  }


  public ExecuteFilterParameter3 email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ExecuteFilterParameter3 tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ExecuteFilterParameter3 putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter3 executeFilterParameter3 = (ExecuteFilterParameter3) o;
    return Objects.equals(this.query, executeFilterParameter3.query) &&
        Objects.equals(this.status, executeFilterParameter3.status) &&
        Objects.equals(this.email, executeFilterParameter3.email) &&
        Objects.equals(this.tags, executeFilterParameter3.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, status, email, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter3 {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("query");
    openapiFields.add("status");
    openapiFields.add("email");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter3
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter3.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter3 is not found in the empty JSON string", ExecuteFilterParameter3.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter3` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter3.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter3>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter3 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter3
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter3
  */
  public static ExecuteFilterParameter3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter3.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }

  public List<Pair> toParams(){
    List<Pair> params = new ArrayList<>();

    if(this.email != null){
      params.add(new Pair("filter[email]", this.email));
    }

    if(this.query != null){
      params.add(new Pair("filter[query]", this.query));
    }

    if(this.status != null){
      int i=0;
      for (StatusEnum s:this.status) {
        params.add(new Pair(String.format("filter[status][%s]", i), s.getValue()));
        i++;
      }
    }

    if(this.tags != null){
      String tagsAsString = this.tags.keySet().stream()
              .map(key -> key + ":" + this.tags.get(key))
              .collect(Collectors.joining(", ", "{", "}"));
      params.add(new Pair("filter[tags]", tagsAsString));
    }

    return params;
  }
}

