package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@zzard
public final class zzaiw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiw> CREATOR = new zzaix();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f18142f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final Bundle f18143g;

    @SafeParcelable.Constructor
    public zzaiw(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f18142f = str;
        this.f18143g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f18142f, false);
        SafeParcelWriter.m16137a(parcel, 2, this.f18143g, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
