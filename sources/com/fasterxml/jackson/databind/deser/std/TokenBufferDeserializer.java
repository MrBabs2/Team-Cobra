package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

@JacksonStdImpl
public class TokenBufferDeserializer extends StdScalarDeserializer<TokenBuffer> {
    public TokenBufferDeserializer() {
        super((Class<?>) TokenBuffer.class);
    }

    /* access modifiers changed from: protected */
    public TokenBuffer createBufferInstance(JsonParser jsonParser) {
        return new TokenBuffer(jsonParser);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        TokenBuffer createBufferInstance = createBufferInstance(jsonParser);
        createBufferInstance.deserialize(jsonParser, deserializationContext);
        return createBufferInstance;
    }
}
