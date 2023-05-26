package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

@zzard
public final class zzaul extends zzauc {

    /* renamed from: f */
    private final RewardedAdLoadCallback f18524f;

    public zzaul(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.f18524f = rewardedAdLoadCallback;
    }

    /* renamed from: N */
    public final void mo27653N() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f18524f;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }

    /* renamed from: o */
    public final void mo27654o(int i) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f18524f;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i);
        }
    }
}
