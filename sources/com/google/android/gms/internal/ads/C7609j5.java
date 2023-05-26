package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.j5 */
final /* synthetic */ class C7609j5 implements Callable {

    /* renamed from: f */
    private final Context f15731f;

    /* renamed from: g */
    private final WebSettings f15732g;

    C7609j5(Context context, WebSettings webSettings) {
        this.f15731f = context;
        this.f15732g = webSettings;
    }

    public final Object call() {
        Context context = this.f15731f;
        WebSettings webSettings = this.f15732g;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }
}
