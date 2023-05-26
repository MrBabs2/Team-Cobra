package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class zzchc implements zzdti<zzbbh<String>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f20192a;

    /* renamed from: b */
    private final zzdtu<Context> f20193b;

    private zzchc(zzdtu<zzczt> zzdtu, zzdtu<Context> zzdtu2) {
        this.f20192a = zzdtu;
        this.f20193b = zzdtu2;
    }

    /* renamed from: a */
    public static zzchc m22539a(zzdtu<zzczt> zzdtu, zzdtu<Context> zzdtu2) {
        return new zzchc(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        zzcze<E, O> a = this.f20192a.get().mo28849a(zzczs.WEBVIEW_COOKIE).mo28855a(new C8103wi(this.f20193b.get())).mo28857a(1, TimeUnit.SECONDS).mo28862a(Exception.class, C8140xi.f17196a).mo28856a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
