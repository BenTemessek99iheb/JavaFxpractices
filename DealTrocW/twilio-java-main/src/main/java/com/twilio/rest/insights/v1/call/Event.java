/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Insights
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.insights.v1.call;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Event extends Resource {
    private static final long serialVersionUID = 246803433322501L;

    public static EventReader reader(final String pathCallSid){
        return new EventReader(pathCallSid);
    }

    /**
    * Converts a JSON String into a Event object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Event object represented by the provided JSON
    */
    public static Event fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Event.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Event object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Event object represented by the provided JSON
    */
    public static Event fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Event.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Level {
        UNKNOWN("UNKNOWN"),
        DEBUG("DEBUG"),
        INFO("INFO"),
        WARNING("WARNING"),
        ERROR("ERROR");

        private final String value;

        private Level(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Level forValue(final String value) {
            return Promoter.enumFromString(value, Level.values());
        }
    }
    public enum TwilioEdge {
        UNKNOWN_EDGE("unknown_edge"),
        CARRIER_EDGE("carrier_edge"),
        SIP_EDGE("sip_edge"),
        SDK_EDGE("sdk_edge"),
        CLIENT_EDGE("client_edge");

        private final String value;

        private TwilioEdge(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static TwilioEdge forValue(final String value) {
            return Promoter.enumFromString(value, TwilioEdge.values());
        }
    }

    private final String timestamp;
    private final String callSid;
    private final String accountSid;
    private final Event.TwilioEdge edge;
    private final String group;
    private final Event.Level level;
    private final String name;
    private final Map<String, Object> carrierEdge;
    private final Map<String, Object> sipEdge;
    private final Map<String, Object> sdkEdge;
    private final Map<String, Object> clientEdge;

    @JsonCreator
    private Event(
        @JsonProperty("timestamp")
        final String timestamp,

        @JsonProperty("call_sid")
        final String callSid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("edge")
        final Event.TwilioEdge edge,

        @JsonProperty("group")
        final String group,

        @JsonProperty("level")
        final Event.Level level,

        @JsonProperty("name")
        final String name,

        @JsonProperty("carrier_edge")
        final Map<String, Object> carrierEdge,

        @JsonProperty("sip_edge")
        final Map<String, Object> sipEdge,

        @JsonProperty("sdk_edge")
        final Map<String, Object> sdkEdge,

        @JsonProperty("client_edge")
        final Map<String, Object> clientEdge
    ) {
        this.timestamp = timestamp;
        this.callSid = callSid;
        this.accountSid = accountSid;
        this.edge = edge;
        this.group = group;
        this.level = level;
        this.name = name;
        this.carrierEdge = carrierEdge;
        this.sipEdge = sipEdge;
        this.sdkEdge = sdkEdge;
        this.clientEdge = clientEdge;
    }

        public final String getTimestamp() {
            return this.timestamp;
        }
        public final String getCallSid() {
            return this.callSid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Event.TwilioEdge getEdge() {
            return this.edge;
        }
        public final String getGroup() {
            return this.group;
        }
        public final Event.Level getLevel() {
            return this.level;
        }
        public final String getName() {
            return this.name;
        }
        public final Map<String, Object> getCarrierEdge() {
            return this.carrierEdge;
        }
        public final Map<String, Object> getSipEdge() {
            return this.sipEdge;
        }
        public final Map<String, Object> getSdkEdge() {
            return this.sdkEdge;
        }
        public final Map<String, Object> getClientEdge() {
            return this.clientEdge;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Event other = (Event) o;

        return Objects.equals(timestamp, other.timestamp) &&  Objects.equals(callSid, other.callSid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(edge, other.edge) &&  Objects.equals(group, other.group) &&  Objects.equals(level, other.level) &&  Objects.equals(name, other.name) &&  Objects.equals(carrierEdge, other.carrierEdge) &&  Objects.equals(sipEdge, other.sipEdge) &&  Objects.equals(sdkEdge, other.sdkEdge) &&  Objects.equals(clientEdge, other.clientEdge)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, callSid, accountSid, edge, group, level, name, carrierEdge, sipEdge, sdkEdge, clientEdge);
    }

}

