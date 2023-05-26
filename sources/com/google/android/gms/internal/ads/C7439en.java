package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.en */
final class C7439en extends zzaap {

    /* renamed from: f */
    private final /* synthetic */ zzaao f15160f;

    /* renamed from: g */
    private final /* synthetic */ zzcqf f15161g;

    C7439en(zzcqf zzcqf, zzaao zzaao) {
        this.f15161g = zzcqf;
        this.f15160f = zzaao;
    }

    public final void onAdMetadataChanged() throws RemoteException {
        zzaao zzaao;
        if (this.f15161g.f20806o && (zzaao = this.f15160f) != null) {
            zzaao.onAdMetadataChanged();
        }
    }
}
