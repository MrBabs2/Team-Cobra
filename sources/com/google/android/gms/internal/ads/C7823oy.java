package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oy */
final class C7823oy implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzr f16515f;

    /* renamed from: g */
    private final /* synthetic */ zzd f16516g;

    C7823oy(zzd zzd, zzr zzr) {
        this.f16516g = zzd;
        this.f16515f = zzr;
    }

    public final void run() {
        try {
            this.f16516g.f21271g.put(this.f16515f);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
