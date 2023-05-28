package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.in */
final class C7586in extends zzzq {

    /* renamed from: f */
    private final /* synthetic */ zzzp f15677f;

    /* renamed from: g */
    private final /* synthetic */ zzcqj f15678g;

    C7586in(zzcqj zzcqj, zzzp zzzp) {
        this.f15678g = zzcqj;
        this.f15677f = zzzp;
    }

    public final void onAdMetadataChanged() throws RemoteException {
        zzzp zzzp;
        if (this.f15678g.f20816n && (zzzp = this.f15677f) != null) {
            zzzp.onAdMetadataChanged();
        }
    }
}
