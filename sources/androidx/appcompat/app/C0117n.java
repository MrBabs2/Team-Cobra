package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0395b;
import java.util.Calendar;
import p015cm.aptoide.p016pt.notification.PullingContentService;

/* renamed from: androidx.appcompat.app.n */
/* compiled from: TwilightManager */
class C0117n {

    /* renamed from: d */
    private static C0117n f356d;

    /* renamed from: a */
    private final Context f357a;

    /* renamed from: b */
    private final LocationManager f358b;

    /* renamed from: c */
    private final C0118a f359c = new C0118a();

    /* renamed from: androidx.appcompat.app.n$a */
    /* compiled from: TwilightManager */
    private static class C0118a {

        /* renamed from: a */
        boolean f360a;

        /* renamed from: b */
        long f361b;

        /* renamed from: c */
        long f362c;

        /* renamed from: d */
        long f363d;

        /* renamed from: e */
        long f364e;

        /* renamed from: f */
        long f365f;

        C0118a() {
        }
    }

    C0117n(Context context, LocationManager locationManager) {
        this.f357a = context;
        this.f358b = locationManager;
    }

    /* renamed from: a */
    static C0117n m455a(Context context) {
        if (f356d == null) {
            Context applicationContext = context.getApplicationContext();
            f356d = new C0117n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f356d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m457b() {
        Location location = null;
        Location a = C0395b.m1918a(this.f357a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m454a("network") : null;
        if (C0395b.m1918a(this.f357a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m454a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: c */
    private boolean m458c() {
        return this.f359c.f365f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo419a() {
        C0118a aVar = this.f359c;
        if (m458c()) {
            return aVar.f360a;
        }
        Location b = m457b();
        if (b != null) {
            m456a(b);
            return aVar.f360a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: a */
    private Location m454a(String str) {
        try {
            if (this.f358b.isProviderEnabled(str)) {
                return this.f358b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m456a(Location location) {
        long j;
        C0118a aVar = this.f359c;
        long currentTimeMillis = System.currentTimeMillis();
        C0116m a = C0116m.m452a();
        C0116m mVar = a;
        mVar.mo418a(currentTimeMillis - PullingContentService.UPDATES_INTERVAL, location.getLatitude(), location.getLongitude());
        long j2 = a.f353a;
        mVar.mo418a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f355c == 1;
        long j3 = a.f354b;
        long j4 = j2;
        long j5 = a.f353a;
        long j6 = j3;
        boolean z2 = z;
        a.mo418a(PullingContentService.UPDATES_INTERVAL + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f354b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f360a = z2;
        aVar.f361b = j4;
        aVar.f362c = j6;
        aVar.f363d = j5;
        aVar.f364e = j7;
        aVar.f365f = j;
    }
}
