package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzday extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzday> CREATOR = new zzdaz();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f21313f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final byte[] f21314g;

    @SafeParcelable.Constructor
    zzday(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f21313f = i;
        this.f21314g = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f21313f);
        SafeParcelWriter.m16147a(parcel, 2, this.f21314g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzday(byte[] bArr) {
        this(1, bArr);
    }
}
