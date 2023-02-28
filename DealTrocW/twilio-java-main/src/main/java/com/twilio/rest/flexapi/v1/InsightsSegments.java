/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InsightsSegments extends Resource {
    private static final long serialVersionUID = 85034429282364L;

    public static InsightsSegmentsFetcher fetcher(final String pathSegmentId){
        return new InsightsSegmentsFetcher(pathSegmentId);
    }

    public static InsightsSegmentsReader reader(){
        return new InsightsSegmentsReader();
    }

    /**
    * Converts a JSON String into a InsightsSegments object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return InsightsSegments object represented by the provided JSON
    */
    public static InsightsSegments fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InsightsSegments.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a InsightsSegments object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return InsightsSegments object represented by the provided JSON
    */
    public static InsightsSegments fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InsightsSegments.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String segmentId;
    private final String externalId;
    private final String queue;
    private final String externalContact;
    private final String externalSegmentLinkId;
    private final String date;
    private final String accountId;
    private final String externalSegmentLink;
    private final String agentId;
    private final String agentPhone;
    private final String agentName;
    private final String agentTeamName;
    private final String agentTeamNameInHierarchy;
    private final String agentLink;
    private final String customerPhone;
    private final String customerName;
    private final String customerLink;
    private final String segmentRecordingOffset;
    private final Map<String, Object> media;
    private final Map<String, Object> assessmentType;
    private final Map<String, Object> assessmentPercentage;
    private final URI url;

    @JsonCreator
    private InsightsSegments(
        @JsonProperty("segment_id")
        final String segmentId,

        @JsonProperty("external_id")
        final String externalId,

        @JsonProperty("queue")
        final String queue,

        @JsonProperty("external_contact")
        final String externalContact,

        @JsonProperty("external_segment_link_id")
        final String externalSegmentLinkId,

        @JsonProperty("date")
        final String date,

        @JsonProperty("account_id")
        final String accountId,

        @JsonProperty("external_segment_link")
        final String externalSegmentLink,

        @JsonProperty("agent_id")
        final String agentId,

        @JsonProperty("agent_phone")
        final String agentPhone,

        @JsonProperty("agent_name")
        final String agentName,

        @JsonProperty("agent_team_name")
        final String agentTeamName,

        @JsonProperty("agent_team_name_in_hierarchy")
        final String agentTeamNameInHierarchy,

        @JsonProperty("agent_link")
        final String agentLink,

        @JsonProperty("customer_phone")
        final String customerPhone,

        @JsonProperty("customer_name")
        final String customerName,

        @JsonProperty("customer_link")
        final String customerLink,

        @JsonProperty("segment_recording_offset")
        final String segmentRecordingOffset,

        @JsonProperty("media")
        final Map<String, Object> media,

        @JsonProperty("assessment_type")
        final Map<String, Object> assessmentType,

        @JsonProperty("assessment_percentage")
        final Map<String, Object> assessmentPercentage,

        @JsonProperty("url")
        final URI url
    ) {
        this.segmentId = segmentId;
        this.externalId = externalId;
        this.queue = queue;
        this.externalContact = externalContact;
        this.externalSegmentLinkId = externalSegmentLinkId;
        this.date = date;
        this.accountId = accountId;
        this.externalSegmentLink = externalSegmentLink;
        this.agentId = agentId;
        this.agentPhone = agentPhone;
        this.agentName = agentName;
        this.agentTeamName = agentTeamName;
        this.agentTeamNameInHierarchy = agentTeamNameInHierarchy;
        this.agentLink = agentLink;
        this.customerPhone = customerPhone;
        this.customerName = customerName;
        this.customerLink = customerLink;
        this.segmentRecordingOffset = segmentRecordingOffset;
        this.media = media;
        this.assessmentType = assessmentType;
        this.assessmentPercentage = assessmentPercentage;
        this.url = url;
    }

        public final String getSegmentId() {
            return this.segmentId;
        }
        public final String getExternalId() {
            return this.externalId;
        }
        public final String getQueue() {
            return this.queue;
        }
        public final String getExternalContact() {
            return this.externalContact;
        }
        public final String getExternalSegmentLinkId() {
            return this.externalSegmentLinkId;
        }
        public final String getDate() {
            return this.date;
        }
        public final String getAccountId() {
            return this.accountId;
        }
        public final String getExternalSegmentLink() {
            return this.externalSegmentLink;
        }
        public final String getAgentId() {
            return this.agentId;
        }
        public final String getAgentPhone() {
            return this.agentPhone;
        }
        public final String getAgentName() {
            return this.agentName;
        }
        public final String getAgentTeamName() {
            return this.agentTeamName;
        }
        public final String getAgentTeamNameInHierarchy() {
            return this.agentTeamNameInHierarchy;
        }
        public final String getAgentLink() {
            return this.agentLink;
        }
        public final String getCustomerPhone() {
            return this.customerPhone;
        }
        public final String getCustomerName() {
            return this.customerName;
        }
        public final String getCustomerLink() {
            return this.customerLink;
        }
        public final String getSegmentRecordingOffset() {
            return this.segmentRecordingOffset;
        }
        public final Map<String, Object> getMedia() {
            return this.media;
        }
        public final Map<String, Object> getAssessmentType() {
            return this.assessmentType;
        }
        public final Map<String, Object> getAssessmentPercentage() {
            return this.assessmentPercentage;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InsightsSegments other = (InsightsSegments) o;

        return Objects.equals(segmentId, other.segmentId) &&  Objects.equals(externalId, other.externalId) &&  Objects.equals(queue, other.queue) &&  Objects.equals(externalContact, other.externalContact) &&  Objects.equals(externalSegmentLinkId, other.externalSegmentLinkId) &&  Objects.equals(date, other.date) &&  Objects.equals(accountId, other.accountId) &&  Objects.equals(externalSegmentLink, other.externalSegmentLink) &&  Objects.equals(agentId, other.agentId) &&  Objects.equals(agentPhone, other.agentPhone) &&  Objects.equals(agentName, other.agentName) &&  Objects.equals(agentTeamName, other.agentTeamName) &&  Objects.equals(agentTeamNameInHierarchy, other.agentTeamNameInHierarchy) &&  Objects.equals(agentLink, other.agentLink) &&  Objects.equals(customerPhone, other.customerPhone) &&  Objects.equals(customerName, other.customerName) &&  Objects.equals(customerLink, other.customerLink) &&  Objects.equals(segmentRecordingOffset, other.segmentRecordingOffset) &&  Objects.equals(media, other.media) &&  Objects.equals(assessmentType, other.assessmentType) &&  Objects.equals(assessmentPercentage, other.assessmentPercentage) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(segmentId, externalId, queue, externalContact, externalSegmentLinkId, date, accountId, externalSegmentLink, agentId, agentPhone, agentName, agentTeamName, agentTeamNameInHierarchy, agentLink, customerPhone, customerName, customerLink, segmentRecordingOffset, media, assessmentType, assessmentPercentage, url);
    }

}

