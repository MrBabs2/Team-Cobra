package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zak implements Parcelable.Creator<zaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m16099a(parcel, a, ConnectionResult.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) SafeParcelReader.m16099a(parcel, a, ResolveAccountResponse.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zaj(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}
