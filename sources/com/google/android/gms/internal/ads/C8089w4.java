package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.w4 */
final class C8089w4 extends zzawv {

    /* renamed from: a */
    private final /* synthetic */ zzawm f17066a;

    C8089w4(zzawm zzawm) {
        this.f17066a = zzawm;
    }

    public final void zzto() {
        zzacx zzacx = new zzacx(this.f17066a.f18596e, this.f17066a.f18597f.f18742f);
        synchronized (this.f17066a.f18592a) {
            try {
                zzk.zzlp();
                zzada.m18998a(this.f17066a.f18598g, zzacx);
            } catch (IllegalArgumentException e) {
                zzbad.m20522c("Cannot config CSI reporter.", e);
            }
        }
    }
}
