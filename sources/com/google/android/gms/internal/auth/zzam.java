package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24657a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo29965a((ProxyResponse) zzc.m25798a(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo29966d(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
