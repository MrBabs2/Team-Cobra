package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zab implements Parcelable.Creator<zaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.m16099a(parcel, a, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zaa(i, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
