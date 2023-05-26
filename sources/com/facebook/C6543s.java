package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.internal.C6372a;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C6596m;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: com.facebook.s */
/* compiled from: UserSettingsManager */
final class C6543s {

    /* renamed from: a */
    private static final String f12140a = "com.facebook.s";

    /* renamed from: b */
    private static AtomicBoolean f12141b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f12142c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C6545b f12143d = new C6545b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    private static C6545b f12144e = new C6545b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C6545b f12145f = new C6545b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C6545b f12146g = new C6545b(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static C6545b f12147h = new C6545b(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    private static SharedPreferences f12148i;

    /* renamed from: com.facebook.s$a */
    /* compiled from: UserSettingsManager */
    static class C6544a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f12149f;

        C6544a(long j) {
            this.f12149f = j;
        }

        public void run() {
            C6446m a;
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (C6543s.f12145f.mo21246a() && (a = C6448n.m13378a(C4716f.m7697f(), false)) != null && a.mo20989b()) {
                        C6372a d = C6372a.m13215d(C4716f.m7696e());
                        if (((d == null || d.mo20927a() == null) ? null : d.mo20927a()) != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("advertiser_id", d.mo20927a());
                            bundle.putString("fields", "auto_event_setup_enabled");
                            GraphRequest a2 = GraphRequest.m13073a((AccessToken) null, C4716f.m7697f(), (GraphRequest.C6344f) null);
                            a2.mo20831a(true);
                            a2.mo20826a(bundle);
                            JSONObject b = a2.mo20825a().mo20919b();
                            if (b != null) {
                                C6543s.f12146g.f12151b = Boolean.valueOf(b.optBoolean("auto_event_setup_enabled", false));
                                C6543s.f12146g.f12153d = this.f12149f;
                                C6543s.m13854d(C6543s.f12146g);
                            }
                        }
                    }
                    C6543s.f12142c.set(false);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.s$b */
    /* compiled from: UserSettingsManager */
    private static class C6545b {

        /* renamed from: a */
        String f12150a;

        /* renamed from: b */
        Boolean f12151b;

        /* renamed from: c */
        boolean f12152c;

        /* renamed from: d */
        long f12153d;

        C6545b(boolean z, String str) {
            this.f12152c = z;
            this.f12150a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo21246a() {
            Boolean bool = this.f12151b;
            return bool == null ? this.f12152c : bool.booleanValue();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m13854d(C6545b bVar) {
        m13865n();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DonationsAnalytics.VALUE, bVar.f12151b);
            jSONObject.put("last_timestamp", bVar.f12153d);
            f12148i.edit().putString(bVar.f12150a, jSONObject.toString()).commit();
            m13863l();
        } catch (Exception e) {
            C6476x.m13507a(f12140a, e);
        }
    }

    /* renamed from: e */
    public static boolean m13856e() {
        m13861j();
        return f12143d.mo21246a();
    }

    /* renamed from: f */
    public static boolean m13857f() {
        m13861j();
        return f12144e.mo21246a();
    }

    /* renamed from: g */
    public static boolean m13858g() {
        m13861j();
        return f12146g.mo21246a();
    }

    /* renamed from: h */
    public static boolean m13859h() {
        m13861j();
        return f12147h.mo21246a();
    }

    /* renamed from: i */
    private static void m13860i() {
        m13853c(f12146g);
        long currentTimeMillis = System.currentTimeMillis();
        C6545b bVar = f12146g;
        if (bVar.f12151b == null || currentTimeMillis - bVar.f12153d >= 604800000) {
            C6545b bVar2 = f12146g;
            bVar2.f12151b = null;
            bVar2.f12153d = 0;
            if (f12142c.compareAndSet(false, true)) {
                C4716f.m7704m().execute(new C6544a(currentTimeMillis));
            }
        }
    }

    /* renamed from: j */
    public static void m13861j() {
        if (C4716f.m7713v() && f12141b.compareAndSet(false, true)) {
            f12148i = C4716f.m7696e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            m13849a(f12144e, f12145f, f12143d);
            m13860i();
            m13864m();
            m13863l();
        }
    }

    /* renamed from: k */
    static void m13862k() {
        try {
            Context e = C4716f.m7696e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                C6596m mVar = new C6596m(e);
                Bundle bundle = new Bundle();
                if (!C6476x.m13538f()) {
                    bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    Log.w(f12140a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                mVar.mo21337a("fb_auto_applink", bundle);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: l */
    private static void m13863l() {
        int i;
        if (f12141b.get() && C4716f.m7713v()) {
            Context e = C4716f.m7696e();
            int i2 = 0;
            int i3 = ((f12143d.mo21246a() ? 1 : 0) << false) | 0 | ((f12144e.mo21246a() ? 1 : 0) << true) | ((f12145f.mo21246a() ? 1 : 0) << true) | ((f12147h.mo21246a() ? 1 : 0) << true);
            int i4 = f12148i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i4 != i3) {
                f12148i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).commit();
                try {
                    ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        int i5 = 0;
                        int i6 = 0;
                        i = 0;
                        while (i5 < 4) {
                            try {
                                i |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                i6 |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                i5++;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        i2 = i6;
                        C6596m mVar = new C6596m(e);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        mVar.mo21342b("fb_sdk_settings_changed", bundle);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                i = 0;
                C6596m mVar2 = new C6596m(e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i4);
                bundle2.putInt("current", i3);
                mVar2.mo21342b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    /* renamed from: m */
    private static void m13864m() {
        try {
            Context e = C4716f.m7696e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f12140a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f12140a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!m13855d()) {
                    Log.w(f12140a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: n */
    private static void m13865n() {
        if (!f12141b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    /* renamed from: b */
    private static void m13851b(C6545b bVar) {
        m13865n();
        try {
            Context e = C4716f.m7696e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(bVar.f12150a)) {
                bVar.f12151b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.f12150a, bVar.f12152c));
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C6476x.m13507a(f12140a, (Exception) e2);
        }
    }

    /* renamed from: c */
    private static void m13853c(C6545b bVar) {
        m13865n();
        try {
            String string = f12148i.getString(bVar.f12150a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                bVar.f12151b = Boolean.valueOf(jSONObject.getBoolean(DonationsAnalytics.VALUE));
                bVar.f12153d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException e) {
            C6476x.m13507a(f12140a, (Exception) e);
        }
    }

    /* renamed from: a */
    private static void m13849a(C6545b... bVarArr) {
        for (C6545b bVar : bVarArr) {
            if (bVar == f12146g) {
                m13860i();
            } else if (bVar.f12151b == null) {
                m13853c(bVar);
                if (bVar.f12151b == null) {
                    m13851b(bVar);
                }
            } else {
                m13854d(bVar);
            }
        }
    }

    /* renamed from: d */
    public static boolean m13855d() {
        m13861j();
        return f12145f.mo21246a();
    }
}
