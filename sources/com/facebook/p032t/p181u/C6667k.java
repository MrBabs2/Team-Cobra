package com.facebook.p032t.p181u;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C6494l;
import com.facebook.internal.C6460r;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.internal.p175c0.C6421a;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.C6596m;
import java.util.Locale;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.notification.PullingContentService;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

/* renamed from: com.facebook.t.u.k */
/* compiled from: SessionLogger */
class C6667k {

    /* renamed from: a */
    private static final String f12424a = "com.facebook.t.u.k";

    /* renamed from: b */
    private static final long[] f12425b = {LocalNotificationSyncManager.FIVE_MINUTES, 900000, BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS, 3600000, 21600000, 43200000, PullingContentService.UPDATES_INTERVAL, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C6667k() {
    }

    /* renamed from: a */
    static void m14241a(String str, C6668l lVar, String str2, Context context) {
        String str3;
        Class<C6667k> cls = C6667k.class;
        if (!C6391a.m13260a((Object) cls)) {
            if (lVar != null) {
                try {
                    str3 = lVar.toString();
                } catch (Throwable th) {
                    C6391a.m13259a(th, cls);
                    return;
                }
            } else {
                str3 = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str3);
            bundle.putString("fb_mobile_pckg_fp", m14238a(context));
            bundle.putString("fb_mobile_app_cert_hash", C6421a.m13307a(context));
            C6596m mVar = new C6596m(str, str2, (AccessToken) null);
            mVar.mo21337a("fb_mobile_activate_app", bundle);
            if (C6596m.m13996c() != C4728g.C4729a.EXPLICIT_ONLY) {
                mVar.mo21334a();
            }
        }
    }

    /* renamed from: a */
    static void m14240a(String str, C6666j jVar, String str2) {
        Class<C6667k> cls = C6667k.class;
        if (!C6391a.m13260a((Object) cls) && jVar != null) {
            try {
                Long valueOf = Long.valueOf(jVar.mo21420a() - jVar.mo21424d().longValue());
                if (valueOf.longValue() < 0) {
                    valueOf = 0L;
                    m14239a();
                }
                Long valueOf2 = Long.valueOf(jVar.mo21425e());
                if (valueOf2.longValue() < 0) {
                    m14239a();
                    valueOf2 = 0L;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", jVar.mo21422b());
                bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m14237a(valueOf.longValue()))}));
                C6668l f = jVar.mo21426f();
                bundle.putString("fb_mobile_launch_source", f != null ? f.toString() : "Unclassified");
                bundle.putLong("_logTime", jVar.mo21424d().longValue() / 1000);
                C6596m mVar = new C6596m(str, str2, (AccessToken) null);
                double longValue = (double) valueOf2.longValue();
                Double.isNaN(longValue);
                mVar.mo21336a("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static void m14239a() {
        Class<C6667k> cls = C6667k.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                C6460r.m13407a(C6494l.APP_EVENTS, f12424a, "Clock skew detected");
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static int m14237a(long j) {
        Class<C6667k> cls = C6667k.class;
        if (C6391a.m13260a((Object) cls)) {
            return 0;
        }
        int i = 0;
        while (i < f12425b.length && f12425b[i] < j) {
            try {
                i++;
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
                return 0;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static String m14238a(Context context) {
        Class<C6667k> cls = C6667k.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, (String) null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String a = C6659g.m14200a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            sharedPreferences.edit().putString(str, a).apply();
            return a;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
