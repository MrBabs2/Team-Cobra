package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zam implements Parcelable.Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                account = (Account) SafeParcelReader.m16099a(parcel, a, Account.CREATOR);
            } else if (a2 == 3) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m16099a(parcel, a, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
