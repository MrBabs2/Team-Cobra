package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13574f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f13575g;
    @SafeParcelable.Field

    /* renamed from: h */
    private Bundle f13576h;

    @SafeParcelable.Constructor
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Bundle bundle) {
        this.f13574f = i;
        this.f13575g = i2;
        this.f13576h = bundle;
    }

    @KeepForSdk
    /* renamed from: d */
    public int mo24781d() {
        return this.f13575g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13574f);
        SafeParcelWriter.m16135a(parcel, 2, mo24781d());
        SafeParcelWriter.m16137a(parcel, 3, this.f13576h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
