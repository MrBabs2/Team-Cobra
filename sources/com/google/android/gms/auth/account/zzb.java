package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24657a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo24655a((Account) zzc.m25798a(parcel, Account.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo24656a(zzc.m25799a(parcel));
        }
        return true;
    }
}
