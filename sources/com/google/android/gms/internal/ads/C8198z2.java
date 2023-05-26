package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.z2 */
final class C8198z2 implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaoj f17511a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f17512b;

    C8198z2(zzapc zzapc, zzaoj zzaoj, zzamv zzamv) {
        this.f17511a = zzaoj;
        this.f17512b = zzamv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        try {
            this.f17511a.mo26374f(ObjectWrapper.m16391a(mediationBannerAd.getView()));
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        return new C7419e3(this.f17512b);
    }

    public final void onFailure(String str) {
        try {
            this.f17511a.mo26373a(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
