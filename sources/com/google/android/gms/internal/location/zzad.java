package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzad extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    @SafeParcelable.Field

    /* renamed from: f */
    private final Status f23160f;

    static {
        new zzad(Status.f13682j);
    }

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) Status status) {
        this.f23160f = status;
    }

    public final Status getStatus() {
        return this.f23160f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 1, (Parcelable) getStatus(), i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
