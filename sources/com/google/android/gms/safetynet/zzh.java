package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f23676f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f23677g;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z) {
        this.f23676f = i;
        this.f23677g = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 2, this.f23676f);
        SafeParcelWriter.m16146a(parcel, 3, this.f23677g);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
