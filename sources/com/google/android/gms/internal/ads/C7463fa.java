package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fa */
final class C7463fa implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f15198f;

    /* renamed from: g */
    private final /* synthetic */ String f15199g;

    /* renamed from: h */
    private final /* synthetic */ long f15200h;

    /* renamed from: i */
    private final /* synthetic */ zzbft f15201i;

    C7463fa(zzbft zzbft, String str, String str2, long j) {
        this.f15201i = zzbft;
        this.f15198f = str;
        this.f15199g = str2;
        this.f15200h = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f15198f);
        hashMap.put("cachedSrc", this.f15199g);
        hashMap.put("totalDuration", Long.toString(this.f15200h));
        this.f15201i.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
