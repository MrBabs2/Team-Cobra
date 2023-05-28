package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.cp */
final class C7367cp implements zzcva<zzcvf> {

    /* renamed from: a */
    private final zzbbl f14766a;

    /* renamed from: b */
    private final Context f14767b;

    public C7367cp(zzbbl zzbbl, Context context) {
        this.f14766a = zzbbl;
        this.f14767b = context;
    }

    /* renamed from: a */
    public final zzbbh<zzcvf> mo25785a() {
        return this.f14766a.mo27892a(new C7404dp(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcvf mo25786b() throws Exception {
        boolean z;
        PackageManager packageManager = this.f14767b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = m16736a(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = m16736a(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean startsWith = Build.DEVICE.startsWith("generic");
        boolean a = DeviceProperties.m16270a(this.f14767b);
        boolean b = DeviceProperties.m16271b(this.f14767b);
        String language = locale.getLanguage();
        String a2 = m16738a(this.f14767b, packageManager);
        String a3 = m16737a(this.f14767b);
        String str = Build.FINGERPRINT;
        Context context = this.f14767b;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        z = resolveActivity.activityInfo.packageName.equals(zzdtv.m24247a(context));
                        break;
                    } else {
                        i++;
                    }
                }
                return new zzcvf(z2, z3, country, startsWith, a, b, language, a2, a3, str, z, Build.MODEL);
            }
        }
        z = false;
        return new zzcvf(z2, z3, country, startsWith, a, b, language, a2, a3, str, z, Build.MODEL);
    }

    /* renamed from: a */
    private static String m16737a(Context context) {
        try {
            PackageInfo b = Wrappers.m16317a(context).mo25510b("com.android.vending", 128);
            if (b != null) {
                int i = b.versionCode;
                String str = b.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static String m16738a(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a = m16736a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null || (activityInfo = a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b = Wrappers.m16317a(context).mo25510b(activityInfo.packageName, 0);
            if (b != null) {
                int i = b.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static ResolveInfo m16736a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }
}
