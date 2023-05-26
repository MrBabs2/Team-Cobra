package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;

@ShowFirstParty
@KeepForSdk
public class GoogleApiAvailabilityLight {
    @KeepForSdk

    /* renamed from: a */
    public static final int f13623a = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    private static final GoogleApiAvailabilityLight f13624b = new GoogleApiAvailabilityLight();

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static GoogleApiAvailabilityLight m15275a() {
        return f13624b;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public int mo24878b(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @KeepForSdk
    @HideFirstParty
    /* renamed from: c */
    public int mo24869c(Context context) {
        return mo24858a(context, f13623a);
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo24858a(Context context, int i) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public boolean mo24879b(Context context, int i) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    @KeepForSdk
    /* renamed from: c */
    public boolean mo24871c(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @KeepForSdk
    /* renamed from: b */
    public String mo24867b(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @VisibleForTesting
    /* renamed from: b */
    private static String m15276b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f13623a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(Wrappers.m16317a(context).mo25510b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public Intent mo24875a(int i) {
        return mo24863a((Context) null, i, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public Intent mo24863a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !DeviceProperties.m16273d(context)) {
                return zzg.m16170a("com.google.android.gms", m15276b(context, str));
            }
            return zzg.m16168a();
        } else if (i != 3) {
            return null;
        } else {
            return zzg.m16169a("com.google.android.gms");
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public PendingIntent mo24861a(Context context, int i, int i2) {
        return mo24874a(context, i, i2, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public PendingIntent mo24874a(Context context, int i, int i2, String str) {
        Intent a = mo24863a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo24876a(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo24877a(Context context, String str) {
        return GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(context, str);
    }
}
