package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.android.gms.internal.ads.ba */
final class C7315ba implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f14566f;

    /* renamed from: g */
    private final /* synthetic */ String f14567g;

    /* renamed from: h */
    private final /* synthetic */ long f14568h;

    /* renamed from: i */
    private final /* synthetic */ long f14569i;

    /* renamed from: j */
    private final /* synthetic */ boolean f14570j;

    /* renamed from: k */
    private final /* synthetic */ zzbft f14571k;

    C7315ba(zzbft zzbft, String str, String str2, long j, long j2, boolean z) {
        this.f14571k = zzbft;
        this.f14566f = str;
        this.f14567g = str2;
        this.f14568h = j;
        this.f14569i = j2;
        this.f14570j = z;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14566f);
        hashMap.put("cachedSrc", this.f14567g);
        hashMap.put("bufferedDuration", Long.toString(this.f14568h));
        hashMap.put("totalDuration", Long.toString(this.f14569i));
        hashMap.put("cacheReady", this.f14570j ? DiskLruCache.VERSION_1 : "0");
        this.f14571k.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
