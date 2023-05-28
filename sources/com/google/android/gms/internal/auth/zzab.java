package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23060f = 1;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23061g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final int f23062h;

    @SafeParcelable.Constructor
    zzab(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        Preconditions.m16037a(str);
        this.f23061g = str;
        this.f23062h = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23060f);
        SafeParcelWriter.m16143a(parcel, 2, this.f23061g, false);
        SafeParcelWriter.m16135a(parcel, 3, this.f23062h);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
