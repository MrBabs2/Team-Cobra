package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzai implements Parcelable.Creator<zzah> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m16099a(parcel, a, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzah(i, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
