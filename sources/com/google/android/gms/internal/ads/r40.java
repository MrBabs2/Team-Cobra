package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class r40 implements Runnable {

    /* renamed from: f */
    private ValueCallback<String> f16736f = new s40(this);

    /* renamed from: g */
    final /* synthetic */ zzuo f16737g;

    /* renamed from: h */
    final /* synthetic */ WebView f16738h;

    /* renamed from: i */
    final /* synthetic */ boolean f16739i;

    /* renamed from: j */
    final /* synthetic */ zzuu f16740j;

    r40(zzuu zzuu, zzuo zzuo, WebView webView, boolean z) {
        this.f16740j = zzuu;
        this.f16737g = zzuo;
        this.f16738h = webView;
        this.f16739i = z;
    }

    public final void run() {
        if (this.f16738h.getSettings().getJavaScriptEnabled()) {
            try {
                this.f16738h.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f16736f);
            } catch (Throwable unused) {
                this.f16736f.onReceiveValue("");
            }
        }
    }
}
