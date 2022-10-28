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
import app.kntrl.client.generated.model.AnswerErr;
import app.kntrl.client.generated.model.LoginId;
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
 * Err
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Err {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DEV_MSG = "devMsg";
  @SerializedName(SERIALIZED_NAME_DEV_MSG)
  private String devMsg;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_CHANGED_AT = "changedAt";
  @SerializedName(SERIALIZED_NAME_CHANGED_AT)
  private Long changedAt;

  public static final String SERIALIZED_NAME_CHANGED_DAYS_AGO = "changedDaysAgo";
  @SerializedName(SERIALIZED_NAME_CHANGED_DAYS_AGO)
  private Long changedDaysAgo;

  public static final String SERIALIZED_NAME_TOO_LONG = "tooLong";
  @SerializedName(SERIALIZED_NAME_TOO_LONG)
  private Boolean tooLong;

  public static final String SERIALIZED_NAME_TOO_SHORT = "tooShort";
  @SerializedName(SERIALIZED_NAME_TOO_SHORT)
  private Boolean tooShort;

  public static final String SERIALIZED_NAME_MISSING_NUMBER = "missingNumber";
  @SerializedName(SERIALIZED_NAME_MISSING_NUMBER)
  private Boolean missingNumber;

  public static final String SERIALIZED_NAME_MISSING_SYMBOL = "missingSymbol";
  @SerializedName(SERIALIZED_NAME_MISSING_SYMBOL)
  private Boolean missingSymbol;

  public static final String SERIALIZED_NAME_MISSING_UPPER_CASE = "missingUpperCase";
  @SerializedName(SERIALIZED_NAME_MISSING_UPPER_CASE)
  private Boolean missingUpperCase;

  public static final String SERIALIZED_NAME_MISSING_LOWER_CASE = "missingLowerCase";
  @SerializedName(SERIALIZED_NAME_MISSING_LOWER_CASE)
  private Boolean missingLowerCase;

  public static final String SERIALIZED_NAME_COMMON_PASSWORD = "commonPassword";
  @SerializedName(SERIALIZED_NAME_COMMON_PASSWORD)
  private Boolean commonPassword;

  public static final String SERIALIZED_NAME_WAS_USED_BEFORE_AT = "wasUsedBeforeAt";
  @SerializedName(SERIALIZED_NAME_WAS_USED_BEFORE_AT)
  private Long wasUsedBeforeAt;

  public static final String SERIALIZED_NAME_MATCHES_LOGIN = "matchesLogin";
  @SerializedName(SERIALIZED_NAME_MATCHES_LOGIN)
  private LoginId matchesLogin;

  public static final String SERIALIZED_NAME_PASSWORDS_MISMATCH = "passwordsMismatch";
  @SerializedName(SERIALIZED_NAME_PASSWORDS_MISMATCH)
  private Boolean passwordsMismatch;

  public static final String SERIALIZED_NAME_STRENGTH = "strength";
  @SerializedName(SERIALIZED_NAME_STRENGTH)
  private String strength;

  public static final String SERIALIZED_NAME_WAS_USED_DAYS_AGO = "wasUsedDaysAgo";
  @SerializedName(SERIALIZED_NAME_WAS_USED_DAYS_AGO)
  private Long wasUsedDaysAgo;

  public static final String SERIALIZED_NAME_INCORRECT_ANSWERS = "incorrectAnswers";
  @SerializedName(SERIALIZED_NAME_INCORRECT_ANSWERS)
  private List<String> incorrectAnswers = null;

  public static final String SERIALIZED_NAME_REQUIRES_MORE_ANSWERS = "requiresMoreAnswers";
  @SerializedName(SERIALIZED_NAME_REQUIRES_MORE_ANSWERS)
  private Boolean requiresMoreAnswers;

  public static final String SERIALIZED_NAME_QUESTIONS_NOT_FOUND = "questionsNotFound";
  @SerializedName(SERIALIZED_NAME_QUESTIONS_NOT_FOUND)
  private List<String> questionsNotFound = null;

  public static final String SERIALIZED_NAME_INVALID_ANSWERS = "invalidAnswers";
  @SerializedName(SERIALIZED_NAME_INVALID_ANSWERS)
  private Map<String, AnswerErr> invalidAnswers = null;

  public static final String SERIALIZED_NAME_TOO_MANY_ANSWERS = "tooManyAnswers";
  @SerializedName(SERIALIZED_NAME_TOO_MANY_ANSWERS)
  private Boolean tooManyAnswers;

  public static final String SERIALIZED_NAME_WAIT_TIME_MS = "waitTimeMs";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_MS)
  private Integer waitTimeMs;

  public static final String SERIALIZED_NAME_WAIT_TIME_SECONDS = "waitTimeSeconds";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_SECONDS)
  private Integer waitTimeSeconds;

  public static final String SERIALIZED_NAME_WAIT_TIME_MINUTES = "waitTimeMinutes";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_MINUTES)
  private Integer waitTimeMinutes;

  public static final String SERIALIZED_NAME_EXPIRED_AT = "expiredAt";
  @SerializedName(SERIALIZED_NAME_EXPIRED_AT)
  private Long expiredAt;

  public static final String SERIALIZED_NAME_LOGIN_ID = "loginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private LoginId loginId;

  public Err() {
  }

  public Err code(String code) {
    
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


  public Err devMsg(String devMsg) {
    
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


  public Err msg(String msg) {
    
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


  public Err changedAt(Long changedAt) {
    
    this.changedAt = changedAt;
    return this;
  }

   /**
   * Get changedAt
   * @return changedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChangedAt() {
    return changedAt;
  }


  public void setChangedAt(Long changedAt) {
    this.changedAt = changedAt;
  }


  public Err changedDaysAgo(Long changedDaysAgo) {
    
    this.changedDaysAgo = changedDaysAgo;
    return this;
  }

   /**
   * Get changedDaysAgo
   * @return changedDaysAgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChangedDaysAgo() {
    return changedDaysAgo;
  }


  public void setChangedDaysAgo(Long changedDaysAgo) {
    this.changedDaysAgo = changedDaysAgo;
  }


  public Err tooLong(Boolean tooLong) {
    
    this.tooLong = tooLong;
    return this;
  }

   /**
   * Get tooLong
   * @return tooLong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTooLong() {
    return tooLong;
  }


  public void setTooLong(Boolean tooLong) {
    this.tooLong = tooLong;
  }


  public Err tooShort(Boolean tooShort) {
    
    this.tooShort = tooShort;
    return this;
  }

   /**
   * Get tooShort
   * @return tooShort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTooShort() {
    return tooShort;
  }


  public void setTooShort(Boolean tooShort) {
    this.tooShort = tooShort;
  }


  public Err missingNumber(Boolean missingNumber) {
    
    this.missingNumber = missingNumber;
    return this;
  }

   /**
   * Get missingNumber
   * @return missingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMissingNumber() {
    return missingNumber;
  }


  public void setMissingNumber(Boolean missingNumber) {
    this.missingNumber = missingNumber;
  }


  public Err missingSymbol(Boolean missingSymbol) {
    
    this.missingSymbol = missingSymbol;
    return this;
  }

   /**
   * Get missingSymbol
   * @return missingSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMissingSymbol() {
    return missingSymbol;
  }


  public void setMissingSymbol(Boolean missingSymbol) {
    this.missingSymbol = missingSymbol;
  }


  public Err missingUpperCase(Boolean missingUpperCase) {
    
    this.missingUpperCase = missingUpperCase;
    return this;
  }

   /**
   * Get missingUpperCase
   * @return missingUpperCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMissingUpperCase() {
    return missingUpperCase;
  }


  public void setMissingUpperCase(Boolean missingUpperCase) {
    this.missingUpperCase = missingUpperCase;
  }


  public Err missingLowerCase(Boolean missingLowerCase) {
    
    this.missingLowerCase = missingLowerCase;
    return this;
  }

   /**
   * Get missingLowerCase
   * @return missingLowerCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMissingLowerCase() {
    return missingLowerCase;
  }


  public void setMissingLowerCase(Boolean missingLowerCase) {
    this.missingLowerCase = missingLowerCase;
  }


  public Err commonPassword(Boolean commonPassword) {
    
    this.commonPassword = commonPassword;
    return this;
  }

   /**
   * Get commonPassword
   * @return commonPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCommonPassword() {
    return commonPassword;
  }


  public void setCommonPassword(Boolean commonPassword) {
    this.commonPassword = commonPassword;
  }


  public Err wasUsedBeforeAt(Long wasUsedBeforeAt) {
    
    this.wasUsedBeforeAt = wasUsedBeforeAt;
    return this;
  }

   /**
   * Get wasUsedBeforeAt
   * @return wasUsedBeforeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWasUsedBeforeAt() {
    return wasUsedBeforeAt;
  }


  public void setWasUsedBeforeAt(Long wasUsedBeforeAt) {
    this.wasUsedBeforeAt = wasUsedBeforeAt;
  }


  public Err matchesLogin(LoginId matchesLogin) {
    
    this.matchesLogin = matchesLogin;
    return this;
  }

   /**
   * Get matchesLogin
   * @return matchesLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoginId getMatchesLogin() {
    return matchesLogin;
  }


  public void setMatchesLogin(LoginId matchesLogin) {
    this.matchesLogin = matchesLogin;
  }


  public Err passwordsMismatch(Boolean passwordsMismatch) {
    
    this.passwordsMismatch = passwordsMismatch;
    return this;
  }

   /**
   * Get passwordsMismatch
   * @return passwordsMismatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPasswordsMismatch() {
    return passwordsMismatch;
  }


  public void setPasswordsMismatch(Boolean passwordsMismatch) {
    this.passwordsMismatch = passwordsMismatch;
  }


  public Err strength(String strength) {
    
    this.strength = strength;
    return this;
  }

   /**
   * Get strength
   * @return strength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStrength() {
    return strength;
  }


  public void setStrength(String strength) {
    this.strength = strength;
  }


  public Err wasUsedDaysAgo(Long wasUsedDaysAgo) {
    
    this.wasUsedDaysAgo = wasUsedDaysAgo;
    return this;
  }

   /**
   * Get wasUsedDaysAgo
   * @return wasUsedDaysAgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWasUsedDaysAgo() {
    return wasUsedDaysAgo;
  }


  public void setWasUsedDaysAgo(Long wasUsedDaysAgo) {
    this.wasUsedDaysAgo = wasUsedDaysAgo;
  }


  public Err incorrectAnswers(List<String> incorrectAnswers) {
    
    this.incorrectAnswers = incorrectAnswers;
    return this;
  }

  public Err addIncorrectAnswersItem(String incorrectAnswersItem) {
    if (this.incorrectAnswers == null) {
      this.incorrectAnswers = new ArrayList<>();
    }
    this.incorrectAnswers.add(incorrectAnswersItem);
    return this;
  }

   /**
   * Get incorrectAnswers
   * @return incorrectAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncorrectAnswers() {
    return incorrectAnswers;
  }


  public void setIncorrectAnswers(List<String> incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
  }


  public Err requiresMoreAnswers(Boolean requiresMoreAnswers) {
    
    this.requiresMoreAnswers = requiresMoreAnswers;
    return this;
  }

   /**
   * Get requiresMoreAnswers
   * @return requiresMoreAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresMoreAnswers() {
    return requiresMoreAnswers;
  }


  public void setRequiresMoreAnswers(Boolean requiresMoreAnswers) {
    this.requiresMoreAnswers = requiresMoreAnswers;
  }


  public Err questionsNotFound(List<String> questionsNotFound) {
    
    this.questionsNotFound = questionsNotFound;
    return this;
  }

  public Err addQuestionsNotFoundItem(String questionsNotFoundItem) {
    if (this.questionsNotFound == null) {
      this.questionsNotFound = new ArrayList<>();
    }
    this.questionsNotFound.add(questionsNotFoundItem);
    return this;
  }

   /**
   * Get questionsNotFound
   * @return questionsNotFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getQuestionsNotFound() {
    return questionsNotFound;
  }


  public void setQuestionsNotFound(List<String> questionsNotFound) {
    this.questionsNotFound = questionsNotFound;
  }


  public Err invalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    
    this.invalidAnswers = invalidAnswers;
    return this;
  }

  public Err putInvalidAnswersItem(String key, AnswerErr invalidAnswersItem) {
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

  public Map<String, AnswerErr> getInvalidAnswers() {
    return invalidAnswers;
  }


  public void setInvalidAnswers(Map<String, AnswerErr> invalidAnswers) {
    this.invalidAnswers = invalidAnswers;
  }


  public Err tooManyAnswers(Boolean tooManyAnswers) {
    
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


  public Err waitTimeMs(Integer waitTimeMs) {
    
    this.waitTimeMs = waitTimeMs;
    return this;
  }

   /**
   * Get waitTimeMs
   * @return waitTimeMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaitTimeMs() {
    return waitTimeMs;
  }


  public void setWaitTimeMs(Integer waitTimeMs) {
    this.waitTimeMs = waitTimeMs;
  }


  public Err waitTimeSeconds(Integer waitTimeSeconds) {
    
    this.waitTimeSeconds = waitTimeSeconds;
    return this;
  }

   /**
   * Get waitTimeSeconds
   * @return waitTimeSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaitTimeSeconds() {
    return waitTimeSeconds;
  }


  public void setWaitTimeSeconds(Integer waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
  }


  public Err waitTimeMinutes(Integer waitTimeMinutes) {
    
    this.waitTimeMinutes = waitTimeMinutes;
    return this;
  }

   /**
   * Get waitTimeMinutes
   * @return waitTimeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWaitTimeMinutes() {
    return waitTimeMinutes;
  }


  public void setWaitTimeMinutes(Integer waitTimeMinutes) {
    this.waitTimeMinutes = waitTimeMinutes;
  }


  public Err expiredAt(Long expiredAt) {
    
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Get expiredAt
   * @return expiredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExpiredAt() {
    return expiredAt;
  }


  public void setExpiredAt(Long expiredAt) {
    this.expiredAt = expiredAt;
  }


  public Err loginId(LoginId loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * Get loginId
   * @return loginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoginId getLoginId() {
    return loginId;
  }


  public void setLoginId(LoginId loginId) {
    this.loginId = loginId;
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
  public Err putAdditionalProperty(String key, Object value) {
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
    Err err = (Err) o;
    return Objects.equals(this.code, err.code) &&
        Objects.equals(this.devMsg, err.devMsg) &&
        Objects.equals(this.msg, err.msg) &&
        Objects.equals(this.changedAt, err.changedAt) &&
        Objects.equals(this.changedDaysAgo, err.changedDaysAgo) &&
        Objects.equals(this.tooLong, err.tooLong) &&
        Objects.equals(this.tooShort, err.tooShort) &&
        Objects.equals(this.missingNumber, err.missingNumber) &&
        Objects.equals(this.missingSymbol, err.missingSymbol) &&
        Objects.equals(this.missingUpperCase, err.missingUpperCase) &&
        Objects.equals(this.missingLowerCase, err.missingLowerCase) &&
        Objects.equals(this.commonPassword, err.commonPassword) &&
        Objects.equals(this.wasUsedBeforeAt, err.wasUsedBeforeAt) &&
        Objects.equals(this.matchesLogin, err.matchesLogin) &&
        Objects.equals(this.passwordsMismatch, err.passwordsMismatch) &&
        Objects.equals(this.strength, err.strength) &&
        Objects.equals(this.wasUsedDaysAgo, err.wasUsedDaysAgo) &&
        Objects.equals(this.incorrectAnswers, err.incorrectAnswers) &&
        Objects.equals(this.requiresMoreAnswers, err.requiresMoreAnswers) &&
        Objects.equals(this.questionsNotFound, err.questionsNotFound) &&
        Objects.equals(this.invalidAnswers, err.invalidAnswers) &&
        Objects.equals(this.tooManyAnswers, err.tooManyAnswers) &&
        Objects.equals(this.waitTimeMs, err.waitTimeMs) &&
        Objects.equals(this.waitTimeSeconds, err.waitTimeSeconds) &&
        Objects.equals(this.waitTimeMinutes, err.waitTimeMinutes) &&
        Objects.equals(this.expiredAt, err.expiredAt) &&
        Objects.equals(this.loginId, err.loginId)&&
        Objects.equals(this.additionalProperties, err.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, changedAt, changedDaysAgo, tooLong, tooShort, missingNumber, missingSymbol, missingUpperCase, missingLowerCase, commonPassword, wasUsedBeforeAt, matchesLogin, passwordsMismatch, strength, wasUsedDaysAgo, incorrectAnswers, requiresMoreAnswers, questionsNotFound, invalidAnswers, tooManyAnswers, waitTimeMs, waitTimeSeconds, waitTimeMinutes, expiredAt, loginId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Err {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    changedDaysAgo: ").append(toIndentedString(changedDaysAgo)).append("\n");
    sb.append("    tooLong: ").append(toIndentedString(tooLong)).append("\n");
    sb.append("    tooShort: ").append(toIndentedString(tooShort)).append("\n");
    sb.append("    missingNumber: ").append(toIndentedString(missingNumber)).append("\n");
    sb.append("    missingSymbol: ").append(toIndentedString(missingSymbol)).append("\n");
    sb.append("    missingUpperCase: ").append(toIndentedString(missingUpperCase)).append("\n");
    sb.append("    missingLowerCase: ").append(toIndentedString(missingLowerCase)).append("\n");
    sb.append("    commonPassword: ").append(toIndentedString(commonPassword)).append("\n");
    sb.append("    wasUsedBeforeAt: ").append(toIndentedString(wasUsedBeforeAt)).append("\n");
    sb.append("    matchesLogin: ").append(toIndentedString(matchesLogin)).append("\n");
    sb.append("    passwordsMismatch: ").append(toIndentedString(passwordsMismatch)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
    sb.append("    wasUsedDaysAgo: ").append(toIndentedString(wasUsedDaysAgo)).append("\n");
    sb.append("    incorrectAnswers: ").append(toIndentedString(incorrectAnswers)).append("\n");
    sb.append("    requiresMoreAnswers: ").append(toIndentedString(requiresMoreAnswers)).append("\n");
    sb.append("    questionsNotFound: ").append(toIndentedString(questionsNotFound)).append("\n");
    sb.append("    invalidAnswers: ").append(toIndentedString(invalidAnswers)).append("\n");
    sb.append("    tooManyAnswers: ").append(toIndentedString(tooManyAnswers)).append("\n");
    sb.append("    waitTimeMs: ").append(toIndentedString(waitTimeMs)).append("\n");
    sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
    sb.append("    waitTimeMinutes: ").append(toIndentedString(waitTimeMinutes)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("devMsg");
    openapiFields.add("msg");
    openapiFields.add("changedAt");
    openapiFields.add("changedDaysAgo");
    openapiFields.add("tooLong");
    openapiFields.add("tooShort");
    openapiFields.add("missingNumber");
    openapiFields.add("missingSymbol");
    openapiFields.add("missingUpperCase");
    openapiFields.add("missingLowerCase");
    openapiFields.add("commonPassword");
    openapiFields.add("wasUsedBeforeAt");
    openapiFields.add("matchesLogin");
    openapiFields.add("passwordsMismatch");
    openapiFields.add("strength");
    openapiFields.add("wasUsedDaysAgo");
    openapiFields.add("incorrectAnswers");
    openapiFields.add("requiresMoreAnswers");
    openapiFields.add("questionsNotFound");
    openapiFields.add("invalidAnswers");
    openapiFields.add("tooManyAnswers");
    openapiFields.add("waitTimeMs");
    openapiFields.add("waitTimeSeconds");
    openapiFields.add("waitTimeMinutes");
    openapiFields.add("expiredAt");
    openapiFields.add("loginId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("devMsg");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Err
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Err.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Err is not found in the empty JSON string", Err.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Err.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("devMsg") != null && !jsonObj.get("devMsg").isJsonNull()) && !jsonObj.get("devMsg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `devMsg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("devMsg").toString()));
      }
      if ((jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonNull()) && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      // validate the optional field `matchesLogin`
      if (jsonObj.get("matchesLogin") != null && !jsonObj.get("matchesLogin").isJsonNull()) {
        LoginId.validateJsonObject(jsonObj.getAsJsonObject("matchesLogin"));
      }
      if ((jsonObj.get("strength") != null && !jsonObj.get("strength").isJsonNull()) && !jsonObj.get("strength").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strength` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strength").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("incorrectAnswers") != null && !jsonObj.get("incorrectAnswers").isJsonNull()) && !jsonObj.get("incorrectAnswers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `incorrectAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("incorrectAnswers").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("questionsNotFound") != null && !jsonObj.get("questionsNotFound").isJsonNull()) && !jsonObj.get("questionsNotFound").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `questionsNotFound` to be an array in the JSON string but got `%s`", jsonObj.get("questionsNotFound").toString()));
      }
      // validate the optional field `loginId`
      if (jsonObj.get("loginId") != null && !jsonObj.get("loginId").isJsonNull()) {
        LoginId.validateJsonObject(jsonObj.getAsJsonObject("loginId"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Err.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Err' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Err> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Err.class));

       return (TypeAdapter<T>) new TypeAdapter<Err>() {
           @Override
           public void write(JsonWriter out, Err value) throws IOException {
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
           public Err read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Err instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Err given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Err
  * @throws IOException if the JSON string is invalid with respect to Err
  */
  public static Err fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Err.class);
  }

 /**
  * Convert an instance of Err to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

