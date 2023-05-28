package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ea */
final class C7426ea implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f15074f;

    /* renamed from: g */
    private final /* synthetic */ String f15075g;

    /* renamed from: h */
    private final /* synthetic */ int f15076h;

    /* renamed from: i */
    private final /* synthetic */ zzbft f15077i;

    C7426ea(zzbft zzbft, String str, String str2, int i) {
        this.f15077i = zzbft;
        this.f15074f = str;
        this.f15075g = str2;
        this.f15076h = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f15074f);
        hashMap.put("cachedSrc", this.f15075g);
        hashMap.put("totalBytes", Integer.toString(this.f15076h));
        this.f15077i.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
