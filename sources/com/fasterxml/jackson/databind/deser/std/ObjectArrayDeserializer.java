package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.lang.reflect.Array;

@JacksonStdImpl
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements ContextualDeserializer {
    protected static final Object[] NO_OBJECTS = new Object[0];
    protected final Class<?> _elementClass;
    protected JsonDeserializer<Object> _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        Class<?> rawClass = javaType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer jsonDeserializer2 = this._elementDeserializer;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer2);
        JavaType contentType = this._containerType.getContentType();
        if (findConvertingContentDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(typeDeserializer, jsonDeserializer, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer), findFormatFeature);
    }

    /* access modifiers changed from: protected */
    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] binaryValue = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[binaryValue.length];
        int length = binaryValue.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(binaryValue[i]);
        }
        return bArr;
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return NO_OBJECTS;
    }

    /* access modifiers changed from: protected */
    public Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        Object[] objArr;
        if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
                if (typeDeserializer == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
            } else if (this._skipNullValues) {
                return NO_OBJECTS;
            } else {
                obj = this._nullProvider.getNullValue(deserializationContext);
            }
            if (this._untyped) {
                objArr = new Object[1];
            } else {
                objArr = (Object[]) Array.newInstance(this._elementClass, 1);
            }
            objArr[0] = obj;
            return objArr;
        } else if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && this._elementClass == Byte.class) {
            return deserializeFromBase64(jsonParser, deserializationContext);
        } else {
            return (Object[]) deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        }
    }

    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    public ObjectArrayDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        if (bool == this._unwrapSingle && nullValueProvider == this._nullProvider && jsonDeserializer == this._elementDeserializer && typeDeserializer == this._elementTypeDeserializer) {
            return this;
        }
        return new ObjectArrayDeserializer(this, jsonDeserializer, typeDeserializer, nullValueProvider, bool);
    }

    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] objArr;
        Object obj;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        int i = 0;
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    break;
                }
                if (nextToken == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (typeDeserializer == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    resetAndStart[i] = obj;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + i);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + i);
            }
        }
        if (this._untyped) {
            objArr = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i);
        } else {
            objArr = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return objArr;
    }

    protected ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super((ContainerDeserializerBase<?>) objectArrayDeserializer, nullValueProvider, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
    }

    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] objArr2;
        Object obj;
        if (!jsonParser.isExpectedStartArrayToken()) {
            Object[] handleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (handleNonArray == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr3 = new Object[(handleNonArray.length + length)];
            System.arraycopy(objArr, 0, objArr3, 0, length);
            System.arraycopy(handleNonArray, 0, objArr3, length, handleNonArray.length);
            return objArr3;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart(objArr, length2);
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    break;
                }
                if (nextToken == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (typeDeserializer == null) {
                    obj = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                if (length2 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    resetAndStart[length2] = obj;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
                }
            } catch (Exception e2) {
                e = e2;
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
            }
        }
        if (this._untyped) {
            objArr2 = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2);
        } else {
            objArr2 = leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
        return objArr2;
    }
}
