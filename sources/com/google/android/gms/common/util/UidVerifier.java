package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m16298a(Context context, int i) {
        if (!m16299a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.m15289a(context).mo24880a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    @KeepForSdk
    /* renamed from: a */
    public static boolean m16299a(Context context, int i, String str) {
        return Wrappers.m16317a(context).mo25509a(i, str);
    }
}
