package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.d6 */
final class C7385d6 implements Callable<String> {

    /* renamed from: f */
    private final /* synthetic */ Context f14818f;

    /* renamed from: g */
    private final /* synthetic */ Context f14819g;

    C7385d6(zzazm zzazm, Context context, Context context2) {
        this.f14818f = context;
        this.f14819g = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f14818f != null) {
            zzawz.m20167e("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f14818f.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzawz.m20167e("Attempting to read user agent from local cache.");
            sharedPreferences = this.f14819g.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzawz.m20167e("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f14819g);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzawz.m20167e("Persisting user agent.");
            }
        }
        return string;
    }
}
