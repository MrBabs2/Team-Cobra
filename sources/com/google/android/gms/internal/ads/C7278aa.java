package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.android.gms.internal.ads.aa */
final class C7278aa implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f14415f;

    /* renamed from: g */
    private final /* synthetic */ String f14416g;

    /* renamed from: h */
    private final /* synthetic */ int f14417h;

    /* renamed from: i */
    private final /* synthetic */ int f14418i = 0;

    /* renamed from: j */
    private final /* synthetic */ boolean f14419j;

    /* renamed from: k */
    private final /* synthetic */ int f14420k;

    /* renamed from: l */
    private final /* synthetic */ int f14421l;

    /* renamed from: m */
    private final /* synthetic */ zzbft f14422m;

    C7278aa(zzbft zzbft, String str, String str2, int i, int i2, boolean z, int i3, int i4) {
        this.f14422m = zzbft;
        this.f14415f = str;
        this.f14416g = str2;
        this.f14417h = i;
        this.f14419j = z;
        this.f14420k = i3;
        this.f14421l = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14415f);
        hashMap.put("cachedSrc", this.f14416g);
        hashMap.put("bytesLoaded", Integer.toString(this.f14417h));
        hashMap.put("totalBytes", Integer.toString(this.f14418i));
        hashMap.put("cacheReady", this.f14419j ? DiskLruCache.VERSION_1 : "0");
        hashMap.put("playerCount", Integer.toString(this.f14420k));
        hashMap.put("playerPreparedCount", Integer.toString(this.f14421l));
        this.f14422m.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
