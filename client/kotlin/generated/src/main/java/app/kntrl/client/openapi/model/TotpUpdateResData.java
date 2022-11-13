/*
 * Kntrl API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.kntrl.client.openapi.model;

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

import app.kntrl.client.openapi.infra.JSON;

/**
 * TotpUpdateResData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TotpUpdateResData {
  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_OTP_URL = "otpUrl";
  @SerializedName(SERIALIZED_NAME_OTP_URL)
  private String otpUrl;

  public static final String SERIALIZED_NAME_OTP_URL_QR_CODE = "otpUrlQrCode";
  @SerializedName(SERIALIZED_NAME_OTP_URL_QR_CODE)
  private String otpUrlQrCode;

  public TotpUpdateResData() {
  }

  public TotpUpdateResData secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Base32 SHA-1 key.
   * @return secret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Base32 SHA-1 key.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public TotpUpdateResData otpUrl(String otpUrl) {
    
    this.otpUrl = otpUrl;
    return this;
  }

   /**
   * Get otpUrl
   * @return otpUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOtpUrl() {
    return otpUrl;
  }


  public void setOtpUrl(String otpUrl) {
    this.otpUrl = otpUrl;
  }


  public TotpUpdateResData otpUrlQrCode(String otpUrlQrCode) {
    
    this.otpUrlQrCode = otpUrlQrCode;
    return this;
  }

   /**
   * QR code URL. Use it like this: &#x60;&lt;img style&#x3D;\&quot;image-rendering: pixelated;\&quot; width&#x3D;\&quot;200\&quot; src&#x3D;\&quot;&lt;otpUrlQrCode&gt;\&quot;/&gt;&#x60;
   * @return otpUrlQrCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "QR code URL. Use it like this: `<img style=\"image-rendering: pixelated;\" width=\"200\" src=\"<otpUrlQrCode>\"/>`")

  public String getOtpUrlQrCode() {
    return otpUrlQrCode;
  }


  public void setOtpUrlQrCode(String otpUrlQrCode) {
    this.otpUrlQrCode = otpUrlQrCode;
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
  public TotpUpdateResData putAdditionalProperty(String key, Object value) {
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
    TotpUpdateResData totpUpdateResData = (TotpUpdateResData) o;
    return Objects.equals(this.secret, totpUpdateResData.secret) &&
        Objects.equals(this.otpUrl, totpUpdateResData.otpUrl) &&
        Objects.equals(this.otpUrlQrCode, totpUpdateResData.otpUrlQrCode)&&
        Objects.equals(this.additionalProperties, totpUpdateResData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, otpUrl, otpUrlQrCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotpUpdateResData {\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    otpUrl: ").append(toIndentedString(otpUrl)).append("\n");
    sb.append("    otpUrlQrCode: ").append(toIndentedString(otpUrlQrCode)).append("\n");
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
    openapiFields.add("secret");
    openapiFields.add("otpUrl");
    openapiFields.add("otpUrlQrCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secret");
    openapiRequiredFields.add("otpUrl");
    openapiRequiredFields.add("otpUrlQrCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TotpUpdateResData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TotpUpdateResData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TotpUpdateResData is not found in the empty JSON string", TotpUpdateResData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TotpUpdateResData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("otpUrl") != null && !jsonObj.get("otpUrl").isJsonNull()) && !jsonObj.get("otpUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otpUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otpUrl").toString()));
      }
      if ((jsonObj.get("otpUrlQrCode") != null && !jsonObj.get("otpUrlQrCode").isJsonNull()) && !jsonObj.get("otpUrlQrCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otpUrlQrCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otpUrlQrCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TotpUpdateResData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TotpUpdateResData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TotpUpdateResData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TotpUpdateResData.class));

       return (TypeAdapter<T>) new TypeAdapter<TotpUpdateResData>() {
           @Override
           public void write(JsonWriter out, TotpUpdateResData value) throws IOException {
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
           public TotpUpdateResData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TotpUpdateResData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TotpUpdateResData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TotpUpdateResData
  * @throws IOException if the JSON string is invalid with respect to TotpUpdateResData
  */
  public static TotpUpdateResData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TotpUpdateResData.class);
  }

 /**
  * Convert an instance of TotpUpdateResData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
