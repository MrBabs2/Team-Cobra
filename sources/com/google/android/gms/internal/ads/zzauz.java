package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzauz implements Parcelable.Creator<zzauy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 2:
                    str = SafeParcelReader.m16119o(parcel, a);
                    break;
                case 3:
                    str2 = SafeParcelReader.m16119o(parcel, a);
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
                    z3 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 8:
                    z4 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m16121q(parcel, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzauy(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzauy[i];
    }
}
