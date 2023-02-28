/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.messaging;

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
import java.util.Map;

/**
 * TwiML wrapper for {@code <Message>}
 */
@JsonDeserialize(builder = Message.Builder.class)
public class Message extends TwiML {
    private final String to;
    private final String from;
    private final URI action;
    private final HttpMethod method;
    private final URI statusCallback;
    private final String body;

    /**
     * For XML Serialization/Deserialization
     */
    private Message() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Message>} element
     */
    private Message(Builder b) {
        super("Message", b);
        this.to = b.to;
        this.from = b.from;
        this.action = b.action;
        this.method = b.method;
        this.statusCallback = b.statusCallback;
        this.body = b.body;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getBody() == null ? null : this.getBody();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getTo() != null) {
            attrs.put("to", this.getTo());
        }
        if (this.getFrom() != null) {
            attrs.put("from", this.getFrom());
        }
        if (this.getAction() != null) {
            attrs.put("action", this.getAction().toString());
        }
        if (this.getMethod() != null) {
            attrs.put("method", this.getMethod().toString());
        }
        if (this.getStatusCallback() != null) {
            attrs.put("statusCallback", this.getStatusCallback().toString());
        }

        return attrs;
    }

    /**
     * Phone Number to send Message to
     *
     * @return Phone Number to send Message to
     */
    public String getTo() {
        return to;
    }

    /**
     * Phone Number to send Message from
     *
     * @return Phone Number to send Message from
     */
    public String getFrom() {
        return from;
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
     * Action URL Method
     *
     * @return Action URL Method
     */
    public HttpMethod getMethod() {
        return method;
    }

    /**
     * Status callback URL. Deprecated in favor of action.
     *
     * @return Status callback URL. Deprecated in favor of action.
     */
    public URI getStatusCallback() {
        return statusCallback;
    }

    /**
     * Message Body
     *
     * @return Message Body
     */
    public String getBody() {
        return body;
    }

    /**
     * Create a new {@code <Message>} element
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Message.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Message.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private String to;
        private String from;
        private URI action;
        private HttpMethod method;
        private URI statusCallback;
        private String body;

        /**
         * Create a {@code <Message>} with body
         */
        public Builder(String body) {
            this.body = body;
        }

        /**
         * Create a {@code <Message>} with child elements
         */
        public Builder() {
        }

        /**
         * Phone Number to send Message to
         */
        @JacksonXmlProperty(isAttribute = true, localName = "to")
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Phone Number to send Message from
         */
        @JacksonXmlProperty(isAttribute = true, localName = "from")
        public Builder from(String from) {
            this.from = from;
            return this;
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
         * Action URL Method
         */
        @JacksonXmlProperty(isAttribute = true, localName = "method")
        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Status callback URL. Deprecated in favor of action.
         */
        @JacksonXmlProperty(isAttribute = true, localName = "statusCallback")
        public Builder statusCallback(URI statusCallback) {
            this.statusCallback = statusCallback;
            return this;
        }

        /**
         * Status callback URL. Deprecated in favor of action.
         */
        public Builder statusCallback(String statusCallback) {
            this.statusCallback = Promoter.uriFromString(statusCallback);
            return this;
        }

        /**
         * Add a child {@code <Body>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Body")
        public Builder body(Body body) {
            this.children.add(body);
            return this;
        }

        /**
         * Add a child {@code <Media>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Media")
        public Builder media(Media media) {
            this.children.add(media);
            return this;
        }

        /**
         * Create and return resulting {@code <Message>} element
         */
        public Message build() {
            return new Message(this);
        }
    }
}