package com.fasterxml.jackson.core.p187io;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: com.fasterxml.jackson.core.io.JsonEOFException */
public class JsonEOFException extends JsonParseException {
    public JsonEOFException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        super(jsonParser, str);
    }
}
