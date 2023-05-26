package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.android.gms.internal.ads.z9 */
final class C8205z9 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f17561f;

    /* renamed from: g */
    private final /* synthetic */ String f17562g;

    /* renamed from: h */
    private final /* synthetic */ int f17563h;

    /* renamed from: i */
    private final /* synthetic */ int f17564i;

    /* renamed from: j */
    private final /* synthetic */ boolean f17565j = false;

    /* renamed from: k */
    private final /* synthetic */ zzbft f17566k;

    C8205z9(zzbft zzbft, String str, String str2, int i, int i2, boolean z) {
        this.f17566k = zzbft;
        this.f17561f = str;
        this.f17562g = str2;
        this.f17563h = i;
        this.f17564i = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f17561f);
        hashMap.put("cachedSrc", this.f17562g);
        hashMap.put("bytesLoaded", Integer.toString(this.f17563h));
        hashMap.put("totalBytes", Integer.toString(this.f17564i));
        hashMap.put("cacheReady", this.f17565j ? DiskLruCache.VERSION_1 : "0");
        this.f17566k.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
