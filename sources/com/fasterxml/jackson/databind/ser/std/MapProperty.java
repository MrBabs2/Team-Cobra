package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

public class MapProperty extends PropertyWriter {
    private static final BeanProperty BOGUS_PROP = new BeanProperty.Bogus();
    protected Object _key;
    protected final BeanProperty _property;
    protected Object _value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapProperty(TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(beanProperty == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : beanProperty.getMetadata());
        this._property = beanProperty == null ? BOGUS_PROP : beanProperty;
    }

    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    public AnnotatedMember getMember() {
        return this._property.getMember();
    }

    public String getName() {
        Object obj = this._key;
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    public JavaType getType() {
        return this._property.getType();
    }

    public void reset(Object obj, Object obj2, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2) {
        this._key = obj;
        this._value = obj2;
    }
}
