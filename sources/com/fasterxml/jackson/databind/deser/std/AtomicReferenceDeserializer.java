package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    public AtomicReferenceDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType, valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new AtomicReference();
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object updateReference(Object obj, Object obj2) {
        AtomicReference atomicReference = (AtomicReference) obj;
        updateReference((AtomicReference<Object>) atomicReference, obj2);
        return atomicReference;
    }

    public AtomicReference<Object> getNullValue(DeserializationContext deserializationContext) {
        return new AtomicReference<>();
    }

    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    public AtomicReferenceDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return new AtomicReferenceDeserializer(this._fullType, this._valueInstantiator, typeDeserializer, jsonDeserializer);
    }
}
