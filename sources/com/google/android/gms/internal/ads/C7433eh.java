package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.android.gms.internal.ads.eh */
final /* synthetic */ class C7433eh implements zzue {

    /* renamed from: f */
    private final zzbgz f15152f;

    C7433eh(zzbgz zzbgz) {
        this.f15152f = zzbgz;
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        zzbgz zzbgz = this.f15152f;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", zzud.f22775j ? DiskLruCache.VERSION_1 : "0");
        zzbgz.mo25665a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }
}
