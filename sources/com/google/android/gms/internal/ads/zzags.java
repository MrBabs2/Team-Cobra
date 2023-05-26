package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

@zzard
public final class zzags extends zzafy {

    /* renamed from: f */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f18090f;

    public zzags(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f18090f = onUnifiedNativeAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo27266a(zzagg zzagg) {
        this.f18090f.onUnifiedNativeAdLoaded(new zzagj(zzagg));
    }
}
