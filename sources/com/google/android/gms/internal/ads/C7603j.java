package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.j */
final class C7603j implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzabx f15698f;

    C7603j(zzabx zzabx) {
        this.f15698f = zzabx;
    }

    public final void run() {
        if (this.f15698f.f17751f != null) {
            try {
                this.f15698f.f17751f.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbad.m20522c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
