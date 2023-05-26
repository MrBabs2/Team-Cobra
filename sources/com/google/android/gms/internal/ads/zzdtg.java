package com.google.android.gms.internal.ads;

public final class zzdtg<T> implements zzdti<T> {

    /* renamed from: a */
    private zzdtu<T> f21753a;

    /* renamed from: a */
    public static <T> void m24228a(zzdtu<T> zzdtu, zzdtu<T> zzdtu2) {
        zzdto.m24235a(zzdtu2);
        zzdtg zzdtg = (zzdtg) zzdtu;
        if (zzdtg.f21753a == null) {
            zzdtg.f21753a = zzdtu2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T get() {
        zzdtu<T> zzdtu = this.f21753a;
        if (zzdtu != null) {
            return zzdtu.get();
        }
        throw new IllegalStateException();
    }
}
