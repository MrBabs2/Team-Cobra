package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzasa implements Parcelable.Creator<zzarz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzarz(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzarz[i];
    }
}
