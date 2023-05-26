package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzaup extends zzatr {

    /* renamed from: f */
    private final String f18528f;

    /* renamed from: g */
    private final int f18529g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzaup(zzato zzato) {
        this(zzato != null ? zzato.f18518f : "", zzato != null ? zzato.f18519g : 1);
    }

    public final int getAmount() throws RemoteException {
        return this.f18529g;
    }

    public final String getType() throws RemoteException {
        return this.f18528f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzaup(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzaup(String str, int i) {
        this.f18528f = str;
        this.f18529g = i;
    }
}
