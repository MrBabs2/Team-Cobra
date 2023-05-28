package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class Wrappers {

    /* renamed from: b */
    private static Wrappers f14282b = new Wrappers();

    /* renamed from: a */
    private PackageManagerWrapper f14283a = null;

    @KeepForSdk
    /* renamed from: a */
    public static PackageManagerWrapper m16317a(Context context) {
        return f14282b.m16318b(context);
    }

    @VisibleForTesting
    /* renamed from: b */
    private final synchronized PackageManagerWrapper m16318b(Context context) {
        if (this.f14283a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f14283a = new PackageManagerWrapper(context);
        }
        return this.f14283a;
    }
}
