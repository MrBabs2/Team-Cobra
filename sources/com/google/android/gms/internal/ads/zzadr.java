package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzard
public final class zzadr extends zzadp {

    /* renamed from: f */
    private final OnCustomRenderedAdLoadedListener f18023f;

    public zzadr(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f18023f = onCustomRenderedAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo27192a(zzadl zzadl) {
        this.f18023f.onCustomRenderedAdLoaded(new zzadk(zzadl));
    }
}
