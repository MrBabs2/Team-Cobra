package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bl */
final /* synthetic */ class C7326bl implements zzbwz {

    /* renamed from: a */
    private final zzcjy f14649a;

    C7326bl(zzcjy zzcjy) {
        this.f14649a = zzcjy;
    }

    /* renamed from: a */
    public final void mo25736a(boolean z, Context context) {
        zzcjy zzcjy = this.f14649a;
        try {
            ((zzams) zzcjy.f20303b).setImmersiveMode(z);
            ((zzams) zzcjy.f20303b).showInterstitial();
        } catch (RemoteException unused) {
            zzbad.m20521c("Cannot show interstitial.");
        }
    }
}
