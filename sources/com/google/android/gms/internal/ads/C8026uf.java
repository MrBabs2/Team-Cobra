package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uf */
final /* synthetic */ class C8026uf implements Runnable {

    /* renamed from: f */
    private final zzbzb f16954f;

    private C8026uf(zzbzb zzbzb) {
        this.f16954f = zzbzb;
    }

    /* renamed from: a */
    static Runnable m18286a(zzbzb zzbzb) {
        return new C8026uf(zzbzb);
    }

    public final void run() {
        this.f16954f.mo28472a();
    }
}
