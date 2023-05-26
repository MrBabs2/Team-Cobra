package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.j */
/* compiled from: Intrinsics */
public class C10202j {
    private C10202j() {
    }

    /* renamed from: a */
    public static int m34168a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static String m34169a(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: b */
    public static void m34178b(Object obj, String str) {
        if (obj == null) {
            m34175a(str);
            throw null;
        }
    }

    /* renamed from: c */
    public static void m34180c(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(str);
        m34170a(uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }

    /* renamed from: d */
    public static void m34181d(String str) {
        m34180c("lateinit property " + str + " has not been initialized");
        throw null;
    }

    /* renamed from: a */
    public static void m34172a() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        m34170a(kotlinNullPointerException);
        throw kotlinNullPointerException;
    }

    /* renamed from: b */
    public static void m34177b() {
        m34179b("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        throw null;
    }

    /* renamed from: a */
    public static void m34174a(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            m34170a(illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: b */
    public static void m34179b(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: a */
    private static void m34175a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
        m34170a(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public static boolean m34176a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m34173a(int i, String str) {
        m34177b();
        throw null;
    }

    /* renamed from: a */
    private static <T extends Throwable> T m34170a(T t) {
        m34171a(t, C10202j.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T m34171a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
