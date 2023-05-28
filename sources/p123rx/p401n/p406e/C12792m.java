package p123rx.p401n.p406e;

import p123rx.p126m.C5379n;

/* renamed from: rx.n.e.m */
/* compiled from: UtilityFunctions */
public final class C12792m {

    /* renamed from: rx.n.e.m$a */
    /* compiled from: UtilityFunctions */
    enum C12793a implements C5379n<Object, Boolean> {
        INSTANCE;

        public Boolean call(Object obj) {
            return true;
        }
    }

    /* renamed from: rx.n.e.m$b */
    /* compiled from: UtilityFunctions */
    enum C12794b implements C5379n<Object, Object> {
        INSTANCE;

        public Object call(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static <T> C5379n<? super T, Boolean> m41298a() {
        return C12793a.INSTANCE;
    }

    /* renamed from: b */
    public static <T> C5379n<T, T> m41299b() {
        return C12794b.INSTANCE;
    }
}
