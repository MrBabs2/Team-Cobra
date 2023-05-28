package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzard
public final class zzank implements MediationAdRequest {

    /* renamed from: a */
    private final Date f18208a;

    /* renamed from: b */
    private final int f18209b;

    /* renamed from: c */
    private final Set<String> f18210c;

    /* renamed from: d */
    private final boolean f18211d;

    /* renamed from: e */
    private final Location f18212e;

    /* renamed from: f */
    private final int f18213f;

    /* renamed from: g */
    private final boolean f18214g;

    public zzank(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f18208a = date;
        this.f18209b = i;
        this.f18210c = set;
        this.f18212e = location;
        this.f18211d = z;
        this.f18213f = i2;
        this.f18214g = z2;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f18208a;
    }

    @Deprecated
    public final int getGender() {
        return this.f18209b;
    }

    public final Set<String> getKeywords() {
        return this.f18210c;
    }

    public final Location getLocation() {
        return this.f18212e;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f18214g;
    }

    public final boolean isTesting() {
        return this.f18211d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f18213f;
    }
}
