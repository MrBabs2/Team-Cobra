package p320o.p321b;

/* renamed from: o.b.c */
/* compiled from: Preconditions */
public final class C10825c {
    /* renamed from: a */
    public static <T> T m36717a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static <T> T m36718a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T> void m36719a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }
}
