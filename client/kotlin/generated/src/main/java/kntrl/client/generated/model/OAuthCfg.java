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
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kntrl.client.generated.infra.JSON;

/**
 * OAuthCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-10T21:18:46.730417+03:00[Europe/Kiev]")
public class OAuthCfg {
  public static final String SERIALIZED_NAME_REQUIRES_AUTH = "requiresAuth";
  @SerializedName(SERIALIZED_NAME_REQUIRES_AUTH)
  private List<List<String>> requiresAuth = null;

  public static final String SERIALIZED_NAME_SKIP_ON_FAIL = "skipOnFail";
  @SerializedName(SERIALIZED_NAME_SKIP_ON_FAIL)
  private Boolean skipOnFail;

  public static final String SERIALIZED_NAME_RATE_LIMITER = "rateLimiter";
  @SerializedName(SERIALIZED_NAME_RATE_LIMITER)
  private String rateLimiter;

  public static final String SERIALIZED_NAME_BURN_QUOTA = "burnQuota";
  @SerializedName(SERIALIZED_NAME_BURN_QUOTA)
  private Double burnQuota;

  public static final String SERIALIZED_NAME_EXTRACT_LOGIN = "extractLogin";
  @SerializedName(SERIALIZED_NAME_EXTRACT_LOGIN)
  private String extractLogin;

  public static final String SERIALIZED_NAME_TOKEN_URL = "tokenUrl";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "clientSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_USER_INFO_URL = "userInfoUrl";
  @SerializedName(SERIALIZED_NAME_USER_INFO_URL)
  private String userInfoUrl;

  public static final String SERIALIZED_NAME_SEND_TOKEN_IN_QUERY = "sendTokenInQuery";
  @SerializedName(SERIALIZED_NAME_SEND_TOKEN_IN_QUERY)
  private String sendTokenInQuery;

  public static final String SERIALIZED_NAME_SEND_TOKEN_IN_HEADER = "sendTokenInHeader";
  @SerializedName(SERIALIZED_NAME_SEND_TOKEN_IN_HEADER)
  private Boolean sendTokenInHeader;

  public static final String SERIALIZED_NAME_EXTRACT_PUBLIC_DATA = "extractPublicData";
  @SerializedName(SERIALIZED_NAME_EXTRACT_PUBLIC_DATA)
  private Map<String, String> extractPublicData = null;

  public OAuthCfg() { 
  }

  public OAuthCfg requiresAuth(List<List<String>> requiresAuth) {
    
    this.requiresAuth = requiresAuth;
    return this;
  }

  public OAuthCfg addRequiresAuthItem(List<String> requiresAuthItem) {
    if (this.requiresAuth == null) {
      this.requiresAuth = new ArrayList<>();
    }
    this.requiresAuth.add(requiresAuthItem);
    return this;
  }

   /**
   * If this is not null, app forbids to add this auth until listed auth enabled. - if this a string -&gt; require specified auth to be enabled before this. - array of strings -&gt; require any of listed auths to be enabled - array of arrays of strings -&gt; works as &#x60;[ [ \&quot;auth1\&quot; and \&quot;auth2\&quot; ] or [ \&quot;auth1\&quot; and \&quot;auth2\&quot; ] ]&#x60;
   * @return requiresAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this is not null, app forbids to add this auth until listed auth enabled. - if this a string -> require specified auth to be enabled before this. - array of strings -> require any of listed auths to be enabled - array of arrays of strings -> works as `[ [ \"auth1\" and \"auth2\" ] or [ \"auth1\" and \"auth2\" ] ]`")

  public List<List<String>> getRequiresAuth() {
    return requiresAuth;
  }


  public void setRequiresAuth(List<List<String>> requiresAuth) {
    this.requiresAuth = requiresAuth;
  }


  public OAuthCfg skipOnFail(Boolean skipOnFail) {
    
    this.skipOnFail = skipOnFail;
    return this;
  }

   /**
   * When this is set to true app will attempt next auth in case of error on current. It&#39;s works good with IP auth. User can provide both IP auth request and SMS auth request. And SMS will be executed only when IP auth is failed. If set to false any error on this auth will stop the whole request execution.
   * @return skipOnFail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When this is set to true app will attempt next auth in case of error on current. It's works good with IP auth. User can provide both IP auth request and SMS auth request. And SMS will be executed only when IP auth is failed. If set to false any error on this auth will stop the whole request execution.")

  public Boolean getSkipOnFail() {
    return skipOnFail;
  }


  public void setSkipOnFail(Boolean skipOnFail) {
    this.skipOnFail = skipOnFail;
  }


  public OAuthCfg rateLimiter(String rateLimiter) {
    
    this.rateLimiter = rateLimiter;
    return this;
  }

   /**
   * Apply rate limiter for this auth.
   * @return rateLimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply rate limiter for this auth.")

  public String getRateLimiter() {
    return rateLimiter;
  }


  public void setRateLimiter(String rateLimiter) {
    this.rateLimiter = rateLimiter;
  }


  public OAuthCfg burnQuota(Double burnQuota) {
    
    this.burnQuota = burnQuota;
    return this;
  }

   /**
   * Every auth execution will burn this amount of quota. Takes place only when rate limiter is specified
   * @return burnQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Every auth execution will burn this amount of quota. Takes place only when rate limiter is specified")

  public Double getBurnQuota() {
    return burnQuota;
  }


  public void setBurnQuota(Double burnQuota) {
    this.burnQuota = burnQuota;
  }


  public OAuthCfg extractLogin(String extractLogin) {
    
    this.extractLogin = extractLogin;
    return this;
  }

   /**
   * Path for login in id-token or user-info endpoint response. e.g. &#x60;res.user.id&#x60; extracts user login from &#x60;{ \&quot;res\&quot;: { \&quot;user\&quot;: { \&quot;id\&quot;: \&quot;...\&quot; } } }&#x60;
   * @return extractLogin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Path for login in id-token or user-info endpoint response. e.g. `res.user.id` extracts user login from `{ \"res\": { \"user\": { \"id\": \"...\" } } }`")

  public String getExtractLogin() {
    return extractLogin;
  }


  public void setExtractLogin(String extractLogin) {
    this.extractLogin = extractLogin;
  }


  public OAuthCfg tokenUrl(String tokenUrl) {
    
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Url to get access token by authorisation code.
   * @return tokenUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to get access token by authorisation code.")

  public String getTokenUrl() {
    return tokenUrl;
  }


  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  public OAuthCfg clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * OAuth client id. Client must be registered on OAuth provider (e.g. facebook, google)
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OAuth client id. Client must be registered on OAuth provider (e.g. facebook, google)")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OAuthCfg clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * OAuth client secret.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OAuth client secret.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public OAuthCfg userInfoUrl(String userInfoUrl) {
    
    this.userInfoUrl = userInfoUrl;
    return this;
  }

   /**
   * If access token provided in request, app tries to extract user id from user-info endpoint.
   * @return userInfoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If access token provided in request, app tries to extract user id from user-info endpoint.")

  public String getUserInfoUrl() {
    return userInfoUrl;
  }


  public void setUserInfoUrl(String userInfoUrl) {
    this.userInfoUrl = userInfoUrl;
  }


  public OAuthCfg sendTokenInQuery(String sendTokenInQuery) {
    
    this.sendTokenInQuery = sendTokenInQuery;
    return this;
  }

   /**
   * Send token in query param.
   * @return sendTokenInQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send token in query param.")

  public String getSendTokenInQuery() {
    return sendTokenInQuery;
  }


  public void setSendTokenInQuery(String sendTokenInQuery) {
    this.sendTokenInQuery = sendTokenInQuery;
  }


  public OAuthCfg sendTokenInHeader(Boolean sendTokenInHeader) {
    
    this.sendTokenInHeader = sendTokenInHeader;
    return this;
  }

   /**
   * Send token in Authorisation header.
   * @return sendTokenInHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send token in Authorisation header.")

  public Boolean getSendTokenInHeader() {
    return sendTokenInHeader;
  }


  public void setSendTokenInHeader(Boolean sendTokenInHeader) {
    this.sendTokenInHeader = sendTokenInHeader;
  }


  public OAuthCfg extractPublicData(Map<String, String> extractPublicData) {
    
    this.extractPublicData = extractPublicData;
    return this;
  }

  public OAuthCfg putExtractPublicDataItem(String key, String extractPublicDataItem) {
    if (this.extractPublicData == null) {
      this.extractPublicData = new HashMap<>();
    }
    this.extractPublicData.put(key, extractPublicDataItem);
    return this;
  }

   /**
   * Can fill public data by a response of user-info or id-token.
   * @return extractPublicData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can fill public data by a response of user-info or id-token.")

  public Map<String, String> getExtractPublicData() {
    return extractPublicData;
  }


  public void setExtractPublicData(Map<String, String> extractPublicData) {
    this.extractPublicData = extractPublicData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthCfg oauthCfg = (OAuthCfg) o;
    return Objects.equals(this.requiresAuth, oauthCfg.requiresAuth) &&
        Objects.equals(this.skipOnFail, oauthCfg.skipOnFail) &&
        Objects.equals(this.rateLimiter, oauthCfg.rateLimiter) &&
        Objects.equals(this.burnQuota, oauthCfg.burnQuota) &&
        Objects.equals(this.extractLogin, oauthCfg.extractLogin) &&
        Objects.equals(this.tokenUrl, oauthCfg.tokenUrl) &&
        Objects.equals(this.clientId, oauthCfg.clientId) &&
        Objects.equals(this.clientSecret, oauthCfg.clientSecret) &&
        Objects.equals(this.userInfoUrl, oauthCfg.userInfoUrl) &&
        Objects.equals(this.sendTokenInQuery, oauthCfg.sendTokenInQuery) &&
        Objects.equals(this.sendTokenInHeader, oauthCfg.sendTokenInHeader) &&
        Objects.equals(this.extractPublicData, oauthCfg.extractPublicData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresAuth, skipOnFail, rateLimiter, burnQuota, extractLogin, tokenUrl, clientId, clientSecret, userInfoUrl, sendTokenInQuery, sendTokenInHeader, extractPublicData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthCfg {\n");
    sb.append("    requiresAuth: ").append(toIndentedString(requiresAuth)).append("\n");
    sb.append("    skipOnFail: ").append(toIndentedString(skipOnFail)).append("\n");
    sb.append("    rateLimiter: ").append(toIndentedString(rateLimiter)).append("\n");
    sb.append("    burnQuota: ").append(toIndentedString(burnQuota)).append("\n");
    sb.append("    extractLogin: ").append(toIndentedString(extractLogin)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    userInfoUrl: ").append(toIndentedString(userInfoUrl)).append("\n");
    sb.append("    sendTokenInQuery: ").append(toIndentedString(sendTokenInQuery)).append("\n");
    sb.append("    sendTokenInHeader: ").append(toIndentedString(sendTokenInHeader)).append("\n");
    sb.append("    extractPublicData: ").append(toIndentedString(extractPublicData)).append("\n");
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
    openapiFields.add("requiresAuth");
    openapiFields.add("skipOnFail");
    openapiFields.add("rateLimiter");
    openapiFields.add("burnQuota");
    openapiFields.add("extractLogin");
    openapiFields.add("tokenUrl");
    openapiFields.add("clientId");
    openapiFields.add("clientSecret");
    openapiFields.add("userInfoUrl");
    openapiFields.add("sendTokenInQuery");
    openapiFields.add("sendTokenInHeader");
    openapiFields.add("extractPublicData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extractLogin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuthCfg
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OAuthCfg.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuthCfg is not found in the empty JSON string", OAuthCfg.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OAuthCfg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuthCfg` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuthCfg.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("requiresAuth") != null && !jsonObj.get("requiresAuth").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requiresAuth` to be an array in the JSON string but got `%s`", jsonObj.get("requiresAuth").toString()));
      }
      if (jsonObj.get("rateLimiter") != null && !jsonObj.get("rateLimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateLimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateLimiter").toString()));
      }
      if (jsonObj.get("extractLogin") != null && !jsonObj.get("extractLogin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extractLogin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extractLogin").toString()));
      }
      if (jsonObj.get("tokenUrl") != null && !jsonObj.get("tokenUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenUrl").toString()));
      }
      if (jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if (jsonObj.get("clientSecret") != null && !jsonObj.get("clientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecret").toString()));
      }
      if (jsonObj.get("userInfoUrl") != null && !jsonObj.get("userInfoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userInfoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userInfoUrl").toString()));
      }
      if (jsonObj.get("sendTokenInQuery") != null && !jsonObj.get("sendTokenInQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sendTokenInQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sendTokenInQuery").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuthCfg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuthCfg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuthCfg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuthCfg.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuthCfg>() {
           @Override
           public void write(JsonWriter out, OAuthCfg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuthCfg read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OAuthCfg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OAuthCfg
  * @throws IOException if the JSON string is invalid with respect to OAuthCfg
  */
  public static OAuthCfg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuthCfg.class);
  }

 /**
  * Convert an instance of OAuthCfg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
