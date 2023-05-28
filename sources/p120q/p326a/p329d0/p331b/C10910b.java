package p120q.p326a.p329d0.p331b;

import p120q.p326a.p328c0.C10850d;

/* renamed from: q.a.d0.b.b */
/* compiled from: ObjectHelper */
public final class C10910b {

    /* renamed from: a */
    static final C10850d<Object, Object> f28971a = new C10911a();

    /* renamed from: q.a.d0.b.b$a */
    /* compiled from: ObjectHelper */
    static final class C10911a implements C10850d<Object, Object> {
        C10911a() {
        }

        /* renamed from: a */
        public boolean mo36653a(Object obj, Object obj2) {
            return C10910b.m36863a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m36857a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m36859a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m36861a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m36863a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static <T> C10850d<T, T> m36862a() {
        return f28971a;
    }

    /* renamed from: a */
    public static int m36858a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    /* renamed from: a */
    public static long m36860a(long j, String str) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
