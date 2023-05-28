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

public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    public AsWrapperTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    /* access modifiers changed from: protected */
    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            if (jsonParser.nextToken() != JsonToken.FIELD_NAME) {
                JavaType baseType = baseType();
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                deserializationContext.reportWrongTokenException(baseType, jsonToken, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
                throw null;
            }
        } else if (currentToken != JsonToken.FIELD_NAME) {
            JavaType baseType2 = baseType();
            JsonToken jsonToken2 = JsonToken.START_OBJECT;
            deserializationContext.reportWrongTokenException(baseType2, jsonToken2, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
            throw null;
        }
        String text = jsonParser.getText();
        JsonDeserializer<Object> _findDeserializer = _findDeserializer(deserializationContext, text);
        jsonParser.nextToken();
        JsonParserSequence jsonParserSequence = jsonParser;
        if (this._typeIdVisible) {
            JsonToken currentToken2 = jsonParser.getCurrentToken();
            jsonParserSequence = jsonParser;
            if (currentToken2 == JsonToken.START_OBJECT) {
                TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) null, false);
                tokenBuffer.writeStartObject();
                tokenBuffer.writeFieldName(this._typePropertyName);
                tokenBuffer.writeString(text);
                jsonParser.clearCurrentToken();
                JsonParserSequence createFlattened = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
                createFlattened.nextToken();
                jsonParserSequence = createFlattened;
            }
        }
        Object deserialize = _findDeserializer.deserialize(jsonParserSequence, deserializationContext);
        if (jsonParserSequence.nextToken() == JsonToken.END_OBJECT) {
            return deserialize;
        }
        deserializationContext.reportWrongTokenException(baseType(), JsonToken.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        throw null;
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
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    public JsonTypeInfo.C4731As getTypeInclusion() {
        return JsonTypeInfo.C4731As.WRAPPER_OBJECT;
    }

    protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
