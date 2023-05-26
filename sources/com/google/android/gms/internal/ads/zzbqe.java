package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzbqe implements zzbrl, zzbrw, zzbsr, zzbtk, zzxr {

    /* renamed from: f */
    private final Clock f19399f;

    /* renamed from: g */
    private final zzawj f19400g;

    public zzbqe(Clock clock, zzawj zzawj) {
        this.f19399f = clock;
        this.f19400g = zzawj;
    }

    /* renamed from: a */
    public final void mo26178a(zzarx zzarx) {
    }

    /* renamed from: a */
    public final void mo28260a(zzasr zzasr, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo28396a(zzxz zzxz) {
        this.f19400g.mo27719a(zzxz);
    }

    public final void onAdClicked() {
        this.f19400g.mo27722c();
    }

    public final void onAdClosed() {
        this.f19400g.mo27723d();
    }

    public final void onAdImpression() {
        this.f19400g.mo27721b();
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdLoaded() {
        this.f19400g.mo27720a(true);
    }

    public final void onAdOpened() {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    /* renamed from: a */
    public final void mo26179a(zzcxu zzcxu) {
        this.f19400g.mo27718a(this.f19399f.mo25499c());
    }

    /* renamed from: a */
    public final String mo28395a() {
        return this.f19400g.mo27724e();
    }
}
