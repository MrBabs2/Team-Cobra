package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzard
public final class zzago extends zzafp {

    /* renamed from: f */
    private final NativeCustomTemplateAd.OnCustomClickListener f18087f;

    public zzago(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f18087f = onCustomClickListener;
    }

    /* renamed from: a */
    public final void mo27263a(zzafe zzafe, String str) {
        this.f18087f.onCustomClick(zzafh.m19139a(zzafe), str);
    }
}
