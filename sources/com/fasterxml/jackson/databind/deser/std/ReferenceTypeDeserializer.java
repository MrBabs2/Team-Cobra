package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer {
    protected final JavaType _fullType;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this._valueInstantiator = valueInstantiator;
        this._fullType = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, this._fullType.getReferencedType());
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        if (jsonDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) {
            return this;
        }
        return withResolved(typeDeserializer, jsonDeserializer);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            return deserialize(jsonParser, deserializationContext, valueInstantiator.createUsingDefault(deserializationContext));
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        return referenceValue(typeDeserializer == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer));
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
        if (typeDeserializer2 == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return referenceValue(typeDeserializer2.deserializeTypedFromAny(jsonParser, deserializationContext));
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public abstract Object getReferenced(T t);

    public JavaType getValueType() {
        return this._fullType;
    }

    public abstract T referenceValue(Object obj);

    public abstract T updateReference(T t, Object obj);

    /* access modifiers changed from: protected */
    public abstract ReferenceTypeDeserializer<T> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer);

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        Object obj;
        if (this._valueDeserializer.supportsUpdate(deserializationContext.getConfig()).equals(Boolean.FALSE) || this._valueTypeDeserializer != null) {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            obj = typeDeserializer == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        } else {
            Object referenced = getReferenced(t);
            if (referenced == null) {
                TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
                return referenceValue(typeDeserializer2 == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer2));
            }
            obj = this._valueDeserializer.deserialize(jsonParser, deserializationContext, referenced);
        }
        return updateReference(t, obj);
    }
}
