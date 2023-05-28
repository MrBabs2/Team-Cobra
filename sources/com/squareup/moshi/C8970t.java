package com.squareup.moshi;

import com.squareup.moshi.p206u.C8973c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.squareup.moshi.t */
/* compiled from: Types */
public final class C8970t {
    /* renamed from: a */
    public static String m29517a(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* renamed from: b */
    public static GenericArrayType m29522b(Type type) {
        return new C8973c.C8974a(type);
    }

    /* renamed from: c */
    static Type m29524c(Type type) {
        Class<?> d = m29525d(type);
        return C8973c.m29537a(type, d, d.getGenericSuperclass());
    }

    /* renamed from: d */
    public static Class<?> m29525d(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m29525d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m29525d(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = "null";
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    /* renamed from: e */
    public static WildcardType m29526e(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C8973c.C8976c(typeArr, C8973c.f25466b);
    }

    /* renamed from: f */
    public static WildcardType m29527f(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C8973c.C8976c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: a */
    public static Type m29519a(Type type, Class<?> cls) {
        Type a = m29520a(type, cls, Collection.class);
        if (a instanceof WildcardType) {
            a = ((WildcardType) a).getUpperBounds()[0];
        }
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    static Type[] m29523b(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type a = m29520a(type, cls, Map.class);
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: a */
    public static boolean m29521a(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m29521a((Type) ((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C8973c.C8975b) {
                typeArr = ((C8973c.C8975b) parameterizedType).f25471h;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C8973c.C8975b) {
                typeArr2 = ((C8973c.C8975b) parameterizedType2).f25471h;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m29521a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m29521a((Type) ((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m29521a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    static Type m29520a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C8973c.m29537a(type, cls, C8973c.m29536a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static Type m29518a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }
}
