package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.cl */
final /* synthetic */ class C7363cl implements zzbwz {

    /* renamed from: a */
    private final zzcjy f14761a;

    /* renamed from: b */
    private final zzcjx f14762b;

    C7363cl(zzcjy zzcjy, zzcjx zzcjx) {
        this.f14761a = zzcjy;
        this.f14762b = zzcjx;
    }

    /* renamed from: a */
    public final void mo25736a(boolean z, Context context) {
        zzcjy zzcjy = this.f14761a;
        zzcjx zzcjx = this.f14762b;
        try {
            if (((zzaov) zzcjy.f20303b).mo27529l(ObjectWrapper.m16391a(context))) {
                zzcjx.mo28718a();
            } else {
                zzbad.m20523d("Cannot show interstitial.");
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Cannot show interstitial.", e);
        }
    }
}
