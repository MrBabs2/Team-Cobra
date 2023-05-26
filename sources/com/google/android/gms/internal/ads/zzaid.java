package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaid implements Parcelable.Creator<zzaic> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    z = SafeParcelReader.m16123s(parcel2, a);
                    break;
                case 2:
                    str = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 3:
                    i = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 4:
                    bArr = SafeParcelReader.m16111g(parcel2, a);
                    break;
                case 5:
                    strArr = SafeParcelReader.m16120p(parcel2, a);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.m16120p(parcel2, a);
                    break;
                case 7:
                    z2 = SafeParcelReader.m16123s(parcel2, a);
                    break;
                case 8:
                    j = SafeParcelReader.m16129y(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new zzaic(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaic[i];
    }
}
