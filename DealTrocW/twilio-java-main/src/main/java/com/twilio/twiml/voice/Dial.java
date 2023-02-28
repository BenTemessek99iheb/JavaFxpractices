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
 * TwiML wrapper for {@code <Dial>}
 */
@JsonDeserialize(builder = Dial.Builder.class)
public class Dial extends TwiML {
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

    public enum Record {
        DO_NOT_RECORD("do-not-record"),
        RECORD_FROM_ANSWER("record-from-answer"),
        RECORD_FROM_RINGING("record-from-ringing"),
        RECORD_FROM_ANSWER_DUAL("record-from-answer-dual"),
        RECORD_FROM_RINGING_DUAL("record-from-ringing-dual");

        private final String value;

        private Record(final String value) {
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

    public enum RingTone {
        AT("at"),
        AU("au"),
        BG("bg"),
        BR("br"),
        BE("be"),
        CH("ch"),
        CL("cl"),
        CN("cn"),
        CZ("cz"),
        DE("de"),
        DK("dk"),
        EE("ee"),
        ES("es"),
        FI("fi"),
        FR("fr"),
        GR("gr"),
        HU("hu"),
        IL("il"),
        IN("in"),
        IT("it"),
        LT("lt"),
        JP("jp"),
        MX("mx"),
        MY("my"),
        NL("nl"),
        NO("no"),
        NZ("nz"),
        PH("ph"),
        PL("pl"),
        PT("pt"),
        RU("ru"),
        SE("se"),
        SG("sg"),
        TH("th"),
        UK("uk"),
        US("us"),
        US_OLD("us-old"),
        TW("tw"),
        VE("ve"),
        ZA("za");

        private final String value;

        private RingTone(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum RecordingTrack {
        BOTH("both"),
        INBOUND("inbound"),
        OUTBOUND("outbound");

        private final String value;

        private RecordingTrack(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    private final URI action;
    private final HttpMethod method;
    private final Integer timeout;
    private final Boolean hangupOnStar;
    private final Integer timeLimit;
    private final String callerId;
    private final Dial.Record record;
    private final Dial.Trim trim;
    private final URI recordingStatusCallback;
    private final HttpMethod recordingStatusCallbackMethod;
    private final List<Dial.RecordingEvent> recordingStatusCallbackEvent;
    private final Boolean answerOnBridge;
    private final Dial.RingTone ringTone;
    private final Dial.RecordingTrack recordingTrack;
    private final Boolean sequential;
    private final URI referUrl;
    private final HttpMethod referMethod;
    private final String number;

    /**
     * For XML Serialization/Deserialization
     */
    private Dial() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Dial>} element
     */
    private Dial(Builder b) {
        super("Dial", b);
        this.action = b.action;
        this.method = b.method;
        this.timeout = b.timeout;
        this.hangupOnStar = b.hangupOnStar;
        this.timeLimit = b.timeLimit;
        this.callerId = b.callerId;
        this.record = b.record;
        this.trim = b.trim;
        this.recordingStatusCallback = b.recordingStatusCallback;
        this.recordingStatusCallbackMethod = b.recordingStatusCallbackMethod;
        this.recordingStatusCallbackEvent = b.recordingStatusCallbackEvent;
        this.answerOnBridge = b.answerOnBridge;
        this.ringTone = b.ringTone;
        this.recordingTrack = b.recordingTrack;
        this.sequential = b.sequential;
        this.referUrl = b.referUrl;
        this.referMethod = b.referMethod;
        this.number = b.number;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getNumber() == null ? null : this.getNumber();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getAction() != null) {
            attrs.put("action", this.getAction().toString());
        }
        if (this.getMethod() != null) {
            attrs.put("method", this.getMethod().toString());
        }
        if (this.getTimeout() != null) {
            attrs.put("timeout", this.getTimeout().toString());
        }
        if (this.isHangupOnStar() != null) {
            attrs.put("hangupOnStar", this.isHangupOnStar().toString());
        }
        if (this.getTimeLimit() != null) {
            attrs.put("timeLimit", this.getTimeLimit().toString());
        }
        if (this.getCallerId() != null) {
            attrs.put("callerId", this.getCallerId());
        }
        if (this.getRecord() != null) {
            attrs.put("record", this.getRecord().toString());
        }
        if (this.getTrim() != null) {
            attrs.put("trim", this.getTrim().toString());
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
        if (this.isAnswerOnBridge() != null) {
            attrs.put("answerOnBridge", this.isAnswerOnBridge().toString());
        }
        if (this.getRingTone() != null) {
            attrs.put("ringTone", this.getRingTone().toString());
        }
        if (this.getRecordingTrack() != null) {
            attrs.put("recordingTrack", this.getRecordingTrack().toString());
        }
        if (this.isSequential() != null) {
            attrs.put("sequential", this.isSequential().toString());
        }
        if (this.getReferUrl() != null) {
            attrs.put("referUrl", this.getReferUrl().toString());
        }
        if (this.getReferMethod() != null) {
            attrs.put("referMethod", this.getReferMethod().toString());
        }

        return attrs;
    }

    /**
     * Action URL
     *
     * @return Action URL
     */
    public URI getAction() {
        return action;
    }

    /**
     * Action URL method
     *
     * @return Action URL method
     */
    public HttpMethod getMethod() {
        return method;
    }

    /**
     * Time to wait for answer
     *
     * @return Time to wait for answer
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Hangup call on star press
     *
     * @return Hangup call on star press
     */
    public Boolean isHangupOnStar() {
        return hangupOnStar;
    }

    /**
     * Max time length
     *
     * @return Max time length
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * Caller ID to display
     *
     * @return Caller ID to display
     */
    public String getCallerId() {
        return callerId;
    }

    /**
     * Record the call
     *
     * @return Record the call
     */
    public Dial.Record getRecord() {
        return record;
    }

    /**
     * Trim the recording
     *
     * @return Trim the recording
     */
    public Dial.Trim getTrim() {
        return trim;
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
    public List<Dial.RecordingEvent> getRecordingStatusCallbackEvents() {
        return recordingStatusCallbackEvent;
    }

    protected String getRecordingStatusCallbackEventsAsString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Dial.RecordingEvent> iter = this.getRecordingStatusCallbackEvents().iterator();
        while (iter.hasNext()) {
            sb.append(iter.next().toString());
            if (iter.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * Preserve the ringing behavior of the inbound call until the Dialed call picks
     * up
     *
     * @return Preserve the ringing behavior of the inbound call until the Dialed
     *         call picks up
     */
    public Boolean isAnswerOnBridge() {
        return answerOnBridge;
    }

    /**
     * Ringtone allows you to override the ringback tone that Twilio will play back
     * to the caller while executing the Dial
     *
     * @return Ringtone allows you to override the ringback tone that Twilio will
     *         play back to the caller while executing the Dial
     */
    public Dial.RingTone getRingTone() {
        return ringTone;
    }

    /**
     * To indicate which audio track should be recorded
     *
     * @return To indicate which audio track should be recorded
     */
    public Dial.RecordingTrack getRecordingTrack() {
        return recordingTrack;
    }

    /**
     * Used to determine if child TwiML nouns should be dialed in order, one after
     * the other (sequential) or dial all at once (parallel). Default is false,
     * parallel
     *
     * @return Used to determine if child TwiML nouns should be dialed in order,
     *         one after the other (sequential) or dial all at once (parallel).
     *         Default is false, parallel
     */
    public Boolean isSequential() {
        return sequential;
    }

    /**
     * Webhook that will receive future SIP REFER requests
     *
     * @return Webhook that will receive future SIP REFER requests
     */
    public URI getReferUrl() {
        return referUrl;
    }

    /**
     * The HTTP method to use for the refer Webhook
     *
     * @return The HTTP method to use for the refer Webhook
     */
    public HttpMethod getReferMethod() {
        return referMethod;
    }

    /**
     * Phone number to dial
     *
     * @return Phone number to dial
     */
    public String getNumber() {
        return number;
    }

    /**
     * Create a new {@code <Dial>} element
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Dial.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Dial.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private URI action;
        private HttpMethod method;
        private Integer timeout;
        private Boolean hangupOnStar;
        private Integer timeLimit;
        private String callerId;
        private Dial.Record record;
        private Dial.Trim trim;
        private URI recordingStatusCallback;
        private HttpMethod recordingStatusCallbackMethod;
        private List<Dial.RecordingEvent> recordingStatusCallbackEvent;
        private Boolean answerOnBridge;
        private Dial.RingTone ringTone;
        private Dial.RecordingTrack recordingTrack;
        private Boolean sequential;
        private URI referUrl;
        private HttpMethod referMethod;
        private String number;

        /**
         * Create a {@code <Dial>} with number
         */
        public Builder(String number) {
            this.number = number;
        }

        /**
         * Create a {@code <Dial>} with child elements
         */
        public Builder() {
        }

        /**
         * Action URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "action")
        public Builder action(URI action) {
            this.action = action;
            return this;
        }

        /**
         * Action URL
         */
        public Builder action(String action) {
            this.action = Promoter.uriFromString(action);
            return this;
        }

        /**
         * Action URL method
         */
        @JacksonXmlProperty(isAttribute = true, localName = "method")
        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Time to wait for answer
         */
        @JacksonXmlProperty(isAttribute = true, localName = "timeout")
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Hangup call on star press
         */
        @JacksonXmlProperty(isAttribute = true, localName = "hangupOnStar")
        public Builder hangupOnStar(Boolean hangupOnStar) {
            this.hangupOnStar = hangupOnStar;
            return this;
        }

        /**
         * Max time length
         */
        @JacksonXmlProperty(isAttribute = true, localName = "timeLimit")
        public Builder timeLimit(Integer timeLimit) {
            this.timeLimit = timeLimit;
            return this;
        }

        /**
         * Caller ID to display
         */
        @JacksonXmlProperty(isAttribute = true, localName = "callerId")
        public Builder callerId(String callerId) {
            this.callerId = callerId;
            return this;
        }

        /**
         * Record the call
         */
        @JacksonXmlProperty(isAttribute = true, localName = "record")
        public Builder record(Dial.Record record) {
            this.record = record;
            return this;
        }

        /**
         * Trim the recording
         */
        @JacksonXmlProperty(isAttribute = true, localName = "trim")
        public Builder trim(Dial.Trim trim) {
            this.trim = trim;
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
        public Builder recordingStatusCallbackEvents(List<Dial.RecordingEvent> recordingStatusCallbackEvent) {
            this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
            return this;
        }

        /**
         * Recording status callback events
         */
        public Builder recordingStatusCallbackEvents(Dial.RecordingEvent recordingStatusCallbackEvent) {
            this.recordingStatusCallbackEvent = Promoter.listOfOne(recordingStatusCallbackEvent);
            return this;
        }

        /**
         * Preserve the ringing behavior of the inbound call until the Dialed call picks
         * up
         */
        @JacksonXmlProperty(isAttribute = true, localName = "answerOnBridge")
        public Builder answerOnBridge(Boolean answerOnBridge) {
            this.answerOnBridge = answerOnBridge;
            return this;
        }

        /**
         * Ringtone allows you to override the ringback tone that Twilio will play back
         * to the caller while executing the Dial
         */
        @JacksonXmlProperty(isAttribute = true, localName = "ringTone")
        public Builder ringTone(Dial.RingTone ringTone) {
            this.ringTone = ringTone;
            return this;
        }

        /**
         * To indicate which audio track should be recorded
         */
        @JacksonXmlProperty(isAttribute = true, localName = "recordingTrack")
        public Builder recordingTrack(Dial.RecordingTrack recordingTrack) {
            this.recordingTrack = recordingTrack;
            return this;
        }

        /**
         * Used to determine if child TwiML nouns should be dialed in order, one after
         * the other (sequential) or dial all at once (parallel). Default is false,
         * parallel
         */
        @JacksonXmlProperty(isAttribute = true, localName = "sequential")
        public Builder sequential(Boolean sequential) {
            this.sequential = sequential;
            return this;
        }

        /**
         * Webhook that will receive future SIP REFER requests
         */
        @JacksonXmlProperty(isAttribute = true, localName = "referUrl")
        public Builder referUrl(URI referUrl) {
            this.referUrl = referUrl;
            return this;
        }

        /**
         * Webhook that will receive future SIP REFER requests
         */
        public Builder referUrl(String referUrl) {
            this.referUrl = Promoter.uriFromString(referUrl);
            return this;
        }

        /**
         * The HTTP method to use for the refer Webhook
         */
        @JacksonXmlProperty(isAttribute = true, localName = "referMethod")
        public Builder referMethod(HttpMethod referMethod) {
            this.referMethod = referMethod;
            return this;
        }

        /**
         * Phone number to dial
         */
        @JacksonXmlProperty(isAttribute = true, localName = "number")
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Add a child {@code <Client>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Client")
        public Builder client(Client client) {
            this.children.add(client);
            return this;
        }

        /**
         * Add a child {@code <Conference>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Conference")
        public Builder conference(Conference conference) {
            this.children.add(conference);
            return this;
        }

        /**
         * Add a child {@code <Number>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Number")
        public Builder number(Number number) {
            this.children.add(number);
            return this;
        }

        /**
         * Add a child {@code <Queue>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Queue")
        public Builder queue(Queue queue) {
            this.children.add(queue);
            return this;
        }

        /**
         * Add a child {@code <Sim>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Sim")
        public Builder sim(Sim sim) {
            this.children.add(sim);
            return this;
        }

        /**
         * Add a child {@code <Sip>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Sip")
        public Builder sip(Sip sip) {
            this.children.add(sip);
            return this;
        }

        /**
         * Add a child {@code <Application>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Application")
        public Builder application(Application application) {
            this.children.add(application);
            return this;
        }

        /**
         * Create and return resulting {@code <Dial>} element
         */
        public Dial build() {
            return new Dial(this);
        }
    }
}