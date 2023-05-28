package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

@zzard
public final class zzxy extends zzzq {

    /* renamed from: f */
    private final AdMetadataListener f22980f;

    public zzxy(AdMetadataListener adMetadataListener) {
        this.f22980f = adMetadataListener;
    }

    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.f22980f;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
