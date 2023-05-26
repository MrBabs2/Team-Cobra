package com.flurry.sdk;

import android.content.SharedPreferences;
import com.flurry.sdk.C6868i2;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.flurry.sdk.f */
public final class C6813f extends C6916l2 {

    /* renamed from: n */
    String f12712n = "";

    /* renamed from: o */
    boolean f12713o = false;

    /* renamed from: p */
    AtomicBoolean f12714p = new AtomicBoolean(false);

    C6813f() {
        super("AdvertisingIdProvider", C6868i2.m14604a(C6868i2.C6870b.PROVIDER));
    }

    /* renamed from: b */
    private static AdvertisingIdClient.Info m14514b() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C6747b0.m14386a());
            return new AdvertisingIdClient.Info(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (NoClassDefFoundError unused) {
            C6792d1.m14483b("AdvertisingIdProvider", "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        } catch (Exception e) {
            C6792d1.m14483b("AdvertisingIdProvider", "GOOGLE PLAY SERVICES ERROR: " + e.getMessage());
            C6792d1.m14483b("AdvertisingIdProvider", "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        }
    }

    /* renamed from: a */
    public final void mo23570a() {
        AdvertisingIdClient.Info b = m14514b();
        if (b != null) {
            this.f12712n = b.getId();
            this.f12713o = !b.isLimitAdTrackingEnabled();
            this.f12714p.set(true);
            if (b != null) {
                C6971p2.m14810a("advertising_id", b.getId());
                boolean isLimitAdTrackingEnabled = b.isLimitAdTrackingEnabled();
                SharedPreferences.Editor edit = C6747b0.m14386a().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
                edit.putBoolean(String.format(Locale.US, "com.flurry.sdk.%s", new Object[]{"ad_tracking_enabled"}), isLimitAdTrackingEnabled);
                edit.apply();
            }
        }
    }
}
