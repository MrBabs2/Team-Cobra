package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* renamed from: com.google.android.gms.internal.ads.rb */
class C7911rb extends WebView {
    public C7911rb(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzk.zzli().mo27820a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzbad.m20520b("Unable to enable Javascript.", e);
        }
        setLayerType(1, (Paint) null);
    }

    /* renamed from: a */
    public void mo25660a(String str) {
        C8022ub.m18283a(this, str);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            zzawz.m20167e("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            zzk.zzlk().mo27734a(e, "CoreWebView.loadUrl");
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
