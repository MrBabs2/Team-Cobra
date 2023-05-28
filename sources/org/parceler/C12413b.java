package org.parceler;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/* renamed from: org.parceler.b */
/* compiled from: InjectionUtil */
public final class C12413b {

    /* renamed from: org.parceler.b$b */
    /* compiled from: InjectionUtil */
    private static abstract class C12415b<T, E extends AccessibleObject> implements PrivilegedExceptionAction<T> {

        /* renamed from: a */
        private final E f32190a;

        protected C12415b(E e) {
            this.f32190a = e;
        }

        /* renamed from: a */
        public abstract T mo40467a(E e) throws Exception;

        public T run() throws Exception {
            boolean isAccessible = this.f32190a.isAccessible();
            this.f32190a.setAccessible(true);
            T a = mo40467a(this.f32190a);
            this.f32190a.setAccessible(isAccessible);
            return a;
        }
    }

    /* renamed from: org.parceler.b$c */
    /* compiled from: InjectionUtil */
    private static final class C12416c<T> extends C12415b<T, Field> {

        /* renamed from: b */
        private final Object f32191b;

        private C12416c(Field field, Object obj) {
            super(field);
            this.f32191b = obj;
        }

        /* renamed from: a */
        public T mo40467a(Field field) throws IllegalAccessException {
            return field.get(this.f32191b);
        }
    }

    /* renamed from: org.parceler.b$d */
    /* compiled from: InjectionUtil */
    private static final class C12417d extends C12415b<Void, Field> {

        /* renamed from: b */
        private final Object f32192b;

        /* renamed from: c */
        private final Object f32193c;

        private C12417d(Field field, Object obj, Object obj2) {
            super(field);
            this.f32192b = obj;
            this.f32193c = obj2;
        }

        /* renamed from: a */
        public Void mo40467a(Field field) throws IllegalAccessException {
            field.set(this.f32192b, this.f32193c);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m40835a(Class<T> cls, Class<?> cls2, Object obj, String str) {
        try {
            return AccessController.doPrivileged(new C12416c(cls2.getDeclaredField(str), obj));
        } catch (NoSuchFieldException e) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e);
        } catch (PrivilegedActionException e2) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e2);
        } catch (Exception e3) {
            throw new ParcelerRuntimeException("Exception during field injection", e3);
        }
    }

    /* renamed from: a */
    public static void m40836a(Class<?> cls, Object obj, String str, Object obj2) {
        try {
            AccessController.doPrivileged(new C12417d(cls.getDeclaredField(str), obj, obj2));
        } catch (NoSuchFieldException e) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e);
        } catch (PrivilegedActionException e2) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e2);
        } catch (Exception e3) {
            throw new ParcelerRuntimeException("Exception during field injection", e3);
        }
    }
}
