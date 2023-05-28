package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaug;

public final class RewardedAd {
    private final zzaug zzgnu;

    public RewardedAd(Context context, String str) {
        Preconditions.m16038a(context, (Object) "context cannot be null");
        Preconditions.m16038a(str, (Object) "adUnitID cannot be null");
        this.zzgnu = new zzaug(context, str);
    }

    public final Bundle getAdMetadata() {
        return this.zzgnu.mo27656a();
    }

    public final String getMediationAdapterClassName() {
        return this.zzgnu.mo27662b();
    }

    public final RewardItem getRewardItem() {
        return this.zzgnu.mo27663c();
    }

    public final boolean isLoaded() {
        return this.zzgnu.mo27664d();
    }

    public final void loadAd(AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzgnu.mo27661a(adRequest.zzde(), rewardedAdLoadCallback);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzgnu.mo27659a(onAdMetadataChangedListener);
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.zzgnu.mo27660a(serverSideVerificationOptions);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        this.zzgnu.mo27657a(activity, rewardedAdCallback);
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzgnu.mo27661a(publisherAdRequest.zzde(), rewardedAdLoadCallback);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        this.zzgnu.mo27658a(activity, rewardedAdCallback, z);
    }
}
