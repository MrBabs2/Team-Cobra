package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a8 */
final class C7276a8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f14412f;

    /* renamed from: g */
    private final /* synthetic */ zzbcq f14413g;

    C7276a8(zzbcq zzbcq, boolean z) {
        this.f14413g = zzbcq;
        this.f14412f = z;
    }

    public final void run() {
        this.f14413g.m20611b("windowVisibilityChanged", "isVisible", String.valueOf(this.f14412f));
    }
}
