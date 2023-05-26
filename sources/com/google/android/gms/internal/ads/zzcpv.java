package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzcpv implements zzxr {

    /* renamed from: f */
    private zzyw f20776f;

    /* renamed from: a */
    public final synchronized void mo28760a(zzyw zzyw) {
        this.f20776f = zzyw;
    }

    public final synchronized void onAdClicked() {
        if (this.f20776f != null) {
            try {
                this.f20776f.onAdClicked();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
