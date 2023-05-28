package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23065f = 1;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23066g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final byte[] f23067h;

    @SafeParcelable.Constructor
    zzaf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr) {
        Preconditions.m16037a(str);
        this.f23066g = str;
        Preconditions.m16037a(bArr);
        this.f23067h = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23065f);
        SafeParcelWriter.m16143a(parcel, 2, this.f23066g, false);
        SafeParcelWriter.m16147a(parcel, 3, this.f23067h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
