package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public abstract class TypeSerializerBase extends TypeSerializer {
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;

    protected TypeSerializerBase(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        this._idResolver = typeIdResolver;
        this._property = beanProperty;
    }

    /* access modifiers changed from: protected */
    public void _generateTypeId(WritableTypeId writableTypeId) {
        String str;
        if (writableTypeId.f12506id == null) {
            Object obj = writableTypeId.forValue;
            Class<?> cls = writableTypeId.forValueType;
            if (cls == null) {
                str = idFromValue(obj);
            } else {
                str = idFromValueAndType(obj, cls);
            }
            writableTypeId.f12506id = str;
        }
    }

    public String getPropertyName() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void handleMissingId(Object obj) {
    }

    /* access modifiers changed from: protected */
    public String idFromValue(Object obj) {
        String idFromValue = this._idResolver.idFromValue(obj);
        if (idFromValue == null) {
            handleMissingId(obj);
        }
        return idFromValue;
    }

    /* access modifiers changed from: protected */
    public String idFromValueAndType(Object obj, Class<?> cls) {
        String idFromValueAndType = this._idResolver.idFromValueAndType(obj, cls);
        if (idFromValueAndType == null) {
            handleMissingId(obj);
        }
        return idFromValueAndType;
    }

    public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        _generateTypeId(writableTypeId);
        jsonGenerator.writeTypePrefix(writableTypeId);
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        jsonGenerator.writeTypeSuffix(writableTypeId);
        return writableTypeId;
    }
}
