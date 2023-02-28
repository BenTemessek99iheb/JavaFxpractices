/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

import java.net.URI;

/**
 * Test class for {@link Play}
 */
public class PlayTest {
    @Test
    public void testElementWithParams() {
        Play elem = new Play.Builder(URI.create("https://example.com")).loop(1).digits("digits").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Play digits=\"digits\" loop=\"1\">https://example.com</Play>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Play elem = new Play.Builder(URI.create("https://example.com")).loop(1).digits("digits").build();

        Assert.assertEquals(
            Play.Builder.fromXml("<Play digits=\"digits\" loop=\"1\">https://example.com</Play>").build().toXml(),
            elem.toXml()
        );
    }
}