package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.cache.DiskLruCache;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;

@zzard
public final class zzans implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f18228a;

    /* renamed from: b */
    private final int f18229b;

    /* renamed from: c */
    private final Set<String> f18230c;

    /* renamed from: d */
    private final boolean f18231d;

    /* renamed from: e */
    private final Location f18232e;

    /* renamed from: f */
    private final int f18233f;

    /* renamed from: g */
    private final zzady f18234g;

    /* renamed from: h */
    private final List<String> f18235h = new ArrayList();

    /* renamed from: i */
    private final boolean f18236i;

    /* renamed from: j */
    private final Map<String, Boolean> f18237j = new HashMap();

    public zzans(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzady zzady, List<String> list, boolean z2, int i3, String str) {
        this.f18228a = date;
        this.f18229b = i;
        this.f18230c = set;
        this.f18232e = location;
        this.f18231d = z;
        this.f18233f = i2;
        this.f18234g = zzady;
        this.f18236i = z2;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f18237j.put(split[1], true);
                        } else if (AdultContentAnalytics.UNLOCK.equals(split[2])) {
                            this.f18237j.put(split[1], false);
                        }
                    }
                } else {
                    this.f18235h.add(next);
                }
            }
        }
    }

    public final float getAdVolume() {
        return zzabe.m18852d().mo27044b();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f18228a;
    }

    @Deprecated
    public final int getGender() {
        return this.f18229b;
    }

    public final Set<String> getKeywords() {
        return this.f18230c;
    }

    public final Location getLocation() {
        return this.f18232e;
    }

    public final NativeAdOptions getNativeAdOptions() {
        zzacd zzacd;
        if (this.f18234g == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.f18234g.f18043g).setImageOrientation(this.f18234g.f18044h).setRequestMultipleImages(this.f18234g.f18045i);
        zzady zzady = this.f18234g;
        if (zzady.f18042f >= 2) {
            requestMultipleImages.setAdChoicesPlacement(zzady.f18046j);
        }
        zzady zzady2 = this.f18234g;
        if (zzady2.f18042f >= 3 && (zzacd = zzady2.f18047k) != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(zzacd));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return zzabe.m18852d().mo27045c();
    }

    public final boolean isAppInstallAdRequested() {
        List<String> list = this.f18235h;
        if (list != null) {
            return list.contains("2") || this.f18235h.contains("6");
        }
        return false;
    }

    public final boolean isContentAdRequested() {
        List<String> list = this.f18235h;
        if (list != null) {
            return list.contains(DiskLruCache.VERSION_1) || this.f18235h.contains("6");
        }
        return false;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f18236i;
    }

    public final boolean isTesting() {
        return this.f18231d;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.f18235h;
        return list != null && list.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f18233f;
    }

    public final boolean zzsu() {
        List<String> list = this.f18235h;
        return list != null && list.contains("3");
    }

    public final Map<String, Boolean> zzsv() {
        return this.f18237j;
    }
}
