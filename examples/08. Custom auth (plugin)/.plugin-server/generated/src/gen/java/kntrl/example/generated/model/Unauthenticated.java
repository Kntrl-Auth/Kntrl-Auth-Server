package kntrl.example.generated.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Unauthenticated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-19T21:13:03.480932+03:00[Europe/Kiev]")
public class Unauthenticated extends HashMap<String, Object>  {
  private @Valid String code;
  private @Valid String devMsg;
  private @Valid String msg;
  private @Valid Long expiredAt;

  /**
   **/
  public Unauthenticated code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Message for developers.
   **/
  public Unauthenticated devMsg(String devMsg) {
    this.devMsg = devMsg;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Message for developers.")
  @JsonProperty("devMsg")
  @NotNull
  public String getDevMsg() {
    return devMsg;
  }

  @JsonProperty("devMsg")
  public void setDevMsg(String devMsg) {
    this.devMsg = devMsg;
  }

  /**
   * Localised message suitable for UI.
   **/
  public Unauthenticated msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(value = "Localised message suitable for UI.")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  @JsonProperty("msg")
  public void setMsg(String msg) {
    this.msg = msg;
  }

  /**
   **/
  public Unauthenticated expiredAt(Long expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("expiredAt")
  public Long getExpiredAt() {
    return expiredAt;
  }

  @JsonProperty("expiredAt")
  public void setExpiredAt(Long expiredAt) {
    this.expiredAt = expiredAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unauthenticated unauthenticated = (Unauthenticated) o;
    return Objects.equals(this.code, unauthenticated.code) &&
        Objects.equals(this.devMsg, unauthenticated.devMsg) &&
        Objects.equals(this.msg, unauthenticated.msg) &&
        Objects.equals(this.expiredAt, unauthenticated.expiredAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, devMsg, msg, expiredAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unauthenticated {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    devMsg: ").append(toIndentedString(devMsg)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
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


}
