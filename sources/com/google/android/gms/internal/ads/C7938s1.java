package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s1 */
final class C7938s1 implements zzbbv<zzajw> {

    /* renamed from: a */
    private final /* synthetic */ zzala f16815a;

    /* renamed from: b */
    private final /* synthetic */ zzakh f16816b;

    C7938s1(zzakh zzakh, zzala zzala) {
        this.f16816b = zzakh;
        this.f16815a = zzala;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25562a(Object obj) {
        synchronized (this.f16816b.f18153a) {
            int unused = this.f16816b.f18160h = 0;
            if (!(this.f16816b.f18159g == null || this.f16815a == this.f16816b.f18159g)) {
                zzawz.m20167e("New JS engine is loaded, marking previous one as destroyable.");
                this.f16816b.f18159g.mo27368e();
            }
            zzala unused2 = this.f16816b.f18159g = this.f16815a;
        }
    }
}
