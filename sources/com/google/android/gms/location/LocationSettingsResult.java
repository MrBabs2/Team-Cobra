package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzah();
    @SafeParcelable.Field

    /* renamed from: f */
    private final Status f23628f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final LocationSettingsStates f23629g;

    @SafeParcelable.Constructor
    public LocationSettingsResult(@SafeParcelable.Param(id = 1) Status status, @SafeParcelable.Param(id = 2) LocationSettingsStates locationSettingsStates) {
        this.f23628f = status;
        this.f23629g = locationSettingsStates;
    }

    /* renamed from: d */
    public final LocationSettingsStates mo30568d() {
        return this.f23629g;
    }

    public final Status getStatus() {
        return this.f23628f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 1, (Parcelable) getStatus(), i, false);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) mo30568d(), i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
