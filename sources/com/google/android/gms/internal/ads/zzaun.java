package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaun implements Parcelable.Creator<zzaum> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str2 = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzaum(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaum[i];
    }
}
