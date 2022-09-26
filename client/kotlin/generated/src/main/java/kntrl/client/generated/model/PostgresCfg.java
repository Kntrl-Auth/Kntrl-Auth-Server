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
 * PostgresCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-10T21:18:46.730417+03:00[Europe/Kiev]")
public class PostgresCfg {
  public static final String SERIALIZED_NAME_POSTGRES = "postgres";
  @SerializedName(SERIALIZED_NAME_POSTGRES)
  private String postgres;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_MAX_CONNECTIONS = "maxConnections";
  @SerializedName(SERIALIZED_NAME_MAX_CONNECTIONS)
  private Integer maxConnections;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public PostgresCfg() { 
  }

  public PostgresCfg postgres(String postgres) {
    
    this.postgres = postgres;
    return this;
  }

   /**
   * Get postgres
   * @return postgres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostgres() {
    return postgres;
  }


  public void setPostgres(String postgres) {
    this.postgres = postgres;
  }


  public PostgresCfg username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public PostgresCfg maxConnections(Integer maxConnections) {
    
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * Get maxConnections
   * @return maxConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxConnections() {
    return maxConnections;
  }


  public void setMaxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
  }


  public PostgresCfg password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostgresCfg postgresCfg = (PostgresCfg) o;
    return Objects.equals(this.postgres, postgresCfg.postgres) &&
        Objects.equals(this.username, postgresCfg.username) &&
        Objects.equals(this.maxConnections, postgresCfg.maxConnections) &&
        Objects.equals(this.password, postgresCfg.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postgres, username, maxConnections, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostgresCfg {\n");
    sb.append("    postgres: ").append(toIndentedString(postgres)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("postgres");
    openapiFields.add("username");
    openapiFields.add("maxConnections");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostgresCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PostgresCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostgresCfg is not found in the empty JSON string", PostgresCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostgresCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostgresCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("postgres") != null && !jsonObj.get("postgres").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postgres` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postgres").toString()));
      }
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostgresCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostgresCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostgresCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostgresCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<PostgresCfg>() {
           @Override
           public void write(JsonWriter out, PostgresCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostgresCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostgresCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostgresCfg
  * @throws IOException if the JSON string is invalid with respect to PostgresCfg
  */
  public static PostgresCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostgresCfg.class);
  }

 /**
  * Convert an instance of PostgresCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
