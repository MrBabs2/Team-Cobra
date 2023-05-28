package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zap implements Parcelable.Creator<SafeParcelResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        Parcel parcel2 = null;
        zak zak = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                parcel2 = SafeParcelReader.m16117m(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                zak = (zak) SafeParcelReader.m16099a(parcel, a, zak.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new SafeParcelResponse(i, parcel2, zak);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
