package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.f */
final class C7452f implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C7415e f15171f;

    C7452f(C7415e eVar) {
        this.f15171f = eVar;
    }

    public final void run() {
        if (this.f15171f.f15038f.f17748f != null) {
            try {
                this.f15171f.f15038f.f17748f.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbad.m20522c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
