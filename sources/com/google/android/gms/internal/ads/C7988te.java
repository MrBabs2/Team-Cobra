package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.te */
final /* synthetic */ class C7988te implements Runnable {

    /* renamed from: f */
    private final zzbtu f16902f;

    /* renamed from: g */
    private final Object f16903g;

    C7988te(zzbtu zzbtu, Object obj) {
        this.f16902f = zzbtu;
        this.f16903g = obj;
    }

    public final void run() {
        try {
            this.f16902f.mo25595a(this.f16903g);
        } catch (Throwable th) {
            zzk.zzlk().mo27736b(th, "EventEmitter.notify");
            zzawz.m20168e("Event emitter exception.", th);
        }
    }
}
