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
import java.util.Arrays;
import org.openapitools.client.model.CustomerLinkage;
import org.openapitools.client.model.CustomersRelationship;

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

import org.openapitools.client.JSON;

/**
 * CreateDepositAccountRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDepositAccountRelationships {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerLinkage customer;

  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private CustomersRelationship customers;

  public CreateDepositAccountRelationships() {
  }

  public CreateDepositAccountRelationships customer(CustomerLinkage customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public CustomerLinkage getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerLinkage customer) {
    this.customer = customer;
  }


  public CreateDepositAccountRelationships customers(CustomersRelationship customers) {
    
    this.customers = customers;
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @javax.annotation.Nullable
  public CustomersRelationship getCustomers() {
    return customers;
  }


  public void setCustomers(CustomersRelationship customers) {
    this.customers = customers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDepositAccountRelationships createDepositAccountRelationships = (CreateDepositAccountRelationships) o;
    return Objects.equals(this.customer, createDepositAccountRelationships.customer) &&
        Objects.equals(this.customers, createDepositAccountRelationships.customers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDepositAccountRelationships {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("customers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDepositAccountRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDepositAccountRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDepositAccountRelationships is not found in the empty JSON string", CreateDepositAccountRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDepositAccountRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDepositAccountRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        CustomerLinkage.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `customers`
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        CustomersRelationship.validateJsonElement(jsonObj.get("customers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDepositAccountRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDepositAccountRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDepositAccountRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDepositAccountRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDepositAccountRelationships>() {
           @Override
           public void write(JsonWriter out, CreateDepositAccountRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDepositAccountRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDepositAccountRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDepositAccountRelationships
  * @throws IOException if the JSON string is invalid with respect to CreateDepositAccountRelationships
  */
  public static CreateDepositAccountRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDepositAccountRelationships.class);
  }

 /**
  * Convert an instance of CreateDepositAccountRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

