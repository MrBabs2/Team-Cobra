package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.iw */
final class C7595iw {

    /* renamed from: c */
    private static final C7595iw f15683c = new C7595iw();

    /* renamed from: a */
    private final C7821ow f15684a = new C7894qv();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C7784nw<?>> f15685b = new ConcurrentHashMap();

    private C7595iw() {
    }

    /* renamed from: a */
    public static C7595iw m17197a() {
        return f15683c;
    }

    /* renamed from: a */
    public final <T> C7784nw<T> mo26088a(Class<T> cls) {
        zzdod.m24036a(cls, "messageType");
        C7784nw<T> nwVar = (C7784nw) this.f15685b.get(cls);
        if (nwVar != null) {
            return nwVar;
        }
        C7784nw<T> a = this.f15684a.mo26378a(cls);
        zzdod.m24036a(cls, "messageType");
        zzdod.m24036a(a, "schema");
        C7784nw<T> putIfAbsent = this.f15685b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: a */
    public final <T> C7784nw<T> mo26089a(T t) {
        return mo26088a(t.getClass());
    }
}
