package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final TypeSerializer _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$1 */
    static /* synthetic */ class C67211 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = r0
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.C67211.<clinit>():void");
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super((JavaType) referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    private final JsonSerializer<Object> _findCachedSerializer(SerializerProvider serializerProvider, Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
        if (serializerFor != null) {
            return serializerFor;
        }
        if (this._referredType.hasGenericTypes()) {
            jsonSerializer = serializerProvider.findValueSerializer(serializerProvider.constructSpecializedType(this._referredType, cls), this._property);
        } else {
            jsonSerializer = serializerProvider.findValueSerializer(cls, this._property);
        }
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
        }
        JsonSerializer<Object> jsonSerializer2 = jsonSerializer;
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializer2);
        return jsonSerializer2;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return serializerProvider.findValueSerializer(javaType, beanProperty);
    }

    /* access modifiers changed from: protected */
    public abstract Object _getReferenced(T t);

    /* access modifiers changed from: protected */
    public abstract Object _getReferencedIfPresent(T t);

    /* access modifiers changed from: protected */
    public abstract boolean _isValuePresent(T t);

    /* access modifiers changed from: protected */
    public boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!(annotationIntrospector == null || beanProperty == null || beanProperty.getMember() == null)) {
            JsonSerialize.Typing findSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (findSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        ReferenceTypeSerializer referenceTypeSerializer;
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        JsonSerializer findAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (findAnnotatedContentSerializer == null) {
            findAnnotatedContentSerializer = this._valueSerializer;
            if (findAnnotatedContentSerializer != null) {
                findAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(findAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                findAnnotatedContentSerializer = _findSerializer(serializerProvider, this._referredType, beanProperty);
            }
        }
        if (this._property == beanProperty && this._valueTypeSerializer == typeSerializer && this._valueSerializer == findAnnotatedContentSerializer) {
            referenceTypeSerializer = this;
        } else {
            referenceTypeSerializer = withResolved(beanProperty, typeSerializer, findAnnotatedContentSerializer, this._unwrapper);
        }
        if (beanProperty == null || (findPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), handledType())) == null || (contentInclusion = findPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return referenceTypeSerializer;
        }
        int i = C67211.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        Object obj = null;
        boolean z = true;
        if (i == 1) {
            obj = BeanUtil.getDefaultValue(this._referredType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MARKER_FOR_EMPTY;
            } else if (i == 4) {
                obj = serializerProvider.includeFilterInstance((BeanPropertyDefinition) null, findPropertyInclusion.getContentFilter());
                if (obj != null) {
                    z = serializerProvider.includeFilterSuppressNulls(obj);
                }
            } else if (i != 5) {
                z = false;
            }
        } else if (this._referredType.isReferenceType()) {
            obj = MARKER_FOR_EMPTY;
        }
        return (this._suppressableValue == obj && this._suppressNulls == z) ? referenceTypeSerializer : referenceTypeSerializer.withContentInclusion(obj, z);
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        if (!_isValuePresent(t)) {
            return true;
        }
        Object _getReferenced = _getReferenced(t);
        if (_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferenced.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return jsonSerializer.isEmpty(serializerProvider, _getReferenced);
        }
        return obj.equals(_getReferenced);
    }

    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    public void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t);
        if (_getReferencedIfPresent != null) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
            }
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            if (typeSerializer != null) {
                jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
            } else {
                jsonSerializer.serialize(_getReferencedIfPresent, jsonGenerator, serializerProvider);
            }
        } else if (this._unwrapper == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        }
    }

    public void serializeWithType(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t);
        if (_getReferencedIfPresent != null) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
            }
            jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        } else if (this._unwrapper == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        }
    }

    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
        }
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        if (this._valueSerializer == jsonSerializer && this._unwrapper == nameTransformer) {
            return this;
        }
        return withResolved(this._property, this._valueTypeSerializer, jsonSerializer, nameTransformer);
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z);

    /* access modifiers changed from: protected */
    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer);

    protected ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z) {
        super((StdSerializer<?>) referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = referenceTypeSerializer._dynamicSerializers;
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}
