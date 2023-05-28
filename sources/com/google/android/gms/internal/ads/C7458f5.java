package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.f5 */
final class C7458f5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f15186f;

    /* renamed from: g */
    private final /* synthetic */ zzaxi f15187g;

    C7458f5(zzaxi zzaxi, Context context) {
        this.f15187g = zzaxi;
        this.f15186f = context;
    }

    public final void run() {
        synchronized (this.f15187g.f18655d) {
            String unused = this.f15187g.f18656e = zzaxi.m20291c(this.f15186f);
            this.f15187g.f18655d.notifyAll();
        }
    }
}
