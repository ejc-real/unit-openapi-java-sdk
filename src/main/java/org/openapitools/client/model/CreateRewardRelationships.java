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
import org.openapitools.client.model.ReceivedPaymentRelationshipsReceivePaymentTransaction;
import org.openapitools.client.model.Relationship;

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
 * CreateRewardRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRewardRelationships {
  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT = "fundingAccount";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT)
  private Relationship fundingAccount;

  public static final String SERIALIZED_NAME_RECEIVING_ACCOUNT = "receivingAccount";
  @SerializedName(SERIALIZED_NAME_RECEIVING_ACCOUNT)
  private Relationship receivingAccount;

  public static final String SERIALIZED_NAME_REWARDED_TRANSACTION = "rewardedTransaction";
  @SerializedName(SERIALIZED_NAME_REWARDED_TRANSACTION)
  private ReceivedPaymentRelationshipsReceivePaymentTransaction rewardedTransaction;

  public CreateRewardRelationships() {
  }

  public CreateRewardRelationships fundingAccount(Relationship fundingAccount) {
    
    this.fundingAccount = fundingAccount;
    return this;
  }

   /**
   * Get fundingAccount
   * @return fundingAccount
  **/
  @javax.annotation.Nullable
  public Relationship getFundingAccount() {
    return fundingAccount;
  }


  public void setFundingAccount(Relationship fundingAccount) {
    this.fundingAccount = fundingAccount;
  }


  public CreateRewardRelationships receivingAccount(Relationship receivingAccount) {
    
    this.receivingAccount = receivingAccount;
    return this;
  }

   /**
   * Get receivingAccount
   * @return receivingAccount
  **/
  @javax.annotation.Nonnull
  public Relationship getReceivingAccount() {
    return receivingAccount;
  }


  public void setReceivingAccount(Relationship receivingAccount) {
    this.receivingAccount = receivingAccount;
  }


  public CreateRewardRelationships rewardedTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction rewardedTransaction) {
    
    this.rewardedTransaction = rewardedTransaction;
    return this;
  }

   /**
   * Get rewardedTransaction
   * @return rewardedTransaction
  **/
  @javax.annotation.Nullable
  public ReceivedPaymentRelationshipsReceivePaymentTransaction getRewardedTransaction() {
    return rewardedTransaction;
  }


  public void setRewardedTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction rewardedTransaction) {
    this.rewardedTransaction = rewardedTransaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRewardRelationships createRewardRelationships = (CreateRewardRelationships) o;
    return Objects.equals(this.fundingAccount, createRewardRelationships.fundingAccount) &&
        Objects.equals(this.receivingAccount, createRewardRelationships.receivingAccount) &&
        Objects.equals(this.rewardedTransaction, createRewardRelationships.rewardedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingAccount, receivingAccount, rewardedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRewardRelationships {\n");
    sb.append("    fundingAccount: ").append(toIndentedString(fundingAccount)).append("\n");
    sb.append("    receivingAccount: ").append(toIndentedString(receivingAccount)).append("\n");
    sb.append("    rewardedTransaction: ").append(toIndentedString(rewardedTransaction)).append("\n");
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
    openapiFields.add("fundingAccount");
    openapiFields.add("receivingAccount");
    openapiFields.add("rewardedTransaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("receivingAccount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateRewardRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateRewardRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRewardRelationships is not found in the empty JSON string", CreateRewardRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateRewardRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateRewardRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRewardRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fundingAccount`
      if (jsonObj.get("fundingAccount") != null && !jsonObj.get("fundingAccount").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("fundingAccount"));
      }
      // validate the required field `receivingAccount`
      Relationship.validateJsonElement(jsonObj.get("receivingAccount"));
      // validate the optional field `rewardedTransaction`
      if (jsonObj.get("rewardedTransaction") != null && !jsonObj.get("rewardedTransaction").isJsonNull()) {
        ReceivedPaymentRelationshipsReceivePaymentTransaction.validateJsonElement(jsonObj.get("rewardedTransaction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRewardRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRewardRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRewardRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRewardRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRewardRelationships>() {
           @Override
           public void write(JsonWriter out, CreateRewardRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRewardRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateRewardRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRewardRelationships
  * @throws IOException if the JSON string is invalid with respect to CreateRewardRelationships
  */
  public static CreateRewardRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRewardRelationships.class);
  }

 /**
  * Convert an instance of CreateRewardRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

