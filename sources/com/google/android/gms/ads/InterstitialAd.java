package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabd;
import com.google.android.gms.internal.ads.zzxr;

public final class InterstitialAd {
    private final zzabd zzaas;

    public InterstitialAd(Context context) {
        this.zzaas = new zzabd(context);
        Preconditions.m16038a(context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzaas.mo27017a();
    }

    public final Bundle getAdMetadata() {
        return this.zzaas.mo27028b();
    }

    public final String getAdUnitId() {
        return this.zzaas.mo27030c();
    }

    public final String getMediationAdapterClassName() {
        return this.zzaas.mo27032e();
    }

    public final boolean isLoaded() {
        return this.zzaas.mo27034g();
    }

    public final boolean isLoading() {
        return this.zzaas.mo27035h();
    }

    public final void loadAd(AdRequest adRequest) {
        this.zzaas.mo27024a(adRequest.zzde());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzaas.mo27018a(adListener);
        if (adListener != null && (adListener instanceof zzxr)) {
            this.zzaas.mo27025a((zzxr) adListener);
        } else if (adListener == null) {
            this.zzaas.mo27025a((zzxr) null);
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.zzaas.mo27022a(adMetadataListener);
    }

    public final void setAdUnitId(String str) {
        this.zzaas.mo27026a(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzaas.mo27027a(z);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzaas.mo27023a(rewardedVideoAdListener);
    }

    public final void show() {
        this.zzaas.mo27036i();
    }

    public final void zzc(boolean z) {
        this.zzaas.mo27029b(true);
    }
}
