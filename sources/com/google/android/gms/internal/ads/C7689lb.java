package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.lb */
final class C7689lb implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final /* synthetic */ zzavb f16091f;

    /* renamed from: g */
    private final /* synthetic */ zzbio f16092g;

    C7689lb(zzbio zzbio, zzavb zzavb) {
        this.f16092g = zzbio;
        this.f16091f = zzavb;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f16092g.m21132a(view, this.f16091f, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
