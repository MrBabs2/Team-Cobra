package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzl implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 2) {
                iBinder = SafeParcelReader.m16126v(parcel, a);
            } else if (a2 == 3) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                z2 = SafeParcelReader.m16123s(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzk(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
