package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f23640f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f23641g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f23642h;

    @SafeParcelable.Constructor
    zzae(@SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 1) String str2, @SafeParcelable.Param(id = 2) String str3) {
        this.f23642h = str;
        this.f23640f = str2;
        this.f23641g = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f23640f, false);
        SafeParcelWriter.m16143a(parcel, 2, this.f23641g, false);
        SafeParcelWriter.m16143a(parcel, 5, this.f23642h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
