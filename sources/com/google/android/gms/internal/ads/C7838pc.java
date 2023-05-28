package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pc */
final /* synthetic */ class C7838pc implements Runnable {

    /* renamed from: f */
    private final zzbkz f16573f;

    /* renamed from: g */
    private final Runnable f16574g;

    C7838pc(zzbkz zzbkz, Runnable runnable) {
        this.f16573f = zzbkz;
        this.f16574g = runnable;
    }

    public final void run() {
        zzbbm.f18748a.execute(new C7875qc(this.f16573f, this.f16574g));
    }
}
