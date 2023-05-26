package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable.Creator<AccountChangeEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    i = SafeParcelReader.m16127w(parcel, a);
                    break;
                case 2:
                    j = SafeParcelReader.m16129y(parcel, a);
                    break;
                case 3:
                    str = SafeParcelReader.m16119o(parcel, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m16127w(parcel, a);
                    break;
                case 5:
                    i3 = SafeParcelReader.m16127w(parcel, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m16119o(parcel, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new AccountChangeEvent(i, j, str, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
