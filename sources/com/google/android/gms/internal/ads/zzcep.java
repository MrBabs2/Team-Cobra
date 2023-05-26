package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwl;

public final class zzcep implements zzbro, zzbrw, zzbsr, zzbtk, zzxr {

    /* renamed from: f */
    private final zzwj f20074f;

    /* renamed from: g */
    private boolean f20075g = false;

    public zzcep(zzwj zzwj) {
        this.f20074f = zzwj;
        zzwj.mo29859a(zzwl.zza.zzb.AD_REQUEST);
    }

    /* renamed from: a */
    public final void mo26178a(zzarx zzarx) {
    }

    /* renamed from: a */
    public final void mo26179a(zzcxu zzcxu) {
        this.f20074f.mo29858a((zzwk) new C7507gi(zzcxu));
    }

    public final synchronized void onAdClicked() {
        if (!this.f20075g) {
            this.f20074f.mo29859a(zzwl.zza.zzb.AD_FIRST_CLICK);
            this.f20075g = true;
            return;
        }
        this.f20074f.mo29859a(zzwl.zza.zzb.AD_SUBSEQUENT_CLICK);
    }

    public final void onAdFailedToLoad(int i) {
        switch (i) {
            case 1:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.f20074f.mo29859a(zzwl.zza.zzb.AD_FAILED_TO_LOAD);
                return;
        }
    }

    public final synchronized void onAdImpression() {
        this.f20074f.mo29859a(zzwl.zza.zzb.AD_IMPRESSION);
    }

    public final void onAdLoaded() {
        this.f20074f.mo29859a(zzwl.zza.zzb.AD_LOADED);
    }
}
