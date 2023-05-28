package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public final class WritableObjectId {
    public final ObjectIdGenerator<?> generator;

    /* renamed from: id */
    public Object f12508id;
    protected boolean idWritten = false;

    public WritableObjectId(ObjectIdGenerator<?> objectIdGenerator) {
        this.generator = objectIdGenerator;
    }

    public Object generateId(Object obj) {
        if (this.f12508id == null) {
            this.f12508id = this.generator.generateId(obj);
        }
        return this.f12508id;
    }

    public void writeAsField(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) throws IOException {
        this.idWritten = true;
        if (jsonGenerator.canWriteObjectId()) {
            jsonGenerator.writeObjectId(String.valueOf(this.f12508id));
            return;
        }
        SerializableString serializableString = objectIdWriter.propertyName;
        if (serializableString != null) {
            jsonGenerator.writeFieldName(serializableString);
            objectIdWriter.serializer.serialize(this.f12508id, jsonGenerator, serializerProvider);
        }
    }

    public boolean writeAsId(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) throws IOException {
        if (this.f12508id == null) {
            return false;
        }
        if (!this.idWritten && !objectIdWriter.alwaysAsId) {
            return false;
        }
        if (!jsonGenerator.canWriteObjectId()) {
            objectIdWriter.serializer.serialize(this.f12508id, jsonGenerator, serializerProvider);
            return true;
        }
        jsonGenerator.writeObjectRef(String.valueOf(this.f12508id));
        throw null;
    }
}
