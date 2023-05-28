package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzc implements Parcelable.Creator<zzb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                bundle = SafeParcelReader.m16110f(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                featureArr = (Feature[]) SafeParcelReader.m16104b(parcel, a, Feature.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzb(bundle, featureArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
