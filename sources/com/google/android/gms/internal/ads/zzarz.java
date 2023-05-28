package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzarz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarz> CREATOR = new zzasa();
    @SafeParcelable.Field

    /* renamed from: f */
    String f18447f;

    @SafeParcelable.Constructor
    public zzarz(@SafeParcelable.Param(id = 2) String str) {
        this.f18447f = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f18447f, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
