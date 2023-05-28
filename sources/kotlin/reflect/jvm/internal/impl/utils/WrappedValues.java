package kotlin.reflect.jvm.internal.impl.utils;

import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

public class WrappedValues {

    /* renamed from: a */
    private static final Object f31901a = new C12139a();

    /* renamed from: b */
    public static volatile boolean f31902b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    static class C12139a {
        C12139a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    private static final class C12140b {

        /* renamed from: a */
        private final Throwable f31903a;

        /* synthetic */ C12140b(Throwable th, C12139a aVar) {
            this(th);
        }

        /* renamed from: a */
        private static /* synthetic */ void m40128a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: a */
        public Throwable mo38753a() {
            Throwable th = this.f31903a;
            if (th != null) {
                return th;
            }
            m40128a(1);
            throw null;
        }

        public String toString() {
            return this.f31903a.toString();
        }

        private C12140b(Throwable th) {
            if (th != null) {
                this.f31903a = th;
            } else {
                m40128a(0);
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static <V> Object m40122a(V v) {
        if (v == null) {
            Object obj = f31901a;
            if (obj != null) {
                return obj;
            }
            m40124a(1);
            throw null;
        } else if (v != null) {
            return v;
        } else {
            m40124a(2);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m40124a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = DonationsAnalytics.VALUE;
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static <V> V m40125b(Object obj) {
        if (obj != null) {
            m40127d(obj);
            return m40126c(obj);
        }
        m40124a(4);
        throw null;
    }

    /* renamed from: c */
    public static <V> V m40126c(Object obj) {
        if (obj == null) {
            m40124a(0);
            throw null;
        } else if (obj == f31901a) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: d */
    public static <V> V m40127d(Object obj) {
        if (!(obj instanceof C12140b)) {
            return obj;
        }
        Throwable a = ((C12140b) obj).mo38753a();
        if (!f31902b || !C12149c.m40153a(a)) {
            C12149c.m40154b(a);
            throw null;
        }
        throw new WrappedProcessCanceledException(a);
    }

    /* renamed from: a */
    public static Object m40123a(Throwable th) {
        if (th != null) {
            return new C12140b(th, (C12139a) null);
        }
        m40124a(3);
        throw null;
    }
}
