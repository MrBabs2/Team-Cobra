package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabi;
import com.google.android.gms.internal.ads.zztx;

public class MobileAds {

    public static final class Settings {
        private final zzabi zzaat = new zzabi();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        /* access modifiers changed from: package-private */
        public final zzabi zzdg() {
            return this.zzaat;
        }
    }

    private MobileAds() {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzabe.m18852d().mo27037a(context);
    }

    @KeepForSdk
    public static String getVersionString() {
        return zzabe.m18852d().mo27038a();
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, (Settings) null);
    }

    public static void openDebugMenu(Context context, String str) {
        zzabe.m18852d().mo27040a(context, str);
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzabe.m18852d().mo27042a(cls);
    }

    public static void setAppMuted(boolean z) {
        zzabe.m18852d().mo27043a(z);
    }

    public static void setAppVolume(float f) {
        zzabe.m18852d().mo27039a(f);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzabi zzabi;
        zzabe d = zzabe.m18852d();
        if (settings == null) {
            zzabi = null;
        } else {
            zzabi = settings.zzdg();
        }
        d.mo27041a(context, str, zzabi, (zztx) null);
    }

    public static void initialize(Context context) {
        initialize(context, (String) null, (Settings) null);
    }
}
