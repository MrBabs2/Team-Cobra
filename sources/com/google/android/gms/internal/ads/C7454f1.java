package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f1 */
final class C7454f1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f15174f;

    /* renamed from: g */
    private final /* synthetic */ zzajy f15175g;

    C7454f1(zzajy zzajy, String str) {
        this.f15175g = zzajy;
        this.f15174f = str;
    }

    public final void run() {
        this.f15175g.f18149f.loadData(this.f15174f, "text/html", "UTF-8");
    }
}
