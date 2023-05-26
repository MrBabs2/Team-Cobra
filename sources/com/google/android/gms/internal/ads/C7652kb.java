package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.kb */
final class C7652kb implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ View f15826f;

    /* renamed from: g */
    private final /* synthetic */ zzavb f15827g;

    /* renamed from: h */
    private final /* synthetic */ int f15828h;

    /* renamed from: i */
    private final /* synthetic */ zzbio f15829i;

    C7652kb(zzbio zzbio, View view, zzavb zzavb, int i) {
        this.f15829i = zzbio;
        this.f15826f = view;
        this.f15827g = zzavb;
        this.f15828h = i;
    }

    public final void run() {
        this.f15829i.m21132a(this.f15826f, this.f15827g, this.f15828h - 1);
    }
}
