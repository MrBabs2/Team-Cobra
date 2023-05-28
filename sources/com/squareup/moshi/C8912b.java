package com.squareup.moshi;

import com.squareup.moshi.p206u.C8973c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.moshi.b */
/* compiled from: ClassFactory */
abstract class C8912b<T> {

    /* renamed from: com.squareup.moshi.b$a */
    /* compiled from: ClassFactory */
    class C8913a extends C8912b<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f25323a;

        /* renamed from: b */
        final /* synthetic */ Class f25324b;

        C8913a(Constructor constructor, Class cls) {
            this.f25323a = constructor;
            this.f25324b = cls;
        }

        /* renamed from: a */
        public T mo32833a() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.f25323a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.f25324b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.b$b */
    /* compiled from: ClassFactory */
    class C8914b extends C8912b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f25325a;

        /* renamed from: b */
        final /* synthetic */ Object f25326b;

        /* renamed from: c */
        final /* synthetic */ Class f25327c;

        C8914b(Method method, Object obj, Class cls) {
            this.f25325a = method;
            this.f25326b = obj;
            this.f25327c = cls;
        }

        /* renamed from: a */
        public T mo32833a() throws InvocationTargetException, IllegalAccessException {
            return this.f25325a.invoke(this.f25326b, new Object[]{this.f25327c});
        }

        public String toString() {
            return this.f25327c.getName();
        }
    }

    /* renamed from: com.squareup.moshi.b$c */
    /* compiled from: ClassFactory */
    class C8915c extends C8912b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f25328a;

        /* renamed from: b */
        final /* synthetic */ Class f25329b;

        /* renamed from: c */
        final /* synthetic */ int f25330c;

        C8915c(Method method, Class cls, int i) {
            this.f25328a = method;
            this.f25329b = cls;
            this.f25330c = i;
        }

        /* renamed from: a */
        public T mo32833a() throws InvocationTargetException, IllegalAccessException {
            return this.f25328a.invoke((Object) null, new Object[]{this.f25329b, Integer.valueOf(this.f25330c)});
        }

        public String toString() {
            return this.f25329b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.b$d */
    /* compiled from: ClassFactory */
    class C8916d extends C8912b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f25331a;

        /* renamed from: b */
        final /* synthetic */ Class f25332b;

        C8916d(Method method, Class cls) {
            this.f25331a = method;
            this.f25332b = cls;
        }

        /* renamed from: a */
        public T mo32833a() throws InvocationTargetException, IllegalAccessException {
            return this.f25331a.invoke((Object) null, new Object[]{this.f25332b, Object.class});
        }

        public String toString() {
            return this.f25332b.getName();
        }
    }

    C8912b() {
    }

    /* renamed from: a */
    public static <T> C8912b<T> m29313a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C8913a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C8914b(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C8915c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    C8973c.m29533a(e);
                    throw null;
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new C8916d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo32833a() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
