package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzk;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
@zzard
public class zzbia extends zzbha {
    public zzbia(zzbgz zzbgz, zzwj zzwj, boolean z) {
        super(zzbgz, zzwj, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo28173a(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbgz)) {
            zzbad.m20523d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbgz zzbgz = (zzbgz) webView;
        zzavb zzavb = this.f18990q;
        if (zzavb != null) {
            zzavb.mo27672a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo28122a(str, map);
        }
        if (zzbgz.mo25697k() != null) {
            zzbgz.mo25697k().mo28123a();
        }
        if (zzbgz.mo25695i().mo28181b()) {
            str2 = (String) zzyt.m25670e().mo27163a(zzacu.f17813K);
        } else if (zzbgz.mo25691g()) {
            str2 = (String) zzyt.m25670e().mo27163a(zzacu.f17809J);
        } else {
            str2 = (String) zzyt.m25670e().mo27163a(zzacu.f17805I);
        }
        zzk.zzlg();
        return zzaxi.m20289c(zzbgz.getContext(), zzbgz.mo25672b().f18742f, str2);
    }
}
