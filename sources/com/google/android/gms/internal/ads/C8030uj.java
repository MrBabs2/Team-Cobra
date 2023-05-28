package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.uj */
final class C8030uj implements zzban<ParcelFileDescriptor> {

    /* renamed from: a */
    private final /* synthetic */ zzarr f16959a;

    C8030uj(zzcig zzcig, zzarr zzarr) {
        this.f16959a = zzarr;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        try {
            this.f16959a.mo27592a(zzaym.m20408a(th, zzcgm.m22526a(th)));
        } catch (RemoteException e) {
            zzawz.m20168e("Service can't call client", e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        try {
            this.f16959a.mo27591a((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zzawz.m20168e("Service can't call client", e);
        }
    }
}
