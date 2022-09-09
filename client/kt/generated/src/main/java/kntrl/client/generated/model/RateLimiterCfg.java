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
 * RateLimiterCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class RateLimiterCfg {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Boolean userId;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private Boolean ip;

  public static final String SERIALIZED_NAME_QUOTA = "quota";
  @SerializedName(SERIALIZED_NAME_QUOTA)
  private Double quota;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_ALIGN_LOAD = "alignLoad";
  @SerializedName(SERIALIZED_NAME_ALIGN_LOAD)
  private Boolean alignLoad;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public RateLimiterCfg() { 
  }

  public RateLimiterCfg userId(Boolean userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUserId() {
    return userId;
  }


  public void setUserId(Boolean userId) {
    this.userId = userId;
  }


  public RateLimiterCfg ip(Boolean ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIp() {
    return ip;
  }


  public void setIp(Boolean ip) {
    this.ip = ip;
  }


  public RateLimiterCfg quota(Double quota) {
    
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getQuota() {
    return quota;
  }


  public void setQuota(Double quota) {
    this.quota = quota;
  }


  public RateLimiterCfg period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }


  public RateLimiterCfg alignLoad(Boolean alignLoad) {
    
    this.alignLoad = alignLoad;
    return this;
  }

   /**
   * Get alignLoad
   * @return alignLoad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAlignLoad() {
    return alignLoad;
  }


  public void setAlignLoad(Boolean alignLoad) {
    this.alignLoad = alignLoad;
  }


  public RateLimiterCfg parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    this.parent = parent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterCfg rateLimiterCfg = (RateLimiterCfg) o;
    return Objects.equals(this.userId, rateLimiterCfg.userId) &&
        Objects.equals(this.ip, rateLimiterCfg.ip) &&
        Objects.equals(this.quota, rateLimiterCfg.quota) &&
        Objects.equals(this.period, rateLimiterCfg.period) &&
        Objects.equals(this.alignLoad, rateLimiterCfg.alignLoad) &&
        Objects.equals(this.parent, rateLimiterCfg.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, ip, quota, period, alignLoad, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterCfg {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    alignLoad: ").append(toIndentedString(alignLoad)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("ip");
    openapiFields.add("quota");
    openapiFields.add("period");
    openapiFields.add("alignLoad");
    openapiFields.add("parent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateLimiterCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RateLimiterCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateLimiterCfg is not found in the empty JSON string", RateLimiterCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateLimiterCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateLimiterCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateLimiterCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateLimiterCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateLimiterCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateLimiterCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<RateLimiterCfg>() {
           @Override
           public void write(JsonWriter out, RateLimiterCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateLimiterCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateLimiterCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateLimiterCfg
  * @throws IOException if the JSON string is invalid with respect to RateLimiterCfg
  */
  public static RateLimiterCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateLimiterCfg.class);
  }

 /**
  * Convert an instance of RateLimiterCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

