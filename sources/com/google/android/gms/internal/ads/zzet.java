package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.Callable;

public final class zzet implements Callable {

    /* renamed from: f */
    private final zzdy f21832f;

    /* renamed from: g */
    private final zzbp.zza.C12966zza f21833g;

    public zzet(zzdy zzdy, zzbp.zza.C12966zza zza) {
        this.f21832f = zzdy;
        this.f21833g = zza;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() throws Exception {
        if (this.f21832f.mo29253m() != null) {
            this.f21832f.mo29253m().get();
        }
        zzbp.zza l = this.f21832f.mo29252l();
        if (l == null) {
            return null;
        }
        try {
            synchronized (this.f21833g) {
                zzbp.zza.C12966zza zza = this.f21833g;
                byte[] g = l.mo29065g();
                zza.mo29138a(g, 0, g.length, zzdno.m23986d());
            }
            return null;
        } catch (zzdok unused) {
            return null;
        }
    }
}
