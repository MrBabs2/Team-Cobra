package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
@zzard
public final class zzbhz extends zzbia {
    public zzbhz(zzbgz zzbgz, zzwj zzwj, boolean z) {
        super(zzbgz, zzwj, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo28173a(webView, str, (Map<String, String>) null);
    }
}
