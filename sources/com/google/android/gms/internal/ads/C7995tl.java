package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tl */
final class C7995tl extends zzaot {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f16909f;

    private C7995tl(zzcnd zzcnd, zzcjy zzcjy) {
        this.f16909f = zzcjy;
    }

    /* renamed from: a */
    public final void mo26578a(String str) throws RemoteException {
        ((zzcla) this.f16909f.f20304c).onAdFailedToLoad(0);
    }

    /* renamed from: s */
    public final void mo26579s() throws RemoteException {
        ((zzcla) this.f16909f.f20304c).onAdLoaded();
    }
}
