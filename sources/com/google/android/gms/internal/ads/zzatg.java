package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzard
public final class zzatg extends zzatc {

    /* renamed from: f */
    private RewardedVideoAdListener f18508f;

    public zzatg(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f18508f = rewardedVideoAdListener;
    }

    /* renamed from: a */
    public final void mo27627a(zzasr zzasr) {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewarded(new zzate(zzasr));
        }
    }

    public final void onRewardedVideoAdClosed() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdClosed();
        }
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public final void onRewardedVideoAdLeftApplication() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLeftApplication();
        }
    }

    public final void onRewardedVideoAdLoaded() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLoaded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdOpened();
        }
    }

    public final void onRewardedVideoCompleted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoCompleted();
        }
    }

    public final void onRewardedVideoStarted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f18508f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoStarted();
        }
    }

    /* renamed from: p1 */
    public final RewardedVideoAdListener mo27637p1() {
        return this.f18508f;
    }

    /* renamed from: a */
    public final void mo27636a(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f18508f = rewardedVideoAdListener;
    }
}
