package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzk implements Parcelable.Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    i = SafeParcelReader.m16127w(parcel, a);
                    break;
                case 2:
                    str = SafeParcelReader.m16119o(parcel, a);
                    break;
                case 3:
                    l = SafeParcelReader.m16130z(parcel, a);
                    break;
                case 4:
                    z = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m16121q(parcel, a);
                    break;
                case 7:
                    str2 = SafeParcelReader.m16119o(parcel, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
