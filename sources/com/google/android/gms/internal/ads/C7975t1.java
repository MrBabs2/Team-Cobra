package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t1 */
final class C7975t1 implements zzbbt {

    /* renamed from: a */
    private final /* synthetic */ zzala f16877a;

    /* renamed from: b */
    private final /* synthetic */ zzakh f16878b;

    C7975t1(zzakh zzakh, zzala zzala) {
        this.f16878b = zzakh;
        this.f16877a = zzala;
    }

    public final void run() {
        synchronized (this.f16878b.f18153a) {
            int unused = this.f16878b.f18160h = 1;
            zzawz.m20167e("Failed loading new engine. Marking new engine destroyable.");
            this.f16877a.mo27368e();
        }
    }
}
