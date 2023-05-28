package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m16099a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 1000) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                i = SafeParcelReader.m16127w(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
