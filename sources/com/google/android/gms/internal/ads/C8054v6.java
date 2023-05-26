package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.v6 */
final /* synthetic */ class C8054v6 implements Runnable {

    /* renamed from: f */
    private final zzbbr f17005f;

    /* renamed from: g */
    private final zzbbh f17006g;

    /* renamed from: h */
    private final Class f17007h;

    /* renamed from: i */
    private final zzbal f17008i;

    /* renamed from: j */
    private final Executor f17009j;

    C8054v6(zzbbr zzbbr, zzbbh zzbbh, Class cls, zzbal zzbal, Executor executor) {
        this.f17005f = zzbbr;
        this.f17006g = zzbbh;
        this.f17007h = cls;
        this.f17008i = zzbal;
        this.f17009j = executor;
    }

    public final void run() {
        zzbar.m20550a(this.f17005f, this.f17006g, this.f17007h, this.f17008i, this.f17009j);
    }
}
