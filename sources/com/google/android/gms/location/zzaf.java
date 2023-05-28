package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaf implements Parcelable.Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str2 = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 2) {
                str3 = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
