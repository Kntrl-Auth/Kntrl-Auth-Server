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
import app.kntrl.client.generated.model.DbsCfg;
import app.kntrl.client.generated.model.EntryCfg;
import app.kntrl.client.generated.model.I18nCfg;
import app.kntrl.client.generated.model.RateLimiterCfg;
import app.kntrl.client.generated.model.SHAppCfgAuthsValue;
import app.kntrl.client.generated.model.SHHttpCfg;
import app.kntrl.client.generated.model.TokenCfg;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
 * SHAppCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SHAppCfg {
  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private SHHttpCfg http;

  public static final String SERIALIZED_NAME_LOGINS = "logins";
  @SerializedName(SERIALIZED_NAME_LOGINS)
  private Set<String> logins = null;

  public static final String SERIALIZED_NAME_AUTHS = "auths";
  @SerializedName(SERIALIZED_NAME_AUTHS)
  private Map<String, SHAppCfgAuthsValue> auths = null;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private Map<String, EntryCfg> entries = null;

  public static final String SERIALIZED_NAME_DB = "db";
  @SerializedName(SERIALIZED_NAME_DB)
  private DbsCfg db;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private TokenCfg token;

  public static final String SERIALIZED_NAME_RATE_LIMITERS = "rateLimiters";
  @SerializedName(SERIALIZED_NAME_RATE_LIMITERS)
  private Map<String, RateLimiterCfg> rateLimiters = null;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_KEY = "healthCheckKey";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_KEY)
  private String healthCheckKey;

  public static final String SERIALIZED_NAME_I18N = "i18n";
  @SerializedName(SERIALIZED_NAME_I18N)
  private I18nCfg i18n;

  public static final String SERIALIZED_NAME_$_SCHEMA = "$schema";
  @SerializedName(SERIALIZED_NAME_$_SCHEMA)
  private String $schema;

  public SHAppCfg() { 
  }

  public SHAppCfg http(SHHttpCfg http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SHHttpCfg getHttp() {
    return http;
  }


  public void setHttp(SHHttpCfg http) {
    this.http = http;
  }


  public SHAppCfg logins(Set<String> logins) {
    
    this.logins = logins;
    return this;
  }

  public SHAppCfg addLoginsItem(String loginsItem) {
    if (this.logins == null) {
      this.logins = new LinkedHashSet<>();
    }
    this.logins.add(loginsItem);
    return this;
  }

   /**
   * Types of logins that can be used for identification.  If the login type is not specified in the auth config - it will be considered a simple login: the user can set any name. E.g. username.  If the login type is specified in the auth config, this login will be generated by the corresponding authenticator. E.g. email, phone or facebook account id.  
   * @return logins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"username\",\"facebook\",\"email\"]", value = "Types of logins that can be used for identification.  If the login type is not specified in the auth config - it will be considered a simple login: the user can set any name. E.g. username.  If the login type is specified in the auth config, this login will be generated by the corresponding authenticator. E.g. email, phone or facebook account id.  ")

  public Set<String> getLogins() {
    return logins;
  }


  public void setLogins(Set<String> logins) {
    this.logins = logins;
  }


  public SHAppCfg auths(Map<String, SHAppCfgAuthsValue> auths) {
    
    this.auths = auths;
    return this;
  }

  public SHAppCfg putAuthsItem(String key, SHAppCfgAuthsValue authsItem) {
    if (this.auths == null) {
      this.auths = new HashMap<>();
    }
    this.auths.put(key, authsItem);
    return this;
  }

   /**
   * List of auth names and auth configs  To use builtin auths (not a plugin or remote) follow the example: &#x60;\&quot;password\&quot;: { ... }&#x60; or &#x60;\&quot;anyAuthName\&quot;: { \&quot;builtin\&quot;: \&quot;password\&quot;, ... }&#x60; 
   * @return auths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"email\":{},\"password\":{},\"facebook\":{\"builtin\":\"oauth\"}}", value = "List of auth names and auth configs  To use builtin auths (not a plugin or remote) follow the example: `\"password\": { ... }` or `\"anyAuthName\": { \"builtin\": \"password\", ... }` ")

  public Map<String, SHAppCfgAuthsValue> getAuths() {
    return auths;
  }


  public void setAuths(Map<String, SHAppCfgAuthsValue> auths) {
    this.auths = auths;
  }


  public SHAppCfg entries(Map<String, EntryCfg> entries) {
    
    this.entries = entries;
    return this;
  }

  public SHAppCfg putEntriesItem(String key, EntryCfg entriesItem) {
    if (this.entries == null) {
      this.entries = new HashMap<>();
    }
    this.entries.put(key, entriesItem);
    return this;
  }

   /**
   * List of app entries. Entry usually represents UI used for signing in/up or additional authentication before action. E.g.: - app: main entry that requests user login/email + password and 2fa (if enabled) - api: entry that allows user to generate API keys and connect third-party app - action: additional authentication (e.g. code from sms) requested before e.g. payment 
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of app entries. Entry usually represents UI used for signing in/up or additional authentication before action. E.g.: - app: main entry that requests user login/email + password and 2fa (if enabled) - api: entry that allows user to generate API keys and connect third-party app - action: additional authentication (e.g. code from sms) requested before e.g. payment ")

  public Map<String, EntryCfg> getEntries() {
    return entries;
  }


  public void setEntries(Map<String, EntryCfg> entries) {
    this.entries = entries;
  }


  public SHAppCfg db(DbsCfg db) {
    
    this.db = db;
    return this;
  }

   /**
   * Get db
   * @return db
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DbsCfg getDb() {
    return db;
  }


  public void setDb(DbsCfg db) {
    this.db = db;
  }


  public SHAppCfg token(TokenCfg token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TokenCfg getToken() {
    return token;
  }


  public void setToken(TokenCfg token) {
    this.token = token;
  }


  public SHAppCfg rateLimiters(Map<String, RateLimiterCfg> rateLimiters) {
    
    this.rateLimiters = rateLimiters;
    return this;
  }

  public SHAppCfg putRateLimitersItem(String key, RateLimiterCfg rateLimitersItem) {
    if (this.rateLimiters == null) {
      this.rateLimiters = new HashMap<>();
    }
    this.rateLimiters.put(key, rateLimitersItem);
    return this;
  }

   /**
   * List of rate limiters 
   * @return rateLimiters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of rate limiters ")

  public Map<String, RateLimiterCfg> getRateLimiters() {
    return rateLimiters;
  }


  public void setRateLimiters(Map<String, RateLimiterCfg> rateLimiters) {
    this.rateLimiters = rateLimiters;
  }


  public SHAppCfg secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * THe key that app uses for RSA certificate generation used for token signature. If &#x60;null&#x60; - app will generate secret automatically during startup.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "THe key that app uses for RSA certificate generation used for token signature. If `null` - app will generate secret automatically during startup.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SHAppCfg healthCheckKey(String healthCheckKey) {
    
    this.healthCheckKey = healthCheckKey;
    return this;
  }

   /**
   * Set this key if you want to restrict access to the health-check.
   * @return healthCheckKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set this key if you want to restrict access to the health-check.")

  public String getHealthCheckKey() {
    return healthCheckKey;
  }


  public void setHealthCheckKey(String healthCheckKey) {
    this.healthCheckKey = healthCheckKey;
  }


  public SHAppCfg i18n(I18nCfg i18n) {
    
    this.i18n = i18n;
    return this;
  }

   /**
   * Get i18n
   * @return i18n
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public I18nCfg getI18n() {
    return i18n;
  }


  public void setI18n(I18nCfg i18n) {
    this.i18n = i18n;
  }


  public SHAppCfg $schema(String $schema) {
    
    this.$schema = $schema;
    return this;
  }

   /**
   * Get $schema
   * @return $schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String get$Schema() {
    return $schema;
  }


  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SHAppCfg shAppCfg = (SHAppCfg) o;
    return Objects.equals(this.http, shAppCfg.http) &&
        Objects.equals(this.logins, shAppCfg.logins) &&
        Objects.equals(this.auths, shAppCfg.auths) &&
        Objects.equals(this.entries, shAppCfg.entries) &&
        Objects.equals(this.db, shAppCfg.db) &&
        Objects.equals(this.token, shAppCfg.token) &&
        Objects.equals(this.rateLimiters, shAppCfg.rateLimiters) &&
        Objects.equals(this.secret, shAppCfg.secret) &&
        Objects.equals(this.healthCheckKey, shAppCfg.healthCheckKey) &&
        Objects.equals(this.i18n, shAppCfg.i18n) &&
        Objects.equals(this.$schema, shAppCfg.$schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(http, logins, auths, entries, db, token, rateLimiters, secret, healthCheckKey, i18n, $schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SHAppCfg {\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    rateLimiters: ").append(toIndentedString(rateLimiters)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    healthCheckKey: ").append(toIndentedString(healthCheckKey)).append("\n");
    sb.append("    i18n: ").append(toIndentedString(i18n)).append("\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
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
    openapiFields.add("http");
    openapiFields.add("logins");
    openapiFields.add("auths");
    openapiFields.add("entries");
    openapiFields.add("db");
    openapiFields.add("token");
    openapiFields.add("rateLimiters");
    openapiFields.add("secret");
    openapiFields.add("healthCheckKey");
    openapiFields.add("i18n");
    openapiFields.add("$schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SHAppCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SHAppCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SHAppCfg is not found in the empty JSON string", SHAppCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SHAppCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SHAppCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `http`
      if (jsonObj.getAsJsonObject("http") != null) {
        SHHttpCfg.validateJsonObject(jsonObj.getAsJsonObject("http"));
      }
      // ensure the json data is an array
      if (jsonObj.get("logins") != null && !jsonObj.get("logins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `logins` to be an array in the JSON string but got `%s`", jsonObj.get("logins").toString()));
      }
      // validate the optional field `db`
      if (jsonObj.getAsJsonObject("db") != null) {
        DbsCfg.validateJsonObject(jsonObj.getAsJsonObject("db"));
      }
      // validate the optional field `token`
      if (jsonObj.getAsJsonObject("token") != null) {
        TokenCfg.validateJsonObject(jsonObj.getAsJsonObject("token"));
      }
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if (jsonObj.get("healthCheckKey") != null && !jsonObj.get("healthCheckKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthCheckKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthCheckKey").toString()));
      }
      // validate the optional field `i18n`
      if (jsonObj.getAsJsonObject("i18n") != null) {
        I18nCfg.validateJsonObject(jsonObj.getAsJsonObject("i18n"));
      }
      if (jsonObj.get("$schema") != null && !jsonObj.get("$schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$schema").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SHAppCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SHAppCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SHAppCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SHAppCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<SHAppCfg>() {
           @Override
           public void write(JsonWriter out, SHAppCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SHAppCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SHAppCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SHAppCfg
  * @throws IOException if the JSON string is invalid with respect to SHAppCfg
  */
  public static SHAppCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SHAppCfg.class);
  }

 /**
  * Convert an instance of SHAppCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

