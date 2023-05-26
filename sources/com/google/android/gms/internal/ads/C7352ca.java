package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.android.gms.internal.ads.ca */
final class C7352ca implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f14728f;

    /* renamed from: g */
    private final /* synthetic */ String f14729g;

    /* renamed from: h */
    private final /* synthetic */ long f14730h;

    /* renamed from: i */
    private final /* synthetic */ long f14731i;

    /* renamed from: j */
    private final /* synthetic */ boolean f14732j;

    /* renamed from: k */
    private final /* synthetic */ int f14733k;

    /* renamed from: l */
    private final /* synthetic */ int f14734l;

    /* renamed from: m */
    private final /* synthetic */ zzbft f14735m;

    C7352ca(zzbft zzbft, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.f14735m = zzbft;
        this.f14728f = str;
        this.f14729g = str2;
        this.f14730h = j;
        this.f14731i = j2;
        this.f14732j = z;
        this.f14733k = i;
        this.f14734l = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14728f);
        hashMap.put("cachedSrc", this.f14729g);
        hashMap.put("bufferedDuration", Long.toString(this.f14730h));
        hashMap.put("totalDuration", Long.toString(this.f14731i));
        hashMap.put("cacheReady", this.f14732j ? DiskLruCache.VERSION_1 : "0");
        hashMap.put("playerCount", Integer.toString(this.f14733k));
        hashMap.put("playerPreparedCount", Integer.toString(this.f14734l));
        this.f14735m.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
