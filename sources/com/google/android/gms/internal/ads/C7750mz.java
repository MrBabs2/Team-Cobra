package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.mz */
final class C7750mz implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Surface f16261f;

    /* renamed from: g */
    private final /* synthetic */ zzhd f16262g;

    C7750mz(zzhd zzhd, Surface surface) {
        this.f16262g = zzhd;
        this.f16261f = surface;
    }

    public final void run() {
        this.f16262g.f21930G.mo26167a(this.f16261f);
    }
}
