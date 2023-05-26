package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzvw implements Parcelable.Creator<zzvv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 2:
                    str = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 4:
                    str2 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 5:
                    str3 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 6:
                    str4 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 7:
                    bundle = SafeParcelReader.m16110f(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m16123s(parcel2, a);
                    break;
                case 9:
                    j2 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new zzvv(str, j, str2, str3, str4, bundle, z, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzvv[i];
    }
}
