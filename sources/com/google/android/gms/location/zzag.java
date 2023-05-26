package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzag implements Parcelable.Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        ArrayList<LocationRequest> arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m16107c(parcel, a, LocationRequest.CREATOR);
            } else if (a2 == 2) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 == 3) {
                z2 = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                zzae = (zzae) SafeParcelReader.m16099a(parcel, a, zzae.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
