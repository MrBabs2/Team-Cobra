package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@zzard
public final class zzbja {

    /* renamed from: a */
    public final String f19047a;

    /* renamed from: b */
    public final Uri f19048b;

    /* renamed from: c */
    public final Map<String, String> f19049c;

    @TargetApi(21)
    public zzbja(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public zzbja(String str) {
        this(str, Uri.parse(str), (String) null, (Map<String, String>) null);
    }

    private zzbja(String str, Uri uri, String str2, Map<String, String> map) {
        this.f19047a = str;
        this.f19048b = uri;
        this.f19049c = map == null ? Collections.emptyMap() : map;
    }
}
