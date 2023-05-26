package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.ads.ok */
final class C7809ok extends zzaok {

    /* renamed from: f */
    private zzcjy<zzaov, zzcla> f16498f;

    /* renamed from: g */
    private final /* synthetic */ zzckm f16499g;

    private C7809ok(zzckm zzckm, zzcjy zzcjy) {
        this.f16499g = zzckm;
        this.f16498f = zzcjy;
    }

    /* renamed from: a */
    public final void mo26373a(String str) throws RemoteException {
        ((zzcla) this.f16498f.f20304c).onAdFailedToLoad(0);
    }

    /* renamed from: f */
    public final void mo26374f(IObjectWrapper iObjectWrapper) throws RemoteException {
        View unused = this.f16499g.f20325c = (View) ObjectWrapper.m16390H(iObjectWrapper);
        ((zzcla) this.f16498f.f20304c).onAdLoaded();
    }
}
