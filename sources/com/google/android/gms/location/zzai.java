package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzai implements Parcelable.Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    z = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 2:
                    z2 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 3:
                    z3 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 4:
                    z4 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 5:
                    z5 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 6:
                    z6 = SafeParcelReader.m16123s(parcel, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
