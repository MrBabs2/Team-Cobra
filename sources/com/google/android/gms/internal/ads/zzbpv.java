package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbpv implements zzo {

    /* renamed from: f */
    private final zzbse f19388f;

    /* renamed from: g */
    private AtomicBoolean f19389g = new AtomicBoolean(false);

    public zzbpv(zzbse zzbse) {
        this.f19388f = zzbse;
    }

    /* renamed from: a */
    public final boolean mo28394a() {
        return this.f19389g.get();
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzsz() {
        this.f19389g.set(true);
        this.f19388f.mo28417w();
    }

    public final void zzta() {
        this.f19388f.mo28413D();
    }
}
