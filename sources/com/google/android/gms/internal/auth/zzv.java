package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23128f = 1;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23129g;

    @SafeParcelable.Constructor
    zzv(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.m16037a(str);
        this.f23129g = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23128f);
        SafeParcelWriter.m16143a(parcel, 2, this.f23129g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
