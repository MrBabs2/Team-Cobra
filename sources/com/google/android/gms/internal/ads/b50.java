package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

final class b50 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    private final /* synthetic */ zzvv f14552a;

    /* renamed from: b */
    private final /* synthetic */ zzbbr f14553b;

    /* renamed from: c */
    final /* synthetic */ zzwb f14554c;

    b50(zzwb zzwb, zzvv zzvv, zzbbr zzbbr) {
        this.f14554c = zzwb;
        this.f14552a = zzvv;
        this.f14553b = zzbbr;
    }

    /* renamed from: a */
    public final void mo25298a(int i) {
    }

    /* renamed from: d */
    public final void mo25299d(Bundle bundle) {
        synchronized (this.f14554c.f22865d) {
            if (!this.f14554c.f22863b) {
                boolean unused = this.f14554c.f22863b = true;
                zzvu d = this.f14554c.f22862a;
                if (d != null) {
                    this.f14553b.mo25573b(new d50(this.f14553b, zzaxg.m20259a((Runnable) new c50(this, d, this.f14552a, this.f14553b))), zzbbm.f18749b);
                }
            }
        }
    }
}
