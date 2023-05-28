package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r1 */
final /* synthetic */ class C7901r1 implements Runnable {

    /* renamed from: f */
    private final zzajw f16732f;

    private C7901r1(zzajw zzajw) {
        this.f16732f = zzajw;
    }

    /* renamed from: a */
    static Runnable m18116a(zzajw zzajw) {
        return new C7901r1(zzajw);
    }

    public final void run() {
        this.f16732f.destroy();
    }
}
