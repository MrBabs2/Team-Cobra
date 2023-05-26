package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.f */
final class C7122f implements RewardedVideoAdListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f13397a;

    C7122f(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f13397a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f13397a.zzmi.onRewarded(this.f13397a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        this.f13397a.zzmi.onAdClosed(this.f13397a);
        InterstitialAd unused = this.f13397a.zzmh = null;
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f13397a.zzmi.onAdFailedToLoad(this.f13397a, i);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f13397a.zzmi.onAdLeftApplication(this.f13397a);
    }

    public final void onRewardedVideoAdLoaded() {
        this.f13397a.zzmi.onAdLoaded(this.f13397a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f13397a.zzmi.onAdOpened(this.f13397a);
    }

    public final void onRewardedVideoCompleted() {
        this.f13397a.zzmi.onVideoCompleted(this.f13397a);
    }

    public final void onRewardedVideoStarted() {
        this.f13397a.zzmi.onVideoStarted(this.f13397a);
    }
}
