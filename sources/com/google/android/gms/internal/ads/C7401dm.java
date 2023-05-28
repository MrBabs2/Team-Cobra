package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dm */
final /* synthetic */ class C7401dm implements zzbwz {

    /* renamed from: a */
    private final zzcjy f15018a;

    C7401dm(zzcjy zzcjy) {
        this.f15018a = zzcjy;
    }

    /* renamed from: a */
    public final void mo25736a(boolean z, Context context) {
        zzcjy zzcjy = this.f15018a;
        try {
            ((zzams) zzcjy.f20303b).setImmersiveMode(z);
            ((zzams) zzcjy.f20303b).showVideo();
        } catch (RemoteException e) {
            zzbad.m20522c("Cannot show rewarded video.", e);
        }
    }
}
