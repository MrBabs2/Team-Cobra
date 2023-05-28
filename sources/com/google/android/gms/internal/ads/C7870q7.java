package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q7 */
final class C7870q7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f16647f;

    /* renamed from: g */
    private final /* synthetic */ String f16648g;

    /* renamed from: h */
    private final /* synthetic */ zzbcd f16649h;

    C7870q7(zzbcd zzbcd, String str, String str2) {
        this.f16649h = zzbcd;
        this.f16647f = str;
        this.f16648g = str2;
    }

    public final void run() {
        if (this.f16649h.f18774u != null) {
            this.f16649h.f18774u.mo27929a(this.f16647f, this.f16648g);
        }
    }
}
