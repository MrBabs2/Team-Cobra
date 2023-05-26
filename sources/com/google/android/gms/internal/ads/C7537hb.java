package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.hb */
final /* synthetic */ class C7537hb implements zzbhw {

    /* renamed from: a */
    private final zzbgz f15363a;

    C7537hb(zzbgz zzbgz) {
        this.f15363a = zzbgz;
    }

    /* renamed from: a */
    public final void mo26023a(Uri uri) {
        zzbii k = this.f15363a.mo25697k();
        if (k == null) {
            zzbad.m20519b("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            k.mo28126a(uri);
        }
    }
}
