package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23063f = 1;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23064g;

    @SafeParcelable.Constructor
    zzad(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.m16037a(str);
        this.f23064g = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23063f);
        SafeParcelWriter.m16143a(parcel, 2, this.f23064g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
