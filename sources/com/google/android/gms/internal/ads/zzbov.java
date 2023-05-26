package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbov implements zzbsr, zzue {

    /* renamed from: f */
    private final zzcxm f19316f;

    /* renamed from: g */
    private final zzbrt f19317g;

    /* renamed from: h */
    private final AtomicBoolean f19318h = new AtomicBoolean();

    public zzbov(zzcxm zzcxm, zzbrt zzbrt) {
        this.f19316f = zzcxm;
        this.f19317g = zzbrt;
    }

    /* renamed from: j */
    private final void m21441j() {
        if (this.f19318h.compareAndSet(false, true)) {
            this.f19317g.mo28408w();
        }
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        if (this.f19316f.f21121e == 1 && zzud.f22775j) {
            m21441j();
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f19316f.f21121e != 1) {
            m21441j();
        }
    }
}
