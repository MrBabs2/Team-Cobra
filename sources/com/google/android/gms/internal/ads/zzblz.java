package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

public final class zzblz implements zzbls {

    /* renamed from: a */
    private final Context f19145a;

    public zzblz(Context context) {
        this.f19145a = context;
    }

    /* renamed from: a */
    public final void mo28258a(Map<String, String> map) {
        CookieManager c;
        String str = map.get("cookie");
        if (!TextUtils.isEmpty(str) && (c = zzk.zzli().mo27826c(this.f19145a)) != null) {
            c.setCookie("googleads.g.doubleclick.net", str);
        }
    }
}
