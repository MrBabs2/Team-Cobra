package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.wi */
final /* synthetic */ class C8103wi implements Callable {

    /* renamed from: f */
    private final Context f17088f;

    C8103wi(Context context) {
        this.f17088f = context;
    }

    public final Object call() {
        CookieManager c = zzk.zzli().mo27826c(this.f17088f);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : "";
    }
}
