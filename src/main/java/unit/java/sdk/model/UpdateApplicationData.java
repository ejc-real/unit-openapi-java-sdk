/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package unit.java.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import unit.java.sdk.model.PatchBusinessApplication;
import unit.java.sdk.model.PatchBusinessApplicationBeneficialOwner;
import unit.java.sdk.model.PatchBusinessApplicationOfficer;
import unit.java.sdk.model.PatchIndividualApplication;
import unit.java.sdk.model.PatchSoleProprietorApplication;
import unit.java.sdk.model.PatchTrustApplication;
import unit.java.sdk.model.PatchTrustApplicationAttributes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import unit.java.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = UpdateApplicationData.UpdateApplicationDataDeserializer.class)
@JsonSerialize(using = UpdateApplicationData.UpdateApplicationDataSerializer.class)
public class UpdateApplicationData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateApplicationData.class.getName());

    public static class UpdateApplicationDataSerializer extends StdSerializer<UpdateApplicationData> {
        public UpdateApplicationDataSerializer(Class<UpdateApplicationData> t) {
            super(t);
        }

        public UpdateApplicationDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(UpdateApplicationData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UpdateApplicationDataDeserializer extends StdDeserializer<UpdateApplicationData> {
        public UpdateApplicationDataDeserializer() {
            this(UpdateApplicationData.class);
        }

        public UpdateApplicationDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UpdateApplicationData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PatchBusinessApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchBusinessApplication.class.equals(Integer.class) || PatchBusinessApplication.class.equals(Long.class) || PatchBusinessApplication.class.equals(Float.class) || PatchBusinessApplication.class.equals(Double.class) || PatchBusinessApplication.class.equals(Boolean.class) || PatchBusinessApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchBusinessApplication.class.equals(Integer.class) || PatchBusinessApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchBusinessApplication.class.equals(Float.class) || PatchBusinessApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchBusinessApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchBusinessApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchBusinessApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchBusinessApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchBusinessApplication'", e);
            }

            // deserialize PatchBusinessApplicationBeneficialOwner
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchBusinessApplicationBeneficialOwner.class.equals(Integer.class) || PatchBusinessApplicationBeneficialOwner.class.equals(Long.class) || PatchBusinessApplicationBeneficialOwner.class.equals(Float.class) || PatchBusinessApplicationBeneficialOwner.class.equals(Double.class) || PatchBusinessApplicationBeneficialOwner.class.equals(Boolean.class) || PatchBusinessApplicationBeneficialOwner.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchBusinessApplicationBeneficialOwner.class.equals(Integer.class) || PatchBusinessApplicationBeneficialOwner.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchBusinessApplicationBeneficialOwner.class.equals(Float.class) || PatchBusinessApplicationBeneficialOwner.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchBusinessApplicationBeneficialOwner.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchBusinessApplicationBeneficialOwner.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchBusinessApplicationBeneficialOwner.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchBusinessApplicationBeneficialOwner'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchBusinessApplicationBeneficialOwner'", e);
            }

            // deserialize PatchBusinessApplicationOfficer
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchBusinessApplicationOfficer.class.equals(Integer.class) || PatchBusinessApplicationOfficer.class.equals(Long.class) || PatchBusinessApplicationOfficer.class.equals(Float.class) || PatchBusinessApplicationOfficer.class.equals(Double.class) || PatchBusinessApplicationOfficer.class.equals(Boolean.class) || PatchBusinessApplicationOfficer.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchBusinessApplicationOfficer.class.equals(Integer.class) || PatchBusinessApplicationOfficer.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchBusinessApplicationOfficer.class.equals(Float.class) || PatchBusinessApplicationOfficer.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchBusinessApplicationOfficer.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchBusinessApplicationOfficer.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchBusinessApplicationOfficer.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchBusinessApplicationOfficer'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchBusinessApplicationOfficer'", e);
            }

            // deserialize PatchIndividualApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchIndividualApplication.class.equals(Integer.class) || PatchIndividualApplication.class.equals(Long.class) || PatchIndividualApplication.class.equals(Float.class) || PatchIndividualApplication.class.equals(Double.class) || PatchIndividualApplication.class.equals(Boolean.class) || PatchIndividualApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchIndividualApplication.class.equals(Integer.class) || PatchIndividualApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchIndividualApplication.class.equals(Float.class) || PatchIndividualApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchIndividualApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchIndividualApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchIndividualApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchIndividualApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchIndividualApplication'", e);
            }

            // deserialize PatchSoleProprietorApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchSoleProprietorApplication.class.equals(Integer.class) || PatchSoleProprietorApplication.class.equals(Long.class) || PatchSoleProprietorApplication.class.equals(Float.class) || PatchSoleProprietorApplication.class.equals(Double.class) || PatchSoleProprietorApplication.class.equals(Boolean.class) || PatchSoleProprietorApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchSoleProprietorApplication.class.equals(Integer.class) || PatchSoleProprietorApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchSoleProprietorApplication.class.equals(Float.class) || PatchSoleProprietorApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchSoleProprietorApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchSoleProprietorApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchSoleProprietorApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchSoleProprietorApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchSoleProprietorApplication'", e);
            }

            // deserialize PatchTrustApplication
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchTrustApplication.class.equals(Integer.class) || PatchTrustApplication.class.equals(Long.class) || PatchTrustApplication.class.equals(Float.class) || PatchTrustApplication.class.equals(Double.class) || PatchTrustApplication.class.equals(Boolean.class) || PatchTrustApplication.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchTrustApplication.class.equals(Integer.class) || PatchTrustApplication.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchTrustApplication.class.equals(Float.class) || PatchTrustApplication.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchTrustApplication.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchTrustApplication.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchTrustApplication.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchTrustApplication'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchTrustApplication'", e);
            }

            if (match == 1) {
                UpdateApplicationData ret = new UpdateApplicationData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UpdateApplicationData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UpdateApplicationData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UpdateApplicationData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public UpdateApplicationData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateApplicationData(PatchBusinessApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchBusinessApplicationBeneficialOwner o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchBusinessApplicationOfficer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchIndividualApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchSoleProprietorApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchTrustApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PatchBusinessApplication", PatchBusinessApplication.class);
        schemas.put("PatchBusinessApplicationBeneficialOwner", PatchBusinessApplicationBeneficialOwner.class);
        schemas.put("PatchBusinessApplicationOfficer", PatchBusinessApplicationOfficer.class);
        schemas.put("PatchIndividualApplication", PatchIndividualApplication.class);
        schemas.put("PatchSoleProprietorApplication", PatchSoleProprietorApplication.class);
        schemas.put("PatchTrustApplication", PatchTrustApplication.class);
        JSON.registerDescendants(UpdateApplicationData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateApplicationData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PatchBusinessApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PatchBusinessApplicationBeneficialOwner.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PatchBusinessApplicationOfficer.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PatchIndividualApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PatchSoleProprietorApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PatchTrustApplication.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication");
    }

    /**
     * Get the actual instance, which can be the following:
     * PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication
     *
     * @return The actual instance (PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchBusinessApplication`. If the actual instance is not `PatchBusinessApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessApplication`
     * @throws ClassCastException if the instance is not `PatchBusinessApplication`
     */
    public PatchBusinessApplication getPatchBusinessApplication() throws ClassCastException {
        return (PatchBusinessApplication)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchBusinessApplicationBeneficialOwner`. If the actual instance is not `PatchBusinessApplicationBeneficialOwner`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessApplicationBeneficialOwner`
     * @throws ClassCastException if the instance is not `PatchBusinessApplicationBeneficialOwner`
     */
    public PatchBusinessApplicationBeneficialOwner getPatchBusinessApplicationBeneficialOwner() throws ClassCastException {
        return (PatchBusinessApplicationBeneficialOwner)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchBusinessApplicationOfficer`. If the actual instance is not `PatchBusinessApplicationOfficer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessApplicationOfficer`
     * @throws ClassCastException if the instance is not `PatchBusinessApplicationOfficer`
     */
    public PatchBusinessApplicationOfficer getPatchBusinessApplicationOfficer() throws ClassCastException {
        return (PatchBusinessApplicationOfficer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchIndividualApplication`. If the actual instance is not `PatchIndividualApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchIndividualApplication`
     * @throws ClassCastException if the instance is not `PatchIndividualApplication`
     */
    public PatchIndividualApplication getPatchIndividualApplication() throws ClassCastException {
        return (PatchIndividualApplication)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchSoleProprietorApplication`. If the actual instance is not `PatchSoleProprietorApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchSoleProprietorApplication`
     * @throws ClassCastException if the instance is not `PatchSoleProprietorApplication`
     */
    public PatchSoleProprietorApplication getPatchSoleProprietorApplication() throws ClassCastException {
        return (PatchSoleProprietorApplication)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchTrustApplication`. If the actual instance is not `PatchTrustApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchTrustApplication`
     * @throws ClassCastException if the instance is not `PatchTrustApplication`
     */
    public PatchTrustApplication getPatchTrustApplication() throws ClassCastException {
        return (PatchTrustApplication)super.getActualInstance();
    }



  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    if (getActualInstance() instanceof PatchBusinessApplication) {
        if (getActualInstance() != null) {
          joiner.add(((PatchBusinessApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PatchBusinessApplicationOfficer) {
        if (getActualInstance() != null) {
          joiner.add(((PatchBusinessApplicationOfficer)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PatchBusinessApplicationBeneficialOwner) {
        if (getActualInstance() != null) {
          joiner.add(((PatchBusinessApplicationBeneficialOwner)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PatchSoleProprietorApplication) {
        if (getActualInstance() != null) {
          joiner.add(((PatchSoleProprietorApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PatchIndividualApplication) {
        if (getActualInstance() != null) {
          joiner.add(((PatchIndividualApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof PatchTrustApplication) {
        if (getActualInstance() != null) {
          joiner.add(((PatchTrustApplication)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

