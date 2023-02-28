/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class TollfreeVerification extends Resource {
    private static final long serialVersionUID = 214063870442761L;

    public static TollfreeVerificationCreator creator(final String businessName, final String businessWebsite, final String notificationEmail, final List<String> useCaseCategories, final String useCaseSummary, final String productionMessageSample, final List<String> optInImageUrls, final TollfreeVerification.OptInType optInType, final String messageVolume, final String tollfreePhoneNumberSid){
        return new TollfreeVerificationCreator(businessName, businessWebsite, notificationEmail, useCaseCategories, useCaseSummary, productionMessageSample, optInImageUrls, optInType, messageVolume, tollfreePhoneNumberSid);
    }

    public static TollfreeVerificationFetcher fetcher(final String pathSid){
        return new TollfreeVerificationFetcher(pathSid);
    }

    public static TollfreeVerificationReader reader(){
        return new TollfreeVerificationReader();
    }

    public static TollfreeVerificationUpdater updater(final String pathSid){
        return new TollfreeVerificationUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a TollfreeVerification object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return TollfreeVerification object represented by the provided JSON
    */
    public static TollfreeVerification fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TollfreeVerification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a TollfreeVerification object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return TollfreeVerification object represented by the provided JSON
    */
    public static TollfreeVerification fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TollfreeVerification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum OptInType {
        VERBAL("VERBAL"),
        WEB_FORM("WEB_FORM"),
        PAPER_FORM("PAPER_FORM"),
        VIA_TEXT("VIA_TEXT"),
        MOBILE_QR_CODE("MOBILE_QR_CODE");

        private final String value;

        private OptInType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static OptInType forValue(final String value) {
            return Promoter.enumFromString(value, OptInType.values());
        }
    }
    public enum Status {
        PENDING_REVIEW("PENDING_REVIEW"),
        IN_REVIEW("IN_REVIEW"),
        TWILIO_APPROVED("TWILIO_APPROVED"),
        TWILIO_REJECTED("TWILIO_REJECTED");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String customerProfileSid;
    private final String trustProductSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String regulatedItemSid;
    private final String businessName;
    private final String businessStreetAddress;
    private final String businessStreetAddress2;
    private final String businessCity;
    private final String businessStateProvinceRegion;
    private final String businessPostalCode;
    private final String businessCountry;
    private final String businessWebsite;
    private final String businessContactFirstName;
    private final String businessContactLastName;
    private final String businessContactEmail;
    private final com.twilio.type.PhoneNumber businessContactPhone;
    private final String notificationEmail;
    private final List<String> useCaseCategories;
    private final String useCaseSummary;
    private final String productionMessageSample;
    private final List<String> optInImageUrls;
    private final TollfreeVerification.OptInType optInType;
    private final String messageVolume;
    private final String additionalInformation;
    private final String tollfreePhoneNumberSid;
    private final TollfreeVerification.Status status;
    private final URI url;
    private final Map<String, Object> resourceLinks;
    private final String externalReferenceId;

    @JsonCreator
    private TollfreeVerification(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("customer_profile_sid")
        final String customerProfileSid,

        @JsonProperty("trust_product_sid")
        final String trustProductSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("regulated_item_sid")
        final String regulatedItemSid,

        @JsonProperty("business_name")
        final String businessName,

        @JsonProperty("business_street_address")
        final String businessStreetAddress,

        @JsonProperty("business_street_address2")
        final String businessStreetAddress2,

        @JsonProperty("business_city")
        final String businessCity,

        @JsonProperty("business_state_province_region")
        final String businessStateProvinceRegion,

        @JsonProperty("business_postal_code")
        final String businessPostalCode,

        @JsonProperty("business_country")
        final String businessCountry,

        @JsonProperty("business_website")
        final String businessWebsite,

        @JsonProperty("business_contact_first_name")
        final String businessContactFirstName,

        @JsonProperty("business_contact_last_name")
        final String businessContactLastName,

        @JsonProperty("business_contact_email")
        final String businessContactEmail,

        @JsonProperty("business_contact_phone")
        final com.twilio.type.PhoneNumber businessContactPhone,

        @JsonProperty("notification_email")
        final String notificationEmail,

        @JsonProperty("use_case_categories")
        final List<String> useCaseCategories,

        @JsonProperty("use_case_summary")
        final String useCaseSummary,

        @JsonProperty("production_message_sample")
        final String productionMessageSample,

        @JsonProperty("opt_in_image_urls")
        final List<String> optInImageUrls,

        @JsonProperty("opt_in_type")
        final TollfreeVerification.OptInType optInType,

        @JsonProperty("message_volume")
        final String messageVolume,

        @JsonProperty("additional_information")
        final String additionalInformation,

        @JsonProperty("tollfree_phone_number_sid")
        final String tollfreePhoneNumberSid,

        @JsonProperty("status")
        final TollfreeVerification.Status status,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("resource_links")
        final Map<String, Object> resourceLinks,

        @JsonProperty("external_reference_id")
        final String externalReferenceId
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.customerProfileSid = customerProfileSid;
        this.trustProductSid = trustProductSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.regulatedItemSid = regulatedItemSid;
        this.businessName = businessName;
        this.businessStreetAddress = businessStreetAddress;
        this.businessStreetAddress2 = businessStreetAddress2;
        this.businessCity = businessCity;
        this.businessStateProvinceRegion = businessStateProvinceRegion;
        this.businessPostalCode = businessPostalCode;
        this.businessCountry = businessCountry;
        this.businessWebsite = businessWebsite;
        this.businessContactFirstName = businessContactFirstName;
        this.businessContactLastName = businessContactLastName;
        this.businessContactEmail = businessContactEmail;
        this.businessContactPhone = businessContactPhone;
        this.notificationEmail = notificationEmail;
        this.useCaseCategories = useCaseCategories;
        this.useCaseSummary = useCaseSummary;
        this.productionMessageSample = productionMessageSample;
        this.optInImageUrls = optInImageUrls;
        this.optInType = optInType;
        this.messageVolume = messageVolume;
        this.additionalInformation = additionalInformation;
        this.tollfreePhoneNumberSid = tollfreePhoneNumberSid;
        this.status = status;
        this.url = url;
        this.resourceLinks = resourceLinks;
        this.externalReferenceId = externalReferenceId;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getCustomerProfileSid() {
            return this.customerProfileSid;
        }
        public final String getTrustProductSid() {
            return this.trustProductSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getRegulatedItemSid() {
            return this.regulatedItemSid;
        }
        public final String getBusinessName() {
            return this.businessName;
        }
        public final String getBusinessStreetAddress() {
            return this.businessStreetAddress;
        }
        public final String getBusinessStreetAddress2() {
            return this.businessStreetAddress2;
        }
        public final String getBusinessCity() {
            return this.businessCity;
        }
        public final String getBusinessStateProvinceRegion() {
            return this.businessStateProvinceRegion;
        }
        public final String getBusinessPostalCode() {
            return this.businessPostalCode;
        }
        public final String getBusinessCountry() {
            return this.businessCountry;
        }
        public final String getBusinessWebsite() {
            return this.businessWebsite;
        }
        public final String getBusinessContactFirstName() {
            return this.businessContactFirstName;
        }
        public final String getBusinessContactLastName() {
            return this.businessContactLastName;
        }
        public final String getBusinessContactEmail() {
            return this.businessContactEmail;
        }
        public final com.twilio.type.PhoneNumber getBusinessContactPhone() {
            return this.businessContactPhone;
        }
        public final String getNotificationEmail() {
            return this.notificationEmail;
        }
        public final List<String> getUseCaseCategories() {
            return this.useCaseCategories;
        }
        public final String getUseCaseSummary() {
            return this.useCaseSummary;
        }
        public final String getProductionMessageSample() {
            return this.productionMessageSample;
        }
        public final List<String> getOptInImageUrls() {
            return this.optInImageUrls;
        }
        public final TollfreeVerification.OptInType getOptInType() {
            return this.optInType;
        }
        public final String getMessageVolume() {
            return this.messageVolume;
        }
        public final String getAdditionalInformation() {
            return this.additionalInformation;
        }
        public final String getTollfreePhoneNumberSid() {
            return this.tollfreePhoneNumberSid;
        }
        public final TollfreeVerification.Status getStatus() {
            return this.status;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, Object> getResourceLinks() {
            return this.resourceLinks;
        }
        public final String getExternalReferenceId() {
            return this.externalReferenceId;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TollfreeVerification other = (TollfreeVerification) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(customerProfileSid, other.customerProfileSid) &&  Objects.equals(trustProductSid, other.trustProductSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(regulatedItemSid, other.regulatedItemSid) &&  Objects.equals(businessName, other.businessName) &&  Objects.equals(businessStreetAddress, other.businessStreetAddress) &&  Objects.equals(businessStreetAddress2, other.businessStreetAddress2) &&  Objects.equals(businessCity, other.businessCity) &&  Objects.equals(businessStateProvinceRegion, other.businessStateProvinceRegion) &&  Objects.equals(businessPostalCode, other.businessPostalCode) &&  Objects.equals(businessCountry, other.businessCountry) &&  Objects.equals(businessWebsite, other.businessWebsite) &&  Objects.equals(businessContactFirstName, other.businessContactFirstName) &&  Objects.equals(businessContactLastName, other.businessContactLastName) &&  Objects.equals(businessContactEmail, other.businessContactEmail) &&  Objects.equals(businessContactPhone, other.businessContactPhone) &&  Objects.equals(notificationEmail, other.notificationEmail) &&  Objects.equals(useCaseCategories, other.useCaseCategories) &&  Objects.equals(useCaseSummary, other.useCaseSummary) &&  Objects.equals(productionMessageSample, other.productionMessageSample) &&  Objects.equals(optInImageUrls, other.optInImageUrls) &&  Objects.equals(optInType, other.optInType) &&  Objects.equals(messageVolume, other.messageVolume) &&  Objects.equals(additionalInformation, other.additionalInformation) &&  Objects.equals(tollfreePhoneNumberSid, other.tollfreePhoneNumberSid) &&  Objects.equals(status, other.status) &&  Objects.equals(url, other.url) &&  Objects.equals(resourceLinks, other.resourceLinks) &&  Objects.equals(externalReferenceId, other.externalReferenceId)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, customerProfileSid, trustProductSid, dateCreated, dateUpdated, regulatedItemSid, businessName, businessStreetAddress, businessStreetAddress2, businessCity, businessStateProvinceRegion, businessPostalCode, businessCountry, businessWebsite, businessContactFirstName, businessContactLastName, businessContactEmail, businessContactPhone, notificationEmail, useCaseCategories, useCaseSummary, productionMessageSample, optInImageUrls, optInType, messageVolume, additionalInformation, tollfreePhoneNumberSid, status, url, resourceLinks, externalReferenceId);
    }

}

