package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final JsonInclude.Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1 */
    static /* synthetic */ class C67161 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.C67161.<clinit>():void");
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        JsonInclude.Value merge = JsonInclude.Value.merge(beanDescription.findPropertyInclusion(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), JsonInclude.Value.empty()));
        this._defaultInclusion = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this._annotationIntrospector = this._config.getAnnotationIntrospector();
    }

    /* access modifiers changed from: protected */
    public Object _throwWrapped(Exception exc, String str, Object obj) {
        while (true) {
            Throwable cause = r3.getCause();
            Throwable th = exc;
            if (cause != null) {
                th = th.getCause();
            } else {
                ClassUtil.throwIfError(th);
                ClassUtil.throwIfRTE(th);
                throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter buildWriter(com.fasterxml.jackson.databind.SerializerProvider r16, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r17, com.fasterxml.jackson.databind.JavaType r18, com.fasterxml.jackson.databind.JsonSerializer<?> r19, com.fasterxml.jackson.databind.jsontype.TypeSerializer r20, com.fasterxml.jackson.databind.jsontype.TypeSerializer r21, com.fasterxml.jackson.databind.introspect.AnnotatedMember r22, boolean r23) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r4 = r17
            r7 = r18
            r0 = r21
            r14 = r22
            r3 = 0
            r5 = 0
            r6 = r23
            com.fasterxml.jackson.databind.JavaType r6 = r15.findSerializationType(r14, r6, r7)     // Catch:{ JsonMappingException -> 0x0151 }
            if (r0 == 0) goto L_0x0045
            if (r6 != 0) goto L_0x0018
            r6 = r7
        L_0x0018:
            com.fasterxml.jackson.databind.JavaType r8 = r6.getContentType()
            if (r8 == 0) goto L_0x0027
            com.fasterxml.jackson.databind.JavaType r0 = r6.withContentTypeHandler(r0)
            r0.getContentType()
            r10 = r0
            goto L_0x0046
        L_0x0027:
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "serialization type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " has no content"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.reportBadPropertyDefinition(r0, r4, r6, r3)
            throw r5
        L_0x0045:
            r10 = r6
        L_0x0046:
            if (r10 != 0) goto L_0x004a
            r0 = r7
            goto L_0x004b
        L_0x004a:
            r0 = r10
        L_0x004b:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r17.getAccessor()
            if (r6 == 0) goto L_0x0147
            java.lang.Class r6 = r6.getRawType()
            com.fasterxml.jackson.databind.SerializationConfig r8 = r1._config
            java.lang.Class r9 = r0.getRawClass()
            com.fasterxml.jackson.annotation.JsonInclude$Value r11 = r1._defaultInclusion
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r8.getDefaultInclusion(r9, r6, r11)
            com.fasterxml.jackson.annotation.JsonInclude$Value r8 = r17.findInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r6.withOverrides(r8)
            com.fasterxml.jackson.annotation.JsonInclude$Include r8 = r6.getValueInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Include r9 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r8 != r9) goto L_0x0073
            com.fasterxml.jackson.annotation.JsonInclude$Include r8 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
        L_0x0073:
            int[] r9 = com.fasterxml.jackson.databind.ser.PropertyBuilder.C67161.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 1
            if (r8 == r9) goto L_0x00c5
            r11 = 2
            if (r8 == r11) goto L_0x00b9
            r11 = 3
            if (r8 == r11) goto L_0x00b5
            r11 = 4
            if (r8 == r11) goto L_0x00a3
            r6 = 5
            if (r8 == r6) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r3 = 1
        L_0x008c:
            boolean r0 = r0.isContainerType()
            if (r0 == 0) goto L_0x009f
            com.fasterxml.jackson.databind.SerializationConfig r0 = r1._config
            com.fasterxml.jackson.databind.SerializationFeature r6 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            boolean r0 = r0.isEnabled(r6)
            if (r0 != 0) goto L_0x009f
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00b2
        L_0x009f:
            r11 = r3
            r12 = r5
            goto L_0x0108
        L_0x00a3:
            java.lang.Class r0 = r6.getValueFilter()
            java.lang.Object r0 = r2.includeFilterInstance(r4, r0)
            if (r0 != 0) goto L_0x00ae
        L_0x00ad:
            goto L_0x00b7
        L_0x00ae:
            boolean r3 = r2.includeFilterSuppressNulls(r0)
        L_0x00b2:
            r12 = r0
            r11 = r3
            goto L_0x0108
        L_0x00b5:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
        L_0x00b7:
            r12 = r0
            goto L_0x00c3
        L_0x00b9:
            boolean r0 = r0.isReferenceType()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00b7
        L_0x00c2:
            r12 = r5
        L_0x00c3:
            r11 = 1
            goto L_0x0108
        L_0x00c5:
            boolean r6 = r1._useRealPropertyDefaults
            if (r6 == 0) goto L_0x00f1
            java.lang.Object r6 = r15.getDefaultBean()
            if (r6 == 0) goto L_0x00f1
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r2.isEnabled((com.fasterxml.jackson.databind.MapperFeature) r0)
            if (r0 == 0) goto L_0x00e2
            com.fasterxml.jackson.databind.SerializationConfig r0 = r1._config
            com.fasterxml.jackson.databind.MapperFeature r8 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r0.isEnabled(r8)
            r14.fixAccess(r0)
        L_0x00e2:
            java.lang.Object r0 = r14.getValue(r6)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f6
        L_0x00e7:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = r17.getName()
            r15._throwWrapped(r2, r0, r6)
            throw r5
        L_0x00f1:
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.BeanUtil.getDefaultValue(r0)
            r3 = 1
        L_0x00f6:
            if (r0 != 0) goto L_0x00f9
            goto L_0x00ad
        L_0x00f9:
            java.lang.Class r5 = r0.getClass()
            boolean r5 = r5.isArray()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.ArrayBuilders.getArrayComparator(r0)
            goto L_0x00b2
        L_0x0108:
            java.lang.Class[] r0 = r17.findViews()
            if (r0 != 0) goto L_0x0114
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.Class[] r0 = r0.findDefaultViews()
        L_0x0114:
            r13 = r0
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter
            com.fasterxml.jackson.databind.BeanDescription r3 = r1._beanDesc
            com.fasterxml.jackson.databind.util.Annotations r6 = r3.getClassAnnotations()
            r3 = r0
            r4 = r17
            r5 = r22
            r7 = r18
            r8 = r19
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r1._annotationIntrospector
            java.lang.Object r3 = r3.findNullSerializer(r14)
            if (r3 == 0) goto L_0x013a
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.serializerInstance(r14, r3)
            r0.assignNullSerializer(r2)
        L_0x013a:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r1._annotationIntrospector
            com.fasterxml.jackson.databind.util.NameTransformer r2 = r2.findUnwrappingNameTransformer(r14)
            if (r2 == 0) goto L_0x0146
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = r0.unwrappingWriter(r2)
        L_0x0146:
            return r0
        L_0x0147:
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "could not determine property type"
            r2.reportBadPropertyDefinition(r0, r4, r6, r3)
            throw r5
        L_0x0151:
            r0 = move-exception
            r6 = r0
            if (r4 != 0) goto L_0x015d
            java.lang.String r0 = r6.getMessage()
            r2.reportBadDefinition(r7, r0)
            throw r5
        L_0x015d:
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.reportBadPropertyDefinition(r0, r4, r6, r3)
            goto L_0x016a
        L_0x0169:
            throw r5
        L_0x016a:
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* access modifiers changed from: protected */
    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        boolean z2 = true;
        if (refineSerializationType != javaType) {
            Class<?> rawClass = refineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + annotated.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            javaType = refineSerializationType;
            z = true;
        }
        JsonSerialize.Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (!(findSerializationTyping == null || findSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING)) {
            if (findSerializationTyping != JsonSerialize.Typing.STATIC) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }
}
