package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaiz implements Parcelable.Creator<zzaiy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 1) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                i = SafeParcelReader.m16127w(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzaiy(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaiy[i];
    }
}
