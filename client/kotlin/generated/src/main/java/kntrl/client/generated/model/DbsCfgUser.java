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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntrl.client.generated.model.InMemoryCfg;
import kntrl.client.generated.model.InTokenCfg;
import kntrl.client.generated.model.MongoCfg;
import kntrl.client.generated.model.MysqlCfg;
import kntrl.client.generated.model.PostgresCfg;
import kntrl.client.generated.model.RedisCfg;
import kntrl.client.generated.model.RemoteDbCfg;
import kntrl.client.generated.model.SqliteCfg;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import kntrl.client.generated.infra.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-10T21:18:46.730417+03:00[Europe/Kiev]")
public class DbsCfgUser extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DbsCfgUser.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DbsCfgUser.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DbsCfgUser' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InMemoryCfg> adapterInMemoryCfg = gson.getDelegateAdapter(this, TypeToken.get(InMemoryCfg.class));
            final TypeAdapter<InTokenCfg> adapterInTokenCfg = gson.getDelegateAdapter(this, TypeToken.get(InTokenCfg.class));
            final TypeAdapter<MongoCfg> adapterMongoCfg = gson.getDelegateAdapter(this, TypeToken.get(MongoCfg.class));
            final TypeAdapter<MysqlCfg> adapterMysqlCfg = gson.getDelegateAdapter(this, TypeToken.get(MysqlCfg.class));
            final TypeAdapter<PostgresCfg> adapterPostgresCfg = gson.getDelegateAdapter(this, TypeToken.get(PostgresCfg.class));
            final TypeAdapter<RedisCfg> adapterRedisCfg = gson.getDelegateAdapter(this, TypeToken.get(RedisCfg.class));
            final TypeAdapter<RemoteDbCfg> adapterRemoteDbCfg = gson.getDelegateAdapter(this, TypeToken.get(RemoteDbCfg.class));
            final TypeAdapter<SqliteCfg> adapterSqliteCfg = gson.getDelegateAdapter(this, TypeToken.get(SqliteCfg.class));

            return (TypeAdapter<T>) new TypeAdapter<DbsCfgUser>() {
                @Override
                public void write(JsonWriter out, DbsCfgUser value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InMemoryCfg`
                    if (value.getActualInstance() instanceof InMemoryCfg) {
                        JsonObject obj = adapterInMemoryCfg.toJsonTree((InMemoryCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InTokenCfg`
                    if (value.getActualInstance() instanceof InTokenCfg) {
                        JsonObject obj = adapterInTokenCfg.toJsonTree((InTokenCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `MongoCfg`
                    if (value.getActualInstance() instanceof MongoCfg) {
                        JsonObject obj = adapterMongoCfg.toJsonTree((MongoCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `MysqlCfg`
                    if (value.getActualInstance() instanceof MysqlCfg) {
                        JsonObject obj = adapterMysqlCfg.toJsonTree((MysqlCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PostgresCfg`
                    if (value.getActualInstance() instanceof PostgresCfg) {
                        JsonObject obj = adapterPostgresCfg.toJsonTree((PostgresCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RedisCfg`
                    if (value.getActualInstance() instanceof RedisCfg) {
                        JsonObject obj = adapterRedisCfg.toJsonTree((RedisCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RemoteDbCfg`
                    if (value.getActualInstance() instanceof RemoteDbCfg) {
                        JsonObject obj = adapterRemoteDbCfg.toJsonTree((RemoteDbCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SqliteCfg`
                    if (value.getActualInstance() instanceof SqliteCfg) {
                        JsonObject obj = adapterSqliteCfg.toJsonTree((SqliteCfg)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InMemoryCfg, InTokenCfg, MongoCfg, MysqlCfg, PostgresCfg, RedisCfg, RemoteDbCfg, SqliteCfg");
                }

                @Override
                public DbsCfgUser read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize InMemoryCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InMemoryCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterInMemoryCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InMemoryCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InMemoryCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InMemoryCfg'", e);
                    }

                    // deserialize InTokenCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InTokenCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterInTokenCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InTokenCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InTokenCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InTokenCfg'", e);
                    }

                    // deserialize MongoCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MongoCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterMongoCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MongoCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MongoCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MongoCfg'", e);
                    }

                    // deserialize MysqlCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MysqlCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterMysqlCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MysqlCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MysqlCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MysqlCfg'", e);
                    }

                    // deserialize PostgresCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PostgresCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterPostgresCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PostgresCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PostgresCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PostgresCfg'", e);
                    }

                    // deserialize RedisCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RedisCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterRedisCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RedisCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RedisCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RedisCfg'", e);
                    }

                    // deserialize RemoteDbCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RemoteDbCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterRemoteDbCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RemoteDbCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RemoteDbCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RemoteDbCfg'", e);
                    }

                    // deserialize SqliteCfg
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SqliteCfg.validateJsonObject(jsonObject);
                        actualAdapter = adapterSqliteCfg;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SqliteCfg'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SqliteCfg failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SqliteCfg'", e);
                    }

                    if (match == 1) {
                        DbsCfgUser ret = new DbsCfgUser();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DbsCfgUser: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DbsCfgUser() {
        super("oneOf", Boolean.FALSE);
    }

    public DbsCfgUser(InMemoryCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(InTokenCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(MongoCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(MysqlCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(PostgresCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(RedisCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(RemoteDbCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DbsCfgUser(SqliteCfg o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InMemoryCfg", new GenericType<InMemoryCfg>() {
        });
        schemas.put("InTokenCfg", new GenericType<InTokenCfg>() {
        });
        schemas.put("MongoCfg", new GenericType<MongoCfg>() {
        });
        schemas.put("MysqlCfg", new GenericType<MysqlCfg>() {
        });
        schemas.put("PostgresCfg", new GenericType<PostgresCfg>() {
        });
        schemas.put("RedisCfg", new GenericType<RedisCfg>() {
        });
        schemas.put("RemoteDbCfg", new GenericType<RemoteDbCfg>() {
        });
        schemas.put("SqliteCfg", new GenericType<SqliteCfg>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DbsCfgUser.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InMemoryCfg, InTokenCfg, MongoCfg, MysqlCfg, PostgresCfg, RedisCfg, RemoteDbCfg, SqliteCfg
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InMemoryCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InTokenCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MongoCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MysqlCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PostgresCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RedisCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RemoteDbCfg) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SqliteCfg) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InMemoryCfg, InTokenCfg, MongoCfg, MysqlCfg, PostgresCfg, RedisCfg, RemoteDbCfg, SqliteCfg");
    }

    /**
     * Get the actual instance, which can be the following:
     * InMemoryCfg, InTokenCfg, MongoCfg, MysqlCfg, PostgresCfg, RedisCfg, RemoteDbCfg, SqliteCfg
     *
     * @return The actual instance (InMemoryCfg, InTokenCfg, MongoCfg, MysqlCfg, PostgresCfg, RedisCfg, RemoteDbCfg, SqliteCfg)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InMemoryCfg`. If the actual instance is not `InMemoryCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InMemoryCfg`
     * @throws ClassCastException if the instance is not `InMemoryCfg`
     */
    public InMemoryCfg getInMemoryCfg() throws ClassCastException {
        return (InMemoryCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InTokenCfg`. If the actual instance is not `InTokenCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InTokenCfg`
     * @throws ClassCastException if the instance is not `InTokenCfg`
     */
    public InTokenCfg getInTokenCfg() throws ClassCastException {
        return (InTokenCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MongoCfg`. If the actual instance is not `MongoCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MongoCfg`
     * @throws ClassCastException if the instance is not `MongoCfg`
     */
    public MongoCfg getMongoCfg() throws ClassCastException {
        return (MongoCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MysqlCfg`. If the actual instance is not `MysqlCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MysqlCfg`
     * @throws ClassCastException if the instance is not `MysqlCfg`
     */
    public MysqlCfg getMysqlCfg() throws ClassCastException {
        return (MysqlCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PostgresCfg`. If the actual instance is not `PostgresCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PostgresCfg`
     * @throws ClassCastException if the instance is not `PostgresCfg`
     */
    public PostgresCfg getPostgresCfg() throws ClassCastException {
        return (PostgresCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RedisCfg`. If the actual instance is not `RedisCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedisCfg`
     * @throws ClassCastException if the instance is not `RedisCfg`
     */
    public RedisCfg getRedisCfg() throws ClassCastException {
        return (RedisCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RemoteDbCfg`. If the actual instance is not `RemoteDbCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RemoteDbCfg`
     * @throws ClassCastException if the instance is not `RemoteDbCfg`
     */
    public RemoteDbCfg getRemoteDbCfg() throws ClassCastException {
        return (RemoteDbCfg)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SqliteCfg`. If the actual instance is not `SqliteCfg`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SqliteCfg`
     * @throws ClassCastException if the instance is not `SqliteCfg`
     */
    public SqliteCfg getSqliteCfg() throws ClassCastException {
        return (SqliteCfg)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DbsCfgUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with InMemoryCfg
    try {
      InMemoryCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InMemoryCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InTokenCfg
    try {
      InTokenCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InTokenCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with MongoCfg
    try {
      MongoCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MongoCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with MysqlCfg
    try {
      MysqlCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MysqlCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PostgresCfg
    try {
      PostgresCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PostgresCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RedisCfg
    try {
      RedisCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedisCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RemoteDbCfg
    try {
      RemoteDbCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RemoteDbCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SqliteCfg
    try {
      SqliteCfg.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SqliteCfg failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DbsCfgUser with oneOf schemas: InMemoryCfg, InTokenCfg, MongoCfg, MysqlCfg, PostgresCfg, RedisCfg, RemoteDbCfg, SqliteCfg. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of DbsCfgUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbsCfgUser
  * @throws IOException if the JSON string is invalid with respect to DbsCfgUser
  */
  public static DbsCfgUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbsCfgUser.class);
  }

 /**
  * Convert an instance of DbsCfgUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

