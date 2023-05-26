package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class ClassNameIdResolver extends TypeIdResolverBase {
    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory) {
        super(javaType, typeFactory);
    }

    /* access modifiers changed from: protected */
    public String _idFrom(Object obj, Class<?> cls, TypeFactory typeFactory) {
        boolean isAssignableFrom = Enum.class.isAssignableFrom(cls);
        Class<? super Object> cls2 = cls;
        if (isAssignableFrom) {
            boolean isEnum = cls.isEnum();
            cls2 = cls;
            if (!isEnum) {
                cls2 = cls.getSuperclass();
            }
        }
        String name = cls2.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || ClassUtil.getOuterClass(cls2) == null || ClassUtil.getOuterClass(this._baseType.getRawClass()) != null) ? name : this._baseType.getRawClass().getName();
        }
        if (obj instanceof EnumSet) {
            return typeFactory.constructCollectionType((Class<? extends Collection>) EnumSet.class, (Class<?>) ClassUtil.findEnumType((EnumSet<?>) (EnumSet) obj)).toCanonical();
        } else if (!(obj instanceof EnumMap)) {
            return name;
        } else {
            return typeFactory.constructMapType((Class<? extends Map>) EnumMap.class, (Class<?>) ClassUtil.findEnumType((EnumMap<?, ?>) (EnumMap) obj), (Class<?>) Object.class).toCanonical();
        }
    }

    /* access modifiers changed from: protected */
    public JavaType _typeFromId(String str, DatabindContext databindContext) throws IOException {
        JavaType resolveSubType = databindContext.resolveSubType(this._baseType, str);
        return (resolveSubType != null || !(databindContext instanceof DeserializationContext)) ? resolveSubType : ((DeserializationContext) databindContext).handleUnknownTypeId(this._baseType, str, this, "no such class found");
    }

    public String getDescForKnownTypeIds() {
        return "class name used as type id";
    }

    public String idFromValue(Object obj) {
        return _idFrom(obj, obj.getClass(), this._typeFactory);
    }

    public String idFromValueAndType(Object obj, Class<?> cls) {
        return _idFrom(obj, cls, this._typeFactory);
    }

    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        return _typeFromId(str, databindContext);
    }
}
