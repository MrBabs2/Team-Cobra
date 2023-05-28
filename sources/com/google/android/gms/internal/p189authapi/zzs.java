package com.google.android.gms.internal.p189authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.auth-api.zzs */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: f */
    private final Credential f23057f;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) Credential credential) {
        this.f23057f = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 1, (Parcelable) this.f23057f, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
