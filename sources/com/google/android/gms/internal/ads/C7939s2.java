package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* renamed from: com.google.android.gms.internal.ads.s2 */
final class C7939s2 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzamv f16819a;

    /* renamed from: b */
    private final /* synthetic */ Adapter f16820b;

    /* renamed from: c */
    private final /* synthetic */ zzanl f16821c;

    C7939s2(zzanl zzanl, zzamv zzamv, Adapter adapter) {
        this.f16821c = zzanl;
        this.f16819a = zzamv;
        this.f16820b = adapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            MediationRewardedAd unused = this.f16821c.f18219j = mediationRewardedAd;
            this.f16819a.onAdLoaded();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        return new zzauo(this.f16819a);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.f16820b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded medation ad: ");
            sb.append(str);
            zzbad.m20516a(sb.toString());
            this.f16819a.onAdFailedToLoad(0);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
