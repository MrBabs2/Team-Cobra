package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public class zzaxv extends zzaxu {
    /* renamed from: a */
    public final zzbha mo27813a(zzbgz zzbgz, zzwj zzwj, boolean z) {
        return new zzbib(zzbgz, zzwj, z);
    }

    /* renamed from: c */
    public final int mo27825c() {
        return 16974374;
    }

    /* renamed from: c */
    public final CookieManager mo27826c(Context context) {
        if (zzaxo.m20330d()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbad.m20520b("Failed to obtain CookieManager.", th);
            zzk.zzlk().mo27734a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public final WebResourceResponse mo27812a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
