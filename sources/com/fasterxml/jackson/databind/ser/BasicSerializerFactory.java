package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1 */
    static /* synthetic */ class C67151 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = r0
                r1 = 1
                com.fasterxml.jackson.annotation.JsonInclude$Include r2 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r3 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.fasterxml.jackson.annotation.JsonFormat$Shape[] r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = r3
                com.fasterxml.jackson.annotation.JsonFormat$Shape r4 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.C67151.<clinit>():void");
        }
    }

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> hashMap = new HashMap<>();
        HashMap<String, JsonSerializer<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.addAll(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.instance);
        hashMap2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry next : StdJdkSerializers.all()) {
            Object value = next.getValue();
            if (value instanceof JsonSerializer) {
                hashMap2.put(((Class) next.getKey()).getName(), (JsonSerializer) value);
            } else {
                hashMap.put(((Class) next.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        _concrete = hashMap2;
        _concreteLazy = hashMap;
    }

    protected BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    /* access modifiers changed from: protected */
    public MapSerializer _checkMapContentInclusion(SerializerProvider serializerProvider, BeanDescription beanDescription, MapSerializer mapSerializer) throws JsonMappingException {
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        boolean z = true;
        Object obj = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion((Object) null, true) : mapSerializer;
        }
        int i = C67151.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        if (i == 1) {
            obj = BeanUtil.getDefaultValue(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (obj = serializerProvider.includeFilterInstance((BeanPropertyDefinition) null, _findInclusionWithContent.getContentFilter())) != null) {
                z = serializerProvider.includeFilterSuppressNulls(obj);
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapSerializer.withContentInclusion(obj, z);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (findContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, findContentSerializer);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonInclude.Value _findInclusionWithContent(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, beanDescription.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), (JsonInclude.Value) null);
        if (defaultPropertyInclusion2 == null) {
            return defaultPropertyInclusion;
        }
        int i = C67151.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[defaultPropertyInclusion2.getValueInclusion().ordinal()];
        if (i == 4) {
            return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
        }
        if (i != 6) {
            return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
        }
        return defaultPropertyInclusion;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (findKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, findKeySerializer);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x000d A[LOOP:0: B:1:0x000d->B:4:0x0022, LOOP_START, PHI: r0 
      PHI: (r0v2 com.fasterxml.jackson.databind.JsonSerializer<?>) = (r0v1 com.fasterxml.jackson.databind.JsonSerializer<?>), (r0v15 com.fasterxml.jackson.databind.JsonSerializer<?>) binds: [B:0:0x0000, B:4:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> buildArraySerializer(com.fasterxml.jackson.databind.SerializerProvider r8, com.fasterxml.jackson.databind.type.ArrayType r9, com.fasterxml.jackson.databind.BeanDescription r10, boolean r11, com.fasterxml.jackson.databind.jsontype.TypeSerializer r12, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r13) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.SerializationConfig r8 = r8.getConfig()
            java.lang.Iterable r0 = r7.customSerializers()
            java.util.Iterator r6 = r0.iterator()
            r0 = 0
        L_0x000d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r0 = r6.next()
            com.fasterxml.jackson.databind.ser.Serializers r0 = (com.fasterxml.jackson.databind.ser.Serializers) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.findArraySerializer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x000d
        L_0x0024:
            if (r0 != 0) goto L_0x0048
            java.lang.Class r1 = r9.getRawClass()
            if (r13 == 0) goto L_0x0032
            boolean r2 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) r13)
            if (r2 == 0) goto L_0x003d
        L_0x0032:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r0 != r1) goto L_0x0039
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r0 = com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.instance
            goto L_0x003d
        L_0x0039:
            com.fasterxml.jackson.databind.JsonSerializer r0 = com.fasterxml.jackson.databind.ser.std.StdArraySerializers.findStandardImpl(r1)
        L_0x003d:
            if (r0 != 0) goto L_0x0048
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r0 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            com.fasterxml.jackson.databind.JavaType r1 = r9.getContentType()
            r0.<init>(r1, r11, r12, r13)
        L_0x0048:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r11 = r7._factoryConfig
            boolean r11 = r11.hasSerializerModifiers()
            if (r11 == 0) goto L_0x006b
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r11 = r7._factoryConfig
            java.lang.Iterable r11 = r11.serializerModifiers()
            java.util.Iterator r11 = r11.iterator()
        L_0x005a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x006b
            java.lang.Object r12 = r11.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r12 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r12
            com.fasterxml.jackson.databind.JsonSerializer r0 = r12.modifyArraySerializer(r8, r9, r10, r0)
            goto L_0x005a
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildArraySerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.type.ArrayType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildAtomicReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, referencedType, AtomicReference.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        boolean z2 = true;
        Object obj = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            z2 = false;
        } else {
            int i = C67151.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            if (i == 1) {
                obj = BeanUtil.getDefaultValue(referencedType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = ArrayBuilders.getArrayComparator(obj);
                }
            } else if (i != 2) {
                if (i == 3) {
                    obj = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i == 4 && (obj = serializerProvider.includeFilterInstance((BeanPropertyDefinition) null, _findInclusionWithContent.getContentFilter())) != null) {
                    z2 = serializerProvider.includeFilterSuppressNulls(obj);
                }
            } else if (referencedType.isReferenceType()) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z, typeSerializer, jsonSerializer).withContentInclusion(obj, z2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0019 A[LOOP:0: B:1:0x0019->B:4:0x0032, LOOP_START, PHI: r1 
      PHI: (r1v2 com.fasterxml.jackson.databind.JsonSerializer<?>) = (r1v1 com.fasterxml.jackson.databind.JsonSerializer<?>), (r1v20 com.fasterxml.jackson.databind.JsonSerializer<?>) binds: [B:0:0x0000, B:4:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> buildCollectionSerializer(com.fasterxml.jackson.databind.SerializerProvider r16, com.fasterxml.jackson.databind.type.CollectionType r17, com.fasterxml.jackson.databind.BeanDescription r18, boolean r19, com.fasterxml.jackson.databind.jsontype.TypeSerializer r20, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r21) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r15 = this;
            r0 = r15
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            com.fasterxml.jackson.databind.SerializationConfig r12 = r16.getConfig()
            java.lang.Iterable r1 = r15.customSerializers()
            java.util.Iterator r13 = r1.iterator()
            r14 = 0
            r1 = r14
        L_0x0019:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r13.next()
            com.fasterxml.jackson.databind.ser.Serializers r1 = (com.fasterxml.jackson.databind.ser.Serializers) r1
            r2 = r12
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r21
            com.fasterxml.jackson.databind.JsonSerializer r1 = r1.findCollectionSerializer(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0019
        L_0x0034:
            if (r1 != 0) goto L_0x009e
            com.fasterxml.jackson.databind.JsonSerializer r1 = r15.findSerializerByAnnotations(r16, r17, r18)
            if (r1 != 0) goto L_0x009e
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r7.findExpectedFormat(r14)
            if (r2 == 0) goto L_0x004b
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r2 != r3) goto L_0x004b
            return r14
        L_0x004b:
            java.lang.Class r2 = r17.getRawClass()
            java.lang.Class<java.util.EnumSet> r3 = java.util.EnumSet.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0068
            com.fasterxml.jackson.databind.JavaType r1 = r17.getContentType()
            boolean r2 = r1.isEnumType()
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r14 = r1
        L_0x0063:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r15.buildEnumSetSerializer(r14)
            goto L_0x009e
        L_0x0068:
            com.fasterxml.jackson.databind.JavaType r3 = r17.getContentType()
            java.lang.Class r3 = r3.getRawClass()
            boolean r2 = r15.isIndexedList(r2)
            if (r2 == 0) goto L_0x008a
            if (r3 != r11) goto L_0x0081
            boolean r2 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) r21)
            if (r2 == 0) goto L_0x0094
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r1 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance
            goto L_0x0094
        L_0x0081:
            com.fasterxml.jackson.databind.JavaType r1 = r17.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r1 = r15.buildIndexedListSerializer(r1, r8, r9, r10)
            goto L_0x0094
        L_0x008a:
            if (r3 != r11) goto L_0x0094
            boolean r2 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl((java.lang.Object) r21)
            if (r2 == 0) goto L_0x0094
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r1 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.instance
        L_0x0094:
            if (r1 != 0) goto L_0x009e
            com.fasterxml.jackson.databind.JavaType r1 = r17.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r1 = r15.buildCollectionSerializer(r1, r8, r9, r10)
        L_0x009e:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            boolean r2 = r2.hasSerializerModifiers()
            if (r2 == 0) goto L_0x00c3
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            java.lang.Iterable r2 = r2.serializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r3 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r3
            r4 = r17
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.modifyCollectionSerializer(r12, r4, r7, r1)
            goto L_0x00b0
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[LOOP:0: B:21:0x006e->B:24:0x0088, LOOP_START, PHI: r3 
      PHI: (r3v13 com.fasterxml.jackson.databind.JsonSerializer<?>) = (r3v1 com.fasterxml.jackson.databind.JsonSerializer<?>), (r3v21 com.fasterxml.jackson.databind.JsonSerializer<?>) binds: [B:20:0x0066, B:24:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider r19, com.fasterxml.jackson.databind.JavaType r20, com.fasterxml.jackson.databind.BeanDescription r21, boolean r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r18 = this;
            r8 = r18
            r1 = r19
            r7 = r21
            com.fasterxml.jackson.databind.SerializationConfig r0 = r19.getConfig()
            if (r22 != 0) goto L_0x0024
            boolean r2 = r20.useStaticType()
            if (r2 == 0) goto L_0x0024
            boolean r2 = r20.isContainerType()
            if (r2 == 0) goto L_0x0022
            com.fasterxml.jackson.databind.JavaType r2 = r20.getContentType()
            boolean r2 = r2.isJavaLangObject()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            r2 = 1
            goto L_0x0026
        L_0x0024:
            r2 = r22
        L_0x0026:
            com.fasterxml.jackson.databind.JavaType r3 = r20.getContentType()
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r16 = r8.createTypeSerializer(r0, r3)
            if (r16 == 0) goto L_0x0033
            r2 = 0
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = r2
        L_0x0034:
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r2 = r21.getClassInfo()
            com.fasterxml.jackson.databind.JsonSerializer r17 = r8._findContentSerializer(r1, r2)
            boolean r2 = r20.isMapLikeType()
            r3 = 0
            if (r2 == 0) goto L_0x00b6
            r2 = r20
            com.fasterxml.jackson.databind.type.MapLikeType r2 = (com.fasterxml.jackson.databind.type.MapLikeType) r2
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r5 = r21.getClassInfo()
            com.fasterxml.jackson.databind.JsonSerializer r5 = r8._findKeySerializer(r1, r5)
            boolean r6 = r2.isTrueMapType()
            if (r6 == 0) goto L_0x0066
            com.fasterxml.jackson.databind.type.MapType r2 = (com.fasterxml.jackson.databind.type.MapType) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r6 = r16
            r7 = r17
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.buildMapSerializer(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0066:
            java.lang.Iterable r4 = r18.customSerializers()
            java.util.Iterator r4 = r4.iterator()
        L_0x006e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008a
            java.lang.Object r3 = r4.next()
            r9 = r3
            com.fasterxml.jackson.databind.ser.Serializers r9 = (com.fasterxml.jackson.databind.ser.Serializers) r9
            r10 = r0
            r11 = r2
            r12 = r21
            r13 = r5
            r14 = r16
            r15 = r17
            com.fasterxml.jackson.databind.JsonSerializer r3 = r9.findMapLikeSerializer(r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x006e
        L_0x008a:
            if (r3 != 0) goto L_0x0090
            com.fasterxml.jackson.databind.JsonSerializer r3 = r18.findSerializerByAnnotations(r19, r20, r21)
        L_0x0090:
            if (r3 == 0) goto L_0x00b5
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x00b5
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r1.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r4 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r4
            com.fasterxml.jackson.databind.JsonSerializer r3 = r4.modifyMapLikeSerializer(r0, r2, r7, r3)
            goto L_0x00a4
        L_0x00b5:
            return r3
        L_0x00b6:
            boolean r2 = r20.isCollectionLikeType()
            if (r2 == 0) goto L_0x012b
            r9 = r20
            com.fasterxml.jackson.databind.type.CollectionLikeType r9 = (com.fasterxml.jackson.databind.type.CollectionLikeType) r9
            boolean r2 = r9.isTrueCollectionType()
            if (r2 == 0) goto L_0x00d8
            r2 = r9
            com.fasterxml.jackson.databind.type.CollectionType r2 = (com.fasterxml.jackson.databind.type.CollectionType) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r16
            r6 = r17
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.buildCollectionSerializer(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00d8:
            java.lang.Iterable r2 = r18.customSerializers()
            java.util.Iterator r10 = r2.iterator()
        L_0x00e0:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r2 = r10.next()
            com.fasterxml.jackson.databind.ser.Serializers r2 = (com.fasterxml.jackson.databind.ser.Serializers) r2
            r3 = r0
            r4 = r9
            r5 = r21
            r6 = r16
            r11 = r7
            r7 = r17
            com.fasterxml.jackson.databind.JsonSerializer r3 = r2.findCollectionLikeSerializer(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r7 = r11
            goto L_0x00e0
        L_0x00fe:
            r11 = r7
        L_0x00ff:
            if (r3 != 0) goto L_0x0105
            com.fasterxml.jackson.databind.JsonSerializer r3 = r18.findSerializerByAnnotations(r19, r20, r21)
        L_0x0105:
            if (r3 == 0) goto L_0x012a
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x012a
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r8._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0119:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x012a
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r2 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r2
            com.fasterxml.jackson.databind.JsonSerializer r3 = r2.modifyCollectionLikeSerializer(r0, r9, r11, r3)
            goto L_0x0119
        L_0x012a:
            return r3
        L_0x012b:
            r11 = r7
            boolean r0 = r20.isArrayType()
            if (r0 == 0) goto L_0x0145
            r2 = r20
            com.fasterxml.jackson.databind.type.ArrayType r2 = (com.fasterxml.jackson.databind.type.ArrayType) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r16
            r6 = r17
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.buildArraySerializer(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0145:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildContainerSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonFormat.Value findExpectedFormat = beanDescription.findExpectedFormat((JsonFormat.Value) null);
        if (findExpectedFormat == null || findExpectedFormat.getShape() != JsonFormat.Shape.OBJECT) {
            JsonSerializer<?> construct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, findExpectedFormat);
            if (this._factoryConfig.hasSerializerModifiers()) {
                for (BeanSerializerModifier modifyEnumSerializer : this._factoryConfig.serializerModifiers()) {
                    construct = modifyEnumSerializer.modifyEnumSerializer(serializationConfig, javaType, beanDescription, construct);
                }
            }
            return construct;
        }
        ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
        return null;
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z, typeSerializer, jsonSerializer);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildMapEntrySerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object obj = null;
        if (JsonFormat.Value.merge(beanDescription.findExpectedFormat((JsonFormat.Value) null), serializerProvider.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(serializerProvider.getConfig(), javaType3), (BeanProperty) null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i = C67151.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            obj = BeanUtil.getDefaultValue(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (obj = serializerProvider.includeFilterInstance((BeanPropertyDefinition) null, _findInclusionWithContent.getContentFilter())) != null) {
                z2 = serializerProvider.includeFilterSuppressNulls(obj);
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(obj, z2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0021 A[LOOP:0: B:6:0x0021->B:9:0x003c, LOOP_START, PHI: r1 
      PHI: (r1v3 com.fasterxml.jackson.databind.JsonSerializer<?>) = (r1v2 com.fasterxml.jackson.databind.JsonSerializer<?>), (r1v16 com.fasterxml.jackson.databind.JsonSerializer<?>) binds: [B:5:0x0014, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> buildMapSerializer(com.fasterxml.jackson.databind.SerializerProvider r19, com.fasterxml.jackson.databind.type.MapType r20, com.fasterxml.jackson.databind.BeanDescription r21, boolean r22, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r23, com.fasterxml.jackson.databind.jsontype.TypeSerializer r24, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r25) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r18 = this;
            r0 = r18
            r8 = r21
            r9 = 0
            com.fasterxml.jackson.annotation.JsonFormat$Value r1 = r8.findExpectedFormat(r9)
            if (r1 == 0) goto L_0x0014
            com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = r1.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r1 != r2) goto L_0x0014
            return r9
        L_0x0014:
            com.fasterxml.jackson.databind.SerializationConfig r10 = r19.getConfig()
            java.lang.Iterable r1 = r18.customSerializers()
            java.util.Iterator r11 = r1.iterator()
            r1 = r9
        L_0x0021:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r11.next()
            com.fasterxml.jackson.databind.ser.Serializers r1 = (com.fasterxml.jackson.databind.ser.Serializers) r1
            r2 = r10
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            com.fasterxml.jackson.databind.JsonSerializer r1 = r1.findMapSerializer(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0021
        L_0x003e:
            if (r1 != 0) goto L_0x0070
            com.fasterxml.jackson.databind.JsonSerializer r1 = r18.findSerializerByAnnotations(r19, r20, r21)
            if (r1 != 0) goto L_0x0070
            java.lang.Object r17 = r0.findFilterId(r10, r8)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r2 = r21.getClassInfo()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r1 = r10.getDefaultPropertyIgnorals(r1, r2)
            if (r1 != 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            java.util.Set r9 = r1.findIgnoredForSerialization()
        L_0x005b:
            r11 = r9
            r12 = r20
            r13 = r22
            r14 = r24
            r15 = r23
            r16 = r25
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(r11, r12, r13, r14, r15, r16, r17)
            r2 = r19
            com.fasterxml.jackson.databind.ser.std.MapSerializer r1 = r0._checkMapContentInclusion(r2, r8, r1)
        L_0x0070:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            boolean r2 = r2.hasSerializerModifiers()
            if (r2 == 0) goto L_0x0095
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r2 = r0._factoryConfig
            java.lang.Iterable r2 = r2.serializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x0082:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r3 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r3
            r4 = r20
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.modifyMapSerializer(r10, r4, r8, r1)
            goto L_0x0082
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildMapSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b A[LOOP:0: B:3:0x001b->B:6:0x002b, LOOP_START, PHI: r2 
      PHI: (r2v10 com.fasterxml.jackson.databind.JsonSerializer<?>) = (r2v0 com.fasterxml.jackson.databind.JsonSerializer<?>), (r2v13 com.fasterxml.jackson.databind.JsonSerializer<?>) binds: [B:2:0x0011, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig r5, com.fasterxml.jackson.databind.JavaType r6, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r7) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getRawClass()
            com.fasterxml.jackson.databind.BeanDescription r0 = r5.introspectClassAnnotations((java.lang.Class<?>) r0)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            boolean r1 = r1.hasKeySerializers()
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            java.lang.Iterable r1 = r1.keySerializers()
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.Serializers r2 = (com.fasterxml.jackson.databind.ser.Serializers) r2
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.findSerializer(r5, r6, r0)
            if (r2 == 0) goto L_0x001b
        L_0x002d:
            if (r2 != 0) goto L_0x0071
            if (r7 != 0) goto L_0x0072
            java.lang.Class r7 = r6.getRawClass()
            r1 = 0
            com.fasterxml.jackson.databind.JsonSerializer r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getStdKeySerializer(r5, r7, r1)
            if (r7 != 0) goto L_0x0072
            com.fasterxml.jackson.databind.BeanDescription r0 = r5.introspect(r6)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = r0.findJsonValueAccessor()
            if (r7 == 0) goto L_0x0068
            java.lang.Class r1 = r7.getRawType()
            r2 = 1
            com.fasterxml.jackson.databind.JsonSerializer r1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getStdKeySerializer(r5, r1, r2)
            boolean r2 = r5.canOverrideAccessModifiers()
            if (r2 == 0) goto L_0x0062
            java.lang.reflect.Member r2 = r7.getMember()
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r5.isEnabled(r3)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(r2, r3)
        L_0x0062:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r2.<init>(r7, r1)
            goto L_0x0071
        L_0x0068:
            java.lang.Class r7 = r6.getRawClass()
            com.fasterxml.jackson.databind.JsonSerializer r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getFallbackKeySerializer(r5, r7)
            goto L_0x0072
        L_0x0071:
            r7 = r2
        L_0x0072:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x0095
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0084:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r2 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r2
            com.fasterxml.jackson.databind.JsonSerializer r7 = r2.modifyKeySerializer(r5, r6, r0, r7)
            goto L_0x0084
        L_0x0095:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collection;
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> findTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collection = null;
        } else {
            collection = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, classInfo);
        }
        if (findTypeResolver == null) {
            return null;
        }
        return findTypeResolver.buildTypeSerializer(serializationConfig, javaType, collection);
    }

    /* access modifiers changed from: protected */
    public abstract Iterable<Serializers> customSerializers();

    /* access modifiers changed from: protected */
    public Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (findSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, findSerializationConverter);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        Converter<Object, Object> findConverter = findConverter(serializerProvider, annotated);
        if (findConverter == null) {
            return jsonSerializer;
        }
        return new StdDelegatingSerializer(findConverter, findConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    /* access modifiers changed from: protected */
    public Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        TypeSerializer typeSerializer = (TypeSerializer) contentType.getTypeHandler();
        SerializationConfig config = serializerProvider.getConfig();
        if (typeSerializer == null) {
            typeSerializer = createTypeSerializer(config, contentType);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        JsonSerializer jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        for (Serializers findReferenceSerializer : customSerializers()) {
            JsonSerializer<?> findReferenceSerializer2 = findReferenceSerializer.findReferenceSerializer(config, referenceType, beanDescription, typeSerializer2, jsonSerializer);
            if (findReferenceSerializer2 != null) {
                return findReferenceSerializer2;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(serializerProvider, referenceType, beanDescription, z, typeSerializer2, jsonSerializer);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]);
        } else if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z, (findTypeParameters2 == null || findTypeParameters2.length != 1) ? TypeFactory.unknownType() : findTypeParameters2[0]);
        } else if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember findJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (findJsonValueAccessor == null) {
            return null;
        }
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findJsonValueAccessor.getMember(), serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new JsonValueSerializer(findJsonValueAccessor, findSerializerFromAnnotation(serializerProvider, findJsonValueAccessor));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = _concreteLazy.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer<?> findSerializerByLookup(com.fasterxml.jackson.databind.JavaType r1, com.fasterxml.jackson.databind.SerializationConfig r2, com.fasterxml.jackson.databind.BeanDescription r3, boolean r4) {
        /*
            r0 = this;
            java.lang.Class r1 = r1.getRawClass()
            java.lang.String r1 = r1.getName()
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.JsonSerializer<?>> r2 = _concrete
            java.lang.Object r2 = r2.get(r1)
            com.fasterxml.jackson.databind.JsonSerializer r2 = (com.fasterxml.jackson.databind.JsonSerializer) r2
            if (r2 != 0) goto L_0x0024
            java.util.HashMap<java.lang.String, java.lang.Class<? extends com.fasterxml.jackson.databind.JsonSerializer<?>>> r3 = _concreteLazy
            java.lang.Object r1 = r3.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x0024
            r2 = 0
            java.lang.Object r1 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(r1, r2)
            com.fasterxml.jackson.databind.JsonSerializer r1 = (com.fasterxml.jackson.databind.JsonSerializer) r1
            return r1
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.findSerializerByLookup(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.BeanDescription, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonSerializer<?> findOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z);
        if (findOptionalStdSerializer != null) {
            return findOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType findSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(serializerProvider, javaType, beanDescription, z, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1));
        } else if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        } else {
            if (InetAddress.class.isAssignableFrom(rawClass)) {
                return new InetAddressSerializer();
            }
            if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
                return new InetSocketAddressSerializer();
            }
            if (TimeZone.class.isAssignableFrom(rawClass)) {
                return new TimeZoneSerializer();
            }
            if (Charset.class.isAssignableFrom(rawClass)) {
                return ToStringSerializer.instance;
            }
            if (Number.class.isAssignableFrom(rawClass)) {
                JsonFormat.Value findExpectedFormat = beanDescription.findExpectedFormat((JsonFormat.Value) null);
                if (findExpectedFormat != null) {
                    int i = C67151.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[findExpectedFormat.getShape().ordinal()];
                    if (i == 1) {
                        return ToStringSerializer.instance;
                    }
                    if (i == 2 || i == 3) {
                        return null;
                    }
                }
                return NumberSerializer.instance;
            } else if (Enum.class.isAssignableFrom(rawClass)) {
                return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
            } else {
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (findSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, findSerializer));
    }

    /* access modifiers changed from: protected */
    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    /* access modifiers changed from: protected */
    public boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        if (typeSerializer != null) {
            return false;
        }
        JsonSerialize.Typing findSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        if (findSerializationTyping == null || findSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
            return true;
        }
        return false;
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z, typeSerializer, jsonSerializer);
    }
}
