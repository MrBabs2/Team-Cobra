package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.oe */
final class C7803oe implements Runnable {

    /* renamed from: f */
    private final WeakReference<zzbtb> f16488f;

    private C7803oe(zzbtb zzbtb) {
        this.f16488f = new WeakReference<>(zzbtb);
    }

    public final void run() {
        zzbtb zzbtb = (zzbtb) this.f16488f.get();
        if (zzbtb != null) {
            zzbtb.m21861y();
        }
    }
}
