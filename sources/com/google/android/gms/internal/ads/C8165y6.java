package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.y6 */
final /* synthetic */ class C8165y6 implements Runnable {

    /* renamed from: f */
    private final zzbbc f17273f;

    /* renamed from: g */
    private final AtomicInteger f17274g;

    C8165y6(zzbbc zzbbc, AtomicInteger atomicInteger) {
        this.f17273f = zzbbc;
        this.f17274g = atomicInteger;
    }

    public final void run() {
        this.f17273f.mo27901a(this.f17274g);
    }
}
