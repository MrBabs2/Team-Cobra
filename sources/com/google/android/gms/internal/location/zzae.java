package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzae implements Parcelable.Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 1) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                status = (Status) SafeParcelReader.m16099a(parcel, a, Status.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
