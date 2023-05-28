package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

public final class zzagt extends zzage {

    /* renamed from: f */
    private final UnifiedNativeAd.UnconfirmedClickListener f18091f;

    public zzagt(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f18091f = unconfirmedClickListener;
    }

    public final void onUnconfirmedClickCancelled() {
        this.f18091f.onUnconfirmedClickCancelled();
    }

    public final void onUnconfirmedClickReceived(String str) {
        this.f18091f.onUnconfirmedClickReceived(str);
    }
}
