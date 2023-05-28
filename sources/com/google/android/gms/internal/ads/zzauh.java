package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

@zzard
public final class zzauh implements RewardItem {

    /* renamed from: a */
    private final zzatq f18522a;

    public zzauh(zzatq zzatq) {
        this.f18522a = zzatq;
    }

    public final int getAmount() {
        zzatq zzatq = this.f18522a;
        if (zzatq == null) {
            return 0;
        }
        try {
            return zzatq.getAmount();
        } catch (RemoteException e) {
            zzbad.m20522c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    public final String getType() {
        zzatq zzatq = this.f18522a;
        if (zzatq == null) {
            return null;
        }
        try {
            return zzatq.getType();
        } catch (RemoteException e) {
            zzbad.m20522c("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
