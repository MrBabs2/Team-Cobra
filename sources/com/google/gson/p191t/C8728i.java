package com.google.gson.p191t;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.t.i */
/* compiled from: Primitives */
public final class C8728i {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f24845a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m28502a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m28502a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m28502a(hashMap, hashMap2, Character.TYPE, Character.class);
        m28502a(hashMap, hashMap2, Double.TYPE, Double.class);
        m28502a(hashMap, hashMap2, Float.TYPE, Float.class);
        m28502a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m28502a(hashMap, hashMap2, Long.TYPE, Long.class);
        m28502a(hashMap, hashMap2, Short.TYPE, Short.class);
        m28502a(hashMap, hashMap2, Void.TYPE, Void.class);
        f24845a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m28502a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m28503a(Type type) {
        return f24845a.containsKey(type);
    }
}
