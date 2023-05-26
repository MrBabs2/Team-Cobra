package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzk implements Parcelable.Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                z = SafeParcelReader.m16123s(parcel2, a);
            } else if (a2 == 2) {
                j = SafeParcelReader.m16129y(parcel2, a);
            } else if (a2 == 3) {
                f = SafeParcelReader.m16125u(parcel2, a);
            } else if (a2 == 4) {
                j2 = SafeParcelReader.m16129y(parcel2, a);
            } else if (a2 != 5) {
                SafeParcelReader.m16096C(parcel2, a);
            } else {
                i = SafeParcelReader.m16127w(parcel2, a);
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new zzj(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
