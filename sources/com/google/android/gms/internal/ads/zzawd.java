package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzawd implements Parcelable.Creator<zzawc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        String str2 = null;
        zzyd zzyd = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 2) {
                str2 = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                zzyd = (zzyd) SafeParcelReader.m16099a(parcel, a, zzyd.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzawc(str, str2, zzyd);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzawc[i];
    }
}
