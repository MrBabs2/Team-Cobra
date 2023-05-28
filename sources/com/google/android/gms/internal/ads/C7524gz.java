package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gz */
final class C7524gz implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f15328f;

    /* renamed from: g */
    private final /* synthetic */ long f15329g;

    /* renamed from: h */
    private final /* synthetic */ long f15330h;

    /* renamed from: i */
    private final /* synthetic */ zzgr f15331i;

    C7524gz(zzgr zzgr, String str, long j, long j2) {
        this.f15331i = zzgr;
        this.f15328f = str;
        this.f15329g = j;
        this.f15330h = j2;
    }

    public final void run() {
        this.f15331i.f21906j.mo25584a(this.f15328f, this.f15329g, this.f15330h);
    }
}
