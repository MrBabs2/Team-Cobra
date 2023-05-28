package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e1 */
final class C7417e1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f15039f;

    /* renamed from: g */
    private final /* synthetic */ zzajy f15040g;

    C7417e1(zzajy zzajy, String str) {
        this.f15040g = zzajy;
        this.f15039f = str;
    }

    public final void run() {
        this.f15040g.f18149f.loadData(this.f15039f, "text/html", "UTF-8");
    }
}
