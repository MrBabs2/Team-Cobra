package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class UnknownSerializer extends StdSerializer<Object> {
    public UnknownSerializer() {
        super(Object.class);
    }

    /* access modifiers changed from: protected */
    public void failForEmpty(SerializerProvider serializerProvider, Object obj) throws JsonMappingException {
        serializerProvider.reportBadDefinition((Class<?>) handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}));
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return true;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(serializerProvider, obj);
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeEndObject();
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(serializerProvider, obj);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.START_OBJECT)));
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls, false);
    }
}
