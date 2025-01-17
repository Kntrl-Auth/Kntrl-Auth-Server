/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.kntrl.client.generated.model;

import java.util.Objects;
import java.util.Arrays;
import app.kntrl.client.generated.model.AuthenticateReqAuthReqsValue;
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

import app.kntrl.client.generated.infra.JSON;

/**
 * NewSessionReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewSessionReq {
  public static final String SERIALIZED_NAME_ENTRY = "entry";
  @SerializedName(SERIALIZED_NAME_ENTRY)
  private String entry;

  public static final String SERIALIZED_NAME_LOGINS = "logins";
  @SerializedName(SERIALIZED_NAME_LOGINS)
  private Map<String, String> logins = null;

  public static final String SERIALIZED_NAME_FACTORS = "factors";
  @SerializedName(SERIALIZED_NAME_FACTORS)
  private Map<String, String> factors = null;

  public static final String SERIALIZED_NAME_AUTH_REQS = "authReqs";
  @SerializedName(SERIALIZED_NAME_AUTH_REQS)
  private Map<String, AuthenticateReqAuthReqsValue> authReqs = null;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public static final String SERIALIZED_NAME_SIGN_IN = "signIn";
  @SerializedName(SERIALIZED_NAME_SIGN_IN)
  private Boolean signIn = false;

  public static final String SERIALIZED_NAME_SIGN_UP = "signUp";
  @SerializedName(SERIALIZED_NAME_SIGN_UP)
  private Boolean signUp = false;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun = false;

  public NewSessionReq() {
  }

  public NewSessionReq entry(String entry) {
    
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEntry() {
    return entry;
  }


  public void setEntry(String entry) {
    this.entry = entry;
  }


  public NewSessionReq logins(Map<String, String> logins) {
    
    this.logins = logins;
    return this;
  }

  public NewSessionReq putLoginsItem(String key, String loginsItem) {
    if (this.logins == null) {
      this.logins = new HashMap<>();
    }
    this.logins.put(key, loginsItem);
    return this;
  }

   /**
   * Get logins
   * @return logins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLogins() {
    return logins;
  }


  public void setLogins(Map<String, String> logins) {
    this.logins = logins;
  }


  public NewSessionReq factors(Map<String, String> factors) {
    
    this.factors = factors;
    return this;
  }

  public NewSessionReq putFactorsItem(String key, String factorsItem) {
    if (this.factors == null) {
      this.factors = new HashMap<>();
    }
    this.factors.put(key, factorsItem);
    return this;
  }

   /**
   * Forces specific auth to be used for factor. Takes place only when multiple auths is provided within request and auth can be assigned to several factors. If used in sign-up mode, it just enables those factors. 
   * @return factors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Forces specific auth to be used for factor. Takes place only when multiple auths is provided within request and auth can be assigned to several factors. If used in sign-up mode, it just enables those factors. ")

  public Map<String, String> getFactors() {
    return factors;
  }


  public void setFactors(Map<String, String> factors) {
    this.factors = factors;
  }


  public NewSessionReq authReqs(Map<String, AuthenticateReqAuthReqsValue> authReqs) {
    
    this.authReqs = authReqs;
    return this;
  }

  public NewSessionReq putAuthReqsItem(String key, AuthenticateReqAuthReqsValue authReqsItem) {
    if (this.authReqs == null) {
      this.authReqs = new HashMap<>();
    }
    this.authReqs.put(key, authReqsItem);
    return this;
  }

   /**
   * Request for authenticators 
   * @return authReqs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request for authenticators ")

  public Map<String, AuthenticateReqAuthReqsValue> getAuthReqs() {
    return authReqs;
  }


  public void setAuthReqs(Map<String, AuthenticateReqAuthReqsValue> authReqs) {
    this.authReqs = authReqs;
  }


  public NewSessionReq scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public NewSessionReq addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * OAuth scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OAuth scopes")

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public NewSessionReq signIn(Boolean signIn) {
    
    this.signIn = signIn;
    return this;
  }

   /**
   * Get signIn
   * @return signIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSignIn() {
    return signIn;
  }


  public void setSignIn(Boolean signIn) {
    this.signIn = signIn;
  }


  public NewSessionReq signUp(Boolean signUp) {
    
    this.signUp = signUp;
    return this;
  }

   /**
   * Get signUp
   * @return signUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSignUp() {
    return signUp;
  }


  public void setSignUp(Boolean signUp) {
    this.signUp = signUp;
  }


  public NewSessionReq dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Execute only validation ща authenticator requests.
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Execute only validation ща authenticator requests.")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public NewSessionReq putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewSessionReq newSessionReq = (NewSessionReq) o;
    return Objects.equals(this.entry, newSessionReq.entry) &&
        Objects.equals(this.logins, newSessionReq.logins) &&
        Objects.equals(this.factors, newSessionReq.factors) &&
        Objects.equals(this.authReqs, newSessionReq.authReqs) &&
        Objects.equals(this.scopes, newSessionReq.scopes) &&
        Objects.equals(this.signIn, newSessionReq.signIn) &&
        Objects.equals(this.signUp, newSessionReq.signUp) &&
        Objects.equals(this.dryRun, newSessionReq.dryRun)&&
        Objects.equals(this.additionalProperties, newSessionReq.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry, logins, factors, authReqs, scopes, signIn, signUp, dryRun, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewSessionReq {\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    authReqs: ").append(toIndentedString(authReqs)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    signIn: ").append(toIndentedString(signIn)).append("\n");
    sb.append("    signUp: ").append(toIndentedString(signUp)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("entry");
    openapiFields.add("logins");
    openapiFields.add("factors");
    openapiFields.add("authReqs");
    openapiFields.add("scopes");
    openapiFields.add("signIn");
    openapiFields.add("signUp");
    openapiFields.add("dryRun");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entry");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewSessionReq
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NewSessionReq.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewSessionReq is not found in the empty JSON string", NewSessionReq.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NewSessionReq.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("entry") != null && !jsonObj.get("entry").isJsonNull()) && !jsonObj.get("entry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entry").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull()) && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewSessionReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewSessionReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewSessionReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewSessionReq.class));

       return (TypeAdapter<T>) new TypeAdapter<NewSessionReq>() {
           @Override
           public void write(JsonWriter out, NewSessionReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NewSessionReq read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewSessionReq instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NewSessionReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewSessionReq
  * @throws IOException if the JSON string is invalid with respect to NewSessionReq
  */
  public static NewSessionReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewSessionReq.class);
  }

 /**
  * Convert an instance of NewSessionReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

