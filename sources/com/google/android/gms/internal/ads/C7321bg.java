package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.bg */
final class C7321bg implements zzadx {

    /* renamed from: a */
    private final /* synthetic */ zzcab f14640a;

    /* renamed from: b */
    private final /* synthetic */ ViewGroup f14641b;

    /* renamed from: c */
    private final /* synthetic */ zzbzl f14642c;

    C7321bg(zzbzl zzbzl, zzcab zzcab, ViewGroup viewGroup) {
        this.f14642c = zzbzl;
        this.f14640a = zzcab;
        this.f14641b = viewGroup;
    }

    /* renamed from: a */
    public final void mo25733a() {
        if (zzbzl.m22227a(this.f14640a, zzbzj.f19774o)) {
            this.f14640a.onClick(this.f14641b);
        }
    }

    /* renamed from: a */
    public final void mo25734a(MotionEvent motionEvent) {
        this.f14640a.onTouch((View) null, motionEvent);
    }
}
