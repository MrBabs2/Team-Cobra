package com.google.android.gms.internal.ads;

@zzard
/* renamed from: com.google.android.gms.internal.ads.f8 */
final class C7461f8 implements Runnable {

    /* renamed from: f */
    private zzbcq f15195f;

    /* renamed from: g */
    private boolean f15196g = false;

    C7461f8(zzbcq zzbcq) {
        this.f15195f = zzbcq;
    }

    /* renamed from: c */
    private final void m16938c() {
        zzaxi.f18651h.removeCallbacks(this);
        zzaxi.f18651h.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo25915a() {
        this.f15196g = true;
        this.f15195f.mo27957o();
    }

    /* renamed from: b */
    public final void mo25916b() {
        this.f15196g = false;
        m16938c();
    }

    public final void run() {
        if (!this.f15196g) {
            this.f15195f.mo27957o();
            m16938c();
        }
    }
}
