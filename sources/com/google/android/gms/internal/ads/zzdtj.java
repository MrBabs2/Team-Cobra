package com.google.android.gms.internal.ads;

public final class zzdtj<T> implements zzdte<T>, zzdti<T> {

    /* renamed from: a */
    private final T f21757a;

    static {
        new zzdtj((Object) null);
    }

    private zzdtj(T t) {
        this.f21757a = t;
    }

    /* renamed from: a */
    public static <T> zzdti<T> m24231a(T t) {
        zzdto.m24236a(t, "instance cannot be null");
        return new zzdtj(t);
    }

    public final T get() {
        return this.f21757a;
    }
}
