package p123rx.exceptions;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import p123rx.p411q.C12863f;

/* renamed from: rx.exceptions.OnErrorThrowable */
public final class OnErrorThrowable extends RuntimeException {

    /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue */
    public static class OnNextValue extends RuntimeException {

        /* renamed from: f */
        private final Object f32230f;

        /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$a */
        static final class C12471a {

            /* renamed from: a */
            static final Set<Class<?>> f32231a = m40936a();

            /* renamed from: a */
            private static Set<Class<?>> m40936a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + m40934a(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.f32230f = obj;
        }

        /* renamed from: a */
        public Object mo40653a() {
            return this.f32230f;
        }

        /* renamed from: a */
        static String m40934a(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (C12471a.f32231a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String a = C12863f.m41441f().mo41069b().mo41045a(obj);
            if (a != null) {
                return a;
            }
            return obj.getClass().getName() + ".class";
        }
    }

    /* renamed from: a */
    public static Throwable m40933a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable a = C12472a.m40937a(th);
        if ((a instanceof OnNextValue) && ((OnNextValue) a).mo40653a() == obj) {
            return th;
        }
        C12472a.m40938a(th, (Throwable) new OnNextValue(obj));
        return th;
    }
}
