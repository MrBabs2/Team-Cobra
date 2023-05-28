package com.google.android.gms.internal.ads;

public final class zzcjg implements zzbro, zzbsr {

    /* renamed from: g */
    private static final Object f20268g = new Object();

    /* renamed from: h */
    private static int f20269h;

    /* renamed from: f */
    private final zzcjm f20270f;

    public zzcjg(zzcjm zzcjm) {
        this.f20270f = zzcjm;
    }

    /* renamed from: a */
    private static void m22584a() {
        synchronized (f20268g) {
            f20269h++;
        }
    }

    /* renamed from: b */
    private static boolean m22585b() {
        boolean z;
        synchronized (f20268g) {
            z = f20269h < ((Integer) zzyt.m25670e().mo27163a(zzacu.f17916h3)).intValue();
        }
        return z;
    }

    public final void onAdFailedToLoad(int i) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17911g3)).booleanValue() && m22585b()) {
            this.f20270f.mo28713a(false);
            m22584a();
        }
    }

    public final void onAdLoaded() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17911g3)).booleanValue() && m22585b()) {
            this.f20270f.mo28713a(true);
            m22584a();
        }
    }
}
