package com.flurry.sdk;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.y5 */
public final class C7093y5 extends C6993q6 {

    /* renamed from: b */
    public final int f13357b;

    /* renamed from: c */
    public boolean f13358c;

    /* renamed from: d */
    public boolean f13359d;

    /* renamed from: e */
    public final Location f13360e;

    public C7093y5(int i, boolean z, boolean z2, Location location) {
        this.f13357b = i;
        this.f13358c = z;
        this.f13359d = z2;
        this.f13360e = location;
    }

    /* renamed from: a */
    public final JSONObject mo23540a() throws JSONException {
        Location location;
        double d;
        boolean z;
        double d2;
        JSONObject a = super.mo23540a();
        a.put("fl.report.location.enabled", this.f13358c);
        if (this.f13358c) {
            a.put("fl.location.permission.status", this.f13359d);
            if (this.f13359d && (location = this.f13360e) != null) {
                boolean z2 = false;
                double d3 = 0.0d;
                if (Build.VERSION.SDK_INT >= 26) {
                    d3 = (double) location.getVerticalAccuracyMeters();
                    d2 = (double) this.f13360e.getBearingAccuracyDegrees();
                    boolean hasBearingAccuracy = this.f13360e.hasBearingAccuracy();
                    z = this.f13360e.hasSpeedAccuracy();
                    d = (double) this.f13360e.getSpeedAccuracyMetersPerSecond();
                    z2 = hasBearingAccuracy;
                } else {
                    d2 = 0.0d;
                    d = 0.0d;
                    z = false;
                }
                a.put("fl.precision.value", this.f13357b);
                a.put("fl.latitude.value", this.f13360e.getLatitude());
                a.put("fl.longitude.value", this.f13360e.getLongitude());
                a.put("fl.horizontal.accuracy.value", (double) this.f13360e.getAccuracy());
                a.put("fl.time.epoch.value", this.f13360e.getTime());
                if (Build.VERSION.SDK_INT >= 17) {
                    a.put("fl.time.uptime.value", TimeUnit.NANOSECONDS.toMillis(this.f13360e.getElapsedRealtimeNanos()));
                }
                a.put("fl.altitude.value", this.f13360e.getAltitude());
                a.put("fl.vertical.accuracy.value", d3);
                a.put("fl.bearing.value", (double) this.f13360e.getBearing());
                a.put("fl.speed.value", (double) this.f13360e.getSpeed());
                a.put("fl.bearing.accuracy.available", z2);
                a.put("fl.speed.accuracy.available", z);
                a.put("fl.bearing.accuracy.degrees", d2);
                a.put("fl.speed.accuracy.meters.per.sec", d);
            }
        }
        return a;
    }
}
