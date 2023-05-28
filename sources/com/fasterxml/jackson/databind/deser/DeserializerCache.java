package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class DeserializerCache implements Serializable {
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _cachedDeserializers = new ConcurrentHashMap<>(64, 0.75f, 4);
    protected final HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers = new HashMap<>(8);

    private boolean _hasCustomHandlers(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && (contentType.getValueHandler() != null || contentType.getTypeHandler() != null)) {
            return true;
        }
        if (!javaType.isMapLikeType() || javaType.getKeyType().getValueHandler() == null) {
            return false;
        }
        return true;
    }

    private Class<?> _verifyAsClass(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || ClassUtil.isBogusClass(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.fasterxml.jackson.databind.JavaType modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.introspect.Annotated r7, com.fasterxml.jackson.databind.JavaType r8) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r6.getAnnotationIntrospector()
            if (r0 != 0) goto L_0x0007
            return r8
        L_0x0007:
            boolean r1 = r8.isMapLikeType()
            if (r1 == 0) goto L_0x002e
            com.fasterxml.jackson.databind.JavaType r1 = r8.getKeyType()
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r1.getValueHandler()
            if (r1 != 0) goto L_0x002e
            java.lang.Object r1 = r0.findKeyDeserializer(r7)
            if (r1 == 0) goto L_0x002e
            com.fasterxml.jackson.databind.KeyDeserializer r1 = r6.keyDeserializerInstance(r7, r1)
            if (r1 == 0) goto L_0x002e
            com.fasterxml.jackson.databind.type.MapLikeType r8 = (com.fasterxml.jackson.databind.type.MapLikeType) r8
            com.fasterxml.jackson.databind.type.MapLikeType r8 = r8.withKeyValueHandler(r1)
            r8.getKeyType()
        L_0x002e:
            com.fasterxml.jackson.databind.JavaType r1 = r8.getContentType()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r1.getValueHandler()
            if (r1 != 0) goto L_0x005c
            java.lang.Object r1 = r0.findContentDeserializer(r7)
            if (r1 == 0) goto L_0x005c
            r2 = 0
            boolean r3 = r1 instanceof com.fasterxml.jackson.databind.JsonDeserializer
            if (r3 == 0) goto L_0x0048
            com.fasterxml.jackson.databind.JsonDeserializer r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1
            goto L_0x0056
        L_0x0048:
            java.lang.Class<com.fasterxml.jackson.databind.JsonDeserializer$None> r3 = com.fasterxml.jackson.databind.JsonDeserializer.None.class
            java.lang.String r4 = "findContentDeserializer"
            java.lang.Class r1 = r5._verifyAsClass(r1, r4, r3)
            if (r1 == 0) goto L_0x0056
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r6.deserializerInstance(r7, r1)
        L_0x0056:
            if (r2 == 0) goto L_0x005c
            com.fasterxml.jackson.databind.JavaType r8 = r8.withContentValueHandler(r2)
        L_0x005c:
            com.fasterxml.jackson.databind.DeserializationConfig r6 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r6 = r0.refineDeserializationType(r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _createAndCache2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws JsonMappingException {
        try {
            JsonDeserializer<Object> _createDeserializer = _createDeserializer(deserializationContext, deserializerFactory, javaType);
            if (_createDeserializer == null) {
                return null;
            }
            boolean z = !_hasCustomHandlers(javaType) && _createDeserializer.isCachable();
            if (_createDeserializer instanceof ResolvableDeserializer) {
                this._incompleteDeserializers.put(javaType, _createDeserializer);
                ((ResolvableDeserializer) _createDeserializer).resolve(deserializationContext);
                this._incompleteDeserializers.remove(javaType);
            }
            if (z) {
                this._cachedDeserializers.put(javaType, _createDeserializer);
            }
            return _createDeserializer;
        } catch (IllegalArgumentException e) {
            throw JsonMappingException.from(deserializationContext, e.getMessage(), (Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.deser.DeserializerFactory r5, com.fasterxml.jackson.databind.JavaType r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r3 = this;
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r0 = r3._incompleteDeserializers
            monitor-enter(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3._findCachedDeserializer(r6)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x000b:
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r1 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 <= 0) goto L_0x001f
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r2 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0045 }
            com.fasterxml.jackson.databind.JsonDeserializer r2 = (com.fasterxml.jackson.databind.JsonDeserializer) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r2
        L_0x001f:
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r3._createAndCache2(r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 <= 0) goto L_0x0032
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r4
        L_0x0034:
            r4 = move-exception
            if (r1 != 0) goto L_0x0044
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 <= 0) goto L_0x0044
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0044:
            throw r4     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _createDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = deserializerFactory.mapAbstractType(config, javaType);
        }
        BeanDescription introspect = config.introspect(javaType);
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return findDeserializerFromAnnotation;
        }
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, introspect.getClassInfo(), javaType);
        if (modifyTypeByAnnotation != javaType) {
            introspect = config.introspect(modifyTypeByAnnotation);
            javaType = modifyTypeByAnnotation;
        }
        Class<?> findPOJOBuilder = introspect.findPOJOBuilder();
        if (findPOJOBuilder != null) {
            return deserializerFactory.createBuilderBasedDeserializer(deserializationContext, javaType, introspect, findPOJOBuilder);
        }
        Converter<Object, Object> findDeserializationConverter = introspect.findDeserializationConverter();
        if (findDeserializationConverter == null) {
            return _createDeserializer2(deserializationContext, deserializerFactory, javaType, introspect);
        }
        JavaType inputType = findDeserializationConverter.getInputType(deserializationContext.getTypeFactory());
        if (!inputType.hasRawClass(javaType.getRawClass())) {
            introspect = config.introspect(inputType);
        }
        return new StdDelegatingDeserializer(findDeserializationConverter, inputType, _createDeserializer2(deserializationContext, deserializerFactory, inputType, introspect));
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _createDeserializer2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonFormat.Value findExpectedFormat;
        JsonFormat.Value findExpectedFormat2;
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return deserializerFactory.createEnumDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return deserializerFactory.createArrayDeserializer(deserializationContext, (ArrayType) javaType, beanDescription);
            }
            if (javaType.isMapLikeType() && ((findExpectedFormat2 = beanDescription.findExpectedFormat((JsonFormat.Value) null)) == null || findExpectedFormat2.getShape() != JsonFormat.Shape.OBJECT)) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType.isTrueMapType()) {
                    return deserializerFactory.createMapDeserializer(deserializationContext, (MapType) mapLikeType, beanDescription);
                }
                return deserializerFactory.createMapLikeDeserializer(deserializationContext, mapLikeType, beanDescription);
            } else if (javaType.isCollectionLikeType() && ((findExpectedFormat = beanDescription.findExpectedFormat((JsonFormat.Value) null)) == null || findExpectedFormat.getShape() != JsonFormat.Shape.OBJECT)) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType.isTrueCollectionType()) {
                    return deserializerFactory.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, beanDescription);
                }
                return deserializerFactory.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, beanDescription);
            }
        }
        if (javaType.isReferenceType()) {
            return deserializerFactory.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, beanDescription);
        }
        if (JsonNode.class.isAssignableFrom(javaType.getRawClass())) {
            return deserializerFactory.createTreeDeserializer(config, javaType, beanDescription);
        }
        return deserializerFactory.createBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        } else if (_hasCustomHandlers(javaType)) {
            return null;
        } else {
            return this._cachedDeserializers.get(javaType);
        }
    }

    /* access modifiers changed from: protected */
    public KeyDeserializer _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
        throw null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        if (!ClassUtil.isConcrete(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
            throw null;
        }
        deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Converter<Object, Object> findConverter(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(annotated);
        if (findDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(annotated, findDeserializationConverter);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, Annotated annotated, JsonDeserializer<Object> jsonDeserializer) throws JsonMappingException {
        Converter<Object, Object> findConverter = findConverter(deserializationContext, annotated);
        if (findConverter == null) {
            return jsonDeserializer;
        }
        return new StdDelegatingDeserializer(findConverter, findConverter.getInputType(deserializationContext.getTypeFactory()), jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(annotated);
        if (findDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, annotated, deserializationContext.deserializerInstance(annotated, findDeserializer));
    }

    public KeyDeserializer findKeyDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws JsonMappingException {
        KeyDeserializer createKeyDeserializer = deserializerFactory.createKeyDeserializer(deserializationContext, javaType);
        if (createKeyDeserializer != null) {
            if (createKeyDeserializer instanceof ResolvableDeserializer) {
                ((ResolvableDeserializer) createKeyDeserializer).resolve(deserializationContext);
            }
            return createKeyDeserializer;
        }
        _handleUnknownKeyDeserializer(deserializationContext, javaType);
        throw null;
    }

    public JsonDeserializer<Object> findValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) throws JsonMappingException {
        JsonDeserializer<Object> _findCachedDeserializer = _findCachedDeserializer(javaType);
        if (_findCachedDeserializer != null || (_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType)) != null) {
            return _findCachedDeserializer;
        }
        _handleUnknownValueDeserializer(deserializationContext, javaType);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }
}
