package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.yi */
final /* synthetic */ class C8177yi implements Callable {

    /* renamed from: f */
    private final zzdh f17471f;

    /* renamed from: g */
    private final Context f17472g;

    C8177yi(zzdh zzdh, Context context) {
        this.f17471f = zzdh;
        this.f17472g = context;
    }

    public final Object call() {
        zzdh zzdh = this.f17471f;
        return zzdh.mo29015a().zza(this.f17472g);
    }
}
