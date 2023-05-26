package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.google.android.gms.internal.ads.nn */
final /* synthetic */ class C7775nn implements zzbal {

    /* renamed from: a */
    private final zzarx f16396a;

    C7775nn(zzarx zzarx) {
        this.f16396a = zzarx;
    }

    public final zzbbh zzf(Object obj) {
        zzarx zzarx = this.f16396a;
        zzcrc zzcrc = new zzcrc(new JsonReader(new InputStreamReader((InputStream) obj)));
        zzcrc.mo28781a(zzarx.f18438f);
        return zzbar.m20539a(zzcrc);
    }
}
