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


package app.kntrl.client.generated.model;

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

import app.kntrl.client.generated.infra.JSON;

/**
 * EntryAccessTokenCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntryAccessTokenCfg {
  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private Boolean cache;

  public EntryAccessTokenCfg() { 
  }

  public EntryAccessTokenCfg ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Override access token ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override access token ttl")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  public EntryAccessTokenCfg cache(Boolean cache) {
    
    this.cache = cache;
    return this;
  }

   /**
   * Enable or disable client-side caching of access token
   * @return cache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable or disable client-side caching of access token")

  public Boolean getCache() {
    return cache;
  }


  public void setCache(Boolean cache) {
    this.cache = cache;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryAccessTokenCfg entryAccessTokenCfg = (EntryAccessTokenCfg) o;
    return Objects.equals(this.ttl, entryAccessTokenCfg.ttl) &&
        Objects.equals(this.cache, entryAccessTokenCfg.cache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttl, cache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryAccessTokenCfg {\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
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
    openapiFields.add("ttl");
    openapiFields.add("cache");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EntryAccessTokenCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EntryAccessTokenCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntryAccessTokenCfg is not found in the empty JSON string", EntryAccessTokenCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EntryAccessTokenCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntryAccessTokenCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntryAccessTokenCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntryAccessTokenCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntryAccessTokenCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntryAccessTokenCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<EntryAccessTokenCfg>() {
           @Override
           public void write(JsonWriter out, EntryAccessTokenCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntryAccessTokenCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntryAccessTokenCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntryAccessTokenCfg
  * @throws IOException if the JSON string is invalid with respect to EntryAccessTokenCfg
  */
  public static EntryAccessTokenCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntryAccessTokenCfg.class);
  }

 /**
  * Convert an instance of EntryAccessTokenCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

