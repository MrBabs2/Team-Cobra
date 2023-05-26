package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzarw implements Parcelable.Creator<zzaru> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m16099a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzaru(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaru[i];
    }
}
