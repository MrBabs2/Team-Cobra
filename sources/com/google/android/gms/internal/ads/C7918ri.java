package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.ri */
final class C7918ri extends zzair {

    /* renamed from: f */
    private final /* synthetic */ Object f16760f;

    /* renamed from: g */
    private final /* synthetic */ String f16761g;

    /* renamed from: h */
    private final /* synthetic */ long f16762h;

    /* renamed from: i */
    private final /* synthetic */ zzbbr f16763i;

    /* renamed from: j */
    private final /* synthetic */ zzcgb f16764j;

    C7918ri(zzcgb zzcgb, Object obj, String str, long j, zzbbr zzbbr) {
        this.f16764j = zzcgb;
        this.f16760f = obj;
        this.f16761g = str;
        this.f16762h = j;
        this.f16763i = zzbbr;
    }

    public final void onInitializationFailed(String str) {
        synchronized (this.f16760f) {
            this.f16764j.m22513a(this.f16761g, false, str, (int) (zzk.zzln().mo25499c() - this.f16762h));
            this.f16763i.mo27904b(false);
        }
    }

    public final void onInitializationSucceeded() {
        synchronized (this.f16760f) {
            this.f16764j.m22513a(this.f16761g, true, "", (int) (zzk.zzln().mo25499c() - this.f16762h));
            this.f16763i.mo27904b(true);
        }
    }
}
