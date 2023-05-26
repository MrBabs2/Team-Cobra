package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzab implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    i = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 3:
                    j2 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 4:
                    z = SafeParcelReader.m16123s(parcel2, a);
                    break;
                case 5:
                    j3 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 7:
                    f = SafeParcelReader.m16125u(parcel2, a);
                    break;
                case 8:
                    j4 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
