package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzarl implements Parcelable.Creator<zzark> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 2) {
                z = SafeParcelReader.m16123s(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                arrayList = SafeParcelReader.m16121q(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzark(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzark[i];
    }
}
