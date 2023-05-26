package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* renamed from: com.google.android.gms.internal.ads.b3 */
final class C7308b3 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaos f14540a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f14541b;

    /* renamed from: c */
    private final /* synthetic */ zzapc f14542c;

    C7308b3(zzapc zzapc, zzaos zzaos, zzamv zzamv) {
        this.f14542c = zzapc;
        this.f14540a = zzaos;
        this.f14541b = zzamv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            MediationRewardedAd unused = this.f14542c.f18244h = mediationRewardedAd;
            this.f14540a.mo26579s();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        return new C7419e3(this.f14541b);
    }

    public final void onFailure(String str) {
        try {
            this.f14540a.mo26578a(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
