package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;

/* renamed from: com.google.android.gms.internal.ads.qy */
final class C7897qy implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f16689f;

    /* renamed from: g */
    private final /* synthetic */ boolean f16690g;

    /* renamed from: h */
    private final /* synthetic */ zzdy f16691h;

    C7897qy(zzdy zzdy, int i, boolean z) {
        this.f16691h = zzdy;
        this.f16689f = i;
        this.f16690g = z;
    }

    public final void run() {
        zzbp.zza b = this.f16691h.mo29241b(this.f16689f, this.f16690g);
        zzbp.zza unused = this.f16691h.f21784j = b;
        if (zzdy.m24260a(this.f16689f, b)) {
            this.f16691h.mo29239a(this.f16689f + 1, this.f16690g);
        }
    }
}
