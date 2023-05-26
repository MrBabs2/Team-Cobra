package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.kn */
final class C7664kn implements zzban<zzcrc> {

    /* renamed from: a */
    private final /* synthetic */ zzavy f16014a;

    C7664kn(zzcqq zzcqq, zzavy zzavy) {
        this.f16014a = zzavy;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        try {
            this.f16014a.onError("Internal error.");
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        zzcrc zzcrc = (zzcrc) obj;
        try {
            this.f16014a.mo27703c(zzcrc.f20833a, zzcrc.f20834b);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
