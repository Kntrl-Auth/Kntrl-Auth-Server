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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntrl.client.generated.model.AnswerErr;

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
 * QuestionsAnswersInvalid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T23:42:03.192677+03:00[Europe/Kiev]")
public class QuestionsAnswersInvalid {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_DEV_MSG = "devMsg";
  @SerializedName(SERIALIZED_NAME_DEV_MSG)
  private String devMsg;

  public static final String SERIALIZED_NAME_INVALID_ANSWERS = "invalidAnswers";
  @SerializedName(SERIALIZED_NAME_INVALID_ANSWERS)
  private Map<String, AnswerErr> invalidAnswers = new HashMap<>();

  public static final String SERIALIZED_NAME_TOO_MANY_ANSWERS = "tooManyAnswers";
  @SerializedName(SERIALIZED_NAME_TOO_MANY_ANSWERS)
  private Boolean tooManyAnswers;

  public QuestionsAnswersInvalid() { 
  }

  public QuestionsAnswersInvalid code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public QuestionsAnswersInvalid msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public QuestionsAnswersInvalid devMsg(String devMsg) {
    
    this.devMsg = devMsg;
    return this;
  }

   /**
   * Get devMsg
   * @return devMsg
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDevMsg() {
    return devMsg;
  }


  public void setDevMsg(String devMsg) {
    this.devMsg = devMsg;
  }


  public QuestionsAnswersInvalid invalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    
    this.invalidAnswers = invalidAnswers;
    return this;
  }

  public QuestionsAnswersInvalid putInvalidAnswersItem(String key, AnswerErr invalidAnswersItem) {
    this.invalidAnswers.put(key, invalidAnswersItem);
    return this;
  }

   /**
   * Get invalidAnswers
   * @return invalidAnswers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, AnswerErr> getInvalidAnswers() {
    return invalidAnswers;
  }


  public void setInvalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
  }


  public QuestionsAnswersInvalid tooManyAnswers(Boolean tooManyAnswers) {
    
    this.tooManyAnswers = tooManyAnswers;
    return this;
  }

   /**
   * Get tooManyAnswers
   * @return tooManyAnswers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTooManyAnswers() {
    return tooManyAnswers;
  }


  public void setTooManyAnswers(Boolean tooManyAnswers) {
    this.tooManyAnswers = tooManyAnswers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionsAnswersInvalid questionsAnswersInvalid = (QuestionsAnswersInvalid) o;
    return Objects.equals(this.code, questionsAnswersInvalid.code) &&
        Objects.equals(this.msg, questionsAnswersInvalid.msg) &&
        Objects.equals(this.devMsg, questionsAnswersInvalid.devMsg) &&
        Objects.equals(this.invalidAnswers, questionsAnswersInvalid.invalidAnswers) &&
        Objects.equals(this.tooManyAnswers, questionsAnswersInvalid.tooManyAnswers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, devMsg, invalidAnswers, tooManyAnswers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAnswersInvalid {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    invalidAnswers: ").append(toIndentedString(invalidAnswers)).append("\n");
    sb.append("    tooManyAnswers: ").append(toIndentedString(tooManyAnswers)).append("\n");
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
    openapiFields.add("msg");
    openapiFields.add("devMsg");
    openapiFields.add("invalidAnswers");
    openapiFields.add("tooManyAnswers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("devMsg");
    openapiRequiredFields.add("invalidAnswers");
    openapiRequiredFields.add("tooManyAnswers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuestionsAnswersInvalid
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QuestionsAnswersInvalid.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuestionsAnswersInvalid is not found in the empty JSON string", QuestionsAnswersInvalid.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuestionsAnswersInvalid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuestionsAnswersInvalid` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QuestionsAnswersInvalid.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      if (jsonObj.get("devMsg") != null && !jsonObj.get("devMsg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `devMsg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("devMsg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionsAnswersInvalid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionsAnswersInvalid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionsAnswersInvalid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAnswersInvalid.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionsAnswersInvalid>() {
           @Override
           public void write(JsonWriter out, QuestionsAnswersInvalid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuestionsAnswersInvalid read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuestionsAnswersInvalid given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuestionsAnswersInvalid
  * @throws IOException if the JSON string is invalid with respect to QuestionsAnswersInvalid
  */
  public static QuestionsAnswersInvalid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionsAnswersInvalid.class);
  }

 /**
  * Convert an instance of QuestionsAnswersInvalid to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

