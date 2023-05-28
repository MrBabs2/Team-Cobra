package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzapk implements Parcelable.Creator<zzapj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                i3 = SafeParcelReader.m16127w(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzapj(i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzapj[i];
    }
}
