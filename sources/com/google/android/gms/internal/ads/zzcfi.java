package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

public final class zzcfi {

    /* renamed from: a */
    private Map<String, String> f20107a;

    public zzcfi(Context context, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f20107a = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("sdk", Build.VERSION.SDK);
        zzk.zzlg();
        linkedHashMap.put("device", zzaxi.m20290c());
        linkedHashMap.put("app", str);
        zzk.zzlg();
        linkedHashMap.put("is_lite_sdk", zzaxi.m20308k(context) ? DiskLruCache.VERSION_1 : "0");
        linkedHashMap.put("e", TextUtils.join(",", zzacu.m18985b()));
    }

    /* renamed from: a */
    public final void mo28675a(zzcxu zzcxu) {
        if (zzcxu.f21163b.f21157a.size() > 0) {
            int i = zzcxu.f21163b.f21157a.get(0).f21118b;
            if (i == 1) {
                this.f20107a.put("ad_format", "banner");
            } else if (i == 2) {
                this.f20107a.put("ad_format", "interstitial");
            } else if (i == 3) {
                this.f20107a.put("ad_format", "native_express");
            } else if (i == 4) {
                this.f20107a.put("ad_format", "native_advanced");
            } else if (i != 5) {
                this.f20107a.put("ad_format", "unknown");
            } else {
                this.f20107a.put("ad_format", "rewarded");
            }
            if (!TextUtils.isEmpty(zzcxu.f21163b.f21158b.f21147b)) {
                this.f20107a.put("gqi", zzcxu.f21163b.f21158b.f21147b);
            }
        }
    }

    /* renamed from: a */
    public final void mo28674a(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f20107a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f20107a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo28673a() {
        return this.f20107a;
    }
}
