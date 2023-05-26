package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb implements Parcelable.Creator<AccountChangeEventsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m16103b(parcel);
        String str = null;
        Account account = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            int a2 = SafeParcelReader.m16097a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m16127w(parcel, a);
            } else if (a2 == 3) {
                str = SafeParcelReader.m16119o(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m16096C(parcel, a);
            } else {
                account = (Account) SafeParcelReader.m16099a(parcel, a, Account.CREATOR);
            }
        }
        SafeParcelReader.m16122r(parcel, b);
        return new AccountChangeEventsRequest(i, i2, str, account);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
