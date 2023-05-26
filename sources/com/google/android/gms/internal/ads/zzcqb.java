package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzcqb implements zzbro, zzbsr {

    /* renamed from: f */
    private zzaub f20783f;

    /* renamed from: a */
    public final synchronized void mo28769a(zzaub zzaub) {
        this.f20783f = zzaub;
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (this.f20783f != null) {
            try {
                this.f20783f.mo27654o(i);
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f20783f != null) {
            try {
                this.f20783f.mo27653N();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }
}
