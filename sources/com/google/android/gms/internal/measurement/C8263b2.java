package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.b2 */
final class C8263b2 {

    /* renamed from: c */
    private static final C8263b2 f23214c = new C8263b2();

    /* renamed from: a */
    private final C8278e2 f23215a = new C8312l1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C8273d2<?>> f23216b = new ConcurrentHashMap();

    private C8263b2() {
    }

    /* renamed from: a */
    public static C8263b2 m25892a() {
        return f23214c;
    }

    /* renamed from: a */
    public final <T> C8273d2<T> mo30064a(Class<T> cls) {
        zzuq.m26679a(cls, "messageType");
        C8273d2<T> d2Var = (C8273d2) this.f23216b.get(cls);
        if (d2Var != null) {
            return d2Var;
        }
        C8273d2<T> a = this.f23215a.mo30106a(cls);
        zzuq.m26679a(cls, "messageType");
        zzuq.m26679a(a, "schema");
        C8273d2<T> putIfAbsent = this.f23216b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: a */
    public final <T> C8273d2<T> mo30065a(T t) {
        return mo30064a(t.getClass());
    }
}
