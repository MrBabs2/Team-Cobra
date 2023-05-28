package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zza implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m16103b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            switch (SafeParcelReader.m16097a(a)) {
                case 1:
                    i = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 4:
                    str = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 5:
                    i3 = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m16121q(parcel2, a);
                    break;
                case 8:
                    j2 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 10:
                    str3 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 11:
                    i2 = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 12:
                    str2 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 13:
                    str4 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 14:
                    i4 = SafeParcelReader.m16127w(parcel2, a);
                    break;
                case 15:
                    f = SafeParcelReader.m16125u(parcel2, a);
                    break;
                case 16:
                    j3 = SafeParcelReader.m16129y(parcel2, a);
                    break;
                case 17:
                    str5 = SafeParcelReader.m16119o(parcel2, a);
                    break;
                case 18:
                    z = SafeParcelReader.m16123s(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m16096C(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m16122r(parcel2, b);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
