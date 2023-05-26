package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzaio extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaio> CREATOR = new zzaip();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f18138f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final boolean f18139g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final int f18140h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final String f18141i;

    @SafeParcelable.Constructor
    public zzaio(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2) {
        this.f18138f = str;
        this.f18139g = z;
        this.f18140h = i;
        this.f18141i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f18138f, false);
        SafeParcelWriter.m16146a(parcel, 2, this.f18139g);
        SafeParcelWriter.m16135a(parcel, 3, this.f18140h);
        SafeParcelWriter.m16143a(parcel, 4, this.f18141i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
