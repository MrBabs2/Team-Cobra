package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable.Creator<ProxyRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m16129y(parcel, a);
            } else if (a2 == 4) {
                bArr = SafeParcelReader.m16111g(parcel, a);
            } else if (a2 == 5) {
                bundle = SafeParcelReader.m16110f(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                i = SafeParcelReader.m16127w(parcel, a);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new ProxyRequest(i, str, i2, j, bArr, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
