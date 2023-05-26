package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsConstantProvider implements NullValueProvider, Serializable {
    private static final NullsConstantProvider NULLER = new NullsConstantProvider((Object) null);
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider((Object) null);
    protected final Object _nullValue;

    protected NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        if (obj == null) {
            AccessPattern accessPattern = AccessPattern.ALWAYS_NULL;
        } else {
            AccessPattern accessPattern2 = AccessPattern.CONSTANT;
        }
    }

    public static NullsConstantProvider forValue(Object obj) {
        if (obj == null) {
            return NULLER;
        }
        return new NullsConstantProvider(obj);
    }

    public static boolean isSkipper(NullValueProvider nullValueProvider) {
        return nullValueProvider == SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
