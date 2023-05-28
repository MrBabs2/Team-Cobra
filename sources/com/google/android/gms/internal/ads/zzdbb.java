package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzdbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdbb> CREATOR = new zzdbc();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f21315f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f21316g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f21317h;

    @SafeParcelable.Constructor
    zzdbb(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.f21315f = i;
        this.f21316g = str;
        this.f21317h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f21315f);
        SafeParcelWriter.m16143a(parcel, 2, this.f21316g, false);
        SafeParcelWriter.m16143a(parcel, 3, this.f21317h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzdbb(String str, String str2) {
        this(1, str, str2);
    }
}
