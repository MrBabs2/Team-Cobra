package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.va */
final class C8058va implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final /* synthetic */ zzavb f17017f;

    /* renamed from: g */
    private final /* synthetic */ zzbha f17018g;

    C8058va(zzbha zzbha, zzavb zzavb) {
        this.f17018g = zzbha;
        this.f17017f = zzavb;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f17018g.m20948a(view, this.f17017f, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
