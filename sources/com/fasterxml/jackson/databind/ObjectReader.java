package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectReader extends ObjectCodec implements Serializable {
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders = null;
    private final TokenFilter _filter = null;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    static {
        SimpleType.constructUnsafe(JsonNode.class);
    }

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r5 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _bindAndClose(com.fasterxml.jackson.core.JsonParser r5) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r4.createDeserializationContext(r5)     // Catch:{ all -> 0x005c }
            com.fasterxml.jackson.core.JsonToken r1 = r4._initForReading(r0, r5)     // Catch:{ all -> 0x005c }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x005c }
            if (r1 != r2) goto L_0x001c
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0019
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.getNullValue(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x0019:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x001c:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x005c }
            if (r1 == r2) goto L_0x0045
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x005c }
            if (r1 != r2) goto L_0x0025
            goto L_0x0045
        L_0x0025:
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x005c }
            boolean r2 = r4._unwrapRoot     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0034
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r4._unwrapAndDeserialize(r5, r0, r2, r1)     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x0034:
            java.lang.Object r2 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x003d
            java.lang.Object r1 = r1.deserialize(r5, r0)     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x003d:
            java.lang.Object r2 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            r1.deserialize(r5, r0, r2)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x0045:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
        L_0x0047:
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r4._config     // Catch:{ all -> 0x005c }
            com.fasterxml.jackson.databind.DeserializationFeature r3 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x005c }
            boolean r2 = r2.isEnabled(r3)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0056
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x005c }
            r4._verifyNoTrailingTokens(r5, r0, r2)     // Catch:{ all -> 0x005c }
        L_0x0056:
            if (r5 == 0) goto L_0x005b
            r5.close()
        L_0x005b:
            return r1
        L_0x005c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0064
            r5.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndClose(com.fasterxml.jackson.core.JsonParser):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, false, z);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType != null) {
            JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
            if (jsonDeserializer2 != null) {
                return jsonDeserializer2;
            }
            JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
            if (findRootValueDeserializer != null) {
                this._rootDeserializers.put(javaType, findRootValueDeserializer);
                return findRootValueDeserializer;
            }
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
            throw null;
        }
        deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        throw null;
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null || (currentToken = jsonParser.nextToken()) != null) {
            return currentToken;
        }
        deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        try {
            JsonDeserializer<Object> findRootValueDeserializer = createDeserializationContext((JsonParser) null).findRootValueDeserializer(javaType);
            if (findRootValueDeserializer != null) {
                try {
                    this._rootDeserializers.put(javaType, findRootValueDeserializer);
                } catch (JsonProcessingException unused) {
                    return findRootValueDeserializer;
                }
            }
            return findRootValueDeserializer;
        } catch (JsonProcessingException unused2) {
            return jsonDeserializer;
        }
    }

    /* access modifiers changed from: protected */
    public void _reportUndetectableSource(Object obj) throws JsonProcessingException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        Object obj;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (nextToken == jsonToken2) {
                String currentName = jsonParser.getCurrentName();
                if (simpleName.equals(currentName)) {
                    jsonParser.nextToken();
                    Object obj2 = this._valueToUpdate;
                    if (obj2 == null) {
                        obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        jsonDeserializer.deserialize(jsonParser, deserializationContext, obj2);
                        obj = this._valueToUpdate;
                    }
                    JsonToken nextToken2 = jsonParser.nextToken();
                    JsonToken jsonToken3 = JsonToken.END_OBJECT;
                    if (nextToken2 == jsonToken3) {
                        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
                        }
                        return obj;
                    }
                    deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
                    throw null;
                }
                deserializationContext.reportInputMismatch(javaType, "Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
                throw null;
            }
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
            throw null;
        }
        deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            Class<?> rawClass = ClassUtil.rawClass(javaType);
            if (rawClass == null && (obj = this._valueToUpdate) != null) {
                rawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(rawClass, jsonParser, nextToken);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders == null) {
            return _bindAndClose(_considerFilter(this._parserFactory.createParser(reader), false));
        }
        _reportUndetectableSource(reader);
        throw null;
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }
}
