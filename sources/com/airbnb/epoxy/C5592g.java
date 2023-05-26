package com.airbnb.epoxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.airbnb.epoxy.g */
/* compiled from: ControllerHelperLookup */
class C5592g {

    /* renamed from: a */
    private static final Map<Class<?>, Constructor<?>> f9871a = new LinkedHashMap();

    /* renamed from: b */
    private static final NoOpControllerHelper f9872b = new NoOpControllerHelper();

    /* renamed from: a */
    static C5590f m10623a(C5607n nVar) {
        Constructor<?> a = m10624a(nVar.getClass());
        if (a == null) {
            return f9872b;
        }
        try {
            return (C5590f) a.newInstance(new Object[]{nVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + a, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + a, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to get Epoxy helper class.", cause);
            }
        }
    }

    /* renamed from: a */
    private static Constructor<?> m10624a(Class<?> cls) {
        Constructor<?> constructor;
        Constructor<?> constructor2 = f9871a.get(cls);
        if (constructor2 != null || f9871a.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            constructor = Class.forName(name + "_EpoxyHelper").getConstructor(new Class[]{cls});
        } catch (ClassNotFoundException unused) {
            constructor = m10624a((Class<?>) cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for " + name, e);
        }
        f9871a.put(cls, constructor);
        return constructor;
    }
}
