package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcoo implements zzf {

    /* renamed from: a */
    private final zzbri f20702a;

    /* renamed from: b */
    private final zzbrt f20703b;

    /* renamed from: c */
    private final zzbvd f20704c;

    /* renamed from: d */
    private final zzbva f20705d;

    /* renamed from: e */
    private final zzbmn f20706e;

    /* renamed from: f */
    private AtomicBoolean f20707f = new AtomicBoolean(false);

    zzcoo(zzbri zzbri, zzbrt zzbrt, zzbvd zzbvd, zzbva zzbva, zzbmn zzbmn) {
        this.f20702a = zzbri;
        this.f20703b = zzbrt;
        this.f20704c = zzbvd;
        this.f20705d = zzbva;
        this.f20706e = zzbmn;
    }

    public final synchronized void zzg(View view) {
        if (this.f20707f.compareAndSet(false, true)) {
            this.f20706e.onAdImpression();
            this.f20705d.mo28454a(view);
        }
    }

    public final void zzky() {
        if (this.f20707f.get()) {
            this.f20702a.onAdClicked();
        }
    }

    public final void zzkz() {
        if (this.f20707f.get()) {
            this.f20703b.mo28408w();
            this.f20704c.mo28456w();
        }
    }
}
