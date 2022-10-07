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
import app.kntrl.client.generated.model.AnswerErr;
import app.kntrl.client.generated.model.OneOfAnswerErr;
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
 * QuestionsAnswersInvalidAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-07T19:30:17.809690+03:00[Europe/Kiev]")
public class QuestionsAnswersInvalidAllOf {
  public static final String SERIALIZED_NAME_INVALID_ANSWERS = "invalidAnswers";
  @SerializedName(SERIALIZED_NAME_INVALID_ANSWERS)
  private Map<String, OneOfAnswerErr> invalidAnswers = null;

  public static final String SERIALIZED_NAME_TOO_MANY_ANSWERS = "tooManyAnswers";
  @SerializedName(SERIALIZED_NAME_TOO_MANY_ANSWERS)
  private Boolean tooManyAnswers;

  public QuestionsAnswersInvalidAllOf() { 
  }

  public QuestionsAnswersInvalidAllOf invalidAnswers(Map<String, OneOfAnswerErr> invalidAnswers) {
    
    this.invalidAnswers = invalidAnswers;
    return this;
  }

  public QuestionsAnswersInvalidAllOf putInvalidAnswersItem(String key, OneOfAnswerErr invalidAnswersItem) {
    if (this.invalidAnswers == null) {
      this.invalidAnswers = new HashMap<>();
    }
    this.invalidAnswers.put(key, invalidAnswersItem);
    return this;
  }

   /**
   * Get invalidAnswers
   * @return invalidAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, OneOfAnswerErr> getInvalidAnswers() {
    return invalidAnswers;
  }


  public void setInvalidAnswers(Map<String, OneOfAnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
  }


  public QuestionsAnswersInvalidAllOf tooManyAnswers(Boolean tooManyAnswers) {
    
    this.tooManyAnswers = tooManyAnswers;
    return this;
  }

   /**
   * Get tooManyAnswers
   * @return tooManyAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    QuestionsAnswersInvalidAllOf questionsAnswersInvalidAllOf = (QuestionsAnswersInvalidAllOf) o;
    return Objects.equals(this.invalidAnswers, questionsAnswersInvalidAllOf.invalidAnswers) &&
        Objects.equals(this.tooManyAnswers, questionsAnswersInvalidAllOf.tooManyAnswers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidAnswers, tooManyAnswers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionsAnswersInvalidAllOf {\n");
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
    openapiFields.add("invalidAnswers");
    openapiFields.add("tooManyAnswers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuestionsAnswersInvalidAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QuestionsAnswersInvalidAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuestionsAnswersInvalidAllOf is not found in the empty JSON string", QuestionsAnswersInvalidAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuestionsAnswersInvalidAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuestionsAnswersInvalidAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuestionsAnswersInvalidAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuestionsAnswersInvalidAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuestionsAnswersInvalidAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuestionsAnswersInvalidAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<QuestionsAnswersInvalidAllOf>() {
           @Override
           public void write(JsonWriter out, QuestionsAnswersInvalidAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuestionsAnswersInvalidAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuestionsAnswersInvalidAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuestionsAnswersInvalidAllOf
  * @throws IOException if the JSON string is invalid with respect to QuestionsAnswersInvalidAllOf
  */
  public static QuestionsAnswersInvalidAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuestionsAnswersInvalidAllOf.class);
  }

 /**
  * Convert an instance of QuestionsAnswersInvalidAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
