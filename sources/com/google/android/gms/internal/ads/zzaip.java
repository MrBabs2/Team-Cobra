package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaip implements Parcelable.Creator<zzaio> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 2) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 == 3) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str2 = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzaio(str, z, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaio[i];
    }
}
