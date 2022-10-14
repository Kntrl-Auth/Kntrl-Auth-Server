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


package app.kntrl.client.generated.infra;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AccessDenied.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AccessTokenCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AnswerErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AnyErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AppSecretAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AppSecretReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthCodeHandlerCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthExecRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthExecResResData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthIsNotConfirmed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthIsNotEnabled.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthRequiresAnother.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthUserCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthenticateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthenticateReqAuthReqsValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthenticateRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthorizeReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.AuthorizeRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.BuiltInAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.ClientErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Code.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.CodeCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.CodeIsExpired.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.CodeIsIncorrect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.CodeTooManyAttempts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.CodeVerifier.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.ConfirmSessionAuthsReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.ConfirmUserAuthsReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.DbHealthRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.DbsCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.DbsCfgRateLimiter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.DbsCfgSession.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.DbsCfgUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Device.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EditUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EmailAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EmailAuthRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EmailAuthenticateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EmailIsIncorrect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EmailUpdateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EntryAccessTokenCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.EntryCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Err.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.ErrAuthExecRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.FindSessionsRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.HealthRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.HealthStatusRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.I18nCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.InMemoryCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.InTokenCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.IntegrationErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.IpAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.IpAuthRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.IpNew.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.JdbcCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Login.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.LoginId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.MongoCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.MysqlCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.NewSessionReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.NextFactor.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.NoAuthAvailableForFactor.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.OAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.OAuthReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.OAuthRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.OkAuthExecRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordAuthenticateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordHistoryCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordIsIncorrect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordIsInvalid.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordStrengthRequirements.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordUpdateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PasswordUpdateRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PluginClientErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PluginErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.PostgresCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsAnswersIncorrect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsAnswersInvalid.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsAuthenticateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsAuthenticateRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsUpdateReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.QuestionsUpdateRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RateLimiterCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RateLimiterReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RedisCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RefreshTokenCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RefreshTokenReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RefreshTokenRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RemoteAuthCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.RemoteDbCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SHAppCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SHAppCfgAuthsValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SHHttpCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SaveUserReq.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SaveUserRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.ServerErr.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Session.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SessionExpired.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SignatureIsIncorrect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SkippedAuthExecRes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.SqliteCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.TokenCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.TokenExpired.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.TokenHandlerCfg.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Tokens.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.TooManyReqs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.Unauthenticated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.UnconfirmedAuth.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.UnconfirmedAuthData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.UserLoginAlreadyTaken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new app.kntrl.client.generated.model.UserNotFound.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
