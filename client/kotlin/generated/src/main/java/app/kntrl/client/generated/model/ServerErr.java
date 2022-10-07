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
import app.kntrl.client.generated.model.AnyErrAllOf;
import app.kntrl.client.generated.model.Err;
import app.kntrl.client.generated.model.PluginErr;
import app.kntrl.client.generated.model.ServerErr;
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
 * ServerErr
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class ServerErr extends Err {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  protected String code;

  public static final String SERIALIZED_NAME_DEV_MSG = "devMsg";
  @SerializedName(SERIALIZED_NAME_DEV_MSG)
  private String devMsg;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public ServerErr() { 
    this.code = this.getClass().getSimpleName();
  }

  public ServerErr code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ServerErr devMsg(String devMsg) {
    
    this.devMsg = devMsg;
    return this;
  }

   /**
   * Message for developers.
   * @return devMsg
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Message for developers.")

  public String getDevMsg() {
    return devMsg;
  }


  public void setDevMsg(String devMsg) {
    this.devMsg = devMsg;
  }


  public ServerErr msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Localised message suitable for UI.
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Localised message suitable for UI.")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerErr serverErr = (ServerErr) o;
    return Objects.equals(this.code, serverErr.code) &&
        Objects.equals(this.devMsg, serverErr.devMsg) &&
        Objects.equals(this.msg, serverErr.msg) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerErr {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("devMsg");
    openapiFields.add("msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("devMsg");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServerErr
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServerErr.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServerErr is not found in the empty JSON string", ServerErr.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("code").getAsString();
      switch (discriminatorValue) {
        case "PLUGIN_ERR":
          PluginErr.validateJsonObject(jsonObj);
          break;
        case "PluginErr":
          PluginErr.validateJsonObject(jsonObj);
          break;
        case "SERVER_ERR":
          ServerErr.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `code` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of ServerErr given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServerErr
  * @throws IOException if the JSON string is invalid with respect to ServerErr
  */
  public static ServerErr fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServerErr.class);
  }

 /**
  * Convert an instance of ServerErr to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
