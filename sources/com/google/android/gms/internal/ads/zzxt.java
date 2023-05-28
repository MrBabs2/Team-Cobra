package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new zzxu();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f22977f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f22978g;

    @SafeParcelable.Constructor
    public zzxt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f22977f = str;
        this.f22978g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f22977f, false);
        SafeParcelWriter.m16143a(parcel, 2, this.f22978g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
