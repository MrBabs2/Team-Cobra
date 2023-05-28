package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* renamed from: com.google.android.gms.internal.ads.c3 */
final class C7345c3 implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaop f14695a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f14696b;

    C7345c3(zzapc zzapc, zzaop zzaop, zzamv zzamv) {
        this.f14695a = zzaop;
        this.f14696b = zzamv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        try {
            this.f14695a.mo26242a((zzang) new zzaoi(unifiedNativeAdMapper));
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        return new C7419e3(this.f14696b);
    }

    public final void onFailure(String str) {
        try {
            this.f14695a.mo26243a(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
