package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

public final class zzcpz extends AdMetadataListener {

    /* renamed from: a */
    private zzaao f20780a;

    /* renamed from: a */
    public final synchronized void mo28766a(zzaao zzaao) {
        this.f20780a = zzaao;
    }

    public final synchronized void onAdMetadataChanged() {
        if (this.f20780a != null) {
            try {
                this.f20780a.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }
}
