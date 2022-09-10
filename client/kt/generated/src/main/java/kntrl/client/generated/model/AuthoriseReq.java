/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kntrl.client.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import kntrl.client.generated.model.RateLimiterReq;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kntrl.client.generated.infra.JSON;

/**
 * AuthoriseReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class AuthoriseReq {
  public static final String SERIALIZED_NAME_RATE_LIMITER = "rateLimiter";
  @SerializedName(SERIALIZED_NAME_RATE_LIMITER)
  private RateLimiterReq rateLimiter;

  public AuthoriseReq() { 
  }

  public AuthoriseReq rateLimiter(RateLimiterReq rateLimiter) {
    
    this.rateLimiter = rateLimiter;
    return this;
  }

   /**
   * Get rateLimiter
   * @return rateLimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RateLimiterReq getRateLimiter() {
    return rateLimiter;
  }


  public void setRateLimiter(RateLimiterReq rateLimiter) {
    this.rateLimiter = rateLimiter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthoriseReq authoriseReq = (AuthoriseReq) o;
    return Objects.equals(this.rateLimiter, authoriseReq.rateLimiter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimiter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthoriseReq {\n");
    sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
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
    openapiFields.add("rateLimiter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthoriseReq
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthoriseReq.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthoriseReq is not found in the empty JSON string", AuthoriseReq.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthoriseReq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthoriseReq` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `rateLimiter`
      if (jsonObj.getAsJsonObject("rateLimiter") != null) {
        RateLimiterReq.validateJsonObject(jsonObj.getAsJsonObject("rateLimiter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthoriseReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthoriseReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthoriseReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthoriseReq.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthoriseReq>() {
           @Override
           public void write(JsonWriter out, AuthoriseReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthoriseReq read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthoriseReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthoriseReq
  * @throws IOException if the JSON string is invalid with respect to AuthoriseReq
  */
  public static AuthoriseReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthoriseReq.class);
  }

 /**
  * Convert an instance of AuthoriseReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

