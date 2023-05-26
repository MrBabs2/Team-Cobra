package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzaax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaax> CREATOR = new zzaay();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f17677f;

    @SafeParcelable.Constructor
    public zzaax(@SafeParcelable.Param(id = 2) int i) {
        this.f17677f = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 2, this.f17677f);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
