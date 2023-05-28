package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicBeanDescription extends BeanDescription {
    private static final Class<?>[] NO_VIEWS = new Class[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AnnotatedClass _classInfo;
    protected final MapperConfig<?> _config;
    protected Class<?>[] _defaultViews;
    protected boolean _defaultViewsResolved;
    protected ObjectIdInfo _objectIdInfo;
    protected final POJOPropertiesCollector _propCollector;
    protected List<BeanPropertyDefinition> _properties;

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector, JavaType javaType, AnnotatedClass annotatedClass) {
        super(javaType);
        this._propCollector = pOJOPropertiesCollector;
        MapperConfig<?> config = pOJOPropertiesCollector.getConfig();
        this._config = config;
        if (config == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = config.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forOtherUse(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    /* access modifiers changed from: protected */
    public Converter<Object, Object> _createConverter(Object obj) {
        Converter<?, ?> converter = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class<Converter.None> cls = (Class) obj;
            if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    converter = handlerInstantiator.converterInstance(this._config, this._classInfo, cls);
                }
                return converter == null ? (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : converter;
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> _properties() {
        if (this._properties == null) {
            this._properties = this._propCollector.getProperties();
        }
        return this._properties;
    }

    public boolean addProperty(BeanPropertyDefinition beanPropertyDefinition) {
        if (hasProperty(beanPropertyDefinition.getFullName())) {
            return false;
        }
        _properties().add(beanPropertyDefinition);
        return true;
    }

    public AnnotatedMember findAnyGetter() throws IllegalArgumentException {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        AnnotatedMember anyGetter = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.getAnyGetter();
        if (anyGetter != null) {
            if (!Map.class.isAssignableFrom(anyGetter.getRawType())) {
                throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + anyGetter.getName() + "(): return type is not instance of java.util.Map");
            }
        }
        return anyGetter;
    }

    public AnnotatedMember findAnySetterAccessor() throws IllegalArgumentException {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        AnnotatedMethod anySetterMethod = pOJOPropertiesCollector.getAnySetterMethod();
        if (anySetterMethod != null) {
            Class<?> rawParameterType = anySetterMethod.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return anySetterMethod;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", new Object[]{anySetterMethod.getName(), rawParameterType.getName()}));
        }
        AnnotatedMember anySetterField = this._propCollector.getAnySetterField();
        if (anySetterField == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(anySetterField.getRawType())) {
            return anySetterField;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", new Object[]{anySetterField.getName()}));
    }

    public List<BeanPropertyDefinition> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition next : _properties()) {
            AnnotationIntrospector.ReferenceProperty findReferenceType = next.findReferenceType();
            if (findReferenceType != null && findReferenceType.isBackReference()) {
                String name = findReferenceType.getName();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(name);
                } else if (!hashSet.add(name)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name '" + name + "'");
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    public Class<?>[] findDefaultViews() {
        if (!this._defaultViewsResolved) {
            this._defaultViewsResolved = true;
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            Class<?>[] findViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this._classInfo);
            if (findViews == null && !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                findViews = NO_VIEWS;
            }
            this._defaultViews = findViews;
        }
        return this._defaultViews;
    }

    public Converter<Object, Object> findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    public JsonFormat.Value findExpectedFormat(JsonFormat.Value value) {
        JsonFormat.Value findFormat;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (!(annotationIntrospector == null || (findFormat = annotationIntrospector.findFormat(this._classInfo)) == null)) {
            if (value == null) {
                value = findFormat;
            } else {
                value = value.withOverrides(findFormat);
            }
        }
        JsonFormat.Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._classInfo.getRawType());
        if (defaultPropertyFormat == null) {
            return value;
        }
        if (value == null) {
            return defaultPropertyFormat;
        }
        return value.withOverrides(defaultPropertyFormat);
    }

    public Method findFactoryMethod(Class<?>... clsArr) {
        for (AnnotatedMethod next : this._classInfo.getFactoryMethods()) {
            if (isFactoryMethod(next) && next.getParameterCount() == 1) {
                Class<?> rawParameterType = next.getRawParameterType(0);
                for (Class<?> isAssignableFrom : clsArr) {
                    if (rawParameterType.isAssignableFrom(isAssignableFrom)) {
                        return next.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Map<Object, AnnotatedMember> findInjectables() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector != null) {
            return pOJOPropertiesCollector.getInjectables();
        }
        return Collections.emptyMap();
    }

    public AnnotatedMember findJsonValueAccessor() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        return pOJOPropertiesCollector.getJsonValueAccessor();
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    public Class<?> findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    public List<BeanPropertyDefinition> findProperties() {
        return _properties();
    }

    public BeanPropertyDefinition findProperty(PropertyName propertyName) {
        for (BeanPropertyDefinition next : _properties()) {
            if (next.hasName(propertyName)) {
                return next;
            }
        }
        return null;
    }

    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value value) {
        JsonInclude.Value findPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this._classInfo)) == null) {
            return value;
        }
        return value == null ? findPropertyInclusion : value.withOverrides(findPropertyInclusion);
    }

    public Converter<Object, Object> findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (AnnotatedConstructor next : this._classInfo.getConstructors()) {
            if (next.getParameterCount() == 1) {
                Class<?> rawParameterType = next.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return next.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Annotations getClassAnnotations() {
        return this._classInfo.getAnnotations();
    }

    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return this._classInfo.getConstructors();
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        List<AnnotatedMethod> factoryMethods = this._classInfo.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return factoryMethods;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod next : factoryMethods) {
            if (isFactoryMethod(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public Set<String> getIgnoredPropertyNames() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        Set<String> ignoredPropertyNames = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.getIgnoredPropertyNames();
        return ignoredPropertyNames == null ? Collections.emptySet() : ignoredPropertyNames;
    }

    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public boolean hasKnownClassAnnotations() {
        return this._classInfo.hasAnnotations();
    }

    public boolean hasProperty(PropertyName propertyName) {
        return findProperty(propertyName) != null;
    }

    public Object instantiateBean(boolean z) {
        AnnotatedConstructor defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z) {
            defaultConstructor.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor.getAnnotated().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ClassUtil.throwIfError(e);
            ClassUtil.throwIfRTE(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this._classInfo.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    public boolean isFactoryMethod(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedMethod);
        if (findCreatorAnnotation != null && findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
            return false;
        }
        return true;
    }

    public boolean removeProperty(String str) {
        Iterator<BeanPropertyDefinition> it = _properties().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected BasicBeanDescription(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List<BeanPropertyDefinition> list) {
        super(javaType);
        this._propCollector = null;
        this._config = mapperConfig;
        if (mapperConfig == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        this(pOJOPropertiesCollector, pOJOPropertiesCollector.getType(), pOJOPropertiesCollector.getClassDef());
        this._objectIdInfo = pOJOPropertiesCollector.getObjectIdInfo();
    }
}
