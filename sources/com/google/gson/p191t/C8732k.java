package com.google.gson.p191t;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.t.k */
/* compiled from: UnsafeAllocator */
public abstract class C8732k {

    /* renamed from: com.google.gson.t.k$a */
    /* compiled from: UnsafeAllocator */
    static class C8733a extends C8732k {

        /* renamed from: a */
        final /* synthetic */ Method f24849a;

        /* renamed from: b */
        final /* synthetic */ Object f24850b;

        C8733a(Method method, Object obj) {
            this.f24849a = method;
            this.f24850b = obj;
        }

        /* renamed from: a */
        public <T> T mo32474a(Class<T> cls) throws Exception {
            C8732k.m28508b(cls);
            return this.f24849a.invoke(this.f24850b, new Object[]{cls});
        }
    }

    /* renamed from: com.google.gson.t.k$b */
    /* compiled from: UnsafeAllocator */
    static class C8734b extends C8732k {

        /* renamed from: a */
        final /* synthetic */ Method f24851a;

        /* renamed from: b */
        final /* synthetic */ int f24852b;

        C8734b(Method method, int i) {
            this.f24851a = method;
            this.f24852b = i;
        }

        /* renamed from: a */
        public <T> T mo32474a(Class<T> cls) throws Exception {
            C8732k.m28508b(cls);
            return this.f24851a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f24852b)});
        }
    }

    /* renamed from: com.google.gson.t.k$c */
    /* compiled from: UnsafeAllocator */
    static class C8735c extends C8732k {

        /* renamed from: a */
        final /* synthetic */ Method f24853a;

        C8735c(Method method) {
            this.f24853a = method;
        }

        /* renamed from: a */
        public <T> T mo32474a(Class<T> cls) throws Exception {
            C8732k.m28508b(cls);
            return this.f24853a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.google.gson.t.k$d */
    /* compiled from: UnsafeAllocator */
    static class C8736d extends C8732k {
        C8736d() {
        }

        /* renamed from: a */
        public <T> T mo32474a(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    public static C8732k m28507a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C8733a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C8734b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C8735c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C8736d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m28508b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo32474a(Class<T> cls) throws Exception;
}
