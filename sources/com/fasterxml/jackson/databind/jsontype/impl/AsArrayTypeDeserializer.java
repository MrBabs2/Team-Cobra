package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;

public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    public AsArrayTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    /* access modifiers changed from: protected */
    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        boolean isExpectedStartArrayToken = jsonParser.isExpectedStartArrayToken();
        String _locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        JsonDeserializer<Object> _findDeserializer = _findDeserializer(deserializationContext, _locateTypeId);
        JsonParserSequence jsonParserSequence = jsonParser;
        if (this._typeIdVisible) {
            jsonParserSequence = jsonParser;
            if (!_usesExternalId()) {
                JsonToken currentToken = jsonParser.getCurrentToken();
                jsonParserSequence = jsonParser;
                if (currentToken == JsonToken.START_OBJECT) {
                    TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) null, false);
                    tokenBuffer.writeStartObject();
                    tokenBuffer.writeFieldName(this._typePropertyName);
                    tokenBuffer.writeString(_locateTypeId);
                    jsonParser.clearCurrentToken();
                    JsonParserSequence createFlattened = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
                    createFlattened.nextToken();
                    jsonParserSequence = createFlattened;
                }
            }
        }
        Object deserialize = _findDeserializer.deserialize(jsonParserSequence, deserializationContext);
        if (!isExpectedStartArrayToken || jsonParserSequence.nextToken() == JsonToken.END_ARRAY) {
            return deserialize;
        }
        deserializationContext.reportWrongTokenException(baseType(), JsonToken.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            if (this._defaultImpl != null) {
                return this._idResolver.idFromBaseType();
            }
            JavaType baseType = baseType();
            JsonToken jsonToken = JsonToken.START_ARRAY;
            deserializationContext.reportWrongTokenException(baseType, jsonToken, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            throw null;
        } else if (jsonParser.nextToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            jsonParser.nextToken();
            return text;
        } else if (this._defaultImpl != null) {
            return this._idResolver.idFromBaseType();
        } else {
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.VALUE_STRING, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean _usesExternalId() {
        return false;
    }

    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C4731As getTypeInclusion() {
        return JsonTypeInfo.C4731As.WRAPPER_ARRAY;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }
}
