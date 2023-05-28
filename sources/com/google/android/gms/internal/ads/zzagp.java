package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzard
public final class zzagp extends zzafs {

    /* renamed from: f */
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f18088f;

    public zzagp(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.f18088f = onCustomTemplateAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo27264a(zzafe zzafe) {
        this.f18088f.onCustomTemplateAdLoaded(zzafh.m19139a(zzafe));
    }
}
