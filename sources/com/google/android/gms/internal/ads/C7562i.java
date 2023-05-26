package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.i */
final /* synthetic */ class C7562i implements Runnable {

    /* renamed from: f */
    private final zzaub f15550f;

    C7562i(zzaub zzaub) {
        this.f15550f = zzaub;
    }

    public final void run() {
        zzaub zzaub = this.f15550f;
        if (zzaub != null) {
            try {
                zzaub.mo27654o(1);
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }
}
