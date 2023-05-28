package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzayo implements Parcelable.Creator<zzaym> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                i = SafeParcelReader.m16127w(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzaym(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaym[i];
    }
}
