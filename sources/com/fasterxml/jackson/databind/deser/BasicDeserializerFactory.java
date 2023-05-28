package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    private static final Class<?> CLASS_CHAR_BUFFER = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
    static final HashMap<String, Class<? extends Map>> _mapFallbacks;
    protected final DeserializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1 */
    static /* synthetic */ class C66971 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonCreator$Mode[] r0 = com.fasterxml.jackson.annotation.JsonCreator.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = r0
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.C66971.<clinit>():void");
        }
    }

    static {
        new PropertyName("@JsonUnwrapped");
        HashMap<String, Class<? extends Map>> hashMap = new HashMap<>();
        _mapFallbacks = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        _mapFallbacks.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        _mapFallbacks.put(SortedMap.class.getName(), TreeMap.class);
        _mapFallbacks.put(NavigableMap.class.getName(), TreeMap.class);
        _mapFallbacks.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> hashMap2 = new HashMap<>();
        _collectionFallbacks = hashMap2;
        hashMap2.put(Collection.class.getName(), ArrayList.class);
        _collectionFallbacks.put(List.class.getName(), ArrayList.class);
        _collectionFallbacks.put(Set.class.getName(), HashSet.class);
        _collectionFallbacks.put(SortedSet.class.getName(), TreeSet.class);
        _collectionFallbacks.put(Queue.class.getName(), LinkedList.class);
        _collectionFallbacks.put("java.util.Deque", LinkedList.class);
        _collectionFallbacks.put("java.util.NavigableSet", TreeSet.class);
    }

    protected BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean _checkIfCreatorPropertyBased(com.fasterxml.jackson.databind.AnnotationIntrospector r3, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r4, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r5) {
        /*
            r2 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.isExplicitlyNamed()
            if (r1 != 0) goto L_0x0014
        L_0x0009:
            r1 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r4 = r4.getParameter(r1)
            com.fasterxml.jackson.annotation.JacksonInject$Value r3 = r3.findInjectableValue(r4)
            if (r3 == 0) goto L_0x0015
        L_0x0014:
            return r0
        L_0x0015:
            if (r5 == 0) goto L_0x002a
            java.lang.String r3 = r5.getName()
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r5.couldSerialize()
            if (r3 == 0) goto L_0x002a
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._checkIfCreatorPropertyBased(com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition):boolean");
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i2);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName == null || _findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, (JacksonInject.Value) null);
                        i2++;
                    } else if (annotatedWithParams2 != null) {
                        break;
                    } else {
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueAccessor());
        for (AnnotatedMethod next : introspect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, next)) {
                if (next.getParameterCount() != 1 || !next.getRawReturnType().isAssignableFrom(rawClass)) {
                    throw new IllegalArgumentException("Unsuitable method (" + next + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + ")");
                } else if (next.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(next.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, next);
                } else {
                    throw new IllegalArgumentException("Parameter #0 type for factory method (" + next + ") not suitable, must be java.lang.String");
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization != null) {
            return findNameForDeserialization;
        }
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> beanClass = beanDescription.getBeanClass();
        if (beanClass == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(beanClass)) {
            if (Collections.EMPTY_SET.getClass() == beanClass) {
                return new ConstantValueInstantiator(Collections.EMPTY_SET);
            }
            if (Collections.EMPTY_LIST.getClass() == beanClass) {
                return new ConstantValueInstantiator(Collections.EMPTY_LIST);
            }
            return null;
        } else if (!Map.class.isAssignableFrom(beanClass) || Collections.EMPTY_MAP.getClass() != beanClass) {
            return null;
        } else {
            return new ConstantValueInstantiator(Collections.EMPTY_MAP);
        }
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        for (AbstractTypeResolver findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
            JavaType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
            if (ClassUtil.rawClass(findTypeMapping2) != rawClass) {
                return findTypeMapping2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void _addDeserializerConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) throws JsonMappingException {
        int i;
        Iterator it;
        PropertyName propertyName;
        CreatorCandidate creatorCandidate;
        Iterator it2;
        int i2;
        int i3;
        int i4;
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        CreatorCollector creatorCollector2 = creatorCollector;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = map;
        if (!beanDescription.isNonStaticInnerClass()) {
            AnnotatedConstructor findDefaultConstructor = beanDescription.findDefaultConstructor();
            if (findDefaultConstructor != null && (!creatorCollector.hasDefaultCreator() || _hasCreatorAnnotation(deserializationContext2, findDefaultConstructor))) {
                creatorCollector2.setDefaultCreator(findDefaultConstructor);
            }
            LinkedList linkedList = new LinkedList();
            Iterator<AnnotatedConstructor> it3 = beanDescription.getConstructors().iterator();
            int i5 = 0;
            while (true) {
                i = 1;
                if (!it3.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it3.next();
                JsonCreator.Mode findCreatorAnnotation = annotationIntrospector2.findCreatorAnnotation(deserializationContext.getConfig(), next);
                if (JsonCreator.Mode.DISABLED != findCreatorAnnotation) {
                    if (findCreatorAnnotation != null) {
                        int i6 = C66971.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[findCreatorAnnotation.ordinal()];
                        if (i6 == 1) {
                            _addExplicitDelegatingCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, next, (BeanPropertyDefinition[]) null));
                        } else if (i6 != 2) {
                            _addExplicitAnyCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, next, map2.get(next)));
                        } else {
                            _addExplicitPropertyCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, next, map2.get(next)));
                        }
                        i5++;
                    } else if (visibilityChecker2.isCreatorVisible(next)) {
                        linkedList.add(CreatorCandidate.construct(annotationIntrospector2, next, map2.get(next)));
                    }
                }
            }
            if (i5 <= 0) {
                Iterator it4 = linkedList.iterator();
                LinkedList linkedList2 = null;
                while (it4.hasNext()) {
                    CreatorCandidate creatorCandidate2 = (CreatorCandidate) it4.next();
                    int paramCount = creatorCandidate2.paramCount();
                    AnnotatedWithParams creator = creatorCandidate2.creator();
                    if (paramCount == i) {
                        BeanPropertyDefinition propertyDef = creatorCandidate2.propertyDef(0);
                        if (_checkIfCreatorPropertyBased(annotationIntrospector2, creator, propertyDef)) {
                            SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i];
                            settableBeanPropertyArr[0] = constructCreatorProperty(deserializationContext, beanDescription, creatorCandidate2.paramName(0), 0, creatorCandidate2.parameter(0), creatorCandidate2.injection(0));
                            creatorCollector2.addPropertyCreator(creator, false, settableBeanPropertyArr);
                        } else {
                            AnnotatedWithParams annotatedWithParams = creator;
                            _handleSingleArgumentCreator(creatorCollector2, annotatedWithParams, false, visibilityChecker2.isCreatorVisible(annotatedWithParams));
                            if (propertyDef != null) {
                                ((POJOPropertyBuilder) propertyDef).removeConstructors();
                            }
                        }
                        it = it4;
                    } else {
                        AnnotatedWithParams annotatedWithParams2 = creator;
                        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[paramCount];
                        int i7 = 0;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (i7 < paramCount) {
                            AnnotatedParameter parameter = annotatedWithParams2.getParameter(i7);
                            BeanPropertyDefinition propertyDef2 = creatorCandidate2.propertyDef(i7);
                            JacksonInject.Value findInjectableValue = annotationIntrospector2.findInjectableValue(parameter);
                            if (propertyDef2 == null) {
                                propertyName = null;
                            } else {
                                propertyName = propertyDef2.getFullName();
                            }
                            if (propertyDef2 == null || !propertyDef2.isExplicitlyNamed()) {
                                AnnotatedParameter annotatedParameter = parameter;
                                i2 = i7;
                                i3 = paramCount;
                                creatorCandidate = creatorCandidate2;
                                it2 = it4;
                                i4 = i8;
                                if (findInjectableValue != null) {
                                    i10++;
                                    settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i2, annotatedParameter, findInjectableValue);
                                } else {
                                    AnnotatedParameter annotatedParameter2 = annotatedParameter;
                                    if (annotationIntrospector2.findUnwrappingNameTransformer(annotatedParameter2) != null) {
                                        _reportUnwrappedCreatorProperty(deserializationContext2, beanDescription2, annotatedParameter2);
                                        throw null;
                                    } else if (i4 < 0) {
                                        i8 = i2;
                                        i7 = i2 + 1;
                                        paramCount = i3;
                                        it4 = it2;
                                        creatorCandidate2 = creatorCandidate;
                                        VisibilityChecker<?> visibilityChecker3 = visibilityChecker;
                                    }
                                }
                            } else {
                                i9++;
                                i2 = i7;
                                i3 = paramCount;
                                it2 = it4;
                                creatorCandidate = creatorCandidate2;
                                i4 = i8;
                                settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i2, parameter, findInjectableValue);
                            }
                            i8 = i4;
                            i7 = i2 + 1;
                            paramCount = i3;
                            it4 = it2;
                            creatorCandidate2 = creatorCandidate;
                            VisibilityChecker<?> visibilityChecker32 = visibilityChecker;
                        }
                        int i11 = paramCount;
                        CreatorCandidate creatorCandidate3 = creatorCandidate2;
                        it = it4;
                        int i12 = i8;
                        int i13 = i9 + 0;
                        if (i9 > 0 || i10 > 0) {
                            if (i13 + i10 == i11) {
                                creatorCollector2.addPropertyCreator(annotatedWithParams2, false, settableBeanPropertyArr2);
                            } else if (i9 == 0 && i10 + 1 == i11) {
                                creatorCollector2.addDelegatingCreator(annotatedWithParams2, false, settableBeanPropertyArr2, 0);
                            } else {
                                PropertyName findImplicitParamName = creatorCandidate3.findImplicitParamName(i12);
                                if (findImplicitParamName == null || findImplicitParamName.isEmpty()) {
                                    deserializationContext2.reportBadTypeDefinition(beanDescription2, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i12), annotatedWithParams2);
                                    throw null;
                                }
                            }
                        }
                        if (!creatorCollector.hasDefaultCreator()) {
                            LinkedList linkedList3 = linkedList2 == null ? new LinkedList() : linkedList2;
                            linkedList3.add(annotatedWithParams2);
                            linkedList2 = linkedList3;
                        }
                    }
                    visibilityChecker2 = visibilityChecker;
                    it4 = it;
                    i = 1;
                }
                if (linkedList2 != null && !creatorCollector.hasDelegatingCreator() && !creatorCollector.hasPropertyBasedCreator()) {
                    _checkImplicitlyNamedConstructors(deserializationContext, beanDescription, visibilityChecker, annotationIntrospector, creatorCollector, linkedList2);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: com.fasterxml.jackson.databind.PropertyName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: com.fasterxml.jackson.databind.introspect.AnnotatedParameter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: com.fasterxml.jackson.databind.PropertyName} */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r25v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext r27, com.fasterxml.jackson.databind.BeanDescription r28, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r29, com.fasterxml.jackson.databind.AnnotationIntrospector r30, com.fasterxml.jackson.databind.deser.impl.CreatorCollector r31, java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]> r32) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r1 = r28.getFactoryMethods()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x001c:
            boolean r3 = r1.hasNext()
            r15 = 2
            r6 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r27.getConfig()
            com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = r11.findCreatorAnnotation(r4, r3)
            int r14 = r3.getParameterCount()
            if (r4 != 0) goto L_0x0049
            if (r14 != r5) goto L_0x001c
            boolean r4 = r10.isCreatorVisible(r3)
            if (r4 == 0) goto L_0x001c
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r6)
            r0.add(r3)
            goto L_0x001c
        L_0x0049:
            com.fasterxml.jackson.annotation.JsonCreator$Mode r6 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r4 != r6) goto L_0x004e
            goto L_0x001c
        L_0x004e:
            if (r14 != 0) goto L_0x0054
            r12.setDefaultCreator(r3)
            goto L_0x001c
        L_0x0054:
            int[] r6 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.C66971.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L_0x007c
            if (r4 == r15) goto L_0x006e
            java.lang.Object r4 = r13.get(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r4 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r4
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r4)
            r7._addExplicitAnyCreator(r8, r9, r12, r3)
            goto L_0x0084
        L_0x006e:
            java.lang.Object r4 = r13.get(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r4 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r4
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r4)
            r7._addExplicitPropertyCreator(r8, r9, r12, r3)
            goto L_0x0084
        L_0x007c:
            r6 = 0
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r6)
            r7._addExplicitDelegatingCreator(r8, r9, r12, r3)
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0087:
            if (r2 <= 0) goto L_0x008a
            return
        L_0x008a:
            java.util.Iterator r14 = r0.iterator()
        L_0x008e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = r14.next()
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r0 = (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate) r0
            int r4 = r0.paramCount()
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r3 = r0.creator()
            java.lang.Object r1 = r13.get(r3)
            r16 = r1
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r16 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r16
            if (r4 == r5) goto L_0x00ad
            goto L_0x008e
        L_0x00ad:
            r1 = 0
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r0.propertyDef(r1)
            boolean r2 = r7._checkIfCreatorPropertyBased(r11, r3, r0)
            if (r2 != 0) goto L_0x00c7
            boolean r2 = r10.isCreatorVisible(r3)
            r7._handleSingleArgumentCreator(r12, r3, r1, r2)
            if (r0 == 0) goto L_0x008e
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r0 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r0
            r0.removeConstructors()
            goto L_0x008e
        L_0x00c7:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r2 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r4]
            r19 = r6
            r1 = 0
            r17 = 0
            r18 = 0
        L_0x00d0:
            if (r1 >= r4) goto L_0x0157
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r0 = r3.getParameter(r1)
            if (r16 != 0) goto L_0x00db
            r20 = r6
            goto L_0x00dd
        L_0x00db:
            r20 = r16[r1]
        L_0x00dd:
            com.fasterxml.jackson.annotation.JacksonInject$Value r21 = r11.findInjectableValue(r0)
            if (r20 != 0) goto L_0x00e6
            r22 = r6
            goto L_0x00ea
        L_0x00e6:
            com.fasterxml.jackson.databind.PropertyName r22 = r20.getFullName()
        L_0x00ea:
            if (r20 == 0) goto L_0x0114
            boolean r20 = r20.isExplicitlyNamed()
            if (r20 == 0) goto L_0x0114
            int r17 = r17 + 1
            r20 = r0
            r0 = r26
            r23 = r1
            r1 = r27
            r15 = r2
            r2 = r28
            r10 = r3
            r3 = r22
            r13 = r4
            r4 = r23
            r24 = 1
            r5 = r20
            r25 = r6
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0144
        L_0x0114:
            r20 = r0
            r23 = r1
            r15 = r2
            r10 = r3
            r13 = r4
            r25 = r6
            r24 = 1
            if (r21 == 0) goto L_0x0138
            int r18 = r18 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r23
            r5 = r20
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0144
        L_0x0138:
            r0 = r20
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r11.findUnwrappingNameTransformer(r0)
            if (r1 != 0) goto L_0x0153
            if (r19 != 0) goto L_0x0144
            r19 = r0
        L_0x0144:
            int r1 = r23 + 1
            r3 = r10
            r4 = r13
            r2 = r15
            r6 = r25
            r5 = 1
            r15 = 2
            r10 = r29
            r13 = r32
            goto L_0x00d0
        L_0x0153:
            r7._reportUnwrappedCreatorProperty(r8, r9, r0)
            throw r25
        L_0x0157:
            r15 = r2
            r10 = r3
            r13 = r4
            r25 = r6
            r24 = 1
            int r0 = r17 + 0
            if (r17 > 0) goto L_0x0167
            if (r18 <= 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r0 = 0
            goto L_0x017a
        L_0x0167:
            int r0 = r0 + r18
            if (r0 != r13) goto L_0x0170
            r0 = 0
            r12.addPropertyCreator(r10, r0, r15)
            goto L_0x017a
        L_0x0170:
            r0 = 0
            if (r17 != 0) goto L_0x0184
            int r1 = r18 + 1
            if (r1 != r13) goto L_0x0184
            r12.addDelegatingCreator(r10, r0, r15, r0)
        L_0x017a:
            r10 = r29
            r13 = r32
            r6 = r25
            r5 = 1
            r15 = 2
            goto L_0x008e
        L_0x0184:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r19.getIndex()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r0] = r2
            r1[r24] = r10
            java.lang.String r0 = "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.reportBadTypeDefinition(r9, r0, r1)
            throw r25
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.deser.impl.CreatorCollector, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        if (1 != creatorCandidate.paramCount()) {
            int findOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection();
            if (findOnlyParamWithoutInjection < 0 || creatorCandidate.paramName(findOnlyParamWithoutInjection) != null) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            }
        } else {
            AnnotatedParameter parameter = creatorCandidate.parameter(0);
            JacksonInject.Value injection = creatorCandidate.injection(0);
            PropertyName explicitParamName = creatorCandidate.explicitParamName(0);
            BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
            boolean z = (explicitParamName == null && injection == null) ? false : true;
            if (!z && propertyDef != null) {
                explicitParamName = creatorCandidate.findImplicitParamName(0);
                z = explicitParamName != null && propertyDef.couldSerialize();
            }
            PropertyName propertyName = explicitParamName;
            if (z) {
                creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, parameter, injection)});
                return;
            }
            _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        CreatorCollector creatorCollector2 = creatorCollector;
        CreatorCandidate creatorCandidate2 = creatorCandidate;
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i = -1;
        for (int i2 = 0; i2 < paramCount; i2++) {
            AnnotatedParameter parameter = creatorCandidate2.parameter(i2);
            JacksonInject.Value injection = creatorCandidate2.injection(i2);
            if (injection != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, (PropertyName) null, i2, parameter, injection);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext2.reportBadTypeDefinition(beanDescription2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), creatorCandidate2);
                throw null;
            }
        }
        if (i < 0) {
            deserializationContext2.reportBadTypeDefinition(beanDescription2, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate2);
            throw null;
        } else if (paramCount == 1) {
            _handleSingleArgumentCreator(creatorCollector2, creatorCandidate.creator(), true, true);
            BeanPropertyDefinition propertyDef = creatorCandidate2.propertyDef(0);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
        } else {
            creatorCollector2.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i);
        }
    }

    /* access modifiers changed from: protected */
    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        for (int i = 0; i < paramCount; i++) {
            JacksonInject.Value injection = creatorCandidate.injection(i);
            AnnotatedParameter parameter = creatorCandidate.parameter(i);
            PropertyName paramName = creatorCandidate.paramName(i);
            if (paramName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(parameter) == null) {
                    paramName = creatorCandidate.findImplicitParamName(i);
                    if (paramName == null && injection == null) {
                        deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i), creatorCandidate);
                        throw null;
                    }
                } else {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                    throw null;
                }
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, paramName, i, parameter, injection);
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    /* access modifiers changed from: protected */
    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        VisibilityChecker<?> defaultVisibilityChecker = config.getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(config);
    }

    /* access modifiers changed from: protected */
    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> emptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition next : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = next.getConstructorParameters();
            while (true) {
                if (constructorParameters.hasNext()) {
                    AnnotatedParameter next2 = constructorParameters.next();
                    AnnotatedWithParams owner = next2.getOwner();
                    BeanPropertyDefinition[] beanPropertyDefinitionArr = emptyMap.get(owner);
                    int index = next2.getIndex();
                    if (beanPropertyDefinitionArr == null) {
                        if (emptyMap.isEmpty()) {
                            emptyMap = new LinkedHashMap<>();
                        }
                        beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                        emptyMap.put(owner, beanPropertyDefinitionArr);
                    } else if (beanPropertyDefinitionArr[index] != null) {
                        deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], next);
                        throw null;
                    }
                    beanPropertyDefinitionArr[index] = next;
                }
            }
        }
        return emptyMap;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findReferenceDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findReferenceDeserializer2 = findReferenceDeserializer.findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findReferenceDeserializer2 != null) {
                return findReferenceDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    /* access modifiers changed from: protected */
    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CharSequence.class) {
            if (z || z2) {
                creatorCollector.addStringCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.addIntCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.addLongCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z);
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            creatorCollector.addDelegatingCreator(annotatedWithParams, z, (SettableBeanProperty[]) null, 0);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        JsonCreator.Mode findCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated)) == null || findCreatorAnnotation == JsonCreator.Mode.DISABLED) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class cls = _collectionFallbacks.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    /* access modifiers changed from: protected */
    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{Integer.valueOf(annotatedParameter.getIndex())}));
        throw null;
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) throws JsonMappingException {
        ValueInstantiator valueInstantiatorInstance;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (ValueInstantiator.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
                if (handlerInstantiator == null || (valueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls)) == null) {
                    return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
                }
                return valueInstantiatorInstance;
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyMetadata propertyMetadata;
        Object obj;
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        } else {
            propertyMetadata = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter2), annotationIntrospector.findPropertyDescription(annotatedParameter2), annotationIntrospector.findPropertyIndex(annotatedParameter2), annotationIntrospector.findPropertyDefaultValue(annotatedParameter2));
        }
        PropertyMetadata propertyMetadata2 = propertyMetadata;
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext2, annotatedParameter2, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, resolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter2), annotatedParameter, propertyMetadata2);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        if (value == null) {
            obj = null;
        } else {
            obj = value.getId();
        }
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializer2, beanDescription.getClassAnnotations(), annotatedParameter, i, obj, propertyMetadata2);
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext2, annotatedParameter2);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(deserializationContext2.handlePrimaryContextualization(findDeserializerFromAnnotation, creatorProperty, resolveMemberAndTypeAnnotations)) : creatorProperty;
    }

    /* access modifiers changed from: protected */
    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyArrayDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) throws JsonMappingException {
        JsonDeserializer<?> jsonDeserializer;
        JavaType contentType = collectionType.getContentType();
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, beanDescription, typeDeserializer2, jsonDeserializer2);
        if (_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (jsonDeserializer2 == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, (JsonDeserializer<?>) null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    beanDescription = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType = _mapAbstractCollectionType;
                } else if (collectionType.getTypeHandler() != null) {
                    _findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(beanDescription);
                } else {
                    throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                }
            }
            if (_findCustomCollectionDeserializer == null) {
                ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!findValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, jsonDeserializer2, typeDeserializer2, findValueInstantiator);
                    }
                    JsonDeserializer<?> findForCollection = JavaUtilCollectionsDeserializers.findForCollection(deserializationContext, collectionType);
                    if (findForCollection != null) {
                        return findForCollection;
                    }
                }
                if (contentType.hasRawClass(String.class)) {
                    jsonDeserializer = new StringCollectionDeserializer(collectionType, jsonDeserializer2, findValueInstantiator);
                } else {
                    jsonDeserializer = new CollectionDeserializer(collectionType, jsonDeserializer2, typeDeserializer2, findValueInstantiator);
                }
                _findCustomCollectionDeserializer = jsonDeserializer;
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionDeserializer = modifyCollectionDeserializer.modifyCollectionDeserializer(config, collectionType, beanDescription, _findCustomCollectionDeserializer);
            }
        }
        return _findCustomCollectionDeserializer;
    }

    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        JsonDeserializer<?> deserializerForNoArgsCreator;
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            if (_constructDefaultValueInstantiator == null) {
                settableBeanPropertyArr = null;
            } else {
                settableBeanPropertyArr = _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            }
            Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        deserializerForNoArgsCreator = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                        break;
                    } else if (next.getRawReturnType().isAssignableFrom(rawClass)) {
                        deserializerForNoArgsCreator = EnumDeserializer.deserializerForCreator(config, rawClass, next, _constructDefaultValueInstantiator, settableBeanPropertyArr);
                        break;
                    }
                }
            }
            _findCustomEnumDeserializer = deserializerForNoArgsCreator;
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001f A[LOOP:0: B:3:0x001f->B:6:0x002f, LOOP_START, PHI: r2 
      PHI: (r2v8 com.fasterxml.jackson.databind.KeyDeserializer) = (r2v0 com.fasterxml.jackson.databind.KeyDeserializer), (r2v11 com.fasterxml.jackson.databind.KeyDeserializer) binds: [B:2:0x000d, B:6:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.KeyDeserializer createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.JavaType r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r6.getConfig()
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r5._factoryConfig
            boolean r1 = r1.hasKeyDeserializers()
            r2 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.Class r1 = r7.getRawClass()
            com.fasterxml.jackson.databind.BeanDescription r1 = r0.introspectClassAnnotations((java.lang.Class<?>) r1)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r3 = r5._factoryConfig
            java.lang.Iterable r3 = r3.keyDeserializers()
            java.util.Iterator r3 = r3.iterator()
        L_0x001f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0031
            java.lang.Object r2 = r3.next()
            com.fasterxml.jackson.databind.deser.KeyDeserializers r2 = (com.fasterxml.jackson.databind.deser.KeyDeserializers) r2
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r2.findKeyDeserializer(r7, r0, r1)
            if (r2 == 0) goto L_0x001f
        L_0x0031:
            if (r2 != 0) goto L_0x0042
            boolean r1 = r7.isEnumType()
            if (r1 == 0) goto L_0x003e
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r5._createEnumKeyDeserializer(r6, r7)
            goto L_0x0042
        L_0x003e:
            com.fasterxml.jackson.databind.KeyDeserializer r2 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(r0, r7)
        L_0x0042:
            if (r2 == 0) goto L_0x0067
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            boolean r6 = r6.hasDeserializerModifiers()
            if (r6 == 0) goto L_0x0067
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r6 = r5._factoryConfig
            java.lang.Iterable r6 = r6.deserializerModifiers()
            java.util.Iterator r6 = r6.iterator()
        L_0x0056:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r6.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r1 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r1
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r1.modifyKeyDeserializer(r0, r7, r2)
            goto L_0x0056
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.KeyDeserializer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.fasterxml.jackson.databind.deser.std.MapDeserializer} */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r20, com.fasterxml.jackson.databind.type.MapType r21, com.fasterxml.jackson.databind.BeanDescription r22) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            com.fasterxml.jackson.databind.DeserializationConfig r10 = r20.getConfig()
            com.fasterxml.jackson.databind.JavaType r11 = r21.getKeyType()
            com.fasterxml.jackson.databind.JavaType r0 = r21.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r16 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r16 = (com.fasterxml.jackson.databind.JsonDeserializer) r16
            java.lang.Object r1 = r11.getValueHandler()
            r15 = r1
            com.fasterxml.jackson.databind.KeyDeserializer r15 = (com.fasterxml.jackson.databind.KeyDeserializer) r15
            java.lang.Object r1 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r1
            if (r1 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r7.findTypeDeserializer(r10, r0)
            r17 = r0
            goto L_0x0032
        L_0x0030:
            r17 = r1
        L_0x0032:
            r0 = r19
            r1 = r21
            r2 = r10
            r3 = r22
            r4 = r15
            r5 = r17
            r6 = r16
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._findCustomMapDeserializer(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0105
            java.lang.Class r12 = r21.getRawClass()
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            boolean r1 = r1.isAssignableFrom(r12)
            r18 = 0
            if (r1 == 0) goto L_0x0085
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r12 != r0) goto L_0x005b
            r13 = r22
            r2 = r18
            goto L_0x0062
        L_0x005b:
            r13 = r22
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.findValueInstantiator(r8, r13)
            r2 = r0
        L_0x0062:
            java.lang.Class r0 = r11.getRawClass()
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L_0x007d
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            r3 = 0
            r6 = 0
            r0 = r11
            r1 = r21
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0087
        L_0x007d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x0085:
            r13 = r22
        L_0x0087:
            if (r0 != 0) goto L_0x0107
            boolean r1 = r21.isInterface()
            if (r1 != 0) goto L_0x00a1
            boolean r1 = r21.isAbstract()
            if (r1 == 0) goto L_0x0096
            goto L_0x00a1
        L_0x0096:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap(r20, r21)
            if (r0 == 0) goto L_0x009d
            return r0
        L_0x009d:
            r2 = r0
            r1 = r9
        L_0x009f:
            r0 = r13
            goto L_0x00c8
        L_0x00a1:
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Map>> r1 = _mapFallbacks
            java.lang.String r2 = r12.getName()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x00bb
            com.fasterxml.jackson.databind.JavaType r1 = r10.constructSpecializedType(r9, r1)
            com.fasterxml.jackson.databind.type.MapType r1 = (com.fasterxml.jackson.databind.type.MapType) r1
            com.fasterxml.jackson.databind.BeanDescription r2 = r10.introspectForCreation(r1)
            r13 = r2
            goto L_0x00c6
        L_0x00bb:
            java.lang.Object r0 = r21.getTypeHandler()
            if (r0 == 0) goto L_0x00ee
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r0 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r22)
            r1 = r9
        L_0x00c6:
            r2 = r0
            goto L_0x009f
        L_0x00c8:
            if (r2 != 0) goto L_0x00eb
            com.fasterxml.jackson.databind.deser.ValueInstantiator r14 = r7.findValueInstantiator(r8, r0)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r12 = r2
            r13 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r4 = r0.getClassInfo()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r3 = r10.getDefaultPropertyIgnorals(r3, r4)
            if (r3 != 0) goto L_0x00e2
            goto L_0x00e6
        L_0x00e2:
            java.util.Set r18 = r3.findIgnoredForDeserialization()
        L_0x00e6:
            r3 = r18
            r2.setIgnorableProperties(r3)
        L_0x00eb:
            r13 = r0
            r0 = r2
            goto L_0x0108
        L_0x00ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0105:
            r13 = r22
        L_0x0107:
            r1 = r9
        L_0x0108:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r7._factoryConfig
            boolean r2 = r2.hasDeserializerModifiers()
            if (r2 == 0) goto L_0x012b
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r2 = r7._factoryConfig
            java.lang.Iterable r2 = r2.deserializerModifiers()
            java.util.Iterator r2 = r2.iterator()
        L_0x011a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x012b
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r3 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r3
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.modifyMapDeserializer(r10, r1, r13, r0)
            goto L_0x011a
        L_0x012b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        ValueInstantiator valueInstantiator;
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomReferenceDeserializer != null || !referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyReferenceDeserializer : this._factoryConfig.deserializerModifiers()) {
                    _findCustomReferenceDeserializer = modifyReferenceDeserializer.modifyReferenceDeserializer(config, referenceType, beanDescription, _findCustomReferenceDeserializer);
                }
            }
            return _findCustomReferenceDeserializer;
        }
        if (referenceType.getRawClass() == AtomicReference.class) {
            valueInstantiator = null;
        } else {
            valueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        }
        return new AtomicReferenceDeserializer(referenceType, valueInstantiator, typeDeserializer2, jsonDeserializer);
    }

    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        if (_findCustomTreeNodeDeserializer != null) {
            return _findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findContentDeserializer);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        } else if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_BUFFER) {
            return StringDeserializer.instance;
        } else {
            if (rawClass == CLASS_ITERABLE) {
                TypeFactory typeFactory = deserializationContext.getTypeFactory();
                JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, CLASS_ITERABLE);
                return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType((Class<? extends Collection>) Collection.class, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]), beanDescription);
            } else if (rawClass == CLASS_MAP_ENTRY) {
                JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
                JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
                TypeDeserializer typeDeserializer = (TypeDeserializer) containedTypeOrUnknown2.getTypeHandler();
                if (typeDeserializer == null) {
                    typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
                }
                return new MapEntryDeserializer(javaType, (KeyDeserializer) containedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) (JsonDeserializer) containedTypeOrUnknown2.getValueHandler(), typeDeserializer);
            } else {
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
                    if (find == null) {
                        find = DateDeserializers.find(rawClass, name);
                    }
                    if (find != null) {
                        return find;
                    }
                }
                if (rawClass == TokenBuffer.class) {
                    return new TokenBufferDeserializer();
                }
                JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
                if (findOptionalStdDeserializer != null) {
                    return findOptionalStdDeserializer;
                }
                return JdkDeserializers.find(rawClass, name);
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findDeserializer);
    }

    /* access modifiers changed from: protected */
    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (findPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType mapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        Collection<NamedType> collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
        } else {
            collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (mapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
            findTypeResolver = findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
        }
        return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null && (_valueInstantiatorInstance = _findStdValueInstantiator(config, beanDescription)) == null) {
            _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators next : this._factoryConfig.valueInstantiators()) {
                _valueInstantiatorInstance = next.findValueInstantiator(config, beanDescription, _valueInstantiatorInstance);
                if (_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", next.getClass().getName());
                    throw null;
                }
            }
        }
        if (_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return _valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = _valueInstantiatorInstance.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        throw new IllegalArgumentException("Argument #" + incompleteParameter.getIndex() + " of constructor " + owner + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
            } else {
                javaType = _mapAbstractType2;
            }
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + _mapAbstractType2 + ": latter is not a subtype of former");
    }

    /* access modifiers changed from: protected */
    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        boolean isMapLikeType = javaType.isMapLikeType();
        MapLikeType mapLikeType = javaType;
        if (isMapLikeType) {
            JavaType keyType = javaType.getKeyType();
            mapLikeType = javaType;
            if (keyType != null) {
                KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember));
                mapLikeType = javaType;
                if (keyDeserializerInstance != null) {
                    MapLikeType withKeyValueHandler = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                    withKeyValueHandler.getKeyType();
                    mapLikeType = withKeyValueHandler;
                }
            }
        }
        boolean hasContentType = mapLikeType.hasContentType();
        JavaType javaType2 = mapLikeType;
        if (hasContentType) {
            JsonDeserializer<Object> deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            JavaType javaType3 = mapLikeType;
            if (deserializerInstance != null) {
                javaType3 = mapLikeType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType3, annotatedMember);
            javaType2 = javaType3;
            if (findPropertyContentTypeDeserializer != null) {
                javaType2 = javaType3.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType2, annotatedMember);
        JavaType javaType4 = javaType2;
        if (findPropertyTypeDeserializer != null) {
            javaType4 = javaType2.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType4);
    }
}
