package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.Named;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DeserializationContext extends DatabindContext implements Serializable {
    protected transient ArrayBuilders _arrayBuilders;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected LinkedNode<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient ObjectBuffer _objectBuffer;
    protected transient JsonParser _parser;
    protected final Class<?> _view;

    protected DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        if (deserializerFactory != null) {
            this._factory = deserializerFactory;
            this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
            this._featureFlags = 0;
            this._config = null;
            this._injectableValues = null;
            this._view = null;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null DeserializerFactory");
    }

    /* access modifiers changed from: protected */
    public boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        if (!cls.isPrimitive() || !ClassUtil.wrapperType(cls).isInstance(obj)) {
            return false;
        }
        return true;
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public Calendar constructCalendar(Date date) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.setTime(date);
        return instance;
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return findValueDeserializer != null ? handleSecondaryContextualization(findValueDeserializer, beanProperty, javaType) : findValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        if (this._injectableValues == null) {
            reportBadDefinition(ClassUtil.classOf(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[]{obj}));
        }
        return this._injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
    }

    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        KeyDeserializer findKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        return findKeyDeserializer instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) findKeyDeserializer).createContextual(this, beanProperty) : findKeyDeserializer;
    }

    public final JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver);

    public final JsonDeserializer<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        JsonDeserializer<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (findValueDeserializer == null) {
            return null;
        }
        JsonDeserializer<?> handleSecondaryContextualization = handleSecondaryContextualization(findValueDeserializer, (BeanProperty) null, javaType);
        TypeDeserializer findTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return findTypeDeserializer != null ? new TypeWrappedDeserializer(findTypeDeserializer.forProperty((BeanProperty) null), handleSecondaryContextualization) : handleSecondaryContextualization;
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ArrayBuilders();
        }
        return this._arrayBuilders;
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    /* access modifiers changed from: protected */
    public DateFormat getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleInstantiationProblem = problemHandlers.value().handleInstantiationProblem(this, cls, obj, th);
            if (handleInstantiationProblem == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleInstantiationProblem)) {
                return handleInstantiationProblem;
            } else {
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", new Object[]{cls, ClassUtil.classNameOf(handleInstantiationProblem)}));
                throw null;
            }
        }
        ClassUtil.throwIfIOE(th);
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String _format = _format(str, objArr);
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleMissingInstantiator = problemHandlers.value().handleMissingInstantiator(this, cls, valueInstantiator, jsonParser, _format);
            if (handleMissingInstantiator == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleMissingInstantiator)) {
                return handleMissingInstantiator;
            } else {
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", new Object[]{cls, ClassUtil.classNameOf(handleMissingInstantiator)}));
                throw null;
            }
        }
        if (valueInstantiator == null || valueInstantiator.canInstantiate()) {
            reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", new Object[]{ClassUtil.nameOf(cls), _format}), new Object[0]);
            throw null;
        }
        reportBadDefinition(constructType(cls), String.format("Cannot construct instance of %s (no Creators, like default construct, exist): %s", new Object[]{ClassUtil.nameOf(cls), _format}));
        throw null;
    }

    public JavaType handleMissingTypeId(JavaType javaType, TypeIdResolver typeIdResolver, String str) throws IOException {
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType handleMissingTypeId = problemHandlers.value().handleMissingTypeId(this, javaType, typeIdResolver, str);
            if (handleMissingTypeId == null) {
                problemHandlers = problemHandlers.next();
            } else if (handleMissingTypeId.hasRawClass(Void.class)) {
                return null;
            } else {
                if (handleMissingTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return handleMissingTypeId;
                }
                throw invalidTypeIdException(javaType, (String) null, "problem handler tried to resolve into non-subtype: " + handleMissingTypeId);
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (jsonDeserializer instanceof ContextualDeserializer) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer;
    }

    public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (jsonDeserializer instanceof ContextualDeserializer) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(cls, jsonParser.getCurrentToken(), jsonParser, (String) null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) throws IOException {
        Collection<Object> collection;
        for (LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            if (problemHandlers.value().handleUnknownProperty(this, jsonParser, jsonDeserializer, obj, str)) {
                return true;
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.skipChildren();
            return true;
        }
        if (jsonDeserializer == null) {
            collection = null;
        } else {
            collection = jsonDeserializer.getKnownPropertyNames();
        }
        throw UnrecognizedPropertyException.from(this._parser, obj, str, collection);
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) throws IOException {
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType handleUnknownTypeId = problemHandlers.value().handleUnknownTypeId(this, javaType, str, typeIdResolver, str2);
            if (handleUnknownTypeId == null) {
                problemHandlers = problemHandlers.next();
            } else if (handleUnknownTypeId.hasRawClass(Void.class)) {
                return null;
            } else {
                if (handleUnknownTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return handleUnknownTypeId;
                }
                throw invalidTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + handleUnknownTypeId);
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            return null;
        }
        throw invalidTypeIdException(javaType, str, str2);
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleWeirdKey = problemHandlers.value().handleWeirdKey(this, cls, str, _format);
            if (handleWeirdKey == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (handleWeirdKey == null || cls.isInstance(handleWeirdKey)) {
                return handleWeirdKey;
            } else {
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{cls, handleWeirdKey.getClass()}));
            }
        }
        throw weirdKeyException(cls, str, _format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        Class<?> rawClass = javaType.getRawClass();
        while (problemHandlers != null) {
            Object handleWeirdNativeValue = problemHandlers.value().handleWeirdNativeValue(this, javaType, obj, jsonParser);
            if (handleWeirdNativeValue == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (handleWeirdNativeValue == null || rawClass.isInstance(handleWeirdNativeValue)) {
                return handleWeirdNativeValue;
            } else {
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", javaType, handleWeirdNativeValue.getClass()));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleWeirdNumberValue = problemHandlers.value().handleWeirdNumberValue(this, cls, number, _format);
            if (handleWeirdNumberValue == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleWeirdNumberValue)) {
                return handleWeirdNumberValue;
            } else {
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", cls, handleWeirdNumberValue.getClass()));
            }
        }
        throw weirdNumberException(number, cls, _format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleWeirdStringValue = problemHandlers.value().handleWeirdStringValue(this, cls, str, _format);
            if (handleWeirdStringValue == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleWeirdStringValue)) {
                return handleWeirdStringValue;
            } else {
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{cls, handleWeirdStringValue.getClass()}));
            }
        }
        throw weirdStringException(str, cls, _format);
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._featureFlags) != 0;
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        JavaType constructType = constructType(cls);
        InvalidDefinitionException from = InvalidDefinitionException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", new Object[]{ClassUtil.nameOf(cls), th.getMessage()}), constructType);
        from.initCause(th);
        return from;
    }

    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, javaType}), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public final ObjectBuffer leaseObjectBuffer() {
        ObjectBuffer objectBuffer = this._objectBuffer;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this._objectBuffer = null;
        return objectBuffer;
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Missing type id when trying to resolve subtype of %s", new Object[]{javaType}), str), javaType, (String) null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return getDateFormat().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, e.getMessage()}));
        }
    }

    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    public <T> T reportBadMerge(JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return null;
        }
        JavaType constructType = constructType(jsonDeserializer.handledType());
        throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", new Object[]{constructType}), constructType);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws JsonMappingException {
        String _format = _format(str, objArr);
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{ClassUtil.nameOf((Named) beanPropertyDefinition), ClassUtil.nameOf(beanDescription.getBeanClass()), _format}), beanDescription, beanPropertyDefinition);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", new Object[]{ClassUtil.nameOf(beanDescription.getBeanClass()), _format(str, objArr)}), beanDescription, (BeanPropertyDefinition) null);
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        JavaType javaType;
        String _format = _format(str, objArr);
        if (beanProperty == null) {
            javaType = null;
        } else {
            javaType = beanProperty.getType();
        }
        throw MismatchedInputException.from(getParser(), javaType, _format);
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[]{jsonToken, ClassUtil.nameOf(cls)}));
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        reportInputMismatch((BeanProperty) objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{ClassUtil.classNameOf(obj), objectIdReader.propertyName}), new Object[0]);
        throw null;
    }

    public void reportWrongTokenException(JsonDeserializer<?> jsonDeserializer, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), jsonDeserializer.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(ObjectBuffer objectBuffer) {
        if (this._objectBuffer == null || objectBuffer.initialCapacity() >= this._objectBuffer.initialCapacity()) {
            this._objectBuffer = objectBuffer;
        }
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[]{ClassUtil.nameOf(cls), _quotedString(str), str2}), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[]{ClassUtil.nameOf(cls), ClassUtil.classNameOf(obj)}), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[]{ClassUtil.nameOf(cls), String.valueOf(number), str}), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[]{ClassUtil.nameOf(cls), _quotedString(str), str2}), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.getCurrentToken(), jsonToken}), str));
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        LinkedNode<DeserializationProblemHandler> problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleUnexpectedToken = problemHandlers.value().handleUnexpectedToken(this, cls, jsonToken, jsonParser, _format);
            if (handleUnexpectedToken == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleUnexpectedToken)) {
                return handleUnexpectedToken;
            } else {
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", new Object[]{ClassUtil.nameOf(cls), ClassUtil.classNameOf(handleUnexpectedToken)}));
                throw null;
            }
        }
        if (_format == null) {
            if (jsonToken == null) {
                _format = String.format("Unexpected end-of-input when binding data into %s", new Object[]{ClassUtil.nameOf(cls)});
            } else {
                _format = String.format("Cannot deserialize instance of %s out of %s token", new Object[]{ClassUtil.nameOf(cls), jsonToken});
            }
        }
        reportInputMismatch(cls, _format, new Object[0]);
        throw null;
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public <T> T reportInputMismatch(JsonDeserializer<?> jsonDeserializer, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), jsonDeserializer.handledType(), _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.getCurrentToken(), jsonToken}), str));
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    protected DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
        deserializationConfig.getAttributes();
    }
}
