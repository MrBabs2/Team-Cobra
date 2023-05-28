package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzx implements Parcelable.Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 2) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.m16099a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
