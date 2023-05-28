package com.fasterxml.jackson.annotation;

abstract class ObjectIdGenerators$Base<T> extends ObjectIdGenerator<T> {
    protected final Class<?> _scope;

    protected ObjectIdGenerators$Base(Class<?> cls) {
        this._scope = cls;
    }

    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        return objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope;
    }

    public Class<?> getScope() {
        return this._scope;
    }
}
