package com.google.android.gms.internal.ads;

public final class zzdtt<T> implements zzdtu<T> {

    /* renamed from: c */
    private static final Object f21765c = new Object();

    /* renamed from: a */
    private volatile zzdtu<T> f21766a;

    /* renamed from: b */
    private volatile Object f21767b = f21765c;

    private zzdtt(zzdtu<T> zzdtu) {
        this.f21766a = zzdtu;
    }

    /* renamed from: a */
    public static <P extends zzdtu<T>, T> zzdtu<T> m24246a(P p) {
        if ((p instanceof zzdtt) || (p instanceof zzdth)) {
            return p;
        }
        zzdto.m24235a(p);
        return new zzdtt((zzdtu) p);
    }

    public final T get() {
        T t = this.f21767b;
        if (t != f21765c) {
            return t;
        }
        zzdtu<T> zzdtu = this.f21766a;
        if (zzdtu == null) {
            return this.f21767b;
        }
        T t2 = zzdtu.get();
        this.f21767b = t2;
        this.f21766a = null;
        return t2;
    }
}
