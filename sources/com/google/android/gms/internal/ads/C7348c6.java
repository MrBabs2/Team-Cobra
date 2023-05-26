package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.c6 */
final class C7348c6 implements Callable<String> {

    /* renamed from: f */
    private final /* synthetic */ Context f14710f;

    C7348c6(zzazm zzazm, Context context) {
        this.f14710f = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences = this.f14710f.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzawz.m20167e("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f14710f);
            SharedPreferencesUtils.m16297a(this.f14710f, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        zzawz.m20167e("User agent is already initialized on Google Play Services.");
        return string;
    }
}
