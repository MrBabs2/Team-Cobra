package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* renamed from: com.google.android.gms.internal.ads.ub */
final class C8022ub {
    @VisibleForTesting

    /* renamed from: a */
    private static Boolean f16951a;

    private C8022ub() {
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m18284a(WebView webView) {
        boolean booleanValue;
        synchronized (C8022ub.class) {
            if (f16951a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    f16951a = true;
                } catch (IllegalStateException unused) {
                    f16951a = false;
                }
            }
            booleanValue = f16951a.booleanValue();
        }
        return booleanValue;
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m18283a(WebView webView, String str) {
        if (!PlatformVersion.m16290f() || !m18284a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
