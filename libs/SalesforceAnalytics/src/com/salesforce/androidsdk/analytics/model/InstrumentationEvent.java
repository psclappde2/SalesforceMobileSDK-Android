/*
 * Copyright (c) 2016, salesforce.com, inc.
 * All rights reserved.
 * Redistribution and use of this software in source and binary forms, with or
 * without modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * - Neither the name of salesforce.com, inc. nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission of salesforce.com, inc.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.salesforce.androidsdk.analytics.model;

import java.util.Map;

/**
 * Represents a typical instrumentation event. Transforms can be used to
 * convert this event into a specific library's event format.
 *
 * @author bhariharan
 */
public class InstrumentationEvent {

    private String eventId;

    private long startTime;
    private long endTime;
    private String name;
    private Map<String, Object> attributes;
    private int sessionId;
    private int sequenceId;
    private String senderId;
    private Map<String, Object> senderContext;
    private String jsonRepresentation;

    /**
     * Parameterized constructor.
     *
     * @param json JSON representation of this event.
     */
    public InstrumentationEvent(String json) {
        /*
         * TODO: Build event from JSON.
         */
        jsonRepresentation = json;
    }

    /**
     * Returns a unique identifier for this event.
     *
     * @return Event ID.
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Returns a JSON representation of this event.
     *
     * @return JSON string.
     */
    public String toJson() {
        /*
         * TODO: Construct a JSON representation of this event.
         */
        return jsonRepresentation;
    }

    /**
     * Represents the type of interaction being logged.
     */
    public enum Type {
        user,
        system,
        error,
        crud
    }

    /**
     * Represents the subtype of interaction being logged.
     */
    public enum Subtype {
        click,
        mouseover,
        create,
        swipe
    }

    /**
     * Represents the type of event being measured.
     */
    public enum EventType {
        interaction,
        pageView,
        perf,
        error
    }

    /**
     * Represents the type of error being logged.
     */
    public enum ErrorType {
        info,
        warn,
        error
    }
}
