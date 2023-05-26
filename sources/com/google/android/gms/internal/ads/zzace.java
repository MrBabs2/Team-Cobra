package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzace implements Parcelable.Creator<zzacd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 2) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 == 3) {
                z2 = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                z3 = SafeParcelReader.m16123s(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzacd(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacd[i];
    }
}
