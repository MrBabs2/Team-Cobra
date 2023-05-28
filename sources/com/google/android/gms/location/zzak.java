package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzak implements Parcelable.Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m16129y(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                j2 = SafeParcelReader.m16129y(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzaj(i, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
