package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zah> CREATOR = new zai();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f23694f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final ResolveAccountRequest f23695g;

    @SafeParcelable.Constructor
    zah(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.f23694f = i;
        this.f23695g = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f23694f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f23695g, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }
}
