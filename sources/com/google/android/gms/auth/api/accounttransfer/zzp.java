package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzp implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    i = SafeParcelReader.m16127w(parcel, a);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m16121q(parcel, a);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.m16121q(parcel, a);
                    break;
                case 4:
                    arrayList3 = SafeParcelReader.m16121q(parcel, a);
                    break;
                case 5:
                    arrayList4 = SafeParcelReader.m16121q(parcel, a);
                    break;
                case 6:
                    arrayList5 = SafeParcelReader.m16121q(parcel, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzo(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
