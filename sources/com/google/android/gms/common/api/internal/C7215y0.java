package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
final class C7215y0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ LifecycleCallback f13858f;

    /* renamed from: g */
    private final /* synthetic */ String f13859g;

    /* renamed from: h */
    private final /* synthetic */ zzc f13860h;

    C7215y0(zzc zzc, LifecycleCallback lifecycleCallback, String str) {
        this.f13860h = zzc;
        this.f13858f = lifecycleCallback;
        this.f13859g = str;
    }

    public final void run() {
        if (this.f13860h.f14018g > 0) {
            this.f13858f.mo25067a(this.f13860h.f14019h != null ? this.f13860h.f14019h.getBundle(this.f13859g) : null);
        }
        if (this.f13860h.f14018g >= 2) {
            this.f13858f.mo25072d();
        }
        if (this.f13860h.f14018g >= 3) {
            this.f13858f.mo25071c();
        }
        if (this.f13860h.f14018g >= 4) {
            this.f13858f.mo25073e();
        }
        if (this.f13860h.f14018g >= 5) {
            this.f13858f.mo25069b();
        }
    }
}
