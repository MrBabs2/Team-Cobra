package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* renamed from: com.google.android.gms.internal.ads.a3 */
final class C7271a3 implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaom f14397a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f14398b;

    /* renamed from: c */
    private final /* synthetic */ zzapc f14399c;

    C7271a3(zzapc zzapc, zzaom zzaom, zzamv zzamv) {
        this.f14399c = zzapc;
        this.f14397a = zzaom;
        this.f14398b = zzamv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        try {
            MediationInterstitialAd unused = this.f14399c.f18243g = mediationInterstitialAd;
            this.f14397a.mo25874s();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        return new C7419e3(this.f14398b);
    }

    public final void onFailure(String str) {
        try {
            this.f14397a.mo25873a(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
