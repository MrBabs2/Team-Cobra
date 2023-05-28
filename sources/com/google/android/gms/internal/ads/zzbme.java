package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzbme implements zzbrl, zzbrw, zzbsr, zzxr {

    /* renamed from: f */
    private final zzcxu f19159f;

    /* renamed from: g */
    private final zzcxm f19160g;

    /* renamed from: h */
    private final zzdae f19161h;

    /* renamed from: i */
    private boolean f19162i;

    /* renamed from: j */
    private boolean f19163j;

    public zzbme(zzcxu zzcxu, zzcxm zzcxm, zzdae zzdae) {
        this.f19159f = zzcxu;
        this.f19160g = zzcxm;
        this.f19161h = zzdae;
    }

    /* renamed from: a */
    public final void mo28260a(zzasr zzasr, String str, String str2) {
        zzdae zzdae = this.f19161h;
        zzcxu zzcxu = this.f19159f;
        zzcxm zzcxm = this.f19160g;
        zzdae.mo28871a(zzcxu, zzcxm, zzcxm.f21124h, zzasr);
    }

    public final void onAdClicked() {
        zzdae zzdae = this.f19161h;
        zzcxu zzcxu = this.f19159f;
        zzcxm zzcxm = this.f19160g;
        zzdae.mo28870a(zzcxu, zzcxm, zzcxm.f21119c);
    }

    public final void onAdClosed() {
    }

    public final synchronized void onAdImpression() {
        if (!this.f19163j) {
            this.f19161h.mo28870a(this.f19159f, this.f19160g, this.f19160g.f21120d);
            this.f19163j = true;
        }
    }

    public final void onAdLeftApplication() {
    }

    public final synchronized void onAdLoaded() {
        if (this.f19162i) {
            ArrayList arrayList = new ArrayList(this.f19160g.f21120d);
            arrayList.addAll(this.f19160g.f21122f);
            this.f19161h.mo28872a(this.f19159f, this.f19160g, true, (List<String>) arrayList);
        } else {
            this.f19161h.mo28870a(this.f19159f, this.f19160g, this.f19160g.f21129m);
            this.f19161h.mo28870a(this.f19159f, this.f19160g, this.f19160g.f21122f);
        }
        this.f19162i = true;
    }

    public final void onAdOpened() {
    }

    public final void onRewardedVideoCompleted() {
        zzdae zzdae = this.f19161h;
        zzcxu zzcxu = this.f19159f;
        zzcxm zzcxm = this.f19160g;
        zzdae.mo28870a(zzcxu, zzcxm, zzcxm.f21125i);
    }

    public final void onRewardedVideoStarted() {
        zzdae zzdae = this.f19161h;
        zzcxu zzcxu = this.f19159f;
        zzcxm zzcxm = this.f19160g;
        zzdae.mo28870a(zzcxu, zzcxm, zzcxm.f21123g);
    }
}
