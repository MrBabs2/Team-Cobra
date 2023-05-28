package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.util.RequestPayload;

public class JsonParseException extends StreamReadException {
    public JsonParseException(JsonParser jsonParser, String str) {
        super(jsonParser, str);
    }

    public String getMessage() {
        return super.getMessage();
    }

    public JsonParseException withRequestPayload(RequestPayload requestPayload) {
        this._requestPayload = requestPayload;
        return this;
    }

    public JsonParseException(JsonParser jsonParser, String str, Throwable th) {
        super(jsonParser, str, th);
    }

    public JsonParser getProcessor() {
        return super.getProcessor();
    }
}
