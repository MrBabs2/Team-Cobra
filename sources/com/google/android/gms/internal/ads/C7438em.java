package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.em */
final class C7438em implements zzbvo {

    /* renamed from: a */
    private final /* synthetic */ zzcxu f15156a;

    /* renamed from: b */
    private final /* synthetic */ zzcxm f15157b;

    /* renamed from: c */
    private final /* synthetic */ zzcjy f15158c;

    /* renamed from: d */
    final /* synthetic */ zzcnw f15159d;

    C7438em(zzcnw zzcnw, zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) {
        this.f15159d = zzcnw;
        this.f15156a = zzcxu;
        this.f15157b = zzcxm;
        this.f15158c = zzcjy;
    }

    /* renamed from: a */
    public final void mo25875a(int i) {
        String valueOf = String.valueOf(this.f15158c.f20302a);
        zzbad.m20523d(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }

    public final void onInitializationSucceeded() {
        this.f15159d.f20675b.execute(new C7475fm(this, this.f15156a, this.f15157b, this.f15158c));
    }
}
