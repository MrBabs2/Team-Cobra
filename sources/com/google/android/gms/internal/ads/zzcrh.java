package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzcrh implements zzcuz<Bundle> {

    /* renamed from: a */
    private final zzcxv f20846a;

    public zzcrh(zzcxv zzcxv) {
        Preconditions.m16038a(zzcxv, (Object) "the targeting must not be null");
        this.f20846a = zzcxv;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzcxv zzcxv = this.f20846a;
        zzxz zzxz = zzcxv.f21167d;
        bundle.putString("slotname", zzcxv.f21169f);
        boolean z = true;
        if (this.f20846a.f21178o.contains("new_rewarded")) {
            bundle.putBoolean("is_new_rewarded", true);
        }
        zzcxz.m23106a(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzxz.f22982g)), zzxz.f22982g != -1);
        zzcxz.m23102a(bundle, "extras", zzxz.f22983h);
        zzcxz.m23104a(bundle, "cust_gender", Integer.valueOf(zzxz.f22984i), zzxz.f22984i != -1);
        zzcxz.m23107a(bundle, "kw", zzxz.f22985j);
        zzcxz.m23104a(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzxz.f22987l), zzxz.f22987l != -1);
        boolean z2 = zzxz.f22986k;
        if (z2) {
            bundle.putBoolean("test_request", z2);
        }
        zzcxz.m23104a(bundle, "d_imp_hdr", (Integer) 1, zzxz.f22981f >= 2 && zzxz.f22988m);
        String str = zzxz.f22989n;
        zzcxz.m23106a(bundle, "ppid", str, zzxz.f22981f >= 2 && !TextUtils.isEmpty(str));
        Location location = zzxz.f22991p;
        if (location != null) {
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", valueOf.floatValue());
            bundle2.putLong("lat", valueOf3.longValue());
            bundle2.putLong("long", valueOf4.longValue());
            bundle2.putLong("time", valueOf2.longValue());
            bundle.putBundle("uule", bundle2);
        }
        zzcxz.m23105a(bundle, "url", zzxz.f22992q);
        zzcxz.m23102a(bundle, "custom_targeting", zzxz.f22994s);
        zzcxz.m23107a(bundle, "category_exclusions", zzxz.f22995t);
        zzcxz.m23105a(bundle, "request_agent", zzxz.f22996u);
        zzcxz.m23105a(bundle, "request_pkg", zzxz.f22997v);
        zzcxz.m23103a(bundle, "is_designed_for_families", Boolean.valueOf(zzxz.f22998w), zzxz.f22981f >= 7);
        if (zzxz.f22981f >= 8) {
            Integer valueOf5 = Integer.valueOf(zzxz.f23000y);
            if (zzxz.f23000y == -1) {
                z = false;
            }
            zzcxz.m23104a(bundle, "tag_for_under_age_of_consent", valueOf5, z);
            zzcxz.m23105a(bundle, "max_ad_content_rating", zzxz.f23001z);
        }
    }
}
