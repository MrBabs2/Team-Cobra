package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzawc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawc> CREATOR = new zzawd();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f18569f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f18570g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final zzyd f18571h;

    @SafeParcelable.Constructor
    public zzawc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzyd zzyd) {
        this.f18569f = str;
        this.f18570g = str2;
        this.f18571h = zzyd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f18569f, false);
        SafeParcelWriter.m16143a(parcel, 2, this.f18570g, false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f18571h, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
