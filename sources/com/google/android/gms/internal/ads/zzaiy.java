package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzaiy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiy> CREATOR = new zzaiz();
    @SafeParcelable.Field

    /* renamed from: f */
    public final int f18144f;

    @SafeParcelable.Constructor
    public zzaiy(@SafeParcelable.Param(id = 1) int i) {
        this.f18144f = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f18144f);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
