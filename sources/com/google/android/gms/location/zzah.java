package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzah implements Parcelable.Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                status = (Status) SafeParcelReader.m16099a(parcel, a, Status.CREATOR);
            } else if (a2 != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m16099a(parcel, a, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
