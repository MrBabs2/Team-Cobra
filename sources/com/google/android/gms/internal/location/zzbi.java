package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbi implements Parcelable.Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    str = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 3:
                    s = SafeParcelReader.m16094A(parcel2, a);
                    break;
                case 4:
                    d = SafeParcelReader.m16124t(parcel2, a);
                    break;
                case 5:
                    d2 = SafeParcelReader.m16124t(parcel2, a);
                    break;
                case 6:
                    f = SafeParcelReader.m16125u(parcel2, a);
                    break;
                case 7:
                    i = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 8:
                    i2 = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 9:
                    i3 = SafeParcelReader.m16127w(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new zzbh(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
