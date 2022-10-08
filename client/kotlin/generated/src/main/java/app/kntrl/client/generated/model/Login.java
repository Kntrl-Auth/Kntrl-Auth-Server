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
 * Login
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Login {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_UNCONFIRMED_LOGIN = "unconfirmedLogin";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_LOGIN)
  private String unconfirmedLogin;

  public static final String SERIALIZED_NAME_CONFIRMED = "confirmed";
  @SerializedName(SERIALIZED_NAME_CONFIRMED)
  private Boolean confirmed;

  public Login() { 
  }

  public Login type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of login
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of login")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Login login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * User unique identifier, email, username, etc.
   * @return login
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "User unique identifier, email, username, etc.")

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public Login unconfirmedLogin(String unconfirmedLogin) {
    
    this.unconfirmedLogin = unconfirmedLogin;
    return this;
  }

   /**
   * Get unconfirmedLogin
   * @return unconfirmedLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnconfirmedLogin() {
    return unconfirmedLogin;
  }


  public void setUnconfirmedLogin(String unconfirmedLogin) {
    this.unconfirmedLogin = unconfirmedLogin;
  }


  public Login confirmed(Boolean confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.type, login.type) &&
        Objects.equals(this.login, login.login) &&
        Objects.equals(this.unconfirmedLogin, login.unconfirmedLogin) &&
        Objects.equals(this.confirmed, login.confirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, login, unconfirmedLogin, confirmed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    unconfirmedLogin: ").append(toIndentedString(unconfirmedLogin)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("login");
    openapiFields.add("unconfirmedLogin");
    openapiFields.add("confirmed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("login");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Login
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Login.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Login is not found in the empty JSON string", Login.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Login.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Login` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Login.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("login") != null && !jsonObj.get("login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login").toString()));
      }
      if (jsonObj.get("unconfirmedLogin") != null && !jsonObj.get("unconfirmedLogin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unconfirmedLogin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unconfirmedLogin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Login.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Login' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Login> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Login.class));

       return (TypeAdapter<T>) new TypeAdapter<Login>() {
           @Override
           public void write(JsonWriter out, Login value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Login read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Login given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Login
  * @throws IOException if the JSON string is invalid with respect to Login
  */
  public static Login fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Login.class);
  }

 /**
  * Convert an instance of Login to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

