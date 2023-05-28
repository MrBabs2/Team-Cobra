package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.e */
final class C7415e extends zzzd {

    /* renamed from: f */
    final /* synthetic */ zzabl f15038f;

    private C7415e(zzabl zzabl) {
        this.f15038f = zzabl;
    }

    /* renamed from: a */
    public final void mo25847a(zzxz zzxz) throws RemoteException {
        mo25848a(zzxz, 1);
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    /* renamed from: v */
    public final String mo25850v() throws RemoteException {
        return null;
    }

    /* renamed from: y */
    public final boolean mo25851y() throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final void mo25848a(zzxz zzxz, int i) throws RemoteException {
        zzbad.m20519b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.f18727b.post(new C7452f(this));
    }
}
