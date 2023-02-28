/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.twilio.converter.Promoter;
import com.twilio.http.HttpMethod;
import com.twilio.twiml.TwiML;
import com.twilio.twiml.TwiMLException;

import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Conference>}
 */
@JsonDeserialize(builder = Conference.Builder.class)
public class Conference extends TwiML {
    public enum Beep {
        TRUE("true"),
        FALSE("false"),
        ONENTER("onEnter"),
        ONEXIT("onExit");

        private final String value;

        private Beep(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum Record {
        DO_NOT_RECORD("do-not-record"),
        RECORD_FROM_START("record-from-start");

        private final String value;

        private Record(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum Region {
        US1("us1"),
        IE1("ie1"),
        SG1("sg1"),
        BR1("br1"),
        AU1("au1"),
        JP1("jp1"),
        DE1("de1");

        private final String value;

        private Region(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum Event {
        START("start"),
        END("end"),
        JOIN("join"),
        LEAVE("leave"),
        MUTE("mute"),
        HOLD("hold"),
        MODIFY("modify"),
        SPEAKER("speaker"),
        ANNOUNCEMENT("announcement");

        private final String value;

        private Event(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum Trim {
        TRIM_SILENCE("trim-silence"),
        DO_NOT_TRIM("do-not-trim");

        private final String value;

        private Trim(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum RecordingEvent {
        IN_PROGRESS("in-progress"),
        COMPLETED("completed"),
        ABSENT("absent");

        private final String value;

        private RecordingEvent(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum JitterBufferSize {
        LARGE("large"),
        MEDIUM("medium"),
        SMALL("small"),
        OFF("off");

        private final String value;

        private JitterBufferSize(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    private final Boolean muted;
    private final Conference.Beep beep;
    private final Boolean startConferenceOnEnter;
    private final Boolean endConferenceOnExit;
    private final URI waitUrl;
    private final HttpMethod waitMethod;
    private final Integer maxParticipants;
    private final Conference.Record record;
    private final Conference.Region region;
    private final String coach;
    private final Conference.Trim trim;
    private final List<Conference.Event> statusCallbackEvent;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final URI recordingStatusCallback;
    private final HttpMethod recordingStatusCallbackMethod;
    private final List<Conference.RecordingEvent> recordingStatusCallbackEvent;
    private final URI eventCallbackUrl;
    private final Conference.JitterBufferSize jitterBufferSize;
    private final String participantLabel;
    private final String name;

    /**
     * For XML Serialization/Deserialization
     */
    private Conference() {
        this(new Builder((String) null));
    }

    /**
     * Create a new {@code <Conference>} element
     */
    private Conference(Builder b) {
        super("Conference", b);
        this.muted = b.muted;
        this.beep = b.beep;
        this.startConferenceOnEnter = b.startConferenceOnEnter;
        this.endConferenceOnExit = b.endConferenceOnExit;
        this.waitUrl = b.waitUrl;
        this.waitMethod = b.waitMethod;
        this.maxParticipants = b.maxParticipants;
        this.record = b.record;
        this.region = b.region;
        this.coach = b.coach;
        this.trim = b.trim;
        this.statusCallbackEvent = b.statusCallbackEvent;
        this.statusCallback = b.statusCallback;
        this.statusCallbackMethod = b.statusCallbackMethod;
        this.recordingStatusCallback = b.recordingStatusCallback;
        this.recordingStatusCallbackMethod = b.recordingStatusCallbackMethod;
        this.recordingStatusCallbackEvent = b.recordingStatusCallbackEvent;
        this.eventCallbackUrl = b.eventCallbackUrl;
        this.jitterBufferSize = b.jitterBufferSize;
        this.participantLabel = b.participantLabel;
        this.name = b.name;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getName() == null ? null : this.getName();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.isMuted() != null) {
            attrs.put("muted", this.isMuted().toString());
        }
        if (this.getBeep() != null) {
            attrs.put("beep", this.getBeep().toString());
        }
        if (this.isStartConferenceOnEnter() != null) {
            attrs.put("startConferenceOnEnter", this.isStartConferenceOnEnter().toString());
        }
        if (this.isEndConferenceOnExit() != null) {
            attrs.put("endConferenceOnExit", this.isEndConferenceOnExit().toString());
        }
        if (this.getWaitUrl() != null) {
            attrs.put("waitUrl", this.getWaitUrl().toString());
        }
        if (this.getWaitMethod() != null) {
            attrs.put("waitMethod", this.getWaitMethod().toString());
        }
        if (this.getMaxParticipants() != null) {
            attrs.put("maxParticipants", this.getMaxParticipants().toString());
        }
        if (this.getRecord() != null) {
            attrs.put("record", this.getRecord().toString());
        }
        if (this.getRegion() != null) {
            attrs.put("region", this.getRegion().toString());
        }
        if (this.getCoach() != null) {
            attrs.put("coach", this.getCoach());
        }
        if (this.getTrim() != null) {
            attrs.put("trim", this.getTrim().toString());
        }
        if (this.getStatusCallbackEvents() != null) {
            attrs.put("statusCallbackEvent", this.getStatusCallbackEventsAsString());
        }
        if (this.getStatusCallback() != null) {
            attrs.put("statusCallback", this.getStatusCallback().toString());
        }
        if (this.getStatusCallbackMethod() != null) {
            attrs.put("statusCallbackMethod", this.getStatusCallbackMethod().toString());
        }
        if (this.getRecordingStatusCallback() != null) {
            attrs.put("recordingStatusCallback", this.getRecordingStatusCallback().toString());
        }
        if (this.getRecordingStatusCallbackMethod() != null) {
            attrs.put("recordingStatusCallbackMethod", this.getRecordingStatusCallbackMethod().toString());
        }
        if (this.getRecordingStatusCallbackEvents() != null) {
            attrs.put("recordingStatusCallbackEvent", this.getRecordingStatusCallbackEventsAsString());
        }
        if (this.getEventCallbackUrl() != null) {
            attrs.put("eventCallbackUrl", this.getEventCallbackUrl().toString());
        }
        if (this.getJitterBufferSize() != null) {
            attrs.put("jitterBufferSize", this.getJitterBufferSize().toString());
        }
        if (this.getParticipantLabel() != null) {
            attrs.put("participantLabel", this.getParticipantLabel());
        }

        return attrs;
    }

    /**
     * Join the conference muted
     *
     * @return Join the conference muted
     */
    public Boolean isMuted() {
        return muted;
    }

    /**
     * Play beep when joining
     *
     * @return Play beep when joining
     */
    public Conference.Beep getBeep() {
        return beep;
    }

    /**
     * Start the conference on enter
     *
     * @return Start the conference on enter
     */
    public Boolean isStartConferenceOnEnter() {
        return startConferenceOnEnter;
    }

    /**
     * End the conferenceon exit
     *
     * @return End the conferenceon exit
     */
    public Boolean isEndConferenceOnExit() {
        return endConferenceOnExit;
    }

    /**
     * Wait URL
     *
     * @return Wait URL
     */
    public URI getWaitUrl() {
        return waitUrl;
    }

    /**
     * Wait URL method
     *
     * @return Wait URL method
     */
    public HttpMethod getWaitMethod() {
        return waitMethod;
    }

    /**
     * Maximum number of participants
     *
     * @return Maximum number of participants
     */
    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    /**
     * Record the conference
     *
     * @return Record the conference
     */
    public Conference.Record getRecord() {
        return record;
    }

    /**
     * Conference region
     *
     * @return Conference region
     */
    public Conference.Region getRegion() {
        return region;
    }

    /**
     * Call coach
     *
     * @return Call coach
     */
    public String getCoach() {
        return coach;
    }

    /**
     * Trim the conference recording
     *
     * @return Trim the conference recording
     */
    public Conference.Trim getTrim() {
        return trim;
    }

    /**
     * Events to call status callback URL
     *
     * @return Events to call status callback URL
     */
    public List<Conference.Event> getStatusCallbackEvents() {
        return statusCallbackEvent;
    }

    protected String getStatusCallbackEventsAsString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Conference.Event> iter = this.getStatusCallbackEvents().iterator();
        while (iter.hasNext()) {
            sb.append(iter.next().toString());
            if (iter.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * Status callback URL
     *
     * @return Status callback URL
     */
    public URI getStatusCallback() {
        return statusCallback;
    }

    /**
     * Status callback URL method
     *
     * @return Status callback URL method
     */
    public HttpMethod getStatusCallbackMethod() {
        return statusCallbackMethod;
    }

    /**
     * Recording status callback URL
     *
     * @return Recording status callback URL
     */
    public URI getRecordingStatusCallback() {
        return recordingStatusCallback;
    }

    /**
     * Recording status callback URL method
     *
     * @return Recording status callback URL method
     */
    public HttpMethod getRecordingStatusCallbackMethod() {
        return recordingStatusCallbackMethod;
    }

    /**
     * Recording status callback events
     *
     * @return Recording status callback events
     */
    public List<Conference.RecordingEvent> getRecordingStatusCallbackEvents() {
        return recordingStatusCallbackEvent;
    }

    protected String getRecordingStatusCallbackEventsAsString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Conference.RecordingEvent> iter = this.getRecordingStatusCallbackEvents().iterator();
        while (iter.hasNext()) {
            sb.append(iter.next().toString());
            if (iter.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * Event callback URL
     *
     * @return Event callback URL
     */
    public URI getEventCallbackUrl() {
        return eventCallbackUrl;
    }

    /**
     * Size of jitter buffer for participant
     *
     * @return Size of jitter buffer for participant
     */
    public Conference.JitterBufferSize getJitterBufferSize() {
        return jitterBufferSize;
    }

    /**
     * A label for participant
     *
     * @return A label for participant
     */
    public String getParticipantLabel() {
        return participantLabel;
    }

    /**
     * Conference name
     *
     * @return Conference name
     */
    public String getName() {
        return name;
    }

    /**
     * Create a new {@code <Conference>} element
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Conference.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Conference.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private Boolean muted;
        private Conference.Beep beep;
        private Boolean startConferenceOnEnter;
        private Boolean endConferenceOnExit;
        private URI waitUrl;
        private HttpMethod waitMethod;
        private Integer maxParticipants;
        private Conference.Record record;
        private Conference.Region region;
        private String coach;
        private Conference.Trim trim;
        private List<Conference.Event> statusCallbackEvent;
        private URI statusCallback;
        private HttpMethod statusCallbackMethod;
        private URI recordingStatusCallback;
        private HttpMethod recordingStatusCallbackMethod;
        private List<Conference.RecordingEvent> recordingStatusCallbackEvent;
        private URI eventCallbackUrl;
        private Conference.JitterBufferSize jitterBufferSize;
        private String participantLabel;
        private String name;

        /**
         * Create a {@code <Conference>} with name
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Create a {@code <Conference>} (for XML deserialization)
         */
        private Builder() {
        }

        /**
         * Join the conference muted
         */
        @JacksonXmlProperty(isAttribute = true, localName = "muted")
        public Builder muted(Boolean muted) {
            this.muted = muted;
            return this;
        }

        /**
         * Play beep when joining
         */
        @JacksonXmlProperty(isAttribute = true, localName = "beep")
        public Builder beep(Conference.Beep beep) {
            this.beep = beep;
            return this;
        }

        /**
         * Start the conference on enter
         */
        @JacksonXmlProperty(isAttribute = true, localName = "startConferenceOnEnter")
        public Builder startConferenceOnEnter(Boolean startConferenceOnEnter) {
            this.startConferenceOnEnter = startConferenceOnEnter;
            return this;
        }

        /**
         * End the conferenceon exit
         */
        @JacksonXmlProperty(isAttribute = true, localName = "endConferenceOnExit")
        public Builder endConferenceOnExit(Boolean endConferenceOnExit) {
            this.endConferenceOnExit = endConferenceOnExit;
            return this;
        }

        /**
         * Wait URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "waitUrl")
        public Builder waitUrl(URI waitUrl) {
            this.waitUrl = waitUrl;
            return this;
        }

        /**
         * Wait URL
         */
        public Builder waitUrl(String waitUrl) {
            this.waitUrl = Promoter.uriFromString(waitUrl);
            return this;
        }

        /**
         * Wait URL method
         */
        @JacksonXmlProperty(isAttribute = true, localName = "waitMethod")
        public Builder waitMethod(HttpMethod waitMethod) {
            this.waitMethod = waitMethod;
            return this;
        }

        /**
         * Maximum number of participants
         */
        @JacksonXmlProperty(isAttribute = true, localName = "maxParticipants")
        public Builder maxParticipants(Integer maxParticipants) {
            this.maxParticipants = maxParticipants;
            return this;
        }

        /**
         * Record the conference
         */
        @JacksonXmlProperty(isAttribute = true, localName = "record")
        public Builder record(Conference.Record record) {
            this.record = record;
            return this;
        }

        /**
         * Conference region
         */
        @JacksonXmlProperty(isAttribute = true, localName = "region")
        public Builder region(Conference.Region region) {
            this.region = region;
            return this;
        }

        /**
         * Call coach
         */
        @JacksonXmlProperty(isAttribute = true, localName = "coach")
        public Builder coach(String coach) {
            this.coach = coach;
            return this;
        }

        /**
         * Trim the conference recording
         */
        @JacksonXmlProperty(isAttribute = true, localName = "trim")
        public Builder trim(Conference.Trim trim) {
            this.trim = trim;
            return this;
        }

        /**
         * Events to call status callback URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "statusCallbackEvent")
        public Builder statusCallbackEvents(List<Conference.Event> statusCallbackEvent) {
            this.statusCallbackEvent = statusCallbackEvent;
            return this;
        }

        /**
         * Events to call status callback URL
         */
        public Builder statusCallbackEvents(Conference.Event statusCallbackEvent) {
            this.statusCallbackEvent = Promoter.listOfOne(statusCallbackEvent);
            return this;
        }

        /**
         * Status callback URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "statusCallback")
        public Builder statusCallback(URI statusCallback) {
            this.statusCallback = statusCallback;
            return this;
        }

        /**
         * Status callback URL
         */
        public Builder statusCallback(String statusCallback) {
            this.statusCallback = Promoter.uriFromString(statusCallback);
            return this;
        }

        /**
         * Status callback URL method
         */
        @JacksonXmlProperty(isAttribute = true, localName = "statusCallbackMethod")
        public Builder statusCallbackMethod(HttpMethod statusCallbackMethod) {
            this.statusCallbackMethod = statusCallbackMethod;
            return this;
        }

        /**
         * Recording status callback URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "recordingStatusCallback")
        public Builder recordingStatusCallback(URI recordingStatusCallback) {
            this.recordingStatusCallback = recordingStatusCallback;
            return this;
        }

        /**
         * Recording status callback URL
         */
        public Builder recordingStatusCallback(String recordingStatusCallback) {
            this.recordingStatusCallback = Promoter.uriFromString(recordingStatusCallback);
            return this;
        }

        /**
         * Recording status callback URL method
         */
        @JacksonXmlProperty(isAttribute = true, localName = "recordingStatusCallbackMethod")
        public Builder recordingStatusCallbackMethod(HttpMethod recordingStatusCallbackMethod) {
            this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
            return this;
        }

        /**
         * Recording status callback events
         */
        @JacksonXmlProperty(isAttribute = true, localName = "recordingStatusCallbackEvent")
        public Builder recordingStatusCallbackEvents(List<Conference.RecordingEvent> recordingStatusCallbackEvent) {
            this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
            return this;
        }

        /**
         * Recording status callback events
         */
        public Builder recordingStatusCallbackEvents(Conference.RecordingEvent recordingStatusCallbackEvent) {
            this.recordingStatusCallbackEvent = Promoter.listOfOne(recordingStatusCallbackEvent);
            return this;
        }

        /**
         * Event callback URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "eventCallbackUrl")
        public Builder eventCallbackUrl(URI eventCallbackUrl) {
            this.eventCallbackUrl = eventCallbackUrl;
            return this;
        }

        /**
         * Event callback URL
         */
        public Builder eventCallbackUrl(String eventCallbackUrl) {
            this.eventCallbackUrl = Promoter.uriFromString(eventCallbackUrl);
            return this;
        }

        /**
         * Size of jitter buffer for participant
         */
        @JacksonXmlProperty(isAttribute = true, localName = "jitterBufferSize")
        public Builder jitterBufferSize(Conference.JitterBufferSize jitterBufferSize) {
            this.jitterBufferSize = jitterBufferSize;
            return this;
        }

        /**
         * A label for participant
         */
        @JacksonXmlProperty(isAttribute = true, localName = "participantLabel")
        public Builder participantLabel(String participantLabel) {
            this.participantLabel = participantLabel;
            return this;
        }

        /**
         * Create and return resulting {@code <Conference>} element
         */
        public Conference build() {
            return new Conference(this);
        }
    }
}