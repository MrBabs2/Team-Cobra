package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y8 */
final class C8167y8 implements zzgh {

    /* renamed from: a */
    private final /* synthetic */ zzbdq f17276a;

    C8167y8(zzbdq zzbdq) {
        this.f17276a = zzbdq;
    }

    /* renamed from: a */
    public final void mo26125a() {
    }

    /* renamed from: a */
    public final void mo26128a(boolean z, int i) {
        if (this.f17276a.f8050w != i) {
            int unused = this.f17276a.f8050w = i;
            if (i == 4) {
                this.f17276a.m7773p();
            } else if (i == 5) {
                this.f17276a.m7769l();
            }
        }
    }

    /* renamed from: a */
    public final void mo26126a(zzgd zzgd) {
        this.f17276a.m7763b("PlayerError", zzgd.getMessage());
    }
}
