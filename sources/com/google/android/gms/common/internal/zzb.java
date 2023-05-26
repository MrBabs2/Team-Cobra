package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: f */
    Bundle f14192f;
    @SafeParcelable.Field

    /* renamed from: g */
    Feature[] f14193g;

    @SafeParcelable.Constructor
    zzb(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Feature[] featureArr) {
        this.f14192f = bundle;
        this.f14193g = featureArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16137a(parcel, 1, this.f14192f, false);
        SafeParcelWriter.m16148a(parcel, 2, (T[]) this.f14193g, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzb() {
    }
}
