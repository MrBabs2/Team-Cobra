package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzard
public class zzyv extends AdListener {

    /* renamed from: a */
    private final Object f23048a = new Object();

    /* renamed from: b */
    private AdListener f23049b;

    /* renamed from: a */
    public final void mo29922a(AdListener adListener) {
        synchronized (this.f23048a) {
            this.f23049b = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.f23048a) {
            if (this.f23049b != null) {
                this.f23049b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f23048a) {
            if (this.f23049b != null) {
                this.f23049b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f23048a) {
            if (this.f23049b != null) {
                this.f23049b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f23048a) {
            if (this.f23049b != null) {
                this.f23049b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f23048a) {
            if (this.f23049b != null) {
                this.f23049b.onAdOpened();
            }
        }
    }
}
