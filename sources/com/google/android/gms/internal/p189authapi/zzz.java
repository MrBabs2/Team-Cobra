package com.google.android.gms.internal.p189authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth-api.zzz */
public final class zzz implements Parcelable.Creator<zzy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            if (SafeParcelReader.m16097a(a) != 1) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                credential = (Credential) SafeParcelReader.m16099a(parcel, a, Credential.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new zzy(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}
