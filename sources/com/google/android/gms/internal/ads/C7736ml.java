package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ml */
final class C7736ml extends zzaoq {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f16248f;

    /* renamed from: g */
    private final /* synthetic */ zzcmg f16249g;

    private C7736ml(zzcmg zzcmg, zzcjy zzcjy) {
        this.f16249g = zzcmg;
        this.f16248f = zzcjy;
    }

    /* renamed from: a */
    public final void mo26242a(zzang zzang) throws RemoteException {
        zzang unused = this.f16249g.f20584c = zzang;
        ((zzcla) this.f16248f.f20304c).onAdLoaded();
    }

    /* renamed from: a */
    public final void mo26243a(String str) throws RemoteException {
        ((zzcla) this.f16248f.f20304c).onAdFailedToLoad(0);
    }
}
