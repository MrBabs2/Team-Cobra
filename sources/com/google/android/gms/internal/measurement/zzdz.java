package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzdz implements Parcelable.Creator<zzdy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    j = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 2:
                    j2 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 3:
                    z = SafeParcelReader.m16123s(parcel2, a);
                    break;
                case 4:
                    str = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 5:
                    str2 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 6:
                    str3 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 7:
                    bundle = SafeParcelReader.m16110f(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new zzdy(j, j2, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdy[i];
    }
}
