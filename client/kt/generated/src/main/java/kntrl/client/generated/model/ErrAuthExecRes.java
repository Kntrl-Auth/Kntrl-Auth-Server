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
import kntrl.client.generated.model.Code;
import kntrl.client.generated.model.Err;

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
 * ErrAuthExecRes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class ErrAuthExecRes {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SENT_CODE = "sentCode";
  @SerializedName(SERIALIZED_NAME_SENT_CODE)
  private Code sentCode;

  public static final String SERIALIZED_NAME_ERR = "err";
  @SerializedName(SERIALIZED_NAME_ERR)
  private Err err;

  public ErrAuthExecRes() { 
  }

  public ErrAuthExecRes status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ErrAuthExecRes sentCode(Code sentCode) {
    
    this.sentCode = sentCode;
    return this;
  }

   /**
   * Get sentCode
   * @return sentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Code getSentCode() {
    return sentCode;
  }


  public void setSentCode(Code sentCode) {
    this.sentCode = sentCode;
  }


  public ErrAuthExecRes err(Err err) {
    
    this.err = err;
    return this;
  }

   /**
   * Get err
   * @return err
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Err getErr() {
    return err;
  }


  public void setErr(Err err) {
    this.err = err;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrAuthExecRes errAuthExecRes = (ErrAuthExecRes) o;
    return Objects.equals(this.status, errAuthExecRes.status) &&
        Objects.equals(this.sentCode, errAuthExecRes.sentCode) &&
        Objects.equals(this.err, errAuthExecRes.err);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, sentCode, err);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrAuthExecRes {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentCode: ").append(toIndentedString(sentCode)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("sentCode");
    openapiFields.add("err");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("err");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ErrAuthExecRes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ErrAuthExecRes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrAuthExecRes is not found in the empty JSON string", ErrAuthExecRes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ErrAuthExecRes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrAuthExecRes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrAuthExecRes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `sentCode`
      if (jsonObj.getAsJsonObject("sentCode") != null) {
        Code.validateJsonObject(jsonObj.getAsJsonObject("sentCode"));
      }
      // validate the optional field `err`
      if (jsonObj.getAsJsonObject("err") != null) {
        Err.validateJsonObject(jsonObj.getAsJsonObject("err"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrAuthExecRes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrAuthExecRes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrAuthExecRes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrAuthExecRes.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrAuthExecRes>() {
           @Override
           public void write(JsonWriter out, ErrAuthExecRes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrAuthExecRes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ErrAuthExecRes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrAuthExecRes
  * @throws IOException if the JSON string is invalid with respect to ErrAuthExecRes
  */
  public static ErrAuthExecRes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrAuthExecRes.class);
  }

 /**
  * Convert an instance of ErrAuthExecRes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

