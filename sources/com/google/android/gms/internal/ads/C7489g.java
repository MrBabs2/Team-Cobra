package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.g */
final class C7489g implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzabp f15247f;

    C7489g(zzabp zzabp) {
        this.f15247f = zzabp;
    }

    public final void run() {
        if (this.f15247f.f17749f != null) {
            try {
                this.f15247f.f17749f.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbad.m20522c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
