package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzaym extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaym> CREATOR = new zzayo();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f18680f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f18681g;

    @SafeParcelable.Constructor
    zzaym(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i) {
        this.f18680f = str == null ? "" : str;
        this.f18681g = i;
    }

    /* renamed from: a */
    public static zzaym m20408a(Throwable th, int i) {
        return new zzaym(th.getMessage(), i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f18680f, false);
        SafeParcelWriter.m16135a(parcel, 2, this.f18681g);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
