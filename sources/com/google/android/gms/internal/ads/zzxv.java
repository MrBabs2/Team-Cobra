package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzard
public final class zzxv extends zzza {

    /* renamed from: f */
    private final AdListener f22979f;

    public zzxv(AdListener adListener) {
        this.f22979f = adListener;
    }

    public final void onAdClicked() {
        this.f22979f.onAdClicked();
    }

    public final void onAdClosed() {
        this.f22979f.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.f22979f.onAdFailedToLoad(i);
    }

    public final void onAdImpression() {
        this.f22979f.onAdImpression();
    }

    public final void onAdLeftApplication() {
        this.f22979f.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.f22979f.onAdLoaded();
    }

    public final void onAdOpened() {
        this.f22979f.onAdOpened();
    }

    /* renamed from: p1 */
    public final AdListener mo29900p1() {
        return this.f22979f;
    }
}
