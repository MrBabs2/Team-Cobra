package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzp implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        zzm zzm = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                zzm = (zzm) SafeParcelReader.m16099a(parcel, a, zzm.CREATOR);
            } else if (a2 == 3) {
                iBinder = SafeParcelReader.m16126v(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                iBinder2 = SafeParcelReader.m16126v(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
