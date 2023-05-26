package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ga */
final class C7499ga implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f15285f;

    /* renamed from: g */
    private final /* synthetic */ String f15286g;

    /* renamed from: h */
    private final /* synthetic */ String f15287h;

    /* renamed from: i */
    private final /* synthetic */ String f15288i;

    /* renamed from: j */
    private final /* synthetic */ zzbft f15289j;

    C7499ga(zzbft zzbft, String str, String str2, String str3, String str4) {
        this.f15289j = zzbft;
        this.f15285f = str;
        this.f15286g = str2;
        this.f15287h = str3;
        this.f15288i = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f15285f);
        if (!TextUtils.isEmpty(this.f15286g)) {
            hashMap.put("cachedSrc", this.f15286g);
        }
        hashMap.put("type", zzbft.mo28093c(this.f15287h));
        hashMap.put("reason", this.f15287h);
        if (!TextUtils.isEmpty(this.f15288i)) {
            hashMap.put("message", this.f15288i);
        }
        this.f15289j.m20819a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
