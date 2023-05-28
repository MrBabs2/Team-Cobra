package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* renamed from: com.google.android.gms.internal.ads.d3 */
final class C7382d3 implements SignalCallbacks {

    /* renamed from: a */
    private final /* synthetic */ zzaoy f14808a;

    C7382d3(zzapc zzapc, zzaoy zzaoy) {
        this.f14808a = zzaoy;
    }

    public final void onFailure(String str) {
        try {
            this.f14808a.onFailure(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.f14808a.mo27532h(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
