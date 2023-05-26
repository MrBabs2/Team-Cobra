package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z4 */
final class C8200z4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzawv f17551f;

    C8200z4(zzawv zzawv) {
        this.f17551f = zzawv;
    }

    public final void run() {
        Thread unused = this.f17551f.zzdut = Thread.currentThread();
        this.f17551f.zzto();
    }
}
