package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

@zzard
public final class zzagn extends zzafm {

    /* renamed from: f */
    private final NativeContentAd.OnContentAdLoadedListener f18086f;

    public zzagn(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f18086f = onContentAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo27262a(zzafa zzafa) {
        this.f18086f.onContentAdLoaded(new zzafd(zzafa));
    }
}
