package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzaoq extends zzfn implements zzaop {
    public zzaoq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo26242a(zzanh.m19596a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            mo26243a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
