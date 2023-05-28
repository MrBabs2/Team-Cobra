package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzath extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzath> CREATOR = new zzati();
    @SafeParcelable.Field

    /* renamed from: f */
    public final zzxz f18509f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f18510g;

    @SafeParcelable.Constructor
    public zzath(@SafeParcelable.Param(id = 2) zzxz zzxz, @SafeParcelable.Param(id = 3) String str) {
        this.f18509f = zzxz;
        this.f18510g = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f18509f, i, false);
        SafeParcelWriter.m16143a(parcel, 3, this.f18510g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
