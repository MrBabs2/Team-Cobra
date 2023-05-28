package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.vo */
final /* synthetic */ class C8072vo implements Runnable {

    /* renamed from: f */
    private final zzcul f17031f;

    /* renamed from: g */
    private final zzcpk f17032g;

    /* renamed from: h */
    private final Bundle f17033h;

    /* renamed from: i */
    private final zzcpl f17034i;

    /* renamed from: j */
    private final zzbbr f17035j;

    C8072vo(zzcul zzcul, zzcpk zzcpk, Bundle bundle, zzcpl zzcpl, zzbbr zzbbr) {
        this.f17031f = zzcul;
        this.f17032g = zzcpk;
        this.f17033h = bundle;
        this.f17034i = zzcpl;
        this.f17035j = zzbbr;
    }

    public final void run() {
        this.f17031f.mo28796a(this.f17032g, this.f17033h, this.f17034i, this.f17035j);
    }
}
