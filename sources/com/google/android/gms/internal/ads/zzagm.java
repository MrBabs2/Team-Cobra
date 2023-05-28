package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

@zzard
public final class zzagm extends zzafj {

    /* renamed from: f */
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener f18085f;

    public zzagm(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f18085f = onAppInstallAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo27261a(zzaew zzaew) {
        this.f18085f.onAppInstallAdLoaded(new zzaez(zzaew));
    }
}
