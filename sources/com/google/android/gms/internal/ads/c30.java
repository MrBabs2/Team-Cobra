package com.google.android.gms.internal.ads;

final class c30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ f30 f14697f;

    /* renamed from: g */
    private final /* synthetic */ z20 f14698g;

    c30(z20 z20, f30 f30) {
        this.f14698g = z20;
        this.f14697f = f30;
    }

    public final void run() {
        this.f14697f.mo25910a();
        int size = this.f14698g.f17541u.size();
        for (int i = 0; i < size; i++) {
            ((zzqt) this.f14698g.f17541u.valueAt(i)).mo29638a();
        }
    }
}
