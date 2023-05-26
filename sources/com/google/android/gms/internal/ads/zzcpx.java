package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

public final class zzcpx extends AdMetadataListener {

    /* renamed from: a */
    private zzzp f20778a;

    /* renamed from: a */
    public final synchronized void mo28763a(zzzp zzzp) {
        this.f20778a = zzzp;
    }

    public final synchronized void onAdMetadataChanged() {
        if (this.f20778a != null) {
            try {
                this.f20778a.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdMetadataChanged.", e);
            }
        }
    }
}
