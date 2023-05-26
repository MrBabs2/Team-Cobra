package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zze implements Parcelable.Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 == 2) {
                z2 = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 == 3) {
                z3 = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 == 4) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                i = SafeParcelReader.m16127w(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
