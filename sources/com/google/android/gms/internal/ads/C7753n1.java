package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1 */
final /* synthetic */ class C7753n1 implements Runnable {

    /* renamed from: f */
    private final zzajw f16269f;

    private C7753n1(zzajw zzajw) {
        this.f16269f = zzajw;
    }

    /* renamed from: a */
    static Runnable m17665a(zzajw zzajw) {
        return new C7753n1(zzajw);
    }

    public final void run() {
        this.f16269f.destroy();
    }
}
