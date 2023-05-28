package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.android.gms.internal.ads.da */
final class C7389da implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f14827f;

    /* renamed from: g */
    private final /* synthetic */ String f14828g;

    /* renamed from: h */
    private final /* synthetic */ int f14829h;

    /* renamed from: i */
    private final /* synthetic */ int f14830i;

    /* renamed from: j */
    private final /* synthetic */ long f14831j;

    /* renamed from: k */
    private final /* synthetic */ long f14832k;

    /* renamed from: l */
    private final /* synthetic */ boolean f14833l;

    /* renamed from: m */
    private final /* synthetic */ int f14834m;

    /* renamed from: n */
    private final /* synthetic */ int f14835n;

    /* renamed from: o */
    private final /* synthetic */ zzbft f14836o;

    C7389da(zzbft zzbft, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f14836o = zzbft;
        this.f14827f = str;
        this.f14828g = str2;
        this.f14829h = i;
        this.f14830i = i2;
        this.f14831j = j;
        this.f14832k = j2;
        this.f14833l = z;
        this.f14834m = i3;
        this.f14835n = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14827f);
        hashMap.put("cachedSrc", this.f14828g);
        hashMap.put("bytesLoaded", Integer.toString(this.f14829h));
        hashMap.put("totalBytes", Integer.toString(this.f14830i));
        hashMap.put("bufferedDuration", Long.toString(this.f14831j));
        hashMap.put("totalDuration", Long.toString(this.f14832k));
        hashMap.put("cacheReady", this.f14833l ? DiskLruCache.VERSION_1 : "0");
        hashMap.put("playerCount", Integer.toString(this.f14834m));
        hashMap.put("playerPreparedCount", Integer.toString(this.f14835n));
        this.f14836o.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
