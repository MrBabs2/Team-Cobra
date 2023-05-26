package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Parcelable.Creator<zzh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 2:
                    z = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 3:
                    z2 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 4:
                    str = SafeParcelReader.m16119o(parcel, a);
                    break;
                case 5:
                    z3 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 6:
                    f = SafeParcelReader.m16125u(parcel, a);
                    break;
                case 7:
                    i = SafeParcelReader.m16127w(parcel, a);
                    break;
                case 8:
                    z4 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 9:
                    z5 = SafeParcelReader.m16123s(parcel, a);
                    break;
                case 10:
                    z6 = SafeParcelReader.m16123s(parcel, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzh(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
