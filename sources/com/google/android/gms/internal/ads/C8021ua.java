package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ua */
final class C8021ua implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ View f16947f;

    /* renamed from: g */
    private final /* synthetic */ zzavb f16948g;

    /* renamed from: h */
    private final /* synthetic */ int f16949h;

    /* renamed from: i */
    private final /* synthetic */ zzbha f16950i;

    C8021ua(zzbha zzbha, View view, zzavb zzavb, int i) {
        this.f16950i = zzbha;
        this.f16947f = view;
        this.f16948g = zzavb;
        this.f16949h = i;
    }

    public final void run() {
        this.f16950i.m20948a(this.f16947f, this.f16948g, this.f16949h - 1);
    }
}
