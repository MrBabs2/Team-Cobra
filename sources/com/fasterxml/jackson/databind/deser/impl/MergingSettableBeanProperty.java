package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

public class MergingSettableBeanProperty extends SettableBeanProperty.Delegating {
    protected final AnnotatedMember _accessor;

    protected MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this._accessor = annotatedMember;
    }

    public static MergingSettableBeanProperty construct(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        return new MergingSettableBeanProperty(settableBeanProperty, annotatedMember);
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            obj2 = this.delegate.deserialize(jsonParser, deserializationContext);
        } else {
            obj2 = this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        }
        if (obj2 != value) {
            this.delegate.set(obj, obj2);
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            obj2 = this.delegate.deserialize(jsonParser, deserializationContext);
        } else {
            obj2 = this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        }
        return (obj2 == value || obj2 == null) ? obj : this.delegate.setAndReturn(obj, obj2);
    }

    public void set(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            this.delegate.set(obj, obj2);
        }
    }

    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return obj2 != null ? this.delegate.setAndReturn(obj, obj2) : obj;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this._accessor);
    }
}
