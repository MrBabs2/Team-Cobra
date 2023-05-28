package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ym */
final /* synthetic */ class C8181ym implements zzbro {

    /* renamed from: f */
    private final zzcpw f17479f;

    /* renamed from: g */
    private final zzaje f17480g;

    C8181ym(zzcpw zzcpw, zzaje zzaje) {
        this.f17479f = zzcpw;
        this.f17480g = zzaje;
    }

    public final void onAdFailedToLoad(int i) {
        zzcpw zzcpw = this.f17479f;
        zzaje zzaje = this.f17480g;
        zzcpw.onAdFailedToLoad(i);
        if (zzaje != null) {
            try {
                zzaje.mo27335k(i);
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }
}
