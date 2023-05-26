package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzam implements Parcelable.Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        ArrayList<String> arrayList = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m16121q(parcel, a);
            } else if (a2 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m16099a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                str = SafeParcelReader.m16119o(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzal(arrayList, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
