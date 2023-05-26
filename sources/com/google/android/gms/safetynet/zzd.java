package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: f */
    public final long f23671f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final HarmfulAppsData[] f23672g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f23673h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final boolean f23674i;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) boolean z) {
        this.f23671f = j;
        this.f23672g = harmfulAppsDataArr;
        this.f23674i = z;
        if (z) {
            this.f23673h = i;
        } else {
            this.f23673h = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16136a(parcel, 2, this.f23671f);
        SafeParcelWriter.m16148a(parcel, 3, (T[]) this.f23672g, i, false);
        SafeParcelWriter.m16135a(parcel, 4, this.f23673h);
        SafeParcelWriter.m16146a(parcel, 5, this.f23674i);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
