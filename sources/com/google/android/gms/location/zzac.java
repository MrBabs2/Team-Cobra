package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzac implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        List<Location> list = LocationResult.f23620g;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 1) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                list = SafeParcelReader.m16107c(parcel, a, Location.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
