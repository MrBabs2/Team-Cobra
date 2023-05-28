package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

public final class zzaaj extends zzaah {

    /* renamed from: f */
    private final MuteThisAdListener f17674f;

    public zzaaj(MuteThisAdListener muteThisAdListener) {
        this.f17674f = muteThisAdListener;
    }

    public final void onAdMuted() {
        this.f17674f.onAdMuted();
    }
}
