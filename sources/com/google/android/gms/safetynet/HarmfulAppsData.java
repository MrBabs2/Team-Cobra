package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f23656f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final byte[] f23657g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f23658h;

    @SafeParcelable.Constructor
    public HarmfulAppsData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i) {
        this.f23656f = str;
        this.f23657g = bArr;
        this.f23658h = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f23656f, false);
        SafeParcelWriter.m16147a(parcel, 3, this.f23657g, false);
        SafeParcelWriter.m16135a(parcel, 4, this.f23658h);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
