package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s7 */
final class C7944s7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f16833f;

    /* renamed from: g */
    private final /* synthetic */ int f16834g;

    /* renamed from: h */
    private final /* synthetic */ zzbcd f16835h;

    C7944s7(zzbcd zzbcd, int i, int i2) {
        this.f16835h = zzbcd;
        this.f16833f = i;
        this.f16834g = i2;
    }

    public final void run() {
        if (this.f16835h.f18774u != null) {
            this.f16835h.f18774u.mo27928a(this.f16833f, this.f16834g);
        }
    }
}
