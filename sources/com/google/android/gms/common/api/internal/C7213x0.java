package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
final class C7213x0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ LifecycleCallback f13854f;

    /* renamed from: g */
    private final /* synthetic */ String f13855g;

    /* renamed from: h */
    private final /* synthetic */ zza f13856h;

    C7213x0(zza zza, LifecycleCallback lifecycleCallback, String str) {
        this.f13856h = zza;
        this.f13854f = lifecycleCallback;
        this.f13855g = str;
    }

    public final void run() {
        if (this.f13856h.f14014g > 0) {
            this.f13854f.mo25067a(this.f13856h.f14015h != null ? this.f13856h.f14015h.getBundle(this.f13855g) : null);
        }
        if (this.f13856h.f14014g >= 2) {
            this.f13854f.mo25072d();
        }
        if (this.f13856h.f14014g >= 3) {
            this.f13854f.mo25071c();
        }
        if (this.f13856h.f14014g >= 4) {
            this.f13854f.mo25073e();
        }
        if (this.f13856h.f14014g >= 5) {
            this.f13854f.mo25069b();
        }
    }
}
