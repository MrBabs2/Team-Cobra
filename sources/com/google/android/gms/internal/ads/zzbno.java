package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzbno implements zzdti<View> {

    /* renamed from: a */
    private final zzbnk f19250a;

    public zzbno(zzbnk zzbnk) {
        this.f19250a = zzbnk;
    }

    /* renamed from: a */
    public static View m21408a(zzbnk zzbnk) {
        View a = zzbnk.mo28281a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public final /* synthetic */ Object get() {
        return m21408a(this.f19250a);
    }
}
