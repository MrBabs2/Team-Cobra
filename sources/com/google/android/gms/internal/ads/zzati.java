package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzati implements Parcelable.Creator<zzath> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        zzxz zzxz = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 2) {
                zzxz = (zzxz) SafeParcelReader.m16099a(parcel, a, zzxz.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzath(zzxz, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzath[i];
    }
}
