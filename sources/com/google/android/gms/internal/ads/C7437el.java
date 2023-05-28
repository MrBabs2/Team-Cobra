package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.el */
final class C7437el extends zzaon {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f15155f;

    private C7437el(zzclq zzclq, zzcjy zzcjy) {
        this.f15155f = zzcjy;
    }

    /* renamed from: a */
    public final void mo25873a(String str) throws RemoteException {
        ((zzcla) this.f15155f.f20304c).onAdFailedToLoad(0);
    }

    /* renamed from: s */
    public final void mo25874s() throws RemoteException {
        ((zzcla) this.f15155f.f20304c).onAdLoaded();
    }
}
