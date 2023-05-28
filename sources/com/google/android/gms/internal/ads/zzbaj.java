package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbaj implements Parcelable.Creator<zzbai> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 2) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 3) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 4) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 5) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 != 6) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                z2 = SafeParcelReader.m16123s(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzbai(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbai[i];
    }
}
