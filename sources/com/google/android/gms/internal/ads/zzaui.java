package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

@zzard
public final class zzaui extends zzatx {

    /* renamed from: f */
    private final RewardedAdCallback f18523f;

    public zzaui(RewardedAdCallback rewardedAdCallback) {
        this.f18523f = rewardedAdCallback;
    }

    /* renamed from: O */
    public final void mo27648O() {
        RewardedAdCallback rewardedAdCallback = this.f18523f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    /* renamed from: V */
    public final void mo27649V() {
        RewardedAdCallback rewardedAdCallback = this.f18523f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    /* renamed from: a */
    public final void mo27650a(zzatq zzatq) {
        RewardedAdCallback rewardedAdCallback = this.f18523f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauh(zzatq));
        }
    }

    /* renamed from: r */
    public final void mo27651r(int i) {
        RewardedAdCallback rewardedAdCallback = this.f18523f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }
}
