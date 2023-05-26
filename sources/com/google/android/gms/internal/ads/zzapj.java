package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzapj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzapj> CREATOR = new zzapk();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f18245f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f18246g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final int f18247h;

    @SafeParcelable.Constructor
    zzapj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f18245f = i;
        this.f18246g = i2;
        this.f18247h = i3;
    }

    /* renamed from: a */
    public static zzapj m19800a(VersionInfo versionInfo) {
        return new zzapj(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final String toString() {
        int i = this.f18245f;
        int i2 = this.f18246g;
        int i3 = this.f18247h;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f18245f);
        SafeParcelWriter.m16135a(parcel, 2, this.f18246g);
        SafeParcelWriter.m16135a(parcel, 3, this.f18247h);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
