package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    public PropertyBasedObjectIdGenerator(Class<?> cls) {
        super(cls);
    }

    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls);
    }

    public Object generateId(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(PropertyBasedObjectIdGenerator.class, this._scope, obj);
    }

    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }
}
